# [1545. Find Kth Bit in Nth Binary String][enTitle]

**Medium**

Given two positive integers  *n*  and  *k* , the binary string  *Sn*  is formed as follows:

-  *S1 = "0"*  
-  *Si = Si-1 + "1" + reverse(invert(Si-1))*  for  *i > 1* 

Where  *+*  denotes the concatenation operation,  *reverse(x)*  returns the reversed string x, and  *invert(x)*  inverts all the bits in x (0 changes to 1 and 1 changes to 0).

For example, the first 4 strings in the above sequence are:

-  *S1 = "0"*  
-  *S2 = "011"*  
-  *S3 = "0111001"*  
-  *S4 = "011100110110001"* 

Return  *the*   *kth*   *bit*   *in*   *Sn* . It is guaranteed that  *k*  is valid for the given  *n* .



**Example 1:** 


<pre><strong>Input:</strong> n = 3, k = 1
<strong>Output:</strong> "0"
<strong>Explanation: </strong>S<sub>3</sub> is "<strong><u>0</u></strong>111001". The first bit is "0".
</pre>

**Example 2:** 


<pre><strong>Input:</strong> n = 4, k = 11
<strong>Output:</strong> "1"
<strong>Explanation: </strong>S<sub>4</sub> is "0111001101<strong><u>1</u></strong>0001". The 11th bit is "1".
</pre>

**Example 3:** 

```
Input: n = 1, k = 1
Output: "0"

```

**Example 4:** 

```
Input: n = 2, k = 3
Output: "1"

```



**Constraints:** 

-  *1 <= n <= 20*  
-  *1 <= k <= 2n - 1* 


# [1545. 找出第 N 个二进制字符串中的第 K 位][cnTitle]

**中等**

给你两个正整数  *n*  和  *k* ，二进制字符串  *Sn*  的形成规则如下：

-  *S1 = "0"*  
- 当  *i > 1*  时， *Si = Si-1 + "1" + reverse(invert(Si-1))* 

其中  *+*  表示串联操作， *reverse(x)*  返回反转  *x*  后得到的字符串，而  *invert(x)*  则会翻转 x 中的每一位（0 变为 1，而 1 变为 0）。

例如，符合上述描述的序列的前 4 个字符串依次是：

-  *S1 = "0"*  
-  *S2 = "011"*  
-  *S3 = "0111001"*  
-  *S4 = "011100110110001"* 

请你返回  *Sn*  的 **第 k 位字符**  ，题目数据保证  *k*  一定在  *Sn*  长度范围以内。



**示例 1：** 


<pre><strong>输入：</strong>n = 3, k = 1
<strong>输出：</strong>"0"
<strong>解释：</strong>S<sub>3</sub> 为 "<strong>0</strong>111001"，其第 1 位为 "0" 。
</pre>

**示例 2：** 


<pre><strong>输入：</strong>n = 4, k = 11
<strong>输出：</strong>"1"
<strong>解释：</strong>S<sub>4</sub> 为 "0111001101<strong>1</strong>0001"，其第 11 位为 "1" 。
</pre>

**示例 3：** 

```
输入：n = 1, k = 1
输出："0"

```

**示例 4：** 

```
输入：n = 2, k = 3
输出："1"

```



**提示：** 

-  *1 <= n <= 20*  
-  *1 <= k <= 2n - 1* 




# 算法思路

# 测试用例
```
1545. Find Kth Bit in Nth Binary String 1545. 找出第 N 个二进制字符串中的第 K 位 Medium
```

[enTitle]: https://leetcode.com/problems/find-kth-bit-in-nth-binary-string/
[cnTitle]: https://leetcode-cn.com/problems/find-kth-bit-in-nth-binary-string/
