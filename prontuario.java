import java.util.ArrayList;
import java.util.List;

public class prontuario {
private List<registroMedico> registro;
public prontuario(){
        this.registro=new ArrayList<>();

}
public void adicionarRegistro(registroMedico r){
    registro.add(r);
}
public void exibirRegistros(){
    for ( registroMedico r : registro){
        r.exibirDetalhes();


    }
}

}

