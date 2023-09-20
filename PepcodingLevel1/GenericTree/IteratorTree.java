//https://www.youtube.com/watch?v=t4IKNhNBTdo&list=PL-Jc9J83PIiEmjuIVDrwR9h5i9TT2CEU_&index=53

package PepcodingLevel1.GenericTree;
import java.util.*;
import java.io.*;

class IteratorTree{
    static class Node{
        int data;
        ArrayList<Node> children = new ArrayList<>();
    }

    static class GenericTree implements Iterable<Integer> {
        Node root ;
        public GenericTree(Node root){
            this.root = root;
        }
        public  Iterator<Integer> iterator (){
            Iterator<Integer> obj = new GTPreOrderIterator(root);
            return obj;
         }
    }
    static class GTPreOrderIterator implements Iterator<Integer> {
        Integer nval ;
        Stack<Pair> st ;
        public GTPreOrderIterator (Node root){
            st = new Stack<>();
            st.push(new Pair(root , -1));
            next();
        }

        public boolean hasNext (){
            if (nval == null){
                return false;
            }else{
                return true;
            }
        }
        public Integer next(){
            Integer fr = nval;

            nval = null ;
            while (st.size() > 0){
                Pair top = st.peek();
                if (top.state == -1){
                    nval = top.node.data ;
                    top.state++;
                    break;
                }else if (top.node.children.size() == top.state){
                    st.pop();
                }else{
                    Pair c =new Pair(top.node.children.get(top.state) , -1);
                    st.push (c);
                    top.state++;
                }
            }
            return fr;
        }
    }

    public static class Pair {
        Node node;
        int state;

        public Pair(Node node , int state){
            this.node = node;
            this.state = state;
        }
    }
    public static Node construct (int[] arr){
        Node root = null;
        Stack<Node> st = new Stack<>();

        for (int i = 0 ; i < arr.length ; i++){
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


    public static void display (Node node){
        String str = node.data + "--->";
        for (Node child : node.children){
            str += child.data + ",";
        }
        str += ".";
        System.out.println(str);

        for (Node child : node.children){
            display(child);
        }
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner (System.in);
        int n = scn.nextInt();
        int []arr = new int[n];
        for (int i = 0; i<arr.length ; i++){
            arr[i] = scn.nextInt();
        }

        Node root = construct (arr);
        display (root);

        GenericTree gt = new GenericTree(root);
        Iterator<Integer> gti = gt.iterator();

        for(int val : gt){
            System.out.print(val+" ");
        }
        System.out.println();
        System.out.println("''''''''''''''''''''''''''");

        while(gti.hasNext() == true){
            System.out.print(gti.next() + " ");
        }
    }
}


//        10 20 50 -1 60 -1 -1 30 70 -1 80 110 -1 120 -1 -1 90 -1 -1 40 100 -1 -1 -1
//10 20 -1 30 50 -1 60 -1 -1 40 -1 -1
// 10 20 -50 -1 60 -1 -1 30 -70 -1 80 -1 90 -1 -1 40 -100 -1 -1 -1