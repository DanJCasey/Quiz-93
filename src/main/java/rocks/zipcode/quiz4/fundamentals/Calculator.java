package rocks.zipcode.quiz4.fundamentals;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

/**
 * @author leon on 21/12/2018.
 */
public class Calculator {
    public static Double squareRoot(Double value) {

        return Math.sqrt(value);
    }

    public static Double square(Double value) {
        return value * value;
    }

    public static Double[] squareRoots(Double... value) {
//        for(value : squareRoots()) {
//            Math.sqrt()
//        }
        return null;
    }

    public static Double[] squares(Double... values) {
//        for(int i = 0; i < values.length; i++){
//            double squared = values[i] * values[i];
//        }
//        return squared


//        ArrayList<Double> arr = new ArrayList<Double>();
//        for(Double value : arr) {
//            for(int i = 0; i < squares().length; i++) {
//            }
//        }
        return null;
    }

    public static Double add(Double value1, Double value2) {
        return value1 + value2;
    }

    public static Double subtract(Double value1, Double value2) {
        return value1 - value2;
    }


    public static Double divide(Double divisor, Double dividend) {
        return divisor/dividend;
    }
}
