public class recepcionista {
    private String nome;
    private String cpf;
    private String endereco;
    public recepcionista(String nome, String cpf , String endereco){
     this.nome =nome;
      this.cpf = cpf;
      this.endereco = endereco;
    }

    public void cadastrartutor( tutor t){
        System.out.println(" TUTOR CADASTRADO:" + t.getNome());


    }

    public void cadstraranimal(animal a){
        System.out.println(" QUAL E A ESPECIE:"+a.getEspecie());
        System.out.println("  QUAL E A RAÇA:" +a.getRaca());

    }

    public void cadastraragendamento(agendamento ag){
        System.out.println("AGENDAMENTO FEITO !!");

    }
}
