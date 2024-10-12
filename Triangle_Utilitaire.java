import java.util.Scanner;

public class Triangle_Utilitaire {

    public static Point saisirPoint() {
        // { } => {résultat = un Point dont les coordonnées
        // sont saisies par l'utilisateur
        int abscisse, ordonnee;
        Scanner lecteur = new Scanner(System.in);
        System.out.print("*Abscisse ? ");
        abscisse = lecteur.nextInt();
        lecteur.nextLine();
        System.out.print("Ordonnée ? ");
        ordonnee = lecteur.nextInt();
        lecteur.nextLine();

        return new Point(abscisse, ordonnee);
    }

    public static Point saisirPointNonConfondu(Point lePoint) {
        // { } => {résultat = un Point non confondu avec lePoint,
        // dont les coordonnées sont saisies par l'utilisateur}
        int abscisse, ordonnee;
        Scanner lecteur = new Scanner(System.in);

        System.out.println("Saisie d'un point non confondu avec le point (" + lePoint.getX() + ", " + lePoint.getY() + ")");
        System.out.print("*Abscisse ? ");
        abscisse = lecteur.nextInt();
        lecteur.nextLine();
        do {
            System.out.print("Ordonnée ? ");
            ordonnee = lecteur.nextInt();
            lecteur.nextLine();
            if (abscisse == lePoint.getX() & ordonnee == lePoint.getY()) {
                System.out.println("--> Point confondu avec le point (" + lePoint.getX() + ", " + lePoint.getY() + "), recommencez...");
                System.out.println("Saisie d'un point non confondu avec le point (" + lePoint.getX() + ", " + lePoint.getY() + ")");
            }
        } while (abscisse == lePoint.getX() & ordonnee == lePoint.getY());

        return new Point(abscisse, ordonnee);
    }

    public static Point saisirPointNonAligneP1P2(Point p1, Point p2) {
        // { } => { résultat = un Point de coordonnées saisies par l'utilisateur,
        // différent de p1 et de p2 et non aligné avec p1 et p2 }
        int abscisse, ordonnee;
        Scanner lecteur = new Scanner(System.in);

        System.out.println("Saisie d'un point non aligné avec les points (" + p1.getX() + ", " + p1.getY() + ") et (" + p2.getX() + ", " + p2.getY() + ")");
        do {
            do {
                System.out.print("*Abscisse ? ");
                abscisse = lecteur.nextInt();
                lecteur.nextLine();
                if (abscisse == p1.getX() & abscisse == p2.getX()) {
                    System.out.println("--> Point aligné avec les points (" + p1.getX() + ", " + p1.getY() + ") et (" + p2.getX() + ", " + p2.getY() + "), recommencez...");
                    System.out.println("Saisie d'un point non aligné avec les points (" + p1.getX() + ", " + p1.getY() + ") et (" + p2.getX() + ", " + p2.getY() + ")");
                }
            } while (abscisse == p1.getX() & abscisse == p2.getX());
            do {
                System.out.print("*Ordonnée ? ");
                ordonnee = lecteur.nextInt();
                lecteur.nextLine();
                if (ordonnee == p1.getY() & ordonnee == p2.getY()) {
                    System.out.println("--> Point aligné avec les points (" + p1.getX() + ", " + p1.getY() + ") et (" + p2.getX() + ", " + p2.getY() + "), recommencez...");
                    System.out.println("Saisie d'un point non aligné avec les points (" + p1.getX() + ", " + p1.getY() + ") et (" + p2.getX() + ", " + p2.getY() + ")");
                }
            } while (ordonnee == p1.getY() & ordonnee == p2.getY());
            if (abscisse != p1.getX() & abscisse != p2.getX() & p1.getX() != p2.getX() & ((p1.getY()-ordonnee)/(p1.getX()-abscisse)) == ((p2.getY()-ordonnee)/(p2.getX()-abscisse))) {
                System.out.println("--> Point aligné avec les points (" + p1.getX() + ", " + p1.getY() + ") et (" + p2.getX() + ", " + p2.getY() + "), recommencez...");
                System.out.println("Saisie d'un point non aligné avec les points (" + p1.getX() + ", " + p1.getY() + ") et (" + p2.getX() + ", " + p2.getY() + ")");
            }
        } while (abscisse != p1.getX() & abscisse != p2.getX() & p1.getX() != p2.getX() & ((p1.getY()-ordonnee)/(p1.getX()-abscisse)) == ((p2.getY()-ordonnee)/(p2.getX()-abscisse)));

        return new Point(abscisse, ordonnee);
    }

    public static TriangleCompose symetriqueH(TriangleCompose tComp) {
        // { } =>
        // { résultat = nouveau TriangleCompose dont les sommets sont obtenus par
        // symétrie des sommets de tComp par rapport à l'axe horizontal }
       Point somA, somB, somC;
       Point tCompA, tCompB, tCompC;
       int tCompAX, tCompAY, tCompBX, tCompBY, tCompCX, tCompCY;

       tCompA = tComp.getSomA();
       tCompAX = tCompA.getX();
       tCompAY = tCompA.getY();
       tCompB = tComp.getSomB();
       tCompBX = tCompB.getX();
       tCompBY = tCompB.getY();
       tCompC = tComp.getSomC();
       tCompCX = tCompC.getX();
       tCompCY = tCompC.getY();

       somA = new Point(tCompAX, -tCompAY);
       somB = new Point(tCompBX, -tCompBY);
       somC = new Point(tCompCX, -tCompCY);

       return new TriangleCompose(somA, somB, somC);
    }

    public static TriangleCompose symetriqueV(TriangleCompose tComp) {
        // { } =>
        // { résultat = nouveau TriangleCompose dont les sommets sont obtenus par
        // symétrie des sommets de tComp par rapport à l'axe vertical }
        Point somA, somB, somC;
        Point tCompA, tCompB, tCompC;
        int tCompAX, tCompAY, tCompBX, tCompBY, tCompCX, tCompCY;

        tCompA = tComp.getSomA();
        tCompAX = tCompA.getX();
        tCompAY = tCompA.getY();
        tCompB = tComp.getSomB();
        tCompBX = tCompB.getX();
        tCompBY = tCompB.getY();
        tCompC = tComp.getSomC();
        tCompCX = tCompC.getX();
        tCompCY = tCompC.getY();

        somA = new Point(-tCompAX, tCompAY);
        somB = new Point(-tCompBX, tCompBY);
        somC = new Point(-tCompCX, tCompCY);

        return new TriangleCompose(somA, somB, somC);
    }
}
