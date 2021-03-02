# [777. Swap Adjacent in LR String][enTitle]

**Medium**

In a string composed of  *'L'* ,  *'R'* , and  *'X'*  characters, like  *"RXXLRXRXL"* , a move consists of either replacing one occurrence of  *"XL"*  with  *"LX"* , or replacing one occurrence of  *"RX"*  with  *"XR"* . Given the starting string  *start*  and the ending string  *end* , return  *True*  if and only if there exists a sequence of moves to transform one string to the other.



**Example 1:** 

```
Input: start = "RXXLRXRXL", end = "XRLXXRRLX"
Output: true
Explanation: We can transform start to end following these steps:
RXXLRXRXL ->
XRXLRXRXL ->
XRLXRXRXL ->
XRLXXRRXL ->
XRLXXRRLX

```

**Example 2:** 

```
Input: start = "X", end = "L"
Output: false

```

**Example 3:** 

```
Input: start = "LLR", end = "RRL"
Output: false

```

**Example 4:** 

```
Input: start = "XL", end = "LX"
Output: true

```

**Example 5:** 

```
Input: start = "XLLR", end = "LXLX"
Output: false

```



**Constraints:** 

-  *1 <= start.length <= 104*  
-  *start.length == end.length*  
- Both  *start*  and  *end*  will only consist of characters in  *'L'* ,  *'R'* , and  *'X'* .


# [777. 在LR字符串中交换相邻字符][cnTitle]

**中等**

在一个由  *'L'*  ,  *'R'*  和  *'X'*  三个字符组成的字符串（例如 *"RXXLRXRXL"* ）中进行移动操作。一次移动操作指用一个 *"LX"* 替换一个 *"XL"* ，或者用一个 *"XR"* 替换一个 *"RX"* 。现给定起始字符串 *start* 和结束字符串 *end* ，请编写代码，当且仅当存在一系列移动操作使得 *start* 可以转换成 *end* 时， 返回 *True* 。



**示例 :** 

```
输入: start = "RXXLRXRXL", end = "XRLXXRRLX"
输出: True
解释:
我们可以通过以下几步将start转换成end:
RXXLRXRXL ->
XRXLRXRXL ->
XRLXRXRXL ->
XRLXXRRXL ->
XRLXXRRLX

```



**提示：** 

-  *1 <= len(start) = len(end) <= 10000* 。 
-  *start* 和 *end* 中的字符串仅限于 *'L'* ,  *'R'* 和 *'X'* 。




# 算法思路

# 测试用例
```
777. Swap Adjacent in LR String 777. 在LR字符串中交换相邻字符 Medium
```

[enTitle]: https://leetcode.com/problems/swap-adjacent-in-lr-string/
[cnTitle]: https://leetcode-cn.com/problems/swap-adjacent-in-lr-string/
