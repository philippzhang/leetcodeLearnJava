# [927. Three Equal Parts][enTitle]

**Hard**

You are given an array  *arr*  which consists of only zeros and ones, divide the array into **three non-empty parts**  such that all of these parts represent the same binary value.

If it is possible, return any  *[i, j]*  with  *i + 1 < j* , such that:

-  *arr[0], arr[1], ..., arr[i]*  is the first part, 
-  *arr[i + 1], arr[i + 2], ..., arr[j - 1]*  is the second part, and 
-  *arr[j], arr[j + 1], ..., arr[arr.length - 1]*  is the third part. 
- All three parts have equal binary values.

If it is not possible, return  *[-1, -1]* .

Note that the entire part is used when considering what binary value it represents. For example,  *[1,1,0]*  represents  *6*  in decimal, not  *3* . Also, leading zeros **are allowed** , so  *[0,1,1]*  and  *[1,1]*  represent the same value.



**Example 1:** 

```
Input: arr = [1,0,1,0,1]
Output: [0,3]

```

**Example 2:** 

```
Input: arr = [1,1,0,1,1]
Output: [-1,-1]

```

**Example 3:** 

```
Input: arr = [1,1,0,0,1]
Output: [0,2]

```



**Constraints:** 

-  *3 <= arr.length <= 3 * 104*  
-  *arr[i]*  is  *0*  or  *1* 


# [927. 三等分][cnTitle]

**困难**

给定一个由  *0*  和  *1*  组成的数组  *A* ，将数组分成 3 个非空的部分，使得所有这些部分表示相同的二进制值。

如果可以做到，请返回**任何**   *[i, j]* ，其中  *i+1 < j* ，这样一来：

-  *A[0], A[1], ..., A[i]*  组成第一部分； 
-  *A[i+1], A[i+2], ..., A[j-1]*  作为第二部分； 
-  *A[j], A[j+1], ..., A[A.length - 1]*  是第三部分。 
- 这三个部分所表示的二进制值相等。

如果无法做到，就返回  *[-1, -1]* 。

注意，在考虑每个部分所表示的二进制时，应当将其看作一个整体。例如， *[1,1,0]*  表示十进制中的  *6* ，而不会是  *3* 。此外，前导零也是被允许的，所以  *[0,1,1]*  和  *[1,1]*  表示相同的值。



**示例 1：** 

```
输入：[1,0,1,0,1]
输出：[0,3]

```

**示例 2：** 

```
输出：[1,1,0,1,1]
输出：[-1,-1]
```



**提示：** 

1.  *3 <= A.length <= 30000*  
2.  *A[i] == 0*  或  *A[i] == 1* 






# 算法思路

# 测试用例
```
927. Three Equal Parts 927. 三等分 Hard
```

[enTitle]: https://leetcode.com/problems/three-equal-parts/
[cnTitle]: https://leetcode-cn.com/problems/three-equal-parts/
