// Develop a Program that illustrate method overriding concept.

class a {
    public void hello() {
        System.out.println("Original function");
    }
}

class b extends a {
    @Override
    public void hello() {
        System.out.println("Overriden function");
    }
}

public class Pr_4 {
    public static void main(String[] args) {
        b obj = new b();
        obj.hello();
        a obj2 = new a();
        obj2.hello();
    }
}
