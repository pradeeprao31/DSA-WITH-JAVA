package pradeep;
import java.util.*;

public class Binary_tree {
    static class Node {
        int data;
        Node left;
        Node right;
        
        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    static class binarytree {
        static int idx = -1;
        
        public static Node buildTree(int nodes[]) {
            idx++;
            if (idx >= nodes.length || nodes[idx] == -1) {
                return null;
            }

            Node newNode = new Node(nodes[idx]);
            newNode.left = buildTree(nodes);
            newNode.right = buildTree(nodes);

            return newNode;
        }
   

    public static void preorder(Node root) {
    	if(root==null) {
    		return ;	
    		
    	}
    	System.out.print(root.data+" ");
    	preorder(root.left);
    	preorder(root.right);
    }
    
    
    public static void inorder(Node root) {
    	if(root == null) {
    		return;
    	}
    	inorder(root.left);
		System.out.print(root.data+" ");
		inorder(root.right);
    }
    public static void postorder(Node root) {
    	if(root == null) {
    		return; 
    	}
    	postorder(root.left);
    	postorder(root.right);
    	System.out.print(root.data+" ");
    }
    
    // level order traversal
    public static void levelorder(Node root) {
    	if(root == null ) {
    		return; 
    	}
    	
    	Queue<Node> q = new LinkedList<>();
    	q.add(root);
    	q.add(null);
    	
    	while(!q.isEmpty()) {
    		Node currNode= q.remove();
    		if(currNode==null) {
    			//System.out.println();
    			if(q.isEmpty()) {
    				break;
    			}else {
    				q.add(null);
    			}
    		}	
    			else {
    				System.out.println(currNode.data+" ");
    				if(currNode.left !=null) {
    					q.add(currNode.left);
    					
    				}
    				
    				if(currNode.right!=null) {
    					q.add(currNode.right);
    				}
    			}
    		}
    	
    	
    }
    
    
    }
    public static void main(String[] args) {
        int nodes[] = {1, 2, 4, -1, 5, -1, 7, 9,3,11};
        binarytree tree = new binarytree();
        Node root = tree.buildTree(nodes);
        //System.out.print(root.data);
        
        
       // tree.preorder(root);
        
        
       // tree.inorder(root);
        
       //tree.postorder(root);
        
        tree.levelorder(root);
        
        
    }
}
