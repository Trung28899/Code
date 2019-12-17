package database;
import java.sql.*;
import javax.swing.*;
/**
 *
 * @author Trinh Quang Trung
 */

public class Database extends JFrame {
    //Declare variables
    JTextField jtfStmt;
    JTextArea jtaResult;
    JScrollPane jScrollPane1;
    JButton execute;
    JButton clear; 
    JButton quit; 
    JPanel panel;
    Connection conn;
    Statement stmt;
    ResultSet rs;
    /**
     * @param args the command line arguments
     */
    
    
    public Database() throws SQLException{
        // CREATE DIALOG BOX AND GET USERNAME AND PASSWORD
     JTextField field1 = new JTextField();
     JPasswordField field2 = new JPasswordField();
     
     Object[] fields = {
       "Username", field1,
       "Password", field2  
     };
     
     JOptionPane.showConfirmDialog(null,fields,"Password Dialog",JOptionPane.OK_CANCEL_OPTION);
          
     String Username = field1.getText();
     String Password = String.valueOf(field2.getPassword());
     
    // CREATE CONNECTION TO DATABASE 
        conn =
        DriverManager.getConnection("jdbc:oracle:thin:@apollo.humber.ca:1521:msit"
        ,Username, Password);
        
    // MAKING A PANEL AND RUN SQL COMMAND
        stmt = conn.createStatement();
        setTitle("Enter a Query");
    jtfStmt = new JTextField(43);
    jtaResult = new JTextArea();
    jtaResult.setColumns(43);
    jtaResult.setRows(12);
    jtaResult.setLineWrap(true);
    jScrollPane1 = new JScrollPane(jtaResult);
    execute = new JButton();
    execute.setText("Execute");
    clear = new JButton();
    clear.setText("Clear");
    quit = new JButton();
    quit.setText("Quit");
    panel = new JPanel();
    setSize(500,300);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setVisible(true);
    panel.add(jtfStmt);
    panel.add(jScrollPane1);
    panel.add(execute);
    panel.add(clear);
    panel.add(quit);
    add(panel);
    
    // EXCEPTION HANDLER, RUN SQL WHEN BUTTON IS CLICKED 
    execute.addMouseListener(new java.awt.event.MouseAdapter() {
        @Override
        public void mouseClicked(java.awt.event.MouseEvent ae) {
            try {
                executeMouseClicked(ae);
            } catch (SQLException sqle) {
                jtaResult.setText("Fail to runs Query");
            }
        }
    });
    
    clear.addMouseListener(new java.awt.event.MouseAdapter() {
        @Override
        public void mouseClicked(java.awt.event.MouseEvent ae) {
            try {
                clearMouseClicked(ae);
            } catch (SQLException sqle) {
                jtaResult.setText("Can't Clear");
                System.out.println("Can't Clear");
            }
        }
    });
    
    quit.addMouseListener(new java.awt.event.MouseAdapter() {
        @Override
        public void mouseClicked(java.awt.event.MouseEvent ae) {
            try {
                quitMouseClicked(ae);
            } catch (SQLException sqle) {
                jtaResult.setText("Can't quit");
                System.out.println("Can't quit");
            }
        }
    });

    }
    
    // METHOD TO RUN SQL COMMAND WHEN BUTTON IS CLICKED
        private void executeMouseClicked(java.awt.event.MouseEvent ae) throws SQLException{
        String getValue1 = jtfStmt.getText();
        jtfStmt.setText(getValue1);
        String getValue2="";
        ResultSetMetaData rsmd;
        String answer[]=getValue1.split(" ");
        int result=0; 
        int columnCount; 
        int recordsEffected;
        boolean isResultSet;

        if(getValue1.contentEquals("")){
            JOptionPane.showMessageDialog(null,"SQL field empty.");
            }else{
            
                switch(answer[0].toLowerCase()){
                    case "select": 
                        rs = stmt.executeQuery(getValue1);
                        rsmd=rs.getMetaData();
                        columnCount = rsmd.getColumnCount(); 
                        int counter;    
                        for(counter = 1; counter<=columnCount; counter++)
                              {
                                  getValue2=getValue2+rsmd.getColumnName(counter)+"  "; 
                              }
                        getValue2 += "\n"; 
                        while (rs.next()) { 
                              for(counter = 1; counter<=columnCount; counter++)
                              {
                                  getValue2=getValue2+rs.getString(rsmd.getColumnName(counter))+"  "; 
                              }
                              getValue2=getValue2+"\n"; 
                        }//close while 
                        jtaResult.setText(getValue2);
                        System.out.println("There are "+columnCount+" Columns");
                        
                        break;
                    case "insert":
                       recordsEffected = stmt.executeUpdate(getValue1);
                       rs = stmt.executeQuery(getValue1);
                       jtaResult.setText("Inserted: "+ recordsEffected+" Lines"); 
                        break; 
                    case "update":
                        recordsEffected = stmt.executeUpdate(getValue1);
                       rs = stmt.executeQuery(getValue1);
                       jtaResult.setText("Updated: "+ recordsEffected+" Records");
                       break; 
                    case "delete": 
                        recordsEffected = stmt.executeUpdate(getValue1);
                       rs = stmt.executeQuery(getValue1);
                       jtaResult.setText("Deleted: "+ recordsEffected+" Lines");
                    default: 
                         rs = stmt.executeQuery(getValue1);
                         jtaResult.setText("The Query runs successfully ");
                        break;         
                }
    
                }
        }
        
        // METHOD TO RUN SQL COMMAND WHEN BUTTON IS CLICKED
        private void clearMouseClicked(java.awt.event.MouseEvent ae) throws SQLException{
            jtfStmt.setText(null); 
            jtaResult.setText(null); 
        }
        
        // METHOD TO RUN SQL COMMAND WHEN BUTTON IS CLICKED
        private void quitMouseClicked(java.awt.event.MouseEvent ae) throws SQLException{
            System.exit(0);
        }
        
        // MAIN METHOD
    public static void main(String[] args){
        // INVOKE MAIN Database() METHOD, NOTE THAT YOU CALLING Database() IN A STATIC METHOD
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new Database();
                } catch (SQLException sql) {
                    System.out.println("SQLException");
            }
        }
    });
       
}
 
}
