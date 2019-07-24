# [705. Design HashSet][enTitle]

**Easy**

Design a HashSet without using any built-in hash table libraries.

To be specific, your design should include these functions:

-  *add(value)* : Insert a value into the HashSet.  
-  *contains(value)*  : Return whether the value exists in the HashSet or not. 
-  *remove(value)* : Remove a value in the HashSet. If the value does not exist in the HashSet, do nothing.

 **Example:** 

```
MyHashSet hashSet = new MyHashSet();
hashSet.add(1);         
hashSet.add(2);         
hashSet.contains(1);    // returns true
hashSet.contains(3);    // returns false (not found)
hashSet.add(2);          
hashSet.contains(2);    // returns true
hashSet.remove(2);          
hashSet.contains(2);    // returns false (already removed)

```

 **Note:** 

- All values will be in the range of  *[0, 1000000]* . 
- The number of operations will be in the range of  *[1, 10000]* . 
- Please do not use the built-in HashSet library.


# [705. 设计哈希集合][cnTitle]

**简单**

不使用任何内建的哈希表库设计一个哈希集合

具体地说，你的设计应该包含以下的功能

-  *add(value)* ：向哈希集合中插入一个值。 
-  *contains(value)*  ：返回哈希集合中是否存在这个值。 
-  *remove(value)* ：将给定值从哈希集合中删除。如果哈希集合中没有这个值，什么也不做。

 **示例:** 

```
MyHashSet hashSet = new MyHashSet();
hashSet.add(1);         
hashSet.add(2);         
hashSet.contains(1);    // 返回 true
hashSet.contains(3);    // 返回 false (未找到)
hashSet.add(2);          
hashSet.contains(2);    // 返回 true
hashSet.remove(2);          
hashSet.contains(2);    // 返回  false (已经被删除)

```

 **注意：** 

- 所有的值都在  *[1, 1000000]* 的范围内。 
- 操作的总数目在 *[1, 10000]* 范围内。 
- 不要使用内建的哈希集合库。




# 算法思路

# 测试用例
```
705. Design HashSet 705. 设计哈希集合 Easy
```

[enTitle]: https://leetcode.com/problems/design-hashset/
[cnTitle]: https://leetcode-cn.com/problems/design-hashset/
