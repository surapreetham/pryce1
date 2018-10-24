 class StringExample{
    String name;
   StringExample(){

     }
    public static void main(String...arr){
      StringExample s = new StringExample();
       StringExample s2 = new StringExample();
       s.name = "durga";
        s2.name = "software";
             System.out.println(s.name);
             System.out.println(s2.name);
   }
    class child extends StringExample{

    }
}