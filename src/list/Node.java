/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package list;

import java.util.Date;

/**
 *
 * @author dev
 */
public class Node {

    //Class Attributes
    private String Date;
    private Node NextNode;
    private Node PriorNode;
// Constructors

    public Node() {
        Date = "";
        NextNode = null;
        PriorNode = null;

    }
//Setteres

    public Node(String Date) {
        this.Date = Date;
        this.NextNode = null;
        PriorNode = null;
    }

    public void setDate(String Date) {
        // Operador This is for class Attributs or Methos
        this.Date = Date;
        NextNode = null;
    }

    public void setNextNode(Node NextNode) {
        this.NextNode = NextNode;
    }

    public String getDate() {
        return Date;
    }

    public Node getNextNode() {
        return NextNode;
    }

    public Node getPriorNode() {
        return PriorNode;
    }

    public void setPriorNode(Node PriorNode) {
        this.PriorNode = PriorNode;
    }

}
