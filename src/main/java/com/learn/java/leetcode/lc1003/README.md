# [1003. Check If Word Is Valid After Substitutions][enTitle]

**Medium**

We are given that the string  *"abc"*  is valid.

From any valid string  *V* , we may split  *V*  into two pieces  *X*  and  *Y*  such that  *X + Y*  ( *X*  concatenated with  *Y* ) is equal to  *V* . ( *X*  or  *Y*  may be empty.) Then,  *X + "abc" + Y*  is also valid.

If for example  *S = "abc"* , then examples of valid strings are:  *"abc", "aabcbc", "abcabc", "abcabcababcc"* . Examples of **invalid**  strings are:  *"abccba"* ,  *"ab"* ,  *"cababc"* ,  *"bac"* .

Return  *true*  if and only if the given string  *S*  is valid.



**Example 1:** 

```
Input:"aabcbc"
Output: true
Explanation: 
We start with the valid string "abc".
Then we can insert another "abc" between "a" and "bc", resulting in "a" + "abc" + "bc" which is "aabcbc".
```


**Example 2:** 

```
Input:"abcabcababcc"
Output: true
Explanation: 
"abcabcabc" is valid after consecutive insertings of "abc".
Then we can insert "abc" before the last letter, resulting in "abcabcab" + "abc" + "c" which is "abcabcababcc".
```


**Example 3:** 

```
Input:"abccba"
Output: false
```


**Example 4:** 

```
Input:"cababc"
Output: false
```









**Note:** 

1.  *1 <= S.length <= 20000*  
2.  *S[i]*  is  *'a'* ,  *'b'* , or  *'c'* 














# [1003. 检查替换后的词是否有效][cnTitle]

**中等**

给定有效字符串  *"abc"* 。

对于任何有效的字符串  *V* ，我们可以将  *V*  分成两个部分  *X*  和  *Y* ，使得  *X + Y* （ *X*  与  *Y*  连接）等于  *V* 。（ *X*  或  *Y*  可以为空。）那么， *X + "abc" + Y*  也同样是有效的。

例如，如果  *S = "abc"* ，则有效字符串的示例是： *"abc"* ， *"aabcbc"* ， *"abcabc"* ， *"abcabcababcc"* 。**无效** 字符串的示例是： *"abccba"* ， *"ab"* ， *"cababc"* ， *"bac"* 。

如果给定字符串  *S*  有效，则返回  *true* ；否则，返回  *false* 。



**示例 1：** 

```
输入："aabcbc"
输出：true
解释：
从有效字符串 "abc" 开始。
然后我们可以在 "a" 和 "bc" 之间插入另一个 "abc"，产生 "a" + "abc" + "bc"，即 "aabcbc"。

```

**示例 2：** 

```
输入："abcabcababcc"
输出：true
解释：
"abcabcabc" 是有效的，它可以视作在原串后连续插入 "abc"。
然后我们可以在最后一个字母之前插入 "abc"，产生 "abcabcab" + "abc" + "c"，即 "abcabcababcc"。

```

**示例 3：** 

```
输入："abccba"
输出：false

```

**示例 4：** 

```
输入："cababc"
输出：false
```



**提示：** 

1.  *1 <= S.length <= 20000*  
2.  *S[i]*  为  *'a'* 、 *'b'* 、或  *'c'* 






# 算法思路

# 测试用例
```
1003. Check If Word Is Valid After Substitutions 1003. 检查替换后的词是否有效 Medium
Solution.isValid
---
"aabcbc"

=true
---
"abcabcababcc"

=true
---
"abccba"

=false
---
"cababc"

=false
```

[enTitle]: https://leetcode.com/problems/check-if-word-is-valid-after-substitutions/
[cnTitle]: https://leetcode-cn.com/problems/check-if-word-is-valid-after-substitutions/
