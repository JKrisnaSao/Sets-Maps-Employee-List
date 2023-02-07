/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package assignment1ant;

public class Node {

    //Node variables
    Employee key;
    int value;
    Node left;
    Node right;

    public Node(Employee e) {
        key = e;
        value = 1;
        left = null;
        right = null;
    }

}
