package control;

import java.util.ArrayDeque;
import java.util.ArrayList;
import model.Figura;
import model.Cercle;
import model.Rombe;
import model.Trapezi;
import model.Regular;
import vista.aplicatiu.vistaAplicatiu;

public class controlAplicatiu {

    vistaAplicatiu va = new vistaAplicatiu();

    private ArrayList<Figura> coleccioFigures;

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

                coleccioFigures.add(new Trapezi(nomTrapezi, BM, bm, altura));

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
     *
     * @param opcio
     */
    public void respostaUsuariMenuVeureFigures(int opcio) {

        switch (opcio) {
            //Veure cercle.
            case 1:
                for (int i = 0; i < coleccioFigures.size(); i++) {
                    if (coleccioFigures.get(i) instanceof Cercle) {
                        coleccioFigures.get(i).toString();
                    }
                }

                break;

            //Veure rombe.
            case 2:
                for (int i = 0; i < coleccioFigures.size(); i++) {
                    if (coleccioFigures.get(i) instanceof Rombe) {
                        coleccioFigures.get(i).toString();
                    }
                }

                break;

            //Veure trapezi.
            case 3:
                for (int i = 0; i < coleccioFigures.size(); i++) {
                    if (coleccioFigures.get(i) instanceof Trapezi) {
                        coleccioFigures.get(i).toString();
                    }
                }

                break;

            //Veure regular.
            case 4:
                for (int i = 0; i < coleccioFigures.size(); i++) {
                    if (coleccioFigures.get(i) instanceof Regular) {
                        coleccioFigures.get(i).toString();
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
            case 1:
                
                break;

            case 2:

                break;

            case 3:

                break;

            case 4:
                
                break;
        }
    }
    
    public void buscarFiguraModificar(String nom){

    }
    
    
    
    
}
