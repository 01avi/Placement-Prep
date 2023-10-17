package Placement;

import java.util.LinkedHashSet;
import java.util.Set;

public class DuplicateCharString
{
    public static void main(String[] args) {
        String str ="Placceed";
        Set<Character> set = new LinkedHashSet<Character>();
        for (int i = 0; i < str.length(); i++) {
            set.add(str.charAt(i));
        }

        for (Character c : set) {
            System.out.print(c);
        }
}
}
