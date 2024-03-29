//Dan Chovanes
//Code provided by Robert LaFore and Deborah Whitfield
//Once again, the only one reading this is me.

public class StackX {
    private int maxSize;
    private char[] stackArray;
    private int top;
//------------------------------------------------------
    public StackX(int s){
        maxSize = s;
        stackArray = new char[maxSize];
        top = -1;
    }
//------------------------------------------------------
    public void push(char j) {
        stackArray[++top] = j;
    }
//------------------------------------------------------
    public char pop() {
        return stackArray[top--];
    }
//------------------------------------------------------
    public char peek() {
        return stackArray[top];
    }
//------------------------------------------------------
    public boolean isEmpty() {
        return (top == -1);
    }
//------------------------------------------------------
    public boolean isFull() {
        return (top == maxSize - 1);
    }
} //end class StackX
