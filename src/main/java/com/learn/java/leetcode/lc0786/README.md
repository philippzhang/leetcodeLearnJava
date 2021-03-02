# [786. K-th Smallest Prime Fraction][enTitle]

**Hard**

You are given a sorted integer array  *arr*  containing  *1*  and **prime**  numbers, where all the integers of  *arr*  are unique. You are also given an integer  *k* .

For every  *i*  and  *j*  where  *0 <= i < j < arr.length* , we consider the fraction  *arr[i] / arr[j]* .

Return  *the*   *kth*   *smallest fraction considered* . Return your answer as an array of integers of size  *2* , where  *answer[0] == arr[i]*  and  *answer[1] == arr[j]* .



**Example 1:** 

```
Input: arr = [1,2,3,5], k = 3
Output: [2,5]
Explanation: The fractions to be considered in sorted order are:
1/5, 1/3, 2/5, 1/2, 3/5, and 2/3.
The third fraction is 2/5.

```

**Example 2:** 

```
Input: arr = [1,7], k = 1
Output: [1,7]

```



**Constraints:** 

-  *2 <= arr.length <= 1000*  
-  *1 <= arr[i] <= 3 * 104*  
-  *arr[0] == 1*  
-  *arr[i]*  is a **prime**  number for  *i > 0* . 
- All the numbers of  *arr*  are **unique**  and sorted in **strictly increasing**  order. 
-  *1 <= k <= arr.length * (arr.length - 1) / 2* 


# [786. 第 K 个最小的素数分数][cnTitle]

**困难**

给你一个按递增顺序排序的数组  *arr*  和一个整数  *k*  。数组  *arr*  由  *1*  和若干 **素数**  组成，且其中所有整数互不相同。

对于每对满足  *0 < i < j < arr.length*  的  *i*  和  *j*  ，可以得到分数  *arr[i] / arr[j]*  。

那么第  *k*  个最小的分数是多少呢? 以长度为 2 的整数数组返回你的答案, 这里  *answer[0] == arr[i]*  且  *answer[1] == arr[j]*  。

**示例 1：** 

```
输入：arr = [1,2,3,5], k = 3
输出：[2,5]
解释：已构造好的分数,排序后如下所示: 
1/5, 1/3, 2/5, 1/2, 3/5, 2/3
很明显第三个最小的分数是 2/5

```

**示例 2：** 

```
输入：arr = [1,7], k = 1
输出：[1,7]

```



**提示：** 

-  *2 <= arr.length <= 1000*  
-  *1 <= arr[i] <= 3 * 104*  
-  *arr[0] == 1*  
-  *arr[i]*  是一个 **素数**  ， *i > 0*  
-  *arr*  中的所有数字 **互不相同**  ，且按 **严格递增**  排序 
-  *1 <= k <= arr.length * (arr.length - 1) / 2* 




# 算法思路

# 测试用例
```
786. K-th Smallest Prime Fraction 786. 第 K 个最小的素数分数 Hard
```

[enTitle]: https://leetcode.com/problems/k-th-smallest-prime-fraction/
[cnTitle]: https://leetcode-cn.com/problems/k-th-smallest-prime-fraction/
