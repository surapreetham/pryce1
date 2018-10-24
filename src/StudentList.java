import java.util.*;
class StudentList{
      public static void main(String[] args){
        LinkedList<Student> ll = new LinkedList<Student>();
        //Student s = new Student(); 
        ll.add(new Student("abcd",121,8500957332l));
        ll.add(new Student("nvmfh",122,9985770567l));
        ll.add(new Student("akjak",123,2254689777l));
        ll.add(new Student("nvnv",124,9642838477l));
        
         System.out.println("List : "+ll.toString()); 
     
        ListIterator ltr = ll.listIterator();
        while(ltr.hasNext()){
            Student s1 = (Student)ltr.next();
            System.out.println(s1.name+" : "+s1.rollno+" : "+s1.mobile);
              
         }
          while(ltr.hasPrevious()){
            Student s1 = (Student)ltr.previous();
            System.out.println(s1.name+" : "+s1.rollno+" : "+s1.mobile);
              
         }
        
         
      }
}