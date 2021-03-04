# [1611. Minimum One Bit Operations to Make Integers Zero][enTitle]

**Hard**

Given an integer  *n* , you must transform it into  *0*  using the following operations any number of times:

- Change the rightmost ( *0th* ) bit in the binary representation of  *n* . 
- Change the  *ith*  bit in the binary representation of  *n*  if the  *(i-1)th*  bit is set to  *1*  and the  *(i-2)th*  through  *0th*  bits are set to  *0* .

Return  *the minimum number of operations to transform*  *n*  *into*  *0*  *.* 



**Example 1:** 

```
Input: n = 0
Output: 0

```

**Example 2:** 

```
Input: n = 3
Output: 2
Explanation: The binary representation of 3 is "11".
"11" -> "01" with the 2nd operation since the 0th bit is 1.
"01" -> "00" with the 1st operation.

```

**Example 3:** 

```
Input: n = 6
Output: 4
Explanation: The binary representation of 6 is "110".
"110" -> "010" with the 2nd operation since the 1st bit is 1 and 0th through 0th bits are 0.
"010" -> "011" with the 1st operation.
"011" -> "001" with the 2nd operation since the 0th bit is 1.
"001" -> "000" with the 1st operation.

```

**Example 4:** 

```
Input: n = 9
Output: 14

```

**Example 5:** 

```
Input: n = 333
Output: 393

```



**Constraints:** 

-  *0 <= n <= 109* 


# [1611. 使整数变为 0 的最少操作次数][cnTitle]

**困难**

给你一个整数  *n* ，你需要重复执行多次下述操作将其转换为  *0*  ：

- 翻转  *n*  的二进制表示中最右侧位（第  *0*  位）。 
- 如果第  *(i-1)*  位为  *1*  且从第  *(i-2)*  位到第  *0*  位都为  *0* ，则翻转  *n*  的二进制表示中的第  *i*  位。

返回将  *n*  转换为  *0*  的最小操作次数。



**示例 1：** 

```
输入：n = 0
输出：0

```

**示例 2：** 

```
输入：n = 3
输出：2
解释：3 的二进制表示为 "11"
"11" -> "01" ，执行的是第 2 种操作，因为第 0 位为 1 。
"01" -> "00" ，执行的是第 1 种操作。

```

**示例 3：** 

```
输入：n = 6
输出：4
解释：6 的二进制表示为 "110".
"110" -> "010" ，执行的是第 2 种操作，因为第 1 位为 1 ，第 0 到 0 位为 0 。
"010" -> "011" ，执行的是第 1 种操作。
"011" -> "001" ，执行的是第 2 种操作，因为第 0 位为 1 。
"001" -> "000" ，执行的是第 1 种操作。

```

**示例 4：** 

```
输入：n = 9
输出：14

```

**示例 5：** 

```
输入：n = 333
输出：393

```



**提示：** 

-  *0 <= n <= 109* 




# 算法思路

# 测试用例
```
1611. Minimum One Bit Operations to Make Integers Zero 1611. 使整数变为 0 的最少操作次数 Hard
```

[enTitle]: https://leetcode.com/problems/minimum-one-bit-operations-to-make-integers-zero/
[cnTitle]: https://leetcode-cn.com/problems/minimum-one-bit-operations-to-make-integers-zero/
