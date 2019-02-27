/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package list;

/**
 *
 * @author dev
 */
public class Node {

    //Class Attributes
    private String Data;
    private Node NextNode;

    //Constructors
    public Node() {
        Data = "";
        NextNode = null;

    }

    public Node(String Data) {
        this.Data = Data;
        NextNode = null;
    }

    public String getData() {
        return Data;
    }

    public void setData(String Data) {
        this.Data = Data;
    }

    public Node getNextNode() {
        return NextNode;
    }

    public void setNextNode(Node NextNode) {
        this.NextNode = NextNode;
    }

}
