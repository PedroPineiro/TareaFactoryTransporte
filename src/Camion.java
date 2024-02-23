class Camion implements IComun {
    /**
     * Método que muestra el coste total del producto.
     *
     * @param cp Código postal.
     *           return Float
     */
    @Override
    public float costeTotal(int cp) {
        return cp * 0.05f;
    }
    /**
     * Método que muestra la distancia real basada en el código postal
     * @param cp Código postal
     * @return Integer
     */

    @Override
    public int tipoEmbalaje(float x, float y, float z, float peso) {
        if (peso > 50 || x > 100 || y > 100 || z > 100) {
            return 0; // Palet
        } else {
            return 1; // Envoltorio cartón
        }
    }
}