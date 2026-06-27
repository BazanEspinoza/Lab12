public class LaptopProfesional extends LaptopFactory implements Laptop {
    private String marcaModelo;
    private int anoFabricacion;
    private String tipoProcesador;
    private int tamanoPantalla;

    public LaptopProfesional() {
        this.marcaModelo = "Mackbook Pro";
        this.anoFabricacion = 2022;
        this.tipoProcesador = "Apple Silicon M2";
        this.tamanoPantalla = 16;
    }

    @Override
    public void ejecutarPrueba() {
        System.out.println("Corriendo programas en una Laptop profesional");
        System.out.println("Laptop para profesional");
        System.out.println("Marca y modelo: " + marcaModelo);
        System.out.println("Año de fabricacion: " + anoFabricacion);
        System.out.println("Procesador: " + tipoProcesador);
        System.out.println("Tamaño de pantalla: " + tamanoPantalla);
    }

    public String getMarcaModelo() {
        return marcaModelo;
    }

    public void setMarcaModelo(String marcaModelo) {
        this.marcaModelo = marcaModelo;
    }

    public int getAnoFabricacion() {
        return anoFabricacion;
    }

    public void setAnoFabricacion(int anoFabricacion) {
        this.anoFabricacion = anoFabricacion;
    }

    public String getTipoProcesador() {
        return tipoProcesador;
    }

    public void setTipoProcesador(String tipoProcesador) {
        this.tipoProcesador = tipoProcesador;
    }

    public int getTamanoPantalla() {
        return tamanoPantalla;
    }

    public void setTamanoPantalla(int tamanoPantalla) {
        this.tamanoPantalla = tamanoPantalla;
    }
}
