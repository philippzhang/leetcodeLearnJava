# [1416. Restore The Array][enTitle]

**Hard**

A program was supposed to print an array of integers. The program forgot to print whitespaces and the array is printed as a string of digits and all we know is that all integers in the array were in the range  *[1, k]*  and there are no leading zeros in the array.

Given the string  *s*  and the integer  *k* . There can be multiple ways to restore the array.

Return  *the number of possible array*  that can be printed as a string  *s*  using the mentioned program.

The number of ways could be very large so return it **modulo**   *10^9 + 7* 



**Example 1:** 

```
Input: s = "1000", k = 10000
Output: 1
Explanation: The only possible array is [1000]

```

**Example 2:** 

```
Input: s = "1000", k = 10
Output: 0
Explanation: There cannot be an array that was printed this way and has all integer >= 1 and <= 10.

```

**Example 3:** 

```
Input: s = "1317", k = 2000
Output: 8
Explanation: Possible arrays are [1317],[131,7],[13,17],[1,317],[13,1,7],[1,31,7],[1,3,17],[1,3,1,7]

```

**Example 4:** 

```
Input: s = "2020", k = 30
Output: 1
Explanation: The only possible array is [20,20]. [2020] is invalid because 2020 > 30. [2,020] is ivalid because 020 contains leading zeros.

```

**Example 5:** 

```
Input: s = "1234567890", k = 90
Output: 34

```



**Constraints:** 

-  *1 <= s.length <= 10^5* . 
-  *s*  consists of only digits and doesn't contain leading zeros. 
-  *1 <= k <= 10^9* .


# [1416. 恢复数组][cnTitle]

**困难**

某个程序本来应该输出一个整数数组。但是这个程序忘记输出空格了以致输出了一个数字字符串，我们所知道的信息只有：数组中所有整数都在  *[1, k]*  之间，且数组中的数字都没有前导 0 。

给你字符串  *s*  和整数  *k*  。可能会有多种不同的数组恢复结果。

按照上述程序，请你返回所有可能输出字符串  *s*  的数组方案数。

由于数组方案数可能会很大，请你返回它对  *10^9 + 7*  **取余**  后的结果。



**示例 1：** 

```
输入：s = "1000", k = 10000
输出：1
解释：唯一一种可能的数组方案是 [1000]

```

**示例 2：** 

```
输入：s = "1000", k = 10
输出：0
解释：不存在任何数组方案满足所有整数都 >= 1 且 <= 10 同时输出结果为 s 。

```

**示例 3：** 

```
输入：s = "1317", k = 2000
输出：8
解释：可行的数组方案为 [1317]，[131,7]，[13,17]，[1,317]，[13,1,7]，[1,31,7]，[1,3,17]，[1,3,1,7]

```

**示例 4：** 

```
输入：s = "2020", k = 30
输出：1
解释：唯一可能的数组方案是 [20,20] 。 [2020] 不是可行的数组方案，原因是 2020 > 30 。 [2,020] 也不是可行的数组方案，因为 020 含有前导 0 。

```

**示例 5：** 

```
输入：s = "1234567890", k = 90
输出：34

```



**提示：** 

-  *1 <= s.length <= 10^5* . 
-  *s*  只包含数字且不包含前导 0 。 
-  *1 <= k <= 10^9* .




# 算法思路

# 测试用例
```
1416. Restore The Array 1416. 恢复数组 Hard
```

[enTitle]: https://leetcode.com/problems/restore-the-array/
[cnTitle]: https://leetcode-cn.com/problems/restore-the-array/
