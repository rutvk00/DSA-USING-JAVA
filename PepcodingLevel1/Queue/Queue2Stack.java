//https://www.youtube.com/watch?v=bJpPuLMiUgA&list=PL-Jc9J83PIiEyUGT3S8zPdTMYojwZPLUM&index=48
// pop efficient
package PepcodingLevel1.Queue;
import java.util.*;
import java.io.*;
class Queue2Stack
{
    public static class QtoStack
    {
        Queue<Integer> mainQ ;
        Queue<Integer> helperQ;

        public QtoStack()
        {
            mainQ = new ArrayDeque<>();
            helperQ = new ArrayDeque<>();
        }

        int size()
        {
           return mainQ.size();
        }

        void push(int val)
        {
            while (mainQ.size() > 0)
            {
                helperQ.add (mainQ.remove());
            }
            mainQ.add(val);
            while (helperQ.size() > 0)
            {
                mainQ.add(helperQ.remove());
            }
        }
        int pop()
        {
            if (mainQ.size() == 0)
            {
                System.out.println("Stack UnderFlow");
                return -1;
            }
            else {
                return mainQ.remove();
            }
        }

        int top()
        {
            if (mainQ.size() == 0)
            {
                System.out.println("Stack UnderFlow");
                return -1;
            }
            else {
                return mainQ.peek();
            }
        }
    }

    public static void main(String[] args) {
        QtoStack QS = new QtoStack();

        QS.push(1);
        QS.push(2);
        QS.push(3);
        QS.push(4);
        QS.push(5);
        System.out.println(QS.top());

    }

}