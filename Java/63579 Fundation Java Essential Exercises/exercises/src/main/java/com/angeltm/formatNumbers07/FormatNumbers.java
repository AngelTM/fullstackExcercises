package com.angeltm.formatNumbers07;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;

public class FormatNumbers {
    public static void ex() {
        double doubleValue = 1_234_567.89;

        NumberFormat numberFormat = NumberFormat.getNumberInstance();
        System.out.println(numberFormat.format(doubleValue));

        NumberFormat intFormat = NumberFormat.getIntegerInstance();
        System.out.println(intFormat.format(doubleValue));

        numberFormat.setGroupingUsed(false);
        System.out.println(numberFormat.format(doubleValue));

        Locale locale = new Locale("es", "MX");
        NumberFormat localFormat = NumberFormat.getNumberInstance(locale);
        System.out.println(localFormat.format(doubleValue));

        NumberFormat currencyFormat = NumberFormat.getCurrencyInstance(locale);
        System.out.println(currencyFormat.format(doubleValue));

        DecimalFormat df = new DecimalFormat("$##0.00#");
        System.out.println(df.format(1));
        System.out.println(df.format(5.891));
    }
}
