package Task7_01;

public interface ListTemplate<type> {
    void add(type element);
    type get(int index);
    int getSize();
}
