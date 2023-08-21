public class Yate extends Embarcacion {
    private double cantidadDeCamarotes;

    public Yate(Capitan capitan, double valorAdicional, double precioBase, double anoDeFabricacion, double eslora, double cantidadDeCamarotes) {
        super(capitan, valorAdicional, precioBase, anoDeFabricacion, eslora);
        this.cantidadDeCamarotes = cantidadDeCamarotes;
    }
    public String Lujoso(){
        if (cantidadDeCamarotes>7){
            return  "SI";
        }
        else {
            return "NO";
        }
    }
}
