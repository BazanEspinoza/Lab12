public abstract class LaptopFactory {

    public static Laptop crearLaptop(String tipo) {
        Laptop laptop = null;
        switch (tipo.toLowerCase()) {
            case "gamer":
                laptop = new LaptopGamer();
                break;
            case "basica":
                laptop = new LaptopBasica();
                break;
            case "profesional":
                laptop = new LaptopProfesional();
                break;
            default:
                System.out.println("Tipo de laptop no reconocido: " + tipo);
        }
        return laptop;
    }
}

