public class Main {
    public static Parent createObject(String className) {
        switch (className) {
            case "Child1":
                return new ChildOne("Common Property for Child1", 10);
            case "Child2":
                return new ChildTwo("Common Property for Child2", 20.5);
            case "Child3":
                return new ChildThree("Common Property for Child3", "Unique Property 3");
            default:
                return null;
        }
    }

    public static void main(String[] args) {
        Parent obj1 = createObject("Child1");
        Parent obj2 = createObject("Child2");
        Parent obj3 = createObject("Child3");

        Printable[] objects = {(Printable) obj1, (Printable) obj2, (Printable) obj3};

        for (Printable obj : objects) {
            obj.print();
        }
    }
}
