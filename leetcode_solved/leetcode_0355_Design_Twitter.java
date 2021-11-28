// AC: Runtime: 8 ms, faster than 97.94% of Java online submissions for Design Twitter.
// Memory Usage: 37.3 MB, less than 62.84% of Java online submissions for Design Twitter.
// hashmap.
// T:post,follow,unfollow:O(1), getFeed: O(n)
// 
class Twitter {
    private HashMap<Integer, List<Integer>> userPubList;
    private HashMap<Integer, HashSet<Integer>> userFollowList;
    private List<Integer> totalPubList;

    public Twitter() {
        userPubList = new HashMap<>();
        userFollowList = new HashMap<>();
        totalPubList = new LinkedList<>();
    }

    public void postTweet(int userId, int tweetId) {
        if (userPubList.containsKey(userId)) {
            userPubList.get(userId).add(0, tweetId);
        } else {
            List<Integer> tempList = new LinkedList<>();
            tempList.add(tweetId);
            userPubList.put(userId, tempList);
        }
        totalPubList.add(0, tweetId);
    }

    public List<Integer> getNewsFeed(int userId) {
        List<Integer> userList = new ArrayList<>(userPubList.getOrDefault(userId, new LinkedList<>()));
        if (userFollowList.containsKey(userId)) {
            HashSet<Integer> feedSet = new HashSet<>(userList);
            for (int followedUserId: userFollowList.get(userId)) {
                feedSet.addAll(userPubList.getOrDefault(followedUserId, new LinkedList<>()));
            }
            List<Integer> totalFeedList = new LinkedList<>();
            for (int feedId: totalPubList) {
                if (feedSet.contains(feedId)) {
                    totalFeedList.add(feedId);
                    if (totalFeedList.size() == feedSet.size() || totalFeedList.size() >= 10) {
                        break;
                    }
                }
            }
            return totalFeedList;
        } else {
            if (userList.size() > 10) {
                userList = userList.subList(0, 10);
            }
            return userList;
        }
    }

    public void follow(int followerId, int followeeId) {
        if (userFollowList.containsKey(followerId)) {
            userFollowList.get(followerId).add(followeeId);
        } else {
            HashSet<Integer> tempSet = new HashSet<>();
            tempSet.add(followeeId);
            userFollowList.put(followerId, tempSet);
        }
    }

    public void unfollow(int followerId, int followeeId) {
        if (userFollowList.containsKey(followerId)) {
            userFollowList.get(followerId).remove(followeeId);
        }
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