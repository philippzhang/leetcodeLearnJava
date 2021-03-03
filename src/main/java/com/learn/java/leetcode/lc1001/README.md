# [1001. Grid Illumination][enTitle]

**Hard**

You are given a  *grid*  of size  *N x N* , and each cell of this grid has a lamp that is initially **turned off** .

You are also given an array of lamp positions  *lamps* , where  *lamps[i] = [rowi, coli]*  indicates that the lamp at  *grid[rowi][coli]*  is **turned on** . When a lamp is turned on, it **illuminates its cell**  and **all other cells**  in the same **row, column, or diagonal** .

Finally, you are given a query array  *queries* , where  *queries[i] = [rowi, coli]* . For the  *ith*  query, determine whether  *grid[rowi][coli]*  is illuminated or not. After answering the  *ith*  query, **turn off**  the lamp at  *grid[rowi][coli]*  and its **8 adjacent lamps**  if they exist. A lamp is adjacent if its cell shares either a side or corner with  *grid[rowi][coli]* .

Return  *an array of integers*  *ans*  *,*  *where*  *ans[i]*  *should be*  *1*  *if the lamp in the*  *ith*  *query was illuminated, or*  *0*  *if the lamp was not.* 



**Example 1:** 

![img](https://assets.leetcode.com/uploads/2020/08/19/illu_1.jpg)


<pre><strong>Input:</strong> N = 5, lamps = [[0,0],[4,4]], queries = [[1,1],[1,0]]
<strong>Output:</strong> [1,0]
<strong>Explanation:</strong> We have the initial grid with all lamps turned off. In the above picture we see the grid after turning on the lamp at grid[0][0] then turning on the lamp at grid[4][4].
The 0<sup>th</sup> query asks if the lamp at grid[1][1] is illuminated or not (the blue square). It is illuminated, so set ans[0] = 1. Then, we turn off all lamps in the red square.
<img alt="" src="https://assets.leetcode.com/uploads/2020/08/19/illu_step1.jpg" style="width: 500px; height: 218px;">
The 1<sup>st</sup> query asks if the lamp at grid[1][0] is illuminated or not (the blue square). It is not illuminated, so set ans[1] = 0. Then, we turn off all lamps in the red rectangle.
<img alt="" src="https://assets.leetcode.com/uploads/2020/08/19/illu_step2.jpg" style="width: 500px; height: 219px;">
</pre>

**Example 2:** 

```
Input: N = 5, lamps = [[0,0],[4,4]], queries = [[1,1],[1,1]]
Output: [1,1]

```

**Example 3:** 

```
Input: N = 5, lamps = [[0,0],[0,4]], queries = [[0,4],[0,1],[1,4]]
Output: [1,1,0]

```



**Constraints:** 

-  *1 <= N <= 109*  
-  *0 <= lamps.length <= 20000*  
-  *lamps[i].length == 2*  
-  *0 <= lamps[i][j] < N*  
-  *0 <= queries.length <= 20000*  
-  *queries[i].length == 2*  
-  *0 <= queries[i][j] < N* 


# [1001. 网格照明][cnTitle]

**困难**

在  *N x N*  的网格  *grid*  上，每个单元格都有一盏灯，最初灯都处于 **关闭**  状态。

数组  *lamps*  表示打开的灯的位置。 *lamps[i] = [rowi, coli]*  表示 **打开**  位于  *grid[rowi][coli]*  的第  *i*  盏灯 。每盏灯都照亮自身单元格以及同一行、同一列和两条对角线上的所有其他单元格。

查询数组  *queries*  中，第  *i*  次查询  *queries[i] = [rowi, coli]* ，如果单元格  *[rowi, coli]*  是被照亮的，则查询结果为  *1*  ，否则为  *0*  。在第  *i*  次查询之后 [按照查询的顺序] ，**关闭**  位于单元格  *grid[rowi][coli]*  上或其相邻 8 个方向上（与单元格  *grid[rowi][coli]*  共享角或边）的任何灯。

返回答案数组  *ans*  ，  *answer[i]*  应等于第  *i*  次查询  *queries[i]*  的结果， *1*  表示照亮， *0*  表示未照亮。



**示例 1：** 

![img](https://assets.leetcode.com/uploads/2020/08/19/illu_1.jpg)


<pre><strong>输入：</strong>N = 5, lamps = [[0,0],[4,4]], queries = [[1,1],[1,0]]
<strong>输出：</strong>[1,0]
<strong>解释：</strong>最初所有灯都是关闭的。在执行查询之前，打开位于 [0, 0] 和 [4, 4] 的灯。第 0 次查询检查 grid[1][1] 是否被照亮（蓝色方框）。该单元格被照亮，所以 ans[0] = 1 。然后，关闭红色方框中的所有灯。
<img style="width: 500px; height: 218px;" src="https://assets.leetcode.com/uploads/2020/08/19/illu_step1.jpg" alt="">
第 1 次查询检查 grid[1][0] 是否被照亮（蓝色方框）。该单元格没有被照亮，所以 ans[1] = 0 。然后，关闭红色矩形中的所有灯。
<img style="width: 500px; height: 219px;" src="https://assets.leetcode.com/uploads/2020/08/19/illu_step2.jpg" alt="">
</pre>

**示例 2：** 

```
输入：N = 5, lamps = [[0,0],[4,4]], queries = [[1,1],[1,1]]
输出：[1,1]

```

**示例 3：** 

```
输入：N = 5, lamps = [[0,0],[0,4]], queries = [[0,4],[0,1],[1,4]]
输出：[1,1,0]

```



**提示：** 

-  *1 <= N <= 109*  
-  *0 <= lamps.length <= 20000*  
-  *lamps[i].length == 2*  
-  *0 <= lamps[i][j] < N*  
-  *0 <= queries.length <= 20000*  
-  *queries[i].length == 2*  
-  *0 <= queries[i][j] < N* 




# 算法思路

# 测试用例
```
1001. Grid Illumination 1001. 网格照明 Hard
```

[enTitle]: https://leetcode.com/problems/grid-illumination/
[cnTitle]: https://leetcode-cn.com/problems/grid-illumination/
