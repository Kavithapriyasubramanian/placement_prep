import java.util.*;
public class Counttriple {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size");
        int size = sc.nextInt();

        int[] arr = new int[size];

        System.out.println("Enter the array");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        int sum=sc.nextInt();
        System.out.println(triplets(arr,size,sum));
    }

        public static int triplets(int arr[],int size,int sum){
            
                      int ans=0;

            for(int i=0;i<size-2;i++){
                for(int j=i+1;j<size-1;j++){
                    for(int k=j+1;k<size;k++){
                        if(arr[i]+arr[j]+arr[k]<sum){
                            ans++;
                            System.out.println("Triplets"+arr[i]+","+arr[j]+","+arr[k]);
                        }
                    }
                }

            }
            System.out.println("count:
            ");
            return ans;
        }

    }
    

