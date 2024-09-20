package softSauve;

import java.util.*;

public class parent {
    public class People {
        public String Id;
        public String Name;
        public String Parentid;
        HashMap<String, String> map;

        public People(String id, String name, String parentid) {
            map = new HashMap<>();
            map.put("Id", id);
            map.put("Name", name);
            map.put("Parentid", parentid);
        }

        public void print() {
            System.out.println(map);
        }
        
        public void print(String tag) {
            System.out.println(tag +" : "+map);
        }

        public String get(String key) {
            return map.get(key);
        }
    }

    public static void main(String[] args) {
        parent p = new parent();
        ArrayList<People> list = new ArrayList<>();
        list.add(p.new People("1", "A", null));
        list.add(p.new People("2", "B", "1"));
        list.add(p.new People("3", "C", "2"));
        list.add(p.new People("4", "D", "8"));
        list.add(p.new People("5", "E", "1"));
        list.add(p.new People("6", "F", "5"));
        list.add(p.new People("7", "G", "2"));
        list.add(p.new People("8", "H", null));

        System.out.println("The Input:");
        for(People pa:list) {
        	pa.print();
        }
        System.out.println();

        System.out.println("The Output:");

        // Initialize a HashSet to keep track of visited nodes
        HashSet<String> set = new HashSet<>();

        // Traverse the list starting with People who have no Parent (i.e., Parentid == null)
        for (People x : list) {
            if (x.get("Parentid") == null) {
                String xid = x.get("Id");
                x.print("Parent");
                
                set.add(xid); // Mark as visited
                recur(list, xid, set); // Start recursion for child nodes
            }
        }
    }

    // Recursive method to traverse and print children
    public static void recur(ArrayList<People> list, String parentId, HashSet<String> set) {
        for (People y : list) {
            if (!set.contains(y.get("Id"))) {
                if (y.get("Parentid") != null && y.get("Parentid").equals(parentId)) {
                    String childId = y.get("Id");
                    y.print("Child ");
                   
                    set.add(childId); // Mark as visited
                    recur(list, childId, set); // Recurse on the child node
                }
            }
        }
    }
}
