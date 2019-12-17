#include<stdio.h>
#include<time.h>
#include"header.h"

int main()
{
int number[5]={1, 2, 3, 4 ,5};
int add=1;
int result[5];
find(result,number,2,&add );

int n;
for(n=0;n<5;n++)
{
printf("result[%d]= %d",n,result[n]);
}
}

