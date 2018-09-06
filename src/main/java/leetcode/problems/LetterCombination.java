package leetcode.problems;

import com.sun.org.apache.xalan.internal.xsltc.util.IntegerArray;

/**
 * a -> 1
 * b -> 2
 *
 * z -> 26
 * How many combination of this string can be mapped to the letters? say 12. -> 2. (ab, l)
 */
public class LetterCombination {

    public static void main(String[] args){
        String numbers = "1212";
        System.out.println(findTotoal(numbers));
    }

    public static int findTotoal(String str) {
        return findSub(str);
    }

    public static int findSub(String subString){
        if (subString.length() == 1) {
            return 1;
        } else {
            if (subString.length() == 2) {
                if (Integer.parseInt(subString) <= 26) {
                    return 2;
                } else {
                    return 1;
                }
            } else {
                String firstTwo = subString.substring(0, 2);
                if (Integer.parseInt(firstTwo) <= 26) {
                    return findSub(subString.substring(1, subString.length())) + findSub(subString.substring(2, subString.length()));
                } else {
                    return findSub(subString.substring(1, subString.length()));
                }
            }
        }
    }

}
