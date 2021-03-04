# [1534. Count Good Triplets][enTitle]

**Easy**

Given an array of integers  *arr* , and three integers  *a* ,  *b*  and  *c* . You need to find the number of good triplets.

A triplet  *(arr[i], arr[j], arr[k])*  is **good**  if the following conditions are true:

-  *0 <= i < j < k < arr.length*  
-  *|arr[i] - arr[j]| <= a*  
-  *|arr[j] - arr[k]| <= b*  
-  *|arr[i] - arr[k]| <= c* 

Where  *|x|*  denotes the absolute value of  *x* .

Return *the number of good triplets* .



**Example 1:** 

```
Input: arr = [3,0,1,1,9,7], a = 7, b = 2, c = 3
Output: 4
Explanation: There are 4 good triplets: [(3,0,1), (3,0,1), (3,1,1), (0,1,1)].

```

**Example 2:** 

```
Input: arr = [1,1,2,2,3], a = 0, b = 0, c = 1
Output: 0
Explanation:No triplet satisfies all conditions.

```



**Constraints:** 

-  *3 <= arr.length <= 100*  
-  *0 <= arr[i] <= 1000*  
-  *0 <= a, b, c <= 1000* 


# [1534. 统计好三元组][cnTitle]

**简单**

给你一个整数数组  *arr*  ，以及  *a* 、 *b*  、 *c*  三个整数。请你统计其中好三元组的数量。

如果三元组  *(arr[i], arr[j], arr[k])*  满足下列全部条件，则认为它是一个 **好三元组**  。

-  *0 <= i < j < k < arr.length*  
-  *|arr[i] - arr[j]| <= a*  
-  *|arr[j] - arr[k]| <= b*  
-  *|arr[i] - arr[k]| <= c* 

其中  *|x|*  表示  *x*  的绝对值。

返回 **好三元组的数量**  。



**示例 1：** 

```
输入：arr = [3,0,1,1,9,7], a = 7, b = 2, c = 3
输出：4
解释：一共有 4 个好三元组：[(3,0,1), (3,0,1), (3,1,1), (0,1,1)] 。

```

**示例 2：** 

```
输入：arr = [1,1,2,2,3], a = 0, b = 0, c = 1
输出：0
解释：不存在满足所有条件的三元组。

```



**提示：** 

-  *3 <= arr.length <= 100*  
-  *0 <= arr[i] <= 1000*  
-  *0 <= a, b, c <= 1000* 




# 算法思路

# 测试用例
```
1534. Count Good Triplets 1534. 统计好三元组 Easy
```

[enTitle]: https://leetcode.com/problems/count-good-triplets/
[cnTitle]: https://leetcode-cn.com/problems/count-good-triplets/
