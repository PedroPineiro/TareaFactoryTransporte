class Bicicleta implements IComun {
    @Override
    public float costeTotal(int cp) {
        return cp * 0.02f;
    }

    @Override
    public int tipoEmbalaje(float x, float y, float z, float peso) {
        if (peso < 5 && x < 50 && y < 50 && z < 50) {
            return 2; // Caja de madera
        } else {
            return 1; // Envoltorio cartón
        }
    }
}