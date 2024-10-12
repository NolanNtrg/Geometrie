import java.util.Scanner;

public class Triangle_Main2 {
    public static void main(String[] args) {
        int dx, dy;
        Scanner lecteur = new Scanner(System.in);
        TriangleCompose tCompH, tCompV;

        System.out.println("---------------------------------------------------------------------\nSaisie des trois sommets ptA, ptB et ptC d'un triangle\n---------------------------------------------------------------------");
        System.out.println("(1) Coordonnées du sommet ptA");
        Point ptA = Triangle_Utilitaire.saisirPoint();
        System.out.println("(2) Coordonnées du sommet ptB");
        Point ptB = Triangle_Utilitaire.saisirPointNonConfondu(ptA);
        System.out.println("(3) Coordonnées du sommet ptC");
        Point ptC = Triangle_Utilitaire.saisirPointNonAligneP1P2(ptA, ptB);
        TriangleCompose tComp = new TriangleCompose(ptA, ptB, ptC);
        tCompH = Triangle_Utilitaire.symetriqueH(tComp);
        tCompV = Triangle_Utilitaire.symetriqueV(tComp);


        System.out.println("----------------------------------------------------------------------------------------------------\nCoordonnées initiales des points ptA, ptB et ptC : " + ptA + ptB + ptC + "\n----------------------------------------------------------------------------------------------------");
        System.out.println("Triangle construit avec les points ptA, ptB et ptC en composition");
        System.out.println(tComp);
        System.out.println("Triangle symétrique par rapport à l'axe horizontal");
        System.out.println(tCompH);
        System.out.println("Triangle symétrique par rapport à l'axe vertical");
        System.out.println(tCompV);

        System.out.println("-----------------------------------------\nDÉPLACEMENT DU TRIANGLE\n-----------------------------------------");
        System.out.print("Déplacement horizontal des sommets ? ");
        dx = lecteur.nextInt();
        lecteur.nextLine();
        System.out.print("Déplacement vertical des sommets ? ");
        dy = lecteur.nextInt();
        lecteur.nextLine();
        


        tComp.deplacer(dx, dy);
        tCompH.deplacer(dx, dy);
        tCompV.deplacer(dx, dy);
        System.out.println("======================================================================\nAprès déplacement du triangle construit avec les points ptA, ptB et ptC en composition\n======================================================================");
        System.out.println("Coordonnées des points ptA, ptB et ptC : " + ptA + ptB + ptC);
        System.out.println("Caractéristiques du triangle :");
        System.out.println(tComp);
        System.out.println("Caractéristiques de son symétrique par rapport à l'axe horizontal");
        System.out.println(tCompH);
        System.out.println("Caractéristiques de son symétrique par rapport à l'axe vertical");
        System.out.println(tCompV);
    }
}
