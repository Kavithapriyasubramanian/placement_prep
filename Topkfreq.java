import java.util.*;
public class Topkfreq {
    public static int[] topk(int num[],int k){

        List<Integer>[] bucket=new ArrayList[num.length+1];
        Map<Integer, Integer>frequencyMap=new HashMap<>();

        for (int n:num) {
            frequencyMap.put(n,frequencyMap.getOrDefault(n, 0)+1);
            
        }


        for(int key:frequencyMap.keySet()){
            int frequency=frequencyMap.get(key);
            if(bucket[frequency]==null){
                bucket[frequency]=new ArrayList<>();
            }
            bucket[frequency].add(key);
            
        }

        int[] res=new int[k];
        int counter=0;


        for(int pos=bucket.length-1;pos>=0 && counter<k;pos--){
            if(bucket[pos]!=null){
                for(Integer integer:bucket[pos]){
                    res[counter++]=integer;
                }
            }
        }
        return res;
    }



    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("size:");
        int size=sc.nextInt();
        int num[]=new int[size];

        System.out.println("entering:");
        for(int i=0;i<size;i++){
            num[i]=sc.nextInt();
            
        }

        System.out.println("k:");
        int k=sc.nextInt();

        int[] res=topk(num,k);

        System.out.println("Top "+k+"frequent elements:");


        for(int ele:res){
            System.out.println(ele+" ");
        }

        
    }

    
}
