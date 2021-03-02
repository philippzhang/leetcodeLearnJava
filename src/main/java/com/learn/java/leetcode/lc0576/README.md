# [576. Out of Boundary Paths][enTitle]

**Medium**

There is an m by n grid with a ball. Given the start coordinate (i,j) of the ball, you can move the ball to adjacent cell or cross the grid boundary in four directions (up, down, left, right). However, you can at most move N times. Find out the number of paths to move the ball out of grid boundary. The answer may be very large, return it after mod 10<sup>9</sup> + 7.



Example 1:


<pre><b>Input: </b>m = 2, n = 2, N = 2, i = 0, j = 0
<b>Output:</b> 6
<b>Explanation:</b>
<img src="https://assets.leetcode.com/uploads/2018/10/13/out_of_boundary_paths_1.png" style="width: 100%; max-width: 400px">
</pre>

Example 2:


<pre><b>Input: </b>m = 1, n = 3, N = 3, i = 0, j = 1
<b>Output:</b> 12
<b>Explanation:</b>
<img src="https://assets.leetcode.com/uploads/2018/10/12/out_of_boundary_paths_2.png" style="width: 100%; max-width: 400px">
</pre>



Note:

1. Once you move the ball out of boundary, you cannot move it back. 
2. The length and height of the grid is in range [1,50]. 
3. N is in range [0,50].


# [576. 出界的路径数][cnTitle]

**中等**

给定一个 **m × n** 的网格和一个球。球的起始坐标为 **(i,j)**  ，你可以将球移到**相邻** 的单元格内，或者往上、下、左、右四个方向上移动使球穿过网格边界。但是，你**最多** 可以移动 **N** 次。找出可以将球移出边界的路径数量。答案可能非常大，返回 结果 mod 10<sup>9</sup> + 7 的值。



**示例 1：** 


<pre><strong>输入: </strong>m = 2, n = 2, N = 2, i = 0, j = 0
<strong>输出:</strong> 6
<strong>解释:</strong>
<img style="width: 100%; max-width: 400px" src="https://assets.leetcode-cn.com/aliyun-lc-upload/uploads/2018/10/12/out_of_boundary_paths_1.png">
</pre>

**示例 2：** 


<pre><strong>输入: </strong>m = 1, n = 3, N = 3, i = 0, j = 1
<strong>输出:</strong> 12
<strong>解释:</strong>
<img style="width: 100%; max-width: 400px" src="https://assets.leetcode-cn.com/aliyun-lc-upload/uploads/2018/10/12/out_of_boundary_paths_2.png">
</pre>



**说明:** 

1. 球一旦出界，就不能再被移动回网格内。 
2. 网格的长度和高度在 [1,50] 的范围内。 
3. N 在 [0,50] 的范围内。




# 算法思路

# 测试用例
```
576. Out of Boundary Paths 576. 出界的路径数 Medium
```

[enTitle]: https://leetcode.com/problems/out-of-boundary-paths/
[cnTitle]: https://leetcode-cn.com/problems/out-of-boundary-paths/
