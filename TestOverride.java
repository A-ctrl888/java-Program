// Superclass
class Super {
    int x;

    Super(int x) {
        this.x = x;
    }

    public void display() {
        System.out.println("Super x = " + x);
    }
}

// Subclass
class Sub extends Super {
    int y;

    Sub(int x, int y) {
        super(x);   // call to superclass constructor
        this.y = y;
    }

    // Overriding display method
    @Override
    public void display() {
        System.out.println("Super x = " + x);
        System.out.println("Sub y = " + y);
    }
}

// Main class to test
class TestOverride {
    public static void main(String[] args) {
        Sub obj = new Sub(10, 20);
        obj.display();
    }
}