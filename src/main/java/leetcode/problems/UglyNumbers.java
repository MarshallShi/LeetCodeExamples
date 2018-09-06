package leetcode.problems;

/*
Ugly numbers are numbers whose only prime factors are 2, 3 or 5. The sequence 1, 2, 3, 4, 5, 6, 8, 9, 10, 12, 15, …
shows the first 11 ugly numbers. By convention, 1 is included.

Given a number n, the task is to find n’th Ugly number.

Examples:

Input  : n = 7
Output : 8

Input  : n = 10
Output : 12

Input  : n = 15
Output : 24

Input  : n = 150
Output : 5832
 */
public class UglyNumbers {

    public static void main(String[] args){
        System.out.println(" 7 th Ugly Number: " + findNthUglyNumber(7));

        System.out.println(" 10 th Ugly Number: " + findNthUglyNumber(10));

        System.out.println(" 15 th Ugly Number: " + findNthUglyNumber(15));

        System.out.println(" 150 th Ugly Number: " + findNthUglyNumber(150));
    }

    public static int findNthUglyNumber(int n) {
        int i = 0;
        int number = 1;
        int ret = 0;
        while (i <= n) {
            if (isUgly(number)) {
                i++;
                if (i == n) {
                    ret = number;
                    break;
                }
            }
            number++;
        }
        return ret;
    }

    public static boolean isUgly(int number) {
        number = maxDivide(number, 2);
        number = maxDivide(number, 3);
        number = maxDivide(number, 5);
        if (number == 1) {
            return true;
        } else {
            return false;
        }
    }

    public static int maxDivide(int number, int mod) {
        while (number%mod == 0)
            number = number/mod;
        return number;
    }
}
