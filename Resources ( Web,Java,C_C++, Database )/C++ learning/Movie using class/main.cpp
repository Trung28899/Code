#include <iostream>
#include <cstdio>
#include <string>

using namespace std;

class movie
{
    public:
        char name[50];
        int year;
        char rated;

       void ask(char [50] , int &, char &, int);
};

void movie::ask(char na[50], int &ye, char &ra,int count)
{
        cout<<"What's your fav movie ?"<<endl;
        cin.get(na, 50);
        cout<<"what's year was it released (1900-2020) ?"<<endl;
        cin>>ye;

        cout<<"What was the rated ?"<<endl;
        cout<<"G(general audience), PG(parental guidance), M(mature), R(restricted)"<<endl;
        cin>>ra;
}
int main()
{
    movie fav[3];
    int i;

    for(i=0; i<3; i++)
      {
    cout<<"\n Movie "<<(i+1)<<":"<<endl;
    fav[i].ask(fav[i].name, fav[i].year, fav[i].rated, i);
      }

    return 0;
}
