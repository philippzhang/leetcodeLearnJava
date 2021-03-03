# [926. Flip String to Monotone Increasing][enTitle]

**Medium**

A string of  *'0'* s and  *'1'* s is  *monotone increasing*  if it consists of some number of  *'0'* s (possibly 0), followed by some number of  *'1'* s (also possibly 0.)

We are given a string  *S*  of  *'0'* s and  *'1'* s, and we may flip any  *'0'*  to a  *'1'*  or a  *'1'*  to a  *'0'* .

Return the minimum number of flips to make  *S*  monotone increasing.




**Example 1:** 

```
Input:"00110"
Output: 1
Explanation: We flip the last digit to get 00111.
```


**Example 2:** 

```
Input:"010110"
Output: 2
Explanation: We flip to get 011111, or alternatively 000111.
```


**Example 3:** 

```
Input:"00011000"
Output: 2
Explanation: We flip to get 00000000.
```



**Note:** 

1.  *1 <= S.length <= 20000*  
2.  *S*  only consists of  *'0'*  and  *'1'*  characters.








# [926. 将字符串翻转到单调递增][cnTitle]

**中等**

如果一个由  *'0'*  和  *'1'*  组成的字符串，是以一些  *'0'* （可能没有  *'0'* ）后面跟着一些  *'1'* （也可能没有  *'1'* ）的形式组成的，那么该字符串是 *单调递增* 的。

我们给出一个由字符  *'0'*  和  *'1'*  组成的字符串  *S* ，我们可以将任何  *'0'*  翻转为  *'1'*  或者将  *'1'*  翻转为  *'0'* 。

返回使  *S*  单调递增的最小翻转次数。



**示例 1：** 

```
输入："00110"
输出：1
解释：我们翻转最后一位得到 00111.

```

**示例 2：** 

```
输入："010110"
输出：2
解释：我们翻转得到 011111，或者是 000111。

```

**示例 3：** 

```
输入："00011000"
输出：2
解释：我们翻转得到 00000000。

```



**提示：** 

1.  *1 <= S.length <= 20000*  
2.  *S*  中只包含字符  *'0'*  和  *'1'* 




# 算法思路

# 测试用例
```
926. Flip String to Monotone Increasing 926. 将字符串翻转到单调递增 Medium
```

[enTitle]: https://leetcode.com/problems/flip-string-to-monotone-increasing/
[cnTitle]: https://leetcode-cn.com/problems/flip-string-to-monotone-increasing/
