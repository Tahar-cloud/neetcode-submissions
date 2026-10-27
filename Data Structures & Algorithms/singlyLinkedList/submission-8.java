class Node{
    int value;
    Node next;

    public Node(int val){
        this.value = val;
        this.next = null;
    }

}
class LinkedList {

    public static List<Integer> list;
    public Node head;
    public LinkedList() {
        this.list = null;

    }

    public int get(int index) {
        Node new_node = head;
    for(int i = 0; i < index; i++){
        if(new_node == null) {
            return -1; 
        }
        new_node = new_node.next;
    }

    if(new_node == null) return -1;

    return new_node.value;
    }

    public void insertHead(int val) {
        Node new_node = new Node(val);
        new_node.next = head;
        head = new_node;
    }

    public void insertTail(int val) {
    Node newNode = new Node(val);
    if (head == null) {
        head = newNode;
        return;
    }
    Node current = head;
    while(current.next != null){
        current = current.next;
    }
    current.next = newNode;
    }

    public boolean remove(int index) {
    if (index < 0 || head == null) {
        return false;
    }
   
    if (index == 0) {
        head = head.next;
        return true; 
    }
    Node current = head;
    for (int i = 0; i < index - 1; i++) {
        if (current.next == null) {
            return false; 
        }
        current = current.next;
    }

    if (current.next == null) {
        return false; 
    }

    current.next = current.next.next;
    return true; 
}

    public ArrayList<Integer> getValues() {
        ArrayList<Integer> result = new ArrayList<>();
        Node copy = head;
        while(copy != null){
            result.add(copy.value);
            copy = copy.next;
        }
        return result;
    }
}
