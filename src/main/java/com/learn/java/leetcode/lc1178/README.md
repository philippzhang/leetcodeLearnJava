# [1178. Number of Valid Words for Each Puzzle][enTitle]

**Hard**




-  *word*  contains the first letter of  *puzzle* . 
- For each letter in  *word* , that letter is in  *puzzle* . For example, if the puzzle is "abcdefg", then valid words are "faced", "cabbage", and "baggage"; while invalid words are "beefed" (doesn't include "a") and "based" (includes "s" which isn't in the puzzle).







**Example :** 

```
Input: 
words = ["aaaa","asas","able","ability","actt","actor","access"], 
puzzles = ["aboveyz","abrodyz","abslute","absoryz","actresz","gaswxyz"]
Output: [1,1,3,2,4,0]
Explanation:
1 valid word for "aboveyz" : "aaaa" 
1 valid word for "abrodyz" : "aaaa"
3 valid words for "abslute" : "aaaa", "asas", "able"
2 valid words for "absoryz" : "aaaa", "asas"
4 valid words for "actresz" : "aaaa", "asas", "actt", "access"
There're no valid words for "gaswxyz" cause none of the words in the list contains letter 'g'.

```



**Constraints:** 

-  *1 <= words.length <= 10^5*  
-  *4 <= words[i].length <= 50*  
-  *1 <= puzzles.length <= 10^4*  
-  *puzzles[i].length == 7*  
-  *words[i][j]* ,  *puzzles[i][j]*  are English lowercase letters. 
- Each  *puzzles[i]* doesn't contain repeated characters.


# [1178. 猜字谜][cnTitle]

**困难**

外国友人仿照中国字谜设计了一个英文版猜字谜小游戏，请你来猜猜看吧。

字谜的迷面  *puzzle*  按字符串形式给出，如果一个单词  *word*  符合下面两个条件，那么它就可以算作谜底：

- 单词  *word*  中包含谜面  *puzzle*  的第一个字母。 
- 单词  *word*  中的每一个字母都可以在谜面  *puzzle*  中找到。 例如，如果字谜的谜面是 "abcdefg"，那么可以作为谜底的单词有 "faced", "cabbage", 和 "baggage"；而 "beefed"（不含字母 "a"）以及 "based"（其中的 "s" 没有出现在谜面中）都不能作为谜底。

返回一个答案数组  *answer* ，数组中的每个元素  *answer[i]*  是在给出的单词列表  *words*  中可以作为字谜迷面  *puzzles[i]*  所对应的谜底的单词数目。



**示例：** 

```
输入：
words = ["aaaa","asas","able","ability","actt","actor","access"], 
puzzles = ["aboveyz","abrodyz","abslute","absoryz","actresz","gaswxyz"]
输出：[1,1,3,2,4,0]
解释：
1 个单词可以作为 "aboveyz" 的谜底 : "aaaa" 
1 个单词可以作为 "abrodyz" 的谜底 : "aaaa"
3 个单词可以作为 "abslute" 的谜底 : "aaaa", "asas", "able"
2 个单词可以作为 "absoryz" 的谜底 : "aaaa", "asas"
4 个单词可以作为 "actresz" 的谜底 : "aaaa", "asas", "actt", "access"
没有单词可以作为 "gaswxyz" 的谜底，因为列表中的单词都不含字母 'g'。

```



**提示：** 

-  *1 <= words.length <= 10^5*  
-  *4 <= words[i].length <= 50*  
-  *1 <= puzzles.length <= 10^4*  
-  *puzzles[i].length == 7*  
-  *words[i][j]* ,  *puzzles[i][j]*  都是小写英文字母。 
- 每个  *puzzles[i]*  所包含的字符都不重复。




# 算法思路

# 测试用例
```
1178. Number of Valid Words for Each Puzzle 1178. 猜字谜 Hard
```

[enTitle]: https://leetcode.com/problems/number-of-valid-words-for-each-puzzle/
[cnTitle]: https://leetcode-cn.com/problems/number-of-valid-words-for-each-puzzle/
