public class Informatica extends Loja {
    private double seguroEletronicos;
    public Informatica(String nome,
                       int quantidadeFuncionarios,
                       double salarioBaseFuncionario,
                       Endereco endereco,
                       Data dataFundacao,
                       double seguroEletronicos,
                       int qtdProdutos) {
        super(nome, quantidadeFuncionarios, salarioBaseFuncionario, endereco, dataFundacao, qtdProdutos);
        this.seguroEletronicos = seguroEletronicos;
    }

    public Informatica(String nome,
                       int quantidadeFuncionarios,
                       Endereco endereco,
                       Data dataFundacao,
                       double seguroEletronicos,
                       int qtdProdutos) {
        super(nome, quantidadeFuncionarios, endereco, dataFundacao, qtdProdutos);
        this.seguroEletronicos = seguroEletronicos;
    }

    public double getSeguroEletronicos() {
        return this.seguroEletronicos;
    }
    public void setSeguroEletronicos(double seguroEletronicos) {
        this.seguroEletronicos = seguroEletronicos;
    }

    public String toString() {
        return "INFORMAÇÕES DA LOJA:\n" +
                "\nNome: " + getNome() +
                "\nQuantidade de funcionários: " + getQuantidadeFuncionarios() +
                "\nSalário base dos funcionários: " + getSalarioBaseFuncionario() +
                "\nValor do seguro: R$ " + this.seguroEletronicos +
                "\n\n" + getEndereco().toString() +
                "\n\nDATA DE FUNDAÇÃO\n" + getDataFundacao().toString();
    }
}
