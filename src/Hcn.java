public class Hcn {
    public int dai;
    public int rong;
    public int tinhChuvi;

    public int tinhDientich;
    public Hcn() {
        this.dai = 20;
        this.rong = 30;
    }

    public Hcn(int daiInput, int rongInput) {
        this.dai = daiInput;
        this.rong = rongInput;

    }

    public void setChieuRong(int rong){
        this.rong = rong;
    }
    public void setChieuDai(int dai){
        this.dai = dai;
    }

    public int tinhChuvi() {
        tinhChuvi = (dai + rong)/2;
        return tinhChuvi;
    }
    public int tinhDientich() {
        tinhDientich = dai * rong;
        return tinhDientich;
    }


    @Override
    public String toString() {
        return "Hcn{" +
                "dai=" + dai +
                ", rong=" + rong +
                '}';
    }
}
