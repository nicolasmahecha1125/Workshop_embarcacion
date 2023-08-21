public class Embarcacion {
    private Capitan capitan;
    private double valorAdicional;
    private double precioBase;
    private  double anoDeFabricacion;
    private double eslora;
    public Embarcacion(Capitan capitan, double valorAdicional, double precioBase,double anoDeFabricacion,double eslora){
        this.capitan = capitan;
        this.valorAdicional = valorAdicional;
        this.precioBase = precioBase;
        this.anoDeFabricacion = anoDeFabricacion;
        this.eslora = eslora;
    }
    public double calcularMontoAlquiler(){
        double montoDelAlquiler = precioBase;
        if (anoDeFabricacion > 2020){
            montoDelAlquiler += 20000;
        }
        return montoDelAlquiler;
    }
}
