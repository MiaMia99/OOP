import java.util.Arrays;

//Bài tập Sinh Viên: Viết một lớp Student để quản lý
// thông tin sinh viên gồm các
// thuộc tính như tên, tuổi, một mảng điểm số.
// Tạo các phương thức cho phép thay đổi thông
// tin sinh viên, hiển thị thông tin sinh viên
// và tính trung bình điểm của sinh viên.
//=> Tạo ra 2 đối tượng student và hiển thị sinh viên có điểm trung bình cao hơn.
public class Sv {
    public String name;
    public int age;
    public int[] points;
    public int Avg1;
    //public double Avg2;

    public Sv(String name, int age, int[] points) {
        this.name = name;
        this.age = age;
        this.points = points;

    }

    public int Avg1( ){
       //C1 Avg1= (points[0] + points[1]+ points[2])/3;
        int tong = 0;
        for (int i = 0; i < points.length; i++) {
            tong = tong + points[i];
            Avg1 = tong/3;

        }
        return Avg1;
    }

    public int Avg2( ){
        //C1 Avg2= (points1[0] + points1[1]+ points1[2])/3;
        int tong1 = 0;
        for (int i = 0; i < points.length; i++) {
            tong1 = tong1 + points[i];
            Avg1 = tong1/3;

        }
        return Avg1;
    }
    public void setName(String name){ this.name = name;}
    public void setAge(int age){ this.age= age;}
    public void setPoints(int points []){this.points= points; }

    @Override
    public String toString() {
        return "Sv{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", points=" + Arrays.toString(points) +
                '}';
    }
}

