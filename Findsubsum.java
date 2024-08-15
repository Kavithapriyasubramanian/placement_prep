// You are using Java
import java.util.*;
class Main{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int k=sc.nextInt();
        List<List<Integer>>res=new ArrayList<>();
        findsubseq(arr,k,0,new ArrayList<>(),res);
        for(List<Integer>sub:res){
            for(int num:sub){
                System.out.print(num+" ");
            }
            System.out.println();
        }
    }
    public static void findsubseq(int arr[],int k,int startindex,List<Integer>curr,List<List<Integer>>res){
        if(k==0){
            res.add(new ArrayList<>(curr));
            return;
        }
        if(startindex==arr.length){
            return;
        }
        for(int i=startindex;i<arr.length;i++){
            if(arr[i]<=k){
                curr.add(arr[i]);
            findsubseq(arr,k-arr[i],i+1,curr,res);
            curr.remove(curr.size()-1);
            }
        }
    }
}