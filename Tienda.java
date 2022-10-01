package Ejercicio;

public class Tienda {
    private String nombre;
    private String direccion;
    private  Cliente cliente[];
    private Integer contadorCli;

    public Tienda(){
        this.cliente = new Cliente[4];

        this.contadorCli = 0;
    }
    public void agregarCliente(Cliente cliente)
    {
        this.cliente[contadorCli++] = cliente;
    }

    public Cliente[] mostrarPost()
    {
        return this.cliente;
    }
    public String getNombre(){
        return nombre;
    }
    public void setNombre(String nombre){
        this.nombre= nombre;
    }
    public String getDireccion(){
        return direccion;
    }
    public void setDireccion(String direccion){
        this.direccion= direccion;
    }
}
