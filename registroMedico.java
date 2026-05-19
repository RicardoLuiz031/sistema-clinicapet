import java.time.LocalDate;

public abstract class registroMedico {
    private LocalDate data;
    private String descricao;

    public registroMedico(String descricao, LocalDate data){
        this.data=data;
        this.descricao = descricao;

    }
    public abstract void exibirDetalhes();

    public String getDescricao(){return descricao;}

    public void setDescricao(String descricao) {this.descricao = descricao;}

    public LocalDate getData() {return data;}

    public void setData(LocalDate data) { this.data = data;}

}
