# [677. Map Sum Pairs][enTitle]

**Medium**

Implement the  *MapSum*  class:

-  *MapSum()*  Initializes the  *MapSum*  object. 
-  *void insert(String key, int val)*  Inserts the  *key-val*  pair into the map. If the  *key*  already existed, the original  *key-value*  pair will be overridden to the new one. 
-  *int sum(string prefix)*  Returns the sum of all the pairs' value whose  *key*  starts with the  *prefix* .



**Example 1:** 

```
Input
["MapSum", "insert", "sum", "insert", "sum"]
[[], ["apple", 3], ["ap"], ["app", 2], ["ap"]]
Output
[null, null, 3, null, 5]

Explanation
MapSum mapSum = new MapSum();
mapSum.insert("apple", 3);  
mapSum.sum("ap");           // return 3 (apple = 3)
mapSum.insert("app", 2);    
mapSum.sum("ap");           // return 5 (apple + app = 3 + 2 = 5)

```



**Constraints:** 

-  *1 <= key.length, prefix.length <= 50*  
-  *key*  and  *prefix*  consist of only lowercase English letters. 
-  *1 <= val <= 1000*  
- At most  *50*  calls will be made to  *insert*  and  *sum* .


# [677. 键值映射][cnTitle]

**中等**

实现一个  *MapSum*  类，支持两个方法， *insert*  和  *sum* ：

-  *MapSum()*  初始化  *MapSum*  对象 
-  *void insert(String key, int val)*  插入  *key-val*  键值对，字符串表示键  *key*  ，整数表示值  *val*  。如果键  *key*  已经存在，那么原来的键值对将被替代成新的键值对。 
-  *int sum(string prefix)*  返回所有以该前缀  *prefix*  开头的键  *key*  的值的总和。



**示例：** 

```
输入：
["MapSum", "insert", "sum", "insert", "sum"]
[[], ["apple", 3], ["ap"], ["app", 2], ["ap"]]
输出：
[null, null, 3, null, 5]

解释：
MapSum mapSum = new MapSum();
mapSum.insert("apple", 3);  
mapSum.sum("ap");           // return 3 (apple = 3)
mapSum.insert("app", 2);    
mapSum.sum("ap");           // return 5 (apple + app = 3 + 2 = 5)

```



**提示：** 

-  *1 <= key.length, prefix.length <= 50*  
-  *key*  和  *prefix*  仅由小写英文字母组成 
-  *1 <= val <= 1000*  
- 最多调用  *50*  次  *insert*  和  *sum* 




# 算法思路

# 测试用例
```
677. Map Sum Pairs 677. 键值映射 Medium
```

[enTitle]: https://leetcode.com/problems/map-sum-pairs/
[cnTitle]: https://leetcode-cn.com/problems/map-sum-pairs/
