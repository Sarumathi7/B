import java.io.*;
class Array
{
ststic void FirstRept(int arr[])
{
int min=-1;
HashSet<Integer>set=new HashSet<>();
for(int i=arr.length-1;i>=0;i--)
{
if(set.contains(arr[i]))
min=i;
else
set.add(a[i]);
}
if(min!=-1)
System.out.println("The first repeating element is:"+arr[min]);
else
System.out.println("there are no repeating elements");
}
public static void main(String args[])throws java.lang.Exception
{
int arr[]={10,5,3,6,5,7,5,2};
FirstRept(arr);
}
}
