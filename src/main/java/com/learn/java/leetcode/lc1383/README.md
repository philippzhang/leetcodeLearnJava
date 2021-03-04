# [1383. Maximum Performance of a Team][enTitle]

**Hard**

There are  *n*  engineers numbered from 1 to  *n*  and two arrays:  *speed*  and  *efficiency* , where  *speed[i]*  and  *efficiency[i]*  represent the speed and efficiency for the i-th engineer respectively.  *Return the maximum performance of a team composed of at most k engineers, since the answer can be a huge number, return this modulo 10^9 + 7.* 

The **performance**  of a team is the sum of their engineers' speeds multiplied by the minimum efficiency among their engineers.



**Example 1:** 

```
Input: n = 6, speed = [2,10,3,1,5,8], efficiency = [5,4,3,9,7,2], k = 2
Output: 60
Explanation: 
We have the maximum performance of the team by selecting engineer 2 (with speed=10 and efficiency=4) and engineer 5 (with speed=5 and efficiency=7). That is, performance = (10 + 5) * min(4, 7) = 60.

```

**Example 2:** 

```
Input: n = 6, speed = [2,10,3,1,5,8], efficiency = [5,4,3,9,7,2], k = 3
Output: 68
Explanation:This is the same example as the first but k = 3. We can select engineer 1, engineer 2 and engineer 5 to get the maximum performance of the team. That is, performance = (2 + 10 + 5) * min(5, 4, 7) = 68.

```

**Example 3:** 

```
Input: n = 6, speed = [2,10,3,1,5,8], efficiency = [5,4,3,9,7,2], k = 4
Output: 72

```



**Constraints:** 

-  *1 <= n <= 10^5*  
-  *speed.length == n*  
-  *efficiency.length == n*  
-  *1 <= speed[i] <= 10^5*  
-  *1 <= efficiency[i] <= 10^8*  
-  *1 <= k <= n* 


# [1383. 最大的团队表现值][cnTitle]

**困难**

公司有编号为  *1*  到  *n*  的  *n*  个工程师，给你两个数组  *speed*  和  *efficiency*  ，其中  *speed[i]*  和  *efficiency[i]*  分别代表第  *i*  位工程师的速度和效率。请你返回由最多  *k*  个工程师组成的 **最大团队表现值**  ，由于答案可能很大，请你返回结果对  *10^9 + 7*  取余后的结果。

**团队表现值**  的定义为：一个团队中「所有工程师速度的和」乘以他们「效率值中的最小值」。



**示例 1：** 

```
输入：n = 6, speed = [2,10,3,1,5,8], efficiency = [5,4,3,9,7,2], k = 2
输出：60
解释：
我们选择工程师 2（speed=10 且 efficiency=4）和工程师 5（speed=5 且 efficiency=7）。他们的团队表现值为 performance = (10 + 5) * min(4, 7) = 60 。

```

**示例 2：** 

```
输入：n = 6, speed = [2,10,3,1,5,8], efficiency = [5,4,3,9,7,2], k = 3
输出：68
解释：此示例与第一个示例相同，除了 k = 3 。我们可以选择工程师 1 ，工程师 2 和工程师 5 得到最大的团队表现值。表现值为 performance = (2 + 10 + 5) * min(5, 4, 7) = 68 。

```

**示例 3：** 

```
输入：n = 6, speed = [2,10,3,1,5,8], efficiency = [5,4,3,9,7,2], k = 4
输出：72

```



**提示：** 

-  *1 <= n <= 10^5*  
-  *speed.length == n*  
-  *efficiency.length == n*  
-  *1 <= speed[i] <= 10^5*  
-  *1 <= efficiency[i] <= 10^8*  
-  *1 <= k <= n* 




# 算法思路

# 测试用例
```
1383. Maximum Performance of a Team 1383. 最大的团队表现值 Hard
```

[enTitle]: https://leetcode.com/problems/maximum-performance-of-a-team/
[cnTitle]: https://leetcode-cn.com/problems/maximum-performance-of-a-team/
