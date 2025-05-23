public interface Stack {

    void push(Object item);
    Object pop() throws MyEmptyStackExeption;
    void peek();
    boolean isEmpty();


}
