# [1505. Minimum Possible Integer After at Most K Adjacent Swaps On Digits][enTitle]

**Hard**

Given a string  *num*  representing **the digits**  of a very large integer and an integer  *k* .

You are allowed to swap any two adjacent digits of the integer **at most**   *k*  times.

Return  *the minimum integer*  you can obtain also as a string.



**Example 1:** 

![img](https://assets.leetcode.com/uploads/2020/06/17/q4_1.jpg)

```
Input: num = "4321", k = 4
Output: "1342"
Explanation: The steps to obtain the minimum integer from 4321 with 4 adjacent swaps are shown.

```

**Example 2:** 

```
Input: num = "100", k = 1
Output: "010"
Explanation: It's ok for the output to have leading zeros, but the input is guaranteed not to have any leading zeros.

```

**Example 3:** 

```
Input: num = "36789", k = 1000
Output: "36789"
Explanation: We can keep the number without any swaps.

```

**Example 4:** 

```
Input: num = "22", k = 22
Output: "22"

```

**Example 5:** 

```
Input: num = "9438957234785635408", k = 23
Output: "0345989723478563548"

```



**Constraints:** 

-  *1 <= num.length <= 30000*  
-  *num*  contains **digits**  only and doesn't have **leading zeros** . 
-  *1 <= k <= 10^9* 


# [1505. 最多 K 次交换相邻数位后得到的最小整数][cnTitle]

**困难**

给你一个字符串  *num*  和一个整数  *k*  。其中， *num*  表示一个很大的整数，字符串中的每个字符依次对应整数上的各个 **数位**  。

你可以交换这个整数相邻数位的数字 **最多**   *k*  次。

请你返回你能得到的最小整数，并以字符串形式返回。



**示例 1：** 

![img](https://assets.leetcode.com/uploads/2020/06/17/q4_1.jpg)

```
输入：num = "4321", k = 4
输出："1342"
解释：4321 通过 4 次交换相邻数位得到最小整数的步骤如上图所示。

```

**示例 2：** 

```
输入：num = "100", k = 1
输出："010"
解释：输出可以包含前导 0 ，但输入保证不会有前导 0 。

```

**示例 3：** 

```
输入：num = "36789", k = 1000
输出："36789"
解释：不需要做任何交换。

```

**示例 4：** 

```
输入：num = "22", k = 22
输出："22"

```

**示例 5：** 

```
输入：num = "9438957234785635408", k = 23
输出："0345989723478563548"

```



**提示：** 

-  *1 <= num.length <= 30000*  
-  *num*  只包含 **数字**  且不含有**前导 0** 。 
-  *1 <= k <= 10^9* 




# 算法思路

# 测试用例
```
1505. Minimum Possible Integer After at Most K Adjacent Swaps On Digits 1505. 最多 K 次交换相邻数位后得到的最小整数 Hard
```

[enTitle]: https://leetcode.com/problems/minimum-possible-integer-after-at-most-k-adjacent-swaps-on-digits/
[cnTitle]: https://leetcode-cn.com/problems/minimum-possible-integer-after-at-most-k-adjacent-swaps-on-digits/
