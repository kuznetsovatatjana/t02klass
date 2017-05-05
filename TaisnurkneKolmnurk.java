public class TaisnurkneKolmnurk {
    double a, b;
    public TaisnurkneKolmnurk(double kateet1, double kateet2){
        if(kateet1 <= 0){throw new RuntimeException("Sobimatu kateet");}
        if(kateet2 <= 0){throw new RuntimeException("Sobimatu kateet");}
        a=kateet1;
        b=kateet2;
    }

    public double pindala(){
        return (a * b)/2;
    }
}
