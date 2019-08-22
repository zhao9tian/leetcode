package cn.hjmao.leetcode.a941validmountainarray;

/**
 * Created by hjmao.
 *
 * URL:
 * =====
 * https://leetcode.com/problems/valid-mountain-array/
 *
 * Desc:
 * =====
 * Given an array A of integers, return true if and only if it is a valid mountain array.
 *
 * Recall that A is a mountain array if and only if:
 *
 * A.length >= 3
 * There exists some i with 0 < i < A.length - 1 such that:
 * A[0] < A[1] < ... A[i-1] < A[i]
 * A[i] > A[i+1] > ... > A[A.length - 1]
 *
 *
 * Example 1:
 * Input: [2,1]
 * Output: false
 *
 * Example 2:
 * Input: [3,5,5]
 * Output: false
 *
 * Example 3:
 * Input: [0,3,2,1]
 * Output: true
 *
 *
 * Note:
 * 0 <= A.length <= 10000
 * 0 <= A[i] <= 10000 *
 */

class Solution {
  public boolean validMountainArray(int[] a) {
    int i = 1;
    for (; i < a.length; i++) {
      if (a[i] <= a[i - 1]) {
        break;
      }
    }
    if (i == 1 || i == a.length) {
      return false;
    }
    for (; i < a.length; i++) {
      if (a[i] >= a[i - 1]) {
        break;
      }
    }
    return i == a.length;
  }
}
