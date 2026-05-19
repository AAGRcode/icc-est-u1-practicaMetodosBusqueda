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
            System.out.println();
            for(int i=bajo; i<=alto; i++){
                System.out.print(personas[i].getEdad() + " | ");
            }
            System.out.println();
            int central = (bajo+alto)/2;
            int valorCentral = personas[central].getEdad();
            if(valorCentral == age){
                System.out.print("bajo="+bajo+ "  alto="+alto+ "  central="+central + "  valorCentral="+valorCentral + "    ENCONTRADO");
                System.out.println();
                return central;
            }else if(valorCentral < age){
                System.out.print("bajo="+bajo+ "  alto="+alto+ "  central="+central + "  valorCentral="+valorCentral + "    DERECHA");
                System.out.println();
                bajo = central + 1;
            }else{
                System.out.print("bajo="+bajo+ "  alto="+alto+ "  central="+central + "  valorCentral="+valorCentral + "    IZQUIERDA");
                System.out.println();
                alto = central - 1;
            }
        }
        return -1;
    }
}

