# [879. Profitable Schemes][enTitle]

**Hard**

There is a group of  *n*  members, and a list of various crimes they could commit. The  *ith*  crime generates a  *profit[i]*  and requires  *group[i]*  members to participate in it. If a member participates in one crime, that member can't participate in another crime.

Let's call a **profitable scheme**  any subset of these crimes that generates at least  *minProfit*  profit, and the total number of members participating in that subset of crimes is at most  *n* .

Return the number of schemes that can be chosen. Since the answer may be very large, **return it modulo**   *109 + 7* .



**Example 1:** 

```
Input: n = 5, minProfit = 3, group = [2,2], profit = [2,3]
Output: 2
Explanation: To make a profit of at least 3, the group could either commit crimes 0 and 1, or just crime 1.
In total, there are 2 schemes.
```

**Example 2:** 

```
Input: n = 10, minProfit = 5, group = [2,3,5], profit = [6,7,8]
Output: 7
Explanation: To make a profit of at least 5, the group could commit any crimes, as long as they commit one.
There are 7 possible schemes: (0), (1), (2), (0,1), (0,2), (1,2), and (0,1,2).
```



**Constraints:** 

-  *1 <= n <= 100*  
-  *0 <= minProfit <= 100*  
-  *1 <= group.length <= 100*  
-  *1 <= group[i] <= 100*  
-  *profit.length == group.length*  
-  *0 <= profit[i] <= 100* 


# [879. 盈利计划][cnTitle]

**困难**

集团里有  *n*  名员工，他们可以完成各种各样的工作创造利润。

第  *i*  种工作会产生  *profit[i]*  的利润，它要求  *group[i]*  名成员共同参与。如果成员参与了其中一项工作，就不能参与另一项工作。

工作的任何至少产生  *minProfit*  利润的子集称为盈利计划。并且工作的成员总数最多为  *n*  。

有多少种计划可以选择？因为答案很大，所以**返回结果模**  *10^9 + 7* **的值** 。





**示例 1：** 

```
输入：n = 5, minProfit = 3, group = [2,2], profit = [2,3]
输出：2
解释：至少产生 3 的利润，该集团可以完成工作 0 和工作 1 ，或仅完成工作 1 。
总的来说，有两种计划。
```

**示例 2：** 

```
输入：n = 10, minProfit = 5, group = [2,3,5], profit = [6,7,8]
输出：7
解释：至少产生 5 的利润，只要完成其中一种工作就行，所以该集团可以完成任何工作。
有 7 种可能的计划：(0)，(1)，(2)，(0,1)，(0,2)，(1,2)，以及 (0,1,2) 。
```







**提示：** 

-  *1 <= n <= 100*  
-  *0 <= minProfit <= 100*  
-  *1 <= group.length <= 100*  
-  *1 <= group[i] <= 100*  
-  *profit.length == group.length*  
-  *0 <= profit[i] <= 100* 




# 算法思路

# 测试用例
```
879. Profitable Schemes 879. 盈利计划 Hard
```

[enTitle]: https://leetcode.com/problems/profitable-schemes/
[cnTitle]: https://leetcode-cn.com/problems/profitable-schemes/
