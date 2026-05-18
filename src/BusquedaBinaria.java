import models.Persona;

public class BusquedaBinaria {
    public void sortByAge(Persona[] personas){
        for(int i=0; i<personas.length-1; i++){
            boolean swap = false;
            for(int j=0; j<personas.length-i-1; j++){
                if(personas[j].getEdad() > personas[j+1].getEdad()){
                    Persona aux = personas[j];
                    personas[j] = personas[j+1];
                    personas[j+1] = aux;
                    swap = true;
                }
            }
            if(!swap){
                break;
            }
        }
    }
    public int findByAge(Persona[] personas, int age){
        int bajo = 0;
        int alto = personas.length -1;

        while(bajo<=alto){
            int central = (bajo+alto)/2;

            if(personas[central].getEdad() == age){
                return central;
            } 
            
            if(personas[central].getEdad() > age){
                bajo = central + 1;
            } else {
                alto = central - 1;
            }
        }
        return -1;
    }
}

