# [1442. Count Triplets That Can Form Two Arrays of Equal XOR][enTitle]

**Medium**

Given an array of integers  *arr* .

We want to select three indices  *i* ,  *j*  and  *k*  where  *(0 <= i < j <= k < arr.length)* .

Let's define  *a*  and  *b*  as follows:

-  *a = arr[i] ^ arr[i + 1] ^ ... ^ arr[j - 1]*  
-  *b = arr[j] ^ arr[j + 1] ^ ... ^ arr[k]* 

Note that **^**  denotes the **bitwise-xor**  operation.

Return  *the number of triplets*  ( *i* ,  *j*  and  *k* ) Where  *a == b* .



**Example 1:** 

```
Input: arr = [2,3,1,6,7]
Output: 4
Explanation: The triplets are (0,1,2), (0,2,2), (2,3,4) and (2,4,4)

```

**Example 2:** 

```
Input: arr = [1,1,1,1,1]
Output: 10

```

**Example 3:** 

```
Input: arr = [2,3]
Output: 0

```

**Example 4:** 

```
Input: arr = [1,3,5,7,9]
Output: 3

```

**Example 5:** 

```
Input: arr = [7,11,12,9,5,2,7,17,22]
Output: 8

```



**Constraints:** 

-  *1 <= arr.length <= 300*  
-  *1 <= arr[i] <= 10^8* 


# [1442. 形成两个异或相等数组的三元组数目][cnTitle]

**中等**

给你一个整数数组  *arr*  。

现需要从数组中取三个下标  *i* 、 *j*  和  *k*  ，其中  *(0 <= i < j <= k < arr.length)*  。

 *a*  和  *b*  定义如下：

-  *a = arr[i] ^ arr[i + 1] ^ ... ^ arr[j - 1]*  
-  *b = arr[j] ^ arr[j + 1] ^ ... ^ arr[k]* 

注意：**^**  表示 **按位异或**  操作。

请返回能够令  *a == b*  成立的三元组 ( *i* ,  *j*  ,  *k* ) 的数目。



**示例 1：** 

```
输入：arr = [2,3,1,6,7]
输出：4
解释：满足题意的三元组分别是 (0,1,2), (0,2,2), (2,3,4) 以及 (2,4,4)

```

**示例 2：** 

```
输入：arr = [1,1,1,1,1]
输出：10

```

**示例 3：** 

```
输入：arr = [2,3]
输出：0

```

**示例 4：** 

```
输入：arr = [1,3,5,7,9]
输出：3

```

**示例 5：** 

```
输入：arr = [7,11,12,9,5,2,7,17,22]
输出：8

```



**提示：** 

-  *1 <= arr.length <= 300*  
-  *1 <= arr[i] <= 10^8* 




# 算法思路

# 测试用例
```
1442. Count Triplets That Can Form Two Arrays of Equal XOR 1442. 形成两个异或相等数组的三元组数目 Medium
```

[enTitle]: https://leetcode.com/problems/count-triplets-that-can-form-two-arrays-of-equal-xor/
[cnTitle]: https://leetcode-cn.com/problems/count-triplets-that-can-form-two-arrays-of-equal-xor/
