class Factory {
    /**
     * Devuelve producto del tipo de la Interface
     *
     * @param type 1: palet, 2: carton, 3: madera
     * @return instancia de un objeto de tipo Transporte
     */
    public static IComun getTransporte(String tipo) {
        if (tipo.equalsIgnoreCase("Camion")) {
            return new Camion();
        } else if (tipo.equalsIgnoreCase("Bicicleta")) {
            return new Bicicleta();
        }
        return null;
    }
}
