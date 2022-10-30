package zjazd2.wyk2.zad17;

public class Node {

    private Node previousNode;
    private Node nextNode;
    private Integer value;

    public Node(Integer value) {
        this.value = value;
    }

    public Node(Node previousNode, Integer value) {
        this.previousNode = previousNode;
        this.value = value;
    }

    public Node getPreviousNode() {
        return previousNode;
    }

    public void setPreviousNode(Node previousNode) {
        this.previousNode = previousNode;
    }

    public Integer getValue() {
        return value;
    }

    public Node getNextNode() {
        return nextNode;
    }

    public void setNextNode(Node nextNode){
        this.nextNode = nextNode;
    }

    public boolean hasNext(){
        return this.nextNode != null;
    }

    @Override
    public String toString() {
        return "Node{" +
                "previousNode=" + (previousNode != null ? previousNode.getClass() : null)  +
                ", nextNode=" + (nextNode != null ? nextNode.getClass() : null) +
                ", value=" + value +
                '}';
    }
}
