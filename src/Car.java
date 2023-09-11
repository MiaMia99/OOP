public class Car {
    public String name = "Honda";
    public int height;
    public int weight;

    public Car() {
        this.name = "Mec";
        this.height = 40;
        this.weight = 400;
    }

    public Car(String nameInput, int heightInput, int weightInput) {
        this.name = nameInput;
        this.height = heightInput;
        this.weight = weightInput;
    }

    public void go(){
        System.out.println( this.name + " leo dốc");
    }



    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", height=" + height +
                ", weight=" + weight +
                '}';
    }
}