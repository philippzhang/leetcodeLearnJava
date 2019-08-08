# [335. Self Crossing][enTitle]

**Hard**

You are given an array x of  *n*  positive numbers. You start at point  *(0,0)*  and moves  *x[0]*  metres to the north, then  *x[1]*  metres to the west,  *x[2]*  metres to the south,  *x[3]*  metres to the east and so on. In other words, after each move your direction changes counter-clockwise.

Write a one-pass algorithm with  *O(1)*  extra space to determine, if your path crosses itself, or not.



Example 1:

```
┌───┐
│   │
└───┼──>
    │

Input:[2,1,1,2]
Output:true

```

Example 2:

```
┌──────┐
│      │
│
│
└────────────>

Input: [1,2,3,4]
Output:false 

```

Example 3:

```
┌───┐
│   │
└───┼>

Input: [1,1,1,1]
Output: true 

```


# [335. 路径交叉][cnTitle]

**困难**

给定一个含有  *n*  个正数的数组  *x* 。从点  *(0,0)*  开始，先向北移动  *x[0]*  米，然后向西移动  *x[1]*  米，向南移动  *x[2]*  米，向东移动  *x[3]*  米，持续移动。也就是说，每次移动后你的方位会发生逆时针变化。

编写一个  *O(1)*  空间复杂度的一趟扫描算法，判断你所经过的路径是否相交。



**示例 1:** 

```
┌───┐
│   │
└───┼──>
    │

输入:[2,1,1,2]
输出: true 

```

**示例 2:** 

```
┌──────┐
│      │
│
│
└────────────>

输入:[1,2,3,4]
输出:false 

```

**示例 3:** 

```
┌───┐
│   │
└───┼>

输入: [1,1,1,1]
输出: true 

```




# 算法思路

# 测试用例
```
335. Self Crossing 335. 路径交叉 Hard
```

[enTitle]: https://leetcode.com/problems/self-crossing/
[cnTitle]: https://leetcode-cn.com/problems/self-crossing/
