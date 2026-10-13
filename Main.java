import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
    ArrayList<Vehiculo> vehiculos = new ArrayList<>();

    vehiculos.add(new Motocicleta("AJK12I", "Yamaha", "2027", 120));
    vehiculos.add(new Motocicleta("HPA29D", "Suzuki", "2023", 90));

    vehiculos.add(new Automovil("AAA992", "Tesla", "2026", 165));
    vehiculos.add(new Automovil("RTE432", "", "2022", 44, "No"));

    vehiculos.add(new Camion("TYT456", "Alguna", "2010", 90));
    vehiculos.add(new Camion("PLS912", "LaMejor", "2021", 120));


    Vehiculo vehiculo = new Automovil();
    vehiculo.setPlaca("MIZ880");
    vehiculos.add(vehiculo);

    System.out.println(vehiculos);
    System.out.println(vehiculos.get(0));
    System.out.println(vehiculos.get(1));
    System.out.println(vehiculos.get(2).getPlaca());

    for(Vehiculo c : vehiculos){
        c.mostrarInformacion();
        System.out.println("La marca del vehiculo es: " + c.getMarca() + ",\n y el número de placa es: " + c.getPlaca());
    }

    vehiculos.toString();
    }
}
















