# [460. LFU Cache][enTitle]

**Hard**

Design and implement a data structure for Least Frequently Used (LFU) cache. It should support the following operations:  *get*  and  *put* .

 *get(key)*  - Get the value (will always be positive) of the key if the key exists in the cache, otherwise return -1.  *put(key, value)*  - Set or insert the value if the key is not already present. When the cache reaches its capacity, it should invalidate the least frequently used item before inserting a new item. For the purpose of this problem, when there is a tie (i.e., two or more keys that have the same frequency), the least recently used key would be evicted.

Follow up: Could you do both operations in O(1) time complexity?

Example:

```
LFUCache cache = new LFUCache( 2 /* capacity */ );

cache.put(1, 1);
cache.put(2, 2);
cache.get(1);       // returns 1
cache.put(3, 3);    // evicts key 2
cache.get(2);       // returns -1 (not found)
cache.get(3);       // returns 3.
cache.put(4, 4);    // evicts key 1.
cache.get(1);       // returns -1 (not found)
cache.get(3);       // returns 3
cache.get(4);       // returns 4

```




# [460. LFU缓存][cnTitle]

**困难**

设计并实现最不经常使用（LFU）缓存的数据结构。它应该支持以下操作： *get*  和  *put* 。

 *get(key)*  - 如果键存在于缓存中，则获取键的值（总是正数），否则返回 -1。  *put(key, value)*  - 如果键不存在，请设置或插入值。当缓存达到其容量时，它应该在插入新项目之前，使最不经常使用的项目无效。在此问题中，当存在平局（即两个或更多个键具有相同使用频率）时，**最近** 最少使用的键将被去除。

**进阶：**  你是否可以在 **O(1)** 时间复杂度内执行两项操作？

**示例：** 

```
LFUCache cache = new LFUCache( 2 /* capacity (缓存容量) */ );

cache.put(1, 1);
cache.put(2, 2);
cache.get(1);       // 返回 1
cache.put(3, 3);    // 去除 key 2
cache.get(2);       // 返回 -1 (未找到key 2)
cache.get(3);       // 返回 3
cache.put(4, 4);    // 去除 key 1
cache.get(1);       // 返回 -1 (未找到 key 1)
cache.get(3);       // 返回 3
cache.get(4);       // 返回 4
```




# 算法思路

# 测试用例
```
460. LFU Cache 460. LFU缓存 Hard
```

[enTitle]: https://leetcode.com/problems/lfu-cache/
[cnTitle]: https://leetcode-cn.com/problems/lfu-cache/
