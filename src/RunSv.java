public class RunSv {
    public static void main(String[] args) {
        int points[] = {1,2,3};
        int points1 [] = {4,5,6};
         Sv so1= new Sv("Linh", 78, points);
         Sv so2= new Sv("Hoa", 78, points);
        so1.setName( "Phong");
        System.out.println( so1);
        System.out.println( " số điểm trung bnh là: "+so1.Avg1());
        System.out.println( " số điểm trung bnh là: "+so2.Avg1());


    }
}
