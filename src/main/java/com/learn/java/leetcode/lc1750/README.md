# [1750. Minimum Length of String After Deleting Similar Ends][enTitle]

**Medium**

Given a string  *s*  consisting only of characters  *'a'* ,  *'b'* , and  *'c'* . You are asked to apply the following algorithm on the string any number of times:

1. Pick a **non-empty**  prefix from the string  *s*  where all the characters in the prefix are equal. 
2. Pick a **non-empty**  suffix from the string  *s*  where all the characters in this suffix are equal. 
3. The prefix and the suffix should not intersect at any index. 
4. The characters from the prefix and suffix must be the same. 
5. Delete both the prefix and the suffix.

Return  *the minimum length of*  *s*   *after performing the above operation any number of times (possibly zero times)* .



**Example 1:** 

```
Input: s = "ca"
Output: 2
Explanation:You can't remove any characters, so the string stays as is.

```

**Example 2:** 

```
Input: s = "cabaabac"
Output: 0
Explanation: An optimal sequence of operations is:
- Take prefix = "c" and suffix = "c" and remove them, s = "abaaba".
- Take prefix = "a" and suffix = "a" and remove them, s = "baab".
- Take prefix = "b" and suffix = "b" and remove them, s = "aa".
- Take prefix = "a" and suffix = "a" and remove them, s = "".
```

**Example 3:** 

```
Input: s = "aabccabba"
Output: 3
Explanation: An optimal sequence of operations is:
- Take prefix = "aa" and suffix = "a" and remove them, s = "bccabb".
- Take prefix = "b" and suffix = "bb" and remove them, s = "cca".

```



**Constraints:** 

-  *1 <= s.length <= 105*  
-  *s*  only consists of characters  *'a'* ,  *'b'* , and  *'c'* .


# [1750. 删除字符串两端相同字符后的最短长度][cnTitle]

**中等**

给你一个只包含字符  *'a'* ， *'b'*  和  *'c'*  的字符串  *s*  ，你可以执行下面这个操作（5 个步骤）任意次：

1. 选择字符串  *s*  一个 **非空**  的前缀，这个前缀的所有字符都相同。 
2. 选择字符串  *s*  一个 **非空**  的后缀，这个后缀的所有字符都相同。 
3. 前缀和后缀在字符串中任意位置都不能有交集。 
4. 前缀和后缀包含的所有字符都要相同。 
5. 同时删除前缀和后缀。

请你返回对字符串  *s*  执行上面操作任意次以后（可能 0 次），能得到的 **最短长度**  。



**示例 1：** 

```
输入：s = "ca"
输出：2
解释：你没法删除任何一个字符，所以字符串长度仍然保持不变。

```

**示例 2：** 

```
输入：s = "cabaabac"
输出：0
解释：最优操作序列为：
- 选择前缀 "c" 和后缀 "c" 并删除它们，得到 s = "abaaba" 。
- 选择前缀 "a" 和后缀 "a" 并删除它们，得到 s = "baab" 。
- 选择前缀 "b" 和后缀 "b" 并删除它们，得到 s = "aa" 。
- 选择前缀 "a" 和后缀 "a" 并删除它们，得到 s = "" 。
```

**示例 3：** 

```
输入：s = "aabccabba"
输出：3
解释：最优操作序列为：
- 选择前缀 "aa" 和后缀 "a" 并删除它们，得到 s = "bccabb" 。
- 选择前缀 "b" 和后缀 "bb" 并删除它们，得到 s = "cca" 。

```



**提示：** 

-  *1 <= s.length <= 105*  
-  *s*  只包含字符  *'a'* ， *'b'*  和  *'c'*  。




# 算法思路

# 测试用例
```
1750. Minimum Length of String After Deleting Similar Ends 1750. 删除字符串两端相同字符后的最短长度 Medium
```

[enTitle]: https://leetcode.com/problems/minimum-length-of-string-after-deleting-similar-ends/
[cnTitle]: https://leetcode-cn.com/problems/minimum-length-of-string-after-deleting-similar-ends/
