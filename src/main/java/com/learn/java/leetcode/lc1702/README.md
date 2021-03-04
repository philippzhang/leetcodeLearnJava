# [1702. Maximum Binary String After Change][enTitle]

**Medium**

You are given a binary string  *binary*  consisting of only  *0* 's or  *1* 's. You can apply each of the following operations any number of times:

- Operation 1: If the number contains the substring  *"00"* , you can replace it with  *"10"* . 
 <ul> 
  - For example,  *"00010" -> "10010* " 
 </ul>  
- Operation 2: If the number contains the substring  *"10"* , you can replace it with  *"01"* . 
 <ul> 
  - For example,  *"00010" -> "00001"*  
 </ul> 

 *Return the maximum binary string you can obtain after any number of operations. Binary string x is greater than binary string y if x's decimal representation is greater than y's decimal representation.* 



**Example 1:** 

```
Input: binary = "000110"
Output: "111011"
Explanation: A valid transformation sequence can be:
"000110" -> "000101" 
"000101" -> "100101" 
"100101" -> "110101" 
"110101" -> "110011" 
"110011" -> "111011"

```

**Example 2:** 

```
Input: binary = "01"
Output: "01"
Explanation: "01" cannot be transformed any further.

```



**Constraints:** 

-  *1 <= binary.length <= 105*  
-  *binary*  consist of  *'0'*  and  *'1'* .


# [1702. 修改后的最大二进制字符串][cnTitle]

**中等**

给你一个二进制字符串  *binary*  ，它仅有  *0*  或者  *1*  组成。你可以使用下面的操作任意次对它进行修改：

- 操作 1 ：如果二进制串包含子字符串  *"00"*  ，你可以用  *"10"*  将其替换。 
 <ul> 
  - 比方说，  *"00010" -> "10010"*  
 </ul>  
- 操作 2 ：如果二进制串包含子字符串  *"10"*  ，你可以用  *"01"*  将其替换。 
 <ul> 
  - 比方说，  *"00010" -> "00001"*  
 </ul> 

请你返回执行上述操作任意次以后能得到的 **最大二进制字符串**  。如果二进制字符串  *x*  对应的十进制数字大于二进制字符串  *y*  对应的十进制数字，那么我们称二进制字符串 *x* 大于二进制字符串 *y* 。



**示例 1：** 

```
输入：binary = "000110"
输出："111011"
解释：一个可行的转换为：
"000110" -> "000101" 
"000101" -> "100101" 
"100101" -> "110101" 
"110101" -> "110011" 
"110011" -> "111011"

```

**示例 2：** 

```
输入：binary = "01"
输出："01"
解释："01" 没办法进行任何转换。

```



**提示：** 

-  *1 <= binary.length <= 105*  
-  *binary*  仅包含  *'0'*  和  *'1'*  。




# 算法思路

# 测试用例
```
1702. Maximum Binary String After Change 1702. 修改后的最大二进制字符串 Medium
```

[enTitle]: https://leetcode.com/problems/maximum-binary-string-after-change/
[cnTitle]: https://leetcode-cn.com/problems/maximum-binary-string-after-change/
