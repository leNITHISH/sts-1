
import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for (int i = (int)Math.pow(10, n - 1); i < (int)Math.pow(10, n); i++)
            if (isStrobo(Integer.toString(i))) System.out.printf("%d ", i);
    }

    public static boolean isStrobo(String num) {
        StringBuilder flipped = new StringBuilder();
        for (char c : num.toCharArray()) {
            if (c == '0') flipped.append('0');
            else if (c == '1') flipped.append('1');
            else if (c == '6') flipped.append('9');
            else if (c == '9') flipped.append('6');
            else if (c == '8') flipped.append('8');
            else return false;
        }
        return num.equals(flipped.reverse().toString());
    }
}
