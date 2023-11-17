/**
 * Comprueba si el sueldo está entre 1000 y 1750
 * sueldo del trabajador
 * @return si está dentro del rango
 */
public class Funciones {
    public static Boolean obtenerSueldo1750(Double sueldo){
        if(sueldo > 1000 && sueldo < 1750){
            return true;
        }
        return false;
    }


    public static Boolean  obtenerSueldo1000(Double sueldo){

        return true;
    }

    public static Trabajador darAltaTrabajador(){
        Trabajador obx = new Trabajador();
        obx.setNombre("Pepe");
        obx.setSueldo(1200d);

    return darAltaTrabajador();
    }
}
