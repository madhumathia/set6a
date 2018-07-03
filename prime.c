#include<stdio.h>
void main()
{
    int num,i,flag;
    scanf("%d",&num);
    flag=0;
    for(i=2;i<=num/2;i++)
    {
        if(num%i==0)
        {
        flag=1;
        break;
        }
    }
    if(flag==0)
    {
        printf("prime number");
    }
    else
    {
        printf("non prime number");
    }
    
}
