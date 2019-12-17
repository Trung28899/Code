#include <iostream>

using namespace std;

int main()
{
    string food[]={"Hot Dog", "Hamburger", "French fried", "Salad", "Exit"};
    float price[]={4.5, 6.0, 6.0, 3.5};
    int i; // counter for for loop
    int n[100], m[100],a; //n array store the choices, m array stores the quantity, a is a variable for stopping the loop
    float total=0; //keep track the total cost
    int in; //another counter for for loop

    cout<<"------------------LUNCH MENU---------------------"<<endl;
    cout<<"\n"<<endl;
    cout<<"Food___________________Price\n"<<endl;
//print the menu
    for(i=0; i<4;i++)
    {
    cout<<i+1<<"."<<food[i]<<".............."<<price[i]<<"$"<<endl;
    }
    cout<<"5."<<food[4]<<"\n";
//ask user for ordering
    for(i=0;i<1000;i++)
    {
    cout<<"\nPlease make your food selection: (1-4): ";
    cin>>n[i];

    cout<<food[n[i]-1]<<endl;
    cout<<"Quantity: ";
    cin>>m[i];
    total += m[i]*price[n[i]-1];

    cout<<"\nAnything else ? \n(1).Yes\n(0).NO "<<endl;
    cin>>a;

    if(a==0)
    {break;}
    }

    //print out the reservation
    cout<<"\n You have odered: \n"<<endl;

    for(in=0; in<i+1; in++)
    {
    cout<<m[in]<<" ";

    if(n[in]==1)
        {cout<<food[0]<<"......"<<price[0]<<"$/each";}
    if(n[in]==2)
        {cout<<food[1]<<"......"<<price[1]<<"$/each";}
    if(n[in]==3)
        {cout<<food[2]<<"......"<<price[2]<<"$/each";}
    if(n[in]==4)
        {cout<<food[3]<<"......"<<price[3]<<"$/each";}

    cout<<"\n"<<endl;
    }

    cout<<"Total: "<<total<<"$"<<endl;
    return 0;
}
