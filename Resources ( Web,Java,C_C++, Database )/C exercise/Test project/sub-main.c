#include<stdio.h>
#include<time.h>
#include"header.h"

void find(int array[5],int *number,int multiply, int *add)
{
int n;
for(n=0; n<5; n++)
{
array[n]=number[n]*multiply - *add;
}
}
