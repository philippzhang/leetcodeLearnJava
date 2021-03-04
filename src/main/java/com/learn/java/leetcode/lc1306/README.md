# [1306. Jump Game III][enTitle]

**Medium**

Given an array of non-negative integers  *arr* , you are initially positioned at  *start*  index of the array. When you are at index  *i* , you can jump to  *i + arr[i]*  or  *i - arr[i]* , check if you can reach to **any**  index with value 0.

Notice that you can not jump outside of the array at any time.



**Example 1:** 

```
Input: arr = [4,2,3,0,3,1,2], start = 5
Output: true
Explanation: 
All possible ways to reach at index 3 with value 0 are: 
index 5 -> index 4 -> index 1 -> index 3 
index 5 -> index 6 -> index 4 -> index 1 -> index 3 

```

**Example 2:** 

```
Input: arr = [4,2,3,0,3,1,2], start = 0
Output: true 
Explanation:One possible way to reach at index 3 with value 0 is: 
index 0 -> index 4 -> index 1 -> index 3

```

**Example 3:** 

```
Input: arr = [3,0,2,1,2], start = 2
Output: false
Explanation:There is no way to reach at index 1 with value 0.

```



**Constraints:** 

-  *1 <= arr.length <= 5 * 104*  
-  *0 <= arr[i] < arr.length*  
-  *0 <= start < arr.length* 


# [1306. 跳跃游戏 III][cnTitle]

**中等**

这里有一个非负整数数组  *arr* ，你最开始位于该数组的起始下标  *start*  处。当你位于下标  *i*  处时，你可以跳到  *i + arr[i]*  或者  *i - arr[i]* 。

请你判断自己是否能够跳到对应元素值为 0 的 **任一**  下标处。

注意，不管是什么情况下，你都无法跳到数组之外。



**示例 1：** 

```
输入：arr = [4,2,3,0,3,1,2], start = 5
输出：true
解释：
到达值为 0 的下标 3 有以下可能方案： 
下标 5 -> 下标 4 -> 下标 1 -> 下标 3 
下标 5 -> 下标 6 -> 下标 4 -> 下标 1 -> 下标 3 

```

**示例 2：** 

```
输入：arr = [4,2,3,0,3,1,2], start = 0
输出：true 
解释：到达值为 0 的下标 3 有以下可能方案： 
下标 0 -> 下标 4 -> 下标 1 -> 下标 3

```

**示例 3：** 

```
输入：arr = [3,0,2,1,2], start = 2
输出：false
解释：无法到达值为 0 的下标 1 处。 

```



**提示：** 

-  *1 <= arr.length <= 5 * 10^4*  
-  *0 <= arr[i] < arr.length*  
-  *0 <= start < arr.length* 




# 算法思路

# 测试用例
```
1306. Jump Game III 1306. 跳跃游戏 III Medium
```

[enTitle]: https://leetcode.com/problems/jump-game-iii/
[cnTitle]: https://leetcode-cn.com/problems/jump-game-iii/
