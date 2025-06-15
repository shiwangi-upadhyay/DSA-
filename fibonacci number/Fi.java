import java.util.*;

public class Fi{
    public static int fibonacci(int n){
        int [] memo = new int[n+1];
        for(int i=0;i<=n; i++){
            memo[i] = -1;
        }

        return fib(n, memo);
    }

    public static int fib(int n, int [] memo){
        if(memo[n] != -1){
            return memo[n];
        }

        if(n<2){
            memo[n] = n;
            return memo[n];
        }

        memo[n] = fib(n-1, memo) + fib(n-2, memo);
        return memo[n];
    }

    public static void main(String[] args){
        int n=10;
        System.out.println(fibonacci(n));
    }
}


