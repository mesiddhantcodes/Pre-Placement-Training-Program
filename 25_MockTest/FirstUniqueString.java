import java.util.HashMap;
import java.util.Scanner;

public class FirstUniqueString {
    public static int freq(String s) {
        HashMap<Character, Integer> mp = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            if (mp.containsKey(s.charAt(i))) 
            {
                mp.put(s.charAt(i), mp.get(s.charAt(i)) + 1);
            } else {
                mp.put(s.charAt(i), 1);
            }
        }
        for (int i = 0; i < s.length(); i++) {
            if (mp.get(s.charAt(i)) == 1) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the string");
        String str = scanner.nextLine();
        int ans=freq(str);
        System.out.println(ans);

    }
}
