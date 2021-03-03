# [1018. Binary Prefix Divisible By 5][enTitle]

**Easy**

Given an array  *A*  of  *0* s and  *1* s, consider  *N_i* : the i-th subarray from  *A[0]*  to  *A[i]*  interpreted as a binary number (from most-significant-bit to least-significant-bit.)

Return a list of booleans  *answer* , where  *answer[i]*  is  *true*  if and only if  *N_i*  is divisible by 5.

**Example 1:** 

```
Input:[0,1,1]
Output: [true,false,false]
Explanation: 
The input numbers in binary are 0, 01, 011; which are 0, 1, and 3 in base-10.  Only the first number is divisible by 5, so answer[0] is true.
```

**Example 2:** 

```
Input:[1,1,1]
Output: [false,false,false]
```

**Example 3:** 

```
Input:[0,1,1,1,1,1]
Output: [true,false,false,false,true,false]
```

**Example 4:** 

```
Input:[1,1,1,0,1]
Output: [false,false,false,false,false]
```



**Note:** 

1.  *1 <= A.length <= 30000*  
2.  *A[i]*  is  *0*  or  *1* 


# [1018. 可被 5 整除的二进制前缀][cnTitle]

**简单**

给定由若干  *0*  和  *1*  组成的数组  *A* 。我们定义  *N_i* ：从  *A[0]*  到  *A[i]*  的第  *i*  个子数组被解释为一个二进制数（从最高有效位到最低有效位）。

返回布尔值列表  *answer* ，只有当  *N_i*  可以被  *5*  整除时，答案  *answer[i]*  为  *true* ，否则为  *false* 。



**示例 1：** 

```
输入：[0,1,1]
输出：[true,false,false]
解释：
输入数字为 0, 01, 011；也就是十进制中的 0, 1, 3 。只有第一个数可以被 5 整除，因此 answer[0] 为真。

```

**示例 2：** 

```
输入：[1,1,1]
输出：[false,false,false]

```

**示例 3：** 

```
输入：[0,1,1,1,1,1]
输出：[true,false,false,false,true,false]

```

**示例 4：** 

```
输入：[1,1,1,0,1]
输出：[false,false,false,false,false]

```



**提示：** 

1.  *1 <= A.length <= 30000*  
2.  *A[i]*  为  *0*  或  *1* 




# 算法思路

# 测试用例
```
1018. Binary Prefix Divisible By 5 1018. 可被 5 整除的二进制前缀 Easy
```

[enTitle]: https://leetcode.com/problems/binary-prefix-divisible-by-5/
[cnTitle]: https://leetcode-cn.com/problems/binary-prefix-divisible-by-5/
