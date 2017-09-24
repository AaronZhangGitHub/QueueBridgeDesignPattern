public abstract class Queue {
    protected BridgeQueueInterface queue;
    protected  Queue(BridgeQueueInterface queue){
        this.queue = queue;
    }
    protected abstract boolean enqueue(Node n);
    protected abstract Node dequeue();
}
