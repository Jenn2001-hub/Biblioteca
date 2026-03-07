public abstract class MaterialBibliografico {

    private String titulo;
    private int anio;
    private String genero;

    public MaterialBibliografico(String titulo, int anio, String genero) {
        this.titulo = titulo;
        this.anio = anio;
        this.genero = genero;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        if(titulo != null && !titulo.isEmpty()){
            this.titulo = titulo;
        }
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        if(anio > 0){
            this.anio = anio;
        }
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        if(genero != null && !genero.isEmpty()){
            this.genero = genero;
        }
    }

    public abstract double calcularMulta(int diasRetraso);

    public void mostrarInformacion(){
        System.out.println("Titulo: " + titulo);
        System.out.println("Año: " + anio);
        System.out.println("Genero: " + genero);
    }
}