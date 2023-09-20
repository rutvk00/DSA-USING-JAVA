//https://www.youtube.com/watch?v=fnaL-RyK0m0&list=PL-Jc9J83PIiEyUGT3S8zPdTMYojwZPLUM&index=42

package PepcodingLevel1.Queue;
import java.util.*;
import java.io.*;

class DynamicQueue
{
    public static class QueueDy
    {
        int []data;
        int front ;
        int size ;

        public QueueDy (int cap)
        {
            data = new int[cap];
            front = 0;
            size = 0;
        }

        int size()
        {
            return size();
        }

        void display()
        {
            for (int i = 0 ; i < size ; i++)
            {
                int idx = (front + i) % data.length;
                System.out.print(data[idx]+" ");
            }
            System.out.println();
        }

        void add (int val)
        {
            if (size == data.length)
            {
                int ndata[] = new int[2*data.length];
                for (int i = 0 ; i < size ; i++)
                {
                    int idx = (front + i) % data.length;
                    ndata[i] = data[idx];
                }
                data = ndata;

                int rear = (front + size)%data.length;
                data[rear] = val;
                size++;

            }
            else {
                int rear = (front + size)%data.length;
                data[rear] = val;
                size++;
            }
        }

        int remove()
        {
            if (size == 0)
            {
                System.out.println("Queue Underflow");
                return -1;
            }
            else {
                int val = data[front];
                front = (front+1)%data.length;
                size--;
                return val;
            }
        }

        int peek ()
        {
            if (size == 0)
            {
                System.out.println("Queue Underflow");
                return -1;
            }
            else {
                return data[front];
            }
        }
    }

    public static void main(String[] args) throws Exception {
        QueueDy queue = new QueueDy(5);
        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.add(4);
        queue.add(5);

        queue.display();

        queue.add(6);

        System.out.println(queue.remove());
        System.out.println(queue.remove());
        System.out.println(queue.remove());

        queue.display();

        System.out.println(queue.peek());
    }
}