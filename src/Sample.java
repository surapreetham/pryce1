import java.io.*;
 class Sample implements Serializable {
 String username = "preetham";
 transient int password =5268;
public static void main(String[]arr){
Sample s=new Sample();
System.out.println(s.username);
System.out.println(s.password);
    }
}