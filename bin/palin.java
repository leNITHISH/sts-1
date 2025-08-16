
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        System.out.printf("%s", bin(n)?"yes":"no");
    }
    static boolean bin(int n) {
        String b = Integer.toBinaryString(n);       // num -> binary string
        String rev = new StringBuilder(b).reverse().toString(); // reverse
        return b.equals(rev);                       // equivalence check
    }
}
