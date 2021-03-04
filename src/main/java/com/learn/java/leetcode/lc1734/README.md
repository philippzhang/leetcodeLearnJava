# [1734. Decode XORed Permutation][enTitle]

**Medium**

There is an integer array  *perm*  that is a permutation of the first  *n*  positive integers, where  *n*  is always **odd** .

It was encoded into another integer array  *encoded*  of length  *n - 1* , such that  *encoded[i] = perm[i] XOR perm[i + 1]* . For example, if  *perm = [1,3,2]* , then  *encoded = [2,1]* .

Given the  *encoded*  array, return  *the original array*   *perm* . It is guaranteed that the answer exists and is unique.



**Example 1:** 

```
Input: encoded = [3,1]
Output: [1,2,3]
Explanation: If perm = [1,2,3], then encoded = [1 XOR 2,2 XOR 3] = [3,1]

```

**Example 2:** 

```
Input: encoded = [6,5,4,6]
Output: [2,4,1,5,3]

```



**Constraints:** 

-  *3 <= n < 105*  
-  *n*  is odd. 
-  *encoded.length == n - 1* 


# [1734. 解码异或后的排列][cnTitle]

**中等**

给你一个整数数组  *perm*  ，它是前  *n*  个正整数的排列，且  *n*  是个 **奇数**  。

它被加密成另一个长度为  *n - 1*  的整数数组  *encoded*  ，满足  *encoded[i] = perm[i] XOR perm[i + 1]*  。比方说，如果  *perm = [1,3,2]*  ，那么  *encoded = [2,1]*  。

给你  *encoded*  数组，请你返回原始数组  *perm*  。题目保证答案存在且唯一。



**示例 1：** 

```
输入：encoded = [3,1]
输出：[1,2,3]
解释：如果 perm = [1,2,3] ，那么 encoded = [1 XOR 2,2 XOR 3] = [3,1]

```

**示例 2：** 

```
输入：encoded = [6,5,4,6]
输出：[2,4,1,5,3]

```



**提示：** 

-  *3 <= n < 105*  
-  *n*  是奇数。 
-  *encoded.length == n - 1* 




# 算法思路

# 测试用例
```
1734. Decode XORed Permutation 1734. 解码异或后的排列 Medium
```

[enTitle]: https://leetcode.com/problems/decode-xored-permutation/
[cnTitle]: https://leetcode-cn.com/problems/decode-xored-permutation/
