public class Venda {
    private Registro livro;

    public Venda(Registro livro){
        this.livro = livro;
    }

    public void emprestimoLivro(){
        if(livro.getEstoque() > 0){
            livro.setEstoque(livro.getEstoque() - 1);
            System.out.println("Você pegou emprestado uma unidade do livro!");
        } else{
            System.out.println("Desculpe, não há unidades disponíveis para empréstimo. ");
        }
    }

}
