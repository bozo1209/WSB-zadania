package zjazd2.wyk2.zad17;

public class IntegerQueue {

    private Node firstNode;
    private Node lastNode;

    public IntegerQueue(){

    }

    public void addLast(Integer value){
        if (firstNode == null){
            firstNode = new Node(value);
            lastNode = firstNode;
        }else if (firstNode == lastNode){
            lastNode = new Node(firstNode, value);
            firstNode.setNextNode(lastNode);
        }else {
            lastNode = new Node(lastNode, value);
            lastNode.getPreviousNode().setNextNode(lastNode);
        }
    }

    public Integer getFirst(){
        Integer value = firstNode.getValue();
        firstNode = firstNode.getNextNode();
        if (!(firstNode == null)){
            firstNode.setPreviousNode(null);
        }
        return value;
    }

    public void pickFirst(){
        System.out.println("first = " + firstNode.getValue());
        System.out.println(firstNode);
    }

    public void pickLast(){
        System.out.println("last = " + lastNode.getValue());
        System.out.println(lastNode);
    }


    public void showAll(){
        if (firstNode == null) return;
        Node current = firstNode;

        System.out.println(current);
        while (current.hasNext()){
            current = current.getNextNode();
            System.out.println(current);
        }
    }
}
