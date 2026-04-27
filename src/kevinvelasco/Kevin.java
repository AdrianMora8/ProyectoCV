/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kevinvelasco;

public class Kevin {
    public static void main(String[] args) {
        Kevin miInstancia = new Kevin();
        miInstancia.imprimirDatosPersonales();
    }

    public void imprimirDatosPersonales() {
        String nombre = "Kevin Velasco";
        String universidad = "Universidad Técnica de Ambato (UTA)";
        int semestre = 4;

        System.out.println("=======================================");
        System.out.println("Nombre del Estudiante: " + nombre);
        System.out.println("Institución: " + universidad);
        System.out.println("Semestre actual: " + semestre + "° Semestre");
        System.out.println("Carrera: Ingeniería de Software");
        System.out.println("=======================================");
    }
}
