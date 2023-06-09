public class Loja {
    private String nome;
    private int quantidadeFuncionarios;
    private double salarioBaseFuncionario;
    // Atributos objetos
    private Endereco endereco;
    private Data dataFundacao;
    private Produto[] estoqueProdutos;

    // Construtores
    public Loja(String nome,
                int quantidadeFuncionarios,
                double salarioBaseFuncionario,
                Endereco endereco,
                Data dataFundacao,
                int qtdProdutos) {
        this.nome = nome;
        this.quantidadeFuncionarios = quantidadeFuncionarios;
        this.salarioBaseFuncionario = salarioBaseFuncionario;
        // Atribuição dos objetos
        this.endereco = endereco;
        this.dataFundacao = dataFundacao;
        // Criação da array
        this.estoqueProdutos = new Produto[qtdProdutos];
    }

    public Loja(String nome,
                int quantidadeFuncionarios,
                Endereco endereco,
                Data dataFundacao,
                int qtdProdutos) {
        this.nome = nome;
        this.quantidadeFuncionarios = quantidadeFuncionarios;
        this.salarioBaseFuncionario = -1.0;
        // Atribuição dos objetos
        this.endereco = endereco;
        this.dataFundacao = dataFundacao;
        // Criação da array
        this.estoqueProdutos = new Produto[qtdProdutos];
    }

    // Métodos de acesso

    // Nome
    public String getNome() {
        return this.nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    // Quantidade de funcionários
    public int getQuantidadeFuncionarios() {
        return this.quantidadeFuncionarios;
    }
    public void setQuantidadeFuncionarios(int quantidadeFuncionarios) {
        this.quantidadeFuncionarios = quantidadeFuncionarios;
    }

    // Salário base
    public double getSalarioBaseFuncionario() {
        return this.salarioBaseFuncionario;
    }
    public void setSalarioBaseFuncionario(double salarioBaseFuncionario) {
        this.salarioBaseFuncionario = salarioBaseFuncionario;
    }

    // Endereço
    public Endereco getEndereco() {
        return this.endereco;
    }
    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    // Data de fundação
    public Data getDataFundacao() {
        return this.dataFundacao;
    }
    public void setDataFundacao(Data dataFundacao) {
        this.dataFundacao = dataFundacao;
    }

    // Array Produto[]
    public Produto[] getEstoqueProdutos() {
        return estoqueProdutos;
    }
    public void setEstoqueProdutos(Produto[] estoqueProdutos) {
        this.estoqueProdutos = estoqueProdutos;
    }


    // Retornar uma string
    public String toString() {
        String infoLoja = "INFORMAÇÕES DA LOJA:\n" +
                "\nNome: " + this.nome +
                "\nQuantidade de funcionários: " + this.quantidadeFuncionarios +
                "\nSalário base dos funcionários: " + this.salarioBaseFuncionario +
                "\n\n" + this.endereco.toString() +
                "\n\nDATA DE FUNDAÇÃO\n" + this.dataFundacao.toString();

        String infoEstoque;
        if (estoqueProdutos == null || estoqueProdutos.length == 0) {
            infoEstoque = "\n\nESTOQUE DE PRODUTOS:\nO estoque está vazio.";
        } else {
            String produtos = "\n\nESTOQUE DE PRODUTOS:";
            for (Produto produto : estoqueProdutos) {
                if (produto != null) {
                    produtos += "\n" + produto.getNome();
                }
            }
            infoEstoque = produtos;
        }

        return infoLoja + infoEstoque;
    }

    // Gastos com salário
    public double gastosComSalario() {
        if (this.salarioBaseFuncionario < 0) {
            return this.salarioBaseFuncionario;
        } else {
            return this.salarioBaseFuncionario * this.quantidadeFuncionarios;
        }
    }

    // Tamanho da loja
    public char tamanhoDaLoja() {
        if (this.quantidadeFuncionarios < 10) {
            return 'P';
        } else if (this.quantidadeFuncionarios <= 30) {
            return 'M';
        } else {
            return 'G';
        }
    }

    // Impressão da informação de todos os produtos da loja
    public void imprimeProdutos(){
        String cabecalho = "PRODUTOS\n\n";
        String corpoMsg = "";
        for (Produto produto : estoqueProdutos) {
            if (produto != null) {
                corpoMsg += produto.toString() + "\n----------------------------\n";
            }
        }

        System.out.println(cabecalho + corpoMsg);
    }

    // Inserir produto
    public boolean insereProduto(Produto produto) {

        // Encontrar o primeiro espaço nulo
        int indexNull = 0;
        for (int i = 0; i < this.estoqueProdutos.length; i++) {
            if (this.estoqueProdutos[i] == null) {
                indexNull = i;
                break; // Interrompe o looping assim que encontra o primeiro null
            }
        }

        // Se foi encontrado um espaço nulo, adiciona o produto
        if (this.estoqueProdutos[indexNull] == null) {
            this.estoqueProdutos[indexNull] = produto; // Adiciona o produto ao estoque
            return true;
        } else {
            return false;
        }
    }

    // Método para remover um produto do estoque
    public boolean removeProduto(String nomeProduto) {

        boolean produtoExcluido = false; // Variável que pré define a exclusão

        for (int i = 0; i < this.estoqueProdutos.length; i++) {
            Produto produto = this.estoqueProdutos[i]; // Variável para segurar o produto (Poupar escrita)
            if (produto != null && produto.getNome().equals(nomeProduto)) {
                this.estoqueProdutos[i] = null; // Remove o produto definindo a posição como nula
                produtoExcluido = true; // Muda a variável que define a exclusão do produto para true
                break;
            }
        }

        return produtoExcluido; // Retorna o sucesso da exclusão do produto
    }
}
