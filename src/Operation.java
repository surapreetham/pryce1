class Operation{  
 int data=50;  
  
 int change(int data){  
 data=data+100;//changes will be in the local variable only
   return data;  
 }  
     
 public static void main(String args[]){  
   Operation op=new Operation();  
  
   System.out.println("before change "+op.data);  
    int a = op.change(500);
   System.out.println("after change "+a);  
  
 }  
}  