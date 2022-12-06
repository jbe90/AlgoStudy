import java.math.BigInteger;
import java.util.*;
import java.util.stream.Collectors;


public class main {
    private static final int MAX_CAPACITY = BigInteger.valueOf(2)
            .multiply(BigInteger.valueOf(1073741824))
            .divide(BigInteger.valueOf(Integer.BYTES))
            .intValue();

    Stack<String> stack = new Stack<>();

    public static Queue<String> queue = new PriorityQueue<>();

    HashMap<String, Integer[]> hashmap = new HashMap<>();
    LinkedHashMap<String, Integer[]> hashMap1 = new LinkedHashMap<>();
    static LinkedHashMap<Integer, String[]> hashMap = new LinkedHashMap<>();
    static LinkedHashMap<String, String> linkedHashMap = new LinkedHashMap<>();
    static Map<Character, Integer[]> map = new HashMap<>();

    public static void main(String[] args) {
        int[] test = new int[]{5, 4, 2, 1, 8, 6};
        ArrayList<String> temp1 = new ArrayList<>();

        LinkedList<Integer> list = new LinkedList();

        list.add(3);
        list.get(0);

        var result1 = list.get(0);
        int[] sortedArr = Arrays.stream(test).sorted().toArray();

        temp1.add("joespeh");
        temp1.add("minae");
        Arrays.stream(temp1.get(0).split("")).sorted().collect(Collectors.joining());
        List<List<String>> result = new ArrayList<>();
        String sorted = Arrays.stream(temp1.get(0).split("")).sorted().collect(Collectors.joining());
//        List<String> result = temp1.stream().filter(name -> name.contains("e")).sorted().collect(Collectors.toList());

        StringBuilder s = new StringBuilder();

        s.append("Sachin");
        s.append(" Tendulkar");//concat() method appends the string at the end
        System.out.println(s);

        BST bst = buildTree(test);
        BST bst1 = buildTree(test);
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        hashMap.putIfAbsent(3, 3);
        String[] arr1 = {"A", ">", "C"};
        String[] arr2 = {"A", ">", "C"};
        String amgad = "Amgad";
        amgad.charAt(0);
        int res1 = String.join("", arr1).hashCode();
        int res2 = String.join("", arr2).hashCode();
        int code = bst.hashCode();
        int code1 = bst1.hashCode();
//        hashMap.put(arr1, new String[]{"hello"});
//        hashMap.put(arr2, new String[]{"hello2"});
//        String[] result = hashMap.get(arr2);


        linkedHashMap.put("joseph", "hello");
        linkedHashMap.put("joseph", "hello");
        linkedHashMap.put("John", "hello");
        linkedHashMap.put("Amgad", "hello");

        map.put('d', new Integer[]{0});
        map.put('e', new Integer[]{0});
        map.put('f', new Integer[]{0});
        map.put('a', new Integer[]{0});

        map.get('d');
        String[] keys = linkedHashMap.keySet().toArray(new String[0]);
        Object[] keys1 = map.keySet().toArray();
        System.out.println("done " + bst.contains(4) + " " + hashMap.size());
//
//        hashMap.containsKey().
        Map<Human, String> temp = new TreeMap<>(new SortByAge());

        firstUniqChar("leetcode");

        MyStringBuilder myStringBuilder = new MyStringBuilder();
        myStringBuilder.append("hello");
        myStringBuilder.append("world");

        String myString = myStringBuilder.toString();
        System.out.println(myString);

        MyHashMap<String, String> myHashMap = new MyHashMap<>();
        myHashMap.put("joe", "Hello");
        myHashMap.put("joe", "Hello2");
        myHashMap.put("jow", "Hello3");
        String value = myHashMap.get("joe");
        System.out.println("done");
    }

    static void reverseLinkedList() {
        LinkedList temp = new LinkedList();
        temp.add(4);
        temp.add(5);
        temp.add(9);

        var node = temp.get(0);
    }

    static BST buildTree(int[] values) {
        BST bst = new BST();
        for (int value : values) {
            bst.insert(value);
        }

        return bst;
    }


    //hello
    //olleh
    static void reverseString(char[] s) {
        for (int i = 0; i < s.length / 2; i++) {
            char temp = s[i];

            s[i] = s[s.length - i - 1];
            s[s.length - i - 1] = temp;

            System.out.println("sI  " + s[i] + " and " + (s.length - i - 1));
            System.out.println("the swap " + s[s.length - i - 1] + " and " + temp);
        }

        for (int i = 0; i < s.length; i++) {
            System.out.println("after " + s[i]);
        }

    }

    public static int firstUniqChar(String s) {
        Map<Character, List<Integer>> map = new LinkedHashMap<>();

        for (int i = 0; i < s.length(); i++) {
            map.computeIfAbsent(s.charAt(i), k -> new ArrayList<Integer>()).add(i);
        }

        for (char c : map.keySet()) {
            if (map.get(c).size() == 1) {
                return map.get(c).get(0);
            }
        }
        return -1;
    }

//    public static void doSomething(){
//        HashMap<Integer, Integer> hashMap = new HashMap<>();
//
//        for(int i=0 ; i < nums.length ;i++){
//            Integer temp = hashMap.get(i);
//            if (temp == null){
//                hashMap.put(i,1);
//            }else {
//                temp +=1;
//                hashMap.put(i,temp);
//
//            }
//        }


//        for (Map.Entry<Integer, Integer> entry : hashMap.entrySet()) {
//            if (entry.getValue().equals(1)) {
//                entry
//                return entry.getKey();
//            }
//        }
//    }

}
