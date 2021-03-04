# [1267. Count Servers that Communicate][enTitle]

**Medium**

You are given a map of a server center, represented as a  *m * n*  integer matrix  *grid* , where 1 means that on that cell there is a server and 0 means that it is no server. Two servers are said to communicate if they are on the same row or on the same column.  Return the number of servers that communicate with any other server.



**Example 1:** 

![img](https://assets.leetcode.com/uploads/2019/11/14/untitled-diagram-6.jpg)

```
Input: grid = [[1,0],[0,1]]
Output: 0
Explanation: No servers can communicate with others.
```

**Example 2:** 

![img](https://assets.leetcode.com/uploads/2019/11/13/untitled-diagram-4.jpg)

```
Input: grid = [[1,0],[1,1]]
Output: 3
Explanation: All three servers can communicate with at least one other server.

```

**Example 3:** 

![img](https://assets.leetcode.com/uploads/2019/11/14/untitled-diagram-1-3.jpg)

```
Input: grid = [[1,1,0,0],[0,0,1,0],[0,0,1,0],[0,0,0,1]]
Output: 4
Explanation: The two servers in the first row can communicate with each other. The two servers in the third column can communicate with each other. The server at right bottom corner can't communicate with any other server.

```



**Constraints:** 

-  *m == grid.length*  
-  *n == grid[i].length*  
-  *1 <= m <= 250*  
-  *1 <= n <= 250*  
-  *grid[i][j] == 0 or 1* 


# [1267. 统计参与通信的服务器][cnTitle]

**中等**

这里有一幅服务器分布图，服务器的位置标识在  *m * n*  的整数矩阵网格  *grid*  中，1 表示单元格上有服务器，0 表示没有。

如果两台服务器位于同一行或者同一列，我们就认为它们之间可以进行通信。

请你统计并返回能够与至少一台其他服务器进行通信的服务器的数量。



**示例 1：** 

![img](https://assets.leetcode-cn.com/aliyun-lc-upload/uploads/2019/11/24/untitled-diagram-6.jpg)

```
输入：grid = [[1,0],[0,1]]
输出：0
解释：没有一台服务器能与其他服务器进行通信。
```

**示例 2：** 

![img](https://assets.leetcode-cn.com/aliyun-lc-upload/uploads/2019/11/24/untitled-diagram-4-1.jpg)

```
输入：grid = [[1,0],[1,1]]
输出：3
解释：所有这些服务器都至少可以与一台别的服务器进行通信。

```

**示例 3：** 

![img](https://assets.leetcode-cn.com/aliyun-lc-upload/uploads/2019/11/24/untitled-diagram-1-3.jpg)

```
输入：grid = [[1,1,0,0],[0,0,1,0],[0,0,1,0],[0,0,0,1]]
输出：4
解释：第一行的两台服务器互相通信，第三列的两台服务器互相通信，但右下角的服务器无法与其他服务器通信。

```



**提示：** 

-  *m == grid.length*  
-  *n == grid[i].length*  
-  *1 <= m <= 250*  
-  *1 <= n <= 250*  
-  *grid[i][j] == 0 or 1* 




# 算法思路

# 测试用例
```
1267. Count Servers that Communicate 1267. 统计参与通信的服务器 Medium
```

[enTitle]: https://leetcode.com/problems/count-servers-that-communicate/
[cnTitle]: https://leetcode-cn.com/problems/count-servers-that-communicate/
