# [975. Odd Even Jump][enTitle]

**Hard**

You are given an integer array  *A* . From some starting index, you can make a series of jumps. The (1st, 3rd, 5th, ...) jumps in the series are called  *odd numbered jumps* , and the (2nd, 4th, 6th, ...) jumps in the series are called  *even numbered jumps* .

You may from index  *i*  jump forward to index  *j*  (with  *i < j* ) in the following way:

- During odd numbered jumps (ie. jumps 1, 3, 5, ...), you jump to the index j such that  *A[i] <= A[j]*  and  *A[j]*  is the smallest possible value. If there are multiple such indexes <code>j</code>, you can only jump to the **smallest**  such index <code>j</code>. 
- During even numbered jumps (ie. jumps 2, 4, 6, ...), you jump to the index j such that  *A[i] >= A[j]*  and  *A[j]*  is the largest possible value. If there are multiple such indexes <code>j</code>, you can only jump to the **smallest**  such index <code>j</code>. 
- (It may be the case that for some index  *i,*  there are no legal jumps.)

A starting index is  *good*  if, starting from that index, you can reach the end of the array (index  *A.length - 1* ) by jumping some number of times (possibly 0 or more than once.)

Return the number of good starting indexes.



**Example 1:** 

```
Input:[10,13,12,14,15]
Output: 2
Explanation: 
From starting index i = 0, we can jump to i = 2 (since A[2] is the smallest among A[1], A[2], A[3], A[4] that is greater or equal to A[0]), then we can't jump any more.
From starting index i = 1 and i = 2, we can jump to i = 3, then we can't jump any more.
From starting index i = 3, we can jump to i = 4, so we've reached the end.
From starting index i = 4, we've reached the end already.
In total, there are 2 different starting indexes (i = 3, i = 4) where we can reach the end with some number of jumps.
```


**Example 2:** 

```
Input:[2,3,1,1,4]
Output: 3
Explanation: 
From starting index i = 0, we make jumps to i = 1, i = 2, i = 3:

During our 1st jump (odd numbered), we first jump to i = 1 because A[1] is the smallest value in (A[1], A[2], A[3], A[4]) that is greater than or equal to A[0].

During our 2nd jump (even numbered), we jump from i = 1 to i = 2 because A[2] is the largest value in (A[2], A[3], A[4]) that is less than or equal to A[1].  A[3] is also the largest value, but 2 is a smaller index, so we can only jump to i = 2 and not i = 3.

During our 3rd jump (odd numbered), we jump from i = 2 to i = 3 because A[3] is the smallest value in (A[3], A[4]) that is greater than or equal to A[2].

We can't jump from i = 3 to i = 4, so the starting index i = 0 is not good.

In a similar manner, we can deduce that:
From starting index i = 1, we jump to i = 4, so we reach the end.
From starting index i = 2, we jump to i = 3, and then we can't jump anymore.
From starting index i = 3, we jump to i = 4, so we reach the end.
From starting index i = 4, we are already at the end.
In total, there are 3 different starting indexes (i = 1, i = 3, i = 4) where we can reach the end with some number of jumps.
```


**Example 3:** 

```
Input:[5,1,3,4,2]
Output: 3
Explanation: 
We can reach the end from starting indexes 1, 2, and 4.
```







**Note:** 

1.  *1 <= A.length <= 20000*  
2.  *0 <= A[i] < 100000* 


# [975. 奇偶跳][cnTitle]

**困难**

给定一个整数数组  *A* ，你可以从某一起始索引出发，跳跃一定次数。在你跳跃的过程中，第 1、3、5... 次跳跃称为奇数跳跃，而第 2、4、6... 次跳跃称为偶数跳跃。

你可以按以下方式从索引  *i*  向后跳转到索引  *j* （其中  *i < j* ）：

- 在进行奇数跳跃时（如，第 1，3，5... 次跳跃），你将会跳到索引  *j* ，使得  *A[i] <= A[j]* ， *A[j]*  是可能的最小值。如果存在多个这样的索引  *j* ，你只能跳到满足要求的**最小** 索引  *j*  上。 
- 在进行偶数跳跃时（如，第 2，4，6... 次跳跃），你将会跳到索引  *j* ，使得  *A[i] => A[j]* ， *A[j]*  是可能的最大值。如果存在多个这样的索引  *j* ，你只能跳到满足要求的**最小** 索引  *j*  上。 
- （对于某些索引  *i* ，可能无法进行合乎要求的跳跃。）

如果从某一索引开始跳跃一定次数（可能是 0 次或多次），就可以到达数组的末尾（索引  *A.length - 1* ），那么该索引就会被认为是好的起始索引。

返回好的起始索引的数量。



**示例 1：** 

```
输入：[10,13,12,14,15]
输出：2
解释：
从起始索引 i = 0 出发，我们可以跳到 i = 2，（因为 A[2] 是 A[1]，A[2]，A[3]，A[4] 中大于或等于 A[0] 的最小值），然后我们就无法继续跳下去了。
从起始索引 i = 1 和 i = 2 出发，我们可以跳到 i = 3，然后我们就无法继续跳下去了。
从起始索引 i = 3 出发，我们可以跳到 i = 4，到达数组末尾。
从起始索引 i = 4 出发，我们已经到达数组末尾。
总之，我们可以从 2 个不同的起始索引（i = 3, i = 4）出发，通过一定数量的跳跃到达数组末尾。

```

**示例 2：** 

```
输入：[2,3,1,1,4]
输出：3
解释：
从起始索引 i=0 出发，我们依次可以跳到 i = 1，i = 2，i = 3：

在我们的第一次跳跃（奇数）中，我们先跳到 i = 1，因为 A[1] 是（A[1]，A[2]，A[3]，A[4]）中大于或等于 A[0] 的最小值。

在我们的第二次跳跃（偶数）中，我们从 i = 1 跳到 i = 2，因为 A[2] 是（A[2]，A[3]，A[4]）中小于或等于 A[1] 的最大值。A[3] 也是最大的值，但 2 是一个较小的索引，所以我们只能跳到 i = 2，而不能跳到 i = 3。

在我们的第三次跳跃（奇数）中，我们从 i = 2 跳到 i = 3，因为 A[3] 是（A[3]，A[4]）中大于或等于 A[2] 的最小值。

我们不能从 i = 3 跳到 i = 4，所以起始索引 i = 0 不是好的起始索引。

类似地，我们可以推断：
从起始索引 i = 1 出发， 我们跳到 i = 4，这样我们就到达数组末尾。
从起始索引 i = 2 出发， 我们跳到 i = 3，然后我们就不能再跳了。
从起始索引 i = 3 出发， 我们跳到 i = 4，这样我们就到达数组末尾。
从起始索引 i = 4 出发，我们已经到达数组末尾。
总之，我们可以从 3 个不同的起始索引（i = 1, i = 3, i = 4）出发，通过一定数量的跳跃到达数组末尾。

```

**示例 3：** 

```
输入：[5,1,3,4,2]
输出：3
解释：
我们可以从起始索引 1，2，4 出发到达数组末尾。

```



**提示：** 

1.  *1 <= A.length <= 20000*  
2.  *0 <= A[i] < 100000* 




# 算法思路

# 测试用例
```
975. Odd Even Jump 975. 奇偶跳 Hard
Solution.oddEvenJumps
---
[10,13,12,14,15]

=2
---
[2,3,1,1,4]

=3
---
[5,1,3,4,2]

=3
```

[enTitle]: https://leetcode.com/problems/odd-even-jump/
[cnTitle]: https://leetcode-cn.com/problems/odd-even-jump/
