# [1202. Smallest String With Swaps][enTitle]

**Medium**

You are given a string  *s* , and an array of pairs of indices in the string  *pairs*  where  *pairs[i] = [a, b]*  indicates 2 indices(0-indexed) of the string.

You can swap the characters at any pair of indices in the given  *pairs*  **any number of times** .

Return the lexicographically smallest string that  *s*  can be changed to after using the swaps.



**Example 1:** 

```
Input: s = "dcab", pairs = [[0,3],[1,2]]
Output: "bacd"
Explaination: 
Swap s[0] and s[3], s = "bcad"
Swap s[1] and s[2], s = "bacd"

```

**Example 2:** 

```
Input: s = "dcab", pairs = [[0,3],[1,2],[0,2]]
Output: "abcd"
Explaination:
Swap s[0] and s[3], s = "bcad"
Swap s[0] and s[2], s = "acbd"
Swap s[1] and s[2], s = "abcd"
```

**Example 3:** 

```
Input: s = "cba", pairs = [[0,1],[1,2]]
Output: "abc"
Explaination:
Swap s[0] and s[1], s = "bca"
Swap s[1] and s[2], s = "bac"
Swap s[0] and s[1], s = "abc"

```



**Constraints:** 

-  *1 <= s.length <= 10^5*  
-  *0 <= pairs.length <= 10^5*  
-  *0 <= pairs[i][0], pairs[i][1] < s.length*  
-  *s*  only contains lower case English letters.


# [1202. 交换字符串中的元素][cnTitle]

**中等**

给你一个字符串  *s* ，以及该字符串中的一些「索引对」数组  *pairs* ，其中  *pairs[i] = [a, b]*  表示字符串中的两个索引（编号从 0 开始）。

你可以 **任意多次交换**  在  *pairs*  中任意一对索引处的字符。

返回在经过若干次交换后， *s*  可以变成的按字典序最小的字符串。



**示例 1:** 

```
输入：s = "dcab", pairs = [[0,3],[1,2]]
输出："bacd"
解释： 
交换 s[0] 和 s[3], s = "bcad"
交换 s[1] 和 s[2], s = "bacd"

```

**示例 2：** 

```
输入：s = "dcab", pairs = [[0,3],[1,2],[0,2]]
输出："abcd"
解释：
交换 s[0] 和 s[3], s = "bcad"
交换 s[0] 和 s[2], s = "acbd"
交换 s[1] 和 s[2], s = "abcd"
```

**示例 3：** 

```
输入：s = "cba", pairs = [[0,1],[1,2]]
输出："abc"
解释：
交换 s[0] 和 s[1], s = "bca"
交换 s[1] 和 s[2], s = "bac"
交换 s[0] 和 s[1], s = "abc"

```



**提示：** 

-  *1 <= s.length <= 10^5*  
-  *0 <= pairs.length <= 10^5*  
-  *0 <= pairs[i][0], pairs[i][1] < s.length*  
-  *s*  中只含有小写英文字母




# 算法思路

# 测试用例
```
1202. Smallest String With Swaps 1202. 交换字符串中的元素 Medium
```

[enTitle]: https://leetcode.com/problems/smallest-string-with-swaps/
[cnTitle]: https://leetcode-cn.com/problems/smallest-string-with-swaps/
