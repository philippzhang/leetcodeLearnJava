# [1622. Fancy Sequence][enTitle]

**Hard**

Write an API that generates fancy sequences using the  *append* ,  *addAll* , and  *multAll*  operations.

Implement the  *Fancy*  class:

-  *Fancy()*  Initializes the object with an empty sequence. 
-  *void append(val)*  Appends an integer  *val*  to the end of the sequence. 
-  *void addAll(inc)*  Increments all existing values in the sequence by an integer  *inc* . 
-  *void multAll(m)*  Multiplies all existing values in the sequence by an integer  *m* . 
-  *int getIndex(idx)*  Gets the current value at index  *idx*  (0-indexed) of the sequence **modulo**   *109 + 7* . If the index is greater or equal than the length of the sequence, return  *-1* .



**Example 1:** 

```
Input
["Fancy", "append", "addAll", "append", "multAll", "getIndex", "addAll", "append", "multAll", "getIndex", "getIndex", "getIndex"]
[[], [2], [3], [7], [2], [0], [3], [10], [2], [0], [1], [2]]
Output
[null, null, null, null, null, 10, null, null, null, 26, 34, 20]

Explanation
Fancy fancy = new Fancy();
fancy.append(2);   // fancy sequence: [2]
fancy.addAll(3);   // fancy sequence: [2+3] -> [5]
fancy.append(7);   // fancy sequence: [5, 7]
fancy.multAll(2);  // fancy sequence: [5*2, 7*2] -> [10, 14]
fancy.getIndex(0); // return 10
fancy.addAll(3);   // fancy sequence: [10+3, 14+3] -> [13, 17]
fancy.append(10);  // fancy sequence: [13, 17, 10]
fancy.multAll(2);  // fancy sequence: [13*2, 17*2, 10*2] -> [26, 34, 20]
fancy.getIndex(0); // return 26
fancy.getIndex(1); // return 34
fancy.getIndex(2); // return 20

```



**Constraints:** 

-  *1 <= val, inc, m <= 100*  
-  *0 <= idx <= 105*  
- At most  *105*  calls total will be made to  *append* ,  *addAll* ,  *multAll* , and  *getIndex* .


# [1622. 奇妙序列][cnTitle]

**困难**

请你实现三个 API  *append* ， *addAll*  和  *multAll*  来实现奇妙序列。

请实现  *Fancy*  类 ：

-  *Fancy()*  初始化一个空序列对象。 
-  *void append(val)*  将整数  *val*  添加在序列末尾。 
-  *void addAll(inc)*  将所有序列中的现有数值都增加  *inc*  。 
-  *void multAll(m)*  将序列中的所有现有数值都乘以整数  *m*  。 
-  *int getIndex(idx)*  得到下标为  *idx*  处的数值（下标从 0 开始），并将结果对  *109 + 7*  取余。如果下标大于等于序列的长度，请返回  *-1*  。



**示例：** 

```
输入：
["Fancy", "append", "addAll", "append", "multAll", "getIndex", "addAll", "append", "multAll", "getIndex", "getIndex", "getIndex"]
[[], [2], [3], [7], [2], [0], [3], [10], [2], [0], [1], [2]]
输出：
[null, null, null, null, null, 10, null, null, null, 26, 34, 20]

解释：
Fancy fancy = new Fancy();
fancy.append(2);   // 奇妙序列：[2]
fancy.addAll(3);   // 奇妙序列：[2+3] -> [5]
fancy.append(7);   // 奇妙序列：[5, 7]
fancy.multAll(2);  // 奇妙序列：[5*2, 7*2] -> [10, 14]
fancy.getIndex(0); // 返回 10
fancy.addAll(3);   // 奇妙序列：[10+3, 14+3] -> [13, 17]
fancy.append(10);  // 奇妙序列：[13, 17, 10]
fancy.multAll(2);  // 奇妙序列：[13*2, 17*2, 10*2] -> [26, 34, 20]
fancy.getIndex(0); // 返回 26
fancy.getIndex(1); // 返回 34
fancy.getIndex(2); // 返回 20

```



**提示：** 

-  *1 <= val, inc, m <= 100*  
-  *0 <= idx <= 105*  
- 总共最多会有  *105*  次对  *append* ， *addAll* ， *multAll*  和  *getIndex*  的调用。




# 算法思路

# 测试用例
```
1622. Fancy Sequence 1622. 奇妙序列 Hard
```

[enTitle]: https://leetcode.com/problems/fancy-sequence/
[cnTitle]: https://leetcode-cn.com/problems/fancy-sequence/
