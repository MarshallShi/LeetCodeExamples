package leetcode.problems;

/**
 * There are two sorted arrays nums1 and nums2 of size m and n respectively.
 *
 * Find the median of the two sorted arrays. The overall run time complexity should be O(log (m+n)).
 *
 * You may assume nums1 and nums2 cannot be both empty.
 *
 *
 *
 * Example 1:
 *
 * nums1 = [1, 3]
 * nums2 = [2]
 *
 * The median is 2.0
 * Example 2:
 *
 * nums1 = [1, 2]
 * nums2 = [3, 4]
 *
 * The median is (2 + 3)/2 = 2.5
 */
public class MedianOfTwoSortedArrays {

    public static void main(String[] args) {
        int[] a = new int[]{1, 2};
        int[] b = new int[]{3, 4};
        int[] merged = sort(a, b);
        int length = merged.length;
        if (length % 2 != 0) {
            System.out.println("The median of two sorted array is " + merged[merged.length/2]);
        } else {
            System.out.println("The median of two sorted array is " + (double)(merged[merged.length/2 - 1] +  merged[merged.length/2] )/ 2);
        }
    }

    public static int[] sort(int[] a,int[] b){
        int merge[]=new int[a.length + b.length];

        int lenA=0,lenB=0,lenMer=0;

        while(lenA < a.length && lenB < b.length){
            if(a[lenA]<b[lenB]){
                merge[lenMer++]=a[lenA++];
            }else{
                merge[lenMer++]=b[lenB++];
            }
        }
        while(lenA<a.length){
            merge[lenMer++]=a[lenA++];
        }

        while(lenB<b.length){
            merge[lenMer++]=b[lenB++];
        }

        return merge;
    }

}
