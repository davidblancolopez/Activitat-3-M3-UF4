package vista.aplicatiu;

import java.util.Scanner;
import model.Figura;

public class vistaAplicatiu {

    Scanner lector = new Scanner(System.in);

    /**
     * Menú principal de l'aplicatiu.
     *
     * @return
     */
    public int mostrarMenuPrincipal() {
        int opcio;

        System.out.println("MENÚ: \n"
                + "1. Crear figura.\n"
                + "2. Veure les figures.\n"
                + "3. Modificar figura.\n"
                + "4. Sortir de l' aplicació");

        do {
            
            System.out.println("Quina opció vols?");

            opcio = lector.nextInt();
 
            
        } while (comprovarMenu1(opcio));

        return opcio;
    }

    /**
     * Metode que comprova que la opció introduida als menus es correcte.
     *
     * @param opcio
     * @return
     */
    public boolean comprovarMenu1(int opcio) {
        boolean comprovar = true;

        if (opcio > 0 && opcio < 5) {
            comprovar = false;
        }

        return comprovar;
    }

    /**
     * *****************************************************************************************
     * SUBMENU*****************************************************
     *****************************************************************************************
     */
    /**
     * Menú de creació de figures.
     *
     * @return
     */
    public int mostrarMenuCrearFigura() {
        int opcio;

        System.out.println("MENÚ: \n"
                + "Quin tipus de figura vols crear?\n"
                + "1. Cercle.\n"
                + "2. Rombe.\n"
                + "3. Trapezi.\n"
                + "4. Poligon regular");

        do {
            System.out.println("Quina opció vols?");
            if (lector.hasNext()) {
                opcio = 0;
            }
            opcio = lector.nextInt();
        } while (comprovarMenu1(opcio));

        return opcio;
    }

    /**
     * Menú per a seleccionar quina figura es vol mostrar per pantalla.
     *
     * @return
     */
    public int mostrarMenuVeureFigures() {
        int opcio;

        System.out.println("MENÚ: \n"
                + "Quin tipus de figura vols veure? \n"
                + "1. Cercle.\n"
                + "2. Rombe.\n"
                + "3. Trapezi.\n"
                + "4. Poligon regular");

        do {
            System.out.println("Quina opció vols?");
            if (lector.hasNext()) {
                opcio = 0;
            }
            opcio = lector.nextInt();
        } while (comprovarMenu1(opcio));

        return opcio;
    }

    /**
     * *****************************************************************************************
     * OPCIONS PER A LA CREACIÓ DE
     * FIGURES.*****************************************************
     *****************************************************************************************
     */
    /**
     * Opció per a introduir el nom a la figura.
     *
     * @return
     */
    public String mostrarCrearNom() {
        String nom;

        System.out.println("Introdueix el nom de la figura: ");
        nom = lector.next();

        return nom;
    }

    /**
     * Opció per a introduir el radi del cercle.
     *
     * @return
     */
    public double mostrarIntroduirRadi() {
        double radi;

        System.out.println("Introdueix el radi del cecle: ");
        radi = lector.nextDouble();

        return radi;
    }

    /**
     * Opció per a introduir el numero de costats dels poligons regulars.
     *
     * @return
     */
    public int mostrarIntroduirNumCostats() {
        int num;

        System.out.println("Introdueix el numero de costats de la figura: ");
        num = lector.nextInt();

        return num;
    }

    /**
     * Opció per a introduir la mida dels costats.
     *
     * @return
     */
    public double mostrarIntroduirMidaCostats() {
        double midaCostats;

        System.out.println("Introdueix la mida costats: ");
        midaCostats = lector.nextDouble();

        return midaCostats;
    }

    /**
     * Opció per a introduir la mida de les diagonals del rombe.
     *
     * @param missatge
     * @return
     */
    public double mostrarIntroduirMidaDiagonal(String missatge) {
        double midaDiagonals;

        System.out.println(missatge);
        midaDiagonals = lector.nextDouble();

        return midaDiagonals;
    }

    /**
     * Opció per a introduir les mides de les bases del trapezi.
     *
     * @param missatge
     * @return
     */
    public double mostrarIntroduirBase(String missatge) {
        double midaBase;

        System.out.println(missatge);
        midaBase = lector.nextDouble();

        return midaBase;
    }

    /**
     * Opció per a introduir la altura del trapezi.
     *
     * @return
     */
    public double mostrarIntroduirAltura() {
        double altura;

        System.out.println("Introdueix la altura del trapezi: ");
        altura = lector.nextDouble();

        return altura;
    }
    
    /**
     * Metode que demana la medida de la diagonal del trapezi
     * @return 
     */
    public double mostrarIntroduirDiagonalTrapezi(){
        double diagonal;
        
        System.out.println("Introdueix la diagonal del trapezi: ");
        diagonal = lector.nextDouble();
        
        return diagonal;
  
    }

    /**
     * *****************************************************************************************
     * OPCIONS PER A DEMANA LA FIGURA A
     * MODIFICAR.*****************************************************
     *****************************************************************************************
     */
    
    /**
     * Menú que demana el tipus de figura que es vol modificar per aixi saber quins 
     * parametres es tindran que demanar per a modificar.
     * @return 
     */
    public int mostrarMenuModificarFigures() {
        int opcio;

        System.out.println("MENÚ: \n"
                + "Quin tipus de figura vols modificar? \n"
                + "1. Cercle.\n"
                + "2. Rombe.\n"
                + "3. Trapezi.\n"
                + "4. Poligon regular");

        do {
            System.out.println("Quina opció vols?");
            if (lector.hasNext()) {
                opcio = 0;
            }
            opcio = lector.nextInt();
        } while (comprovarMenu1(opcio));

        return opcio;
    }

    
    /**
     * Metode que demana el nom de la figura que es vol modificar per utilitzar el nom
     * per a buscar-la.
     * @return 
     */
    public String mostrarDemanarNomFiguraModificar() {
        String nom;

        System.out.println("Introdueix el nóm de la figura que vols modificar: ");
        nom = lector.next();

        return nom;
    }

    
    
    
    
    
    
    
    
    
    
    /**
     * ***************************************************************************************
     * OPCIONS PER A DEMANA LA FIGURA A MODIFICAR.********************************************
     *****************************************************************************************
     */
    
    /**
     * 
     * @param figures 
     */
    public void mostrarFigures(Figura figures){
        System.out.println(figures);
    }
    
    
}
