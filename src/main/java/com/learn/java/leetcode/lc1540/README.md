# [1540. Can Convert String in K Moves][enTitle]

**Medium**

Given two strings  *s*  and  *t* , your goal is to convert  *s*  into  *t*  in  *k* **** moves or less.

During the  *ith*  (1 <= i <= k)move you can:

- Choose any index  *j*  (1-indexed) from  *s* , such that  *1 <= j <= s.length*  and  *j*  has not been chosen in any previous move, and shift the character at that index  *i*  times. 
- Do nothing.

Shifting a character means replacing it by the next letter in the alphabet (wrapping around so that  *'z'*  becomes  *'a'* ). Shifting a character by  *i*  means applying the shift operations  *i*  times.

Remember that any index  *j*  can be picked at most once.

Return  *true*  if it's possible to convert  *s*  into  *t*  in no more than  *k*  moves, otherwise return  *false* .



**Example 1:** 

```
Input: s = "input", t = "ouput", k = 9
Output: true
Explanation:In the 6th move, we shift 'i' 6 times to get 'o'. And in the 7th move we shift 'n' to get 'u'.

```

**Example 2:** 

```
Input: s = "abc", t = "bcd", k = 10
Output: false
Explanation:We need to shift each character in s one time to convert it into t. We can shift 'a' to 'b' during the 1st move. However, there is no way to shift the other characters in the remaining moves to obtain t from s.

```

**Example 3:** 

```
Input: s = "aab", t = "bbb", k = 27
Output: true
Explanation:In the 1st move, we shift the first 'a' 1 time to get 'b'. In the 27th move, we shift the second 'a' 27 times to get 'b'.

```



**Constraints:** 

-  *1 <= s.length, t.length <= 10^5*  
-  *0 <= k <= 10^9*  
-  *s* ,  *t*  contain only lowercase English letters.


# [1540. K 次操作转变字符串][cnTitle]

**中等**

给你两个字符串  *s*  和  *t*  ，你的目标是在  *k*  次操作以内把字符串  *s*  转变成  *t*  。

在第  *i*  次操作时（ *1 <= i <= k* ），你可以选择进行如下操作：

- 选择字符串  *s*  中满足  *1 <= j <= s.length*  且之前未被选过的任意下标  *j*  （下标从 1 开始），并将此位置的字符切换  *i*  次。 
- 不进行任何操作。

切换 1 次字符的意思是用字母表中该字母的下一个字母替换它（字母表环状接起来，所以  *'z'*  切换后会变成  *'a'* ）。

请记住任意一个下标  *j*  最多只能被操作 1 次。

如果在不超过  *k*  次操作内可以把字符串  *s*  转变成  *t*  ，那么请你返回  *true*  ，否则请你返回  *false*  。



**示例 1：** 

```
输入：s = "input", t = "ouput", k = 9
输出：true
解释：第 6 次操作时，我们将 'i' 切换 6 次得到 'o' 。第 7 次操作时，我们将 'n' 切换 7 次得到 'u' 。

```

**示例 2：** 

```
输入：s = "abc", t = "bcd", k = 10
输出：false
解释：我们需要将每个字符切换 1 次才能得到 t 。我们可以在第 1 次操作时将 'a' 切换成 'b' ，但另外 2 个字母在剩余操作中无法再转变为 t 中对应字母。

```

**示例 3：** 

```
输入：s = "aab", t = "bbb", k = 27
输出：true
解释：第 1 次操作时，我们将第一个 'a' 切换 1 次得到 'b' 。在第 27 次操作时，我们将第二个字母 'a' 切换 27 次得到 'b' 。

```



**提示：** 

-  *1 <= s.length, t.length <= 10^5*  
-  *0 <= k <= 10^9*  
-  *s*  和  *t*  只包含小写英文字母。




# 算法思路

# 测试用例
```
1540. Can Convert String in K Moves 1540. K 次操作转变字符串 Medium
```

[enTitle]: https://leetcode.com/problems/can-convert-string-in-k-moves/
[cnTitle]: https://leetcode-cn.com/problems/can-convert-string-in-k-moves/
