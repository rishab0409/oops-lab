

class demo{

void demoshow(){

System.out.println("object 1");


}

class demo2{

void demoshow(){

 System.out.println("object 2");


}


}


}

class Main{


public static void main(String args[]){

demo d1=new demo();
demo2 d2 =new d1.demo2();


d1.demoshow();
d2.demoshow();

d1=d2;
d1.demoshow();

d2=(d1.demo2)d1;
d2.demoshow();



}

}

