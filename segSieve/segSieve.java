
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        List<Integer> prim= segSieve(0, n);
        for(int p:prim)System.out.printf("%d ", p);
    }
    static List<Integer> simSieve(int n){
        boolean[] lul = new boolean[n+1];
        Arrays.fill(lul, true);
        lul[0]=false;
        lul[1]=false;
        for(int i=2;i*i<=n;i++)if(lul[i])for(int j=i*i;j<=n;j+=i)lul[j]=false;
        List<Integer> prime = new ArrayList<>();
        for(int i=2;i<=n;i++)if(lul[i])prime.add(i);
        return prime;
    }
    static List<Integer> segSieve(int l, int r){
        int lim = (int)Math.sqrt(r);
        List<Integer> prime = simSieve(lim);
        boolean[] mark = new boolean[r-l+1];
        Arrays.fill(mark, true);
        
        for(int p:prime){
            int start = Math.max(p*p, (l+p-1)/p*p);
            for(int i = start;i<=r;i+=p)mark[i-l]=false;
        }
        List<Integer> out = new ArrayList<>();
        for(int i=0;i<mark.length;i++)if(mark[i]&& i+l>1)out.add(i+l);
        return out;
    }
}
