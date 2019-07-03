# [385. Mini Parser][enTitle]

**Medium**

Given a nested list of integers represented as a string, implement a parser to deserialize it.

Each element is either an integer, or a list -- whose elements may also be integers or other lists.

Note: You may assume that the string is well-formed:

- String is non-empty. 
- String does not contain white spaces. 
- String contains only digits  *0-9* ,  *[* ,  *-*   *,* ,  *]* .



Example 1:

```
Given s = "324",

You should return a NestedInteger object which contains a single integer 324.

```



Example 2:

```
Given s = "[123,[456,[789]]]",

Return a NestedInteger object containing a nested list with 2 elements:

1. An integer containing value 123.
2. A nested list containing two elements:
    i.  An integer containing value 456.
    ii. A nested list with one element:
         a. An integer containing value 789.

```




# [385. 迷你语法分析器][cnTitle]

**中等**

给定一个用字符串表示的整数的嵌套列表，实现一个解析它的语法分析器。

列表中的每个元素只可能是整数或整数嵌套列表

**提示：** 你可以假定这些字符串都是格式良好的：

- 字符串非空 
- 字符串不包含空格 
- 字符串只包含数字 *0-9* ,  *[* ,  *-*   *,* ,  *]* 



**示例 1：** 

```
给定 s = "324",

你应该返回一个 NestedInteger 对象，其中只包含整数值 324。

```



**示例 2：** 

```
给定 s = "[123,[456,[789]]]",

返回一个 NestedInteger 对象包含一个有两个元素的嵌套列表：

1. 一个 integer 包含值 123
2. 一个包含两个元素的嵌套列表：
    i.  一个 integer 包含值 456
    ii. 一个包含一个元素的嵌套列表
         a. 一个 integer 包含值 789

```






# 算法思路

# 测试用例
```
385. Mini Parser 385. 迷你语法分析器 Medium
Solution.deserialize
---
"324"

=324
---
"[123,[456,[789]]]"

=[123,[456,[789]]]
```

[enTitle]: https://leetcode.com/problems/mini-parser/
[cnTitle]: https://leetcode-cn.com/problems/mini-parser/
