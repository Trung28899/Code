-- LAB8
-- CENG 254 0NA
-- TRINH QUANG TRUNG - N01237291

-- Question 1: 
-- a, 
DROP TABLE BooksList; 
Create table BooksList (
				ISBN INT,
				Title VARCHAR(20),
				Author VARCHAR(60),
				Acquisition_Cost INT, 
        Publication_Date DATE,
        CONSTRAINT ISBN_PK PRIMARY KEY (ISBN));
-- Havent figure out the default year of publication !!
 DESC BooksList; 
 
 --b, 
 DROP TABLE Borrowers; 
 Create table Borrowers (
				FullName VARCHAR(60),
        Library_ID INT,
        Number_Books_Borrowed INT,
        Date_Borrowed Date, 
        constraint Borrower primary key (Library_ID)
  );
-- Borrower cant borrow more than 3 books ??
-- Are these all needed columns
desc Borrowers; 

--c, 
-- Foreign key, references, constraint
drop table Loans; 
create table Loans
(
Borrow_Date Date,
max_day int NOT NULL,
Library_ID int NOT NULL,
ISBN int NOT NULL,
returned_date Date ,
CONSTRAINT fk_card_id 
        FOREIGN KEY(Library_ID) 
            REFERENCES Borrowers(Library_ID),
CONSTRAINT fk_ISBN
        FOREIGN KEY(ISBN)
            REFERENCES BooksList(ISBN)
);
desc loans;

--d, 
-- Must modify table loans to modify ISBN_pk in BooksList
alter table Loans
drop CONSTRAINT fk_ISBN;

alter table BooksList
drop CONSTRAINT ISBN_PK;

alter table BooksList
add copyNo INT;

alter table BooksList     
modify copyNo default 1; 

alter table BooksList
add CONSTRAINT ISBN_pk PRIMARY KEY(ISBN,copyNo);

--e, 
--e i, 
alter table BooksList
add check (Acquisition_Cost >= 0);

alter table Loans
add check (max_day > 0);

--e ii, 
alter table BORROWERS
add lastname varchar (30);
    
alter table BORROWERS 
add check ( lastname != 'Flintstone');

--e iii, 
alter table BooksList
add check ( to_char(Publication_Date,'YYYY-MM-DD') >= '1900-1-1' 
and to_char(Publication_Date,'YYYY-MM-DD') <= '2100-12-31');

--e iv, 
alter table Loans
add check ( to_char(Borrow_Date,'YYYY-MM-DD') <= 
to_char(returned_date,'YYYY-MM-DD') );

-- Question 2: 
--a, 
-- TABLE BOOKSLIST: 
desc BooksList; 
INSERT INTO BooksList (ISBN, TITLE, AUTHOR, ACQUISITION_COST, PUBLICATION_DATE, COPYNO)  
VALUES 
  (101, 'DORAEMON', 'FUJIKI',20, to_date('1999-08-28','YYYY-MM-DD'), 1); 
  
 -- This code dont work because exited primary keys 
INSERT INTO BooksList (ISBN, TITLE, AUTHOR, ACQUISITION_COST, PUBLICATION_DATE, COPYNO)  
VALUES 
   (101, 'The Alchelmist', 'Coehlo',19, to_date('2000-08-28','YYYY-MM-DD'), 1);
 
-- This script works 
INSERT INTO BooksList (ISBN, TITLE, AUTHOR, ACQUISITION_COST, PUBLICATION_DATE, COPYNO)  
VALUES 
   (102, 'The Alchelmist', 'Coehlo',19, to_date('2000-08-28','YYYY-MM-DD'), 2);

-- TABLE BORROWERS:
desc borrowers; 
INSERT INTO Borrowers (FULLNAME, LIBRARY_ID, NUMBER_BOOKS_BORROWED, DATE_BORROWED, LASTNAME)  
VALUES 
  ('Trung Trinh', 101, 2, to_date('1999-08-28','YYYY-MM-DD'), 'Trinh'); 
  
-- The code below dont work cause existed primary key
INSERT INTO Borrowers (FULLNAME, LIBRARY_ID, NUMBER_BOOKS_BORROWED, DATE_BORROWED, LASTNAME)  
VALUES 
  ('Tuan Minh', 101, 2, to_date('1999-08-28','YYYY-MM-DD'), 'Trinh');

-- This script works 
INSERT INTO Borrowers (FULLNAME, LIBRARY_ID, NUMBER_BOOKS_BORROWED, DATE_BORROWED, LASTNAME)  
VALUES 
  ('Tuan Minh', 103, 2, to_date('1999-08-28','YYYY-MM-DD'), 'Trinh');
  
-- Question 2b, 
desc Loans;
desc bookslist; 
-- Test 1e i,
-- Code dont work cause duration of the loan is 0
INSERT INTO Loans (BORROW_DATE, MAX_DAY, LIBRARY_ID, ISBN, RETURNED_DATE)  
VALUES 
  (to_date('1999-08-28','YYYY-MM-DD'), 0, 101, 1001, to_date('2000-08-28','YYYY-MM-DD'));

-- This scipt dont work cause price is negative
UPDATE bookslist
SET ACQUISITION_COST = -22
WHERE copyno = 2;

