public class cicloWhile {
    public static void main(String[] args) {
        /* Ciclo while
        pintar los numero del 1 al 10
         */
        boolean noHaTerminado = true;
        int numero = 1;

        while (noHaTerminado){
            System.out.println("Numero: "+numero);
            numero = numero + 1;
            if (numero > 10){
                noHaTerminado = false;
            }
        }
    }
}
