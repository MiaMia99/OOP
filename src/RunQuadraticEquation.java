public class RunQuadraticEquation {
    public static void main(String[] args) {
        QuadraticEquation quadraticEquation= new QuadraticEquation(1,2,3);
        System.out.println(quadraticEquation);
        System.out.println( );
        if (!quadraticEquation.checkDenta()) {git
            System.out.println("Vô nghiệm bạn ơi!!");
        } else {
            System.out.println("Nghiệm 1 là : " + Math.floor(quadraticEquation.getR1() * 100) / 100);
            System.out.println("Nghiệm 2 là : " + (double) Math.round(quadraticEquation.getR2()));
        }
    }

}


