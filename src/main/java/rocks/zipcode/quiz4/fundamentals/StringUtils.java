package rocks.zipcode.quiz4.fundamentals;


import java.util.Arrays;

/**
 * @author leon on 21/12/2018.
 */
public class StringUtils {
    public static Character getMiddleCharacter(String string) {
        int middle = string.length()/2;
        return string.charAt(middle);
    }

    public static String capitalizeMiddleCharacter(String str) {
        int middle = str.length()/2;
        StringBuilder sb = new StringBuilder(str);
        char ch = Character.toUpperCase(sb.charAt(middle));
        sb.setCharAt(middle, ch);
        return sb.toString();
    }

    public static String lowerCaseMiddleCharacter(String str) {
        int middle = str.length()/2;
        StringBuilder sb = new StringBuilder(str);
        char ch = Character.toLowerCase(sb.charAt(middle));
        sb.setCharAt(middle, ch);
        return sb.toString();
    }

    /* isogram (plural isograms) A word or phrase in which each letter occurs the same number of times. read the tests. */
    public static Boolean isIsogram(String str) {
        int length = str.length();
        char arr[] = str.toCharArray();

        Arrays.sort(arr);
        for(int i = 0; i < length - 1; i++){
            if (arr[i] == arr[i + 1])
                return false;
        }
        return true;
    }

    public static Boolean hasDuplicateConsecutiveCharacters(String str) {
        for (int i = 0; i < str.length() - 1; i++)
            if (str.charAt(i) == str.charAt(i + 1))
                return true;
        return false;
    }

//        String arr[] = new String[str.length()];
//        for(int i = 0; i < arr.length; i++) {
//            int j;
//            for (j = 1; j < arr[i].length(); j++) {
//                if (arr[i].charAt(j) == arr[i].charAt(j - 1)) {
//                    break;
//                }
//            }
//            if (j == arr[i].length());
//        }
//        return false;
//    }

    public static String removeConsecutiveDuplicateCharacters(String str) {
        return str.replaceAll("(.)\\1+", "");


//        if(str.substring(0,1).equalsIgnoreCase(str.substring(1,2)) )
//            return str.substring(1);
//        else return str.substring(0, 1) + str.substring(1);
    }


//
//            int len = str.length();
//
//            for (int i = 0; i < len; i++)
//            {
//                char c = str.charAt(i);
//
//                if (str.indexOf(c) < 0)
//                {
//                    str += c;
//                }
//            }
//
//            return str;
//        }



    public static String invertCasing(String str) {
       return org.apache.commons.lang3.StringUtils.swapCase(str);
    }
}
