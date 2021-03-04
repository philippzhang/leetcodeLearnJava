# [1726. Tuple with Same Product][enTitle]

**Medium**

Given an array  *nums*  of **distinct**  positive integers, return  *the number of tuples*  *(a, b, c, d)*  *such that*  *a * b = c * d*  *where*  *a*  *,*  *b*  *,*  *c*  *, and*  *d*  *are elements of*  *nums*  *, and*  *a != b != c != d*  *.* 



**Example 1:** 

```
Input: nums = [2,3,4,6]
Output: 8
Explanation: There are 8 valid tuples:
(2,6,3,4) , (2,6,4,3) , (6,2,3,4) , (6,2,4,3)
(3,4,2,6) , (4,3,2,6) , (3,4,6,2) , (4,3,6,2)

```

**Example 2:** 

```
Input: nums = [1,2,4,5,10]
Output: 16
Explanation: There are 16 valids tuples:
(1,10,2,5) , (1,10,5,2) , (10,1,2,5) , (10,1,5,2)
(2,5,1,10) , (2,5,10,1) , (5,2,1,10) , (5,2,10,1)
(2,10,4,5) , (2,10,5,4) , (10,2,4,5) , (10,2,4,5)
(4,5,2,10) , (4,5,10,2) , (5,4,2,10) , (5,4,10,2)

```

**Example 3:** 

```
Input: nums = [2,3,4,6,8,12]
Output: 40

```

**Example 4:** 

```
Input: nums = [2,3,5,7]
Output: 0

```



**Constraints:** 

-  *1 <= nums.length <= 1000*  
-  *1 <= nums[i] <= 104*  
- All elements in  *nums*  are **distinct** .


# [1726. 同积元组][cnTitle]

**中等**

给你一个由 **不同**  正整数组成的数组  *nums*  ，请你返回满足  *a * b = c * d*  的元组 *(a, b, c, d)* 的数量。其中  *a* 、 *b* 、 *c*  和  *d*  都是  *nums*  中的元素，且  *a != b != c != d*  。



**示例 1：** 

```
输入：nums = [2,3,4,6]
输出：8
解释：存在 8 个满足题意的元组：
(2,6,3,4) , (2,6,4,3) , (6,2,3,4) , (6,2,4,3)
(3,4,2,6) , (4,3,2,6) , (3,4,6,2) , (4,3,6,2)

```

**示例 2：** 

```
输入：nums = [1,2,4,5,10]
输出：16
解释：存在 16 个满足题意的元组：
(1,10,2,5) , (1,10,5,2) , (10,1,2,5) , (10,1,5,2)
(2,5,1,10) , (2,5,10,1) , (5,2,1,10) , (5,2,10,1)
(2,10,4,5) , (2,10,5,4) , (10,2,4,5) , (10,2,4,5)
(4,5,2,10) , (4,5,10,2) , (5,4,2,10) , (5,4,10,2)

```

**示例 3：** 

```
输入：nums = [2,3,4,6,8,12]
输出：40

```

**示例 4：** 

```
输入：nums = [2,3,5,7]
输出：0

```



**提示：** 

-  *1 <= nums.length <= 1000*  
-  *1 <= nums[i] <= 104*  
-  *nums*  中的所有元素 **互不相同** 




# 算法思路

# 测试用例
```
1726. Tuple with Same Product 1726. 同积元组 Medium
```

[enTitle]: https://leetcode.com/problems/tuple-with-same-product/
[cnTitle]: https://leetcode-cn.com/problems/tuple-with-same-product/
