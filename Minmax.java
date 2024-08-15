// import java.util.*;
// public class test
// {
//   public static void main(String[] args)
//   {
       
//        Scanner sc=new Scanner(System.in);
//        int size=sc.nextInt();
//        int arr[]=new int[size];
//        System.out.println("Enter elements in array");
//        int min=Integer.MAX_VALUE;
//        int max=Integer.MIN_VALUE;
//        for(int i=0;i<size;i++)
//        {
//          arr[i]=sc.nextInt();
//          if(arr[i]<min)
//            {
//            min=arr[i];
//            }
//          if(arr[i]>max)
//          {
//            max=arr[i];
//          }
//        }
//        System.out.println("Maximum element is "+max);
//        System.out.println("Minimum element is "+min);
       
       
//   }
// }
import java.util.*;
class Minmax{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int arr[]=new int[n];
    for(int i=0;i<n;i++){
      arr[i]=sc.nextInt();
    }
    int min=Integer.MAX_VALUE;
    int max=Integer.MIN_VALUE;
    for(int i=0;i<n;i++){
    if(arr[i]<min){
      min=arr[i];
    }
    if(arr[i]>max){
      max=arr[i];
    }
    }

    System.out.println(min);
    System.out.println(max);
  }
}


