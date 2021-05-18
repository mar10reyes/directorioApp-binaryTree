/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package directorioapp;

import java.util.ArrayList;
import java.util.Stack;

/**
 *
 * @author Mario Reyes - 0221710055
 */
public class BinaryTree {
    
    private Node root;
    
    //---------------------------------
    
    public BinaryTree()
    {

    }
    
    public BinaryTree(Node root)
    {
        this.root = root;
    }
    
    //---------------------------------

    public Node getRoot() {
        return root;
    }

    public void setRoot(Node root) {
        this.root = root;
    }

    //---------------------------------
    
    public boolean isEmpty()
    {
        return root == null;
    }
    
    public void insert(Node currentNode, Node newNode)
    {
        if(currentNode == null)
        {
            currentNode = root;
        }
        
        if(isEmpty())
        {
            root = newNode;
        }
        else
        {            
            if(newNode.getData().getName().compareToIgnoreCase(currentNode.getData().getName()) < 0)
            {
                if(currentNode.getLeft() == null)
                {
                    currentNode.setLeft(newNode);
                }
                else
                {
                    insert(currentNode.getLeft(), newNode);
                }
            }
            else if(newNode.getData().getName().compareToIgnoreCase(currentNode.getData().getName()) > 0)
            {
                if(currentNode.getRight() == null)
                {
                    currentNode.setRight(newNode);
                }
                else
                {
                    insert(currentNode.getRight(), newNode);
                }
            }
        }
    }
    
    public Node find(Node currentNode, String value)
    {
        if(isEmpty())
        {
            return null;
        }
        else
        {
            if(currentNode.getData().getName().compareToIgnoreCase(value) == 0)
            {
                return currentNode;
            }
            
            if(value.compareToIgnoreCase(currentNode.getData().getName()) < 0)
            {
                return find(currentNode.getLeft(), value);
            }
            else if(value.compareToIgnoreCase(currentNode.getData().getName()) > 0)
            {
                return find(currentNode.getRight(), value);
            }
        }
        
        return null;
    }
    
    
    
    public void remove(Node currentNode, Node auxNode, String value)
    {
        if(isEmpty())
        {
            return;
        }
        else
        {
            if(currentNode == null)
            {
                currentNode = root;
                auxNode = currentNode;
            }
            
            if(value.compareToIgnoreCase(currentNode.getData().getName()) < 0)
            {
                if(currentNode.getLeft() != null)
                {
                    if(currentNode == auxNode)
                    {
                        remove(currentNode.getLeft(), auxNode, value);
                    }
                    else
                    {
                        remove(currentNode.getLeft(), currentNode, value);
                    }
                }
            }
            else if(value.compareToIgnoreCase(currentNode.getData().getName()) > 0)
            {
                if(currentNode.getRight() != null)
                {
                    if(currentNode == auxNode)
                    {
                        remove(currentNode.getRight(), auxNode, value);
                    }
                    else
                    {
                        remove(currentNode.getRight(), currentNode, value);
                    }
                }
            }
            
            if(currentNode.getData().getName().compareToIgnoreCase(value) == 0)
            {
                
                if(currentNode.getLeft() != null && currentNode.getRight() == null)
                {
                    Node newRoot = maxValueNode(currentNode.getLeft());
                    
                    if(currentNode == auxNode.getLeft())
                    {
                        auxNode.setLeft(newRoot);
                        
                        if(currentNode.getLeft() == newRoot)
                        {
                            newRoot.setLeft(null);
                        }
                        else
                        {
                            newRoot.setLeft(currentNode.getLeft());
                        }
                        
                        if(currentNode.getRight() == newRoot)
                        {
                            newRoot.setRight(null);
                        }
                        else
                        {
                            newRoot.setRight(currentNode.getRight());
                        }
                    }
                    
                    if(currentNode == auxNode.getRight())
                    {
                        auxNode.setRight(newRoot);
                        
                        if(currentNode.getLeft() == newRoot)
                        {
                            newRoot.setLeft(null);
                        }
                        else
                        {
                            newRoot.setLeft(currentNode.getLeft());
                        }
                        
                        if(currentNode.getRight() == newRoot)
                        {
                            newRoot.setRight(null);
                        }
                        else
                        {
                            newRoot.setRight(currentNode.getRight());
                        }

                    }
                }
                
                if(currentNode.getLeft() == null && currentNode.getRight() != null)
                {
                    Node newRoot = minValueNode(currentNode.getRight());
                    
                    if(currentNode == auxNode.getLeft())
                    {
                        auxNode.setLeft(newRoot);
                        
                        if(currentNode.getLeft() == newRoot)
                        {
                            newRoot.setLeft(null);
                        }
                        else
                        {
                            newRoot.setLeft(currentNode.getLeft());
                        }
                        
                        if(currentNode.getRight() == newRoot)
                        {
                            newRoot.setRight(null);
                        }
                        else
                        {
                            newRoot.setRight(currentNode.getRight());
                        }
                    }
                    
                    if(currentNode == auxNode.getRight())
                    {
                        auxNode.setRight(newRoot);
                        
                        if(currentNode.getLeft() == newRoot)
                        {
                            newRoot.setLeft(null);
                        }
                        else
                        {
                            newRoot.setLeft(currentNode.getLeft());
                        }
                        
                        if(currentNode.getRight() == newRoot)
                        {
                            newRoot.setRight(null);
                        }
                        else
                        {
                            newRoot.setRight(currentNode.getRight());
                        }

                    }
                }
                
                if(currentNode.getLeft() != null && currentNode.getRight() != null)
                {
                    Node newRoot = maxValueNode(currentNode.getLeft());
                    
                    if(currentNode == auxNode.getLeft())
                    {
                        auxNode.setLeft(newRoot);
                        
                        if(currentNode.getLeft() == newRoot)
                        {
                            newRoot.setLeft(null);
                        }
                        else
                        {
                            newRoot.setLeft(currentNode.getLeft());
                        }
                        
                        if(currentNode.getRight() == newRoot)
                        {
                            newRoot.setRight(null);
                        }
                        else
                        {
                            newRoot.setRight(currentNode.getRight());
                        }
                    }
                    
                    if(currentNode == auxNode.getRight())
                    {
                        auxNode.setRight(newRoot);
                        
                        if(currentNode.getLeft() == newRoot)
                        {
                            newRoot.setLeft(null);
                        }
                        else
                        {
                            newRoot.setLeft(currentNode.getLeft());
                        }
                        
                        if(currentNode.getRight() == newRoot)
                        {
                            newRoot.setRight(null);
                        }
                        else
                        {
                            newRoot.setRight(currentNode.getRight());
                        }

                    }
                }
                
                if(currentNode.getLeft() == null && currentNode.getRight() == null)
                {
                    //only if the node that we are trying to remove is the root
                    if(auxNode == currentNode)
                    {
                        root = null;
                    }
                    
                    if(auxNode.getLeft() == currentNode)
                    {
                        auxNode.setLeft(null);
                    }
                    
                    if(auxNode.getRight() == currentNode)
                    {
                        auxNode.setRight(null);
                    }
                }
            }
        }
    }
    
