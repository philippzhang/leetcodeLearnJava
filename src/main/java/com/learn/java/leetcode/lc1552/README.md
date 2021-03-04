# [1552. Magnetic Force Between Two Balls][enTitle]

**Medium**

In universe Earth C-137, Rick discovered a special form of magnetic force between two balls if they are put in his new invented basket. Rick has  *n*  empty baskets, the  *ith*  basket is at  *position[i]* , Morty has  *m*  balls and needs to distribute the balls into the baskets such that the **minimum magnetic force**  between any two balls is **maximum** .

Rick stated that magnetic force between two different balls at positions  *x*  and  *y*  is  *|x - y|* .

Given the integer array  *position*  and the integer  *m* . Return  *the required force* .



**Example 1:** 

![img](https://assets.leetcode.com/uploads/2020/08/11/q3v1.jpg)

```
Input: position = [1,2,3,4,7], m = 3
Output: 3
Explanation: Distributing the 3 balls into baskets 1, 4 and 7 will make the magnetic force between ball pairs [3, 3, 6]. The minimum magnetic force is 3. We cannot achieve a larger minimum magnetic force than 3.

```

**Example 2:** 

```
Input: position = [5,4,3,2,1,1000000000], m = 2
Output: 999999999
Explanation: We can use baskets 1 and 1000000000.

```



**Constraints:** 

-  *n == position.length*  
-  *2 <= n <= 10^5*  
-  *1 <= position[i] <= 10^9*  
- All integers in  *position*  are **distinct** . 
-  *2 <= m <= position.length* 


# [1552. 两球之间的磁力][cnTitle]

**中等**

在代号为 C-137 的地球上，Rick 发现如果他将两个球放在他新发明的篮子里，它们之间会形成特殊形式的磁力。Rick 有  *n*  个空的篮子，第  *i*  个篮子的位置在  *position[i]*  ，Morty 想把  *m*  个球放到这些篮子里，使得任意两球间 **最小磁力**  最大。

已知两个球如果分别位于  *x*  和  *y*  ，那么它们之间的磁力为  *|x - y|*  。

给你一个整数数组  *position*  和一个整数  *m*  ，请你返回最大化的最小磁力。



**示例 1：** 

![img](https://assets.leetcode-cn.com/aliyun-lc-upload/uploads/2020/08/16/q3v1.jpg)

```
输入：position = [1,2,3,4,7], m = 3
输出：3
解释：将 3 个球分别放入位于 1，4 和 7 的三个篮子，两球间的磁力分别为 [3, 3, 6]。最小磁力为 3 。我们没办法让最小磁力大于 3 。

```

**示例 2：** 

```
输入：position = [5,4,3,2,1,1000000000], m = 2
输出：999999999
解释：我们使用位于 1 和 1000000000 的篮子时最小磁力最大。

```



**提示：** 

-  *n == position.length*  
-  *2 <= n <= 10^5*  
-  *1 <= position[i] <= 10^9*  
- 所有  *position*  中的整数 **互不相同**  。 
-  *2 <= m <= position.length* 




# 算法思路

# 测试用例
```
1552. Magnetic Force Between Two Balls 1552. 两球之间的磁力 Medium
```

[enTitle]: https://leetcode.com/problems/magnetic-force-between-two-balls/
[cnTitle]: https://leetcode-cn.com/problems/magnetic-force-between-two-balls/
