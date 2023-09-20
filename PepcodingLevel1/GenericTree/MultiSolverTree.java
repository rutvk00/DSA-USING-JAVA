//https://www.youtube.com/watch?v=cBQs7kqK_Dw&list=PL-Jc9J83PIiEmjuIVDrwR9h5i9TT2CEU_&index=40

package PepcodingLevel1.GenericTree;
import java.util.*;
import java.io.*;

class MultiSolverTree {

    private static class Node {
        int data;
        ArrayList<Node> children = new ArrayList<>();
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

    static int size;
    static int min;
    static int max;
    static int height;

    public static void multiSolver (Node node, int depth){
        size++;
        min = Math.min (min , node.data);
        max = Math.max (max , node.data);
        height = Math.max (depth , height);

        for (Node child : node.children){
            multiSolver (child , depth+1);
        }
    }

    static int predecessor;
    static int successor ;
    static int state ;
    public static void predecessorAndSuccessor (Node node , int data){
        if (state == 0){
            if (node.data == data){
                state = 1;
            }else{
                predecessor = node.data;
            }
        }else if (state == 1){
            successor = node.data;
            state = 2;
        }

        for (Node child : node.children){
            predecessorAndSuccessor (child , data);
        }
    }



    static int ceil ;
    static int floor ;

    public static void ceilAndFloor (Node node , int data){
        if (node.data > data){
            if (ceil > node.data){
                ceil = node.data;
            }
        }
        if (node.data < data){
            if (floor < node.data){
                floor = node.data;
            }
        }
        for (Node child : node.children){
            ceilAndFloor (child , data);
        }
    }

    public static int kthLargest (Node node , int k){
        int data = Integer.MAX_VALUE;
        floor = Integer.MIN_VALUE;

        for (int i = 0; i < k; i++) {
            ceilAndFloor(node, data);
            data = floor;
            floor = Integer.MIN_VALUE;
            //System.out.println(data);
        }

        return data;
    }

    static int ms = Integer.MIN_VALUE;
    static int msn ;
    public static int retSumAndCalculateMSST (Node node){
        int sum = 0;
        for (Node child : node.children){
            int cs = retSumAndCalculateMSST (child);
            sum += cs;
        }
        sum += node.data;

        if(sum > ms){
            ms = sum;
            msn = node.data;
        }
        return sum;
    }

    static int dia = 0;

    public static int calculateDiaRetHeigth (Node node){
        int dch = -1;
        int sdch = -1;

        for (Node child : node.children){
            int ch = calculateDiaRetHeigth (child);
            if (ch > dch){
                sdch = dch;
                dch = ch;
            }else if (ch > sdch){
                sdch = ch;
            }
        }
        int candidate = sdch + dch + 2;
        if (dia < candidate){
            dia = candidate;
        }
        dch += 1;
        return dch;
    }

     static class Pair {
         Node node;
         int state;

         Pair(Node node, int state) {
             this.node = node;
             this.state = state;
         }

     }

        public static void iterativePreAndPostOrder (Node node){
            Stack<Pair> st = new Stack<>();
            st.push (new Pair (node , -1));
            String pre = "";
            String post = "" ;
            while (st.size() > 0){
                Pair top = st.peek();
                if (top.state == -1){
                    pre += top.node.data +" ";
                    top.state++;
                }else if (top.node.children.size() == top.state){
                    post += top.node.data + " ";
                    st.pop();
                }else{
                    Pair c =new Pair (top.node.children.get(top.state) , -1);
                    st.push (c);
                    top.state++;
                }
            }

            System.out.println("Pre order :" + pre);
            System.out.println("Post order :" + post);
        }


    public static void main(String[] args) throws Exception{
        Scanner scn = new Scanner (System.in);
        int n = scn.nextInt();
        int []arr = new int[n];
        for (int i = 0; i<arr.length ; i++){
            arr[i] = scn.nextInt();
        }

        Node root = construct (arr);
        display (root);

        size = 0;
        min = Integer.MAX_VALUE;
        max = Integer.MIN_VALUE ;
        height = 0;
//        multiSolver (root , 0);
//        System.out.println("`````````````````````````````````````");
//        System.out.println(size);
//        System.out.println(min);
//        System.out.println(max);
//        System.out.println(height);
//        predecessorAndSuccessor (root , 90);
//        System.out.println(predecessor);
//        System.out.println(successor);
          ceil = Integer.MAX_VALUE;
          floor = Integer.MIN_VALUE;

//        ceilAndFloor(root , 65);
//        System.out.println(floor);
//        System.out.println(ceil);
       // System.out.println(floor);
      // System.out.println(kthLargest(root , 2));
       // System.out.println(floor);

//        int sum = retSumAndCalculateMSST(root);
//        System.out.println(ms +"  @@  "+msn +"  @@  "+sum);

//        int dch = calculateDiaRetHeigth (root);
//        System.out.println(dia +" @@ "+ dch);

        iterativePreAndPostOrder (root) ;


    }
}

//        10 20 50 -1 60 -1 -1 30 70 -1 80 110 -1 120 -1 -1 90 -1 -1 40 100 -1 -1 -1
//10 20 -1 30 50 -1 60 -1 -1 40 -1 -1
// 10 20 -50 -1 60 -1 -1 30 -70 -1 80 -1 90 -1 -1 40 -100 -1 -1 -1