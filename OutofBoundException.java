import java.util.*;



class Main
{
public static void main(String args[])

{

int a[] =new int[5];
int i;

try{
for(i=0;i<=5;i++){
a[i]=i;
System.out.println(""+a[i]);}
}
catch(Exception ae)
{
//System.out.println("index is out of size of array");
ae.printStackTrace();
System.out.println(ae.toString());
System.out.println(ae.getMessage());


}


}





}