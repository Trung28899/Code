#include<stdio.h>
#include<stdlib.h>
#include<string.h>
#include<time.h>

void input(char words[1000])
{
//Input the string
printf("Input what you want to say: ");
gets(words);

int n;
char a;

//get the length of the string
for(n=0; n<1000;n++)
{
if(words[n]=='\0')
{
printf("\n The length of the string is: %d", n);
printf("\n");
break;
}
}
}

void getindex(char alpha[27], char word[1000], int index[1000])
{
int j, n, m;
for(n=0; n<1000; n++)
{
for(m=0; m<27; m++)
{
if(word[n]==alpha[m])
{
index[n]=m;
}
if(word[n]==' ')
{
index[n]=-1;
}
if(word[n]=='\0')
{
index[n]=-2;
}
}
}

printf("\n The indexes are: ");
for(j=0; j<1000; j++)
{
printf("| %d\t", index[j]);

if(index[j]==-2)
{
break;
}
}
}


void translate(char reverses[27], int index[1000])
{
char trans[1000];
int a;

for(a=0; a<1000; a++)
{
if(index[a]>=0)
{
trans[a]=reverses[index[a]];
}
else
{
if(index[a]==-1)
{
trans[a]=' ';
}
if(index[a]==-2)
{
break;
}
}
}
int b;
printf("\n the translated string is: ");
for(b=0; b<1000; b++)
{
printf("%c", trans[b]);
if(trans[b]=='\0')
{
break;
}
}
}

int main()
{
char words[1000];
char alphabet[27]="abcdefghijklmnopqrstuvwxyz";
char reverse[27]="zyxwvutsrqponmlkjihgfedcba";
int indexes[1000];
input(words);
getindex(alphabet,words,indexes);
translate(reverse, indexes);
return 0;
}
