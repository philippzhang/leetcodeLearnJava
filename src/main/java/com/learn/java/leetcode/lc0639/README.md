# [639. Decode Ways II][enTitle]

**Hard**

A message containing letters from  *A-Z*  can be **encoded**  into numbers using the following mapping:

```
'A' -> "1"
'B' -> "2"
...
'Z' -> "26"

```

To **decode**  an encoded message, all the digits must be grouped then mapped back into letters using the reverse of the mapping above (there may be multiple ways). For example,  *"11106"*  can be mapped into:

-  *"AAJF"*  with the grouping  *(1 1 10 6)*  
-  *"KJF"*  with the grouping  *(11 10 6)* 

Note that the grouping  *(1 11 06)*  is invalid because  *"06"*  cannot be mapped into  *'F'*  since  *"6"*  is different from  *"06"* .

**In addition**  to the mapping above, an encoded message may contain the  *'*'*  character, which can represent any digit from  *'1'*  to  *'9'*  ( *'0'*  is excluded). For example, the encoded message  *"1*"*  may represent any of the encoded messages  *"11"* ,  *"12"* ,  *"13"* ,  *"14"* ,  *"15"* ,  *"16"* ,  *"17"* ,  *"18"* , or  *"19"* . Decoding  *"1*"*  is equivalent to decoding **any**  of the encoded messages it can represent.

Given a string  *s*  containing digits and the  *'*'*  character, return  *the number of ways to decode it* .

Since the answer may be very large, return it **modulo**   *109 + 7* .



**Example 1:** 

```
Input: s = "*"
Output: 9
Explanation: The encoded message can represent any of the encoded messages "1", "2", "3", "4", "5", "6", "7", "8", or "9".
Each of these can be decoded to the strings "A", "B", "C", "D", "E", "F", "G", "H", and "I" respectively.
Hence, there are a total of 9 ways to decode "*".

```

**Example 2:** 

```
Input: s = "1*"
Output: 18
Explanation: The encoded message can represent any of the encoded messages "11", "12", "13", "14", "15", "16", "17", "18", or "19".
Each of these encoded messages have 2 ways to be decoded (e.g. "11" can be decoded to "AA" or "K").
Hence, there are a total of 9 * 2 = 18 ways to decode "1*".

```

**Example 3:** 

```
Input: s = "2*"
Output: 15
Explanation: The encoded message can represent any of the encoded messages "21", "22", "23", "24", "25", "26", "27", "28", or "29".
"21", "22", "23", "24", "25", and "26" have 2 ways of being decoded, but "27", "28", and "29" only have 1 way.
Hence, there are a total of (6 * 2) + (3 * 1) = 12 + 3 = 15 ways to decode "2*".

```



**Constraints:** 

-  *1 <= s.length <= 105*  
-  *s[i]*  is a digit or  *'*'* .


# [639. 解码方法 II][cnTitle]

**困难**

一条包含字母  *A-Z*  的消息通过以下的方式进行了编码：

```
'A' -> 1
'B' -> 2
...
'Z' -> 26

```

除了上述的条件以外，现在加密字符串可以包含字符 '*'了，字符'*'可以被当做1到9当中的任意一个数字。

给定一条包含数字和字符'*'的加密信息，请确定解码方法的总数。

同时，由于结果值可能会相当的大，所以你应当对10<sup>9</sup> + 7取模。（翻译者标注：此处取模主要是为了防止溢出）

**示例 1 :** 

```
输入: "*"
输出: 9
解释: 加密的信息可以被解密为: "A", "B", "C", "D", "E", "F", "G", "H", "I".

```

**示例 2 :** 

```
输入: "1*"
输出: 9 + 9 = 18（翻译者标注：这里1*可以分解为1,* 或者当做1*来处理，所以结果是9+9=18）

```

**说明 :** 

1. 输入的字符串长度范围是 [1, 10<sup>5</sup>]。 
2. 输入的字符串只会包含字符 '*' 和 数字'0' - '9'。




# 算法思路

# 测试用例
```
639. Decode Ways II 639. 解码方法 II Hard
```

[enTitle]: https://leetcode.com/problems/decode-ways-ii/
[cnTitle]: https://leetcode-cn.com/problems/decode-ways-ii/
