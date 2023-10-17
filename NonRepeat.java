// WAP to find the first non-repeating character in a given String?
package Placement;

import java.util.HashMap;

public class NonRepeat {
    public static void main(String[] args) {
        String s = "abcabcdeggedr";
        HashMap<Character, Integer> hmap = new HashMap<Character, Integer>();
        int n = s.length();
        for (int i = 0; i < n; i++) {
            Character curr = s.charAt(i);
            if (hmap.containsKey(curr) == false) {
                hmap.put(curr, 1);

            } else {
                int currFreq = hmap.get(curr);
                currFreq = currFreq + 1;
                hmap.put(curr, currFreq);
            }
        }
        for (int i = 0; i < n; i++) {
            Character curr = s.charAt(i);
            int currFreq = hmap.get(curr);
            if (currFreq == 1) {
                System.out.println(curr + " is the first non repeating charecter");
                break;
            }
        }

}

}


