package PepcodingLevel1.BinaryTree;
import java.util.*;
import java.io.*;
import java.util.function.BinaryOperator;

class BinaryTrees{
    public static class Node{
        int data;
        Node left;
        Node right;
        public Node(int data , Node left , Node right){
            this.data = data;
            this.left = left;
            this.right = right;
        }
    }
    public static class Pair{
        Node node;
        int state;

        public Pair (Node node, int state){
            this.node = node;
            this.state = state;
        }
    }

    public static Node construct (Integer []arr){
        Node root = new Node (arr[0] , null , null);
        Pair rootp = new Pair (root , 1);

        Stack<Pair> st = new Stack<>();
        st.push(rootp);

        int idx= 0;
        while (st.size()>0){
            Pair top = st.peek();
            if (top.state == 1){
                idx++;
                if (arr[idx] != null){
                    Node ln = new Node(arr[idx] , null , null);
                    top.node.left = ln;
                    Pair lp = new Pair (ln , 1);
                    st.push(lp);
                }else{
                    top.node.left = null;
                }
                top.state++;
            }else if (top.state == 2){
                idx++;
                if (arr[idx] != null){
                    Node rn = new Node(arr[idx] , null , null);
                    top.node.right = rn;
                    Pair rp = new Pair (rn , 1);
                    st.push(rp);
                }else{
                    top.node.right  = null;
                }
                top.state++;
            }else if (top.state == 3){
                st.pop();
            }
        }
        return root;
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

    public static int size(Node node){
        if (node == null){
            return 0;
        }

        int ls = size(node.left);
        int rs = size (node.right);
        int ts = ls + rs + 1;
        return ts;
    }

    public static int sum(Node node){
        if (node == null){
            return 0;
        }

        int ls = sum (node.left);
        int rs = sum (node.right);
        int ts = ls + rs + node.data;
        return ts;
    }

    public static int max (Node node){
        if (node == null){
            return Integer.MIN_VALUE;
        }

        int lmax = max (node.left);
        int rmax = max (node.right);
        int tmax = Math.max (node.data , Math.max (lmax , rmax)) ;
        return tmax;
    }
    public static int height (Node node){
        if (node == null){
            return -1; // -1 for edges and 0 for nodes
        }
        int lheight = height (node.left);
        int rheight = height (node.right);
        int theight = Math.max (lheight , rheight) + 1;
        return theight ;
    }

    public static void preOrder (Node node){
        if (node == null){
            return ;
        }
        System.out.print(node.data +" ");
        preOrder(node.left);
        preOrder(node.right);
    }

    public static void inOrder (Node node){
        if (node == null){
            return ;
        }
        inOrder(node.left);
        System.out.print(node.data + " ");
        inOrder(node.right);
    }

    public static void postOrder (Node node){
        if (node == null){
            return ;
        }
        postOrder(node.left);
        postOrder(node.right);
        System.out.print(node.data + " ");
    }

    public static void levelOrder (Node node){
        Queue<Node> mq = new ArrayDeque<>();
        mq.add(node);

        while (mq.size() > 0){
            int count = mq.size();
            for (int i = 0 ; i < count ; i++){
                node = mq.remove();
                System.out.print(node.data + " ");

                if (node.left != null){
                    mq.add(node.left);
                }
                if (node.right != null){
                    mq.add (node.right);
                }
            }
            System.out.println();
        }
    }

    public static void iterativePrePostOrder (Node node){
        Stack<Pair> st = new Stack<>();
        Pair rootp = new Pair (node , 1);
        st.push(rootp);

        String pre = "";
        String post = "";
        String in = "";
        while (st.size() > 0){
            Pair top = st.peek();
            if (top.state == 1){             // pre -- s++ -- left
                pre += top.node.data +" ";
                top.state++;

                if (top.node.left != null){
                    Pair lp = new Pair(top.node.left , 1);
                    st.push(lp);
                }
            }else if (top.state == 2){       // in -- s++ -- right
                in += top.node.data +" ";
                top.state++;

                if (top.node.right != null){
                    Pair rp = new Pair(top.node.right , 1);
                    st.push(rp);
                }
            }else{                           // post -- s++ -- pop
                post += top.node.data + " ";
                st.pop();
            }
        }
        System.out.println(pre);
        System.out.println(in);
        System.out.println(post);
    }

    static ArrayList<Integer> path;
    public static boolean find (Node node, int data){
        path = new ArrayList<>();
        if (node == null){
            return false;
        }
        if (node.data == data){
            path.add (node.data);
            return true;
        }
        boolean filc = find (node.left , data);
        if (filc){
            path.add(node.data);
            return true;
        }

        boolean firc = find (node.right , data);
        if(firc){
            path.add(node.data);
            return true;
        }
        return false;
    }

    public static void printKthLevel (Node node , int k){
        if (node == null || k<0){
            return;
        }
        if(k == 0){
            System.out.print(node.data + " ");
        }
        printKthLevel (node.left , k-1);
        printKthLevel (node.right , k-1);
    }

    public static void printKthLevel1 (Node node , int k , Node blocker){
        if (node == null || k<0 || node == blocker){
            return;
        }
        if(k == 0){
            System.out.print(node.data + " ");
        }
        printKthLevel1 (node.left , k-1 , blocker);
        printKthLevel1 (node.right , k-1 , blocker);
    }

    static ArrayList<Node> path1;
    public static boolean find1 (Node node, int data){
        path1 = new ArrayList<>();
        if (node == null){
            return false;
        }
        if (node.data == data){
            path1.add (node);
            return true;
        }
        boolean filc = find1 (node.left , data);
        if (filc){
            path1.add(node);
            return true;
        }

        boolean firc = find1 (node.right , data);
        if(firc){
            path1.add(node);
            return true;
        }
        return false;
    }

    public static void printKLevelFar (Node node , int data , int k){
        path1 = new ArrayList<>();
        find1 (node , data );

        for (int i = 0 ; i <path1.size() ; i++){
            printKthLevel1 (path1.get(i) , k-i , (i == 0 ? null : path1.get (i-1)));
        }
    }
    public static void pathToLeafFromRoot (Node node , String path , int sum , int low , int high){
        if (node == null){
            return;
        }
        if (node.left == null && node.right == null ){
            sum += node.data;
            if (sum >= low && sum <= high){
                System.out.println(path + node.data);
            }
            return;
        }

        pathToLeafFromRoot (node.left , path+node.data +" " , sum + node.data , low , high);
        pathToLeafFromRoot (node.right , path+node.data +" " , sum + node.data , low , high);
    }

    public static Node createLeftCloneTree (Node node){
        if (node == null){
            return null;
        }
        Node lcr = createLeftCloneTree (node.left);
        Node rcr = createLeftCloneTree (node.right);
        Node nn = new Node(node.data , lcr , null);
        node.left = nn;
        node.right = rcr;
        return node;
    }

    public static Node transBackFromLeftClone (Node node){
        if (node == null){
            return null;
        }

        Node lnn = transBackFromLeftClone (node.left.left);
        Node rnn = transBackFromLeftClone (node.right);
        node.left = lnn;
        node.right = rnn;
        return node;
    }

    public static Node removeLeaves (Node node){
        if (node == null){
            return null;
        }

        if (node.left == null && node.right == null){
            return null;
        }

        node.left = removeLeaves (node.left);
        node.right = removeLeaves (node.right);

        return node;
    }

    public static int diameter1 (Node node){
        if (node == null){
            return 0;
        }

        int ld = diameter1 (node.left);
        int rd = diameter1(node.right);

        int f = height(node.left) + height(node.right) + 2;

        int dia = Math.max (Math.max (ld , rd) , f);
        return dia ;
    }

    static class DiaPair{
        int dia;
        int ht;
    }

    public static DiaPair diameter2 (Node node){

        if (node == null){
            DiaPair bp = new DiaPair();
            bp.ht = -1;
            bp.dia = 0;
            return bp;
        }

        DiaPair lp = diameter2(node.left);
        DiaPair rp = diameter2(node.right);

        DiaPair mp = new DiaPair();
        mp.ht = Math.max (lp.ht , rp.ht) + 1;

        int f = lp.ht + rp.ht + 2;
        mp.dia = Math.max (Math.max (lp.dia , rp.dia) , f);

        return mp;
    }

//    static int tilt = 0;

//    public static int tilt (Node node){
//        if (node == null){
//            return 0;
//        }
//
//        int lt = tilt(node.left);
//        int rt = tilt (node.right);
//
//        int ltilt = Math.abs (lt - rt);
//        tilt += ltilt;
//
//
//        int ts = lt + rt + node.data;
//        return ts;
//    }

    static int tilt = 0;
    public static int tilt(Node node) {
        if (node == null) {
            return 0;
        }

        int ls = tilt(node.left);
        int rs = tilt(node.right);
        int ts = ls + rs + node.data;

        tilt += Math.abs(ls - rs);

        return ts;
    }

    public static class BSTPair {
        boolean isBST;
        int min;
        int max;
    }

    public static BSTPair isBST (Node node){

        if (node == null){
            BSTPair bp = new BSTPair();
            bp.min = Integer.MAX_VALUE;
            bp.max = Integer.MIN_VALUE;
            bp.isBST = true;
            return bp;
        }

        BSTPair lp = isBST (node.left);
        BSTPair rp = isBST (node.right);

        BSTPair mp = new BSTPair();
        mp.isBST = lp.isBST && rp.isBST && (node.data >= lp.max && node.data <= rp.min);

        mp.min = Math.min (Math.min (lp.min , rp.min) , node.data);
        mp.max = Math.max (Math.max (lp.max ,rp.max) , node.data);

        return mp;
    }

    public static boolean isBal = true;

    public static int isBalanced (Node node){
        if (node == null){
            return 0;
        }
        int lh = isBalanced (node.left);
        int rh = isBalanced (node.right);

        int gap = Math.abs (lh-rh);

        if (gap > 1){
            isBal = false;
        }

        int th = Math.max (lh , rh) + 1;
        return th;
    }

    public static class BalPair{
        int ht;
        boolean isBal;
    }

    public static BalPair isBal (Node node){

        if (node == null){
            BalPair bp = new BalPair();
            bp.ht = 0;
            bp.isBal = true;
            return bp;
        }

        BalPair lp = isBal (node.left);
        BalPair rp = isBal (node.right);

        BalPair mp = new BalPair();
        mp.isBal = Math.abs (lp.ht - rp.ht) <= 1 && lp.isBal && rp.isBal ;
        mp.ht = Math.max (lp.ht , rp.ht) + 1;
        return mp;
    }

    public static class BstPair1 {
        boolean isBST;
        int min ;
        int max;
        Node root;
        int size;
    }

    public static BstPair1 isBst (Node node){
        if (node == null){
            BstPair1 bp = new BstPair1();
            bp.isBST = true;
            bp.min = Integer.MAX_VALUE;
            bp.max = Integer.MIN_VALUE;
            bp.root = null;
            bp.size = 0;
            return bp;
        }

        BstPair1 lp = isBst (node.left);
        BstPair1 rp = isBst (node.right);

        BstPair1 mp = new BstPair1();
        mp.isBST = lp.isBST && rp.isBST && (node.data >= lp.max && node.data <= rp.min);
        mp.min = Math.min (node.data, Math.min (lp.min , rp.min));
        mp.max = Math.max (node.data , Math.max (lp.max , rp.max));

        if (mp.isBST){
            mp.root = node;
            mp.size = lp.size + rp.size + 1;
        }else if (lp.size > rp.size){
            mp.root = lp.root;
            mp.size = lp.size;
        }else{
            mp.root = rp.root;
            mp.size = rp.size;
        }
        return mp;
    }



    public static void main(String[] args)  throws Exception {

        Scanner scn = new Scanner (System.in);
        int n = Integer.parseInt(scn.next());
        //Integer []arr = {50, 25, 12, null, null, 37, 30, null, null, null, 75, 62, null, 70, null, null, 87, null, null};
        Integer []arr = new Integer[n];
        for (int i = 0 ; i < arr.length ; i++){
            Integer val = Integer.parseInt(scn.next());
            if (val == -1){
                arr[i] = null;
            }else{
                arr[i] = val;
            }
        }

//        int low = Integer.parseInt(scn.next());
//        int high = Integer.parseInt(scn.next());
        Node root = construct (arr);
        display (root);
        System.out.println();
        System.out.println("``````````````````````````");

//        int size = size(root);
//        int sum = sum(root);
//        int max = max(root);
//        int height = height (root);
//
//        System.out.println(size);
//        System.out.println(sum);
//        System.out.println(max);
//        System.out.println(height);

//        preOrder(root);
//        System.out.println();
//        inOrder (root);
//        System.out.println();
//        postOrder(root);
//        System.out.println();
//
//        levelOrder(root);
//        iterativePrePostOrder(root);
//        System.out.println(find(root , 100));
//        System.out.println(path);

//        printKthLevel (root , 3);
        //printKLevelFar (root , 37 , 2);
//        pathToLeafFromRoot (root , "" , 0 , low , high);

//       createLeftCloneTree(root);
//        display(root);
//        System.out.println("``````````````````````````");
//        System.out.println("``````````````````````````");
//
//        transBackFromLeftClone(root);
//        display(root);
//        removeLeaves (root);
//        display(root);

//        int diameter = 0;
//        diameter = diameter1(root);
//        System.out.println(diameter);
//
//        DiaPair p = diameter2 (root);
//        System.out.println(p.dia);

//        tilt(root);
//        System.out.println(tilt);
//        BSTPair t = isBST(root);
//        System.out.println(t.isBST);

//        isBalanced(root);
//        System.out.println(isBal);
//         BalPair p = isBal (root);
//        System.out.println(p.isBal);

        BstPair1 p = isBst (root);
        System.out.println(p.root.data +" and "+ p.size);

    }
}

//50 25 12 -1 -1 37 30 -1 -1 -1 75 62 -1 70 -1 -1 87 -1 -1
//19
//23
// 50 25 12 -1 -1 37 30 -1 -1 40 -1 -1 75 62 60 -1 -1 70 -1 -1 87 -1 -1