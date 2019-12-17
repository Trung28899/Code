#include<stdio.h>
#include<stdlib.h>
#include<string.h>
#include<time.h>

char input(char words[1000], char alphabet[27])
{
//Input the string
printf("Input a string ");
gets(words);

int i =0;
for(i=0; i<1000; i++)
    {
    if(words[i]=='\0')
    {break;}
    }

    for(int n=0; n<1000; n++)
{
    for(int m=0; m<27; m++)
    {
    if(words[n]==alphabet[m])
    {words[n] = alphabet[n+1];}

    if(words[n]=='z')
    {words[n]='a';}

    printf("the size is: %d", i);
    printf("the rolled string is: ");

for(int n=0; n<i; n++)
    {
    printf("%c", words[i]);
    }
}
}
}

int main()
{
char alphabet[27]="abcdefghijklmnopqrstuvwxyz";
char word[1000];

input(word, alphabet);

return 0;
}

