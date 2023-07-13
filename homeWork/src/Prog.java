public class Prog {
    public static void main(String[] args) {
        hw_3 list = new hw_3();

        list.add(3);
        list.add(10);
        list.add(2);
        list.add(7);
        list.add(5);
        list.add(1);

        list.print();

        list.revert();
        list.bubleSort();

        list.print();
    }
}
