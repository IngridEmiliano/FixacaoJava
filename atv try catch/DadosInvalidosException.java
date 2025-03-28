public class DadosInvalidosException extends Exception{
    public DadosInvalidosException (String mensagem){
        super(mensagem);
    }
    public DadosInvalidosException(){
        super("Dados invalidos");
    }
}
