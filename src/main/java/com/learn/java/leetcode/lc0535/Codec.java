package com.learn.java.leetcode.lc0535;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class Codec {
	Map<String,String> hashToUrlMap = new HashMap<>();
	Map<String,String> urlToHashMap = new HashMap<>();
	String tinyUrlBase="http://tinyurl.com/";
	String characters="abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
	Random random=new Random();
	// Encodes a URL to a shortened URL.
	public String encode(String longUrl) {
		if(urlToHashMap.containsKey(longUrl)){
			return tinyUrlBase+urlToHashMap.get(longUrl);
		}
		StringBuffer hash = new StringBuffer();
		int length = characters.length();
		do{
			for(int i =0;i<6;i++){
				hash.append(characters.charAt(random.nextInt(length)));
			}
		}while(hashToUrlMap.containsKey(hash.toString()));
		hashToUrlMap.put(hash.toString(),longUrl);
		urlToHashMap.put(longUrl,hash.toString());
		String ret =  tinyUrlBase+hash.toString();
		//System.out.println(ret);
		return ret;
	}

	// Decodes a shortened URL to its original URL.
	public String decode(String shortUrl) {
		return hashToUrlMap.get(shortUrl.substring(tinyUrlBase.length()));
	}
}
