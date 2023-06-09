public class Vestuario extends Loja {
    private boolean produtosImportados;
    public Vestuario(String nome,
                     int quantidadeFuncionarios,
                     double salarioBaseFuncionario,
                     Endereco endereco,
                     Data dataFundacao,
                     boolean produtosImportados,
                     int qtdProdutos) {
        super(nome, quantidadeFuncionarios, salarioBaseFuncionario, endereco, dataFundacao, qtdProdutos);
        this.produtosImportados = produtosImportados;
    }

    public Vestuario(String nome,
                     int quantidadeFuncionarios,
                     Endereco endereco,
                     Data dataFundacao,
                     boolean produtosImportados,
                     int qtdProdutos) {
        super(nome, quantidadeFuncionarios, endereco, dataFundacao, qtdProdutos);
        this.produtosImportados = produtosImportados;
    }
    public boolean getProdutosImportados() {
        return this.produtosImportados;
    }
    public void setProdutosImportados(boolean produtosImportados) {
        this.produtosImportados = produtosImportados;
    }

    public String toString() {
        return "INFORMAÇÕES DA LOJA:\n" +
                "\nNome: " + getNome() +
                "\nQuantidade de funcionários: " + getQuantidadeFuncionarios() +
                "\nSalário base dos funcionários: " + getSalarioBaseFuncionario() +
                "\nImporta produtos: " + this.produtosImportados +
                "\n\n" + getEndereco().toString() +
                "\n\nDATA DE FUNDAÇÃO\n" + getDataFundacao().toString();
    }
}
