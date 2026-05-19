import java.time.LocalDate;

public class pagamento {
    private double valor;
    private String formaPagamento;
    private String status;

    // Construtor
    public pagamento(double valor, String formaPagamento, String status) {
        this.valor = valor;
        this.formaPagamento = formaPagamento;
        this.status = status;
    }

    // Getters e Setters
    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getFormaPagamento() {
        return formaPagamento;
    }

    public void setFormaPagamento(String formaPagamento) {
        this.formaPagamento = formaPagamento;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}