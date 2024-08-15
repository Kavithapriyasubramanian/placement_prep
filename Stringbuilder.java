import java.util.*;
public class Stringbuilder {
    public static void main(String args[]){
    StringBuilder sb=new StringBuilder("Tony");
    System.out.println(sb);

    //char at index
    System.out.println(sb.charAt(0));

    //set char at index
    //sb.setCharAt(0,'p');

    //sb.insert(0, 's');
    //sb.delete(2, 3);
    //append=add at last
    sb.append("s");
    System.out.println(sb);
    }
    
}

