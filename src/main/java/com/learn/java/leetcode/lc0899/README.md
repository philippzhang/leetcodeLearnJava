# [899. Orderly Queue][enTitle]

**Hard**

A string  *S*  of lowercase letters is given. Then, we may make any number of  *moves* .

In each move, we choose one of the first  *K*  letters (starting from the left), remove it, and place it at the end of the string.

Return the lexicographically smallest string we could have after any number of moves.




**Example 1:** 

```
Input:S = "cba", K = 1
Output: "acb"
Explanation: 
In the first move, we move the 1st character ("c") to the end, obtaining the string "bac".
In the second move, we move the 1st character ("b") to the end, obtaining the final result "acb".
```


**Example 2:** 

```
Input:S = "baaca", K = 3
Output: "aaabc"
Explanation: 
In the first move, we move the 1st character ("b") to the end, obtaining the string "aacab".
In the second move, we move the 3rd character ("c") to the end, obtaining the final result "aaabc".
```



**Note:** 

1.  *1 <= K <= S.length <= 1000*  
2.  *S*  consists of lowercase letters only.






# [899. 有序队列][cnTitle]

**困难**

给出了一个由小写字母组成的字符串  *S* 。然后，我们可以进行任意次数的 *移动* 。

在每次移动中，我们选择前  *K*  个字母中的一个（从左侧开始），将其从原位置移除，并放置在字符串的末尾。

返回我们在任意次数的移动之后可以拥有的按字典顺序排列的最小字符串。



**示例 1：** 

```
输入：S = "cba", K = 1
输出："acb"
解释：
在第一步中，我们将第一个字符（“c”）移动到最后，获得字符串 “bac”。
在第二步中，我们将第一个字符（“b”）移动到最后，获得最终结果 “acb”。

```

**示例 2：** 

```
输入：S = "baaca", K = 3
输出："aaabc"
解释：在第一步中，我们将第一个字符（“b”）移动到最后，获得字符串 “aacab”。
在第二步中，我们将第三个字符（“c”）移动到最后，获得最终结果 “aaabc”。

```



**提示：** 

1.  *1 <= K <= S.length <= 1000*  
2.  *S*  只由小写字母组成。




# 算法思路

# 测试用例
```
899. Orderly Queue 899. 有序队列 Hard
```

[enTitle]: https://leetcode.com/problems/orderly-queue/
[cnTitle]: https://leetcode-cn.com/problems/orderly-queue/
