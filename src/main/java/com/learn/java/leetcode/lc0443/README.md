# [443. String Compression][enTitle]

**Medium**

Given an array of characters  *chars* , compress it using the following algorithm:

Begin with an empty string  *s* . For each group of **consecutive repeating characters**  in  *chars* :

- If the group's length is 1, append the character to  *s* . 
- Otherwise, append the character followed by the group's length.

The compressed string  *s*  **should not be returned separately** , but instead be stored **in the input character array chars** . Note that group lengths that are 10 or longer will be split into multiple characters in  *chars* .

After you are done modifying the input array, return  *the new length of the array* .

Follow up: Could you solve it using only  *O(1)*  extra space?



**Example 1:** 

```
Input: chars = ["a","a","b","b","c","c","c"]
Output: Return 6, and the first 6 characters of the input array should be: ["a","2","b","2","c","3"]
Explanation: The groups are "aa", "bb", and "ccc". This compresses to "a2b2c3".

```

**Example 2:** 

```
Input: chars = ["a"]
Output: Return 1, and the first character of the input array should be: ["a"]
Explanation: The only group is "a", which remains uncompressed since it's a single character.

```

**Example 3:** 

```
Input: chars = ["a","b","b","b","b","b","b","b","b","b","b","b","b"]
Output: Return 4, and the first 4 characters of the input array should be: ["a","b","1","2"].
Explanation: The groups are "a" and "bbbbbbbbbbbb". This compresses to "ab12".
```

**Example 4:** 

```
Input: chars = ["a","a","a","b","b","a","a"]
Output: Return 6, and the first 6 characters of the input array should be: ["a","3","b","2","a","2"].
Explanation: The groups are "aaa", "bb", and "aa". This compresses to "a3b2a2". Note that each group is independent even if two groups have the same character.

```



**Constraints:** 

-  *1 <= chars.length <= 2000*  
-  *chars[i]*  is a lower-case English letter, upper-case English letter, digit, or symbol.


# [443. 压缩字符串][cnTitle]

**中等**

给定一组字符，使用原地算法将其压缩。

压缩后的长度必须始终小于或等于原数组长度。

数组的每个元素应该是长度为1 的**字符** （不是 int 整数类型）。

在完成原地**修改输入数组** 后，返回数组的新长度。



**进阶：**  你能否仅使用O(1) 空间解决问题？



**示例 1：** 

```
输入：
["a","a","b","b","c","c","c"]

输出：
返回 6 ，输入数组的前 6 个字符应该是：["a","2","b","2","c","3"]

说明：
"aa" 被 "a2" 替代。"bb" 被 "b2" 替代。"ccc" 被 "c3" 替代。

```

**示例 2：** 

```
输入：
["a"]

输出：
返回 1 ，输入数组的前 1 个字符应该是：["a"]

解释：
没有任何字符串被替代。

```

**示例 3：** 

```
输入：
["a","b","b","b","b","b","b","b","b","b","b","b","b"]

输出：
返回 4 ，输入数组的前4个字符应该是：["a","b","1","2"]。

解释：
由于字符 "a" 不重复，所以不会被压缩。"bbbbbbbbbbbb" 被 “b12” 替代。
注意每个数字在数组中都有它自己的位置。

```



**提示：** 

- 所有字符都有一个ASCII值在 *[35, 126]* 区间内。 
-  *1 <= len(chars) <= 1000* 。




# 算法思路

# 测试用例
```
443. String Compression 443. 压缩字符串 Medium
```

[enTitle]: https://leetcode.com/problems/string-compression/
[cnTitle]: https://leetcode-cn.com/problems/string-compression/
