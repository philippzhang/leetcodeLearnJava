# [1649. Create Sorted Array through Instructions][enTitle]

**Hard**

Given an integer array  *instructions* , you are asked to create a sorted array from the elements in  *instructions* . You start with an empty container  *nums* . For each element from **left to right**  in  *instructions* , insert it into  *nums* . The **cost**  of each insertion is the minimum of the following:

- The number of elements currently in  *nums*  that are **strictly less than**   *instructions[i]* . 
- The number of elements currently in  *nums*  that are **strictly greater than**   *instructions[i]* .

For example, if inserting element  *3*  into  *nums = [1,2,3,5]* , the **cost**  of insertion is  *min(2, 1)*  (elements  *1*  and  *2*  are less than  *3* , element  *5*  is greater than  *3* ) and  *nums*  will become  *[1,2,3,3,5]* .

Return  *the total cost to insert all elements from*  *instructions*  *into*  *nums* . Since the answer may be large, return it **modulo**   *109 + 7* 



**Example 1:** 

```
Input: instructions = [1,5,6,2]
Output: 1
Explanation: Begin with nums = [].
Insert 1 with cost min(0, 0) = 0, now nums = [1].
Insert 5 with cost min(1, 0) = 0, now nums = [1,5].
Insert 6 with cost min(2, 0) = 0, now nums = [1,5,6].
Insert 2 with cost min(1, 2) = 1, now nums = [1,2,5,6].
The total cost is 0 + 0 + 0 + 1 = 1.
```

**Example 2:** 

```
Input: instructions = [1,2,3,6,5,4]
Output: 3
Explanation: Begin with nums = [].
Insert 1 with cost min(0, 0) = 0, now nums = [1].
Insert 2 with cost min(1, 0) = 0, now nums = [1,2].
Insert 3 with cost min(2, 0) = 0, now nums = [1,2,3].
Insert 6 with cost min(3, 0) = 0, now nums = [1,2,3,6].
Insert 5 with cost min(3, 1) = 1, now nums = [1,2,3,5,6].
Insert 4 with cost min(3, 2) = 2, now nums = [1,2,3,4,5,6].
The total cost is 0 + 0 + 0 + 0 + 1 + 2 = 3.

```

**Example 3:** 

```
Input: instructions = [1,3,3,3,2,4,2,1,2]
Output: 4
Explanation: Begin with nums = [].
Insert 1 with cost min(0, 0) = 0, now nums = [1].
Insert 3 with cost min(1, 0) = 0, now nums = [1,3].
Insert 3 with cost min(1, 0) = 0, now nums = [1,3,3].
Insert 3 with cost min(1, 0) = 0, now nums = [1,3,3,3].
Insert 2 with cost min(1, 3) = 1, now nums = [1,2,3,3,3].
Insert 4 with cost min(5, 0) = 0, now nums = [1,2,3,3,3,4].
​​​​​​​Insert 2 with cost min(1, 4) = 1, now nums = [1,2,2,3,3,3,4].
​​​​​​​Insert 1 with cost min(0, 6) = 0, now nums = [1,1,2,2,3,3,3,4].
​​​​​​​Insert 2 with cost min(2, 4) = 2, now nums = [1,1,2,2,2,3,3,3,4].
The total cost is 0 + 0 + 0 + 0 + 1 + 0 + 1 + 0 + 2 = 4.

```



**Constraints:** 

-  *1 <= instructions.length <= 105*  
-  *1 <= instructions[i] <= 105* 


# [1649. 通过指令创建有序数组][cnTitle]

**困难**

给你一个整数数组  *instructions*  ，你需要根据  *instructions*  中的元素创建一个有序数组。一开始你有一个空的数组  *nums*  ，你需要 **从左到右**  遍历  *instructions*  中的元素，将它们依次插入  *nums*  数组中。每一次插入操作的 **代价**  是以下两者的 **较小值**  ：

-  *nums*  中 **严格小于**   *instructions[i]*  的数字数目。 
-  *nums*  中 **严格大于**   *instructions[i]*  的数字数目。

比方说，如果要将  *3*  插入到  *nums = [1,2,3,5]*  ，那么插入操作的 **代价**  为  *min(2, 1)*  (元素  *1*  和  *2*  小于  *3*  ，元素  *5*  大于  *3*  ），插入后  *nums*  变成  *[1,2,3,3,5]*  。

请你返回将  *instructions*  中所有元素依次插入  *nums*  后的 **总最小代价** 。由于答案会很大，请将它对  *109 + 7*  取余 后返回。



**示例 1：** 

```
输入：instructions = [1,5,6,2]
输出：1
解释：一开始 nums = [] 。
插入 1 ，代价为 min(0, 0) = 0 ，现在 nums = [1] 。
插入 5 ，代价为 min(1, 0) = 0 ，现在 nums = [1,5] 。
插入 6 ，代价为 min(2, 0) = 0 ，现在 nums = [1,5,6] 。
插入 2 ，代价为 min(1, 2) = 1 ，现在 nums = [1,2,5,6] 。
总代价为 0 + 0 + 0 + 1 = 1 。
```

**示例 2:** 

```
输入：instructions = [1,2,3,6,5,4]
输出：3
解释：一开始 nums = [] 。
插入 1 ，代价为 min(0, 0) = 0 ，现在 nums = [1] 。
插入 2 ，代价为 min(1, 0) = 0 ，现在 nums = [1,2] 。
插入 3 ，代价为 min(2, 0) = 0 ，现在 nums = [1,2,3] 。
插入 6 ，代价为 min(3, 0) = 0 ，现在 nums = [1,2,3,6] 。
插入 5 ，代价为 min(3, 1) = 1 ，现在 nums = [1,2,3,5,6] 。
插入 4 ，代价为 min(3, 2) = 2 ，现在 nums = [1,2,3,4,5,6] 。
总代价为 0 + 0 + 0 + 0 + 1 + 2 = 3 。

```

**示例 3：** 

```
输入：instructions = [1,3,3,3,2,4,2,1,2]
输出：4
解释：一开始 nums = [] 。
插入 1 ，代价为 min(0, 0) = 0 ，现在 nums = [1] 。
插入 3 ，代价为 min(1, 0) = 0 ，现在 nums = [1,3] 。
插入 3 ，代价为 min(1, 0) = 0 ，现在 nums = [1,3,3] 。
插入 3 ，代价为 min(1, 0) = 0 ，现在 nums = [1,3,3,3] 。
插入 2 ，代价为 min(1, 3) = 1 ，现在 nums = [1,2,3,3,3] 。
插入 4 ，代价为 min(5, 0) = 0 ，现在 nums = [1,2,3,3,3,4] 。
​​​​​插入 2 ，代价为 min(1, 4) = 1 ，现在 nums = [1,2,2,3,3,3,4] 。
插入 1 ，代价为 min(0, 6) = 0 ，现在 nums = [1,1,2,2,3,3,3,4] 。
插入 2 ，代价为 min(2, 4) = 2 ，现在 nums = [1,1,2,2,2,3,3,3,4] 。
总代价为 0 + 0 + 0 + 0 + 1 + 0 + 1 + 0 + 2 = 4 。

```



**提示：** 

-  *1 <= instructions.length <= 105*  
-  *1 <= instructions[i] <= 105* 




# 算法思路

# 测试用例
```
1649. Create Sorted Array through Instructions 1649. 通过指令创建有序数组 Hard
```

[enTitle]: https://leetcode.com/problems/create-sorted-array-through-instructions/
[cnTitle]: https://leetcode-cn.com/problems/create-sorted-array-through-instructions/
