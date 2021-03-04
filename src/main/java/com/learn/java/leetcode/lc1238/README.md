# [1238. Circular Permutation in Binary Representation][enTitle]

**Medium**

Given 2 integers  *n*  and  *start* . Your task is return **any**  permutation  *p*  of  *(0,1,2.....,2^n -1)* such that :

-  *p[0] = start*  
-  *p[i]*  and  *p[i+1]*  differ by only one bit in their binary representation. 
-  *p[0]*  and  *p[2^n -1]*  must also differ by only one bit in their binary representation.



**Example 1:** 

```
Input: n = 2, start = 3
Output: [3,2,0,1]
Explanation: The binary representation of the permutation is (11,10,00,01). 
All the adjacent element differ by one bit. Another valid permutation is [3,1,0,2]

```

**Example 2:** 

```
Input: n = 3, start = 2
Output: [2,6,7,5,4,0,1,3]
Explanation: The binary representation of the permutation is (010,110,111,101,100,000,001,011).

```



**Constraints:** 

-  *1 <= n <= 16*  
-  *0 <= start < 2 ^ n* 


# [1238. 循环码排列][cnTitle]

**中等**

给你两个整数  *n*  和  *start* 。你的任务是返回任意  *(0,1,2,,...,2^n-1)*  的排列  *p* ，并且满足：

-  *p[0] = start*  
-  *p[i]*  和  *p[i+1]*  的二进制表示形式只有一位不同 
-  *p[0]*  和  *p[2^n -1]*  的二进制表示形式也只有一位不同



**示例 1：** 

```
输入：n = 2, start = 3
输出：[3,2,0,1]
解释：这个排列的二进制表示是 (11,10,00,01)
     所有的相邻元素都有一位是不同的，另一个有效的排列是 [3,1,0,2]

```

**示例 2：** 

```
输出：n = 3, start = 2
输出：[2,6,7,5,4,0,1,3]
解释：这个排列的二进制表示是 (010,110,111,101,100,000,001,011)

```



**提示：** 

-  *1 <= n <= 16*  
-  *0 <= start < 2^n* 




# 算法思路

# 测试用例
```
1238. Circular Permutation in Binary Representation 1238. 循环码排列 Medium
```

[enTitle]: https://leetcode.com/problems/circular-permutation-in-binary-representation/
[cnTitle]: https://leetcode-cn.com/problems/circular-permutation-in-binary-representation/
