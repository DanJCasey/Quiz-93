package rocks.zipcode.quiz4.fundamentals;


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
        return null;
    }

    public static Boolean hasDuplicateConsecutiveCharacters(String str) {
        return null;
    }

    public static String removeConsecutiveDuplicateCharacters(String str) {
        return null;
    }

    public static String invertCasing(String str) {
       return org.apache.commons.lang3.StringUtils.swapCase(str);
    }
}
