abstract class Vehiculo {
    private String placa;
    private String marca;
    private String modelo;
    private double velocidadMaxima;

    public Vehiculo(String placa, String marca, String modelo, double velocidadMaxima) {
        this.placa = placa;
        this.marca = marca;
        this.modelo = modelo;
        this.velocidadMaxima = velocidadMaxima;
    }

    public Vehiculo(String placa, String marca, String modelo) {
        this.placa = placa;
        this.marca = marca;
        this.modelo = modelo;
    }

     public Vehiculo() {

    }

    public String getPlaca() {
        return placa;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public double getVelocidadMaxima() {
        return velocidadMaxima;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setVelocidadMaxima(double velocidadMaxima) {
        this.velocidadMaxima = velocidadMaxima;
    }

    public void mostrarInformacion() {
        System.out.println(getMarca());
    }

    /*
    abstract void mostrarInformacion(){
    };
    */

    /*
    @Override
    public String toString() {
        return "Automovil {Placa= " + getPlaca() + ", marca=" + getMarca() + ", modelo= " + getModelo() +"}";
    }
    */
}
