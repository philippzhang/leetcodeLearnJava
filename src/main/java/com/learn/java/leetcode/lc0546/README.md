# [546. Remove Boxes][enTitle]

**Hard**

You are given several  *boxes*  with different colors represented by different positive numbers.

You may experience several rounds to remove boxes until there is no box left. Each time you can choose some continuous boxes with the same color (i.e., composed of  *k*  boxes,  *k >= 1* ), remove them and get  *k * k*  points.

Return  *the maximum points you can get* .



**Example 1:** 

```
Input: boxes = [1,3,2,2,2,3,4,3,1]
Output: 23
Explanation:
[1, 3, 2, 2, 2, 3, 4, 3, 1] 
----> [1, 3, 3, 4, 3, 1] (3*3=9 points) 
----> [1, 3, 3, 3, 1] (1*1=1 points) 
----> [1, 1] (3*3=9 points) 
----> [] (2*2=4 points)

```

**Example 2:** 

```
Input: boxes = [1,1,1]
Output: 9

```

**Example 3:** 

```
Input: boxes = [1]
Output: 1

```



**Constraints:** 

-  *1 <= boxes.length <= 100*  
-  *1 <= boxes[i] <= 100* 


# [546. 移除盒子][cnTitle]

**困难**

给出一些不同颜色的盒子，盒子的颜色由数字表示，即不同的数字表示不同的颜色。

你将经过若干轮操作去去掉盒子，直到所有的盒子都去掉为止。每一轮你可以移除具有相同颜色的连续  *k*  个盒子（ *k >= 1* ），这样一轮之后你将得到  *k * k*  个积分。

当你将所有盒子都去掉之后，求你能获得的最大积分和。



**示例 1：** 

```
输入：boxes = [1,3,2,2,2,3,4,3,1]
输出：23
解释：
[1, 3, 2, 2, 2, 3, 4, 3, 1] 
----> [1, 3, 3, 4, 3, 1] (3*3=9 分) 
----> [1, 3, 3, 3, 1] (1*1=1 分) 
----> [1, 1] (3*3=9 分) 
----> [] (2*2=4 分)

```

**示例 2：** 

```
输入：boxes = [1,1,1]
输出：9

```

**示例 3：** 

```
输入：boxes = [1]
输出：1

```



**提示：** 

-  *1 <= boxes.length <= 100*  
-  *1 <= boxes[i] <= 100* 




# 算法思路

# 测试用例
```
546. Remove Boxes 546. 移除盒子 Hard
```

[enTitle]: https://leetcode.com/problems/remove-boxes/
[cnTitle]: https://leetcode-cn.com/problems/remove-boxes/
