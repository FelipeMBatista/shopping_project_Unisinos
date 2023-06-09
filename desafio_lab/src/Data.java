public class Data {
    private int dia;
    private int mes;
    private int ano;

    // ---------------------------------------------------------------------- //

    // Construtor
    public Data(int dia, int mes, int ano) {
        // Verificando se o dia ou mês é válido
        if (dataInexistente(dia, mes)) {
            dataInvalidada();
        }
        // Verificando se o mês é Fevereiro
        else if (mes == 2) {
            validaFevereiro(dia, mes, ano);
        }
        // Se não for fevereiro, a data é validada
        else {
            dataValidada(dia, mes, ano);
        }
    }

    // ---------------------------------------------------------------------------------------------------------------//

    // Métodos para validar data e evitar repetições demais no código acima
    // Métodos utilizados apenas no construtor

    // Retorna true para a data inexistente e false para caso a data não seja inexistente
    private boolean dataInexistente(int dia, int mes) {
        if (dia < 1 || dia > 31 || mes < 1 || mes > 12) {
            return true;
        } else {
            return false;
        }
    }

    // Validação do mês de fevereiro, verificando se é bissexto ou se tem mais de 29 dias
    private void validaFevereiro(int dia, int mes, int ano) {
        if (dia > 29) {
            // Verificando se a data não é 30 ou mais. Se for, a data é invalidada
            dataInvalidada();
        }
        // Verificando se o dia é 29 e checando se o ano é bissexto
        else if (dia == 29) {
            // Se o ano for bissexto, a data é validada, caso contrário é invalidada
            if (bissexto(ano)) {
                dataValidada(dia, mes, ano);
            } else {
                dataInvalidada();
            }
        }
        // Se o dia é 28 ou menos, a data é validada
        else {
            dataValidada(dia, mes, ano);
        }
    }

    // Retorna True ou False para se o ano é bissexto
    private boolean bissexto(int ano) {
        if ( ( (ano % 4) == 0 && (ano % 100) != 0 ) || ano % 400 == 0 ) {
            return true;
        } else {
            return false;
        }
    }


    // Se a data for válida irá definir valores aos atributos da classe
    private void dataValidada(int dia, int mes, int ano) {
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }
    // Se a data for inválida irá definir valores padrões aos atributos da classe
    private void dataInvalidada() {
        System.out.println("ERRO: Data inválida!");
        this.dia =  1;
        this.mes = 1;
        this.ano = 2000;
    }

    // ---------------------------------------------------------------------------------------------------------------//

    // Métodos de acesso
    // Dia
    public int getDia() {
        return this.dia;
    }
    public void setDia(int dia) {
        this.dia = dia;
    }

    // Mês
    public int getMes() {
        return this.mes;
    }
    public void setMes(int mes) {
        this.mes = mes;
    }

    // Ano
    public int getAno() {
        return this.ano;
    }
    public void setAno(int ano) {
        this.ano = ano;
    }

    // ---------------------------------------------------------------------- //

    // Retornar uma string
    public String toString() {
        return this.dia + "/" + this.mes + "/" + this.ano;
    }

    // ---------------------------------------------------------------------- //

    public boolean verificaAnoBissexto() {
        return bissexto(this.ano);
    }
}
