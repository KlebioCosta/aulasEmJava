public class DadosCliente {
    public String nome;
    private String senha;

    private double valorEmConta;
    private double valorSacado;  //precisa verificar o saldo!!!!
    private double depositarValor;


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public double getValorEmConta() {
        return valorEmConta;
    }

    public void setValorEmConta(double valorEmConta) {
        this.valorEmConta = valorEmConta;
    }

    public double getValorSacado() {
        return valorSacado;
    }

    public void setValorSacado(double valorSacado) {
        this.valorSacado = valorSacado;
    }

    public double getDepositarValor() {
        return depositarValor;
    }

    public void setDepositarValor(double depositarValor) {
        this.depositarValor = depositarValor;
    }
}
