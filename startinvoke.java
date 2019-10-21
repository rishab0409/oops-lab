

class child_thread extends Thread
{
public void run(){
    int i;
    for(i=0;i<5;i++)
    System.out.println("child thread");
}

}

class Main{
public static void main(String[] args) {
    int i;
    child_thread ct =new child_thread();
    ct.run();
    for(i=0;i<5;i++)
    System.out.println("main thread");

}


}