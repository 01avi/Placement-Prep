//WAP to remove a given character from String? 

package Placement;

public class DeleteChar {
    public static void main(String[] args) {
        String str = "ABCDEFGHIKJ";
        char rem = 'K';
        char ans;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == rem) {
                continue;
            } else {
                ans = str.charAt(i);
                System.out.print(ans);
            }
        }
    }
}
