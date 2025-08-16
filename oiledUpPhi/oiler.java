import java.util.*;

public class Solution {

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        System.out.println(sumCoprime(n));
    }

    static int phi(int n){
        int res = n;
        for(int i=2;i*i<=n;i++){
            if(n%i==0){
                while(n%i==0) n/=i;
                res -= res/i;
            }
        }
        if(n>1) res -= res/n;
        return res;
    }

    static int sumCoprime(int n){
        if(n==1) return 1; // only 1 is coprime with 1
        return n * phi(n)/2;
    }
}
