class FinalVariable {
    final int MAX_VALUE = 100; // final variable

    void display() {
        System.out.println("Final variable value: " + MAX_VALUE);
    }

    public static void main(String[] args) {
        FinalVariable obj = new FinalVariable();
        obj.display();
    }
}
