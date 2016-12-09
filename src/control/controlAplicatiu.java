package control;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import model.Figura;
import model.Cercle;
import model.Rombe;
import model.Trapezi;
import model.Regular;
import vista.aplicatiu.vistaAplicatiu;

public class controlAplicatiu {

    vistaAplicatiu va = new vistaAplicatiu();

    public ArrayList<Figura> coleccioFigures = new ArrayList<>();

    /**
     * Metode que controla tot l'aplicatiu.
     */
    public void aplicatiu() {
        do {
            respostaUsuariMenuPrincipal();
        } while (true);

    }

    public void crearFigura() {
        int opcio;

        opcio = va.mostrarMenuCrearFigura();
        respostaUsuariMenuCrear(opcio);

    }

    public void mostrarFigura() {
        int opcio;

        opcio = va.mostrarMenuVeureFigures();
        respostaUsuariMenuVeureFigures(opcio);
    }

    public void modificarFigura() {

        respostaUsuariMenuModificar();

    }

    /**
     * Metode que conté les opcions del menu principal.
     *
     * @param opcio
     */
    public void respostaUsuariMenuPrincipal() {
        int opcio;

        opcio = va.mostrarMenuPrincipal();

        switch (opcio) {
            case 1:
                crearFigura();
                break;

            case 2:
                mostrarFigura();
                break;

            case 3:
                modificarFigura();
                break;

            case 4:
                System.exit(0);
                break;
        }
    }

    /**
     * Metode que conté les opcions del menu crear figures.
     *
     * @param opcio
     */
    public void respostaUsuariMenuCrear(int opcio) {

        switch (opcio) {
            case 1:

                String nomCercle = va.mostrarCrearNom();
                double radi = va.mostrarIntroduirRadi();

                coleccioFigures.add(new Cercle(nomCercle, radi));

                break;

            case 2:

                String nomRombe = va.mostrarCrearNom();

                String missatgeDiagonal1 = "Introdueix la mida de la diagonal major.";
                String missatgeDiagonal2 = "Introdueix la mida de la diagonal menor.";

                double DM = va.mostrarIntroduirMidaDiagonal(missatgeDiagonal1);
                double dm = va.mostrarIntroduirMidaDiagonal(missatgeDiagonal2);

                coleccioFigures.add(new Rombe(nomRombe, DM, dm));

                break;

            case 3:

                String missatgeBase1 = "Introdueix la mida de la base major.";
                String missatgeBase2 = "Introdueix la mida de la base menor.";

                String nomTrapezi = va.mostrarCrearNom();

                double BM = va.mostrarIntroduirBase(missatgeBase1);
                double bm = va.mostrarIntroduirBase(missatgeBase2);

                double altura = va.mostrarIntroduirAltura();

                double diagonal = va.mostrarIntroduirDiagonalTrapezi();

                coleccioFigures.add(new Trapezi(nomTrapezi, BM, bm, altura, diagonal));

                break;

            case 4:

                String nomPoligonRegular = va.mostrarCrearNom();

                int numCostatsPoligonRegular = va.mostrarIntroduirNumCostats();

                double midaCostatsPoligonRegular = va.mostrarIntroduirMidaCostats();

                coleccioFigures.add(new Regular(nomPoligonRegular, numCostatsPoligonRegular, midaCostatsPoligonRegular));

                break;
        }

    }

    /**
     * MEtode que serveix per a veure el tipus de figura que l'usuari ha
     * escollit per a que es mostrin.
     *
     * @param opcio
     */
    public void respostaUsuariMenuVeureFigures(int opcio) {

        switch (opcio) {
            //Veure cercle.
            case 1:
                for (Figura i : coleccioFigures) {
                    if (i instanceof Cercle) {
                        System.out.println(i.toString());
                    }
                }
                break;

            //Veure rombe.
            case 2:
                for (Figura i : coleccioFigures) {
                    if (i instanceof Rombe) {
                        System.out.println(i.toString());
                    }
                }

                break;

            //Veure trapezi.
            case 3:
                for (Figura i : coleccioFigures) {
                    if (i instanceof Trapezi) {
                        System.out.println(i.toString());
                    }
                }

                break;

            //Veure regular.
            case 4:
                for (Figura i : coleccioFigures) {
                    if (i instanceof Regular) {
                        System.out.println(i.toString());
                    }
                }
                break;
        }
    }

    public void respostaUsuariMenuModificar() {
        int opcio;
        String nom;

        opcio = va.mostrarMenuModificarFigures();
        nom = va.mostrarDemanarNomFiguraModificar();

        switch (opcio) {
            //Modificar Cercle
            case 1:
                buscarCercleModificar(nom);
                break;
            //Modificar Rombe
            case 2:
                buscarRombeModificar(nom);
                break;
            //Modificar Trapezi     
            case 3:
                buscarTrapeziModificar(nom);
                break;
            //Modificar Regular
            case 4:
                buscarRegularModificar(nom);
                break;
        }
    }

    /**
     * Metode que busca i modifica la figura Cercle que coincideix amb el nom
     * introduit.
     *
     * @param nom
     */
    public void buscarCercleModificar(String nom) {

        Cercle c;
        for (Figura j : coleccioFigures) {
            if ((j instanceof Cercle) && ((Cercle) j).getNom().equals(nom)) {
                c = (Cercle) j;
                c.setRadi(va.mostrarIntroduirRadi());
            }

        }
    }

    /**
     * Metode que busca i modifica la figura Rombe que coincideix amb el nom
     * introduit.
     *
     * @param nom
     */
    public void buscarRombeModificar(String nom) {

        String missatgeDiagonal1 = "Introdueix la mida de la diagonal major.";
        String missatgeDiagonal2 = "Introdueix la mida de la diagonal menor.";

        Rombe r;
        for (Figura j : coleccioFigures) {
            if ((j instanceof Rombe) && ((Rombe) j).getNom().equals(nom)) {
                r = (Rombe) j;

                r.setDiagonalMajor(va.mostrarIntroduirMidaDiagonal(missatgeDiagonal1));
                r.setDiagonalMenor(va.mostrarIntroduirMidaDiagonal(missatgeDiagonal2));
            }

        }
    }

    /**
     * Metode que busca i modifica la figura Trapezi que coincideix amb el nom
     * introduit.
     *
     * @param nom
     */
    public void buscarTrapeziModificar(String nom) {

        String missatgeBase1 = "Introdueix la mida de la base major.";
        String missatgeBase2 = "Introdueix la mida de la base menor.";

        Trapezi t;
        for (Figura j : coleccioFigures) {
            if ((j instanceof Trapezi) && ((Trapezi) j).getNom().equals(nom)) {
                t = (Trapezi) j;

                t.setBaseMajor(va.mostrarIntroduirBase(missatgeBase1));
                t.setBaseMenor(va.mostrarIntroduirBase(missatgeBase2));
                
                t.setDiagonal(va.mostrarIntroduirDiagonalTrapezi());
                
                t.setAltura(va.mostrarIntroduirAltura());
            }

        }
    }

    /**
     * Metode que busca i modifica la figura Regular que coincideix amb el nom
     * introduit.
     *
     * @param nom
     */
    public void buscarRegularModificar(String nom) {
        double midaCostats;

        Regular r;
        for (Figura j : coleccioFigures) {
            if ((j instanceof Regular) && ((Regular) j).getNom().equals(nom)) {
                r = (Regular) j;

                r.setMidaCostats(va.mostrarIntroduirMidaCostats());
            }

        }
    }

}
