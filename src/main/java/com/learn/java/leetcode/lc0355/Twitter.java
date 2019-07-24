package com.learn.java.leetcode.lc0355;

import java.util.*;

public class Twitter {
	private static int timestamp = 0;
	//文章
	private static class Tweet {
		private int id;
		private int time;
		private Tweet next;

		// 需要传入推文内容（id）和发文时间
		public Tweet(int id, int time) {
			this.id = id;
			this.time = time;
			this.next = null;
		}
	}
	//用户
	private static class User{
		private int id;
		public Set<Integer> followed;
		// 用户发表的推文链表头结点
		public Tweet head;

		public User(int userId) {
			followed = new HashSet<>();
			this.id = userId;
			this.head = null;
			// 关注一下自己
			follow(id);
		}

		public void follow(int userId) {
			followed.add(userId);
		}

		public void unfollow(int userId) {
			// 不可以取关自己
			if (userId != this.id) {
				followed.remove(userId);
			}
		}

		public void post(int tweetId) {
			Tweet twt = new Tweet(tweetId, timestamp);
			timestamp++;
			// 将新建的推文插入链表头
			// 越靠前的推文 time 值越大
			twt.next = head;
			head = twt;
		}

	}

	// 将 userId 和 User 对象对应起来
	private Map<Integer, User> userMap = new HashMap<>();


	/** Initialize your data structure here. */
	public Twitter() {

	}

	/** Compose a new tweet. */
	public void postTweet(int userId, int tweetId) {
		if(!userMap.containsKey(userId)){
			userMap.put(userId,new User(userId));
		}
		User user = userMap.get(userId);
		user.post(tweetId);
	}

	/** Retrieve the 10 most recent tweet ids in the user's news feed. Each item in the news feed must be posted by users who the user followed or by the user herself. Tweets must be ordered from most recent to least recent. */
	public List<Integer> getNewsFeed(int userId) {
		List<Integer> results = new ArrayList<>();
		if(!userMap.containsKey(userId)){
			return results;
		}
		Set<Integer> users = userMap.get(userId).followed;
		// 自动通过 time 属性从大到小排序，容量为 users 的大小
		PriorityQueue<Tweet> pq = new PriorityQueue<>(users.size(),(a,b)->(b.time-a.time));
		// 先将所有链表头节点插入优先级队列
		for(int id :users){
			Tweet tweet = userMap.get(id).head;
			if(tweet==null){
				continue;
			}
			pq.add(tweet);
		}
		while(!pq.isEmpty()){
			if(results.size()==10){
				break;
			}
			Tweet tweet = pq.poll();
			results.add(tweet.id);
			if(tweet.next!=null){
				pq.add(tweet.next);
			}
		}

		return results;
	}

	/** Follower follows a followee. If the operation is invalid, it should be a no-op. */
	public void follow(int followerId, int followeeId) {
		if(!userMap.containsKey(followerId)){
			userMap.put(followerId,new User(followerId));
		}

		if(!userMap.containsKey(followeeId)){
			userMap.put(followeeId,new User(followeeId));
		}
		userMap.get(followerId).follow(followeeId);
	}

	/** Follower unfollows a followee. If the operation is invalid, it should be a no-op. */
	public void unfollow(int followerId, int followeeId) {
		if (userMap.containsKey(followerId)) {
			User flwer = userMap.get(followerId);
			flwer.unfollow(followeeId);
		}
	}
}
