import java.time.LocalDate;

public class exame extends  registroMedico {


        private String tipo;
        private String resultado;

        private String arquivoResultado;

        public exame(String tipo, String resultado,  String arquivoResultado,String descricao, LocalDate data) {
            super(descricao,data);
            this.tipo = tipo;
            this.resultado = resultado;

            this.arquivoResultado = arquivoResultado;
        }

        public String getTipo() { return tipo; }
        public void setTipo(String tipo) { this.tipo = tipo; }

        public String getResultado() { return resultado; }
        public void setResultado(String resultado) { this.resultado = resultado; }


        public String getArquivoResultado() { return arquivoResultado; }
        public void setArquivoResultado(String arquivoResultado) { this.arquivoResultado = arquivoResultado; }
    @Override
    public void exibirDetalhes(){
        System.out.println("EXAME- DATA:"+getData());
        System.out.println("TIPO:"+tipo);
        System.out.println("RESULTADO:"+resultado);
        System.out.println("ARQUIVO:"+arquivoResultado);
    }



    }

