#include <iostream>
#include <iomanip>
using namespace std;

void price(float &pr)
{
cout<<"The price of the item is: $ ";
cin>>pr;
}

void pay(float &pa)
{
cout<<"the payment of the customer is: $";
cin>>pa;
}

void change(float &pri,float &paa)
{
float amount, change;
amount=paa-pri;
cout<<"\nThe change amount is: &"<<amount<<endl;

change=amount-static_cast<int>(amount);

int i,quarter=0, dime=0, nickle=0, pennies=0;

for(i=0; i<3; i++)
{
if(change>=0.25)
{
change-=0.25;
quarter++;
}
}

for(i=0; i<2; i++)
{
    if(change>=0.10)
    {
    change-=0.10;
    dime++;
    }
    }

    for(i=0; i<1;i++)
    {
        if(change>=0.05)
        {
        change-=0.05;
        nickle++;
        }
    }

    for(i=0; i<5; i++)
    {
    if(change>0)
    {
    change-=0.01;
    pennies++;
    }
    }
    cout<<"\nGive back $"<<static_cast<int>(amount)<<"; "<<quarter<<"quarters (25cents); "<<dime<<"dime (10 cents); "<<nickle<<"nickle (5 cents); "<<pennies<<"pennies (1 cents)"<<endl;
    }
int main()
{
    float cost,paay;
for(;;)
{
    price(cost);
    pay(paay);
    cout<<"\n"<<endl;
    change(cost, paay);
}
    return 0;
}
