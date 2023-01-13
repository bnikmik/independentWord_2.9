public class Main {
    public static void main(String[] args) {

        MyList<String> myList = new MyLinkedList<>();
        myList.add("1");
        myList.add("4");
        myList.add("2");
        myList.add("5");
        myList.add("5");
        System.out.println(myList);
        System.out.println(myList.remove(2));
        System.out.println(myList.remove(2));
        System.out.println(myList);


        System.out.println(myList.get(1));

        System.out.println(myList.pop());
        System.out.println(myList.size());


    }
}