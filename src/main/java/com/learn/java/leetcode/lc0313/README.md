# [313. Super Ugly Number][enTitle]

**Medium**

Write a program to find the  *nth*  super ugly number.

Super ugly numbers are positive numbers whose all prime factors are in the given prime list  *primes*  of size  *k* .

Example:

```
Input: n = 12, primes = [2,7,13,19]
Output: 32 
Explanation:[1,2,4,7,8,13,14,16,19,26,28,32]is the sequence of the first 12 
             super ugly numbers given primes = [2,7,13,19] of size 4.
```

Note:

-  *1*  is a super ugly number for any given  *primes* . 
- The given numbers in  *primes*  are in ascending order. 
- 0 <  *k*  ≤ 100, 0 <  *n*  ≤ 10<sup>6</sup>, 0 <  *primes[i]*  < 1000. 
- The n<sup>th</sup> super ugly number is guaranteed to fit in a 32-bit signed integer.


# [313. 超级丑数][cnTitle]

**中等**

编写一段程序来查找第  *n*  个超级丑数。

超级丑数是指其所有质因数都是长度为  *k*  的质数列表  *primes*  中的正整数。

**示例:** 

```
输入: n = 12, primes = [2,7,13,19]
输出: 32 
解释:给定长度为 4 的质数列表 primes = [2,7,13,19]，前 12 个超级丑数序列为：[1,2,4,7,8,13,14,16,19,26,28,32] 。
```

**说明:** 

-  *1*  是任何给定  *primes*  的超级丑数。 
-  给定  *primes*  中的数字以升序排列。 
- 0 <  *k*  ≤ 100, 0 <  *n*  ≤ 10<sup>6</sup>, 0 <  *primes[i]*  < 1000 。 
- 第  *n*  个超级丑数确保在 32 位有符整数范围内。




# 算法思路

# 测试用例
```
313. Super Ugly Number 313. 超级丑数 Medium
Solution.nthSuperUglyNumber
---
12
[2,7,13,19]

=32
---
15
[3,5,7,11,19,23,29,41,43,47]

=35
```

[enTitle]: https://leetcode.com/problems/super-ugly-number/
[cnTitle]: https://leetcode-cn.com/problems/super-ugly-number/
