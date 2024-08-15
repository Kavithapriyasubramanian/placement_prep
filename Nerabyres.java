import java.util.*;
import java.util.List;
class Point{
    int x;
    int y;
    double dis;
    Point(int x,int y){
        this.x=x;
        this.y=y;
        this.dis=Math.sqrt(x*x+y*y);
    }
}
public class Nerabyres {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        List<Point>l=new ArrayList<>();
        for(int i=0;i<n;i++){
            int x=sc.nextInt();
            int y=sc.nextInt();
            l.add(new Point(x, y));
        }

        int k=sc.nextInt();
        Collections.sort(l,Comparator.comparingDouble(p->p.dis));

        for(int i=0;i<k;i++){
            System.out.println(l.get(i).x+" "+l.get(i).y);
        }


    }
    
}
