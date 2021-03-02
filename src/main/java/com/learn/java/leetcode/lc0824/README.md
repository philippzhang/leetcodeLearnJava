# [824. Goat Latin][enTitle]

**Easy**

A sentence  *S*  is given, composed of words separated by spaces. Each word consists of lowercase and uppercase letters only.

We would like to convert the sentence to " *Goat Latin"*  (a made-up language similar to Pig Latin.)

The rules of Goat Latin are as follows:

- If a word begins with a vowel (a, e, i, o, or u), append  *"ma"*  to the end of the word. For example, the word 'apple' becomes 'applema'.  
- If a word begins with a consonant (i.e. not a vowel), remove the first letter and append it to the end, then add  *"ma"* . For example, the word  *"goat"*  becomes  *"oatgma"* .  
- Add one letter  *'a'*  to the end of each word per its word index in the sentence, starting with 1. For example, the first word gets  *"a"*  added to the end, the second word gets  *"aa"*  added to the end and so on.

Return the final sentence representing the conversion from  *S*  to Goat Latin.



**Example 1:** 

```
Input:"I speak Goat Latin"
Output:"Imaa peaksmaaa oatGmaaaa atinLmaaaaa"

```

**Example 2:** 

```
Input:"The quick brown fox jumped over the lazy dog"
Output:"heTmaa uickqmaaa rownbmaaaa oxfmaaaaa umpedjmaaaaaa overmaaaaaaa hetmaaaaaaaa azylmaaaaaaaaa ogdmaaaaaaaaaa"

```



Notes:

-  *S*  contains only uppercase, lowercase and spaces. Exactly one space between each word. 
-  *1 <= S.length <= 150* .


# [824. 山羊拉丁文][cnTitle]

**简单**

给定一个由空格分割单词的句子  *S* 。每个单词只包含大写或小写字母。

我们要将句子转换为  *“Goat Latin”* （一种类似于 猪拉丁文 - Pig Latin 的虚构语言）。

山羊拉丁文的规则如下：

- 如果单词以元音开头（a, e, i, o, u），在单词后添加 *"ma"* 。 例如，单词 *"apple"* 变为 *"applema"* 。 
 
- 如果单词以辅音字母开头（即非元音字母），移除第一个字符并将它放到末尾，之后再添加 *"ma"* 。 例如，单词 *"goat"* 变为 *"oatgma"* 。 
 
- 根据单词在句子中的索引，在单词最后添加与索引相同数量的字母 *'a'* ，索引从1开始。 例如，在第一个单词后添加 *"a"* ，在第二个单词后添加 *"aa"* ，以此类推。

返回将  *S*  转换为山羊拉丁文后的句子。

**示例 1:** 

```
输入:"I speak Goat Latin"
输出:"Imaa peaksmaaa oatGmaaaa atinLmaaaaa"

```

**示例 2:** 

```
输入:"The quick brown fox jumped over the lazy dog"
输出:"heTmaa uickqmaaa rownbmaaaa oxfmaaaaa umpedjmaaaaaa overmaaaaaaa hetmaaaaaaaa azylmaaaaaaaaa ogdmaaaaaaaaaa"

```

**说明:** 

-  *S*  中仅包含大小写字母和空格。单词间有且仅有一个空格。 
-  *1 <= S.length <= 150* 。




# 算法思路

# 测试用例
```
824. Goat Latin 824. 山羊拉丁文 Easy
```

[enTitle]: https://leetcode.com/problems/goat-latin/
[cnTitle]: https://leetcode-cn.com/problems/goat-latin/
