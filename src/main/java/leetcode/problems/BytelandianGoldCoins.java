package leetcode.problems;

import java.util.Date;

public class BytelandianGoldCoins {

    public static void main(String[] args){
        int coinNumber = 12;
        System.out.println("Start finding" + new Date());
        int[] arr = new int[13];
        System.out.println(findIt(coinNumber, arr));
        System.out.println("End finding" + new Date());
    }

    public static int findIt(int num, int[] arr) {
        if (num == 1) {
            arr[1] = 1;
            return 1;
        } else if (num == 2) {
            arr[2] = 2;
            return 2;
        } else if (num == 3) {
            arr[3] = 3;
            return 3;
        } else if (num == 4) {
            arr[4] = 4;
            return 4;
        } else {
            int numHalf = 0;
            if (arr[num/2] != 0) {
                numHalf = arr[num/2];
            } else {
                numHalf = findIt(num/2, arr);
            }

            int numThird = 0;
            if (arr[num/3] != 0) {
                numThird = arr[num/3];
            } else {
                numThird = findIt(num/3, arr);
            }

            int numFourth = 0;
            if (arr[num/4] != 0) {
                numFourth = arr[num/4];
            } else {
                numFourth = findIt(num/4, arr);
            }
            int temp = numHalf + numThird + numFourth;
            if (temp > num) {
                arr[num] = temp;
                return temp;
            } else {
                arr[num] = num;
                return num;
            }
        }
    }

//    public static int findIt2(int num) {
//        if (num == 1) {
//            return 1;
//        } else if (num == 2) {
//            return 2;
//        } else if (num == 3) {
//            return 3;
//        } else if (num == 4) {
//            return 4;
//        } else {
//            int temp = findIt(num/2) + findIt(num/3) + findIt(num/4);
//            if (temp > num) {
//                return temp;
//            } else {
//                return num;
//            }
//        }
//    }
}
