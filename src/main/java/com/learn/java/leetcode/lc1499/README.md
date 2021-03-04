# [1499. Max Value of Equation][enTitle]

**Hard**

Given an array  *points*  containing the coordinates of points on a 2D plane, sorted by the x-values, where  *points[i] = [xi, yi]*  such that  *xi < xj*  for all  *1 <= i < j <= points.length* . You are also given an integer  *k* .

Find the  *maximum value of the equation*  *yi + yj + |xi - xj|*  where  *|xi - xj| <= k*  and  *1 <= i < j <= points.length* . It is guaranteed that there exists at least one pair of points that satisfy the constraint  *|xi - xj| <= k* .



**Example 1:** 


<pre><strong>Input:</strong> points = [[1,3],[2,0],[5,10],[6,-10]], k = 1
<strong>Output:</strong> 4
<strong>Explanation:</strong> The first two points satisfy the condition |x<sub>i</sub> - x<sub>j</sub>| <= 1 and if we calculate the equation we get 3 + 0 + |1 - 2| = 4. Third and fourth points also satisfy the condition and give a value of 10 + -10 + |5 - 6| = 1.
No other pairs satisfy the condition, so we return the max of 4 and 1.</pre>

**Example 2:** 

```
Input: points = [[0,0],[3,0],[9,2]], k = 3
Output: 3
Explanation:Only the first two points have an absolute difference of 3 or less in the x-values, and give the value of 0 + 0 + |0 - 3| = 3.

```



**Constraints:** 

-  *2 <= points.length <= 10^5*  
-  *points[i].length == 2*  
-  *-10^8 <= points[i][0], points[i][1] <= 10^8*  
-  *0 <= k <= 2 * 10^8*  
-  *points[i][0] < points[j][0]*  for all  *1 <= i < j <= points.length*  
-  *xi*  form a strictly increasing sequence.


# [1499. 满足不等式的最大值][cnTitle]

**困难**

给你一个数组  *points*  和一个整数  *k*  。数组中每个元素都表示二维平面上的点的坐标，并按照横坐标 x 的值从小到大排序。也就是说  *points[i] = [xi, yi]*  ，并且在  *1 <= i < j <= points.length*  的前提下，  *xi < xj*  总成立。

请你找出 *yi + yj + |xi - xj|*  的 **最大值** ，其中  *|xi - xj| <= k*  且  *1 <= i < j <= points.length* 。

题目测试数据保证至少存在一对能够满足  *|xi - xj| <= k*  的点。



**示例 1：** 


<pre><strong>输入：</strong>points = [[1,3],[2,0],[5,10],[6,-10]], k = 1
<strong>输出：</strong>4
<strong>解释：</strong>前两个点满足 |x<sub>i</sub> - x<sub>j</sub>| <= 1 ，代入方程计算，则得到值 3 + 0 + |1 - 2| = 4 。第三个和第四个点也满足条件，得到值 10 + -10 + |5 - 6| = 1 。
没有其他满足条件的点，所以返回 4 和 1 中最大的那个。</pre>

**示例 2：** 


<pre><strong>输入：</strong>points = [[0,0],[3,0],[9,2]], k = 3
<strong>输出：</strong>3
<strong>解释：</strong>只有前两个点满足 |x<sub>i</sub> - x<sub>j</sub>| <= 3 ，代入方程后得到值 0 + 0 + |0 - 3| = 3 。
</pre>



**提示：** 

-  *2 <= points.length <= 10^5*  
-  *points[i].length == 2*  
-  *-10^8 <= points[i][0], points[i][1] <= 10^8*  
-  *0 <= k <= 2 * 10^8*  
- 对于所有的 *1 <= i < j <= points.length*  ， *points[i][0] < points[j][0]*  都成立。也就是说， *xi*  是严格递增的。




# 算法思路

# 测试用例
```
1499. Max Value of Equation 1499. 满足不等式的最大值 Hard
```

[enTitle]: https://leetcode.com/problems/max-value-of-equation/
[cnTitle]: https://leetcode-cn.com/problems/max-value-of-equation/
