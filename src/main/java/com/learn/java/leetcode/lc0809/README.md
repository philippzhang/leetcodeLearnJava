# [809. Expressive Words][enTitle]

**Medium**

Sometimes people repeat letters to represent extra feeling, such as "hello" -> "heeellooo", "hi" -> "hiiii". In these strings like "heeellooo", we have  *groups*  of adjacent letters that are all the same: "h", "eee", "ll", "ooo".

For some given string  *S* , a query word is  *stretchy*  if it can be made to be equal to  *S*  by any number of applications of the following  *extension*  operation: choose a group consisting of characters  *c* , and add some number of characters  *c*  to the group so that the size of the group is 3 or more.

For example, starting with "hello", we could do an extension on the group "o" to get "hellooo", but we cannot get "helloo" since the group "oo" has size less than 3. Also, we could do another extension like "ll" -> "lllll" to get "helllllooo". If  *S = "helllllooo"* , then the query word "hello" would be stretchy because of these two extension operations:  *query = "hello" -> "hellooo" -> "helllllooo" = S* .

Given a list of query words, return the number of words that are stretchy.



```
Example:
Input: 
S = "heeellooo"
words = ["hello", "hi", "helo"]
Output: 1
Explanation: 
We can extend "e" and "o" in the word "hello" to get "heeellooo".
We can't extend "helo" to get "heeellooo" because the group "ll" is not size 3 or more.

```



**Constraints:** 

-  *0 <= len(S) <= 100* . 
-  *0 <= len(words) <= 100* . 
-  *0 <= len(words[i]) <= 100* . 
-  *S*  and all words in  *words*  consist only of lowercase letters


# [809. 情感丰富的文字][cnTitle]

**中等**

有时候人们会用重复写一些字母来表示额外的感受，比如  *"hello" -> "heeellooo"* ,  *"hi" -> "hiii"* 。我们将相邻字母都相同的一串字符定义为相同字母组，例如："h", "eee", "ll", "ooo"。

对于一个给定的字符串 S ，如果另一个单词能够通过将一些字母组扩张从而使其和 S 相同，我们将这个单词定义为可扩张的（stretchy）。扩张操作定义如下：选择一个字母组（包含字母  *c*  ），然后往其中添加相同的字母  *c*  使其长度达到 3 或以上。

例如，以 "hello" 为例，我们可以对字母组 "o" 扩张得到 "hellooo"，但是无法以同样的方法得到 "helloo" 因为字母组 "oo" 长度小于 3。此外，我们可以进行另一种扩张 "ll" -> "lllll" 以获得 "helllllooo"。如果  *S = "helllllooo"* ，那么查询词 "hello" 是可扩张的，因为可以对它执行这两种扩张操作使得  *query = "hello" -> "hellooo" -> "helllllooo" = S* 。

输入一组查询单词，输出其中可扩张的单词数量。



**示例：** 

```
输入： 
S = "heeellooo"
words = ["hello", "hi", "helo"]
输出：1
解释：
我们能通过扩张 "hello" 的 "e" 和 "o" 来得到 "heeellooo"。
我们不能通过扩张 "helo" 来得到 "heeellooo" 因为 "ll" 的长度小于 3 。

```



**说明：** 

-  *0 <= len(S) <= 100* 。 
-  *0 <= len(words) <= 100* 。 
-  *0 <= len(words[i]) <= 100* 。 
-  *S*  和所有在  *words*  中的单词都只由小写字母组成。




# 算法思路

# 测试用例
```
809. Expressive Words 809. 情感丰富的文字 Medium
```

[enTitle]: https://leetcode.com/problems/expressive-words/
[cnTitle]: https://leetcode-cn.com/problems/expressive-words/
