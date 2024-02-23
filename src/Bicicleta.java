
class Bicicleta implements IComun {
    /**
     * Clase que representa una bicicleta
     */

    @Override
    public float costeTotal(int cp) {
        return cp * 0.02f;
    }
    /**
     * tipoEmbalaje(Float x, Float y, Float z, Float peso): Integer
     * Recibe dimensiones y peso
     * Devuelve tipo de embalaje (que es un entero)
     * 0 - palet
     * 1 - envoltorio cartón
     * 2 - caja de madera
     */

    @Override
    public int tipoEmbalaje(float x, float y, float z, float peso) {
        if (peso < 5 && x < 50 && y < 50 && z < 50) {
            return 2; // Caja de madera
        } else {
            return 1; // Envoltorio cartón
        }
    }
}