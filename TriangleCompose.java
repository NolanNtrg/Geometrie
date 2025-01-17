public class TriangleCompose {
    // attributs
    private Point somA; // Sommet A
    private Point somB; // Sommet B
    private Point somC; // Sommet C

    //constructeurs
    public TriangleCompose(Point somA, Point somB, Point somC) {
        this.somA = new Point(somA.getX(), somA.getY());
        this.somB = new Point(somB.getX(), somB.getY());
        this.somC = new Point(somC.getX(), somC.getY());
    }

    // méthodes
    public Point getSomA() {
        return somA;
    }

    public Point getSomB() {
        return somB;
    }

    public Point getSomC() {
        return somC;
    }

    public double getCoteAB() {
        // { } => { résultat = longueur du côté d'extrémités somA et somB }
        return Math.sqrt(Math.pow(getSomB().getX()-getSomA().getX(), 2)+Math.pow(getSomB().getY()-getSomA().getY(), 2));
    }

    public double getCoteAC() {
        // { } => { résultat = longueur du côté d'extrémités somA et somC }
        return Math.sqrt(Math.pow(getSomC().getX()-getSomA().getX(), 2)+Math.pow(getSomC().getY()-getSomA().getY(), 2));
    }

    public double getCoteBC() {
        // { } => { résultat = longueur du côté d'extrémités somB et somC }
        return Math.sqrt(Math.pow(getSomC().getX()-getSomB().getX(), 2)+Math.pow(getSomC().getY()-getSomB().getY(), 2));
    }

    public double perimetre() {
        // { } => { résultat = périmètre de ce Triangle }
        return (getCoteAB()+getCoteAC()+getCoteBC());
    }

    public double surface() {
        // { } => { résultat = surface de ce Triangle }
        double p = (getCoteAB()+getCoteAC()+getCoteBC())/2;
        return Math.sqrt(p*(p-getCoteAB())*(p-getCoteAC())*(p-getCoteBC()));
    }

    public void deplacer(int dx, int dy) {
        // { } => { les sommets de ce Triangle sont déplacés
        // horizontalement de dx et verticalement de dy }
        getSomA().deplace(dx, dy);
        getSomB().deplace(dx, dy);
        getSomC().deplace(dx, dy);
    }

    @Override
    public String toString() {
        return "* Sommets : " + somA + " " + somB + " " + somC + " \n" +
                "* Périmètre : " + Math.round(100 * perimetre()) / 100.0 + "\n" +
                "* Surface : " + Math.round(100 * surface()) / 100.0;
    }

}
