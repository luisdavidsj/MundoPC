package mundopc;

import com.gm.mundopc.*;

public class MundoPC {
    public static void main(String[] args) {
        Monitor monitorHP = new Monitor("HP", 13);
        Teclado tecladoHP = new Teclado("bluetooth","HP");
        Raton ratonHP = new Raton("bluetooth","HP");
        Computadora computadoraHP = new Computadora("Computadora HP", monitorHP, tecladoHP, ratonHP);
        
        Monitor monitorGamer = new Monitor("Gamer", 34);
        Teclado tecladoGamer = new Teclado("bluetooth","Gamer");
        Raton ratonGamer = new Raton("bluetooth","Gamer");
        Computadora computadoraGamer = new Computadora("Computadora Gamer", monitorGamer, tecladoHP, ratonGamer);
        
        Orden orden1 = new Orden();
        orden1.agregarComputadora(computadoraHP);
        orden1.agregarComputadora(computadoraGamer);
        
        orden1.mostrarOrden();
        
        //Ejercicio de creacion de un objeto de tipo orden con 1 computadora con 3 dispositivos:
        Monitor monitorAsus = new Monitor("Asus",34.00);
        Teclado tecladoLogitech = new Teclado("USB","Logitech G910");
        Raton ratonRazer = new Raton("USB","Razer Deathadder Elite");
        Computadora compuLuis = new Computadora("Compu Luis",monitorAsus,tecladoLogitech,ratonRazer);
        
        Orden orden2 = new Orden();
        orden2.agregarComputadora(compuLuis);
        
        orden2.mostrarOrden();
    }
}
