package metodusok;

public class osszeadas {
    
    public static void main(String[] args) {
        int szam1 = 3;
        int szam2 = 5;
        int eredmeny = elsoszam(szam1, szam2);
        eredmenykiir(szam1, szam2, eredmeny);
        int ujeredmeny = elsoszam(eredmeny,2);
        eredmenykiir(eredmeny,2,ujeredmeny);
    }
    static int elsoszam(int a, int b){
        return a+b;
    }

    private static void eredmenykiir(int szam1, int szam2, int eredmeny) {
        System.out.println("--------------");
        System.out.printf(" %d + %d %d\n", szam1, szam2, eredmeny );
    }

}