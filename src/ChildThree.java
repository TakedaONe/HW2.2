public class ChildThree extends Parent implements Printable{
    private String uniqueProperty3;

    public ChildThree(String commonProperty, String uniqueProperty3) {
        super(commonProperty);
        this.uniqueProperty3 = uniqueProperty3;
    }

    public String getUniqueProperty3() {
        return uniqueProperty3;
    }

    @Override
    public void print() {
        System.out.println("Child3: commonProperty = " + commonProperty + ", uniqueProperty3 = " + uniqueProperty3);
    }
}
