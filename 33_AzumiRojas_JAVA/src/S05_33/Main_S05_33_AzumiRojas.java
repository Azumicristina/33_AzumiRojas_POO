/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package S05_33;

import javax.swing.JOptionPane;

public class Main_S05_33_AzumiRojas {

    public static void main(String[] args) {
        Estudiante_33 estudiante = new Estudiante_33();

        estudiante.nombre = JOptionPane.showInputDialog("Ingrese el nombre del estudiante:");
        String edadStr = JOptionPane.showInputDialog("Ingrese la edad del estudiante:");
        estudiante.edad = Integer.parseInt(edadStr);

        Libro_33 libro = new Libro_33();

        libro.titulo = JOptionPane.showInputDialog("Ingrese el título del libro:");
        libro.autor = JOptionPane.showInputDialog("Ingrese el autor del libro");

        System.out.println("Datos del Estudiante:");
        estudiante.mostrarDatosConsola();

        System.out.println("\nDatos del Libro:");
        libro.mostrarDatosConsola();

        estudiante.mostrarDatosJOptionPane();
        libro.mostrarDatosJOptionPane();
    }}