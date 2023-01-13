public interface MyList<T> {
    void add(T t); // добавление в конец списка
    T pop(); // удаляет первый элемент и возвращает его
    T remove(int index); // удаляет элемент по индексу
    T get(int index); // получает элемент по индексу
    int size(); // возвращает размер списка
}
