package Task7_01;

public class MyList <type> implements ListTemplate<type>{
    private int size;
    private type[] list;

    public MyList() {
        this.size=0;// default
        this.list= (type[]) new Object[this.size];
    }

    public MyList(int someSize) {
        this.size = someSize;
        this.list= (type[]) new Object[size];
    }

    @Override
    public void add(type element) {
        this.size++;
        type[] newList = (type[]) new Object[size];
        System.arraycopy(list, 0, newList, 0, size-1);
        this.list=newList;
        this.list[size-1]=element;
    }

    @Override
    public type get(int index) {
        if((index <= this.size)&&(index >= 0)){
            return this.list[index-1];
        }else {
            System.out.println("Index is out of list boundary!");
            return null;
        }
    }

    @Override
    public int getSize() {
        return this.size;
    }
}
