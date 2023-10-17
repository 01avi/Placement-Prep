//Print duplicate charecter
package Placement;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
public class PrintDuplicate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String:-");
        String str = sc.nextLine();
        printDuplicate(str);

    }
    
    public static void printDuplicate(String str) {
        if (str == null) {
            System.out.println("String is NULL");
        }
        if (str.isEmpty()) {
            System.out.println("String is Empty");
        }
        if (str.length() == 1) {
            System.out.println("Single cahe String");
        }
        char words[] = str.toCharArray();
        Map<Character, Integer> charmap = new HashMap<Character, Integer>();

        for (Character ch : words) {
            if(charmap.containsKey(ch)){
                charmap.put(ch,charmap.get(ch)+1);
            }
            else{
                charmap.put(ch,1);
            }
        }

        Set <Map.Entry<Character,Integer>> entrySet=charmap.entrySet();
        for(Map.Entry<Character,Integer> entry: entrySet){
            if(entry.getValue()>1){
                 System.out.println(entry.getKey()+":"+entry.getValue());
            }
        }
    }
}
