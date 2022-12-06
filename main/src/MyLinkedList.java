public class MyLinkedList<T> {
      Node<T> head;
    public class Node<T>{
        T value;
        Node<T> next;

        public  Node(T value){
            this.value = value;
        }
    }

    public void appendToTail( T value){
        if(head == null){
            Node<T> nodeToAdd = new Node<>(value);
            this.head = nodeToAdd;
        }

    }
}
