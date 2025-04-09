public class Registro {

    private String titulo;
    private String autor;
    private int paginas;
    private int estoque;

    public Registro(String titulo, String autor, int paginas, int estoque){
        this.titulo = titulo;
        this.autor = autor;
        this.paginas = paginas;
        this.estoque = estoque;
    }

    public String getTitulo(){
        return titulo;
    }
    public void setTitulo(){
        this.titulo = titulo;
    }
    public String getAutor(){
        return autor;
    }
    public void setAutor(){
        this.autor = autor;
    }
    public int getPaginas(){
        return paginas;
    }
    public void setPaginas(){
        this.paginas = paginas;
    }

    public int getEstoque(){
        return estoque;
    }
    public void setEstoque(int estoque){
        this.estoque = estoque;
    }

    public void imprimirLivro(){
        System.out.println("Nome do livro: " + getTitulo());
        System.out.println("Nome do autor: " + getAutor());
        System.out.println("Número de páginas: " + getPaginas());
        System.out.println("Número em estoque: " + getEstoque());
    }




}
