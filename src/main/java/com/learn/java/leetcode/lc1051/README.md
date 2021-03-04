# [1051. Height Checker][enTitle]

**Easy**

Students are asked to stand in non-decreasing order of heights for an annual photo.

Return the minimum number of students that must move in order for all students to be standing in non-decreasing order of height.

Notice that when a group of students is selected they can reorder in any possible way between themselves and the non selected students remain on their seats.



**Example 1:** 

```
Input: heights = [1,1,4,2,1,3]
Output: 3
Explanation: 
Current array : [1,1,4,2,1,3]
Target array  : [1,1,1,2,3,4]
On index 2 (0-based) we have 4 vs 1 so we have to move this student.
On index 4 (0-based) we have 1 vs 3 so we have to move this student.
On index 5 (0-based) we have 3 vs 4 so we have to move this student.

```

**Example 2:** 

```
Input: heights = [5,1,2,3,4]
Output: 5

```

**Example 3:** 

```
Input: heights = [1,2,3,4,5]
Output: 0

```



**Constraints:** 

-  *1 <= heights.length <= 100*  
-  *1 <= heights[i] <= 100* 


# [1051. 高度检查器][cnTitle]

**简单**

学校在拍年度纪念照时，一般要求学生按照 **非递减**  的高度顺序排列。

请你返回能让所有学生以 **非递减**  高度排列的最小必要移动人数。

注意，当一组学生被选中时，他们之间可以以任何可能的方式重新排序，而未被选中的学生应该保持不动。



**示例：** 

```
输入：heights = [1,1,4,2,1,3]
输出：3 
解释：
当前数组：[1,1,4,2,1,3]
目标数组：[1,1,1,2,3,4]
在下标 2 处（从 0 开始计数）出现 4 vs 1 ，所以我们必须移动这名学生。
在下标 4 处（从 0 开始计数）出现 1 vs 3 ，所以我们必须移动这名学生。
在下标 5 处（从 0 开始计数）出现 3 vs 4 ，所以我们必须移动这名学生。
```

**示例 2：** 

```
输入：heights = [5,1,2,3,4]
输出：5

```

**示例 3：** 

```
输入：heights = [1,2,3,4,5]
输出：0

```



**提示：** 

-  *1 <= heights.length <= 100*  
-  *1 <= heights[i] <= 100* 




# 算法思路

# 测试用例
```
1051. Height Checker 1051. 高度检查器 Easy
```

[enTitle]: https://leetcode.com/problems/height-checker/
[cnTitle]: https://leetcode-cn.com/problems/height-checker/
