/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package c22025.clase2;

import javax.swing.JOptionPane;

/**
 *
 * @author viti
 */
public class C22025Clase2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        if (true){
            JOptionPane.showMessageDialog(null, "El if dio SIIIII");
        }
        int i=0;
        if (i==0){
            JOptionPane.showMessageDialog(null, "I es igual a 0");
        }
        if (i==1){
            JOptionPane.showMessageDialog(null, "I es diferente a 0");
        }
        
        
        String variable1 = "Hola1";
        String variable2 = "Hola1";
        String variable3 = "Hola2";

        if (variable1 == variable2) { //ESTO NO ES CORRECTO NO SE DEBE DE COMPARAR EL IDE LO ACEPTA PERO PUEDE GENERAR ERROR
            JOptionPane.showMessageDialog(null, "Son iguales");
        }

        if (variable1 == "Hola1") { //ESTO NO ES CORRECTO NO SE DEBE DE COMPARAR EL IDE LO ACEPTA PERO PUEDE GENERAR ERROR
            JOptionPane.showMessageDialog(null, "Son iguales");
        }

        if (variable1 == variable3) { //ESTO NO ES CORRECTO NO SE DEBE DE COMPARAR EL IDE LO ACEPTA PERO PUEDE GENERAR ERROR
            JOptionPane.showMessageDialog(null, "Son iguales");
        }

//        La forma correcta para comparar String es utilizando metodos
        if (variable1.equals(variable2) == true) { //  //las formas correcta de comparar
            JOptionPane.showMessageDialog(null, "La forma correcta para comparar Strings");
        }
        if (variable1.compareTo(variable3) == 0) { //las formas correcta de comparar
            JOptionPane.showMessageDialog(null, "La forma correcta para comparar Strings");
        }

        int edad = 14;
        if (edad != 15) {
            JOptionPane.showMessageDialog(null, "Puede tomar cocacola");
        }

        if (edad < 15 || edad > 15) {
            JOptionPane.showMessageDialog(null, "Puede tomar cocacola");
        }

        String user = "usuario1";
        String pwd = "123456";
        if (user.compareTo("usuario1") == 0 && pwd.equals("123456")) {
            JOptionPane.showConfirmDialog(null, "Este usuario no es permitido");
        } else {
            JOptionPane.showConfirmDialog(null, "Correcto");
        }

        if (user.equals("usuario1")) {
            JOptionPane.showConfirmDialog(null, "Correcto");
        }
        JOptionPane.showConfirmDialog(null, "Siempre Se imprime");

        String lectura = "";
        lectura = JOptionPane.showInputDialog("Dame tu edad");
        int edad2 = Integer.parseInt(lectura); // Este codigo cambia de un string a un int

        if (edad2 > 17) {
            JOptionPane.showMessageDialog(null, "El puede tomar alcohol");
        }

        int diaSemana = 3;
        switch (diaSemana) {
            case 1:
                JOptionPane.showMessageDialog(null, "Lunes");
                break;
            case 2:
                JOptionPane.showMessageDialog(null, "Martes");
                break;
            case 3:
                JOptionPane.showMessageDialog(null, "Miercoles");
                break;
            case 4:
                JOptionPane.showMessageDialog(null, "Jueves");   
                break;
            case 5:
                JOptionPane.showMessageDialog(null, "Viernes");
                break;
            case 6:
                JOptionPane.showMessageDialog(null, "Sabado");
                break;
            case 7:
                JOptionPane.showMessageDialog(null, "Domingo");
                break;
            default:
               JOptionPane.showMessageDialog(null, "No es un día ");
        }

    }

}
