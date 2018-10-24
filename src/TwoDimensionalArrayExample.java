import java.util.Scanner;
public class TwoDimensionalArrayExample{
      public static void main(String[] args){
           int[][] array = new int[3][3];  
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Array1 elements : ");
          for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                array[i][j] = sc.nextInt();
            }
          }
        System.out.println("Two Dimensional Array1 Elements are : ");
         for(int i=0;i<3;i++){
            for(int j=0;j<3;j++)
             System.out.print(array[i][j]+"  ");
                System.out.println("   ");
          }  
     }
}