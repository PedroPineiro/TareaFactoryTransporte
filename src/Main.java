/**
 * @version 1.0, 23/02/2024
 * @autor pedropineiro
 */
public class Main {
    public static void main(String[] args) {
        IComun camion = Factory.getTransporte("Camion");

        int codigoPostal = 28001;
        float costeCamion = camion.costeTotal(codigoPostal);
        System.out.println("Coste total para camión: " + costeCamion);

        float x = 80, y = 80, z = 80, peso = 60;
        int tipoEmbalajeCamion = camion.tipoEmbalaje(x, y, z, peso);
        System.out.println("Tipo de embalaje para camión: " + tipoEmbalajeCamion);

        IComun bicicleta = Factory.getTransporte("Bicicleta");

        float costeBicicleta = bicicleta.costeTotal(codigoPostal);
        System.out.println("Coste total para bicicleta: " + costeBicicleta);

        peso = 3;
        int tipoEmbalajeBicicleta = bicicleta.tipoEmbalaje(x, y, z, peso);
        System.out.println("Tipo de embalaje para bicicleta: " + tipoEmbalajeBicicleta);
    }
}