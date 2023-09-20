package PepcodingLevel1.GenericTree;
import java.util.*;
import java.io.*;

class Tree {
    private static class Node{
        int data;
        ArrayList<Node> children = new ArrayList<>();

        Node(){

        }
        Node(int data){
            this.data = data ;
        }
    }

    public static void display (Node node){
        String str = node.data + "-->";
        for (Node child : node.children){
            str += child.data + " , ";
        }
        str += ".";
        System.out.println(str);

        for (Node child : node.children){
            display(child);
        }
    }

    public static Node construct (int []arr){
        Node root = null;
        //int arr[] = {10,20,50,-1,60,-1,-1,30,70,-1,80,110,-1,100,-1,-1,90,-1,-1,40,100,-1,-1,-1};
        Stack<Node> st = new Stack<>();

        for (int i=0 ; i<arr.length ; i++){
            if (arr[i] == -1){
                st.pop();
            }else{
                Node t = new Node();
                t.data = arr[i];
                if (st.size() > 0){
                    st.peek().children.add(t);
                }else{
                    root = t;
                }
                st.push(t);
            }
        }
        return root;
    }

    public static int size (Node node){
        int s = 0;

        for (Node child : node.children){
            int cs = size(child);
            s = s + cs;
        }
        s = s+1;
        return s;

    }

    public static int max (Node node){
        int max = Integer.MIN_VALUE;
        for (Node child : node.children){
            int cm = max (child);
            max = Math.max (max , cm);
        }
        max = Math.max (max , node.data);
        return max;
    }

    public static int height (Node node){
        int ht = -1 ;                               // consider no. of edges as height --> ht = -1
        for (Node child : node.children){
            int ch = height(child);
            ht = Math.max (ht , ch);
        }
        ht += 1;
        return ht;
    }

    public static void traversal (Node node){
        System.out.println("Node Pre "+node.data);
        for (Node child : node.children){
            System.out.println("Edge Pre " + node.data + "--" + child.data);
            traversal (child);
            System.out.println("Edge Post " + node.data + "--" + child.data);
        }
        System.out.println("Node Post "+node.data);
    }

    public static void levelOrder (Node node){
        Queue<Node> q = new ArrayDeque<>();
        q.add(node);

        while (q.size() > 0){
            node = q.remove();
            System.out.print(node.data + " ");

            for (Node child : node.children){
                q.add(child);
            }
        }
        System.out.println(".");
    }

    public static void levelOrderLineWise (Node node){
        Queue<Node> mq = new ArrayDeque<>();
        mq.add(node);

        Queue<Node> cq = new ArrayDeque<>();
        while (mq.size() > 0)
        {
           node = mq.remove();
           System.out.print(node.data + " ");
           for (Node child : node.children){
                cq.add(child);
            }
           if (mq.size() == 0){
               mq = cq;
               cq = new ArrayDeque<>();
               System.out.println();
           }

        }
    }


    public static void levelOrderLineWise2(Node node){
        Queue<Node> mq = new ArrayDeque<>();
        mq.add(node);
        mq.add(new Node( -1));

        while (mq.size() > 0){
            node = mq.remove ();
            if (node.data != -1){
                System.out.print(node.data + " ");
                for (Node child : node.children) {
                    mq.add(child);
                }
            }else {
                if (mq.size() > 0) {
                    System.out.println();
                    mq.add(new Node(-1));
                }
            }
        }
    }

    public static void levelOrderLineWise3 (Node node){
        Queue<Node> mq = new ArrayDeque<>();
        mq.add(node);

        while (mq.size() > 0){
            int cciq = mq.size();

            for (int i = 0 ; i<cciq ; i++){
                node = mq.remove();
                System.out.print(node.data + " ");
                for (Node child : node.children){
                    mq.add (child);
                }
            }
            System.out.println();
        }
    }

    private static class Pair {
        Node node;
        int level;

        Pair (Node node , int level){
            this.node = node;
            this.level = level;
        }
    }
    public static void levelOrderLineWise4 (Node node){
        Queue<Pair> mq = new ArrayDeque<>();
        mq.add(new Pair (node , 1));

        while (mq.size() > 0){
             Pair pair = mq.remove();
             int level = 1;
             if (pair.level > level){
                 level = pair.level;
                 System.out.println();
             }

            System.out.print(pair.node.data + " ");
             for (Node child : pair.node.children){
                 Pair pc = new Pair (child , level+1);
                 mq.add (pc);
             }

        }
    }

    public static void levelOrderLineWiseZZ (Node node){
        Stack<Node> ms = new Stack<>();
        ms.push(node);

        Stack<Node> cs = new Stack<>();
        int level = 1;

        while (ms.size()>0){
            node = ms.pop();
            System.out.print(node.data +" ");

            if (level % 2 == 1){
                for (int i = 0 ; i < node.children.size() ; i++ ){
                    cs.push(node.children.get(i));
                }
            }else{
                for (int i = node.children.size()-1 ; i>=0 ; i--){
                    cs.push(node.children.get(i));
                }
            }
            if (ms.size() == 0){
                ms = cs;
                cs = new Stack<>();
                level++;
                System.out.println();
            }
        }
    }

    public static void Mirror (Node node){
        for (Node child : node.children){
            Mirror (child);
        }
        Collections.reverse (node.children);
    }

