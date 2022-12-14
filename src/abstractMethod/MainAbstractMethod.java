package abstractMethod;

public class MainAbstractMethod {
    public static void main(String[] args) {
        Cat cat = new Cat("Pussi");
        cat.run();
        cat.canEat();

        Cat cat1 = new Cat("Catty");
        cat1.run();
        cat1.canEat();

        Cat cat2 = new Cat("Citty");
        cat2.run();
        cat2.canEat();

        Horse horse1 = new Horse("Baidu");
        horse1.run();
        horse1.canEat();

        Tokek tokek = new Tokek("Invoker", 3);
        tokek.run();
        tokek.canEat();

        Tokek tokek1 = new Tokek("Pugna", 3);
        tokek1.run();
        tokek1.canEat();
    }
}
