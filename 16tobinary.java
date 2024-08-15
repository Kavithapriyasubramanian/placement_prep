import java.util.*;//0001101011000101
class Main{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        //String s=sc.nextLine();
        String hexadecimal[]={"0000","0001","0010","0011","0100","0101","0110","0111","1000","1001","1010","1011","1100","1101","1110","1111"};
        String s=sc.nextLine().toLowerCase();
        for(int i=0;i<s.length();i++){
            switch(s.charAt(i)){
                case '0':
                    System.out.print(hexadecimal[0]);
                    break;
                case '1':
                    System.out.print(hexadecimal[1]);
                    break;
                case '2':
                    System.out.print(hexadecimal[2]);
                    break;
                case '3':
                    System.out.print(hexadecimal[3]);
                    break;
                case '4':
                    System.out.print(hexadecimal[4]);
                    break;
                case '5':
                    System.out.print(hexadecimal[5]);
                    break;
                case '6':
                    System.out.print(hexadecimal[6]);
                    break;
                case '7':
                    System.out.print(hexadecimal[7]);
                    break;
                case '8':
                    System.out.print(hexadecimal[8]);
                    break;
                case '9':
                    System.out.print(hexadecimal[9]);
                    break;
                case 'a':
                    System.out.print(hexadecimal[10]);
                    break;
                case 'b':
                    System.out.print(hexadecimal[11]);
                    break;
                case 'c':
                    System.out.print(hexadecimal[12]);
                    break;
                case 'd':
                    System.out.print(hexadecimal[13]);
                    break;
                case 'e':
                    System.out.print(hexadecimal[14]);
                    break;
                case 'f':
                    System.out.print(hexadecimal[15]);
                    break;
                    default :
                    System.out.println("Invalid");
            }
        }
    }
}