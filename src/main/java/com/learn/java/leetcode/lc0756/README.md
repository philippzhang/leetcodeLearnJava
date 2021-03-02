# [756. Pyramid Transition Matrix][enTitle]

**Medium**

We are stacking blocks to form a pyramid. Each block has a color which is a one letter string.

We are allowed to place any color block  *C*  on top of two adjacent blocks of colors  *A*  and  *B* , if and only if  *ABC*  is an allowed triple.

We start with a bottom row of  *bottom* , represented as a single string. We also start with a list of allowed triples  *allowed* . Each allowed triple is represented as a string of length 3.

Return true if we can build the pyramid all the way to the top, otherwise false.

Example 1:

```
Input: bottom = "BCD", allowed = ["BCG", "CDE", "GEA", "FFF"]
Output: true
Explanation:
We can stack the pyramid like this:
    A
   / \
  G   E
 / \ / \
B   C   D

We are allowed to place G on top of B and C because BCG is an allowed triple.  Similarly, we can place E on top of C and D, then A on top of G and E.
```



Example 2:

```
Input: bottom = "AABA", allowed = ["AAA", "AAB", "ABA", "ABB", "BAC"]
Output: false
Explanation:
We can't stack the pyramid to the top.
Note that there could be allowed triples (A, B, C) and (A, B, D) with C != D.

```



**Constraints:** 

-  *bottom*  will be a string with length in range  *[2, 8]* . 
-  *allowed*  will have length in range  *[0, 200]* . 
- Letters in all strings will be chosen from the set  *{'A', 'B', 'C', 'D', 'E', 'F', 'G'}* .


# [756. 金字塔转换矩阵][cnTitle]

**中等**

现在，我们用一些方块来堆砌一个金字塔。 每个方块用仅包含一个字母的字符串表示。

使用三元组表示金字塔的堆砌规则如下：

对于三元组(A, B, C) ，“C”为顶层方块，方块“A”、“B”分别作为方块“C”下一层的的左、右子块。当且仅当(A, B, C)是被允许的三元组，我们才可以将其堆砌上。

初始时，给定金字塔的基层  *bottom* ，用一个字符串表示。一个允许的三元组列表  *allowed* ，每个三元组用一个长度为 3 的字符串表示。

如果可以由基层一直堆到塔尖就返回  *true*  ，否则返回  *false*  。



**示例 1：** 

```
输入：bottom = "BCD", allowed = ["BCG", "CDE", "GEA", "FFF"]
输出：true
解析：
可以堆砌成这样的金字塔:
    A
   / \
  G   E
 / \ / \
B   C   D

因为符合('B', 'C', 'G'), ('C', 'D', 'E') 和 ('G', 'E', 'A') 三种规则。

```

**示例 2：** 

```
输入：bottom = "AABA", allowed = ["AAA", "AAB", "ABA", "ABB", "BAC"]
输出：false
解析：
无法一直堆到塔尖。
注意, 允许存在像 (A, B, C) 和 (A, B, D) 这样的三元组，其中 C != D。

```



**提示：** 

1.  *bottom*  的长度范围在  *[2, 8]* 。 
2.  *allowed*  的长度范围在 *[0, 200]* 。 
3. 方块的标记字母范围为 *{'A', 'B', 'C', 'D', 'E', 'F', 'G'}* 。




# 算法思路

# 测试用例
```
756. Pyramid Transition Matrix 756. 金字塔转换矩阵 Medium
```

[enTitle]: https://leetcode.com/problems/pyramid-transition-matrix/
[cnTitle]: https://leetcode-cn.com/problems/pyramid-transition-matrix/
