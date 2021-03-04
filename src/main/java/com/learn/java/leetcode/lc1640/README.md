# [1640. Check Array Formation Through Concatenation][enTitle]

**Easy**

You are given an array of **distinct**  integers  *arr*  and an array of integer arrays  *pieces* , where the integers in  *pieces*  are **distinct** . Your goal is to form  *arr*  by concatenating the arrays in  *pieces*  **in any order** . However, you are **not**  allowed to reorder the integers in each array  *pieces[i]* .

Return  *true*   *if it is possible*  *to form the array*  *arr*  *from*  *pieces* . Otherwise, return  *false* .



**Example 1:** 

```
Input: arr = [85], pieces = [[85]]
Output: true

```

**Example 2:** 

```
Input: arr = [15,88], pieces = [[88],[15]]
Output: true
Explanation: Concatenate [15] then [88]

```

**Example 3:** 

```
Input: arr = [49,18,16], pieces = [[16,18,49]]
Output: false
Explanation: Even though the numbers match, we cannot reorder pieces[0].

```

**Example 4:** 

```
Input: arr = [91,4,64,78], pieces = [[78],[4,64],[91]]
Output: true
Explanation: Concatenate [91] then [4,64] then [78]
```

**Example 5:** 

```
Input: arr = [1,3,5,7], pieces = [[2,4,6,8]]
Output: false

```



**Constraints:** 

-  *1 <= pieces.length <= arr.length <= 100*  
-  *sum(pieces[i].length) == arr.length*  
-  *1 <= pieces[i].length <= arr.length*  
-  *1 <= arr[i], pieces[i][j] <= 100*  
- The integers in  *arr*  are **distinct** . 
- The integers in  *pieces*  are **distinct**  (i.e., If we flatten pieces in a 1D array, all the integers in this array are distinct).


# [1640. 能否连接形成数组][cnTitle]

**简单**

给你一个整数数组  *arr*  ，数组中的每个整数 **互不相同**  。另有一个由整数数组构成的数组  *pieces* ，其中的整数也 **互不相同**  。请你以 **任意顺序**  连接  *pieces*  中的数组以形成  *arr*  。但是，**不允许**  对每个数组  *pieces[i]*  中的整数重新排序。

如果可以连接 *pieces*  中的数组形成  *arr*  ，返回  *true*  ；否则，返回  *false*  。



**示例 1：** 

```
输入：arr = [85], pieces = [[85]]
输出：true

```

**示例 2：** 

```
输入：arr = [15,88], pieces = [[88],[15]]
输出：true
解释：依次连接 [15] 和 [88]

```

**示例 3：** 

```
输入：arr = [49,18,16], pieces = [[16,18,49]]
输出：false
解释：即便数字相符，也不能重新排列 pieces[0]

```

**示例 4：** 

```
输入：arr = [91,4,64,78], pieces = [[78],[4,64],[91]]
输出：true
解释：依次连接 [91]、[4,64] 和 [78]
```

**示例 5：** 

```
输入：arr = [1,3,5,7], pieces = [[2,4,6,8]]
输出：false

```



**提示：** 

-  *1 <= pieces.length <= arr.length <= 100*  
-  *sum(pieces[i].length) == arr.length*  
-  *1 <= pieces[i].length <= arr.length*  
-  *1 <= arr[i], pieces[i][j] <= 100*  
-  *arr*  中的整数 **互不相同**  
-  *pieces*  中的整数 **互不相同** （也就是说，如果将  *pieces*  扁平化成一维数组，数组中的所有整数互不相同）




# 算法思路

# 测试用例
```
1640. Check Array Formation Through Concatenation 1640. 能否连接形成数组 Easy
```

[enTitle]: https://leetcode.com/problems/check-array-formation-through-concatenation/
[cnTitle]: https://leetcode-cn.com/problems/check-array-formation-through-concatenation/
