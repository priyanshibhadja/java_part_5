import java.io.*;
public class P5_1 {
public static void main(String[] args) {
// pass the filename or directory name to File
// object
File f = new File("E:\\java_p\\P5\\P5_1.txt");
// apply File class methods on File object
System.out.println("File name :" + f.getName());
System.out.println("Path : " + f.getPath());
System.out.println("Absolute path : "+ f.getAbsolutePath());
System.out.println("Parent : " + f.getParent());
System.out.println("Exists : " + f.exists());
if (f.exists()) {
System.out.println("Is writable : "+ f.canWrite());

System.out.println("Is readable : " +f.canRead());
System.out.println("Is a directory : "+ f.isDirectory());
System.out.println("File Size in bytes "+ f.length());
}
System.out.println("By 21CE008");
}
}