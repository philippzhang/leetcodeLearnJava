# [1318. Minimum Flips to Make a OR b Equal to c][enTitle]

**Medium**

Given 3 positives numbers  *a* ,  *b*  and  *c* . Return the minimum flips required in some bits of  *a*  and  *b*  to make (  *a*  OR  *b*  ==  *c*  ). (bitwise OR operation). Flip operation consists of change **any**  single bit 1 to 0 or change the bit 0 to 1 in their binary representation.



**Example 1:** 

![img](https://assets.leetcode.com/uploads/2020/01/06/sample_3_1676.png)

```
Input: a = 2, b = 6, c = 5
Output: 3
Explanation:After flips a = 1 , b = 4 , c = 5 such that (a OR b == c)
```

**Example 2:** 

```
Input: a = 4, b = 2, c = 7
Output: 1

```

**Example 3:** 

```
Input: a = 1, b = 2, c = 3
Output: 0

```



**Constraints:** 

-  *1 <= a <= 10^9*  
-  *1 <= b <= 10^9*  
-  *1 <= c <= 10^9* 


# [1318. 或运算的最小翻转次数][cnTitle]

**中等**

给你三个正整数  *a* 、 *b*  和  *c* 。

你可以对  *a*  和  *b*  的二进制表示进行位翻转操作，返回能够使按位或运算  *a*  OR  *b*  ==  *c*  成立的最小翻转次数。

「位翻转操作」是指将一个数的二进制表示任何单个位上的 1 变成 0 或者 0 变成 1 。



**示例 1：** 

![img](https://assets.leetcode-cn.com/aliyun-lc-upload/uploads/2020/01/11/sample_3_1676.png)

```
输入：a = 2, b = 6, c = 5
输出：3
解释：翻转后 a = 1 , b = 4 , c = 5 使得 a OR b == c
```

**示例 2：** 

```
输入：a = 4, b = 2, c = 7
输出：1

```

**示例 3：** 

```
输入：a = 1, b = 2, c = 3
输出：0

```



**提示：** 

-  *1 <= a <= 10^9*  
-  *1 <= b <= 10^9*  
-  *1 <= c <= 10^9* 




# 算法思路

# 测试用例
```
1318. Minimum Flips to Make a OR b Equal to c 1318. 或运算的最小翻转次数 Medium
```

[enTitle]: https://leetcode.com/problems/minimum-flips-to-make-a-or-b-equal-to-c/
[cnTitle]: https://leetcode-cn.com/problems/minimum-flips-to-make-a-or-b-equal-to-c/
