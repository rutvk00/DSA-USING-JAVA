package PepcodingLevel1.BinarySearchTree;


import java.util.*;
import java.io.*;

class BST{
    public static class Node{
        int data;
       Node left;
        Node right;
        public Node(int data , Node left ,Node right){
            this.data = data;
            this.left = left;
            this.right = right;
        }
    }
    public static Node construct (Integer []arr , int low , int high){

        if (low > high){
            return null;
        }
        int mid = (low+high)/2;

        int data = arr[mid];

        Node lc = construct (arr , low , mid-1);
        Node rc = construct (arr ,mid+1 , high);

        Node node = new Node(data , lc , rc);
        return node;
    }
    public static void display (Node node){
        if (node == null){
            return ;
        }
        String str = "";
        str += (node.left == null) ? "." : (node.left.data) +"";
        str += " <-- " + (node.data) + " --> ";
        str += (node.right == null) ? "." : (node.right.data) +"." ;
        System.out.println(str);

        display (node.left);
        display (node.right);
    }

    public static int size (Node node){
        if (node == null){
            return 0;
        }
        int ls = size (node.left);
        int rs = size (node.right);
        int ts = ls + rs + 1 ;
        return ts;
    }

    public static int max (Node node){
        if (node.right != null){
            return max (node.right);
        }else{
            return node.data;
        }
    }

    public static int min (Node node){
        if (node.left != null){
            return min (node.left);
        }else{
            return node.data;
        }
    }

    public static boolean find (Node node , int data){
        if (node == null){
            return false;
        }

        if (data > node.data){
            return find (node.right , data);
        }else if (data < node.data){
            return find (node.left , data);
        }else{
            return true;
        }
    }

    public static Node addNode (Node node , int data){
        if (node == null){
            return new Node (data , null, null);
        }

        if (data > node.data){
            node.right =  addNode (node.right , data);
        }else if (data < node.data){
            node.left =  addNode (node.left , data);
        }else{
            // already node is there , no nneed to add
        }

        return node;
    }


    public static Node removeNode (Node node , int data){
        if (node == null ){
            return null;
        }
        if (data > node.data){
            node.right = removeNode(node.right , data);
        }else if (data < node.data){
            node.left = removeNode(node.left , data);
        }else{
           if (node.left != null && node.right != null){
                int lmax = max (node.left);
                node.data = lmax;
                node.left = removeNode(node.left , lmax);
                return node;

           }else if (node.left != null){
                return node.left;
           }else if( node.right != null){
               return node.right;
           }else{
               return null;
           }
        }
        return node;
    }
    static int sum = 0;
    public static void rwsol (Node node){
        if (node == null){
            return;
        }

        rwsol (node.right);
        int od = node.data;
        node.data = sum;
        sum += od;
        rwsol (node.left);
    }

    public static Node lca (Node node , int d1 , int d2){
        if (node == null){
            return null;
        }
        if (d1 > node.data && d2 > node.data ){
            return lca (node.right , d1, d2);
        }else if (d1 < node.data && d2 < node.data){
            return lca (node.left , d1 ,d2);
        }else{
            return node;
        }
    }

    public static void pir (Node node , int d1 , int d2){
        if (node == null){
            return ;
        }
        if (d1 < node.data && d2 < node.data){
            pir (node.left , d1 , d2);
        }else if (d1 > node.data && d2 > node.data){
            pir (node.right , d1 ,d2);
        }else{
            pir (node.left , d1 , d2);
            System.out.print(node.data + " ");
            pir (node.right , d1 ,d2);
        }
    }

    public static void travelAndPrint (Node root , Node node , int tar){
        if (node == null){
            return;
        }
        travelAndPrint(root , node.left , tar);
        int com = tar - node.data;
        if (node.data < com){
            if (find (root , com) == true){
                System.out.println(node.data + " " + com);
            }
        }

        travelAndPrint(root , node.right , tar);

    }

    public static class ITPair
    {
        Node node;
        int state = 0;

        ITPair() {};

        ITPair(Node node, int state)
        {
            this.node = node;
            this.state = state;
        }
    }

    public static void bestApproach(Node node, int tar)
    {
        Stack< ITPair> ls = new Stack< >();
        Stack< ITPair> rs = new Stack< >();

        ls.push(new ITPair(node, 0));
        rs.push(new ITPair(node, 0));

        Node left = getNextFromNormalInorder(ls);
        Node right = getNextFromReverseInorder(rs);
        while (left.data < right.data)
        {
            if (left.data + right.data < tar)
            {
                left = getNextFromNormalInorder(ls);

            }
            else if (left.data + right.data > tar)
            {
                right = getNextFromReverseInorder(rs);
            }
            else
            {
                System.out.println(left.data + " " + right.data);
                left = getNextFromNormalInorder(ls);
                right = getNextFromReverseInorder(rs);
            }
        }
    }

    public static Node getNextFromNormalInorder(Stack< ITPair> st)
    {
        while (st.size() > 0)
        {
            ITPair top = st.peek();
            if (top.state == 0)
            {
                if (top.node.left != null)
                {
                    st.push(new ITPair(top.node.left, 0));

                }
                top.state++;
            }
            else if (top.state == 1)
            {
                if (top.node.right != null)
                {
                    st.push(new ITPair(top.node.right, 0));
                }
                top.state++;
                return top.node;
            }
            else
            {
                st.pop();
            }
        }
        return null;
    }

    public static Node getNextFromReverseInorder(Stack< ITPair> st)
    {
        while (st.size() > 0)
        {
            ITPair top = st.peek();
            if (top.state == 0)
            {
                if (top.node.right != null)
                {
                    st.push(new ITPair(top.node.right, 0));

                }
                top.state++;
            }
            else if (top.state == 1)
            {
                if (top.node.left != null)
                {
                    st.push(new ITPair(top.node.left, 0));
                }
                top.state++;
                return top.node;
            }
            else
            {
                st.pop();
            }
        }
        return null;
    }

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner (System.in);
        int n = Integer.parseInt(scn.next());
        Integer []arr = new Integer[n];
        for (int i = 0 ; i < arr.length ; i++){
            Integer val = Integer.parseInt(scn.next());
            if (val == -1){
                arr[i] = null;
            }else{
                arr[i] = val;
            }
        }

        Node root = construct (arr , 0 , arr.length-1);
        display(root);
        System.out.println("''''''''''''''''''''''''''''''''''");
//
//        System.out.println("Size is :" + size (root));
//        System.out.println("Min : " + min (root));
//        System.out.println("Max : " + max (root));
//        System.out.println("Find : " + find (root , 100));
//       // System.out.println("Add Node 60 : " + addNode (root , 60).data);
//       removeNode(root , 37);
//        rwsol(root);
//        display (root);
//        System.out.println( lca (root , 2 ,37).data);
//        pir (root , 25 , 87);
//        travelAndPrint (root , root ,100);
        bestApproach(root , 100);
    }
}


// 7
//12 25 37 50 62 75 87