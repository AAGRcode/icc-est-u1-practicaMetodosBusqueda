import java.util.Scanner;

import models.Persona;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        BusquedaBinaria bBinaria = new BusquedaBinaria();
        System.out.println("Ingrese la cantidad de personas: ");
        int cantidad = sc.nextInt();
        Persona[] personas = new Persona[cantidad];
        for(int i=0; i<cantidad; i++){
            System.out.println("Ingrese el nombre de la persona: ");
            String nombre = sc.next();
            System.out.println("Ingrese la edad de la persona: ");
            int edad = sc.nextInt();
            while(edad<0){
                System.out.println("La edad ingresada no debe ser negativa");
                System.out.println("Ingrese nuevamente la edad de la persona: ");
                edad = sc.nextInt();}
            Persona persona = new Persona(nombre, edad);
            personas[i] = persona;
        }
        bBinaria.sortByAge(personas);
        for(Persona p : personas){
            System.out.println(p);
        }
        System.out.println("Ingrese la edad a buscar: ");
        int edadBuscada = sc.nextInt();
        int res = bBinaria.findByAge(personas, edadBuscada);
        System.out.println();
        if(res>=0){
            System.out.println("La persona con la edad " + edadBuscada + " es " + personas[res].getNombre());
        } else {
            System.out.println("No se encontro ninguna persona con la edad buscada");
        }

}
}