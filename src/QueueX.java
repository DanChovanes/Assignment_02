//Dan Chovanes
//Code provided by Robert Lang and Deborah Whitfield
//Once again, the only one reading this is me.

public class QueueX {
    private int maxSize;
    private char[] queArray;
    private int front, rear, nItems;
//------------------------------------------------------
    public QueueX(int s) {
        maxSize = s;
        queArray = new char[maxSize];
        front = 0;
        rear = -1;
        nItems = 0;
    }
//------------------------------------------------------
    public void insert(char j) {
        if (rear  == maxSize-1)
            rear = -1;
        queArray[++rear] = j;
        nItems++;
    }
//------------------------------------------------------
    public char remove() {
        char temp = queArray[front++];
        if(front == maxSize)
            front = 0;
        nItems--;
        return temp;
    }
//------------------------------------------------------
    public char peekFront() {
        return queArray[front];
    }
//------------------------------------------------------
    public boolean isEmpty() {
        return (nItems==0);
    }
//------------------------------------------------------
    public boolean isFull() {
        return (nItems == maxSize);
    }
//------------------------------------------------------
    public int size() {return nItems;}
//------------------------------------------------------
} //end class QueueX
