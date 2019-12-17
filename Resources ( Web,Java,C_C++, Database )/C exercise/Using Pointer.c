#include<stdio.h>
#include<stdlib.h>
#include<time.h>

void input(int *a, int size)
{
int i;

for(i=0; i<size; i++)
{
printf("\n Input number %d ", i);
scanf("%d", &a[i]);
}
}

void print(int *b, int size)
{
int m;
printf("\n");

for(m=0; m<size; m++)
{
printf("\n Number %d:  %d", m, b[m]);
}
}

void search(int *c,int  size)
{
int max;
max=c[0];
int d;

for(d=0; d< size; d++)
{
if(max<c[d])
{
max=c[d];
}
}
printf("\n \n maximum number is: %d \n ", max);
}

int main(void)
{
int sizee;
printf("\n FIND THE LARGEST NUMBER USING POINTER AND MEMORY ALLOCATION: ");
printf("\n ------------------------------------------------------------------------------- \n");
printf("\n Please input the amount of numbers: ");
scanf("%d", &sizee);
int *arr;

arr=malloc(sizee*sizeof(int));

input(arr, sizee);
print(arr, sizee);
search(arr, sizee);

return 0;
}