#include<stdio.h>
#include<stdlib.h>
#include<string.h>
#include<time.h>

void input(char words[1000])
{
//Input the string
printf("Input a string ");
gets(words);
}

int getSize(char words[1000])
{
int i =0;
for(i=0; i<1000; i++)
    {
    if(words[i]=='\0')
    {break;}
    }
return i;
}

// increment the word in alphabet
void roll(char alphabet[27], char word[1000])
{
for(int n=0; n<1000; n++)
    {
    for(int m=0; m<27; m++)
    {
    if(word[n]==alpha[m])
    {
    word[n] = alpha[n+1];
    }
    if(word[n]=='z')
    {
    word[n]='a';
    }

}
}
}


// getting the position of the character in the alphabet, taking reference from the word array
/*void getindex(char alpha[27], char word[1000], int index[1000])
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

// print the position of the words in the alphabet to the
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
}*/

int main()
{
char words[1000];
char alphabet[27]="abcdefghijklmnopqrstuvwxyz";
//char reverse[27]="zyxwvutsrqponmlkjihgfedcba";

input(words);
int i = getSize(words);
roll(alphabet, words);

printf("the size is: %d", i);
printf("the rolled string is: ")

for(int n=0; n<i; n++)
    {
    printf("%c", words[i]);
    }


return 0;
}

