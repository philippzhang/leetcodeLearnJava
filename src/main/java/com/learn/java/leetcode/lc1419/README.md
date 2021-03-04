# [1419. Minimum Number of Frogs Croaking][enTitle]

**Medium**

Given the string  *croakOfFrogs* , which represents a combination of the string "croak" from different frogs, that is, multiple frogs can croak at the same time, so multiple “croak” are mixed.  *Return the minimum number of* different *frogs to finish all the croak in the given string.* 

A valid "croak" means a frog is printing 5 letters ‘c’, ’r’, ’o’, ’a’, ’k’ **sequentially** . The frogs have to print all five letters to finish a croak. If the given string is not a combination of valid "croak" return -1.



**Example 1:** 

```
Input: croakOfFrogs = "croakcroak"
Output: 1 
Explanation: One frog yelling "croak" twice.

```

**Example 2:** 

```
Input: croakOfFrogs = "crcoakroak"
Output: 2 
Explanation: The minimum number of frogs is two. 
The first frog could yell "crcoakroak".
The second frog could yell later "crcoakroak".

```

**Example 3:** 

```
Input: croakOfFrogs = "croakcrook"
Output: -1
Explanation: The given string is an invalid combination of "croak" from different frogs.

```

**Example 4:** 

```
Input: croakOfFrogs = "croakcroa"
Output: -1

```



**Constraints:** 

-  *1 <= croakOfFrogs.length <= 10^5*  
- All characters in the string are:  *'c'* ,  *'r'* ,  *'o'* ,  *'a'*  or  *'k'* .


# [1419. 数青蛙][cnTitle]

**中等**

给你一个字符串  *croakOfFrogs* ，它表示不同青蛙发出的蛙鸣声（字符串 "croak" ）的组合。由于同一时间可以有多只青蛙呱呱作响，所以  *croakOfFrogs*  中会混合多个 “croak”  *。* 请你返回模拟字符串中所有蛙鸣所需不同青蛙的最少数目。

**注意：** 要想发出蛙鸣 "croak"，青蛙必须 **依序**  输出  *‘c’, ’r’, ’o’, ’a’, ’k’*  这 5 个字母。如果没有输出全部五个字母，那么它就不会发出声音。

如果字符串  *croakOfFrogs*  不是由若干有效的 "croak" 字符混合而成，请返回  *-1*  。



**示例 1：** 

```
输入：croakOfFrogs = "croakcroak"
输出：1 
解释：一只青蛙 “呱呱” 两次

```

**示例 2：** 

```
输入：croakOfFrogs = "crcoakroak"
输出：2 
解释：最少需要两只青蛙，“呱呱” 声用黑体标注
第一只青蛙 "crcoakroak"
第二只青蛙 "crcoakroak"

```

**示例 3：** 

```
输入：croakOfFrogs = "croakcrook"
输出：-1
解释：给出的字符串不是 "croak" 的有效组合。

```

**示例 4：** 

```
输入：croakOfFrogs = "croakcroa"
输出：-1

```



**提示：** 

-  *1 <= croakOfFrogs.length <= 10^5*  
- 字符串中的字符只有  *'c'* ,  *'r'* ,  *'o'* ,  *'a'*  或者  *'k'* 




# 算法思路

# 测试用例
```
1419. Minimum Number of Frogs Croaking 1419. 数青蛙 Medium
```

[enTitle]: https://leetcode.com/problems/minimum-number-of-frogs-croaking/
[cnTitle]: https://leetcode-cn.com/problems/minimum-number-of-frogs-croaking/
