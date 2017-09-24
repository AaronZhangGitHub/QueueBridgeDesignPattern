public class QueueIMPL extends Queue {

    public QueueIMPL(BridgeQueueInterface queue){
        super(queue);
    }

    public boolean enqueue(Node n){
        return queue.enqueue(n);
    }

    public Node dequeue(){
        return queue.dequeue();
    }
}
