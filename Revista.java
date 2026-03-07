public class Revista extends MaterialBibliografico {

    private int numeroEdicion;

    public Revista(String titulo, int anio, String genero, int numeroEdicion) {
        super(titulo, anio, genero);
        this.numeroEdicion = numeroEdicion;
    }

    @Override
    public double calcularMulta(int diasRetraso) {

        if(diasRetraso <= 0)
            return 0;

        return diasRetraso * 3000;
    }

    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("Tipo: Revista");
        System.out.println("Edicion: " + numeroEdicion);
    }
}