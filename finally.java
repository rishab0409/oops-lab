import java .util.*;


 class Main
{
public static void main(String args[])
{
int a,b,c;
Scanner sc= new Scanner(System.in);

System.out .println("enter thye no.s");
a=sc.nextInt();
b=sc.nextInt();


try{
c=a/b;

}
catch (ArithmeticException ae)
{
System.out.println("invalid input");
}
finally
{
System.out.println("Enter the no.s correctly");
}
}


}