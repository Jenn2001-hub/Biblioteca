public class Libro extends MaterialBibliografico {

    private int numeroPaginas;
    private String autor;

    public Libro(String titulo, int anio, int numeroPaginas, String autor, String genero) {
        super(titulo, anio, genero);
        this.numeroPaginas = numeroPaginas;
        this.autor = autor;
    }

    public int getNumeroPaginas() {
        return numeroPaginas;
    }

    public void setNumeroPaginas(int numeroPaginas) {
        if(numeroPaginas > 0){
            this.numeroPaginas = numeroPaginas;
        }
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        if(autor != null && !autor.isEmpty()){
            this.autor = autor;
        }
    }


    @Override
    public double calcularMulta(int diasRetraso) {

        if(diasRetraso <= 0){
            return 0;
        }

        return diasRetraso * 5000;
    }

    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("Tipo: Libro");
        System.out.println("Autor: " + autor);
        System.out.println("Paginas: " + numeroPaginas);
    }
}