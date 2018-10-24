class Student{
     String name;
     int num;
}
class Teacher extends Student{
     String sub;
     int no;
     Teacher(String sub, int no){
       this.sub =  sub;
       this.no = no;
     }
}  

class App{   
     public static void main(String[] arr){
      Teacher t  = new Teacher("preeth",60);
      System.out.println(s.sub+" : "+s.no);
     }
}