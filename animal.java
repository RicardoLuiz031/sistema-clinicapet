public class animal {
    private String especie;
    private String raca;
    private double peso;
    private int idade;
    private prontuario prontuario;
    private tutor tutor;

    public animal(String especie,String raca,double peso,int idade,prontuario prontuario,tutor tutor){
        this.especie= especie;
        this.raca =raca;
        this.peso = peso;
        this.idade = idade;
        this.prontuario = prontuario;
        this.tutor = tutor;

    }

    public String getEspecie() { return especie;}

    public void setEspecie(String especie) {this.especie = especie;}

    public String getRaca() { return raca;}

    public void setRaca(String raca) {this.raca = raca;}

    public double getPeso() {return peso;}

    public void setPeso(double peso) {this.peso = peso;}

     public int getIdade() { return idade;}

    public void setIdade(int idade) {this.idade = idade;}

    public prontuario getProntuario(){return prontuario;}

    public void setProntuario(prontuario prontuario){this.prontuario =prontuario;}

    public tutor getTutor() {return tutor;}

    public void setTutor(tutor tutor) {this.tutor = tutor;}

}
