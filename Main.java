package Ejercicio;

public class Main {
    
    public static void main(String args []){
        Tienda tienda = new Tienda();
        tienda.setNombre("Tienda Don Juan");
        tienda.setDireccion("Jr.Huánuco");
        tienda.agregarCliente(new Cliente("Jose","Nunez Vicente", 778899332));
        tienda.agregarCliente(new Cliente("Juan","Mamani Quispe", 778898332));
        tienda.agregarCliente(new Cliente("Maria","Gonzales Murga", 778879332));
        tienda.agregarCliente(new Cliente("Ivan","Martel Gim", 778871032));
        System.out.println("Nombre de Tienda: "+tienda.getNombre()+" Direccion: "+tienda.getDireccion());

        for(Cliente cliente: tienda.mostrarPost()) {

            System.out.println(" "+cliente.getNombres()+", "+cliente.getApellidos()+", "+cliente.getDni());

        }
    }
}
