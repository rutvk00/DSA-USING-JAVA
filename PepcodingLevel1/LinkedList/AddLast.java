

package PepcodingLevel1.LinkedList;
import java.util.*;
import java.io.*;

class AddLast
{
    public static class Node
    {
        int data;
        Node next;
    }

    public static  class LL
    {
        Node head;
        Node tail;
        int size;

        public void addLast(int val)
        {
            Node temp = new Node();
            temp.data = val ;
            temp.next = null;


            if (size == 0)
            {
                head = tail = temp;
            }
            else {
                tail.next = temp;
                tail = temp;
            }
            size++;
        }

        public void display ()
        {
            Node temp = head;
            while (temp != null)
            {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
            System.out.println();
        }

        public void size()
        {
            System.out.println(this.size);
        }

        public void removeFirst ()
        {
            if (size == 0)
            {
                System.out.println("List is Empty");
            }
            else if (size == 1)
            {
                head = tail = null;
                size = 0;
            }
            else {
                head = head.next;
                size--;
            }
        }

        public int getFirst()
        {
            if (size == 0)
            {
                System.out.println("List is Empty");
                return -1;
            }
            else {
                return head.data;
            }
        }
        public int getLast()
        {
            if (size == 0)
            {
                System.out.println("List is Empty");
                return -1;
            }
            else {
                return tail.data;
            }
        }
        public int getAt(int idx)
        {
            if (size == 0)
            {
                System.out.println("List is Empty");
                return -1;
            }
            else if (idx < 0 || idx >= size ) {
                System.out.println("Invalid Index");
                return -1;
            }
            else {
                Node temp = head ;
                for (int i = 0 ; i < idx ; i++)
                {
                    temp = temp.next;
                }
                return temp.data;

            }

        }

        public void addFirst (int data)
        {
            Node temp = new Node();
            temp.data = data;
            if (size == 0)
            {
                head = tail = temp;
            }
            else {
                temp.next = head;
                head = temp;
            }
            size++;
        }

        public void addAt(int idx , int val)
        {
            if (idx < 0 || idx > size)
            {
                System.out.println("Invalid Syntax");
            }
            else if (idx == 1)
            {
                addFirst(val);
            }
            else if (idx == size){
                addLast(val);
            }
            else
            {
                Node node = new Node();
                node.data = val;

                Node temp = head;
                for (int i = 0 ; i < idx-1 ; i++)
                {
                    temp = temp.next;
                }
                node.next = temp.next;
                temp.next = node;
                size++;
            }
        }

        public void removeLast ()
        {
            if (size == 0)
            {
                System.out.println("Empty LinkedList");
            }
            else if (size == 1)
            {
                head = tail = null;
            }
            else {
                Node temp = head;

                for (int i = 0 ; i < size - 2 ; i++)
                {
                    temp = temp.next;
                }
                temp.next = null;
                tail = temp;
                size--;
            }
        }
        private  Node getNodeAt (int idx)
        {


            Node temp = head ;
            for (int i = 0 ; i < idx ; i++)
            {
                temp = temp.next;
            }
            return temp;

        }

        public void reverseDI() {
            // write your code here
            int li = 0;
            int ri = size-1;

            while (li > ri)
            {
                Node left = getNodeAt(li);
                Node right = getNodeAt(ri);

                int temp = left.data;
                left.data = right.data;
                right.data = temp;

                ri--;
                li++;
            }

        }


        public void reverseLLP ()
        {
            Node prev = null;
            Node curr = head;

            while (curr != null)
            {
                Node next = curr.next;
                curr.next = prev;
                prev = curr;
                curr = next;
            }
            Node temp = head;
            head = tail;
            tail = temp;
        }

        public void removeAt (int idx)
        {
            if (idx< 0 || idx>=size)
            {
                System.out.println("Invalid index");
            }
            else if (idx == 0){
                removeFirst();
            }
            else if(idx == size-1){
                removeLast();
            }
            else{
                Node temp = head;
                for (int i = 0; i < idx-1 ; i++)
                {
                    temp = temp.next;
                }
                temp.next = temp.next.next;
                size--;
            }
        }


    }

    public static void main(String[] args) {
        Scanner scn = new Scanner (System.in);
        LL list = new LL ();
        String str = scn.next();

        while (str.equals ("quit") == false)
        {
            if (str.startsWith("addLast"))
            {
                int val = Integer.parseInt(scn.next());
                list.addLast(val);
            }
            else if (str.startsWith("addFirst"))
            {
                int val = Integer.parseInt(scn.next());
                list.addFirst(val);
            }
            str = scn.next();
        }
        list.display();
        list.size();
//        list.removeFirst();
//        list.display();
//        list.size();

//        System.out.println(list.getFirst());
//        System.out.println(list.getLast());
//        System.out.println(list.getAt(3));

        //list.reverseLLP();
        list.removeAt(2);
        list.display();
    }
}