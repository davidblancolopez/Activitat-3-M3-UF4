
package control;

import vista.aplicatiu.vistaAplicatiu;


public class controlAplicatiu {
    vistaAplicatiu va = new vistaAplicatiu();
    
    public void aplicatiu(){
        int opcio;
        do{
        opcio = va.mostrarMenuPrincipal();
        
        }while(opcio != 4);
    }
    
    public void respostaUsuari(int opcio){
        
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
    
    public void crearFigura(){
        
    }
    
    public void mostrarFigura(){
        
    }
    
    public void modificarFigura(){
        
    }
            
}
