public class Bijuteria extends Loja {
    private double metaVendas;
    public Bijuteria(String nome,
                     int quantidadeFuncionarios,
                     double salarioBaseFuncionario,
                     Endereco endereco,
                     Data dataFundacao,
                     double metaVendas,
                     int qtdProdutos) {
        super(nome, quantidadeFuncionarios, salarioBaseFuncionario, endereco, dataFundacao, qtdProdutos);
        this.metaVendas = metaVendas;
    }

    public Bijuteria(String nome,
                     int quantidadeFuncionarios,
                     Endereco endereco,
                     Data dataFundacao,
                     double metaVendas,
                     int qtdProdutos) {
        super(nome, quantidadeFuncionarios, endereco, dataFundacao, qtdProdutos);
        this.metaVendas = metaVendas;
    }

    public double getMetaVendas() {
        return this.metaVendas;
    }
    public void setMetaVendas(double metaVendas) {
        this.metaVendas = metaVendas;
    }

    public String toString() {
        return "INFORMAÇÕES DA LOJA:\n" +
                "\nNome: " + getNome() +
                "\nQuantidade de funcionários: " + getQuantidadeFuncionarios() +
                "\nSalário base dos funcionários: " + getSalarioBaseFuncionario() +
                "\nMeta de vendas: " + this.metaVendas +
                "\n\n" + getEndereco().toString() +
                "\n\nDATA DE FUNDAÇÃO\n" + getDataFundacao().toString();
    }
}
