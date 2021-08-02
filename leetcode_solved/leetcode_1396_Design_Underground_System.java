// AC: Runtime: 107 ms, faster than 28.64% of Java online submissions for Design Underground System.
// Memory Usage: 53 MB, less than 38.29% of Java online submissions for Design Underground System.
// using two hashmap.
// T:O(n), S:O(n)
// 
class UndergroundSystem {
    private HashMap<String, List<Integer>> record;
    private HashMap<Integer, String> checkIn;

    public UndergroundSystem() {
        record = new HashMap<>();
        checkIn = new HashMap<>();
    }

    public void checkIn(int id, String stationName, int t) {
        checkIn.put(id, stationName + "#" + t);
    }

    public void checkOut(int id, String stationName, int t) {
        String checkInStr = checkIn.get(id);
        String[] arr = checkInStr.split("#");
        int time = Integer.parseInt(arr[1]);
        String checkInStationName = arr[0];
        String temp = checkInStationName + "#" + stationName;
        if (record.get(temp) != null) {
            record.get(temp).set(0, record.get(temp).get(0) + t - time);
            record.get(temp).set(1, record.get(temp).get(1) + 1);
        } else {
            List<Integer> tempList = new LinkedList<>();
            tempList.add(t - time);
            tempList.add(1);
            record.put(temp, tempList);
        }
        checkIn.remove(id);
    }

    public double getAverageTime(String startStation, String endStation) {
        String temp = startStation + "#" + endStation;
        return record.get(temp).get(0) / (record.get(temp).get(1) * 1.00000);
    }
}