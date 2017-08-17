import java.util.*;
public class Player12{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the size of the array");
    int size = sc.nextInt();
    int[] a = new int[size];
    System.out.println("Enter the Array");
    for(int i=0;i<size;i++){
      a[i] = sc.nextInt();
    }
    System.out.println("Enter the key");
    int key = sc.nextInt();
    
    ArrayList<Integer>l1=new ArrayList<Integer>();
    for(int i=key+1;i<size;i++){
     
      l1.add(a[i]);
      
    }
    for(int i=0;i<=key ;i++){
     
      l1.add(a[i]);
     }
  
       
         System.out.println(l1);
  }
}      
