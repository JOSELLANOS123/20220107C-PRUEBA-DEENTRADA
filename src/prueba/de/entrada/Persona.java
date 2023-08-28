/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package prueba.de.entrada;
import java.util.Scanner;
public class Persona {
        private String nombre;
        private int edad;
        private String genero;
    public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);
     System.out.println("Ingrese la cantidad de personas a registrar: ");
     int cantidadPersonas= scanner.nextInt();
     Persona[] personas = new Persona [cantidadPersonas];
     for(int i=0; i<cantidadPersonas;i++){
         Persona persona = new Persona();
         System.out.print("Ingrese el nombre de la persona " + (i+1) + ": ");
         String nombre = scanner.nextLine();
         persona.setearNombre(nombre);
         scanner.nextLine();
         System.out.print("Ingrese el genero de la persona " + (i+1) + ": ");
         String genero = scanner.nextLine();
         System.out.print("Ingrese la edad de la persona [" + (i+1)+"] : ");
                int edad=scanner.nextInt();
                persona.setearEdad(edad);
                personas[i] = persona;
       }
     calcularEdadPromedio(personas);
    }
     public void setearNombre(String nombre) {
        this.nombre = nombre;
    }
    public String obtenerNombre() {
        return nombre;
    }
    public void setearEdad(int edad) {
        this.edad = edad;
    }
    public int obtenerEdad() {
        return edad;
    }
    public static void calcularEdadPromedio (Persona[] personas)
    {      
        float suma = 0;
        for (Persona persona : personas){
            suma += persona.obtenerEdad();
        }
        float promedio = suma/ personas.length;
        System.out.println("Edad promedio:" + promedio);
     }
}
