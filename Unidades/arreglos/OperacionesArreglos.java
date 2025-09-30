package mx.edu.uttt.arreglos;

import javax.swing.JOptionPane;

public class OperacionesArreglos {
    private double[] vector;
    private final int TAMANIO = 5;

    // Constructores
    public OperacionesArreglos() {
        this.vector = new double[TAMANIO];
    }

    public OperacionesArreglos(int tamanio) {
        this.vector = new double[tamanio];
    }

    public OperacionesArreglos(double[] vector) {
        this.vector = new double[vector.length];
        this.llenarArreglo(vector);
    }

    // Llenar desde otro vector
    public void llenarArreglo(double[] vector) {
        int i = 0;
        while (i < this.vector.length) {
            this.vector[i] = vector[i];
            i++;
        }
    }

    // Llenar
    public void llenarArreglo() {
        int i=0;
        do{
            this.vector[i] = Double.parseDouble(JOptionPane.showInputDialog("Introduce el valor decimal "));
            i++;
        }while(1<this.vector.length);
    }

    // Sumar valores
    public double sumarValores() {
        double suma = 0.0;
        for (int i=0; i<vector.length;i++) {
            suma+= this.vector[i];
        }
        return suma;
    }

    // Valor máximo
    public double obtenerValorMaximo() {
        double max = vector[0];
        for (double v : vector) {
            if (v > max) {
                max = v;
            }
        }
        return max;
    }

    // Valor mínimo
    public double obtenerValorMinimo() {
        double minimo = this.vector [0];

        for(double valor: this.vector){
            if(valor < minimo){
                minimo=valor;
            }
        }
       return minimo;
    }

    // Comparar con otro arreglo
    public boolean compararArreglos(double[] vector) {
        if (this.vector.length != vector.length) {
            return false;
        }
        for (int i = 0; i < this.vector.length; i++) {
            if (this.vector[i] != vector[i]) {
                return false;
            }
        }
        return true;
    }

    // Cambiar tamaño
    public void cambiarTamanio(int tamanio) {
        double[] temp = new double[tamanio];
        for (int i = 0; i < this.vector.length; i++) {
            temp[i]=this.vector[i];
        }
        this.vector=temp;
        temp=null;
    }

    // Buscar valor
    public String buscarValor(double valor) {
        String salida ="";
        boolean sentinel = false ;
        for (int i = 0; i < this.vector.length; i++) {
            if (valor== this.vector[i]) {
                sentinel = true;
               salida="El valor" + valor + "esta en la posicion"+i;
               break;
            }
        }
        if(!sentinel)
            salida= "el valor no se encontro en el arreglo";
        return salida;
    }

    // Imprimir
    public void imprimir() {
        String salida = "";
        int i = 0;
        for (double valor : vector) {
            salida += "[" + i + "] = " + valor + "\n";
            i++;
        }
        JOptionPane.showMessageDialog(null, salida, "Contenido del arreglo", JOptionPane.INFORMATION_MESSAGE);
    }
}


// emplear vectotres que deben mostrar n productos (guardar en un vector los productos, nombre, precio y existencia)



