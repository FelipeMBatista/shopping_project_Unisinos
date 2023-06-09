public class Cosmetico extends Loja {
    private double taxaComercializacao;
    public Cosmetico(
            String nome,
            int quantidadeFuncionarios,
            double salarioBaseFuncionario,
            Endereco endereco,
            Data dataFundacao,
            double taxaComercializacao,
            int qtdProdutos
    ) {
        super(nome, quantidadeFuncionarios, salarioBaseFuncionario, endereco, dataFundacao, qtdProdutos);
        this.taxaComercializacao = taxaComercializacao;
    }

    public Cosmetico(
            String nome,
            int quantidadeFuncionarios,
            Endereco endereco,
            Data dataFundacao,
            double taxaComercializacao,
            int qtdProdutos
    ) {
        super(nome, quantidadeFuncionarios, endereco, dataFundacao, qtdProdutos);
        this.taxaComercializacao = taxaComercializacao;
    }

    public double getTaxaComercializacao() {
        return this.taxaComercializacao;
    }
    public void setTaxaComercializacao(double taxaComercializacao) {
        this.taxaComercializacao = taxaComercializacao;
    }

    public String toString() {
        return "INFORMAÇÕES DA LOJA:\n" +
                "\nNome: " + getNome() +
                "\nQuantidade de funcionários: " + getQuantidadeFuncionarios() +
                "\nSalário base dos funcionários: " + getSalarioBaseFuncionario() +
                "\nTaxa de comercialização da loja: " + this.taxaComercializacao + " %" +
                "\n\n" + getEndereco().toString() +
                "\n\nDATA DE FUNDAÇÃO\n" + getDataFundacao().toString();
    }
}