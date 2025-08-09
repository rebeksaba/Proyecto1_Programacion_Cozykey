package cozykey.app;

import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        System.out.println("Bienvenid@s a Cozykey!");

        //Datos clientes
        Cliente cliente1 = new Cliente(1, "Francisco Sánchez", "11579634W","francsamon@gmail.es", "688733622544", "C/ Parque 21, Madrid");
        Cliente cliente2 = new Cliente(2, "Julia Bautista", "46228579T","juliabaut@gmail.es", "6644771159866", "C/ Conde 88 1ºC, Burgos");
        Cliente cliente3 = new Cliente(3, "Mustapha Ouichou", "Y50994753D","mustapha@gmail.es", "609906606244", "Urbanización Frias 17, Torrelavega");
        Cliente cliente4 = new Cliente(4, "Miguel García", "13345579J","miguel@gmail.es", "655000942881", "C/ Constitución nº3, Cádiz");
        Cliente cliente5 = new Cliente(5, "Rebeca Sánchez", "50067449F","rebeca@gmail.es", "6117717554322", "C/ Guatemala 17, Talamanca");

        //Mostrar clientes
        System.out.println("\nClientes registrados:");
        System.out.println(cliente1);
        System.out.println(cliente2);
        System.out.println(cliente3);
        System.out.println(cliente4);
        System.out.println(cliente5);

    }
}
