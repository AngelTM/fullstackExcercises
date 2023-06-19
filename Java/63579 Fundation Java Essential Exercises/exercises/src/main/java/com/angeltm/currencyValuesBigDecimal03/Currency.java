package com.angeltm.currencyValuesBigDecimal03; 
import java.math.BigDecimal;
public class Currency {

    public static void ex() {
        double value = .012;
        System.out.println(value);
        double pSum = value + value + value;
        System.out.println(pSum);
        String strValue = Double.toString(value);
        System.out.println(strValue);
        BigDecimal bigValue = new BigDecimal(strValue);
        System.out.println(bigValue);
        BigDecimal bSum = bigValue.add(bigValue).add(bigValue);
        System.out.println(bSum);
        double sum = bSum.doubleValue();
        System.out.println(sum);

    }
}