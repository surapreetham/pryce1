import java.io.*;

class ReadDeflater implements Serializable{
    String username = "preetham";
      transient String password ="kumar";
    public void details(){
            System.out.println(username+" "+password);
   }
        FileOutputStream fos = new FileOutputStream("myfile.txt");    
         ObjectOutputStream oos = new ObjectOutputStream(fos);
         ReadDeflater rd = new ReadDeflater();     
         oos.writeObject(rd);

        public static void main(String[] args) throws IOException {
                           
            FileInputStream fis = new FileInputStream("myfile.txt");
            ObjectInputStream ois = new ObjectInputStream(fis);
            Object obj =  ois.readObject();
             ReadDeflater rd = (ReadDeflater) obj;
             rd.details();   
     }
}