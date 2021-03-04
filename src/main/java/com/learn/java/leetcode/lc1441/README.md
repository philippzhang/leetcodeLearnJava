# [1441. Build an Array With Stack Operations][enTitle]

**Easy**

Given an array  *target*  and an integer  *n* . In each iteration, you will read a number from  *list = {1,2,3..., n}* .

Build the  *target*  array using the following operations:

- **Push** : Read a new element from the beginning  *list* , and push it in the array. 
- **Pop** : delete the last element of the array. 
- If the target array is already built, stop reading more elements.

Return the operations to build the target array. You are guaranteed that the answer is unique.



**Example 1:** 

```
Input: target = [1,3], n = 3
Output: ["Push","Push","Pop","Push"]
Explanation:Read number 1 and automatically push in the array -> [1]
Read number 2 and automatically push in the array then Pop it -> [1]
Read number 3 and automatically push in the array -> [1,3]

```

**Example 2:** 

```
Input: target = [1,2,3], n = 3
Output: ["Push","Push","Push"]

```

**Example 3:** 

```
Input: target = [1,2], n = 4
Output: ["Push","Push"]
Explanation:You only need to read the first 2 numbers and stop.

```

**Example 4:** 

```
Input: target = [2,3,4], n = 4
Output: ["Push","Pop","Push","Push","Push"]

```



**Constraints:** 

-  *1 <= target.length <= 100*  
-  *1 <= target[i] <= n*  
-  *1 <= n <= 100*  
-  *target*  is strictly increasing.


# [1441. 用栈操作构建数组][cnTitle]

**简单**

给你一个目标数组  *target*  和一个整数  *n* 。每次迭代，需要从  *list = {1,2,3..., n}*  中依序读取一个数字。

请使用下述操作来构建目标数组  *target*  ：

- **Push** ：从  *list*  中读取一个新元素， 并将其推入数组中。 
- **Pop** ：删除数组中的最后一个元素。 
- 如果目标数组构建完成，就停止读取更多元素。

题目数据保证目标数组严格递增，并且只包含  *1*  到  *n*  之间的数字。

请返回构建目标数组所用的操作序列。

题目数据保证答案是唯一的。



**示例 1：** 

```
输入：target = [1,3], n = 3
输出：["Push","Push","Pop","Push"]
解释：读取 1 并自动推入数组 -> [1]
读取 2 并自动推入数组，然后删除它 -> [1]
读取 3 并自动推入数组 -> [1,3]

```

**示例 2：** 

```
输入：target = [1,2,3], n = 3
输出：["Push","Push","Push"]

```

**示例 3：** 

```
输入：target = [1,2], n = 4
输出：["Push","Push"]
解释：只需要读取前 2 个数字就可以停止。

```

**示例 4：** 

```
输入：target = [2,3,4], n = 4
输出：["Push","Pop","Push","Push","Push"]

```



**提示：** 

-  *1 <= target.length <= 100*  
-  *1 <= target[i] <= 100*  
-  *1 <= n <= 100*  
-  *target*  是严格递增的




# 算法思路

# 测试用例
```
1441. Build an Array With Stack Operations 1441. 用栈操作构建数组 Easy
```

[enTitle]: https://leetcode.com/problems/build-an-array-with-stack-operations/
[cnTitle]: https://leetcode-cn.com/problems/build-an-array-with-stack-operations/
