import java.util.*;
public class NGE{

    public static int[] nextgreater(int[] arr,int size){
        Stack<Integer>stack=new Stack<>();
        //int size=arr.length;
        int res[]=new int[size];

        for(int i=size-1;i>=0;i--){
            while(!stack.isEmpty()&& stack.peek()<=arr[i]){
                stack.pop();
            }

            if(stack.isEmpty()){
                res[i]=-1;
            }
            else{
                res[i]=stack.peek();
            }
            stack.push(arr[i]);
        }
        return res;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("size:");
        int size=sc.nextInt();
        int arr[]=new int[size];
        System.out.println("entering:");

        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }

       // System.out.println(nextgreater(arr, size));
       int[] result=nextgreater(arr, size);


        System.out.println("Next Greater Elements:");
        for (int i = 0; i < size; i++) {
            System.out.print(result[i] + " ");
        }
    }
}