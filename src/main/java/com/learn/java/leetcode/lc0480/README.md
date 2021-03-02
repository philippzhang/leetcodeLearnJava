# [480. Sliding Window Median][enTitle]

**Hard**

Median is the middle value in an ordered integer list. If the size of the list is even, there is no middle value. So the median is the mean of the two middle value.

 *[2,3,4]*  , the median is  *3* 

 *[2,3]* , the median is  *(2 + 3) / 2 = 2.5* 

Given an array nums, there is a sliding window of size k which is moving from the very left of the array to the very right. You can only see the k numbers in the window. Each time the sliding window moves right by one position. Your job is to output the median array for each window in the original array.

For example, Given nums =  *[1,3,-1,-3,5,3,6,7]* , and k = 3.

```
Window position                Median
---------------               -----
[1  3  -1] -3  5  3  6  7       1
 1 [3  -1  -3] 5  3  6  7       -1
 1  3 [-1  -3  5] 3  6  7       -1
 1  3  -1 [-3  5  3] 6  7       3
 1  3  -1  -3 [5  3  6] 7       5
 1  3  -1  -3  5 [3  6  7]      6

```

Therefore, return the median sliding window as  *[1,-1,-1,3,5,6]* .

Note: You may assume  *k*  is always valid, ie:  *k*  is always smaller than input array's size for non-empty array. Answers within  *10^-5*  of the actual value will be accepted as correct.


# [480. 滑动窗口中位数][cnTitle]

**困难**

中位数是有序序列最中间的那个数。如果序列的长度是偶数，则没有最中间的数；此时中位数是最中间的两个数的平均数。

例如：

-  *[2,3,4]* ，中位数是  *3*  
-  *[2,3]* ，中位数是  *(2 + 3) / 2 = 2.5* 

给你一个数组  *nums* ，有一个长度为  *k*  的窗口从最左端滑动到最右端。窗口中有  *k*  个数，每次窗口向右移动  *1*  位。你的任务是找出每次窗口移动后得到的新窗口中元素的中位数，并输出由它们组成的数组。



**示例：** 

给出  *nums*  =  *[1,3,-1,-3,5,3,6,7]* ，以及  *k*  = 3。

```
窗口位置                      中位数
---------------               -----
[1  3  -1] -3  5  3  6  7       1
 1 [3  -1  -3] 5  3  6  7      -1
 1  3 [-1  -3  5] 3  6  7      -1
 1  3  -1 [-3  5  3] 6  7       3
 1  3  -1  -3 [5  3  6] 7       5
 1  3  -1  -3  5 [3  6  7]      6

```

因此，返回该滑动窗口的中位数数组  *[1,-1,-1,3,5,6]* 。



**提示：** 

- 你可以假设  *k*  始终有效，即： *k*  始终小于等于输入的非空数组的元素个数。 
- 与真实值误差在  *10 ^ -5*  以内的答案将被视作正确答案。




# 算法思路

# 测试用例
```
480. Sliding Window Median 480. 滑动窗口中位数 Hard
```

[enTitle]: https://leetcode.com/problems/sliding-window-median/
[cnTitle]: https://leetcode-cn.com/problems/sliding-window-median/
