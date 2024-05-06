package tysieczny_wyraz_ciagu_fibonacciego;

import java.math.BigInteger;

class Fib{
    public static BigInteger fibonacci(int n)
    {
        if (n == 1 || n == 2)
        {
            return BigInteger.ONE;
        }

        BigInteger fibo1 = BigInteger.ONE;
        BigInteger fibo2 = BigInteger.ONE;
        BigInteger fibonacci = BigInteger.ZERO;

        for (int i = 3; i <= n; i++)
        {
            fibonacci = fibo1.add(fibo2);
            fibo1 = fibo2;
            fibo2 = fibonacci;
        }
        return fibonacci;
    }
}
public class Main {
    public static void main(String[] args)
    {
        System.out.println("F(1000) = " + Fib.fibonacci(1000) + ".");
    }
}
