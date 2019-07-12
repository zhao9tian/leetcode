package cn.hjmao.leetcode.a812largesttrianglearea;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class SolutionTest {
  private Solution solution = new Solution();

  @Test
  public void testLargestTriangleArea1() {
    int[][] points = {{0, 0}, {0, 1}, {1, 0}, {0, 2}, {2, 0}};
    double expect = 2;
    double actual = solution.largestTriangleArea(points);
    assertEquals(actual, expect);
  }

  @Test
  public void testLargestTriangleArea2() {
    int[][] points = {{0, 0}, {0, 1}, {1, 0}};
    double expect = .5;
    double actual = solution.largestTriangleArea(points);
    assertEquals(actual, expect);
  }
}