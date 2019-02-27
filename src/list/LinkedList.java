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
public class LinkedList {

    private Node First;
    private Node Last;

    //Construtor
    public LinkedList() {
    }

    public LinkedList(Node Nod) {

        First = Nod;

        Last = Nod;

    }

    //Methods
    public void Add(Node newNode) {
        // If list is empty, set the first Node
        if ((First == null) && (Last == null)) {

            this.First = newNode;
            this.Last = newNode;
        } //There is an element in List
        else {
            this.Last.setNextNode(newNode);
            this.Last = newNode;
        }
    }

    public void Print() {
        Node Temp = First;

        while (Temp != null) {
            System.out.print(Temp.getData() + "->");
            Temp = Temp.getNextNode();
        }

        System.out.println("Null");

    }
}
