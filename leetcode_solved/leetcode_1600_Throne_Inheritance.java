// AC: Runtime: 262 ms, faster than 62.61% of Java online submissions for Throne Inheritance.
// Memory Usage: 104.9 MB, less than 60.87% of Java online submissions for Throne Inheritance.
// M-nary tree pre-order traversal.
// T:birth, death:O(1), getInheritanceOrder:O(n), S:O(n)
// 
class MTreeNode {
    String val;
    List<MTreeNode> children;
    MTreeNode(String val) {
        this.val = val;
    }
    public MTreeNode addChild(String val) {
        if (children == null) {
            children = new LinkedList<>();
        }
        MTreeNode childNode = new MTreeNode(val);
        children.add(childNode);
        return childNode;
    }
}

class ThroneInheritance {
    MTreeNode root;
    HashMap<String, MTreeNode> nodes;
    HashSet<String> deadList;
    List<String> inheritanceOrder;

    public ThroneInheritance(String kingName) {
        root = new MTreeNode(kingName);
        nodes = new HashMap<>();
        nodes.put(kingName, root);
        deadList = new HashSet<>();
        inheritanceOrder = new ArrayList<>();
    }

    public void birth(String parentName, String childName) {
        MTreeNode pNode = nodes.get(parentName);
        MTreeNode childNode = pNode.addChild(childName);
        nodes.put(childName, childNode);
    }

    public void death(String name) {
        deadList.add(name);
    }

    public List<String> getInheritanceOrder() {
        inheritanceOrder.clear();
        travel(root);
        return inheritanceOrder;
    }

    private void travel(MTreeNode root) {
        if (root == null) {
            return;
        }
        if (!deadList.contains(root.val)) {
            inheritanceOrder.add(root.val);
        }
        if (root.children != null) {
            for (MTreeNode child: root.children) {
                travel(child);
            }
        }
    }
}
