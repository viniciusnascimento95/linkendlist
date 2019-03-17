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
public class DoubleLinkedList extends LinkedList {
    //Constructor

    public DoubleLinkedList() {
        super();
    }

    public DoubleLinkedList(Node Nod) {
        super(Nod);
    }

    @Override
    public void Add(Node newNode) {

        if ((First == null) && (Last == null)) {
            First = newNode;
            Last = newNode;
        } else {
            this.Last.setNextNode(newNode);
            //Assing the doudle linked
            newNode.setPriorNode(Last);
            super.Last = newNode;
        }

    }

    public void PrintReverse() {
        Node Temp = super.Last;
        while (Temp != null) {
            System.out.print(Temp.getDate() + "->");
            Temp = Temp.getPriorNode();
        }
        System.out.println("null");

    }

    public Node RemoveLast() {
        Node Temp = super.Last;
        //There is not elements in list
        if (super.isEmpty()) {
            System.out.println("Error, List is empty!");
            return null;
        } //there is only one element in list
        else if (Temp.getPriorNode() == null) {
            super.setEmpty();
            return Temp;
        } //there is two more elements
        else {
            //setting the Last to Prior
            super.Last = Temp.getPriorNode();
            super.Last.setNextNode(null);

        }
        //Reseting the last and prior elements
        Temp.setPriorNode(null);
        return Temp;
    }
// Method that looks for the element to be excluded
    public Node Sweep(String element) {
        Node Temp = super.First;
        while ((Temp != null) && (Temp.getDate() != element)) {
            Temp = Temp.getNextNode();
        }
        if ((Temp != null) && (Temp.getDate() == element)) {
            return Temp;
        } else {
            return null;
        }
    }
// Method that deletes the element found
    public void RemoveElementByString(String element) {

        Node Temp = Sweep(element);
        if (Temp != null)// if there is the Node to be deleted
        {
            if (super.First == super.First)//if there is only one node in the list
            {
                if (Temp == super.First)//if the node is in the beginning
                {
                    super.First = Temp.getNextNode();
                    Temp.getNextNode().setPriorNode(null);
                } else if (Temp == super.Last)//if the node is at the end
                {
                    super.Last = Temp.getPriorNode();
                    Temp.getPriorNode().setNextNode(null);
                } else //if the node is in the middle
                {
                    Temp.getPriorNode().setNextNode(Temp.getNextNode());
                    Temp.getNextNode().setPriorNode(Temp.getPriorNode());
                }
                Temp.setPriorNode(null);
                Temp.setNextNode(null);
            } else {
                super.First = null;
                super.Last = null;
            }
        }
    }

}
