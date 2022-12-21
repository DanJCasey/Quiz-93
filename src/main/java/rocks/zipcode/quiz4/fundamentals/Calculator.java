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
        Double[] arr = new Double[value.length];
        for(int i = 0; i < value.length; i++){
            arr[i] = Math.sqrt(value[i]);
        }
        return arr;
    }

    public static Double[] squares(Double... values) {
        Double[] arr = new Double[values.length];
        for(int i = 0; i < values.length; i++){
            arr[i] = values[i] * values[i];
        }
        return arr;


//        ArrayList<Double> arr = new ArrayList<Double>();
//        for(Double value : arr) {
//            for(int i = 0; i < squares().length; i++) {
//            }
//        };
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
