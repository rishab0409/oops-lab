import java.util.*;


 class AmountException extends Exception
{
 AmountException()
{
super("The Withdrawl Amount Is More Than ");
}



}

class Main
{
public static void main(String args[])
{
int with,bal=1000;
Scanner sc=new Scanner(System.in);
System.out.println("enter the withdrawl amount");
with=sc.nextInt();


if(with>bal)
{
try
{
throw new AmountException();

}
catch(AmountException ae)
{
System.out.println("the withrawl amount is more than the balance ");
}
}
}


}