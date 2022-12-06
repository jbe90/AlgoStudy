public class MyHashMap<K, V> {

    public class Node<V> {
        V value;
        Node next;

        public Node(V value, Node next) {
            this.value = value;
            this.next = next;
        }
    }

    private Node[] nodes;

    public MyHashMap() {
        this.nodes = new Node[100];
    }

    public void put(K key, V val) {
        int index = getIndex(key) % 100;
        if (this.nodes[index] == null) {
            Node newNode = new Node(val, null);
            this.nodes[index] = newNode;
        } else {
            Node lastNode = this.nodes[index];
            Node newNode = new Node(val, lastNode);
            this.nodes[index] = newNode;
        }
    }

    public V get(K key) {
        int index = getIndex(key) % 100;
        V value = (V) this.nodes[index].value;

        return value;
    }

    private int getIndex(K key) {
        int h;
        return (key == null) ? 0 : (h = key.hashCode()) ^ (h >>> 16);
    }
}
