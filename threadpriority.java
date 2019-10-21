

class child_thread extends Thread
{
public void run(){
    int i;
    for(i=0;i<5;i++)
    System.out.println("child thread");
}

}

class child_thread2 extends Thread
{
    public void run(){
int j;
for(j=0;j<5;j++)
System.out.println("child thread2");
    }

}

class Main{
public static void main(String[] args) {
    Thread.currentThread().setPriority(7);
    int i;
    child_thread ct =new child_thread();
ct.setName("child1");
System.out.println(ct.getName());


    ct.start();
    System.out.println(Thread.currentThread().getPriority());
    child_thread2 ct2 =new child_thread2();
    ct2.setName("child2");
    System.out.println(ct2.getName());
    ct2.start();
    System.out.println(Thread.currentThread().getPriority());
    for(i=0;i<5;i++)
    System.out.println("main thread");
 System.out.println(Thread.currentThread().getPriority());
    
       

    
}


}