public class QueueArrayIMPL implements BridgeQueueInterface{
    Node [] queue = new Node[10];
    int head;
    int tail;
    int size;
    @Override
    public boolean enqueue(Node enqueNode){
        if(size==queue.length){
            //Or resize operation
            return false;
        }else if(size==0){
            queue[tail]=enqueNode;
        }else {
            tail = (tail + 1) % queue.length; //this is unneccessary in current impl
            queue[tail] = enqueNode;
        }
        size++;
        return true;
    }
    @Override
    public Node dequeue(){
        Node dequeueNode;
        if(size==0){
            return null;
        }else if(head==tail){
            size=0;
            dequeueNode = queue[head];
        }else{
            size--;
            dequeueNode = queue[head];
            head = (head+1)%queue.length;
        }
        return dequeueNode;
    }
}
