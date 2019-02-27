package poo;

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
        Node N1 = new Node("vinicius");
        Node N2 = new Node("vini");
        Node N3 = new Node("vini2");

        //linkedlist
        LinkedList List = new LinkedList();

        List.Add(N1);
        List.Add(N2);
        List.Add(N3);

        //printing list information
        List.Print();

    }

}
