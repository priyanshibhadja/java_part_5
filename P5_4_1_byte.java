import java.io.*;
class P5_4_1_byte  {
public static void main(String[] args) throws IOException{
FileInputStream sourceStream = null;
FileOutputStream targetStream = null;
try {
sourceStream = new
FileInputStream("E:\\java_p\\P5\\P5_2.txt");
targetStream = new FileOutputStream("E:\\java_p\\P5\\P5_1.txt");

int temp;
while ((temp = sourceStream.read()) != -1)
targetStream.write((byte)temp);
}finally {
if (sourceStream != null){
sourceStream.close();
}
if (targetStream != null){
targetStream.close();
}
}
System.out.println("By21CE008");
}
}