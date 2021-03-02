# [433. Minimum Genetic Mutation][enTitle]

**Medium**

A gene string can be represented by an 8-character long string, with choices from  *"A"* ,  *"C"* ,  *"G"* ,  *"T"* .

Suppose we need to investigate about a mutation (mutation from "start" to "end"), where ONE mutation is defined as ONE single character changed in the gene string.

For example,  *"AACCGGTT"*  ->  *"AACCGGTA"*  is 1 mutation.

Also, there is a given gene "bank", which records all the valid gene mutations. A gene must be in the bank to make it a valid gene string.

Now, given 3 things - start, end, bank, your task is to determine what is the minimum number of mutations needed to mutate from "start" to "end". If there is no such a mutation, return -1.

Note:

1. Starting point is assumed to be valid, so it might not be included in the bank. 
2. If multiple mutations are needed, all mutations during in the sequence must be valid. 
3. You may assume start and end string is not the same.



Example 1:

```
start: "AACCGGTT"
end:   "AACCGGTA"
bank: ["AACCGGTA"]

return: 1

```



Example 2:

```
start: "AACCGGTT"
end:   "AAACGGTA"
bank: ["AACCGGTA", "AACCGCTA", "AAACGGTA"]

return: 2

```



Example 3:

```
start: "AAAAACCC"
end:   "AACCCCCC"
bank: ["AAAACCCC", "AAACCCCC", "AACCCCCC"]

return: 3

```




# [433. 最小基因变化][cnTitle]

**中等**

一条基因序列由一个带有8个字符的字符串表示，其中每个字符都属于  *"A"* ,  *"C"* ,  *"G"* ,  *"T"* 中的任意一个。

假设我们要调查一个基因序列的变化。**一次** 基因变化意味着这个基因序列中的**一个** 字符发生了变化。

例如，基因序列由 *"AACCGGTT"*  变化至  *"AACCGGTA"* 即发生了一次基因变化。

与此同时，每一次基因变化的结果，都需要是一个合法的基因串，即该结果属于一个基因库。

现在给定3个参数 — start, end, bank，分别代表起始基因序列，目标基因序列及基因库，请找出能够使起始基因序列变化为目标基因序列所需的最少变化次数。如果无法实现目标变化，请返回 -1。

**注意：** 

1. 起始基因序列默认是合法的，但是它并不一定会出现在基因库中。 
2. 如果一个起始基因序列需要多次变化，那么它每一次变化之后的基因序列都必须是合法的。 
3. 假定起始基因序列与目标基因序列是不一样的。



**示例 1：** 

```
start: "AACCGGTT"
end:   "AACCGGTA"
bank: ["AACCGGTA"]

返回值: 1

```

**示例 2：** 

```
start: "AACCGGTT"
end:   "AAACGGTA"
bank: ["AACCGGTA", "AACCGCTA", "AAACGGTA"]

返回值: 2

```

**示例 3：** 

```
start: "AAAAACCC"
end:   "AACCCCCC"
bank: ["AAAACCCC", "AAACCCCC", "AACCCCCC"]

返回值: 3

```




# 算法思路

# 测试用例
```
433. Minimum Genetic Mutation 433. 最小基因变化 Medium
```

[enTitle]: https://leetcode.com/problems/minimum-genetic-mutation/
[cnTitle]: https://leetcode-cn.com/problems/minimum-genetic-mutation/
