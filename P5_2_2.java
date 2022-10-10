import java.io.*;
class A5_2_2 {
public static void main(String args[]) throws IOException
{
        FileReader in = null;
        FileWriter out = null;
try {
        in = new FileReader("E:\\java_p\\P5\\P5_2.txt");
        out = new FileWriter("E:\\java_p\\P5\\P5_1.txt");
        int c;
        while ((c = in.read()) != -1) {
        out.write(c);//writing in file A5Q1 from A5Q2
        }
}
    finally 
    {
        if (in != null) {
        in.close();
       }
    if (out != null)
    {
        out.close();
    }
    }
        System.out.println("By 21CE008");
}
}
