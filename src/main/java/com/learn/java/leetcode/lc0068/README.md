# [68. Text Justification][enTitle]

**Hard**

Given an array of words and a width  *maxWidth* , format the text such that each line has exactly  *maxWidth*  characters and is fully (left and right) justified.

You should pack your words in a greedy approach; that is, pack as many words as you can in each line. Pad extra spaces  *' '*  when necessary so that each line has exactly  *maxWidth*  characters.

Extra spaces between words should be distributed as evenly as possible. If the number of spaces on a line do not divide evenly between words, the empty slots on the left will be assigned more spaces than the slots on the right.

For the last line of text, it should be left justified and no **extra**  space is inserted between words.

**Note:** 

- A word is defined as a character sequence consisting of non-space characters only. 
- Each word's length is guaranteed to be greater than 0 and not exceed  *maxWidth* . 
- The input array  *words*  contains at least one word.

**Example 1:** 

```
Input:
words = ["This", "is", "an", "example", "of", "text", "justification."]
maxWidth = 16
Output:
[
   "This    is    an",
   "example  of text",
   "justification.  "
]

```

**Example 2:** 

```
Input:
words = ["What","must","be","acknowledgment","shall","be"]
maxWidth = 16
Output:
[
  "What   must   be",
  "acknowledgment  ",
  "shall be        "
]
Explanation: Note that the last line is "shall be    " instead of "shall     be",
             because the last line must be left-justified instead of fully-justified.
             Note that the second line is also left-justified becase it contains only one word.

```

**Example 3:** 

```
Input:
words = ["Science","is","what","we","understand","well","enough","to","explain",
         "to","a","computer.","Art","is","everything","else","we","do"]
maxWidth = 20
Output:
[
  "Science  is  what we",
  "understand      well",
  "enough to explain to",
  "a  computer.  Art is",
  "everything  else  we",
  "do                  "
]

```
# [68. 文本左右对齐][cnTitle]

**困难**

给定一个单词数组和一个长度  *maxWidth* ，重新排版单词，使其成为每行恰好有  *maxWidth*  个字符，且左右两端对齐的文本。

你应该使用“贪心算法”来放置给定的单词；也就是说，尽可能多地往每行中放置单词。必要时可用空格  *' '*  填充，使得每行恰好有  *maxWidth*  个字符。

要求尽可能均匀分配单词间的空格数量。如果某一行单词间的空格不能均匀分配，则左侧放置的空格数要多于右侧的空格数。

文本的最后一行应为左对齐，且单词之间不插入**额外的** 空格。

**说明:** 

- 单词是指由非空格字符组成的字符序列。 
- 每个单词的长度大于 0，小于等于  *maxWidth* 。 
- 输入单词数组  *words*  至少包含一个单词。

**示例:** 

```
输入:
words = ["This", "is", "an", "example", "of", "text", "justification."]
maxWidth = 16
输出:
[
   "This    is    an",
   "example  of text",
   "justification.  "
]

```

**示例 2:** 

```
输入:
words = ["What","must","be","acknowledgment","shall","be"]
maxWidth = 16
输出:
[
  "What   must   be",
  "acknowledgment  ",
  "shall be        "
]
解释:注意最后一行的格式应为 "shall be    " 而不是 "shall     be",
     因为最后一行应为左对齐，而不是左右两端对齐。       
     第二行同样为左对齐，这是因为这行只包含一个单词。

```

**示例 3:** 

```
输入:
words = ["Science","is","what","we","understand","well","enough","to","explain",
         "to","a","computer.","Art","is","everything","else","we","do"]
maxWidth = 20
输出:
[
  "Science  is  what we",
  "understand      well",
  "enough to explain to",
  "a  computer.  Art is",
  "everything  else  we",
  "do                  "
]

```


# 算法思路

# 测试用例
```
68. Text Justification 68. 文本左右对齐 Hard
```

[enTitle]: https://leetcode.com/problems/text-justification/
[cnTitle]: https://leetcode-cn.com/problems/text-justification/
