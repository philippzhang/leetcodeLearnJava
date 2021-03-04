# [1388. Pizza With 3n Slices][enTitle]

**Hard**

There is a pizza with 3n slices of varying size, you and your friends will take slices of pizza as follows:

- You will pick **any**  pizza slice. 
- Your friend Alice will pick next slice in anti clockwise direction of your pick.  
- Your friend Bob will pick next slice in clockwise direction of your pick. 
- Repeat until there are no more slices of pizzas.

Sizes of Pizza slices is represented by circular array  *slices*  in clockwise direction.

Return the maximum possible sum of slice sizes which you can have.



**Example 1:** 

![img](https://assets.leetcode.com/uploads/2020/02/18/sample_3_1723.png)

```
Input: slices = [1,2,3,4,5,6]
Output: 10
Explanation: Pick pizza slice of size 4, Alice and Bob will pick slices with size 3 and 5 respectively. Then Pick slices with size 6, finally Alice and Bob will pick slice of size 2 and 1 respectively. Total = 4 + 6.

```

**Example 2:** 

![img](https://assets.leetcode.com/uploads/2020/02/18/sample_4_1723.png)

```
Input: slices = [8,9,8,6,1,1]
Output: 16
Output: Pick pizza slice of size 8 in each turn. If you pick slice with size 9 your partners will pick slices of size 8.

```

**Example 3:** 

```
Input: slices = [4,1,2,5,8,3,1,9,7]
Output: 21

```

**Example 4:** 

```
Input: slices = [3,1,2]
Output: 3

```



**Constraints:** 

-  *1 <= slices.length <= 500*  
-  *slices.length % 3 == 0*  
-  *1 <= slices[i] <= 1000* 


# [1388. 3n 块披萨][cnTitle]

**困难**

给你一个披萨，它由 3n 块不同大小的部分组成，现在你和你的朋友们需要按照如下规则来分披萨：

- 你挑选 **任意**  一块披萨。 
- Alice 将会挑选你所选择的披萨逆时针方向的下一块披萨。 
- Bob 将会挑选你所选择的披萨顺时针方向的下一块披萨。 
- 重复上述过程直到没有披萨剩下。

每一块披萨的大小按顺时针方向由循环数组  *slices*  表示。

请你返回你可以获得的披萨大小总和的最大值。



**示例 1：** 

![img](https://assets.leetcode-cn.com/aliyun-lc-upload/uploads/2020/03/21/sample_3_1723.png)

```
输入：slices = [1,2,3,4,5,6]
输出：10
解释：选择大小为 4 的披萨，Alice 和 Bob 分别挑选大小为 3 和 5 的披萨。然后你选择大小为 6 的披萨，Alice 和 Bob 分别挑选大小为 2 和 1 的披萨。你获得的披萨总大小为 4 + 6 = 10 。

```

**示例 2：** 

![img](https://assets.leetcode-cn.com/aliyun-lc-upload/uploads/2020/03/21/sample_4_1723.png)

```
输入：slices = [8,9,8,6,1,1]
输出：16
解释：两轮都选大小为 8 的披萨。如果你选择大小为 9 的披萨，你的朋友们就会选择大小为 8 的披萨，这种情况下你的总和不是最大的。

```

**示例 3：** 

```
输入：slices = [4,1,2,5,8,3,1,9,7]
输出：21

```

**示例 4：** 

```
输入：slices = [3,1,2]
输出：3

```



**提示：** 

-  *1 <= slices.length <= 500*  
-  *slices.length % 3 == 0*  
-  *1 <= slices[i] <= 1000* 




# 算法思路

# 测试用例
```
1388. Pizza With 3n Slices 1388. 3n 块披萨 Hard
```

[enTitle]: https://leetcode.com/problems/pizza-with-3n-slices/
[cnTitle]: https://leetcode-cn.com/problems/pizza-with-3n-slices/
