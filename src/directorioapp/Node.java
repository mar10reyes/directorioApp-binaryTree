/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package directorioapp;

/**
 *
 * @author Mario Reyes - 0221710055
 */
public class Node {
    
    private Contact data;
    private Node left;
    private Node right;
    
    //---------------------------------
    
    public Node()
    {
        
    }
    
    public Node(Contact data)
    {
        this.data = data;
    }
    
    //---------------------------------

    public Contact getData() {
        return data;
    }

    public void setData(Contact data) {
        this.data = data;
    }

    public Node getLeft() {
        return left;
    }

    public void setLeft(Node left) {
        this.left = left;
    }

    public Node getRight() {
        return right;
    }

    public void setRight(Node right) {
        this.right = right;
    }
    
}