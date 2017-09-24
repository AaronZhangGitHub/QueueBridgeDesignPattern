public class QueueLinkedListIMPL {
    Node head;
    Node tail;
    public boolean enqueue(Node nodeToEnq){
        if(nodeToEnq==null){
            return false;
        }
        tail.next = nodeToEnq;
        tail = nodeToEnq;
        return true;
    }
    public Node dequeue(){
        if(head==null){
            return null;
        }
        Node temp = head;
        head = head.next;
        return temp;
    }
}
