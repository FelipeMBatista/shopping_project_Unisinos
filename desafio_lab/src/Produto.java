public class Produto {
    private String nome;
    private double preco;
    // Atributo objeto
    private Data dataValidade;

    // Construtor
    public Produto(String nome, double preco, Data dataValidade) {
        this.nome = nome;
        this.preco = preco;
        // Atribuição do objeto
        this.dataValidade = dataValidade;
    }

    // Métodos de acesso

    // Nome
    public String getNome() {
        return this.nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    // Preço
    public double getPreco() {
        return this.preco;
    }
    public void setPreco(double preco) {
        this.preco = preco;
    }

    // Data de validade
    public Data getDataValidade() {
        return this.dataValidade;
    }
    public void setDataValidade(Data dataValidade) {
        this.dataValidade = dataValidade;
    }

    // Retornar uma string
    public String toString() {
        return "INFORMAÇÕES DO PRODUTO:\n" +
                "\nNome: " + this.nome +
                "\nPreço: " + this.preco +
                "\n\nData de Validade: " + this.dataValidade.toString();
    }

    // Verificar validade
    public boolean estaVencido(Data dataVerificacao) {
        if (this.dataValidade.getAno() < dataVerificacao.getAno())
            return true;
        else if (this.dataValidade.getAno() == dataVerificacao.getAno() &&
                this.dataValidade.getMes() < dataVerificacao.getMes())
            return true;
        else if (this.dataValidade.getAno() == dataVerificacao.getAno() &&
                this.dataValidade.getMes() == dataVerificacao.getMes() &&
                this.dataValidade.getDia() < dataVerificacao.getDia())
            return true;
        else
            return false;
    }
}
