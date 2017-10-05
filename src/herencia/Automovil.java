package herencia;

public class Automovil extends Vehiculo {
    private int cantidadDePuertas;
    
    public Automovil(int cantidadDePuertas, int x){
        super(x);
        this.cantidadDePuertas = cantidadDePuertas;
        System.out.println("Constructor del Hijo");
    }
    
    @Override
    public void arrancar(){
        System.out.println("Sobreescribir método");
        super.arrancar();
    }
}
