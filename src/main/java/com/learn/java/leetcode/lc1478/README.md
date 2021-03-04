# [1478. Allocate Mailboxes][enTitle]

**Hard**

Given the array  *houses*  and an integer  *k* . where  *houses[i]*  is the location of the ith house along a street, your task is to allocate  *k*  mailboxes in the street.

Return the **minimum**  total distance between each house and its nearest mailbox.

The answer is guaranteed to fit in a 32-bit signed integer.



**Example 1:** 

![img](https://assets.leetcode.com/uploads/2020/05/07/sample_11_1816.png)

```
Input: houses = [1,4,8,10,20], k = 3
Output: 5
Explanation:Allocate mailboxes in position 3, 9 and 20.
Minimum total distance from each houses to nearest mailboxes is |3-1| + |4-3| + |9-8| + |10-9| + |20-20| = 5 

```

**Example 2:** 

![img](https://assets.leetcode.com/uploads/2020/05/07/sample_2_1816.png)

```
Input: houses = [2,3,5,12,18], k = 2
Output: 9
Explanation:Allocate mailboxes in position 3 and 14.
Minimum total distance from each houses to nearest mailboxes is |2-3| + |3-3| + |5-3| + |12-14| + |18-14| = 9.

```

**Example 3:** 

```
Input: houses = [7,4,6,1], k = 1
Output: 8

```

**Example 4:** 

```
Input: houses = [3,6,14,10], k = 4
Output: 0

```



**Constraints:** 

-  *n == houses.length*  
-  *1 <= n <= 100*  
-  *1 <= houses[i] <= 10^4*  
-  *1 <= k <= n*  
- Array  *houses*  contain unique integers.


# [1478. 安排邮筒][cnTitle]

**困难**

给你一个房屋数组 *houses*  和一个整数  *k*  ，其中  *houses[i]*  是第  *i*  栋房子在一条街上的位置，现需要在这条街上安排  *k*  个邮筒。

请你返回每栋房子与离它最近的邮筒之间的距离的 **最小** 总和。

答案保证在 32 位有符号整数范围以内。



**示例 1：** 

![img](https://assets.leetcode-cn.com/aliyun-lc-upload/uploads/2020/06/13/sample_11_1816.png)

```
输入：houses = [1,4,8,10,20], k = 3
输出：5
解释：将邮筒分别安放在位置 3， 9 和 20 处。
每个房子到最近邮筒的距离和为 |3-1| + |4-3| + |9-8| + |10-9| + |20-20| = 5 。

```

**示例 2：** 

![img](https://assets.leetcode-cn.com/aliyun-lc-upload/uploads/2020/06/13/sample_2_1816.png)

```
输入：houses = [2,3,5,12,18], k = 2
输出：9
解释：将邮筒分别安放在位置 3 和 14 处。
每个房子到最近邮筒距离和为 |2-3| + |3-3| + |5-3| + |12-14| + |18-14| = 9 。

```

**示例 3：** 

```
输入：houses = [7,4,6,1], k = 1
输出：8

```

**示例 4：** 

```
输入：houses = [3,6,14,10], k = 4
输出：0

```



**提示：** 

-  *n == houses.length*  
-  *1 <= n <= 100*  
-  *1 <= houses[i] <= 10^4*  
-  *1 <= k <= n*  
- 数组  *houses*  中的整数互不相同。




# 算法思路

# 测试用例
```
1478. Allocate Mailboxes 1478. 安排邮筒 Hard
```

[enTitle]: https://leetcode.com/problems/allocate-mailboxes/
[cnTitle]: https://leetcode-cn.com/problems/allocate-mailboxes/
