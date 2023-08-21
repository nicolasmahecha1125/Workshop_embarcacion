public class Velero extends  Embarcacion{
    private double cantidadMastiles;

    public Velero(Capitan capitan, double valorAdicional, double precioBase, double anoDeFabricacion, double eslora, double cantidadMastiles) {
        super(capitan, valorAdicional, precioBase, anoDeFabricacion, eslora);
        this.cantidadMastiles = cantidadMastiles;
    }
    public String Grande(){
        if(cantidadMastiles>4){
            return "Si";
        }
        else{
            return "No";
        }
    }
}
