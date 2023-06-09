public class Endereco {
    private String nomeRua;
    private String cidade;
    private String estado;
    private String pais;
    private String cep;
    private String numero;
    private String complemento;

    // Construtor
    public Endereco(String nomeRua,
                    String cidade,
                    String estado,
                    String pais,
                    String cep,
                    String numero,
                    String complemento) {
        this.nomeRua = nomeRua;
        this.cidade = cidade;
        this.estado = estado;
        this.pais = pais;
        this.cep = cep;
        this.numero = numero;
        this.complemento = complemento;
    }

    // Métodos de acesso

    // Nome da rua
    public String getNomeDaRua() {
        return this.nomeRua;
    }
    public void setNomeDaRua(String nomeRua) {
        this.nomeRua = nomeRua;
    }

    // Cidade
    public String getCidade() {
        return this.cidade;
    }
    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    // Estado
    public String getEstado() {
        return this.estado;
    }
    public void setEstado(String estado) {
        this.estado = estado;
    }

    // País
    public String getPais() {
        return this.pais;
    }
    public void setPais(String pais) {
        this.pais = pais;
    }

    // CEP
    public String getCep() {
        return this.cep;
    }
    public void setCep(String cep) {
        this.cep = cep;
    }

    // Número
    public String getNumero() {
        return this.numero;
    }
    public void setNumero(String numero) {
        this.numero = numero;
    }

    // Complemento
    public String getComplemento() {
        return this.complemento;
    }
    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    // Retornar uma string
    public String toString() {
        return "INFORMAÇÕES DO ENDEREÇO:\n" +
                "\nRua: " + this.nomeRua +
                "\nCidade: " + this.cidade +
                "\nEstado: " + this.estado +
                "\nPaís: " + this.pais +
                "\nCEP: " + this.cep +
                "\nNúmero: " + this.numero +
                "\nComplemento: " + this.complemento;
    }
}
