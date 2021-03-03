# [902. Numbers At Most N Given Digit Set][enTitle]

**Hard**

Given an array of  *digits*  which is sorted in **non-decreasing**  order. You can write numbers using each  *digits[i]*  as many times as we want. For example, if  *digits = ['1','3','5']* , we may write numbers such as  *'13'* ,  *'551'* , and  *'1351315'* .

Return  *the number of positive integers that can be generated* that are less than or equal to a given integer  *n* .



**Example 1:** 

```
Input: digits = ["1","3","5","7"], n = 100
Output: 20
Explanation:
The 20 numbers that can be written are:
1, 3, 5, 7, 11, 13, 15, 17, 31, 33, 35, 37, 51, 53, 55, 57, 71, 73, 75, 77.

```

**Example 2:** 

```
Input: digits = ["1","4","9"], n = 1000000000
Output: 29523
Explanation:
We can write 3 one digit numbers, 9 two digit numbers, 27 three digit numbers,
81 four digit numbers, 243 five digit numbers, 729 six digit numbers,
2187 seven digit numbers, 6561 eight digit numbers, and 19683 nine digit numbers.
In total, this is 29523 integers that can be written using the digits array.

```

**Example 3:** 

```
Input: digits = ["7"], n = 8
Output: 1

```



**Constraints:** 

-  *1 <= digits.length <= 9*  
-  *digits[i].length == 1*  
-  *digits[i]*  is a digit from  *'1'*  to  *'9'* . 
- All the values in  *digits*  are **unique** . 
-  *digits*  is sorted in **non-decreasing**  order. 
-  *1 <= n <= 109* 


# [902. 最大为 N 的数字组合][cnTitle]

**困难**

我们有一组**排序的** 数字  *D* ，它是  *{'1','2','3','4','5','6','7','8','9'}*  的非空子集。（请注意， *'0'*  不包括在内。）

现在，我们用这些数字进行组合写数字，想用多少次就用多少次。例如  *D = {'1','3','5'}* ，我们可以写出像  *'13', '551', '1351315'*  这样的数字。

返回可以用  *D*  中的数字写出的小于或等于  *N*  的正整数的数目。



**示例 1：** 

```
输入：D = ["1","3","5","7"], N = 100
输出：20
解释：
可写出的 20 个数字是：
1, 3, 5, 7, 11, 13, 15, 17, 31, 33, 35, 37, 51, 53, 55, 57, 71, 73, 75, 77.

```

**示例 2：** 

```
输入：D = ["1","4","9"], N = 1000000000
输出：29523
解释：
我们可以写 3 个一位数字，9 个两位数字，27 个三位数字，
81 个四位数字，243 个五位数字，729 个六位数字，
2187 个七位数字，6561 个八位数字和 19683 个九位数字。
总共，可以使用D中的数字写出 29523 个整数。
```



**提示：** 

1.  *D*  是按排序顺序的数字  *'1'-'9'*  的子集。 
2.  *1 <= N <= 10^9* 




# 算法思路

# 测试用例
```
902. Numbers At Most N Given Digit Set 902. 最大为 N 的数字组合 Hard
```

[enTitle]: https://leetcode.com/problems/numbers-at-most-n-given-digit-set/
[cnTitle]: https://leetcode-cn.com/problems/numbers-at-most-n-given-digit-set/
