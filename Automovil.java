public class Automovil extends Vehiculo {

    private int velocidadMinima;
    private String multas;

    public Automovil(String placa, String marca, String modelo, double velocidadMaxima) {
        super(placa, marca, modelo, velocidadMaxima);
    }

    public Automovil(String placa, String marca, String modelo, int velocidadMinima, String multas) {
        super(placa, marca, modelo);
        this.velocidadMinima = velocidadMinima;
        this.multas = multas;
    }

    public Automovil(){
    }

    @Override
    public void mostrarInformacion() {
        System.out.println(getMarca());
        System.out.println(getVelocidadMaxima());
        System.out.println(velocidadMinima);
    }

    @Override
    public String toString() {
        return "Automovil {Placa= " + getPlaca() + ", marca=" + getMarca() + ", modelo= " + getModelo() +"}";
    }

    /*
    @Override
    public void mostrarInformacion() {
        System.out.println(getMarca());
    }
    */
}

