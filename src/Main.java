public class Main {

    public static void main(String[] args) {

        System.out.println(Integer.toString(suma(5,6,1)));

        Coche cocheFantastico = new Coche();

        System.out.println("Este coche tiene "+Integer.toString(cocheFantastico.agregarPuerta())+" puertas");

    }

    public static int suma (int valor1, int valor2, int valor3){
        return valor1+valor2+valor3;
    }

}

