package udla.dmolina.abstraccion.modelo;

import java.util.ArrayList;
import java.util.List;

public class Libro{
    private List<Hoja> paginas;
    private Persona autor;
    private String titulo;
    private Genero genero;

    public Libro(Persona autor, String titulo, Genero genero) {
        this.autor = autor;
        this.titulo = titulo;
        this.genero = genero;
        this.paginas = new ArrayList<>();
    }

    public Libro addPagina(Hoja pagina){
        paginas.add(pagina);
        return this;
    }


    public String imprimir(){
        StringBuilder sb = new StringBuilder("titulo:");
        sb.append(this.titulo).append("\n")
                .append("autor: ").append(this.autor).append("\n");
        for(Hoja pag: this.paginas){
            sb.append(pag.imprimir()).append("\n");
        }
        return sb.toString();
    }


}
