# [1326. Minimum Number of Taps to Open to Water a Garden][enTitle]

**Hard**

There is a one-dimensional garden on the x-axis. The garden starts at the point  *0*  and ends at the point  *n* . (i.e The length of the garden is  *n* ).

There are  *n + 1*  taps located at points  *[0, 1, ..., n]*  in the garden.

Given an integer  *n*  and an integer array  *ranges*  of length  *n + 1*  where  *ranges[i]*  (0-indexed) means the  *i-th*  tap can water the area  *[i - ranges[i], i + ranges[i]]*  if it was open.

Return  *the minimum number of taps*  that should be open to water the whole garden, If the garden cannot be watered return **-1** .



**Example 1:** 

![img](https://assets.leetcode.com/uploads/2020/01/16/1685_example_1.png)

```
Input: n = 5, ranges = [3,4,1,1,0,0]
Output: 1
Explanation: The tap at point 0 can cover the interval [-3,3]
The tap at point 1 can cover the interval [-3,5]
The tap at point 2 can cover the interval [1,3]
The tap at point 3 can cover the interval [2,4]
The tap at point 4 can cover the interval [4,4]
The tap at point 5 can cover the interval [5,5]
Opening Only the second tap will water the whole garden [0,5]

```

**Example 2:** 

```
Input: n = 3, ranges = [0,0,0,0]
Output: -1
Explanation: Even if you activate all the four taps you cannot water the whole garden.

```

**Example 3:** 

```
Input: n = 7, ranges = [1,2,1,0,2,1,0,1]
Output: 3

```

**Example 4:** 

```
Input: n = 8, ranges = [4,0,0,0,0,0,0,0,4]
Output: 2

```

**Example 5:** 

```
Input: n = 8, ranges = [4,0,0,0,4,0,0,0,4]
Output: 1

```



**Constraints:** 

-  *1 <= n <= 10^4*  
-  *ranges.length == n + 1*  
-  *0 <= ranges[i] <= 100* 


# [1326. 灌溉花园的最少水龙头数目][cnTitle]

**困难**

在 x 轴上有一个一维的花园。花园长度为  *n* ，从点  *0*  开始，到点  *n*  结束。

花园里总共有  *n + 1*  个水龙头，分别位于  *[0, 1, ..., n]*  。

给你一个整数  *n*  和一个长度为  *n + 1*  的整数数组  *ranges*  ，其中  *ranges[i]*  （下标从 0 开始）表示：如果打开点  *i*  处的水龙头，可以灌溉的区域为  *[i - ranges[i], i + ranges[i]]*  。

请你返回可以灌溉整个花园的 **最少水龙头数目**  。如果花园始终存在无法灌溉到的地方，请你返回 **-1**  。



**示例 1：** 

![img](https://assets.leetcode-cn.com/aliyun-lc-upload/uploads/2020/01/19/1685_example_1.png)

```
输入：n = 5, ranges = [3,4,1,1,0,0]
输出：1
解释：点 0 处的水龙头可以灌溉区间 [-3,3]
点 1 处的水龙头可以灌溉区间 [-3,5]
点 2 处的水龙头可以灌溉区间 [1,3]
点 3 处的水龙头可以灌溉区间 [2,4]
点 4 处的水龙头可以灌溉区间 [4,4]
点 5 处的水龙头可以灌溉区间 [5,5]
只需要打开点 1 处的水龙头即可灌溉整个花园 [0,5] 。

```

**示例 2：** 

```
输入：n = 3, ranges = [0,0,0,0]
输出：-1
解释：即使打开所有水龙头，你也无法灌溉整个花园。

```

**示例 3：** 

```
输入：n = 7, ranges = [1,2,1,0,2,1,0,1]
输出：3

```

**示例 4：** 

```
输入：n = 8, ranges = [4,0,0,0,0,0,0,0,4]
输出：2

```

**示例 5：** 

```
输入：n = 8, ranges = [4,0,0,0,4,0,0,0,4]
输出：1

```



**提示：** 

-  *1 <= n <= 10^4*  
-  *ranges.length == n + 1*  
-  *0 <= ranges[i] <= 100* 




# 算法思路

# 测试用例
```
1326. Minimum Number of Taps to Open to Water a Garden 1326. 灌溉花园的最少水龙头数目 Hard
```

[enTitle]: https://leetcode.com/problems/minimum-number-of-taps-to-open-to-water-a-garden/
[cnTitle]: https://leetcode-cn.com/problems/minimum-number-of-taps-to-open-to-water-a-garden/
