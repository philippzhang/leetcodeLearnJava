# [1578. Minimum Deletion Cost to Avoid Repeating Letters][enTitle]

**Medium**

Given a string  *s*  and an array of integers  *cost*  where  *cost[i]*  is the cost of deleting the  *ith*  character in  *s* .

Return the minimum cost of deletions such that there are no two identical letters next to each other.

Notice that you will delete the chosen characters at the same time, in other words, after deleting a character, the costs of deleting other characters will not change.



**Example 1:** 

```
Input: s = "abaac", cost = [1,2,3,4,5]
Output: 3
Explanation: Delete the letter "a" with cost 3 to get "abac" (String without two identical letters next to each other).

```

**Example 2:** 

```
Input: s = "abc", cost = [1,2,3]
Output: 0
Explanation: You don't need to delete any character because there are no identical letters next to each other.

```

**Example 3:** 

```
Input: s = "aabaa", cost = [1,2,3,4,1]
Output: 2
Explanation: Delete the first and the last character, getting the string ("aba").

```



**Constraints:** 

-  *s.length == cost.length*  
-  *1 <= s.length, cost.length <= 10^5*  
-  *1 <= cost[i] <= 10^4*  
-  *s*  contains only lowercase English letters.


# [1578. 避免重复字母的最小删除成本][cnTitle]

**中等**

给你一个字符串  *s*  和一个整数数组  *cost*  ，其中  *cost[i]*  是从  *s*  中删除字符  *i*  的代价。

返回使字符串任意相邻两个字母不相同的最小删除成本。

请注意，删除一个字符后，删除其他字符的成本不会改变。



**示例 1：** 

```
输入：s = "abaac", cost = [1,2,3,4,5]
输出：3
解释：删除字母 "a" 的成本为 3，然后得到 "abac"（字符串中相邻两个字母不相同）。

```

**示例 2：** 

```
输入：s = "abc", cost = [1,2,3]
输出：0
解释：无需删除任何字母，因为字符串中不存在相邻两个字母相同的情况。

```

**示例 3：** 

```
输入：s = "aabaa", cost = [1,2,3,4,1]
输出：2
解释：删除第一个和最后一个字母，得到字符串 ("aba") 。

```



**提示：** 

-  *s.length == cost.length*  
-  *1 <= s.length, cost.length <= 10^5*  
-  *1 <= cost[i] <= 10^4*  
-  *s*  中只含有小写英文字母




# 算法思路

# 测试用例
```
1578. Minimum Deletion Cost to Avoid Repeating Letters 1578. 避免重复字母的最小删除成本 Medium
```

[enTitle]: https://leetcode.com/problems/minimum-deletion-cost-to-avoid-repeating-letters/
[cnTitle]: https://leetcode-cn.com/problems/minimum-deletion-cost-to-avoid-repeating-letters/
