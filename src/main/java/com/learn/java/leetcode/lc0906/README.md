# [906. Super Palindromes][enTitle]

**Hard**

Let's say a positive integer is a **super-palindrome**  if it is a palindrome, and it is also the square of a palindrome.

Given two positive integers  *left*  and  *right*  represented as strings, return  *the number of super-palindromes integers in the inclusive range*   *[left, right]* .



**Example 1:** 

```
Input: left = "4", right = "1000"
Output: 4
Explanation: 4, 9, 121, and 484 are superpalindromes.
Note that 676 is not a superpalindrome: 26 * 26 = 676, but 26 is not a palindrome.

```

**Example 2:** 

```
Input: left = "1", right = "2"
Output: 1

```



**Constraints:** 

-  *1 <= left.length, right.length <= 18*  
-  *left*  and  *right*  consist of only digits. 
-  *left*  and  *right*  cannot have leading zeros. 
-  *left*  and  *right*  represent integers in the range  *[1, 1018]* . 
-  *left*  is less than or equal to  *right* .


# [906. 超级回文数][cnTitle]

**困难**

如果一个正整数自身是回文数，而且它也是一个回文数的平方，那么我们称这个数为超级回文数。

现在，给定两个正整数  *L*  和  *R*  （以字符串形式表示），返回包含在范围  *[L, R]*  中的超级回文数的数目。



**示例：** 

```
输入：L = "4", R = "1000"
输出：4
解释：4，9，121，以及 484 是超级回文数。
注意 676 不是一个超级回文数： 26 * 26 = 676，但是 26 不是回文数。
```



**提示：** 

1.  *1 <= len(L) <= 18*  
2.  *1 <= len(R) <= 18*  
3.  *L*  和  *R*  是表示  *[1, 10^18)*  范围的整数的字符串。 
4.  *int(L) <= int(R)* 






# 算法思路

# 测试用例
```
906. Super Palindromes 906. 超级回文数 Hard
```

[enTitle]: https://leetcode.com/problems/super-palindromes/
[cnTitle]: https://leetcode-cn.com/problems/super-palindromes/
