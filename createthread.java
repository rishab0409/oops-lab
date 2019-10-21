 class childthread extends Thread
{
public void run()
{int i;
for(i=0;i<5;i++)
System.out.println("child thread");
}
}


class Main{
public static void main(String args[])
{
childthread ct=new childthread();
ct.start();

int i;
for(i=0;i<5;i++)
System.out.println("main thread");

}

}