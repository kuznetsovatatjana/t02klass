public class V6rdleKolmnurkad {
    public static void main(String[] args) throws Exception{

        TaisnurkneKolmnurk kolmnurk1 = new TaisnurkneKolmnurk(2.8, 3.6);
        TaisnurkneKolmnurk kolmnurk2 = new TaisnurkneKolmnurk(4.3, 5);
        TaisnurkneKolmnurk kolmnurk3 = new TaisnurkneKolmnurk(7.1, 10);

        System.out.println(kolmnurk1.pindala());
        System.out.println(kolmnurk2.pindala());
        System.out.println(kolmnurk3.pindala());

        if(kolmnurk2.pindala()< kolmnurk1.pindala() && kolmnurk3.pindala()<kolmnurk1.pindala()){
            System.out.println("Kõige suurem pindala on esimese kolmnurka pindala " + kolmnurk1.pindala());
        }else if (kolmnurk1.pindala()<kolmnurk2.pindala()&&kolmnurk3.pindala()<kolmnurk2.pindala()){
            System.out.println("Kõige suurem pindala on teise kolmnurka pindala " + kolmnurk2.pindala());
        } else {
            System.out.println("Kõige suurem pindala on kolmanda kolmnurka pindala " + kolmnurk3.pindala());
        }

    }
}
