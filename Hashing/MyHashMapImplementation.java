// Custom educational implementation of HashMap
class MyHashMap<K, V> {

    // Node of Linked List inside each bucket
    class Node {
        K key;
        V value;
        Node next;

        Node(K key, V value) {
            this.key = key;
            this.value = value;
        }
    }

    private int size = 10;           // bucket array size
    private Node[] buckets = new Node[size];

    // Hash function → converts key to index
    private int getIndex(K key) {
        return Math.abs(key.hashCode()) % size;
    }

    // put() → insert or update key-value
    public void put(K key, V value) {
        int index = getIndex(key);
        Node head = buckets[index];

        // check if key already present → update value
        while (head != null) {
            if (head.key.equals(key)) {
                head.value = value;
                return;
            }
            head = head.next;
        }

        // otherwise insert new node at beginning
        Node newNode = new Node(key, value);
        newNode.next = buckets[index];
        buckets[index] = newNode;
    }

    // get() → search value by key
    public V get(K key) {
        int index = getIndex(key);
        Node head = buckets[index];

        while (head != null) {
            if (head.key.equals(key)) return head.value;
            head = head.next;
        }
        return null; // key not found
    }
}
