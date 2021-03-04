# [1311. Get Watched Videos by Your Friends][enTitle]

**Medium**

There are  *n*  people, each person has a unique  *id*  between  *0*  and  *n-1* . Given the arrays  *watchedVideos*  and  *friends* , where  *watchedVideos[i]*  and  *friends[i]*  contain the list of watched videos and the list of friends respectively for the person with  *id = i* .

Level **1**  of videos are all watched videos by your friends, level **2**  of videos are all watched videos by the friends of your friends and so on. In general, the level  *k*  of videos are all watched videos by people with the shortest path **exactly**  equal to  *k*  with you. Given your  *id*  and the  *level*  of videos, return the list of videos ordered by their frequencies (increasing). For videos with the same frequency order them alphabetically from least to greatest.



**Example 1:** 

![img](https://assets.leetcode.com/uploads/2020/01/02/leetcode_friends_1.png)

```
Input: watchedVideos = [["A","B"],["C"],["B","C"],["D"]], friends = [[1,2],[0,3],[0,3],[1,2]], id = 0, level = 1
Output: ["B","C"] 
Explanation: 
You have id = 0 (green color in the figure) and your friends are (yellow color in the figure):
Person with id = 1 -> watchedVideos = ["C"] 
Person with id = 2 -> watchedVideos = ["B","C"] 
The frequencies of watchedVideos by your friends are: 
B -> 1 
C -> 2

```

**Example 2:** 

![img](https://assets.leetcode.com/uploads/2020/01/02/leetcode_friends_2.png)

```
Input: watchedVideos = [["A","B"],["C"],["B","C"],["D"]], friends = [[1,2],[0,3],[0,3],[1,2]], id = 0, level = 2
Output: ["D"]
Explanation: 
You have id = 0 (green color in the figure) and the only friend of your friends is the person with id = 3 (yellow color in the figure).

```



**Constraints:** 

-  *n == watchedVideos.length == friends.length*  
-  *2 <= n <= 100*  
-  *1 <= watchedVideos[i].length <= 100*  
-  *1 <= watchedVideos[i][j].length <= 8*  
-  *0 <= friends[i].length < n*  
-  *0 <= friends[i][j] < n*  
-  *0 <= id < n*  
-  *1 <= level < n*  
- if  *friends[i]*  contains  *j* , then  *friends[j]*  contains  *i* 


# [1311. 获取你好友已观看的视频][cnTitle]

**中等**

有  *n*  个人，每个人都有一个  *0*  到  *n-1*  的唯一  *id*  。

给你数组  *watchedVideos*  和  *friends*  ，其中  *watchedVideos[i]*  和  *friends[i]*  分别表示  *id = i*  的人观看过的视频列表和他的好友列表。

Level **1**  的视频包含所有你好友观看过的视频，level **2**  的视频包含所有你好友的好友观看过的视频，以此类推。一般的，Level 为 **k**  的视频包含所有从你出发，最短距离为 **k**  的好友观看过的视频。

给定你的  *id*  和一个  *level*  值，请你找出所有指定  *level*  的视频，并将它们按观看频率升序返回。如果有频率相同的视频，请将它们按字母顺序从小到大排列。



**示例 1：** 

![img](https://assets.leetcode-cn.com/aliyun-lc-upload/uploads/2020/01/03/leetcode_friends_1.png)

```
输入：watchedVideos = [["A","B"],["C"],["B","C"],["D"]], friends = [[1,2],[0,3],[0,3],[1,2]], id = 0, level = 1
输出：["B","C"] 
解释：
你的 id 为 0（绿色），你的朋友包括（黄色）：
id 为 1 -> watchedVideos = ["C"] 
id 为 2 -> watchedVideos = ["B","C"] 
你朋友观看过视频的频率为：
B -> 1 
C -> 2

```

**示例 2：** 

![img](https://assets.leetcode-cn.com/aliyun-lc-upload/uploads/2020/01/03/leetcode_friends_2.png)

```
输入：watchedVideos = [["A","B"],["C"],["B","C"],["D"]], friends = [[1,2],[0,3],[0,3],[1,2]], id = 0, level = 2
输出：["D"]
解释：
你的 id 为 0（绿色），你朋友的朋友只有一个人，他的 id 为 3（黄色）。

```



**提示：** 

-  *n == watchedVideos.length == friends.length*  
-  *2 <= n <= 100*  
-  *1 <= watchedVideos[i].length <= 100*  
-  *1 <= watchedVideos[i][j].length <= 8*  
-  *0 <= friends[i].length < n*  
-  *0 <= friends[i][j] < n*  
-  *0 <= id < n*  
-  *1 <= level < n*  
- 如果  *friends[i]*  包含  *j*  ，那么  *friends[j]*  包含  *i* 




# 算法思路

# 测试用例
```
1311. Get Watched Videos by Your Friends 1311. 获取你好友已观看的视频 Medium
```

[enTitle]: https://leetcode.com/problems/get-watched-videos-by-your-friends/
[cnTitle]: https://leetcode-cn.com/problems/get-watched-videos-by-your-friends/
