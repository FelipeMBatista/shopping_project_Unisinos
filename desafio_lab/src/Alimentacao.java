public class Alimentacao extends Loja {
    private Data dataAlvara;
    public Alimentacao(
            String nome,
            int quantidadeFuncionarios,
            double salarioBaseFuncionario,
            Endereco endereco,
            Data dataFundacao,
            Data dataAlvara,
            int qtdProdutos
    ) {
        super(nome, quantidadeFuncionarios, salarioBaseFuncionario, endereco, dataFundacao, qtdProdutos);
        this.dataAlvara = dataAlvara;
    }

    public Alimentacao(
            String nome,
            int quantidadeFuncionarios,
            Endereco endereco,
            Data dataFundacao,
            Data dataAlvara,
            int qtdProdutos
    ) {
        super(nome, quantidadeFuncionarios, endereco, dataFundacao, qtdProdutos);
        this.dataAlvara = dataAlvara;
    }

    public Data getDataAlvara() {
        return this.dataAlvara;
    }
    public void setDataAlvara(Data dataAlvara) {
        this.dataAlvara = dataAlvara;
    }

    public String toString() {
        return "INFORMAÇÕES DA LOJA:\n" +
                "\nNome: " + getNome() +
                "\nQuantidade de funcionários: " + getQuantidadeFuncionarios() +
                "\nSalário base dos funcionários: " + getSalarioBaseFuncionario() +
                "\nData do Alvará: " + this.dataAlvara +
                "\n\n" + getEndereco().toString() +
                "\n\nDATA DE FUNDAÇÃO\n" + getDataFundacao().toString();
    }
}