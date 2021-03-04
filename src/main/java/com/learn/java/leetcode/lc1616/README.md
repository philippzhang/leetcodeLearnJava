# [1616. Split Two Strings to Make Palindrome][enTitle]

**Medium**

You are given two strings  *a*  and  *b*  of the same length. Choose an index and split both strings **at the same index** , splitting  *a*  into two strings:  *aprefix*  and  *asuffix*  where  *a = aprefix + asuffix* , and splitting  *b*  into two strings:  *bprefix*  and  *bsuffix*  where  *b = bprefix + bsuffix* . Check if  *aprefix + bsuffix*  or  *bprefix + asuffix*  forms a palindrome.

When you split a string  *s*  into  *sprefix*  and  *ssuffix* , either  *ssuffix*  or  *sprefix*  is allowed to be empty. For example, if  *s = "abc"* , then  *"" + "abc"* ,  *"a" + "bc"* ,  *"ab" + "c"*  , and  *"abc" + ""*  are valid splits.

Return  *true*  *if it is possible to form*  *a palindrome string, otherwise return*  *false* .

**Notice**  that  *x + y*  denotes the concatenation of strings  *x*  and  *y* .



**Example 1:** 


<pre><strong>Input:</strong> a = "x", b = "y"
<strong>Output:</strong> true
<strong>Explaination:</strong> If either a or b are palindromes the answer is true since you can split in the following way:
a<sub>prefix</sub> = "", a<sub>suffix</sub> = "x"
b<sub>prefix</sub> = "", b<sub>suffix</sub> = "y"
Then, a<sub>prefix</sub> + b<sub>suffix</sub> = "" + "y" = "y", which is a palindrome.
</pre>

**Example 2:** 

```
Input: a = "abdef", b = "fecab"
Output: true

```

**Example 3:** 


<pre><strong>Input:</strong> a = "ulacfd", b = "jizalu"
<strong>Output:</strong> true
<strong>Explaination:</strong> Split them at index 3:
a<sub>prefix</sub> = "ula", a<sub>suffix</sub> = "cfd"
b<sub>prefix</sub> = "jiz", b<sub>suffix</sub> = "alu"
Then, a<sub>prefix</sub> + b<sub>suffix</sub> = "ula" + "alu" = "ulaalu", which is a palindrome.
</pre>

**Example 4:** 

```
Input: a = "xbdef", b = "xecab"
Output: false

```



**Constraints:** 

-  *1 <= a.length, b.length <= 105*  
-  *a.length == b.length*  
-  *a*  and  *b*  consist of lowercase English letters


# [1616. 分割两个字符串得到回文串][cnTitle]

**中等**

给你两个字符串  *a*  和  *b*  ，它们长度相同。请你选择一个下标，将两个字符串都在 **相同的下标** 分割开。由  *a*  可以得到两个字符串：  *aprefix*  和  *asuffix*  ，满足  *a = aprefix + asuffix* <sub> </sub>，同理，由  *b*  可以得到两个字符串  *bprefix*  和  *bsuffix*  ，满足  *b = bprefix + bsuffix*  。请你判断  *aprefix + bsuffix*  或者  *bprefix + asuffix*  能否构成回文串。

当你将一个字符串  *s*  分割成  *sprefix*  和  *ssuffix*  时，  *ssuffix*  或者  *sprefix*  可以为空。比方说，  *s = "abc"*  那么  *"" + "abc"*  ，  *"a" + "bc"* ，  *"ab" + "c"*  和  *"abc" + ""*  都是合法分割。

如果 **能构成回文字符串**  ，那么请返回  *true* ，否则返回 *false*  。

**注意** ，  *x + y*  表示连接字符串  *x*  和  *y*  。



**示例 1：** 


<pre><b>输入：</b>a = "x", b = "y"
<b>输出：</b>true
<b>解释：</b>如果 a 或者 b 是回文串，那么答案一定为 true ，因为你可以如下分割：
a<sub>prefix</sub> = "", a<sub>suffix</sub> = "x"
b<sub>prefix</sub> = "", b<sub>suffix</sub> = "y"
那么 a<sub>prefix</sub> + b<sub>suffix</sub> = "" + "y" = "y" 是回文串。
</pre>

**示例 2：** 

```
输入：a = "abdef", b = "fecab"
输出：true

```

**示例 3：** 


<pre><b>输入：</b>a = "ulacfd", b = "jizalu"
<b>输出：</b>true
<b>解释：</b>在下标为 3 处分割：
a<sub>prefix</sub> = "ula", a<sub>suffix</sub> = "cfd"
b<sub>prefix</sub> = "jiz", b<sub>suffix</sub> = "alu"
那么 a<sub>prefix</sub> + b<sub>suffix</sub> = "ula" + "alu" = "ulaalu" 是回文串。</pre>

**示例 4：** 

```
输入：a = "xbdef", b = "xecab"
输出：false

```



**提示：** 

-  *1 <= a.length, b.length <= 105*  
-  *a.length == b.length*  
-  *a*  和  *b*  都只包含小写英文字母




# 算法思路

# 测试用例
```
1616. Split Two Strings to Make Palindrome 1616. 分割两个字符串得到回文串 Medium
```

[enTitle]: https://leetcode.com/problems/split-two-strings-to-make-palindrome/
[cnTitle]: https://leetcode-cn.com/problems/split-two-strings-to-make-palindrome/
