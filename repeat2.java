import java.util.*;
class repeat2
{
public static void main(String arg[])
{
int k=0;
int num[] = new int[100];
int a[]={10,5,3,4,3,5,6};
for(int i=0;i<(a.length-1);i++)
{
for(int j=i+1;j<a.length;j++)
{
if(a[i]==a[j])
{
num[k] = a[i];
k++;
}
}
}
System.out.println(num[0]);
}
}