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
public class Directory {
    
    private BinaryTree tree;
    
    //---------------------------------

    public Directory(BinaryTree tree) {
        this.tree = tree;
    }
    
    public Directory() {
        tree = new BinaryTree();
    }
    
    //---------------------------------

    public BinaryTree getTree() {
        return tree;
    }

    public void setTree(BinaryTree tree) {
        this.tree = tree;
    }
    
    //---------------------------------
    
    public void add(Contact c)
    {
        tree.insert(tree.getRoot(), new Node(c));
    }
    
    public Node find(String str)
    {
        return tree.find(tree.getRoot(), str);
    }
    
    public String[] showContactInfo(String str)
    {
        Node n = find(str);
        
        String[] contactInfo = new String[4];
        
        contactInfo[0] = n.getData().getName();
        contactInfo[1] = n.getData().getPhone();
        contactInfo[2] = n.getData().getPostalCode();
        contactInfo[3] = n.getData().getEmail();
        
        return contactInfo;
    }
    
    public void remove(String str)
    {
        tree.remove(tree.getRoot(), tree.getRoot(), str);
    }
    
    public String[] stats()
    {
        String[] stats = new String[4];
        
        stats[0] = String.valueOf(tree.numberOfNodes(tree.getRoot()));
        stats[1] = tree.minValueNode(tree.getRoot()).getData().getName();
        stats[2] = tree.maxValueNode(tree.getRoot()).getData().getName();
        stats[3] = tree.getRoot().getData().getName();
        
        return stats;
        
    }
    
    public int numberOfContacts()
    {
        return tree.numberOfNodes(tree.getRoot());
    }
    
    public String[] showInOrder()
    {
        return tree.inorderTraversal();
    }
    
    public int maxDepth()
    {
        return tree.maxDepth(tree.getRoot());
    }
            
}
