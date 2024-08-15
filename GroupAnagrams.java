/*import java.util.*;
public class Anagram {
    public static boolean validanagram(String s1,String s2){
        s1=s1.toLowerCase();
        s2=s2.toLowerCase();

        s1=s1.replace(" ","");
        s2=s2.replace(" ","");

        int[] arr=new int[26];

        for(int i=0;i<s1.length();i++){
            arr[s1.charAt(i)-'a']++;

        }

        for(int i=0;i<s2.length();i++){
            arr[s2.charAt(i)-'a']--;
        }

        for(int count:arr){
            if(count!=0)
            return false;
        }

        return true;

    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the first string:");
        String s1=sc.nextLine();
        System.out.println("Enter the second string:");
        String s2=sc.nextLine();

        boolean ans=validanagram(s1,s2);
        System.out.println(ans);

    }

    
}*/

import java.util.*;
import java.util.List;

public class Anagram {

    public static List<List<String>> groupAnagrams(String[] strs) {
        if (strs == null || strs.length == 0) {
            return new ArrayList<>();
        }
        
        Map<String, List<String>> map = new HashMap<>();
        
        for(String str : strs){
            String freString = getFrequencyString(str);
            if(map.containsKey(freString)){
                map.get(freString).add(str);
            }
            else{
                List<String> strList = new ArrayList<>();
                strList.add(str);
                map.put(freString, strList);
            }
        }
        
        return new ArrayList<>(map.values());
    }
    
    // Helper function to compute frequency string of a string
    private static String getFrequencyString(String str) {
        int[] count = new int[26]; // Assuming only lowercase alphabets
        for (char c : str.toCharArray()) {
            count[c - 'a']++;
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 26; i++) {
            sb.append('#').append(count[i]);
        }
        return sb.toString();
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of strings: ");
        int n = scanner.nextInt();
        scanner.nextLine(); // Consume newline character
        
        String[] strs = new String[n];
        System.out.println("Enter the strings: ");
        for (int i = 0; i < n; i++) {
            strs[i] = scanner.nextLine();
        }
        
        List<List<String>> groupedAnagrams = groupAnagrams(strs);
        System.out.println("Grouped Anagrams: " + groupedAnagrams);
        
        scanner.close();
    }
}
