
package galib_303;
import  java.math.BigInteger;
public class MyCalculator implements AdvancedArithmetic {
    

    @Override
    public int Divisior(int n) {
        int divcount =0;
       for(int i=1; i<=n; i++)
       {
           if(n%i==0)
               divcount +=i;
       }
        return divcount;
    }
    @Override
    public BigInteger findFactorial( n) {
         BigInteger result = new BigInteger.ZERO;
         for (int i=1;i<n)
        return 0;
       
   }
}


