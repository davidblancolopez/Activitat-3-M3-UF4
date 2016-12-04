
package control;

import model.Cercle;
import model.Rombe;
import model.Trapezi;
import model.Regular;
import vista.aplicatiu.vistaAplicatiu;


public class controlAplicatiu {
    vistaAplicatiu va = new vistaAplicatiu();
    
    
    /**
     * Metode que controla tot l'aplicatiu.
     */
    public void aplicatiu(){
        int opcio;
        do{
        opcio = va.mostrarMenuPrincipal();
        respostaUsuariMenuPrincipal(opcio);
        
        
        }while(opcio != 4);
    }
    
   
    
    public void crearFigura(){
        int opcio;
        
        opcio = va.mostrarMenuCrearFigura();
        respostaUsuariMenuCrear(opcio);
        
    }
    
    public void mostrarFigura(){
        
    }
    
    public void modificarFigura(){
        
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    /**
     * Metode que conté les opcions del menu principal.
     * @param opcio 
     */
    public void respostaUsuariMenuPrincipal(int opcio){
        
        switch(opcio){
            case 1:
            crearFigura();
            break;
            
            case 2:
            
            break;
            
            case 3:
            
            break;
            
            case 4:
            
            break;
        }
    }
    
    
    
    /**
     * Metode que conté les opcions del menu crear figures.
     * @param opcio 
     */
    public void respostaUsuariMenuCrear(int opcio){
        
        switch(opcio){
            case 1:
                
            String nomCercle = va.mostrarCrearNom();
            double radi = va.mostrarIntroduirRadi();
            
            new Cercle(nomCercle, radi);
            break;
                        
            case 2:
                
            String nomRombe = va.mostrarCrearNom();
                
            String missatgeDiagonal1 = "Introdueix la mida de la diagonal major.";
            String missatgeDiagonal2 = "Introdueix la mida de la diagonal menor.";
            
            double DM = va.mostrarIntroduirMidaDiagonal(missatgeDiagonal1);
            double dm = va.mostrarIntroduirMidaDiagonal(missatgeDiagonal2);
            
            new Rombe(nomRombe, DM, dm);
                
            break;
            
            case 3:
                
            String missatgeBase1 = "Introdueix la mida de la base major.";
            String missatgeBase2 = "Introdueix la mida de la base menor.";    
                
            
            String nomTrapezi = va.mostrarCrearNom(); 
                
            double BM = va.mostrarIntroduirBase(missatgeBase1);
            double bm = va.mostrarIntroduirBase(missatgeBase2);
            
            double altura = va.mostrarIntroduirAltura();
            
            new Trapezi(nomTrapezi, BM, bm, altura);
                
            break;
            
            case 4:
                
            String nomPoligonRegular = va.mostrarCrearNom();
            
            int numCostatsPoligonRegular = va.mostrarIntroduirNumCostats();
            
            double midaCostatsPoligonRegular = va.mostrarIntroduirMidaCostats();
                
            new Regular(nomPoligonRegular, numCostatsPoligonRegular, midaCostatsPoligonRegular);
            
            break;
        }
    }
            
}
