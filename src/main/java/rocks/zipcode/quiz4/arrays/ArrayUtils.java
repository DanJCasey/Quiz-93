package rocks.zipcode.quiz4.arrays;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

/**
 * @author leon on 01/01/2019.
 */
public class ArrayUtils {
    public static String getMiddleElement(String[] values) {
        int middle = values.length/2;
        return values[middle];
    }

    public static String[] removeMiddleElement(String[] values) {
        int middle = values.length/2;
        String[] arr = new String[values.length - 1];
        for(int i = 0, k = 0; i < values.length; i++){
            if(i == middle){
                continue;
            }
            arr[k++] = values[i];
        }
        return arr;
    }

    public static String getLastElement(String[] values) {
        int last = values.length - 1;
        return values[last];
    }

    public static String[] removeLastElement(String[] values) {
        int last = values.length - 1;
        String[] arr = new String[values.length - 1];
        for(int i = 0, k = 0; i < values.length; i++){
            if(i == last){
                continue;
            }
            arr[k++] = values[i];
        }
        return arr;
    }
}