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
public class Queue {

    protected Node First;
    protected Node Last;

    //Constructors
    public Queue() {
        setEmpty();

    }

    public Queue(String Data) {
        //The First Node 
        Node New = new Node(Data);
        First = New;
        Last = New;
    }

    private void setEmpty() {
        First = null;
        Last = null;
    }

    public boolean isEmpty() {
        if ((First == null) && (Last == null)) {
            return true;
        }
        return false;
    }

    public void Enqueue(String Data) {
        //Creating a new Node     
        Node newNode = new Node(Data);

        //If Stack is Empty, set the First Node
        if (isEmpty()) {
            First = newNode;
            Last = newNode;
        } //There is an element in Stack
        else {
            Last.setNextNode(newNode);
            //Assing the doubly linked in Stack
            newNode.setPriorNode(Last);
            Last = newNode;
        }

    }

    public String Dequeue() {
        Node Temp = First;

        //There is no elements in Stack
        if (isEmpty()) {
            System.out.println("Error! QueueUnderFlow!");
            return null;
            //There is only one element in Stack
        } else if (Temp.getNextNode() == null) {
            setEmpty();
            String Data = Temp.getDate();
            //Removing Node
            Temp = null;
            return Data;
            //There is two or more elements
        } else {
            //Setting The Last to Prior of Removed Element
            First = Temp.getNextNode();
            //Reseting the object references of Removed Element
            First.setPriorNode(null);
            Temp.setPriorNode(null);
            String Data = Temp.getDate();
            //Removing Node
            Temp = null;
            return Data;

        }

    }

    public void Print() {
        Node Temp = First;

        while (Temp != null) {
            System.out.println(Temp.getDate() + " -");
            Temp = Temp.getNextNode();
        }

    }

    public int Size() {
        Node Temp = First;
        int Size = 0;

        while (Temp != null) {
            Size++;
            Temp = Temp.getNextNode();
        }
        return Size;
    }

    public void Front() {
        Node Temp = First;

        System.out.println("Front: " + Temp.getDate());

    }
}
