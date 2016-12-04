
package control;

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
            
            break;
            
            case 2:
            
            break;
            
            case 3:
            
            break;
            
            case 4:
            
            break;
        }
    }
            
}
