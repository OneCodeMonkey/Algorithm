// AC: Runtime: 287 ms, faster than 32.35% of Java online submissions for Operations on Tree.
// Memory Usage: 47.5 MB, less than 68.04% of Java online submissions for Operations on Tree.
// .
// T: lock:O(n), upgrade:O(n^2)
//
class LockingTree {
    public HashMap<Integer, Integer> relation;
    public HashMap<Integer, List<Integer>> parentToChildRelation;
    public HashMap<Integer, Integer> lockUserRecord;

    public LockingTree(int[] parent) {
        int size = parent.length;
        relation = new HashMap<>();
        parentToChildRelation = new HashMap<>();
        lockUserRecord = new HashMap<>();
        for (int i = 0; i < size; i++) {
            relation.put(i, parent[i]);
            if (parentToChildRelation.containsKey(parent[i])) {
                parentToChildRelation.get(parent[i]).add(i);
            } else {
                List<Integer> tempList = new LinkedList<>();
                tempList.add(i);
                parentToChildRelation.put(parent[i], tempList);
            }
        }
    }

    public boolean lock(int num, int user) {
        if (lockUserRecord.containsKey(num)) {
            return false;
        } else {
            lockUserRecord.put(num, user);
            return true;
        }
    }

    public boolean unlock(int num, int user) {
        if (lockUserRecord.containsKey(num) && lockUserRecord.get(num) == user) {
            lockUserRecord.remove(num);
            return true;
        }

        return false;
    }

    public boolean upgrade(int num, int user) {
        if (!lockUserRecord.containsKey(num)) {
            // ancester has no lock.
            boolean ancestorHasLock = false;
            int pos = num;
            while (relation.get(pos) != -1) {
                int parent = relation.get(pos);
                if (lockUserRecord.containsKey(parent)) {
                    ancestorHasLock = true;
                    break;
                }
                pos = parent;
            }
            if (ancestorHasLock) {
                return false;
            }

            // check child has lock
            // leaf node
            if (!parentToChildRelation.containsKey(num)) {
                return false;
            }
            boolean childHasLock = false;
            List<Integer> searchChild = new LinkedList<>(parentToChildRelation.get(num));
            while (!searchChild.isEmpty()) {
                List<Integer> newSearchList = new LinkedList<>();
                for (int i: searchChild) {
                    if (lockUserRecord.containsKey(i)) {
                        childHasLock = true;
                        lockUserRecord.remove(i);
                    }

                    newSearchList.addAll(parentToChildRelation.getOrDefault(i, new LinkedList<>()));
                }
                searchChild = newSearchList;
            }
            if (!childHasLock) {
                return false;
            }
            lockUserRecord.put(num, user);

            return true;
        }

        return false;
    }
}
