import java.util.*;
public class LL {
    public static void main(String args[]){
        LinkedList<String>list=new LinkedList<String>();

        list.addFirst("a");
        list.addFirst("is");
        System.out.println(list);

        list.add("list");
        list.addFirst("This");
        //if we type add then it give addlast by default

        System.out.println(list);

        System.out.println(list.size());



        for(int i=0;i<list.size();i++){
            System.out.print(list.get(i)+"->");
        }
        System.out.println("null");

        list.removeFirst();
        System.out.println(list);
    }
    
}
