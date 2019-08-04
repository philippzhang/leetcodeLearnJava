# [1117. Building H2O][enTitle]

**Hard**

There are two kinds of threads,  *oxygen*  and  *hydrogen* . Your goal is to group these threads to form water molecules. There is a barrier where each thread has to wait until a complete molecule can be formed. Hydrogen and oxygen threads will be given a  *releaseHydrogen*  and  *releaseOxygen*  method respectfully, which will allow them to pass the barrier. These threads should pass the barrier in groups of three, and they must be able to immediately bond with each other to form a water molecule. You must guarantee that all the threads from one molecule bond  *before*  any other threads from the next molecule do.

In other words:

- If an oxygen thread arrives at the barrier when no hydrogen threads are present, it has to wait for two hydrogen threads. 
- If a hydrogen thread arrives at the barrier when no other threads are present, it has to wait for an oxygen thread and another hydrogen thread.

We don’t have to worry about matching the threads up explicitly; that is, the threads do not necessarily know which other threads they are paired up with. The key is just that threads pass the barrier in complete sets; thus, if we examine the sequence of threads that bond and divide them into groups of three, each group should contain one oxygen and two hydrogen threads.

Write synchronization code for oxygen and hydrogen molecules that enforces these constraints.







**Example 1:** 

```
Input:"HOH"
Output: "HHO"
Explanation: "HOH" and "OHH" are also valid answers.
```


**Example 2:** 

```
Input:"OOHHHH"
Output: "HHOHHO"
Explanation: "HOHHHO", "OHHHHO", "HHOHOH", "HOHHOH", "OHHHOH", "HHOOHH", "HOHOHH" and "OHHOHH" are also valid answers.
```







**Constraints:** 

- Total length of input string will be 3 *n* , where 1 ≤  *n*  ≤ 30. 
- Total number of  *H*  will be 2 *n*  in the input string. 
- Total number of  *O*  will be  *n*  in the input string.


# [1117. H2O 生成][cnTitle]

**困难**

现在有两种线程，氢  *oxygen*  和氧  *hydrogen* ，你的目标是组织这两种线程来产生水分子。

存在一个屏障（barrier）使得每个线程必须等候直到一个完整水分子能够被产生出来。

氢和氧线程会被分别给予  *releaseHydrogen*  和  *releaseOxygen*  方法来允许它们突破屏障。

这些线程应该三三成组突破屏障并能立即组合产生一个水分子。

你必须保证产生一个水分子所需线程的结合必须发生在下一个水分子产生之前。

换句话说:

- 如果一个氧线程到达屏障时没有氢线程到达，它必须等候直到两个氢线程到达。 
- 如果一个氢线程到达屏障时没有其它线程到达，它必须等候直到一个氧线程和另一个氢线程到达。

书写满足这些限制条件的氢、氧线程同步代码。



**示例 1:** 

```
输入:"HOH"
输出:"HHO"
解释: "HOH" 和 "OHH" 依然都是有效解。

```

**示例 2:** 

```
输入:"OOHHHH"
输出:"HHOHHO"
解释: "HOHHHO", "OHHHHO", "HHOHOH", "HOHHOH", "OHHHOH", "HHOOHH", "HOHOHH" 和 "OHHOHH" 依然都是有效解。

```



**限制条件:** 

- 输入字符串的总长将会是 3 *n* , 1 ≤  *n*  ≤ 50； 
- 输入字符串中的 “H” 总数将会是 2n； 
- 输入字符串中的 “O” 总数将会是 n。




# 算法思路

# 测试用例
```
1117. Building H2O 1117. H2O 生成 Hard
Main.test
---
"HOH"

="HHO"
="HOH"
="OHH"
---
"OOHHHH"

="HHOHHO"
="HOHHHO"
="OHHHHO"
="HHOHOH"
="HOHHOH"
="OHHHOH"
="HHOOHH"
="HOHOHH"
="OHHOHH"
```

[enTitle]: https://leetcode.com/problems/building-h2o/
[cnTitle]: https://leetcode-cn.com/problems/building-h2o/
