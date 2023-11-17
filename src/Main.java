// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    static Integer contador1750;
    static Integer contador1000;
    static Integer contadorMas1750;
    // trabajador

    /**
     * Aumenta contador según rango del sueldo del trabajador
     *
     * @param args no recibe parámetros
     */
    public static void main(String[] args) {
        Trabajador auxTrabajador;
        // Funciones obx = new Funciones();
        do {
            auxTrabajador = Funciones.darAltaTrabajador();
            actualizarContadores(auxTrabajador);
        } while (auxTrabajador.getSueldo() != 0);
    }

    /**
     * Aumenta contadores de un rango
     */
    public static void actualizarContadores(Trabajador auxTrabajador) {
        if (Funciones.obtenerSueldo1750(auxTrabajador.getSueldo())) {
            contador1750++;
        } else if (Funciones.obtenerSueldo1000(auxTrabajador.getSueldo())) {
            contador1000++;
        } else {
            contadorMas1750++;
        }
    }

    public static void mostrarContadores() {
        System.out.println(" Entre 1000-1750 " + contadorMas1750);
    }
}
