# [791. Custom Sort String][enTitle]

**Medium**

 *S*  and  *T*  are strings composed of lowercase letters. In  *S* , no letter occurs more than once.

 *S*  was sorted in some custom order previously. We want to permute the characters of  *T*  so that they match the order that  *S*  was sorted. More specifically, if  *x*  occurs before  *y*  in  *S* , then  *x*  should occur before  *y*  in the returned string.

Return any permutation of  *T*  (as a string) that satisfies this property.

```
Example :
Input: 
S = "cba"
T = "abcd"
Output: "cbad"
Explanation: 
"a", "b", "c" appear in S, so the order of "a", "b", "c" should be "c", "b", and "a". 
Since "d" does not appear in S, it can be at any position in T. "dcba", "cdba", "cbda" are also valid outputs.

```



**Note:** 

-  *S*  has length at most  *26* , and no character is repeated in  *S* . 
-  *T*  has length at most  *200* . 
-  *S*  and  *T*  consist of lowercase letters only.


# [791. 自定义字符串排序][cnTitle]

**中等**

字符串 *S* 和  *T*  只包含小写字符。在 *S* 中，所有字符只会出现一次。

 *S*  已经根据某种规则进行了排序。我们要根据 *S* 中的字符顺序对 *T* 进行排序。更具体地说，如果 *S* 中 *x* 在 *y* 之前出现，那么返回的字符串中 *x* 也应出现在 *y* 之前。

返回任意一种符合条件的字符串 *T* 。

```
示例:
输入:
S = "cba"
T = "abcd"
输出: "cbad"
解释: 
S中出现了字符 "a", "b", "c", 所以 "a", "b", "c" 的顺序应该是 "c", "b", "a". 
由于 "d" 没有在S中出现, 它可以放在T的任意位置. "dcba", "cdba", "cbda" 都是合法的输出。

```

**注意:** 

-  *S* 的最大长度为 *26* ，其中没有重复的字符。 
-  *T* 的最大长度为 *200* 。 
-  *S* 和 *T* 只包含小写字符。




# 算法思路

# 测试用例
```
791. Custom Sort String 791. 自定义字符串排序 Medium
```

[enTitle]: https://leetcode.com/problems/custom-sort-string/
[cnTitle]: https://leetcode-cn.com/problems/custom-sort-string/
