public class LaptopGamer extends LaptopFactory implements Laptop {
    private String marcaModelo;
    private int anoFabricacion;
    private String tipoProcesador;
    private int tamanoPantalla;

    public LaptopGamer() {
        this.marcaModelo = "Mackbook air";
        this.anoFabricacion = 2017;
        this.tipoProcesador = "Silicon M1";
        this.tamanoPantalla = 13;
    }

    @Override
    public void ejecutarPrueba() {
        System.out.println("Corriendo programas en una laptop gamer");
        System.out.println("Laptop Gamer");
        System.out.println("Marca y Modelo: " + marcaModelo);
        System.out.println("Año de Fabricacion: " + anoFabricacion);
        System.out.println("Procesador: " + tipoProcesador);
        System.out.println("Tamaño de la Pantalla: " + tamanoPantalla);
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
