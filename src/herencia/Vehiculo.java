package herencia;

public class Vehiculo {
    protected int caballosDeFuerza;
    
    public Vehiculo(){
        System.out.println("Constructor del Padre");
    };
    
    public void arrancar(){
        System.out.println("Arrancar padre");
    }
    public void detener(){
        System.out.println("Detener padre");
    }
}

