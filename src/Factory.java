class Factory {
    // Método para obtener instancia de transporte
    public static IComun getTransporte(String tipo) {
        if (tipo.equalsIgnoreCase("Camion")) {
            return new Camion();
        } else if (tipo.equalsIgnoreCase("Bicicleta")) {
            return new Bicicleta();
        }
        return null;
    }
}
