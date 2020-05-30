package cn.echo.learn.basic;

import java.math.BigDecimal;
import java.math.BigInteger;

public class BigNumberType {
    public static void main(String[] args) {
        BigInteger bigInt = BigInteger.valueOf(100);
        bigInt = bigInt.add(BigInteger.valueOf(123456789))
                .subtract(BigInteger.valueOf(2589))
                .divide(BigInteger.valueOf(100))
                .multiply(BigInteger.valueOf(2));
        System.out.println(bigInt.longValue());

        BigDecimal bigDec = BigDecimal.valueOf(3.4234234234234);
        System.out.println(bigDec.toString());
    }
}
