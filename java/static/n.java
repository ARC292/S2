public class n {
    private int privateVar = 10;

    private void privateMethod() {
        System.out.println("This is a private method.");
    }

    public void accessPrivateVar() {
        // Accessing privateVar within the same class
        System.out.println("privateVar value: " + privateVar);
        privateMethod();
    }

    public static void main(String[] args) {
        n obj = new n();
        obj.accessPrivateVar(); // Accessing privateVar via a public method
        // obj.privateVar; // This would result in a compilation error
        // obj.privateMethod(); // This would also result in a compilation error
    }
}

