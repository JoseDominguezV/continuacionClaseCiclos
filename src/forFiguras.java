public class forFiguras {
    public static void main(String[] args) {
        /* Pintar la imagen
        *
        * *
        * * *
        * * * *
        * * * * *
         */

        for (int i=1; i<=5; i++){
            for (int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
