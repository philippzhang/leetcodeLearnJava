# [1647. Minimum Deletions to Make Character Frequencies Unique][enTitle]

**Medium**

A string  *s*  is called **good**  if there are no two different characters in  *s*  that have the same **frequency** .

Given a string  *s* , return *the minimum number of characters you need to delete to make*  *s*  *good.* 

The **frequency**  of a character in a string is the number of times it appears in the string. For example, in the string  *"aab"* , the **frequency**  of  *'a'*  is  *2* , while the **frequency**  of  *'b'*  is  *1* .



**Example 1:** 

```
Input: s = "aab"
Output: 0
Explanation: s is already good.

```

**Example 2:** 

```
Input: s = "aaabbbcc"
Output: 2
Explanation: You can delete two 'b's resulting in the good string "aaabcc".
Another way it to delete one 'b' and one 'c' resulting in the good string "aaabbc".
```

**Example 3:** 

```
Input: s = "ceabaacb"
Output: 2
Explanation: You can delete both 'c's resulting in the good string "eabaab".
Note that we only care about characters that are still in the string at the end (i.e. frequency of 0 is ignored).

```



**Constraints:** 

-  *1 <= s.length <= 105*  
-  *s*  contains only lowercase English letters.


# [1647. 字符频次唯一的最小删除次数][cnTitle]

**中等**

如果字符串  *s*  中 **不存在**  两个不同字符 **频次**  相同的情况，就称  *s*  是 **优质字符串**  。

给你一个字符串  *s* ，返回使  *s*  成为 **优质字符串**  需要删除的 **最小**  字符数。

字符串中字符的 **频次**  是该字符在字符串中的出现次数。例如，在字符串  *"aab"*  中， *'a'*  的频次是  *2* ，而  *'b'*  的频次是  *1*  。



**示例 1：** 

```
输入：s = "aab"
输出：0
解释：s 已经是优质字符串。

```

**示例 2：** 

```
输入：s = "aaabbbcc"
输出：2
解释：可以删除两个 'b' , 得到优质字符串 "aaabcc" 。
另一种方式是删除一个 'b' 和一个 'c' ，得到优质字符串 "aaabbc" 。
```

**示例 3：** 

```
输入：s = "ceabaacb"
输出：2
解释：可以删除两个 'c' 得到优质字符串 "eabaab" 。
注意，只需要关注结果字符串中仍然存在的字符。（即，频次为 0 的字符会忽略不计。）

```



**提示：** 

-  *1 <= s.length <= 105*  
-  *s*  仅含小写英文字母




# 算法思路

# 测试用例
```
1647. Minimum Deletions to Make Character Frequencies Unique 1647. 字符频次唯一的最小删除次数 Medium
```

[enTitle]: https://leetcode.com/problems/minimum-deletions-to-make-character-frequencies-unique/
[cnTitle]: https://leetcode-cn.com/problems/minimum-deletions-to-make-character-frequencies-unique/
