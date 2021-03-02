# [765. Couples Holding Hands][enTitle]

**Hard**

N couples sit in 2N seats arranged in a row and want to hold hands. We want to know the minimum number of swaps so that every couple is sitting side by side. A swap consists of choosing any two people, then they stand up and switch seats.

The people and seats are represented by an integer from  *0*  to  *2N-1* , the couples are numbered in order, the first couple being  *(0, 1)* , the second couple being  *(2, 3)* , and so on with the last couple being  *(2N-2, 2N-1)* .

The couples' initial seating is given by  *row[i]*  being the value of the person who is initially sitting in the i-th seat.

Example 1:

```
Input: row = [0, 2, 1, 3]
Output: 1
Explanation: We only need to swap the second (row[1]) and third (row[2]) person.

```



Example 2:

```
Input: row = [3, 2, 0, 1]
Output: 0
Explanation: All couples are already seated side by side.

```



Note:

1.   *len(row)*  is even and in the range of  *[4, 60]* . 
2.   *row*  is guaranteed to be a permutation of  *0...len(row)-1* .


# [765. 情侣牵手][cnTitle]

**困难**

N 对情侣坐在连续排列的 2N 个座位上，想要牵到对方的手。 计算最少交换座位的次数，以便每对情侣可以并肩坐在一起。  *一* 次交换可选择任意两人，让他们站起来交换座位。

人和座位用  *0*  到  *2N-1*  的整数表示，情侣们按顺序编号，第一对是  *(0, 1)* ，第二对是  *(2, 3)* ，以此类推，最后一对是  *(2N-2, 2N-1)* 。

这些情侣的初始座位  *row[i]*  是由最初始坐在第 i 个座位上的人决定的。

**示例 1:** 

```
输入: row = [0, 2, 1, 3]
输出: 1
解释: 我们只需要交换row[1]和row[2]的位置即可。

```

**示例 2:** 

```
输入: row = [3, 2, 0, 1]
输出: 0
解释: 无需交换座位，所有的情侣都已经可以手牵手了。

```

**说明:** 

1.  *len(row)*  是偶数且数值在  *[4, 60]* 范围内。 
2. 可以保证 *row*  是序列  *0...len(row)-1*  的一个全排列。




# 算法思路

# 测试用例
```
765. Couples Holding Hands 765. 情侣牵手 Hard
```

[enTitle]: https://leetcode.com/problems/couples-holding-hands/
[cnTitle]: https://leetcode-cn.com/problems/couples-holding-hands/
