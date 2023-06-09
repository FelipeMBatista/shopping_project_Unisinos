public class Shopping {
    private String nome;
    private Endereco endereco;
    private Loja[] lojas;

    // Construtor
    public Shopping(String nome, Endereco endereco, int quantidadeMaximaLojas) {
        this.nome = nome;
        this.endereco = endereco;
        this.lojas = new Loja[quantidadeMaximaLojas];
    }

    // Getters e Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public Loja[] getLojas() {
        return lojas;
    }

    public void setLojas(Loja[] lojas) {
        this.lojas = lojas;
    }

    // To String
    public String toString() {
        String infoShopping = "INFORMAÇÕES DO SHOPPING:\n" +
                "\nNome: " + this.nome +
                "\nEndereço: " + endereco.toString() +
                "\n\nLojas: ";

        for (int i = 0; i < lojas.length; i++) {
            if (lojas[i] != null) {
                infoShopping += "\n- LOJA " + (i + 1) + ":\n" +
                        lojas[i].toString() + "\n--------------\n";
            }
        }

        return infoShopping;
    }

    // Inserir novas lojas
    public boolean insereLoja(Loja loja) {

        // Encontrar o primeiro espaço nulo
        int indexNull = 0;
        for (int i = 0; i < this.lojas.length; i++) {
            if (this.lojas[i] == null) {
                indexNull = i;
                break;
            }
        }

        // Se foi encontrado um espaço nulo, adiciona a loja
        if (this.lojas[indexNull] == null) {
            this.lojas[indexNull] = loja;
            return true;
        } else {
            return false;
        }
    }

    // Remover loja
    public boolean removeLoja(String nomeLoja) {

        boolean lojaExcluida = false;

        for (int i = 0; i < this.lojas.length; i++) {
            Loja loja = this.lojas[i];
            if (loja != null && loja.getNome().equals(nomeLoja)) {
                this.lojas[i] = null;
                lojaExcluida = true;
                break;
            }
        }

        return lojaExcluida;
    }

    // Retornar quantidade de lojas do tipo solicitado
    public int quantidadeLojasPorTipo(String tipo) {
        String[] tipos = {"Alimentacao", "Bijuteria", "Cosmetico", "Informatica", "Vestuario"};
        String tipoIniciais = tipo.substring(0,3);

        // Verificar se o tipo inserido é válido
        boolean existeTipo = false;
        for (String t : tipos) {
            if (tipoIniciais.equalsIgnoreCase(t.substring(0,3))) {
                existeTipo = true;
                break;
            }
        }

        // contar a quantidade
        int quantidade = 0;

        if (existeTipo) {
            for (Loja loja : lojas) { // Caminha entre todas as posições das strings
                if (loja != null) { // Ela nao pode ser nula (Para funcionar o getClass())
                    // Transforma o tipo de instancia em uma string.
                    // Substring utilizado para pegar apenas as 3 primeiras letras.
                    String tipoLoja = String.valueOf(loja.getClass()).split(" ")[1].substring(0,3);
                    if (tipoLoja.equalsIgnoreCase(tipoIniciais)) {
                        quantidade += 1; // Caso o tipo da loja seja o mesmo do tipo solicitado, ele soma 1
                    }
                }
            }
        } else {
            quantidade = -1;
        }

        return quantidade;
    }

    // Retornar a loja de informática que paga o maior valor de seguro
    public Informatica lojaSeguroMaisCaro() {
        Informatica lojaMaiorSeguro = null;
        double maiorSeguro = 0.0;

        for (Loja loja : lojas) {
            if (loja instanceof Informatica informatica) {
                double seguroEletronicos = informatica.getSeguroEletronicos();

                if (seguroEletronicos > maiorSeguro){
                    maiorSeguro = seguroEletronicos;
                    lojaMaiorSeguro = informatica;
                }
            }
        }
        return lojaMaiorSeguro;
    }
}
