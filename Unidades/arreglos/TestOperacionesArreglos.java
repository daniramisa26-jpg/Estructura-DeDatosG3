package mx.edu.uttt.arreglos;
import javax.swing.JOptionPane;
/*public class TestOperacionesArreglos {
     public static void main(String[] args) {

        OperacionesArreglos op1 = new OperacionesArreglos();
        OperacionesArreglos op2 = new OperacionesArreglos (6);

        double vector [] = {1.2,4.5,7.8};
        OperacionesArreglos op3 = new OperacionesArreglos(vector );
    }
}... */
public class TestOperacionesArreglos {
    public static void main(String[] args) {
        int tam = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el tamaño del arreglo:"));
        OperacionesArreglos op = new OperacionesArreglos(tam);

        int opcion;
        do {
            opcion = Integer.parseInt(JOptionPane.showInputDialog(
                    "=== MENÚ ARREGLOS ===\n" +
                            "1. Llenar arreglo\n" +
                            "2. Imprimir arreglo\n" +
                            "3. Sumar valores\n" +
                            "4. Valor máximo\n" +
                            "5. Valor mínimo\n" +
                            "6. Buscar valor\n" +
                            "7. Cambiar tamaño\n" +
                            "8. Comparar con otro arreglo\n" +
                            "9. Salir\n\n" +
                            "Elige una opción:"));

            switch (opcion) {
                case 1:
                    op.llenarArreglo();
                    break;
                case 2:
                    op.imprimir();
                    break;
                case 3:
                    JOptionPane.showMessageDialog(null, "La suma es: " + op.sumarValores());
                    break;
                case 4:
                    JOptionPane.showMessageDialog(null, "El valor máximo es: " + op.obtenerValorMaximo());
                    break;
                case 5:
                    JOptionPane.showMessageDialog(null, "El valor mínimo es: " + op.obtenerValorMinimo());
                    break;
                case 6:
                    double valorBuscar = Double.parseDouble(JOptionPane.showInputDialog("Ingresa el valor a buscar:"));
                    JOptionPane.showMessageDialog(null, op.buscarValor(valorBuscar));
                    break;
                case 7:
                    int nuevoTam = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el nuevo tamaño:"));
                    op.cambiarTamanio(nuevoTam);
                    JOptionPane.showMessageDialog(null, "Se cambió el tamaño del arreglo.");
                    break;
                case 8:
                    int tam2 = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el tamaño del segundo arreglo:"));
                    double[] vector2 = new double[tam2];
                    for (int i = 0; i < tam2; i++) {
                        vector2[i] = Double.parseDouble(JOptionPane.showInputDialog("Valor en posición [" + i + "] del segundo arreglo:"));
                    }
                    boolean iguales = op.compararArreglos(vector2);
                    JOptionPane.showMessageDialog(null, iguales ? "Los arreglos son IGUALES." : "Los arreglos son DIFERENTES.");
                    break;
                case 9:
                    JOptionPane.showMessageDialog(null, "Saliendo del programa...");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opción no válida.");
            }
        } while (opcion != 9);
    }
}
