package espana.arturo.conversordemonedas.models;

public class Menu {


    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        // Mostrar el menú
        System.out.println("Bienvenido/a al Conversor de Moneda");
        System.out.println("-----------------------------------------");
        System.out.println("1) Dólar a Peso Argentino");
        System.out.println("2) Peso Argentino a Dólar");
        System.out.println("3) Dólar a Real Brasileño");
        System.out.println("4) Real Brasileño a Dólar");
        System.out.println("5) Dólar a Peso Colombiano");
        System.out.println("6) Peso Colombiano a Dólar");
        System.out.println("7) Salir");
        System.out.println("Elija una opción válida:");

        // Obtener la opción del usuario
        int opcion = teclado.nextInt();

        // Procesar la opción seleccionada
        switch (opcion) {
            case 1:
                convertirDolarAPesoArgentino();
                break;
            case 2:
                convertirPesoArgentinoADolar();
                break;
            case 3:
                convertirDolarARealBrasileño();
                break;
            case 4:
                convertirRealBrasileñoADolar();
                break;
            case 5:
                convertirDolarAPesoColombiano();
                break;
            case 6:
                convertirPesoColombianoADolar();
                break;
            case 7:
                System.out.println("¡Gracias por usar el Conversor de Moneda!");
                System.exit(0);
            default:
                System.out.println("Opción no válida. Intente nuevamente.");
        }

        teclado.close();
    }

}
