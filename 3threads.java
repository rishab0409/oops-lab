

class child_thread1 extends Thread
{
public void run(){
    int i;
    for(i=0;i<5;i++)
    System.out.println("child thread 1");
}

}

class child_thread2 implements Runnable
{
public void run()
{
int j;
for(j=0;j<5;j++)
System.out.println("child thread 2");

 

}


}

class Main{
public static void main(String[] args) {
    int k;
    // child_thread1 ct1 =new child_thread1();
// ct1.start();
child_thread1 ct1 =new child_thread1();
    ct1.start();
child_thread2 ct2 =new child_thread2();
    Thread t =new Thread(ct2);
     t.start();
    for(k=0;k<5;k++)
    System.out.println("main thread");
       


}


}