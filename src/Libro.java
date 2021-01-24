public class Libro
{
    private String titulo;
    private String autor;
    private String dueño;
    private String poseedor;

    public void prestamo(String persona)
    {
        this.setPoseedor(persona);
    }

    public void setPoseedor(String p)
    {
        this.poseedor = p;
    }

    public String getPoseedor()
    {
        return poseedor;
    }

    public void devolucion()
    {
        this.setPoseedor(this.getDueño());
    }

    public String getDueño()
    {
        return dueño;
    }

    public String tostring()
    {
        return getTitulo() + ", "getAutor() + ", " getDueño() + ", " + getPoseedor();
    }

}
