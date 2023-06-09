public class Main {
    public static void main(String[] args) {
        // Criando um endereço para o Shopping
        Endereco endShopping = new Endereco(
                "Rua",
                "Cidade",
                "Estado",
                "Pais",
                "CEP",
                "Numero",
                "Complemento"
        );
        // Testes métodos GET | Endereco
        System.out.println(endShopping.getNomeDaRua().equals("Rua") && endShopping.getCidade().equals("Cidade")
                && endShopping.getEstado().equals("Estado") && endShopping.getPais().equals("Pais") &&
                endShopping.getCep().equals("CEP") && endShopping.getNumero().equals("Numero") &&
                endShopping.getComplemento().equals("Complemento") ?
                "GETTERS ENDEREÇO | OK\n" : "GETTERS ENDEREÇO | ERRO\n");

        // Teste métodos SET | Endereco
        endShopping.setNomeDaRua("Rua 1");
        endShopping.setCidade("São Francisco de Paula");
        endShopping.setEstado("RS");
        endShopping.setPais("Brasil");
        endShopping.setCep("95400-000");
        endShopping.setNumero("50");
        endShopping.setComplemento("Shopping SFP");

        // Teste ToString e validação dos Setters | Endereco
        System.out.println("--------------\n" + "ToString Shopping\n");
        System.out.println(endShopping.toString() + "\n--------------\n");

        // -----------------------------------------------------------------------------------------------------------//

        // Criando uma instância de Data para testes
        Data dataShopping = new Data(23, 8, 2011);

        // Testes métodos GET | Data
        System.out.println(dataShopping.getDia() == 23 && dataShopping.getMes() == 8 && dataShopping.getAno() == 2011 ?
                "GETTERS DATA | OK\n" : "GETTERS PRODUTO | ERRO\n");

        // Testes métodos SET | Data
        dataShopping.setDia(20);
        dataShopping.setMes(7);
        dataShopping.setAno(2007);

        // Teste ToString e validação dos Setters | Data
        System.out.println("--------------\n" + "ToString Data\n");
        System.out.println(dataShopping.toString() + "\n--------------\n");

        // Teste método Ano Bissexto | Data
        System.out.println(dataShopping.verificaAnoBissexto() ?
                "É BISSEXTO | OK \n" : "NÃO É BISSEXTO | OK \n"); // Nesse caso não é bissexto

        dataShopping.setAno(2020);
        System.out.println(dataShopping.verificaAnoBissexto() ?
                "É BISSEXTO | OK \n" : "NÃO É BISSEXTO | OK \n"); // Nesse caso é bissexto

        // -----------------------------------------------------------------------------------------------------------//

        // Produtos da "Loja de Basquete" e seus testes
        Produto produto1 = new Produto(
                "Regata Denver Nuggets",
                750.00,
                new Data(10, 7, 2023)
        );
        Produto produto2 = new Produto(
                "A definir",
                0.0,
                new Data(1, 1, 2000)
        );

        // Testes métodos GET (Válido também para classe Data) | Produto
        System.out.println(produto1.getNome().equals("Regata Denver Nuggets") && produto1.getPreco() == 750.00 &&
                produto1.getDataValidade().getDia() == 10 && produto1.getDataValidade().getMes() == 7 &&
                produto1.getDataValidade().getAno() == 2023 ?
                "GETTERS PRODUTO | OK\n" : "GETTERS PRODUTO | ERRO\n");

        // Testes métodos SET | Produto
        produto2.setNome("Regata Miami Heat");
        produto2.setPreco(700.00);
        produto2.setDataValidade(new Data(10, 7, 2023));

        // Teste ToString e validação dos Setters | Produto
        System.out.println("--------------\n" + "ToString Produto\n");
        System.out.println(produto2.toString() + "\n--------------\n");

        // Teste classe Esta Vencido
        System.out.println(produto2.estaVencido(new Data(10, 8, 2023)) ?
                "ESTÁ VENCIDO | OK \n" : "NÃO ESTÁ VENCIDO | OK \n");

        // --------------------------------------//

        // Criando uma loja de cada categoria e adicionando seus respectivos produtos
        // Loja

        Endereco endLoja1 = new Endereco("Rua 1", "São Francisco de Paula", "RS", "Brasil",
                "95400-000", "50", "Sala 1"
        );

        Loja loja = new Loja(
                "Loja de Basquete",
                3,
                2500.00,
                endLoja1,
                new Data(12, 11, 2011),
                2
        );

        // Teste geral classe Loja
        System.out.println(loja.getNome().equals("Loja de Basquete") && loja.getQuantidadeFuncionarios() == 3 &&
                loja.getSalarioBaseFuncionario() == 2500.00 ? // Endereco e Data já testados
                "GETTERS LOJA | OK\n" : "GETTERS LOJA | ERRO\n");

        // Testes métodos SET | Loja
        loja.setNome("Basket Store");
        loja.setQuantidadeFuncionarios(4);
        loja.setSalarioBaseFuncionario(2600.00);
        loja.setDataFundacao(new Data(12, 9,2011));

        // Teste do método insereProduto | Loja
        loja.insereProduto(produto1);
        loja.insereProduto(produto2);

        // Teste ToString, validação dos Setters e método insereProduto | Loja
        System.out.println("\n--------------\n" + "ToString Loja\n");
        System.out.println(loja.toString() + "\n--------------\n");

        // Teste método Gastos com Salário | Loja
        System.out.println(loja.gastosComSalario() == 10400.00 | loja.gastosComSalario() == -1 ?
                "GASTOS COM SALARIO | OK\n" : "GASTOS COM SALARIO | ERRO\n"); // Depende do construtor (Fazer teste)

        // Teste método Tamanho Loja | Loja
        System.out.println("TAMANHO DA LOJA: " + loja.tamanhoDaLoja() + "\n");

        // Teste método Imprime Produto | Loja
        System.out.println("--------------\n" + "Imprime Produto Loja\n");
        loja.imprimeProdutos();

        // Teste método Remove Produto | Loja
        System.out.println(loja.removeProduto("Regata Denver Nuggets") ?
                "REMOVE PRODUTO | OK\n" : "REMOVE PRODUTO | ERRO\n");

        // --------------------------------------//

        // Alimentacao

        Endereco endLoja2 = new Endereco("Rua 1", "São Francisco de Paula", "RS", "Brasil",
                "95400-000", "50", "Sala 2"
        );

        Alimentacao alimentacao = new Alimentacao(
                "Praça 1",
                6,
                2000.00,
                endLoja2,
                new Data(6, 1, 2009),
                new Data(22, 10, 2008),
                2
        );

        // Testes métodos GET | Alimentacao
        System.out.println(alimentacao.getDataAlvara().getDia() == 22 && alimentacao.getDataAlvara().getMes() == 10 &&
                alimentacao.getDataAlvara().getAno() == 2008 ?
                "GETTERS ALIMENTACAO | OK\n" : "GETTERS ALIMENTACAO | ERRO\n");

        // Testes métodos SET | Alimentacao
        alimentacao.setDataAlvara(new Data(30, 11, 2007));

        // Teste ToString, validação dos Setters | Alimentacao
        System.out.println("--------------\n" + "ToString Alimentacao\n");
        System.out.println(alimentacao.toString() + "\n--------------\n");

        // --------------------------------------//

        // Bijuteria

        Endereco endLoja3 = new Endereco("Rua 1", "São Francisco de Paula", "RS", "Brasil",
                "95400-000", "50", "Sala 3"
        );

        Bijuteria bijuteria = new Bijuteria(
                "Loja Nova Moda",
                3,
                endLoja3,
                new Data(2, 2, 2010),
                6000.00,
                2
        );

        // Testes métodos GET | Bijuteria
        System.out.println(bijuteria.getMetaVendas() == 6000.00 ?
                "GETTERS BIJUTERIA | OK\n" : "GETTERS BIJUTERIA | ERRO\n");

        // Testes métodos SET | Bijuteria
        bijuteria.setMetaVendas(5500.50);

        // Teste ToString, validação dos Setters | Bijuteria
        System.out.println("--------------\n" + "ToString Bijuteria\n");
        System.out.println(bijuteria.toString() + "\n--------------\n");

        // --------------------------------------//

        // Cosmetico
        Endereco endLoja4 = new Endereco("Rua 1", "São Francisco de Paula", "RS", "Brasil",
                "95400-000", "50", "Sala 4"
        );

        Cosmetico cosmetico = new Cosmetico(
                "Self Care",
                2,
                3100.00,
                endLoja4,
                new Data(5, 8, 2010),
                15.2,
                2
        );

        // Testes métodos GET | Cosmetico
        System.out.println(cosmetico.getTaxaComercializacao() == 15.2 ?
                "GETTERS COSMETICO | OK\n" : "GETTERS COSMETICO | ERRO\n");

        // Testes métodos SET | Cosmetico
        cosmetico.setTaxaComercializacao(15.0);

        // Teste ToString, validação dos Setters | Cosmetico
        System.out.println("--------------\n" + "ToString Cosmetico\n");
        System.out.println(cosmetico.toString() + "\n--------------\n");

        // --------------------------------------//

        // Vestuario
        Endereco endLoja5 = new Endereco("Rua 1", "São Francisco de Paula", "RS", "Brasil",
                "95400-000", "50", "Sala 5"
        );

        Vestuario vestuario = new Vestuario(
                "Moda Sul",
                7,
                endLoja5,
                new Data(23, 9, 2012),
                false,
                2
        );

        // Testes métodos GET | Vestuario
        System.out.println(!vestuario.getProdutosImportados() ?
                "GETTERS VESTUARIO | OK\n" : "GETTERS VESTUARIO | ERRO\n");

        // Testes métodos SET | Vestuario
        vestuario.setProdutosImportados(true);

        // Teste ToString, validação dos Setters | Vestuario
        System.out.println("--------------\n" + "ToString Vestuario\n");
        System.out.println(vestuario.toString() + "\n--------------\n");

        // --------------------------------------//

        // Informatica
        Endereco endLoja6 = new Endereco("Rua 1", "São Francisco de Paula", "RS", "Brasil",
                "95400-000", "50", "Sala 6"
        );

        Informatica informatica = new Informatica(
                "Eletro Sul",
                5,
                2400.00,
                endLoja6,
                new Data(19, 7, 2011),
                2500.00,
                2
        );

        // Testes métodos GET | Informatica
        System.out.println(informatica.getSeguroEletronicos() == 2500.00 ?
                "GETTERS INFORMATICA | OK\n" : "GETTERS INFORMATICA | ERRO\n");

        // Testes métodos SET | Informatica
        informatica.setSeguroEletronicos(2650.35);

        // Teste ToString, validação dos Setters | Informatica
        System.out.println("--------------\n" + "ToString Informatica\n");
        System.out.println(informatica.toString() + "\n--------------\n");

        // -----------------------------------------------------------------------------------------------------------//

        // Criando o Shopping e mais uma loja de informática (Será necessário)
        // Loja de informatica
        Informatica informatica2 = new Informatica(
                "Loja Teste Sistema Shopping",
                2,
                endShopping,
                dataShopping,
                1000.00,
                2
        );

        // Criando Shopping
        Shopping shopping = new Shopping(
                "Shopping",
                endShopping,
                20
        );

        // Testes métodos GET | Shopping
        System.out.println(shopping.getNome().equals("Shopping") ?
                "GETTERS SHOPPING | OK\n" : "GETTERS SHOPPING | ERRO\n");
        System.out.println(shopping.getLojas() + "\n");

        // Testes métodos SET | Shopping
        shopping.setNome("Shopping SFP");

        // Inserir novas lojas | Shopping
        System.out.println(shopping.insereLoja(informatica) ?
                "INSERE LOJA | OK\n" : "INSERE LOJA | ERRO\n");
        System.out.println(shopping.insereLoja(informatica2) ?
                "INSERE LOJA | OK\n" : "INSERE LOJA | ERRO\n");
        System.out.println(shopping.insereLoja(alimentacao) ?
                "INSERE LOJA | OK\n" : "INSERE LOJA | ERRO\n");
        System.out.println(shopping.insereLoja(bijuteria) ?
                "INSERE LOJA | OK\n" : "INSERE LOJA | ERRO\n");
        System.out.println(shopping.insereLoja(cosmetico) ?
                "INSERE LOJA | OK\n" : "INSERE LOJA | ERRO\n");
        System.out.println(shopping.insereLoja(vestuario) ?
                "INSERE LOJA | OK\n" : "INSERE LOJA | ERRO\n");
        System.out.println(shopping.insereLoja(loja) ?
                "INSERE LOJA | OK\n" : "INSERE LOJA | ERRO\n");

        // Teste ToString, validação dos Setters | Shopping
        System.out.println("--------------\n" + "ToString Shopping\n");
        System.out.println(shopping.toString());

        // Teste método Remove Loja | Shopping
        System.out.println(shopping.removeLoja(loja.getNome()) ?
                "REMOVE LOJA | OK\nTeste: " : "REMOVE LOJA | ERRO\nTeste: ");

        for (int i =  0; i < shopping.getLojas().length; i++) {
            if (shopping.getLojas()[i] != null)
                System.out.print(shopping.getLojas()[i].getNome() + " - ");
        }

        // Teste Quantidade de Lojas Por Tipo | Shopping
        System.out.println("\n--------------\n\nQuantidade de lojas por tipo (Informática): " +
                shopping.quantidadeLojasPorTipo("Informática") + "\n--------------\n");

        // Teste Loja Seguro Mais Caro (Informatica) | Shopping
        System.out.println("Loja com o seugro mais caro (Informática): \n\n" +
                shopping.lojaSeguroMaisCaro());
    }
}