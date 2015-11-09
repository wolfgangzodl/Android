package com.example.aaron.nettobruttorechner;

/**
 * Created by Aaron on 20/10/15.
 */
public class Calculation {
    public static double calcNettoBrutto(double price, double tax, boolean bruttoToNetto){
        if(bruttoToNetto){
            return price / (100 + tax) * 100;
        }
        return price * (100 + tax) / 100;
    }
}
