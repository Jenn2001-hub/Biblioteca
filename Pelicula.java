public class Pelicula extends MaterialBibliografico {

    private int duracion;

    public Pelicula(String titulo, int anio, int duracion, String genero) {
        super(titulo, anio, genero);
        this.duracion = duracion;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        if (duracion > 0) {
            this.duracion = duracion;
        }
    }

    @Override
    public double calcularMulta(int diasRetraso) {

        if (diasRetraso <= 0) {
            return 0;
        }

        return diasRetraso * 10000;
    }

    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("Tipo: Pelicula");
        System.out.println("Duracion: " + duracion + " minutos");
    }
}