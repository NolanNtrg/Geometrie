import java.util.Scanner;

public class Triangle_Main {
    public static void main(String[] args) {
        Point ptA =  new Point(1, 1);
        Point ptB = new Point(3, 5);
        Point ptC = new Point(5, 1);
        TriangleCompose tComp = new TriangleCompose(ptA, ptB, ptC);
        TriangleAgrege tAgr = new TriangleAgrege(ptA, ptB, ptC);
        int dx, dy;
        Scanner lecteur = new Scanner(System.in);

        System.out.println("----------------------------------------------------------------------------------------------------\nCoordonnées initiales des points ptA, ptB et ptC : " + ptA + ptB + ptC + "\n----------------------------------------------------------------------------------------------------");
        System.out.println("Triangle construit avec les points ptA, ptB et ptC en composition");
        System.out.println(tComp);
        System.out.println("------------");
        System.out.println(tAgr);

        System.out.println("-----------------------------------------\nDÉPLACEMENT DES TRIANGLES\n-----------------------------------------");
        System.out.print("Déplacement horizontal des sommets ? ");
        dx = lecteur.nextInt();
        lecteur.nextLine();
        System.out.print("Déplacement vertical des sommets ? ");
        dy = lecteur.nextInt();
        lecteur.nextLine();

        tComp.deplacer(dx, dy);
        System.out.println("======================================================================\nAprès déplacement du triangle construit avec les points ptA, ptB et ptC en composition\n======================================================================");
        System.out.println("Coordonnées des points ptA, ptB et ptC : " + ptA + ptB + ptC);
        System.out.println("Caractéristiques du triangle :");
        System.out.println(tComp);

        tAgr.deplacer(dx, dy);
        System.out.println("======================================================================\nAprès déplacement du triangle construit avec les points ptA, ptB et ptC en agrégation\n======================================================================");
        System.out.println("Coordonnées des points ptA, ptB et ptC : " + ptA + ptB + ptC);
        System.out.println("Caractéristiques du triangle :");
        System.out.println(tAgr);
    }
}
