public class IdadeInvalidaException extends Exception {
    public IdadeInvalidaException (String mensagem){
        super(mensagem);
    }
public IdadeInvalidaException(){
        super("Erro! a idade não oide ser negativa");
}
}