-- This script work
INSERT INTO Loans (BORROW_DATE, MAX_DAY, LIBRARY_ID, ISBN, RETURNED_DATE)  
VALUES 
  (to_date('1999-08-28','YYYY-MM-DD'), 1, 101, 1001, to_date('2000-08-28','YYYY-MM-DD'));


-- Test 1e ii, 
desc Borrowers;
-- Code dont work cause last name is flintstone 
INSERT INTO Borrowers (FULLNAME,LIBRARY_ID,NUMBER_BOOKS_BORROWED,DATE_BORROWED,LASTNAME)  
VALUES 
  ('Trung Flintstone', 108, 2, to_date('1999-08-28','YYYY-MM-DD'), 'Flintstone');
-- This script works
INSERT INTO Borrowers (FULLNAME,LIBRARY_ID,NUMBER_BOOKS_BORROWED,DATE_BORROWED,LASTNAME)  
VALUES 
  ('Trung Flintstone', 108, 2, to_date('1999-08-28','YYYY-MM-DD'), 'Trinh');

-- Test 1e iii,
desc BooksList; 
-- This scirpt dont work cause the date problem
INSERT INTO BooksList (ISBN,TITLE,AUTHOR,ACQUISITION_COST,PUBLICATION_DATE,COPYNO)  
VALUES 
  (1003, 'THE PLAYER', 'MY BROTHER', 88, to_date('1889-08-28','YYYY-MM-DD'), 3);
-- This script works
INSERT INTO BooksList (ISBN,TITLE,AUTHOR,ACQUISITION_COST,PUBLICATION_DATE,COPYNO)  
VALUES 
  (1007, 'THE PLAYER 2', 'MY COUSIN', 88, to_date('1999-08-28','YYYY-MM-DD'), 4);

-- Test 1e iv, 
desc Loans;
-- this scirpt dont work cause date return in before date borrower
INSERT INTO Loans (BORROW_DATE, MAX_DAY, LIBRARY_ID, ISBN, RETURNED_DATE)  
VALUES 
  (to_date('1999-08-29','YYYY-MM-DD'), 11, 121, 1031, to_date('1999-12-28','YYYY-MM-DD'));

-- Question 3: 
-- a, 
insert all 
into BooksList (ISBN, TITLE, AUTHOR, ACQUISITION_COST, PUBLICATION_DATE, COPYNO)  
VALUES
   (112, 'Art of Going To College', 'Yuval',12, to_date('2011-09-12','YYYY-MM-DD'),27)
into BooksList (ISBN, TITLE, AUTHOR, ACQUISITION_COST, PUBLICATION_DATE, COPYNO)  
VALUES 
    (889, 'Art of Finding a Date', 'Yuval',11, to_date('2011-03-11','YYYY-MM-DD'),100)
INTO BooksList (ISBN, TITLE, AUTHOR, ACQUISITION_COST, PUBLICATION_DATE, COPYNO)  
VALUES 
   (1000, 'The Homo Neanderthals', 'Yuval',19, to_date('2010-09-12','YYYY-MM-DD'), 789)
INTO BooksList (ISBN, TITLE, AUTHOR, ACQUISITION_COST, PUBLICATION_DATE, COPYNO)  
VALUES 
   (1021, 'The Table', 'Yuval',19, to_date('2010-09-12','YYYY-MM-DD'), 89)
   INTO BooksList (ISBN, TITLE, AUTHOR, ACQUISITION_COST, PUBLICATION_DATE, COPYNO)  
VALUES 
   (1000, 'Ronaldo', 'Yuval',19, to_date('2010-09-12','YYYY-MM-DD'), 71111)
   INTO BooksList (ISBN, TITLE, AUTHOR, ACQUISITION_COST, PUBLICATION_DATE, COPYNO)  
VALUES 
   (96, 'How to wake up for dummies', 'Yuval',19, to_date('2010-09-12','YYYY-MM-DD'), 78)
   INTO BooksList (ISBN, TITLE, AUTHOR, ACQUISITION_COST, PUBLICATION_DATE, COPYNO)  
VALUES 
   (99, 'The Homo Sapiens', 'Yuval',19, to_date('2010-09-12','YYYY-MM-DD'), 1189)
   INTO BooksList (ISBN, TITLE, AUTHOR, ACQUISITION_COST, PUBLICATION_DATE, COPYNO)  
VALUES 
   (88, 'The Guide To Bed', 'Yuval',19, to_date('2010-09-12','YYYY-MM-DD'), 91)
   INTO BooksList (ISBN, TITLE, AUTHOR, ACQUISITION_COST, PUBLICATION_DATE, COPYNO)  
VALUES 
   (69, 'The Bro', 'Yuval',19, to_date('2010-09-12','YYYY-MM-DD'), 95)
   INTO BooksList (ISBN, TITLE, AUTHOR, ACQUISITION_COST, PUBLICATION_DATE, COPYNO)  
VALUES 
   (1234, 'Kelvin Hart', 'Yuval',19, to_date('2010-09-12','YYYY-MM-DD'), 93)
select * from dual
; 

-- Question 3b, 
INSERT INTO borrowers (FULLNAME, LIBRARY_ID, LASTNAME)
SELECT FIRST_NAME, STUDENT_ID, LAST_NAME
FROM medri.student
WHERE STUDENT_ID BETWEEN 110 AND 220;
-- Some of the student_id were skipped from 110 to 220,
-- Therefore the range must be 110 - 220 to insert precisely 100 rows





   
   



