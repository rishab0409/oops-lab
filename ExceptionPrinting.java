import java .util.*;


 class Main
{
public static void main(String args[])
{
int a,b,c;
int n[]=new int[5];
Scanner sc= new Scanner(System.in);

System.out .println("enter thye no.s");
a=sc.nextInt();
b=sc.nextInt();

int i;
try{
c=a/b;
System.out.println(c);
for (i=0;i<=5;i++)
{
n[i]=i;
System.out.println(n[i]);
}

}
catch (Exception ae)
{
ae.printStackTrace();
ae.toString();
ae.getMessage();
System.out.println("invalid input");
System.out.println("index is out of bound of array");
}

}


}