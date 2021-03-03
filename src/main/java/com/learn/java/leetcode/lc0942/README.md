# [942. DI String Match][enTitle]

**Easy**

Given a string  *S*  that **only**  contains "I" (increase) or "D" (decrease), let  *N = S.length* .

Return **any**  permutation  *A*  of  *[0, 1, ..., N]*  such that for all  *i = 0, ..., N-1* :

- If  *S[i] == "I"* , then  *A[i] < A[i+1]*  
- If  *S[i] == "D"* , then  *A[i] > A[i+1]* 



**Example 1:** 

```
Input:"IDID"
Output: [0,4,1,3,2]
```


**Example 2:** 

```
Input:"III"
Output: [0,1,2,3]
```


**Example 3:** 

```
Input:"DDI"
Output: [3,2,0,1]
```







**Note:** 

1.  *1 <= S.length <= 10000*  
2.  *S*  only contains characters  *"I"*  or  *"D"* .


# [942. 增减字符串匹配][cnTitle]

**简单**

给定只含  *"I"* （增大）或  *"D"* （减小）的字符串  *S*  ，令  *N = S.length* 。

返回  *[0, 1, ..., N]*  的任意排列  *A*  使得对于所有  *i = 0, ..., N-1* ，都有：

- 如果  *S[i] == "I"* ，那么  *A[i] < A[i+1]*  
- 如果  *S[i] == "D"* ，那么  *A[i] > A[i+1]* 



**示例 1：** 

```
输入："IDID"
输出：[0,4,1,3,2]

```

**示例 2：** 

```
输入："III"
输出：[0,1,2,3]

```

**示例 3：** 

```
输入："DDI"
输出：[3,2,0,1]
```



**提示：** 

-  *1 <= S.length <= 10000*  
-  *S*  只包含字符  *"I"*  或  *"D"* 。




# 算法思路

# 测试用例
```
942. DI String Match 942. 增减字符串匹配 Easy
```

[enTitle]: https://leetcode.com/problems/di-string-match/
[cnTitle]: https://leetcode-cn.com/problems/di-string-match/
