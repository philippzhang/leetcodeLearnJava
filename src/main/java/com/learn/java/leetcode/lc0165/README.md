# [165. Compare Version Numbers][enTitle]

**Medium**

Compare two version numbers  *version1*  and  *version2* . If <code> *version1*  >  *version2* </code> return  *1;*  if <code> *version1*  <  *version2* </code> return  *-1;* otherwise return  *0* .

You may assume that the version strings are non-empty and contain only digits and the  *.*  character.

The  *.*  character does not represent a decimal point and is used to separate number sequences.

For instance,  *2.5*  is not "two and a half" or "half way to version three", it is the fifth second-level revision of the second first-level revision.

You may assume the default revision number for each level of a version number to be  *0* . For example, version number  *3.4*  has a revision number of  *3*  and  *4*  for its first and second level revision number. Its third and fourth level revision number are both  *0* .



**Example 1:** 

```
Input: version1 = "0.1", version2 = "1.1"
Output: -1
```

**Example 2:** 

```
Input:version1 = "1.0.1", version2 = "1"
Output: 1
```

**Example 3:** 

```
Input: version1 = "7.5.2.4", version2 = "7.5.3"
Output: -1
```

**Example 4:** 

```
Input: version1 = "1.01", version2 = "1.001"
Output: 0
Explanation: Ignoring leading zeroes, both “01” and “001" represent the same number “1”
```

**Example 5:** 

```
Input: version1 = "1.0", version2 = "1.0.0"
Output: 0
Explanation: The first version number does not have a third level revision number, which means its third level revision number is default to "0"
```



**Note:** 

1. Version strings are composed of numeric strings separated by dots  *.*  and this numeric strings **may**  have leading zeroes.  
2. Version strings do not start or end with dots, and they will not be two consecutive dots.


# [165. 比较版本号][cnTitle]

**中等**

比较两个版本号  *version1* 和  *version2* 。 如果 <code> *version1* >  *version2* </code> 返回  *1* ，如果 <code> *version1* <  *version2* </code> 返回  *-1* ， 除此之外返回  *0* 。

你可以假设版本字符串非空，并且只包含数字和  *.*  字符。

 *.*  字符不代表小数点，而是用于分隔数字序列。

例如， *2.5*  不是“两个半”，也不是“差一半到三”，而是第二版中的第五个小版本。

你可以假设版本号的每一级的默认修订版号为  *0* 。例如，版本号  *3.4*  的第一级（大版本）和第二级（小版本）修订号分别为  *3*  和  *4* 。其第三级和第四级修订号均为  *0* 。

**示例 1:** 

```
输入: version1 = "0.1", version2 = "1.1"
输出: -1
```

**示例 2:** 

```
输入:version1 = "1.0.1", version2 = "1"
输出: 1
```

**示例 3:** 

```
输入: version1 = "7.5.2.4", version2 = "7.5.3"
输出: -1
```

**示例 4：** 

```
输入：version1 = "1.01", version2 = "1.001"
输出：0
解释：忽略前导零，“01” 和 “001” 表示相同的数字 “1”。
```

**示例 5：** 

```
输入：version1 = "1.0", version2 = "1.0.0"
输出：0
解释：version1没有第三级修订号，这意味着它的第三级修订号默认为 “0”。
```



**提示：** 

1. 版本字符串由以点 （ *.* ） 分隔的数字字符串组成。这个数字字符串**可能** 有前导零。 
2. 版本字符串不以点开始或结束，并且其中不会有两个连续的点。




# 算法思路

# 测试用例
```
165. Compare Version Numbers 165. 比较版本号 Medium
Solution.compareVersion
---
"0.1"
"1.1"

= -1
---
"1.0.1"
"1"

=1
---
"7.5.2.4"
"7.5.3"

=-1
---
"1.01"
"1.001"

=0
---
"1.0"
"1.0.0"

=0
---
"1.1"
"1.10"

=-1
```

[enTitle]: https://leetcode.com/problems/compare-version-numbers/
[cnTitle]: https://leetcode-cn.com/problems/compare-version-numbers/
