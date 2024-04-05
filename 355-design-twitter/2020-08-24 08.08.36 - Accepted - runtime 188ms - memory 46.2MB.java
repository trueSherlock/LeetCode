class Twitter {

    Map<Integer,Integer> tweetIdUserIdMap;
    Map<Integer,Set<Integer>> userFollowingUsersMap;
    /** Initialize your data structure here. */
    public Twitter() {
        tweetIdUserIdMap = new LinkedHashMap<>();
        userFollowingUsersMap = new HashMap<>();
    }
    
    /** Compose a new tweet. */
    public void postTweet(int userId, int tweetId) {
        tweetIdUserIdMap.put(tweetId,userId);
        if(!userFollowingUsersMap.containsKey(userId)){
            userFollowingUsersMap.put(userId,new HashSet<Integer>());
        }
    }
    
    /** Retrieve the 10 most recent tweet ids in the user's news feed. Each item in the news feed must be posted by users who the user followed or by the user herself. Tweets must be ordered from most recent to least recent. */
    public List<Integer> getNewsFeed(int userId) {
        try{
       List<Integer> newsFeed = new ArrayList<>();
       int ctr=0;
       if(null!=tweetIdUserIdMap && !tweetIdUserIdMap.isEmpty()){
            ListIterator<Integer> iterator = new ArrayList<Integer>(tweetIdUserIdMap.keySet()).listIterator(tweetIdUserIdMap.size());
            while(ctr<10 && iterator.hasPrevious()){
                int tweet = iterator.previous();
                int tweetUser = tweetIdUserIdMap.get(tweet);
                if(userId==tweetUser || userFollowingUsersMap.get(userId).contains(tweetUser)){
                        newsFeed.add(tweet);
                        ctr++;
                    }
            }
        }
       return newsFeed;
    }catch(Exception e){
        System.out.println(e.getMessage());
        System.out.println(e.getCause());
        e.printStackTrace();
    }
     return Collections.emptyList();   
    }
    
    /** Follower follows a followee. If the operation is invalid, it should be a no-op. */
    public void follow(int followerId, int followeeId) {
        if(followerId==followeeId) return;
        if(!userFollowingUsersMap.containsKey(followerId)){
            userFollowingUsersMap.put(followerId,new HashSet<Integer>());
        }
        userFollowingUsersMap.get(followerId).add(followeeId);
    }
    
    /** Follower unfollows a followee. If the operation is invalid, it should be a no-op. */
    public void unfollow(int followerId, int followeeId) {
        if(followerId==followeeId) return;
        if(!userFollowingUsersMap.containsKey(followerId)){
            userFollowingUsersMap.put(followerId,new HashSet<Integer>());
        }
        userFollowingUsersMap.get(followerId).remove(followeeId);
    }
}

/**
 * Your Twitter object will be instantiated and called as such:
 * Twitter obj = new Twitter();
 * obj.postTweet(userId,tweetId);
 * List<Integer> param_2 = obj.getNewsFeed(userId);
 * obj.follow(followerId,followeeId);
 * obj.unfollow(followerId,followeeId);
 */