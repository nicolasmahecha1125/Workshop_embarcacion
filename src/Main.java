public class Main {
    public static void main(String[] args) {
        //crear capitan
        Capitan capitan1 = new Capitan("jorge", "marquez", "mc-1222");
        //crear velero despues del 2020
        Velero velero1 = new Velero(capitan1, 2000, 12000, 2021, 20.5, 5);
        // calcular monto de Aquiler del velero1
        double montoDelAlquilerVelero1 = velero1.calcularMontoAlquiler();
        // verficar si es grande el velero1
        String esGrandeVelero1 = velero1.Grande();
        // imprimir resultado del velero1
        System.out.println("monto de alquiler del velero1: $ " + montoDelAlquilerVelero1);
        System.out.println("el velero1 es grande: " + esGrandeVelero1);

        //crear capitan
        Capitan capitan2 = new Capitan("pedro", "sanchez", "mc-4578");
        // crear yate despues del 2020
        Yate yate1 = new Yate(capitan2, 1000, 15000, 2021, 11.2, 8);
        //calcular monto de Alquiler del yate1
        double montoDelAlquilerYate1 = yate1.calcularMontoAlquiler();
        //verificar si es de lujo el yate1
        String esLujosoYate1 = yate1.Lujoso();
        //imprimir resultado del yate1
        System.out.println("monto de alquiler del yate1: $ " + montoDelAlquilerYate1);
        System.out.println("el yate1 es lujoso: " + esLujosoYate1);

        //crear velero antes del 2020
        Velero velero2 = new Velero(capitan1, 1500, 12000, 2007, 17.5, 3);
        // calcular monto de Alquiler del velero2
        double montoDelAlquilerVelero2 = velero2.calcularMontoAlquiler();
        // verificar si es grade el velero2
        String esGrandeVelero2 = velero2.Grande();
        // imprimir resultado del velero2
        System.out.println("el monto de alquiler del velero2: $ " + montoDelAlquilerVelero2);
        System.out.println("es grande el velero2: " + esGrandeVelero2);

        //crear yate antes del 2020
        Yate yate2 = new Yate(capitan2, 500, 17000, 2007, 12.2, 6);
        //calcular monto de Alquiler del yate2
        double montoDelAlquilerYate2 = yate2.calcularMontoAlquiler();
        //verificar si es de lujo el yate2
        String esLujosoYate2 = yate2.Lujoso();
        // imprimir resultado del yate2
        System.out.println("monto de alquiler del yate2: $ " + montoDelAlquilerYate2);
        System.out.println("el yate2 es lujoso: " + esLujosoYate2);
    }
}