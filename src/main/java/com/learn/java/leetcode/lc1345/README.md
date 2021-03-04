# [1345. Jump Game IV][enTitle]

**Hard**

Given an array of integers  *arr* , you are initially positioned at the first index of the array.

In one step you can jump from index  *i*  to index:

-  *i + 1*  where:  *i + 1 < arr.length* . 
-  *i - 1*  where:  *i - 1 >= 0* . 
-  *j*  where:  *arr[i] == arr[j]*  and  *i != j* .

Return  *the minimum number of steps*  to reach the **last index**  of the array.

Notice that you can not jump outside of the array at any time.



**Example 1:** 

```
Input: arr = [100,-23,-23,404,100,23,23,23,3,404]
Output: 3
Explanation: You need three jumps from index 0 --> 4 --> 3 --> 9. Note that index 9 is the last index of the array.

```

**Example 2:** 

```
Input: arr = [7]
Output: 0
Explanation: Start index is the last index. You don't need to jump.

```

**Example 3:** 

```
Input: arr = [7,6,9,6,9,6,9,7]
Output: 1
Explanation: You can jump directly from index 0 to index 7 which is last index of the array.

```

**Example 4:** 

```
Input: arr = [6,1,9]
Output: 2

```

**Example 5:** 

```
Input: arr = [11,22,7,7,7,7,7,7,7,22,13]
Output: 3

```



**Constraints:** 

-  *1 <= arr.length <= 5 * 104*  
-  *-108 <= arr[i] <= 108* 


# [1345. 跳跃游戏 IV][cnTitle]

**困难**

给你一个整数数组  *arr*  ，你一开始在数组的第一个元素处（下标为 0）。

每一步，你可以从下标  *i*  跳到下标：

-  *i + 1*  满足： *i + 1 < arr.length*  
-  *i - 1*  满足： *i - 1 >= 0*  
-  *j*  满足： *arr[i] == arr[j]*  且  *i != j* 

请你返回到达数组最后一个元素的下标处所需的 **最少操作次数**  。

注意：任何时候你都不能跳到数组外面。



**示例 1：** 

```
输入：arr = [100,-23,-23,404,100,23,23,23,3,404]
输出：3
解释：那你需要跳跃 3 次，下标依次为 0 --> 4 --> 3 --> 9 。下标 9 为数组的最后一个元素的下标。

```

**示例 2：** 

```
输入：arr = [7]
输出：0
解释：一开始就在最后一个元素处，所以你不需要跳跃。

```

**示例 3：** 

```
输入：arr = [7,6,9,6,9,6,9,7]
输出：1
解释：你可以直接从下标 0 处跳到下标 7 处，也就是数组的最后一个元素处。

```

**示例 4：** 

```
输入：arr = [6,1,9]
输出：2

```

**示例 5：** 

```
输入：arr = [11,22,7,7,7,7,7,7,7,22,13]
输出：3

```



**提示：** 

-  *1 <= arr.length <= 5 * 10^4*  
-  *-10^8 <= arr[i] <= 10^8* 




# 算法思路

# 测试用例
```
1345. Jump Game IV 1345. 跳跃游戏 IV Hard
```

[enTitle]: https://leetcode.com/problems/jump-game-iv/
[cnTitle]: https://leetcode-cn.com/problems/jump-game-iv/
