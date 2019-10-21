
class Main
{
public static void main(String args[])
{
try{
objReader = new BufferedReader(new FileReader("C:\myfile\DukesDiary.txt"));

}

catch(Exception e)
{
System.out.println("The File does not Exists");
}
}

}