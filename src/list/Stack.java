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
public class Stack {

    protected Node First;
    protected Node Last;

    //Constructor
    public Stack() {
        setEmpty();
    }

    public Stack(String Date) {
        Node New = new Node(Date);
        First = New;
        Last = New;
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

    public void Push(Node newNode) {
        //If list is empty, set First Node
        if (isEmpty()) {
            First = newNode;
            Last = newNode;
        } else {
            Last.setNextNode(newNode);
            newNode.setPriorNode(Last);
            Last = newNode;
        }

    }

    public Node Pop() {
        Node Temp = Last;
        //There is not elements in stack
        if (isEmpty()) {
            System.out.println("Error, StackUndeFlow!");
            return null;
        } //there is only one element in Stack
        else if (Temp.getPriorNode() == null) {
            setEmpty();
            return Temp;
        } //there is two more elements
        else {
            //setting the Last to Prior
            Last = Temp.getPriorNode();
            Last.setNextNode(null);

        }
        //Reseting the last and prior elements
        Temp.setPriorNode(null);
        return Temp;
    }

    public void Top() {
        Node Temp = Last;
        System.out.println("Last element added: " + Temp.getDate());
    }

    public void Size() {
        Node Temp = First;
        int i = 0;
        while (Temp != null) {
            i++;
            Temp = Temp.getNextNode();

        }
        System.out.println("The amount of elements in the Stack: " + i);
    }

    public void Print() {
        Node Temp = First;
        while (Temp != null) {
            System.out.print(Temp.getDate() + "->");
            Temp = Temp.getNextNode();
        }
        System.out.println("null");

    }
}
