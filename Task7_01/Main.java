package Task7_01;


public class Main {
    public static void main(String[] args) {
        MyList<Integer> myList=new MyList<>();
        myList.add(13);
        myList.add(125);
        myList.add(43);
        System.out.println("Size of list = "+myList.getSize());
        System.out.println("2-nd element = "+myList.get(2));
        myList.add(-190);
        System.out.println("4-th element = "+myList.get(4));
        System.out.println("5-th element = "+myList.get(5));
    }
}
