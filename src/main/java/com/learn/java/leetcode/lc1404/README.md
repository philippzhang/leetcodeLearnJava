# [1404. Number of Steps to Reduce a Number in Binary Representation to One][enTitle]

**Medium**

Given a number  *s*  in their binary representation. Return the number of steps to reduce it to 1 under the following rules:

-  If the current number is even, you have to divide it by 2.  
-  If the current number is odd, you have to add 1 to it. 

It's guaranteed that you can always reach to one for all testcases.



**Example 1:** 

```
Input: s = "1101"
Output: 6
Explanation: "1101" corressponds to number 13 in their decimal representation.
Step 1) 13 is odd, add 1 and obtain 14. 
Step 2) 14 is even, divide by 2 and obtain 7.
Step 3) 7 is odd, add 1 and obtain 8.
Step 4) 8 is even, divide by 2 and obtain 4.  
Step 5) 4 is even, divide by 2 and obtain 2. 
Step 6) 2 is even, divide by 2 and obtain 1.  

```

**Example 2:** 

```
Input: s = "10"
Output: 1
Explanation: "10" corressponds to number 2 in their decimal representation.
Step 1) 2 is even, divide by 2 and obtain 1.  

```

**Example 3:** 

```
Input: s = "1"
Output: 0

```



**Constraints:** 

-  *1 <= s.length <= 500*  
-  *s*  consists of characters '0' or '1' 
-  *s[0] == '1'* 


# [1404. 将二进制表示减到 1 的步骤数][cnTitle]

**中等**

给你一个以二进制形式表示的数字  *s*  。请你返回按下述规则将其减少到 1 所需要的步骤数：

-  如果当前数字为偶数，则将其除以 2 。  
-  如果当前数字为奇数，则将其加上 1 。 

题目保证你总是可以按上述规则将测试用例变为 1 。



**示例 1：** 

```
输入：s = "1101"
输出：6
解释："1101" 表示十进制数 13 。
Step 1) 13 是奇数，加 1 得到 14 
Step 2) 14 是偶数，除 2 得到 7
Step 3) 7  是奇数，加 1 得到 8
Step 4) 8  是偶数，除 2 得到 4  
Step 5) 4  是偶数，除 2 得到 2 
Step 6) 2  是偶数，除 2 得到 1  

```

**示例 2：** 

```
输入：s = "10"
输出：1
解释："10" 表示十进制数 2 。
Step 1) 2 是偶数，除 2 得到 1 

```

**示例 3：** 

```
输入：s = "1"
输出：0

```



**提示：** 

-  *1 <= s.length <= 500*  
-  *s*  由字符  *'0'*  或  *'1'*  组成。 
-  *s[0] == '1'* 




# 算法思路

# 测试用例
```
1404. Number of Steps to Reduce a Number in Binary Representation to One 1404. 将二进制表示减到 1 的步骤数 Medium
```

[enTitle]: https://leetcode.com/problems/number-of-steps-to-reduce-a-number-in-binary-representation-to-one/
[cnTitle]: https://leetcode-cn.com/problems/number-of-steps-to-reduce-a-number-in-binary-representation-to-one/
