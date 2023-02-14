public class MyLinkedList<T> implements MyList<T> {
    private static class Node<T> {
        T value;
        Node<T> next;

        public Node(T value) {
            this.value = value;
        }
    }

    private Node<T> general;
    private int size;

    public MyLinkedList() {
    }

    /*
    add an item to the end of the list
     */
    @Override
    public void add(T t) {
        if (general == null) {
            general = new Node<>(t);
        } else {
            Node<T> temp = req(general);
            temp.next = new Node<>(t);
        }
        size++;
    }

    /*/
    search for the required node
     */
    private Node<T> req(Node<T> temp) {
        if (temp.next != null) {
            temp = temp.next;
            return req(temp);
        } else {
            return temp;
        }
    }

    /*
    delete the first element and returns it
     */
    @Override
    public T pop() {
        Node<T> tempPop = general;
        general = tempPop.next;
        size--;
        return tempPop.value;
    }

    /*
    delete an element by index
    */
    @Override
    public T remove(int index) {
        checkIndex(index);
        Node<T> temp = general;
        Node<T> previous = null;
        for (int i = 0; i < index; i++) {
            previous = temp;
            temp = temp.next;
        }
        if (previous != null) {
            previous.next = temp.next;
        } else {
            general = temp.next;
        }
        size--;
        return temp.value;
    }

    /*/
    Checking for an index
     */
    private void checkIndex(int index) {
        if (index < 0 || index >= size) {
            throw new IllegalArgumentException("Вы задали неверный индекс!!!");
        }
    }

    /*
    get an element by index
    */
    @Override
    public T get(int index) {
        checkIndex(index);
        Node<T> temp = general;
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }
        return temp.value;
    }

    /*
    returns the size of the list
    */
    @Override
    public int size() {
        return size;
    }

    @Override
    public String toString() {
        StringBuilder str = new StringBuilder();
        Node<T> temp = general;
        str.append("[");
        while (temp != null) {
            str.append(temp.value);
            temp = temp.next;
            if (temp != null) {
                str.append(", ");
            }
        }
        str.append("]");
        return str.toString();
    }
}
