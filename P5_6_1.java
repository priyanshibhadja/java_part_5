public class P5_6_1{
public static void main(String[] args) {
//first method
System.out.println("Method 1 : ");
int a = 8;
Integer obj1 = Integer.valueOf(a);
Integer obj2 = a;
System.out.println("Value of int : " + a);
System.out.println("Value of Integer instance representing a : " + obj1);
System.out.println("Value of Wrapper class object : "+ obj2);

System.out.println("\nMethod 2 : ");
Integer obj3 = Integer.valueOf(10);
Integer obj4 = obj3;
Integer obj5 = obj3;
System.out.println("Value of Integer instance representing a : " + obj3);
System.out.println("Value of object 4 : " + obj4);
System.out.println("Value of object 5 : " + obj5);
System.out.println("By 21CE008");
}
}
