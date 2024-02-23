class Camion implements IComun {
    @Override
    public float costeTotal(int cp) {
        return cp * 0.05f;
    }

    @Override
    public int tipoEmbalaje(float x, float y, float z, float peso) {
        if (peso > 50 || x > 100 || y > 100 || z > 100) {
            return 0; // Palet
        } else {
            return 1; // Envoltorio cartón
        }
    }
}