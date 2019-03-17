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

    protected Node First;
    protected Node Last;

    //Constructor
    public LinkedList() {
        First = null;
        Last = null;
    }

    public LinkedList(Node Nod) {
        this.First = Nod;
        this.Last = Nod;
    }

    protected void setEmpty() {
        this.First = null;
        this.Last = null;
    } 

    public boolean isEmpty() {
        if ((First == null) && (Last == null)) {
            return true;
        }
        return false;
    }

    // Methods 
    public void Add(Node newNode) {
        //If list is empty, set First Node
        if ((First == null) && (Last == null)) {
            this.First = newNode;
            this.Last = newNode;
        } else {
            this.Last.setNextNode(newNode);
            this.Last = newNode;
        }

    }

    public void Print() {
        Node Temp = First;
        while (Temp != null) {
            System.out.print(Temp.getDate() + "->");
            Temp = Temp.getNextNode();
        }
        System.out.println("null");

    }

    public void Counter() {
        Node Temp = First;
        int i = 0;
        while (Temp != null) {
            Temp.getDate();
            Temp = Temp.getNextNode();
            i++;
        }
        System.out.println("The amount of elements in the list: " + i);
    }

   
}
