# [1320. Minimum Distance to Type a Word Using Two Fingers][enTitle]

**Hard**

![img](https://assets.leetcode.com/uploads/2020/01/02/leetcode_keyboard.png)

You have a keyboard layout as shown above in the XY plane, where each English uppercase letter is located at some coordinate, for example, the letter **A**  is located at coordinate **(0,0)** , the letter **B**  is located at coordinate **(0,1)** , the letter **P**  is located at coordinate **(2,3)**  and the letter **Z**  is located at coordinate **(4,1)** .

Given the string  *word* , return the minimum total distance to type such string using only two fingers. The distance between coordinates **(x1,y1)**  and **(x2,y2)**  is **|x1 - x2| + |y1 - y2|** .

Note that the initial positions of your two fingers are considered free so don't count towards your total distance, also your two fingers do not have to start at the first letter or the first two letters.



**Example 1:** 

```
Input: word = "CAKE"
Output: 3
Explanation:Using two fingers, one optimal way to type "CAKE" is: 
Finger 1 on letter 'C' -> cost = 0 
Finger 1 on letter 'A' -> cost = Distance from letter 'C' to letter 'A' = 2 
Finger 2 on letter 'K' -> cost = 0 
Finger 2 on letter 'E' -> cost = Distance from letter 'K' to letter 'E' = 1 
Total distance = 3

```

**Example 2:** 

```
Input: word = "HAPPY"
Output: 6
Explanation:
Using two fingers, one optimal way to type "HAPPY" is:
Finger 1 on letter 'H' -> cost = 0
Finger 1 on letter 'A' -> cost = Distance from letter 'H' to letter 'A' = 2
Finger 2 on letter 'P' -> cost = 0
Finger 2 on letter 'P' -> cost = Distance from letter 'P' to letter 'P' = 0
Finger 1 on letter 'Y' -> cost = Distance from letter 'A' to letter 'Y' = 4
Total distance = 6

```

**Example 3:** 

```
Input: word = "NEW"
Output: 3

```

**Example 4:** 

```
Input: word = "YEAR"
Output: 7

```



**Constraints:** 

-  *2 <= word.length <= 300*  
- Each  *word[i]*  is an English uppercase letter.


# [1320. 二指输入的的最小距离][cnTitle]

**困难**

![img](https://assets.leetcode-cn.com/aliyun-lc-upload/uploads/2020/01/11/leetcode_keyboard.png)

二指输入法定制键盘在 XY 平面上的布局如上图所示，其中每个大写英文字母都位于某个坐标处，例如字母 **A**  位于坐标 **(0,0)** ，字母 **B**  位于坐标 **(0,1)** ，字母 **P**  位于坐标 **(2,3)**  且字母 **Z**  位于坐标 **(4,1)** 。

给你一个待输入字符串  *word* ，请你计算并返回在仅使用两根手指的情况下，键入该字符串需要的最小移动总距离。坐标 **(x1,y1)**  和 **(x2,y2)**  之间的距离是 **|x1 - x2| + |y1 - y2|** 。

注意，两根手指的起始位置是零代价的，不计入移动总距离。你的两根手指的起始位置也不必从首字母或者前两个字母开始。



**示例 1：** 

```
输入：word = "CAKE"
输出：3
解释：使用两根手指输入 "CAKE" 的最佳方案之一是： 
手指 1 在字母 'C' 上 -> 移动距离 = 0 
手指 1 在字母 'A' 上 -> 移动距离 = 从字母 'C' 到字母 'A' 的距离 = 2 
手指 2 在字母 'K' 上 -> 移动距离 = 0 
手指 2 在字母 'E' 上 -> 移动距离 = 从字母 'K' 到字母 'E' 的距离  = 1 
总距离 = 3

```

**示例 2：** 

```
输入：word = "HAPPY"
输出：6
解释：
使用两根手指输入 "HAPPY" 的最佳方案之一是：
手指 1 在字母 'H' 上 -> 移动距离 = 0
手指 1 在字母 'A' 上 -> 移动距离 = 从字母 'H' 到字母 'A' 的距离 = 2
手指 2 在字母 'P' 上 -> 移动距离 = 0
手指 2 在字母 'P' 上 -> 移动距离 = 从字母 'P' 到字母 'P' 的距离 = 0
手指 1 在字母 'Y' 上 -> 移动距离 = 从字母 'A' 到字母 'Y' 的距离 = 4
总距离 = 6

```

**示例 3：** 

```
输入：word = "NEW"
输出：3

```

**示例 4：** 

```
输入：word = "YEAR"
输出：7

```



**提示：** 

-  *2 <= word.length <= 300*  
- 每个  *word[i]*  都是一个大写英文字母。




# 算法思路

# 测试用例
```
1320. Minimum Distance to Type a Word Using Two Fingers 1320. 二指输入的的最小距离 Hard
```

[enTitle]: https://leetcode.com/problems/minimum-distance-to-type-a-word-using-two-fingers/
[cnTitle]: https://leetcode-cn.com/problems/minimum-distance-to-type-a-word-using-two-fingers/
