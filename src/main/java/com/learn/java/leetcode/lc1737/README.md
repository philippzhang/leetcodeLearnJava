# [1737. Change Minimum Characters to Satisfy One of Three Conditions][enTitle]

**Medium**

You are given two strings  *a*  and  *b*  that consist of lowercase letters. In one operation, you can change any character in  *a*  or  *b*  to **any lowercase letter** .

Your goal is to satisfy **one**  of the following three conditions:

- **Every**  letter in  *a*  is **strictly less**  than **every**  letter in  *b*  in the alphabet. 
- **Every**  letter in  *b*  is **strictly less**  than **every**  letter in  *a*  in the alphabet. 
- **Both**   *a*  and  *b*  consist of **only one**  distinct letter.

Return  *the minimum number of operations needed to achieve your goal.* 



**Example 1:** 

```
Input: a = "aba", b = "caa"
Output: 2
Explanation: Consider the best way to make each condition true:
1) Change b to "ccc" in 2 operations, then every letter in a is less than every letter in b.
2) Change a to "bbb" and b to "aaa" in 3 operations, then every letter in b is less than every letter in a.
3) Change a to "aaa" and b to "aaa" in 2 operations, then a and b consist of one distinct letter.
The best way was done in 2 operations (either condition 1 or condition 3).

```

**Example 2:** 

```
Input: a = "dabadd", b = "cda"
Output: 3
Explanation: The best way is to make condition 1 true by changing b to "eee".

```



**Constraints:** 

-  *1 <= a.length, b.length <= 105*  
-  *a*  and  *b*  consist only of lowercase letters.


# [1737. 满足三条件之一需改变的最少字符数][cnTitle]

**中等**

给你两个字符串  *a*  和  *b*  ，二者均由小写字母组成。一步操作中，你可以将  *a*  或  *b*  中的 **任一字符**  改变为 **任一小写字母**  。

操作的最终目标是满足下列三个条件 **之一**  ：

-  *a*  中的 **每个字母**  在字母表中 **严格小于**   *b*  中的 **每个字母**  。 
-  *b*  中的 **每个字母**  在字母表中 **严格小于**   *a*  中的 **每个字母**  。 
-  *a*  和  *b*  **都**  由 **同一个**  字母组成。

返回达成目标所需的 **最少**  操作数 *。* 



**示例 1：** 

```
输入：a = "aba", b = "caa"
输出：2
解释：满足每个条件的最佳方案分别是：
1) 将 b 变为 "ccc"，2 次操作，满足 a 中的每个字母都小于 b 中的每个字母；
2) 将 a 变为 "bbb" 并将 b 变为 "aaa"，3 次操作，满足 b 中的每个字母都小于 a 中的每个字母；
3) 将 a 变为 "aaa" 并将 b 变为 "aaa"，2 次操作，满足 a 和 b 由同一个字母组成。
最佳的方案只需要 2 次操作（满足条件 1 或者条件 3）。

```

**示例 2：** 

```
输入：a = "dabadd", b = "cda"
输出：3
解释：满足条件 1 的最佳方案是将 b 变为 "eee" 。

```



**提示：** 

-  *1 <= a.length, b.length <= 105*  
-  *a*  和  *b*  只由小写字母组成




# 算法思路

# 测试用例
```
1737. Change Minimum Characters to Satisfy One of Three Conditions 1737. 满足三条件之一需改变的最少字符数 Medium
```

[enTitle]: https://leetcode.com/problems/change-minimum-characters-to-satisfy-one-of-three-conditions/
[cnTitle]: https://leetcode-cn.com/problems/change-minimum-characters-to-satisfy-one-of-three-conditions/
