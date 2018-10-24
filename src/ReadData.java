import java.io.*;
class ReadData{
      public static void main(String[] args) throws IOException{
          FileInputStream fis = new FileInputStream("copyfile.txt");
          BufferedInputStream bis = new BufferedInputStream(fis);
          
         int ch;
         while((ch=bis.read()) != -1){
            System.out.print((char)ch);
         }
      }
}