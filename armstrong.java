import java.lang.*;
import java.util.*;

class armstrong{

public static void main(String args[]){
int input,count=0,num3=0,sum=0;
Scanner sc =new Scanner(System.in);
input =sc.nextInt();
int num1=input;
while (num1>0){
num1=num1/10;
count=count+1;

}

int num2=input;

while(num2>0){

num3=num2%10;
sum=sum+(int)Math.pow(num3,count);
num2 =num2/10;


}

if(sum==input)
System.out.println(input+" is armsrtong number");

else
System.out.println(input+" not an armstromg number");

}}