    public Node minValueNode(Node node) 
    {
        if (node.getLeft() == null)
        {
            return node;
        }
        else
        {
            return minValueNode(node.getLeft());
        }
    }
    
    public Node maxValueNode(Node node) 
    {
        if (node.getRight() == null)
        {
            return node;
        }
        else
        {
            return maxValueNode(node.getRight());
        }
    }
    
    public int numberOfNodes(Node root)
    {
        int count = 1;
        
        if(root.getLeft() != null)
        {
            count += numberOfNodes(root.getLeft());
        }
        
        if(root.getRight() != null)
        {
            count += numberOfNodes(root.getRight());
        }
        
        return count;
    }
    
    public int maxDepth(Node node)  
    { 
        if (node == null) 
            return 0; 
        else 
        { 
            /* compute the depth of each subtree */
            int lDepth = maxDepth(node.getLeft()); 
            int rDepth = maxDepth(node.getRight()); 
   
            /* use the larger one */
            if (lDepth > rDepth) 
                return (lDepth + 1); 
             else 
                return (rDepth + 1); 
        } 
    } 
    
    public String[] inorderTraversal() 
    {
    
        ArrayList<String> result = new ArrayList<>();   
        Stack<Node> stack = new Stack<>();

        Node p = this.root;
        
        while(p != null)
        {
            stack.push(p);
            p = p.getLeft();
        }
        
        while(!stack.isEmpty())
        {            
            Node t = stack.pop();
            result.add(t.getData().getName());

            t = t.getRight();
            
            while(t != null)
            {
                stack.push(t);
                t = t.getLeft();
            }
        }
        
        String[] inOrderArray = new String[result.size()];
        
        for(int i=0; i<result.size(); i++)
        {
            inOrderArray[i] = result.get(i);
        }

        return inOrderArray;
    }
    
    public int getLeafCount()  
    { 
        return getLeafCount(root); 
    } 
   
    public int getLeafCount(Node node)  
    { 
        if (node == null) 
            return 0; 
        if (node.getLeft() == null && node.getRight() == null) 
            return 1; 
        else
            return getLeafCount(node.getLeft()) + getLeafCount(node.getRight()); 
    } 
}
