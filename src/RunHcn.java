public class RunHcn {
    public static void main(String[] args) {
        Hcn so1 = new Hcn();
        Hcn so2 = new Hcn(20,30 );
        System.out.println(so2);
        so1.setChieuRong(45);
        so1.setChieuDai(40);
        System.out.println("Chu vi là : "+ so1.tinhChuvi());
        System.out.println("Dien tich là : "+ so1.tinhDientich());




    }
}
