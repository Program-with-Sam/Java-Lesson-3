public class GetSetExample {

    // Declare a private variable
    private int someInt = 1000;

    // Declare a private variable
    private boolean someBoolean = true;

    // Constructor
    GetSetExample() {}

    // Getter for int variable
    public int getSomeInt() {
        return someInt;
    }

    // Setter for int variable
    public void setSomeInt(int someInt) {
        this.someInt = someInt;
    }

    // Getter for boolean variable - notice slightly different syntax
    public boolean isSomeBoolean() {
        return someBoolean;
    }

    // Setter for boolean variable
    public void setSomeBoolean(boolean someBoolean) {
        this.someBoolean = someBoolean;
    }
}
