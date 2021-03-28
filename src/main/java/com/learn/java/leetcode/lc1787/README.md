# [1787. Make the XOR of All Segments Equal to Zero][enTitle]

**Hard**

You are given an array  *nums* ​​​ and an integer  *k* ​​​​​. The XOR of a segment  *[left, right]*  where  *left <= right*  is the  *XOR*  of all the elements with indices between  *left*  and  *right* , inclusive:  *nums[left] XOR nums[left+1] XOR ... XOR nums[right]* .

Return  *the minimum number of elements to change in the array* such that the  *XOR*  of all segments of size  *k* ​​​​​​ is equal to zero.



**Example 1:** 

```
Input: nums = [1,2,0,3,0], k = 1
Output: 3
Explanation:Modify the array from [1,2,0,3,0] to from [0,0,0,0,0].

```

**Example 2:** 

```
Input: nums = [3,4,5,2,1,7,3,4,7], k = 3
Output: 3
Explanation:Modify the array from [3,4,5,2,1,7,3,4,7] to [3,4,7,3,4,7,3,4,7].

```

**Example 3:** 

```
Input: nums = [1,2,4,1,2,5,1,2,6], k = 3
Output: 3
Explanation:Modify the array from [1,2,4,1,2,5,1,2,6] to [1,2,3,1,2,3,1,2,3].
```



**Constraints:** 

-  *1 <= k <= nums.length <= 2000*  
-  *0 <= nums[i] < 210* 


# [1787. 使所有区间的异或结果为零][cnTitle]

**困难**

给你一个整数数组  *nums* ​​​ 和一个整数  *k* ​​​​​ 。区间  *[left, right]* （ *left <= right* ）的 **异或结果**  是对下标位于  *left*  和  *right* （包括  *left*  和  *right*  ）之间所有元素进行  *XOR*  运算的结果： *nums[left] XOR nums[left+1] XOR ... XOR nums[right]*  。

返回数组中 **要更改的最小元素数**  ，以使所有长度为  *k*  的区间异或结果等于零。



**示例 1：** 

```
输入：nums = [1,2,0,3,0], k = 1
输出：3
解释：将数组 [1,2,0,3,0] 修改为 [0,0,0,0,0]

```

**示例 2：** 

```
输入：nums = [3,4,5,2,1,7,3,4,7], k = 3
输出：3
解释：将数组 [3,4,5,2,1,7,3,4,7] 修改为 [3,4,7,3,4,7,3,4,7]

```

**示例 3：** 

```
输入：nums = [1,2,4,1,2,5,1,2,6], k = 3
输出：3
解释：将数组[1,2,4,1,2,5,1,2,6] 修改为 [1,2,3,1,2,3,1,2,3]
```



**提示：** 

-  *1 <= k <= nums.length <= 2000*  
-  *0 <= nums[i] < 210* 




# 算法思路

# 测试用例
```
1787. Make the XOR of All Segments Equal to Zero 1787. 使所有区间的异或结果为零 Hard
```

[enTitle]: https://leetcode.com/problems/make-the-xor-of-all-segments-equal-to-zero/
[cnTitle]: https://leetcode-cn.com/problems/make-the-xor-of-all-segments-equal-to-zero/
