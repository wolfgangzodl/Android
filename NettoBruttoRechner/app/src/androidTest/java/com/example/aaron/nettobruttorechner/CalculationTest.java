package com.example.aaron.nettobruttorechner;

import junit.framework.TestCase;

/**
 * Created by Aaron on 23/10/15.
 */
public class CalculationTest extends TestCase {

    public void testCalcNettoBrutto() throws Exception {
        assertEquals(120.00, Calculation.calcNettoBrutto(100,20,false), 0.01);
        assertEquals(1236.60, Calculation.calcNettoBrutto(1385,12,true), 0.01);
        assertEquals(80.85, Calculation.calcNettoBrutto(73.50,10,false), 0.01);
        assertEquals(66.81, Calculation.calcNettoBrutto(73.50,10,true), 0.01);
    }
}