public interface MyList<T> {
    /*
    add an item to the end of the list
     */
    void add(T t);

    /*
    delete the first element and returns it
     */
    T pop();

    /*
    delete an element by index
     */
    T remove(int index);

    /*
    get an element by index
     */
    T get(int index);

    /*
    returns the size of the list
     */
    int size();
}
