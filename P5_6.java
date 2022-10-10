import java.util.*;
import java.io.*;
public class P5_6 {
public static void main(String[] args) throws IOException
{
    BufferedReader br = null;
    BufferedWriter bw = null;
    FileReader in = null;
    FileWriter out = null;
    String filelocation = "F:\\A5\\src\\Even.txt";
    File file = new File(filelocation);
try
{
    out= new FileWriter(filelocation);
    bw= new BufferedWriter(out);
    ArrayList<Integer> num = new
    ArrayList<Integer>(15);
    System.out.println("Enter 15 Numbers : ");
    for(int i=0;i<15;i++)
    {
        Scanner sc= new Scanner(System.in);
        num.add(sc.nextInt());
    }
    for(int i=0;i<15;i++)
    {
        if(((num.get(i))%2==0))
        {
            bw.write(num.get(i));
        }
    }
    bw.close();
    int a;
    in= new FileReader(filelocation);
    br= new BufferedReader(in);
    System.out.println("");
    System.out.println("Now Printing Even Numbers from Even.txt :");
    while ((a=br.read())!=-1)
    {
        System.out.println((a));
    }
}
catch(Exception e)
{
        System.out.println("Some exceptions are found ! Please enter a valid integer ! ");
}
finally
{
    if (br != null)
{
    br.close();
}
}
    System.out.println("By 21CE008");
}
}