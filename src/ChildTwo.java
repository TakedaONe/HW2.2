public class ChildTwo extends Parent implements Printable{
    private double uniqueProperty2;

    public ChildTwo(String commonProperty, double uniqueProperty2) {
        super(commonProperty);
        this.uniqueProperty2 = uniqueProperty2;
    }

    public double getUniqueProperty2() {
        return uniqueProperty2;
    }

    @Override
    public void print() {
        System.out.println("Child2: commonProperty = " + commonProperty + ", uniqueProperty2 = " + uniqueProperty2);
    }
}
