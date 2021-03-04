# [1386. Cinema Seat Allocation][enTitle]

**Medium**

![img](https://assets.leetcode.com/uploads/2020/02/14/cinema_seats_1.png)

A cinema has  *n*  rows of seats, numbered from 1 to  *n*  and there are ten seats in each row, labelled from 1 to 10 as shown in the figure above.

Given the array  *reservedSeats*  containing the numbers of seats already reserved, for example,  *reservedSeats[i] = [3,8]*  means the seat located in row **3**  and labelled with 8 is already reserved.

 *Return the maximum number of four-person groups you can assign on the cinema seats.*  A four-person group occupies four adjacent seats **in one single row** . Seats across an aisle (such as [3,3] and [3,4]) are not considered to be adjacent, but there is an exceptional case on which an aisle split a four-person group, in that case, the aisle split a four-person group in the middle, which means to have two people on each side.



**Example 1:** 

![img](https://assets.leetcode.com/uploads/2020/02/14/cinema_seats_3.png)

```
Input: n = 3, reservedSeats = [[1,2],[1,3],[1,8],[2,6],[3,1],[3,10]]
Output: 4
Explanation: The figure above shows the optimal allocation for four groups, where seats mark with blue are already reserved and contiguous seats mark with orange are for one group.

```

**Example 2:** 

```
Input: n = 2, reservedSeats = [[2,1],[1,8],[2,6]]
Output: 2

```

**Example 3:** 

```
Input: n = 4, reservedSeats = [[4,3],[1,4],[4,6],[1,7]]
Output: 4

```



**Constraints:** 

-  *1 <= n <= 10^9*  
-  *1 <= reservedSeats.length <= min(10*n, 10^4)*  
-  *reservedSeats[i].length == 2*  
-  *1 <= reservedSeats[i][0] <= n*  
-  *1 <= reservedSeats[i][1] <= 10*  
- All  *reservedSeats[i]*  are distinct.


# [1386. 安排电影院座位][cnTitle]

**中等**

![img](https://assets.leetcode-cn.com/aliyun-lc-upload/uploads/2020/03/21/cinema_seats_1.png)

如上图所示，电影院的观影厅中有  *n*  行座位，行编号从 1 到  *n*  ，且每一行内总共有 10 个座位，列编号从 1 到 10 。

给你数组  *reservedSeats*  ，包含所有已经被预约了的座位。比如说， *researvedSeats[i]=[3,8]*  ，它表示第 **3**  行第 **8**  个座位被预约了。

请你返回 **最多能安排多少个 4 人家庭**  。4 人家庭要占据 **同一行内连续** 的 4 个座位。隔着过道的座位（比方说 [3,3] 和 [3,4]）不是连续的座位，但是如果你可以将 4 人家庭拆成过道两边各坐 2 人，这样子是允许的。



**示例 1：** 

![img](https://assets.leetcode-cn.com/aliyun-lc-upload/uploads/2020/03/21/cinema_seats_3.png)

```
输入：n = 3, reservedSeats = [[1,2],[1,3],[1,8],[2,6],[3,1],[3,10]]
输出：4
解释：上图所示是最优的安排方案，总共可以安排 4 个家庭。蓝色的叉表示被预约的座位，橙色的连续座位表示一个 4 人家庭。

```

**示例 2：** 

```
输入：n = 2, reservedSeats = [[2,1],[1,8],[2,6]]
输出：2

```

**示例 3：** 

```
输入：n = 4, reservedSeats = [[4,3],[1,4],[4,6],[1,7]]
输出：4

```



**提示：** 

-  *1 <= n <= 10^9*  
-  *1 <= reservedSeats.length <= min(10*n, 10^4)*  
-  *reservedSeats[i].length == 2*  
-  *1 <= reservedSeats[i][0] <= n*  
-  *1 <= reservedSeats[i][1] <= 10*  
- 所有  *reservedSeats[i]*  都是互不相同的。




# 算法思路

# 测试用例
```
1386. Cinema Seat Allocation 1386. 安排电影院座位 Medium
```

[enTitle]: https://leetcode.com/problems/cinema-seat-allocation/
[cnTitle]: https://leetcode-cn.com/problems/cinema-seat-allocation/
