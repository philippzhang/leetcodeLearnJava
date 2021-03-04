# [1338. Reduce Array Size to The Half][enTitle]

**Medium**

Given an array  *arr* . You can choose a set of integers and remove all the occurrences of these integers in the array.

Return  *the minimum size of the set*  so that **at least**  half of the integers of the array are removed.



**Example 1:** 

```
Input: arr = [3,3,3,3,5,5,5,2,2,7]
Output: 2
Explanation: Choosing {3,7} will make the new array [5,5,5,2,2] which has size 5 (i.e equal to half of the size of the old array).
Possible sets of size 2 are {3,5},{3,2},{5,2}.
Choosing set {2,7} is not possible as it will make the new array [3,3,3,3,5,5,5] which has size greater than half of the size of the old array.

```

**Example 2:** 

```
Input: arr = [7,7,7,7,7,7]
Output: 1
Explanation: The only possible set you can choose is {7}. This will make the new array empty.

```

**Example 3:** 

```
Input: arr = [1,9]
Output: 1

```

**Example 4:** 

```
Input: arr = [1000,1000,3,7]
Output: 1

```

**Example 5:** 

```
Input: arr = [1,2,3,4,5,6,7,8,9,10]
Output: 5

```



**Constraints:** 

-  *1 <= arr.length <= 10^5*  
-  *arr.length*  is even. 
-  *1 <= arr[i] <= 10^5* 


# [1338. 数组大小减半][cnTitle]

**中等**

给你一个整数数组  *arr* 。你可以从中选出一个整数集合，并删除这些整数在数组中的每次出现。

返回 **至少**  能删除数组中的一半整数的整数集合的最小大小。



**示例 1：** 

```
输入：arr = [3,3,3,3,5,5,5,2,2,7]
输出：2
解释：选择 {3,7} 使得结果数组为 [5,5,5,2,2]、长度为 5（原数组长度的一半）。
大小为 2 的可行集合有 {3,5},{3,2},{5,2}。
选择 {2,7} 是不可行的，它的结果数组为 [3,3,3,3,5,5,5]，新数组长度大于原数组的二分之一。

```

**示例 2：** 

```
输入：arr = [7,7,7,7,7,7]
输出：1
解释：我们只能选择集合 {7}，结果数组为空。

```

**示例 3：** 

```
输入：arr = [1,9]
输出：1

```

**示例 4：** 

```
输入：arr = [1000,1000,3,7]
输出：1

```

**示例 5：** 

```
输入：arr = [1,2,3,4,5,6,7,8,9,10]
输出：5

```



**提示：** 

-  *1 <= arr.length <= 10^5*  
-  *arr.length*  为偶数 
-  *1 <= arr[i] <= 10^5* 




# 算法思路

# 测试用例
```
1338. Reduce Array Size to The Half 1338. 数组大小减半 Medium
```

[enTitle]: https://leetcode.com/problems/reduce-array-size-to-the-half/
[cnTitle]: https://leetcode-cn.com/problems/reduce-array-size-to-the-half/
