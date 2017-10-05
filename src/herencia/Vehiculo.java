package herencia;

public class Vehiculo {
    protected int caballosDeFuerza;
    
    public Vehiculo(int x){
        System.out.println("Constructor del Padre");
        this.caballosDeFuerza = x;
    };
    
    public void arrancar(){
        System.out.println("Arrancar padre");
    }
    public void detener(){
        System.out.println("Detener padre");
    }
}

