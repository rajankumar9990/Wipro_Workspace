package wd;
class static_local_ex {
    static int count = 0; // static variable

    static void incrementCount() {    //we can call it without creating an object
        int localIncrement = 5; // local variable
        count += localIncrement;
        System.out.println("Updated Count: " + count);
    }

    public static void main(String[] args) {
        incrementCount(); // Directly call static method
        incrementCount();
        System.out.println("Final Count: " + count);
    }
}
