public class ChildOne extends Parent implements Printable{
    private int uniqueProperty1;

    public ChildOne(String commonProperty, int uniqueProperty1) {
        super(commonProperty);
        this.uniqueProperty1 = uniqueProperty1;
    }

    public int getUniqueProperty1() {
        return uniqueProperty1;
    }

    @Override
    public void print() {
        System.out.println("Child1: commonProperty = " + commonProperty + ", uniqueProperty1 = " + uniqueProperty1);
    }
}
