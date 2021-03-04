# [1247. Minimum Swaps to Make Strings Equal][enTitle]

**Medium**

You are given two strings  *s1*  and  *s2*  of equal length consisting of letters  *"x"*  and  *"y"*  **only** . Your task is to make these two strings equal to each other. You can swap any two characters that belong to **different**  strings, which means: swap  *s1[i]*  and  *s2[j]* .

Return the minimum number of swaps required to make  *s1*  and  *s2*  equal, or return  *-1*  if it is impossible to do so.



**Example 1:** 

```
Input: s1 = "xx", s2 = "yy"
Output: 1
Explanation:Swap s1[0] and s2[1], s1 = "yx", s2 = "yx".
```

**Example 2:** 

```
Input: s1 = "xy", s2 = "yx"
Output: 2
Explanation:Swap s1[0] and s2[0], s1 = "yy", s2 = "xx".
Swap s1[0] and s2[1], s1 = "xy", s2 = "xy".
Note that you can't swap s1[0] and s1[1] to make s1 equal to "yx", cause we can only swap chars in different strings.
```

**Example 3:** 

```
Input: s1 = "xx", s2 = "xy"
Output: -1

```

**Example 4:** 

```
Input: s1 = "xxyyxyxyxx", s2 = "xyyxyxxxyx"
Output: 4

```



**Constraints:** 

-  *1 <= s1.length, s2.length <= 1000*  
-  *s1, s2*  only contain  *'x'*  or  *'y'* .


# [1247. 交换字符使得字符串相同][cnTitle]

**中等**

有两个长度相同的字符串  *s1*  和  *s2* ，且它们其中 **只含有**  字符  *"x"*  和  *"y"* ，你需要通过「交换字符」的方式使这两个字符串相同。

每次「交换字符」的时候，你都可以在两个字符串中各选一个字符进行交换。

交换只能发生在两个不同的字符串之间，绝对不能发生在同一个字符串内部。也就是说，我们可以交换  *s1[i]*  和  *s2[j]* ，但不能交换  *s1[i]*  和  *s1[j]* 。

最后，请你返回使  *s1*  和  *s2*  相同的最小交换次数，如果没有方法能够使得这两个字符串相同，则返回  *-1*  。



**示例 1：** 

```
输入：s1 = "xx", s2 = "yy"
输出：1
解释：交换 s1[0] 和 s2[1]，得到 s1 = "yx"，s2 = "yx"。
```

**示例 2：** 

```
输入：s1 = "xy", s2 = "yx"
输出：2
解释：交换 s1[0] 和 s2[0]，得到 s1 = "yy"，s2 = "xx" 。
交换 s1[0] 和 s2[1]，得到 s1 = "xy"，s2 = "xy" 。
注意，你不能交换 s1[0] 和 s1[1] 使得 s1 变成 "yx"，因为我们只能交换属于两个不同字符串的字符。
```

**示例 3：** 

```
输入：s1 = "xx", s2 = "xy"
输出：-1

```

**示例 4：** 

```
输入：s1 = "xxyyxyxyxx", s2 = "xyyxyxxxyx"
输出：4

```



**提示：** 

-  *1 <= s1.length, s2.length <= 1000*  
-  *s1, s2*  只包含  *'x'*  或  *'y'* 。




# 算法思路

# 测试用例
```
1247. Minimum Swaps to Make Strings Equal 1247. 交换字符使得字符串相同 Medium
```

[enTitle]: https://leetcode.com/problems/minimum-swaps-to-make-strings-equal/
[cnTitle]: https://leetcode-cn.com/problems/minimum-swaps-to-make-strings-equal/
