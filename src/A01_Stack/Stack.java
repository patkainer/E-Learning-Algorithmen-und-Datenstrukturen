package A01_Stack;


public class Stack<T>
{
	 private Node<T> first;
     private int counter = 0;
    /**
     * Oberstes Element entfernen und zurückliefern.
     * Existiert kein Element, wird eine Exception ausgelöst.
     * @throws StackEmptyException 
     */
    public T pop() throws StackEmptyException {
        if(first == null)
        {
            throw new StackEmptyException();
        }

        Node<T> result = first;
        first = first.getNext();
        result.setNext(null);
    	return result.getData();
    }
    
    /**
     * Übergebenen T auf Stack (als oberstes Element) speichern.
     * @param i data
     */
    public void push(T i) {
        Node<T> next = new Node<>(i);
        next.setNext(first);
        first = next;

    }
    
    /**
     * Liefert die Anzahl der Elemente im Stack
     * @return
     */
    public int getCount() {
    	return counter;
    }
}
