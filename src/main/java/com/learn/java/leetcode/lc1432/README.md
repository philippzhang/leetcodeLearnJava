# [1432. Max Difference You Can Get From Changing an Integer][enTitle]

**Medium**

You are given an integer  *num* . You will apply the following steps exactly **two**  times:

- Pick a digit  *x (0 <= x <= 9)* . 
- Pick another digit  *y (0 <= y <= 9)* . The digit  *y*  can be equal to  *x* . 
- Replace all the occurrences of  *x*  in the decimal representation of  *num*  by  *y* . 
- The new integer **cannot**  have any leading zeros, also the new integer **cannot**  be 0.

Let  *a*  and  *b*  be the results of applying the operations to  *num*  the first and second times, respectively.

Return  *the max difference*  between  *a*  and  *b* .



**Example 1:** 

```
Input: num = 555
Output: 888
Explanation: The first time pick x = 5 and y = 9 and store the new integer in a.
The second time pick x = 5 and y = 1 and store the new integer in b.
We have now a = 999 and b = 111 and max difference = 888

```

**Example 2:** 

```
Input: num = 9
Output: 8
Explanation: The first time pick x = 9 and y = 9 and store the new integer in a.
The second time pick x = 9 and y = 1 and store the new integer in b.
We have now a = 9 and b = 1 and max difference = 8

```

**Example 3:** 

```
Input: num = 123456
Output: 820000

```

**Example 4:** 

```
Input: num = 10000
Output: 80000

```

**Example 5:** 

```
Input: num = 9288
Output: 8700

```



**Constraints:** 

-  *1 <= num <= 10^8* 


# [1432. 改变一个整数能得到的最大差值][cnTitle]

**中等**

给你一个整数  *num*  。你可以对它进行如下步骤恰好 **两次**  ：

- 选择一个数字  *x (0 <= x <= 9)* . 
- 选择另一个数字  *y (0 <= y <= 9)*  。数字  *y*  可以等于  *x*  。 
- 将  *num*  中所有出现  *x*  的数位都用  *y*  替换。 
- 得到的新的整数 **不能**  有前导 0 ，得到的新整数也 **不能**  是 0 。

令两次对  *num*  的操作得到的结果分别为  *a*  和  *b*  。

请你返回  *a*  和  *b*  的 **最大差值**  。



**示例 1：** 

```
输入：num = 555
输出：888
解释：第一次选择 x = 5 且 y = 9 ，并把得到的新数字保存在 a 中。
第二次选择 x = 5 且 y = 1 ，并把得到的新数字保存在 b 中。
现在，我们有 a = 999 和 b = 111 ，最大差值为 888

```

**示例 2：** 

```
输入：num = 9
输出：8
解释：第一次选择 x = 9 且 y = 9 ，并把得到的新数字保存在 a 中。
第二次选择 x = 9 且 y = 1 ，并把得到的新数字保存在 b 中。
现在，我们有 a = 9 和 b = 1 ，最大差值为 8

```

**示例 3：** 

```
输入：num = 123456
输出：820000

```

**示例 4：** 

```
输入：num = 10000
输出：80000

```

**示例 5：** 

```
输入：num = 9288
输出：8700

```



**提示：** 

-  *1 <= num <= 10^8* 




# 算法思路

# 测试用例
```
1432. Max Difference You Can Get From Changing an Integer 1432. 改变一个整数能得到的最大差值 Medium
```

[enTitle]: https://leetcode.com/problems/max-difference-you-can-get-from-changing-an-integer/
[cnTitle]: https://leetcode-cn.com/problems/max-difference-you-can-get-from-changing-an-integer/
