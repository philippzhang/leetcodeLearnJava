# [1591. Strange Printer II][enTitle]

**Hard**

There is a strange printer with the following two special requirements:

- On each turn, the printer will print a solid rectangular pattern of a single color on the grid. This will cover up the existing colors in the rectangle. 
- Once the printer has used a color for the above operation, **the same color cannot be used again** .

You are given a  *m x n*  matrix  *targetGrid* , where  *targetGrid[row][col]*  is the color in the position  *(row, col)*  of the grid.

Return  *true*  *if it is possible to print the matrix*  *targetGrid*  *,*  *otherwise, return*  *false* .



**Example 1:** 

![img](https://assets.leetcode.com/uploads/2020/08/15/sample_1_1929.png)

```
Input: targetGrid = [[1,1,1,1],[1,2,2,1],[1,2,2,1],[1,1,1,1]]
Output: true

```

**Example 2:** 

![img](https://assets.leetcode.com/uploads/2020/08/15/sample_2_1929.png)

```
Input: targetGrid = [[1,1,1,1],[1,1,3,3],[1,1,3,4],[5,5,1,4]]
Output: true

```

**Example 3:** 

```
Input: targetGrid = [[1,2,1],[2,1,2],[1,2,1]]
Output: false
Explanation: It is impossible to form targetGrid because it is not allowed to print the same color in different turns.
```

**Example 4:** 

```
Input: targetGrid = [[1,1,1],[3,1,3]]
Output: false

```



**Constraints:** 

-  *m == targetGrid.length*  
-  *n == targetGrid[i].length*  
-  *1 <= m, n <= 60*  
-  *1 <= targetGrid[row][col] <= 60* 


# [1591. 奇怪的打印机 II][cnTitle]

**困难**

给你一个奇怪的打印机，它有如下两个特殊的打印规则：

- 每一次操作时，打印机会用同一种颜色打印一个矩形的形状，每次打印会覆盖矩形对应格子里原本的颜色。 
- 一旦矩形根据上面的规则使用了一种颜色，那么 **相同的颜色不能再被使用** 。

给你一个初始没有颜色的  *m x n*  的矩形  *targetGrid*  ，其中  *targetGrid[row][col]*  是位置  *(row, col)*  的颜色。

如果你能按照上述规则打印出矩形 *targetGrid*  ，请你返回  *true*  ，否则返回  *false*  。



**示例 1：** 

![img](https://assets.leetcode-cn.com/aliyun-lc-upload/uploads/2020/09/19/sample_1_1929.png)

```
输入：targetGrid = [[1,1,1,1],[1,2,2,1],[1,2,2,1],[1,1,1,1]]
输出：true

```

**示例 2：** 

![img](https://assets.leetcode-cn.com/aliyun-lc-upload/uploads/2020/09/19/sample_2_1929.png)

```
输入：targetGrid = [[1,1,1,1],[1,1,3,3],[1,1,3,4],[5,5,1,4]]
输出：true

```

**示例 3：** 

```
输入：targetGrid = [[1,2,1],[2,1,2],[1,2,1]]
输出：false
解释：没有办法得到 targetGrid ，因为每一轮操作使用的颜色互不相同。
```

**示例 4：** 

```
输入：targetGrid = [[1,1,1],[3,1,3]]
输出：false

```



**提示：** 

-  *m == targetGrid.length*  
-  *n == targetGrid[i].length*  
-  *1 <= m, n <= 60*  
-  *1 <= targetGrid[row][col] <= 60* 




# 算法思路

# 测试用例
```
1591. Strange Printer II 1591. 奇怪的打印机 II Hard
```

[enTitle]: https://leetcode.com/problems/strange-printer-ii/
[cnTitle]: https://leetcode-cn.com/problems/strange-printer-ii/
