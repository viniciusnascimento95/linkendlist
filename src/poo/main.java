package poo;

import java.nio.file.Files;
import javafx.scene.AccessibleAttribute;
import list.*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author dev
 */
public class main {

    int nb = 0;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        /*

        Person obj1 = new Person();

        obj1.setName("vinicius");
        obj1.setHeight(1.65);
        obj1.setWeight(105.5);

        Person objRef = obj1;

        objRef.setName("luis romeu");
        objRef = null;

        System.out.println(obj1.getName());
         */
        //Learn linkedList
        //creating Nodes
        Node N1 = new Node("A");
        Node N2 = new Node("B");
        Node N3 = new Node("C");

        //linkedlist
        LinkedList List = new LinkedList();

        List.Add(N1);
        List.Add(N2);
        List.Add(N3);

        //printing list information
        List.Print();

        System.out.println("##########################\n############################");
        System.out.println("Stack mode");

        Stack stack = new Stack();

        stack.Push(N1);
        stack.Push(N2);
        stack.Push(N3);
        stack.Print();
        stack.Pop();
        stack.Print();
        stack.Top();
        stack.Size();

    }

}
