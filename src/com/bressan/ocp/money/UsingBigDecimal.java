package com.bressan.ocp.money;

import java.math.BigDecimal;

/**
 * usar new BigDecimal(String)
 * em vez de new BigDecimal(Double)
 */
public class UsingBigDecimal {
    public static void main(String[] args) {
        double val1 = 2.00;
        double val2 = 0.9;
        BigDecimal b1 = new BigDecimal(val1);
        BigDecimal b2 = new BigDecimal(val2);
        System.out.println(b1.subtract(b2));
        //print 1.09999999999999997779553950749686919152736663818359375
        BigDecimal b3 = new BigDecimal(String.valueOf(val1));
        BigDecimal b4 = new BigDecimal(String.valueOf(val2));
        System.out.println(b3.subtract(b4));
        //print 1.1
    }

}
