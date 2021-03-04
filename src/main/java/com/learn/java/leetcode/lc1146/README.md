# [1146. Snapshot Array][enTitle]

**Medium**

Implement a SnapshotArray that supports the following interface:

-  *SnapshotArray(int length)*  initializes an array-like data structure with the given length. **Initially, each element equals 0** . 
-  *void set(index, val)*  sets the element at the given  *index*  to be equal to  *val* . 
-  *int snap()*  takes a snapshot of the array and returns the  *snap_id* : the total number of times we called  *snap()*  minus  *1* . 
-  *int get(index, snap_id)*  returns the value at the given  *index* , at the time we took the snapshot with the given  *snap_id* 



**Example 1:** 

```
Input: ["SnapshotArray","set","snap","set","get"]
[[3],[0,5],[],[0,6],[0,0]]
Output: [null,null,0,null,5]
Explanation:
SnapshotArray snapshotArr = new SnapshotArray(3); // set the length to be 3
snapshotArr.set(0,5);  // Set array[0] = 5
snapshotArr.snap();  // Take a snapshot, return snap_id = 0
snapshotArr.set(0,6);
snapshotArr.get(0,0);  // Get the value of array[0] with snap_id = 0, return 5
```



**Constraints:** 

-  *1 <= length <= 50000*  
- At most  *50000*  calls will be made to  *set* ,  *snap* , and  *get* . 
-  *0 <= index < length*  
-  *0 <= snap_id <* (the total number of times we call  *snap()* ) 
-  *0 <= val <= 10^9* 


# [1146. 快照数组][cnTitle]

**中等**

实现支持下列接口的「快照数组」- SnapshotArray：

-  *SnapshotArray(int length)*  - 初始化一个与指定长度相等的 类数组 的数据结构。**初始时，每个元素都等于** **0** 。 
-  *void set(index, val)*  - 会将指定索引  *index*  处的元素设置为  *val* 。 
-  *int snap()*  - 获取该数组的快照，并返回快照的编号  *snap_id* （快照号是调用  *snap()*  的总次数减去  *1* ）。 
-  *int get(index, snap_id)*  - 根据指定的  *snap_id*  选择快照，并返回该快照指定索引  *index*  的值。



**示例：** 

```
输入：["SnapshotArray","set","snap","set","get"]
     [[3],[0,5],[],[0,6],[0,0]]
输出：[null,null,0,null,5]
解释：SnapshotArray snapshotArr = new SnapshotArray(3); // 初始化一个长度为 3 的快照数组
snapshotArr.set(0,5);  // 令 array[0] = 5
snapshotArr.snap();  // 获取快照，返回 snap_id = 0
snapshotArr.set(0,6);
snapshotArr.get(0,0);  // 获取 snap_id = 0 的快照中 array[0] 的值，返回 5
```



**提示：** 

-  *1 <= length <= 50000*  
- 题目最多进行 *50000*  次 *set* ， *snap* ，和  *get* 的调用 。 
-  *0 <= index < length*  
-  *0 <= snap_id <* 我们调用  *snap()*  的总次数 
-  *0 <= val <= 10^9* 




# 算法思路

# 测试用例
```
1146. Snapshot Array 1146. 快照数组 Medium
```

[enTitle]: https://leetcode.com/problems/snapshot-array/
[cnTitle]: https://leetcode-cn.com/problems/snapshot-array/
