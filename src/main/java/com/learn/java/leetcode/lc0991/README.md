# [991. Broken Calculator][enTitle]

**Medium**

On a broken calculator that has a number showing on its display, we can perform two operations:

- **Double** : Multiply the number on the display by 2, or; 
- **Decrement** : Subtract 1 from the number on the display.

Initially, the calculator is displaying the number  *X* .

Return the minimum number of operations needed to display the number  *Y* .



**Example 1:** 

```
Input:X = 2, Y = 3
Output: 2
Explanation: Use double operation and then decrement operation {2 -> 4 -> 3}.
```

**Example 2:** 

```
Input:X = 5, Y = 8
Output: 2
Explanation: Use decrement and then double {5 -> 4 -> 8}.
```

**Example 3:** 

```
Input:X = 3, Y = 10
Output: 3
Explanation:  Use double, decrement and double {3 -> 6 -> 5 -> 10}.
```

**Example 4:** 

```
Input:X = 1024, Y = 1
Output: 1023
Explanation: Use decrement operations 1023 times.
```



**Note:** 

1.  *1 <= X <= 10^9*  
2.  *1 <= Y <= 10^9* 


# [991. 坏了的计算器][cnTitle]

**中等**

在显示着数字的坏计算器上，我们可以执行以下两种操作：

- **双倍（Double）：** 将显示屏上的数字乘 2； 
- **递减（Decrement）：** 将显示屏上的数字减 1 。

最初，计算器显示数字  *X* 。

返回显示数字  *Y*  所需的最小操作数。



**示例 1：** 

```
输入：X = 2, Y = 3
输出：2
解释：先进行双倍运算，然后再进行递减运算 {2 -> 4 -> 3}.

```

**示例 2：** 

```
输入：X = 5, Y = 8
输出：2
解释：先递减，再双倍 {5 -> 4 -> 8}.

```

**示例 3：** 

```
输入：X = 3, Y = 10
输出：3
解释：先双倍，然后递减，再双倍 {3 -> 6 -> 5 -> 10}.

```

**示例 4：** 

```
输入：X = 1024, Y = 1
输出：1023
解释：执行递减运算 1023 次

```



**提示：** 

1.  *1 <= X <= 10^9*  
2.  *1 <= Y <= 10^9* 




# 算法思路

# 测试用例
```
991. Broken Calculator 991. 坏了的计算器 Medium
```

[enTitle]: https://leetcode.com/problems/broken-calculator/
[cnTitle]: https://leetcode-cn.com/problems/broken-calculator/
