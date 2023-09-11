public class Run {
    public static void main(String[] args) {
        Car so1 = new Car();
        Car so2 = new Car("Honda", 78,99);
        System.out.println(so1);
        System.out.println(so2);
        so1.go();
        so2.go();
    }
}
