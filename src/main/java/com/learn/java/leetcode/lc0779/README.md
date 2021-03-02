# [779. K-th Symbol in Grammar][enTitle]

**Medium**

On the first row, we write a  *0* . Now in every subsequent row, we look at the previous row and replace each occurrence of  *0*  with  *01* , and each occurrence of  *1*  with  *10* .

Given row  *N*  and index  *K* , return the  *K* -th indexed symbol in row  *N* . (The values of  *K*  are 1-indexed.) (1 indexed).

```
Examples:
Input: N = 1, K = 1
Output: 0

Input: N = 2, K = 1
Output: 0

Input: N = 2, K = 2
Output: 1

Input: N = 4, K = 5
Output: 1

Explanation:
row 1: 0
row 2: 01
row 3: 0110
row 4: 01101001

```

**Note:** 

1.  *N*  will be an integer in the range  *[1, 30]* . 
2.  *K*  will be an integer in the range  *[1, 2^(N-1)]* .


# [779. 第K个语法符号][cnTitle]

**中等**

在第一行我们写上一个  *0* 。接下来的每一行，将前一行中的 *0* 替换为 *01* ， *1* 替换为 *10* 。

给定行数  *N*  和序数  *K* ，返回第  *N*  行中第  *K* 个字符。（ *K* 从1开始）

 **例子:** 

```
输入: N = 1, K = 1
输出: 0

输入: N = 2, K = 1
输出: 0

输入: N = 2, K = 2
输出: 1

输入: N = 4, K = 5
输出: 1

解释:
第一行: 0
第二行: 01
第三行: 0110
第四行: 01101001

```

 **注意：** 

1.  *N*  的范围  *[1, 30]* . 
2.  *K*  的范围  *[1, 2^(N-1)]* .




# 算法思路

# 测试用例
```
779. K-th Symbol in Grammar 779. 第K个语法符号 Medium
```

[enTitle]: https://leetcode.com/problems/k-th-symbol-in-grammar/
[cnTitle]: https://leetcode-cn.com/problems/k-th-symbol-in-grammar/
