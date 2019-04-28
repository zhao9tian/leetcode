package cn.hjmao.leetcode.a389findthedifference;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class SolutionTest {
  Solution solution = new Solution();

  @Test
  public void testFindTheDifference() {
    String s = "abcd";
    String t = "abcde";
    char expect = 'e';
    char actual = solution.findTheDifference(s, t);
    assertEquals(actual, expect);
  }
}