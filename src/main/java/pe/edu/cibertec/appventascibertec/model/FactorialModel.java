package pe.edu.cibertec.appventascibertec.model;

public class FactorialModel {
    public static long calcularFactorial(int numero) {
        if (numero == 0) {
            return 1;
        } else {
            return numero * calcularFactorial(numero - 1);
        }
    }
}
