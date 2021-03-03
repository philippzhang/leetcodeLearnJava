# [957. Prison Cells After N Days][enTitle]

**Medium**

There are  *8*  prison cells in a row and each cell is either occupied or vacant.

Each day, whether the cell is occupied or vacant changes according to the following rules:

- If a cell has two adjacent neighbors that are both occupied or both vacant, then the cell becomes occupied. 
- Otherwise, it becomes vacant.

**Note**  that because the prison is a row, the first and the last cells in the row can't have two adjacent neighbors.

You are given an integer array  *cells*  where  *cells[i] == 1*  if the  *ith*  cell is occupied and  *cells[i] == 0*  if the  *ith*  cell is vacant, and you are given an integer  *n* .

Return the state of the prison after  *n*  days (i.e.,  *n*  such changes described above).



**Example 1:** 

```
Input: cells = [0,1,0,1,1,0,0,1], n = 7
Output: [0,0,1,1,0,0,0,0]
Explanation: The following table summarizes the state of the prison on each day:
Day 0: [0, 1, 0, 1, 1, 0, 0, 1]
Day 1: [0, 1, 1, 0, 0, 0, 0, 0]
Day 2: [0, 0, 0, 0, 1, 1, 1, 0]
Day 3: [0, 1, 1, 0, 0, 1, 0, 0]
Day 4: [0, 0, 0, 0, 0, 1, 0, 0]
Day 5: [0, 1, 1, 1, 0, 1, 0, 0]
Day 6: [0, 0, 1, 0, 1, 1, 0, 0]
Day 7: [0, 0, 1, 1, 0, 0, 0, 0]

```

**Example 2:** 

```
Input: cells = [1,0,0,1,0,0,1,0], n = 1000000000
Output: [0,0,1,1,1,1,1,0]

```



**Constraints:** 

-  *cells.length == 8*  
-  *cells[i]*  is either  *0*  or  *1* . 
-  *1 <= n <= 109* 


# [957. N 天后的牢房][cnTitle]

**中等**

8 间牢房排成一排，每间牢房不是有人住就是空着。

每天，无论牢房是被占用或空置，都会根据以下规则进行更改：

- 如果一间牢房的两个相邻的房间都被占用或都是空的，那么该牢房就会被占用。 
- 否则，它就会被空置。

（请注意，由于监狱中的牢房排成一行，所以行中的第一个和最后一个房间无法有两个相邻的房间。）

我们用以下方式描述监狱的当前状态：如果第  *i*  间牢房被占用，则  *cell[i]==1* ，否则  *cell[i]==0* 。

根据监狱的初始状态，在  *N*  天后返回监狱的状况（和上述 N 种变化）。





**示例 1：** 

```
输入：cells = [0,1,0,1,1,0,0,1], N = 7
输出：[0,0,1,1,0,0,0,0]
解释：下表概述了监狱每天的状况：
Day 0: [0, 1, 0, 1, 1, 0, 0, 1]
Day 1: [0, 1, 1, 0, 0, 0, 0, 0]
Day 2: [0, 0, 0, 0, 1, 1, 1, 0]
Day 3: [0, 1, 1, 0, 0, 1, 0, 0]
Day 4: [0, 0, 0, 0, 0, 1, 0, 0]
Day 5: [0, 1, 1, 1, 0, 1, 0, 0]
Day 6: [0, 0, 1, 0, 1, 1, 0, 0]
Day 7: [0, 0, 1, 1, 0, 0, 0, 0]


```

**示例 2：** 

```
输入：cells = [1,0,0,1,0,0,1,0], N = 1000000000
输出：[0,0,1,1,1,1,1,0]

```



**提示：** 

1.  *cells.length == 8*  
2.  *cells[i]*  的值为  *0*  或  *1*   
3.  *1 <= N <= 10^9* 




# 算法思路

# 测试用例
```
957. Prison Cells After N Days 957. N 天后的牢房 Medium
```

[enTitle]: https://leetcode.com/problems/prison-cells-after-n-days/
[cnTitle]: https://leetcode-cn.com/problems/prison-cells-after-n-days/
