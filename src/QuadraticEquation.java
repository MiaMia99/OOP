public class QuadraticEquation {
    public int a;
    public int b;
    public int c;
    public QuadraticEquation (int a, int b, int c){
        this.a= a;
        this.b= b;
        this.c=c;

    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int getC() {
        return c;
    }

    public void setC(int c) {
        this.c = c;
    }

    @Override
    public String toString() {
        return "Phương trình có dạng: " +
                this.a  + "x^2 +" + this.b  +
                "x + " + c + "=0";
    }
    double getDenta (){
        return (Math.pow(this.b,2) - 4*this.a*this.c)/2;
    }
    double getR1(){
        double denta= getDenta();
        double R1;
        if(denta == 0){ R1= -(this.b/(2*this.a));
    } else {
            R1 = (-b + Math.sqrt(denta)) / (this.a * 2);
        }
        return R1;
        }
    double getR2(){
        double denta= getDenta();
        double R2;
        if(denta == 0){ R2= -(this.b/(2*this.a));
        } else {
            R2 = (-b - Math.sqrt(denta)) / (this.a * 2);
        }
        return R2;
    }
    boolean checkDenta() {
        double Denta = getDenta();
        if (Denta < 0) {
            return false;
        } else {
            return true;
        }
    }

}



