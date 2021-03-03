# [1024. Video Stitching][enTitle]

**Medium**

You are given a series of video clips from a sporting event that lasted  *T*  seconds. These video clips can be overlapping with each other and have varied lengths.

Each video clip  *clips[i]*  is an interval: it starts at time  *clips[i][0]*  and ends at time  *clips[i][1]* . We can cut these clips into segments freely: for example, a clip  *[0, 7]*  can be cut into segments  *[0, 1] + [1, 3] + [3, 7]* .

Return the minimum number of clips needed so that we can cut the clips into segments that cover the entire sporting event ( *[0, T]* ). If the task is impossible, return  *-1* .



**Example 1:** 

```
Input:clips = [[0,2],[4,6],[8,10],[1,9],[1,5],[5,9]], T = 10
Output: 3
Explanation: 
We take the clips [0,2], [8,10], [1,9]; a total of 3 clips.
Then, we can reconstruct the sporting event as follows:
We cut [1,9] into segments [1,2] + [2,8] + [8,9].
Now we have segments [0,2] + [2,8] + [8,10] which cover the sporting event [0, 10].
```

**Example 2:** 

```
Input:clips = [[0,1],[1,2]], T = 5
Output: -1
Explanation: 
We can't cover [0,5] with only [0,1] and [1,2].
```

**Example 3:** 

```
Input:clips = [[0,1],[6,8],[0,2],[5,6],[0,4],[0,3],[6,7],[1,3],[4,7],[1,4],[2,5],[2,6],[3,4],[4,5],[5,7],[6,9]], T = 9
Output: 3
Explanation: 
We can take clips [0,4], [4,7], and [6,9].
```

**Example 4:** 

```
Input:clips = [[0,4],[2,8]], T = 5
Output: 2
Explanation: 
Notice you can have extra video after the event ends.
```



**Constraints:** 

-  *1 <= clips.length <= 100*  
-  *0 <= clips[i][0] <= clips[i][1] <= 100*  
-  *0 <= T <= 100* 


# [1024. 视频拼接][cnTitle]

**中等**

你将会获得一系列视频片段，这些片段来自于一项持续时长为  *T*  秒的体育赛事。这些片段可能有所重叠，也可能长度不一。

视频片段  *clips[i]*  都用区间进行表示：开始于  *clips[i][0]*  并于  *clips[i][1]*  结束。我们甚至可以对这些片段自由地再剪辑，例如片段  *[0, 7]*  可以剪切成  *[0, 1] + [1, 3] + [3, 7]*  三部分。

我们需要将这些片段进行再剪辑，并将剪辑后的内容拼接成覆盖整个运动过程的片段（ *[0, T]* ）。返回所需片段的最小数目，如果无法完成该任务，则返回  *-1*  。



**示例 1：** 

```
输入：clips = [[0,2],[4,6],[8,10],[1,9],[1,5],[5,9]], T = 10
输出：3
解释：
我们选中 [0,2], [8,10], [1,9] 这三个片段。
然后，按下面的方案重制比赛片段：
将 [1,9] 再剪辑为 [1,2] + [2,8] + [8,9] 。
现在我们手上有 [0,2] + [2,8] + [8,10]，而这些涵盖了整场比赛 [0, 10]。

```

**示例 2：** 

```
输入：clips = [[0,1],[1,2]], T = 5
输出：-1
解释：
我们无法只用 [0,1] 和 [1,2] 覆盖 [0,5] 的整个过程。

```

**示例 3：** 

```
输入：clips = [[0,1],[6,8],[0,2],[5,6],[0,4],[0,3],[6,7],[1,3],[4,7],[1,4],[2,5],[2,6],[3,4],[4,5],[5,7],[6,9]], T = 9
输出：3
解释：
我们选取片段 [0,4], [4,7] 和 [6,9] 。

```

**示例 4：** 

```
输入：clips = [[0,4],[2,8]], T = 5
输出：2
解释：
注意，你可能录制超过比赛结束时间的视频。

```



**提示：** 

-  *1 <= clips.length <= 100*  
-  *0 <= clips[i][0] <= clips[i][1] <= 100*  
-  *0 <= T <= 100* 




# 算法思路

# 测试用例
```
1024. Video Stitching 1024. 视频拼接 Medium
```

[enTitle]: https://leetcode.com/problems/video-stitching/
[cnTitle]: https://leetcode-cn.com/problems/video-stitching/
