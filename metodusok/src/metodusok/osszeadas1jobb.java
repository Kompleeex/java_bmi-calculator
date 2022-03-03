package metodusok;

public class osszeadas1jobb {
    
    public static void main(String[] args) {
        int szam1 = 3;
        int szam2 = 5;
        int eredmeny = elsoszam(szam1, szam2);
        //eredmenykiir(szam1, szam2, eredmeny);
        int ujeredmeny = elsoszam(eredmeny,2);
        //eredmenykiir(eredmeny,2,ujeredmeny);
    }
    static int elsoszam(int szam1, int szam2){
        return szam1 + szam2;
    }

    private static void eredmenykiir(int szam1, int szam2) {
        System.out.println("--------------");
        System.out.printf(" %d + %d %d\n", szam1, szam2, elsoszam(szam1,szam2) );
    }

}