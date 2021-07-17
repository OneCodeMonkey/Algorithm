// AC: Runtime: 11 ms, faster than 11.30% of Java online submissions for Encode and Decode TinyURL.
// Memory Usage: 41 MB, less than 5.59% of Java online submissions for Encode and Decode TinyURL.
// .
// T:O(1), S:O(n)
// 
public class Codec {
    private List<String> record = new ArrayList<>();
    private String host = "http://tinyurl.com/";

    // Encodes a URL to a shortened URL.
    public String encode(String longUrl) {
        record.add(longUrl);

        return host + record.size();
    }

    // Decodes a shortened URL to its original URL.
    public String decode(String shortUrl) {
        String[] arr = shortUrl.split("/");
        return record.get(Integer.parseInt(arr[arr.length - 1]) - 1);
    }
}