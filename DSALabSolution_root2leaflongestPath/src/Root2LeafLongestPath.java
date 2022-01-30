
// Algorithm from https://www.geeksforgeeks.org/print-the-longest-path-from-root-to-leaf-in-a-binary-tree/
//https://www.geeksforgeeks.org/print-the-longest-path-from-root-to-leaf-in-a-binary-tree/

import java.io.*;
import java.util.ArrayList;

public class Root2LeafLongestPath {
	// Binary tree node
	static class Node
	{
	    Node left;
	    Node right;
	    int data;
	};
	 
	// Routine to create new node
	static Node newNode(int data)
	{
	    Node temp = new Node();
	 
	    temp.data = data;
	    temp.left = null;
	    temp.right = null;
	    
	    return temp;
	}
	 
	// Routine to find distance from root to leaf
	public static ArrayList<Integer> root2LeafLength(Node root)
	{
	     
	    // Retun a empty array list which holds final nodes in required path
	    if(root == null)
	    {
	        ArrayList<Integer> output = new ArrayList<>();
	        return output;
	    }
	    
	    // Recurse through all right nodes
	    ArrayList<Integer> right = root2LeafLength(root.right);
	     
	    // Recurse through all left nodes
	    ArrayList<Integer> left = root2LeafLength(root.left);
	     
	    // Compare sizes and insert data at right position
	    if(right.size() < left.size())
	    {
	        left.add(root.data);
	    }
	    else
	    {
	        right.add(root.data);
	    }
	     
	    // Return the appropriate ArrayList
	    return (left.size() >
	            right.size() ? left :right);
	}
	 
	// Driver Code
	public static void main(String[] args)
	{
	    Node root = newNode(100);
	    root.left = newNode(20);
	    root.right = newNode(130);
	    root.left.left = newNode(10);
	    root.left.right = newNode(50);
	    root.left.left.left = newNode(5);
	    root.right.left = newNode(110);
	    root.right.right = newNode(140);
	    
	    ArrayList<Integer> output = root2LeafLength(root);
	    int n = output.size();
	     
	    System.out.print(output.get(n - 1));
	    for(int i = n - 2; i >= 0; i--)
	    {
	        System.out.print(" -> " + output.get(i));
	    }
	}
}