    public static void removeLeaves (Node node){
        for (int i = node.children.size()-1 ; i>=0 ; i--){
            Node child = node.children.get(i) ;
            if (child.children.size() == 0){
                node.children.remove(child);
            }
        }
        for (Node child : node.children){
            removeLeaves (child);
        }

    }

    public static void linearize (Node node){
        for (Node child : node.children){
            linearize (child);
        }

        while (node.children.size() > 1){
            Node lc = node.children.remove(node.children.size()-1);
            Node slc = node.children.get(node.children.size()-1);
            Node slt = getTail(slc);
            slt.children.add (lc);
        }
    }

    private static Node getTail (Node node){
        while (node.children.size() == 1){
            node = node.children.get(0);
        }
        return node;
    }

    public static Node linearize2 (Node node){
        if(node.children.size() == 0){
            return node;
        }

        Node lct = linearize2 (node.children.get(node.children.size()-1));
        while (node.children.size() > 1){
            Node lc = node.children.remove (node.children.size()-1);
            Node sl = node.children.get(node.children.size()-1);
            Node sct = linearize2 (sl);
            sct.children.add (lct);
        }
        return lct;
    }

    public static boolean find (Node node , int data){
        if (node.data == data){
            return true;
        }
        for(Node child : node.children){
            boolean fic = find (child , data);
            if (fic){
                return true;
            }
        }
        return false;
    }

    public static ArrayList<Integer> nodeToRootPath (Node node , int data){
        if (node.data == data){
            ArrayList<Integer>  list = new ArrayList<>();
            list.add(node.data);
            return list;
        }

        for (Node child : node.children){
            ArrayList<Integer>  list = new ArrayList<>();
            list = nodeToRootPath (child , data);
            if (list.size() > 0){
                list.add (node.data);
                return list;
            }
        }
        return new ArrayList<>();
    }

    public static int lca (Node node ,int d1 , int d2){
        ArrayList<Integer> p1 = new ArrayList<>();
        ArrayList<Integer> p2 = new ArrayList<>();
        p1 = nodeToRootPath (node , d1);
        p2 = nodeToRootPath (node , d2);

        int i = p1.size()-1;
        int j = p2.size()-1;

        while (i>=0 && j>=0 && p1.get(i) == p2.get(j)){
            i-- ; j--;
        }
        i++; j++;
        return p1.get(i);

    }

    public static int distanceBetweenNodes (Node node , int d1 , int d2){
        ArrayList<Integer> p1 = new ArrayList<>();
        ArrayList<Integer> p2 = new ArrayList<>();

        p1 = nodeToRootPath (node , d1);
        p2 = nodeToRootPath (node, d2);

        int i = p1.size()-1;
        int j = p2.size()-1;
        while (i>=0 && j>=0 && p1.get(i) == p2.get(j)){
            i--;j--;
        }
        i++;j++;
        return i+j ;
    }

    public static boolean areSimilar (Node node1 , Node node2){
        if (node1.children.size() != node2.children.size()){
            return false;
        }

        for (int i = 0 ; i < node1.children.size() ; i++){
            Node c1 = node1.children.get(i);
            Node c2 = node2.children.get(i);
            if (areSimilar(c1 , c2) == false){
                return false;
            }
        }
        return true;
    }

    public static boolean areMirror (Node node1 , Node node2){
        if (node1.children.size() != node2.children.size()){
            return false;
        }
        for (int i = 0 ; i < node1.children.size() ; i++){
            int j = node1.children.size()-1-i;

            Node c1 = node1.children.get(i);
            Node c2 = node2.children.get(j);

            if (areMirror(c1 , c2) == false){
                return false;
            }
        }
        return true;
    }

    public static boolean isSymetric (Node node){
        return areMirror (node,node);
    }

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner (System.in);
        int n = scn.nextInt();
        int []arr = new int[n];
        for (int i = 0 ; i <arr.length ; i++ ){
            arr[i] = scn.nextInt();
        }
        int m = scn.nextInt();
        int []arr1 = new int [m];
        for (int i = 0 ; i <arr1.length ; i++ ){
            arr1[i] = scn.nextInt();
        }
        Node root = construct (arr);
        Node boot = construct (arr1);
        display (root);
        System.out.println("'''''''''''''''''''''''''''''''''''''''''");
        display(boot);
//        System.out.println(size(root));
//        System.out.println(max(root));
//        System.out.println(height(root));
//        traversal(root);
//          levelOrder(root);
//          levelOrderLineWise(root);
//          levelOrderLineWiseZZ(root);
        //levelOrderLineWise2(root);
       // Mirror(root);
        //System.out.println("''''''''''''''''''''''''''''''''''''''");
        //removeLeaves (root);
        //linearize(root);
        //display(root);
        System.out.println("'''''''''''''''''''''''''''''''''''''''''");
//        Node tail = linearize2 (root);
//        System.out.println(tail.data) ;
//        display(root);
        //System.out.println(nodeToRootPath (root , 70));
       // System.out.println(lca (root, 70,80));
      //  System.out.println(distanceBetweenNodes(root , 70,120));
        System.out.println(areSimilar(root , root));
    }
}


//24
//        10 20 50 -1 60 -1 -1 30 70 -1 80 110 -1 120 -1 -1 90 -1 -1 40 100 -1 -1 -1
//10 20 -1 30 50 -1 60 -1 -1 40 -1 -1