public class tercerEjemplo {
    public static void main(String[] args) {
        /* Hacer una serie que se muestre del 1 al 100
        de la siguiente forma:
        1-D
        2-L
        3-D
        4-L
        y asi sucesivamente hasta el 100
         */
        int numero = 1;
        String letra;
        while (numero <= 100){
            if (numero %2 == 0){
                letra = "L";
            }else {
                letra = "D";
            }
            System.out.println(numero + "-" +letra);
            numero = numero + 1;
        }
    }
}
