import java.io.*;
public class P5_2_1 {
public static void main(String[] args) throws IOException {
FileReader source = null;
try {
    source = new FileReader("E:\\java_p\\P5\\P5_2.txt");
    int temp;   
    while ((temp = source.read()) != -1)
        System.out.print((char) temp);
}
finally {
    if (source != null)
    source.close();
}
        System.out.println("By 21CE008");
}
}