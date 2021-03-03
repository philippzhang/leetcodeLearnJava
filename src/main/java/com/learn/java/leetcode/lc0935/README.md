# [935. Knight Dialer][enTitle]

**Medium**

The chess knight has a **unique movement** , it may move two squares vertically and one square horizontally, or two squares horizontally and one square vertically (with both forming the shape of an **L** ). The possible movements of chess knight are shown in this diagaram:

A chess knight can move as indicated in the chess diagram below:

![img](https://assets.leetcode.com/uploads/2020/08/18/chess.jpg)

We have a chess knight and a phone pad as shown below, the knight **can only stand on a numeric cell**  (i.e. blue cell).

![img](https://assets.leetcode.com/uploads/2020/08/18/phone.jpg)

Given an integer  *n* , return how many distinct phone numbers of length  *n*  we can dial.

You are allowed to place the knight **on any numeric cell**  initially and then you should perform  *n - 1*  jumps to dial a number of length  *n* . All jumps should be **valid**  knight jumps.

As the answer may be very large, **return the answer modulo**   *109 + 7* .



**Example 1:** 

```
Input: n = 1
Output: 10
Explanation: We need to dial a number of length 1, so placing the knight over any numeric cell of the 10 cells is sufficient.

```

**Example 2:** 

```
Input: n = 2
Output: 20
Explanation: All the valid number we can dial are [04, 06, 16, 18, 27, 29, 34, 38, 40, 43, 49, 60, 61, 67, 72, 76, 81, 83, 92, 94]

```

**Example 3:** 

```
Input: n = 3
Output: 46

```

**Example 4:** 

```
Input: n = 4
Output: 104

```

**Example 5:** 

```
Input: n = 3131
Output: 136006598
Explanation: Please take care of the mod.

```



**Constraints:** 

-  *1 <= n <= 5000* 


# [935. 骑士拨号器][cnTitle]

**中等**

国际象棋中的骑士可以按下图所示进行移动：

![img](https://assets.leetcode-cn.com/aliyun-lc-upload/uploads/2018/11/03/knight.png) . ![img](https://assets.leetcode-cn.com/aliyun-lc-upload/uploads/2018/11/03/keypad.png)

 这一次，我们将 “骑士” 放在电话拨号盘的任意数字键（如上图所示）上，接下来，骑士将会跳 N-1 步。每一步必须是从一个数字键跳到另一个数字键。

每当它落在一个键上（包括骑士的初始位置），都会拨出键所对应的数字，总共按下  *N*  位数字。

你能用这种方式拨出多少个不同的号码？

因为答案可能很大，**所以输出答案模 10^9 + 7** 。





**示例 1：** 

```
输入：1
输出：10

```

**示例 2：** 

```
输入：2
输出：20

```

**示例 3：** 

```
输入：3
输出：46

```



**提示：** 

-  *1 <= N <= 5000* 




# 算法思路

# 测试用例
```
935. Knight Dialer 935. 骑士拨号器 Medium
```

[enTitle]: https://leetcode.com/problems/knight-dialer/
[cnTitle]: https://leetcode-cn.com/problems/knight-dialer/
