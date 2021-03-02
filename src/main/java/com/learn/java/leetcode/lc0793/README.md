# [793. Preimage Size of Factorial Zeroes Function][enTitle]

**Hard**

Let  *f(x)*  be the number of zeroes at the end of  *x!* . (Recall that  *x! = 1 * 2 * 3 * ... * x* , and by convention,  *0! = 1* .)

For example,  *f(3) = 0*  because 3! = 6 has no zeroes at the end, while  *f(11) = 2*  because 11! = 39916800 has 2 zeroes at the end. Given  *K* , find how many non-negative integers  *x*  have the property that  *f(x) = K* .

```
Example 1:
Input: K = 0
Output: 5
Explanation: 0!, 1!, 2!, 3!, and 4! end with K = 0 zeroes.

Example 2:
Input: K = 5
Output: 0
Explanation: There is no x such that x! ends in K = 5 zeroes.

```

**Note:** 

-  *K*  will be an integer in the range  *[0, 10^9]* .


# [793. 阶乘函数后 K 个零][cnTitle]

**困难**

 *f(x)*  是  *x!*  末尾是 0 的数量。（回想一下  *x! = 1 * 2 * 3 * ... * x* ，且  *0! = 1*  ）

例如，  *f(3) = 0*  ，因为 3! = 6 的末尾没有 0 ；而  *f(11) = 2*  ，因为 11!= 39916800 末端有 2 个 0 。给定  *K* ，找出多少个非负整数  *x*  ，能满足  *f(x) = K*  。



**示例 1：** **** 

```
输入：K = 0输出：5解释：0!, 1!, 2!, 3!, and 4! 均符合 K = 0 的条件。

```

**示例 2：** 

```
输入：K = 5
输出：0
解释：没有匹配到这样的 x!，符合 K = 5 的条件。
```



**提示：** 

-  K 是范围在 [0, 10^9] 的整数。 




# 算法思路

# 测试用例
```
793. Preimage Size of Factorial Zeroes Function 793. 阶乘函数后 K 个零 Hard
```

[enTitle]: https://leetcode.com/problems/preimage-size-of-factorial-zeroes-function/
[cnTitle]: https://leetcode-cn.com/problems/preimage-size-of-factorial-zeroes-function/
