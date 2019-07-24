# [381. Insert Delete GetRandom O(1) - Duplicates allowed][enTitle]

**Hard**

Design a data structure that supports all following operations in average O(1) time.




1.  *insert(val)* : Inserts an item val to the collection. 
2.  *remove(val)* : Removes an item val from the collection if present. 
3.  *getRandom* : Returns a random element from current collection of elements. The probability of each element being returned is linearly related to the number of same value the collection contains.



Example:

```
// Init an empty collection.
RandomizedCollection collection = new RandomizedCollection();

// Inserts 1 to the collection. Returns true as the collection did not contain 1.
collection.insert(1);

// Inserts another 1 to the collection. Returns false as the collection contained 1. Collection now contains [1,1].
collection.insert(1);

// Inserts 2 to the collection, returns true. Collection now contains [1,1,2].
collection.insert(2);

// getRandom should return 1 with the probability 2/3, and returns 2 with the probability 1/3.
collection.getRandom();

// Removes 1 from the collection, returns true. Collection now contains [1,2].
collection.remove(1);

// getRandom should return 1 and 2 both equally likely.
collection.getRandom();

```




# [381. O(1) 时间插入、删除和获取随机元素 - 允许重复][cnTitle]

**困难**

设计一个支持在 *平均* 时间复杂度 **O(1)** 下**，** 执行以下操作的数据结构。

**注意: 允许出现重复元素。** 

1.  *insert(val)* ：向集合中插入元素 val。 
2.  *remove(val)* ：当 val 存在时，从集合中移除一个 val。 
3.  *getRandom* ：从现有集合中随机获取一个元素。每个元素被返回的概率应该与其在集合中的数量呈线性相关。

**示例:** 

```
// 初始化一个空的集合。
RandomizedCollection collection = new RandomizedCollection();

// 向集合中插入 1 。返回 true 表示集合不包含 1 。
collection.insert(1);

// 向集合中插入另一个 1 。返回 false 表示集合包含 1 。集合现在包含 [1,1] 。
collection.insert(1);

// 向集合中插入 2 ，返回 true 。集合现在包含 [1,1,2] 。
collection.insert(2);

// getRandom 应当有 2/3 的概率返回 1 ，1/3 的概率返回 2 。
collection.getRandom();

// 从集合中删除 1 ，返回 true 。集合现在包含 [1,2] 。
collection.remove(1);

// getRandom 应有相同概率返回 1 和 2 。
collection.getRandom();

```




# 算法思路

# 测试用例
```
381. Insert Delete GetRandom O(1) - Duplicates allowed 381. O(1) 时间插入、删除和获取随机元素 - 允许重复 Hard
```

[enTitle]: https://leetcode.com/problems/insert-delete-getrandom-o1-duplicates-allowed/
[cnTitle]: https://leetcode-cn.com/problems/insert-delete-getrandom-o1-duplicates-allowed/
