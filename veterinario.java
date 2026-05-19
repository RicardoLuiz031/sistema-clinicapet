
import java.time.LocalDate;

public class veterinario {
    private String nome;
    private String crmv;
    private String especialidade;

    public veterinario(String nome, String crmv, String especialidade){
        this.nome = nome;
        this.crmv = crmv;
        this.especialidade = especialidade;
}
    public String getNome() { 
        return nome; 
    }
    public void setNome(String nome){
        this.nome= nome;
    }
    public String getCrmv() {
        return crmv;
    }
    public void setCrmv(String crmv){
        this.crmv= crmv;
    }
    public String getEspecialidade() {
        return especialidade;
    }
    public void setEspecialidade(String Especialidade){
        this.especialidade = especialidade;
    }
}


