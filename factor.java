import java.lang.*;
import java.util.*;
class factor{

public static void main(String args[]){

int x=Integer.parseInt(args[0]);
int y=Integer.parseInt(args[1]);

if(y%x==0){

System.out.println(args[0]+" is the factor of "+args[1]);

}
else
System.out.println(x+" is not a factor "+y);

}



}
