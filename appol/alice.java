
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        int c = 0; int sum = 0;
        while(sum<x){
            c++;
            sum+=c*c*12;
        }
        System.out.printf("%d", c*8);
    }
}
