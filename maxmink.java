import java.util.*;
public class maxmink {

    public static int minDif(int arr[],int n,int k){
        int result=Integer.MAX_VALUE;

        //Arrays.sort(arr);

        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }

        for(int i=0;i<=n-k;i++){
            result=Math.min(result,arr[i+k-1]-arr[i]);
        }
        return result;
    }

        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            System.out.println("size:");
            int size=sc.nextInt();
            //System.out.println()
            int arr[]=new int[size];

            System.out.println("entering:");


            for(int i=0;i<size;i++){
                arr[i]=sc.nextInt();
            }
            System.out.println("k value");
            int k=sc.nextInt();

            System.out.println("min diff of max and min of k"+k+"elements:"+minDif(arr, size, k));
        }
    }
    

