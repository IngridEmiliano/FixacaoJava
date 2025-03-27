public class Animal {
    String Nome;

    public Animal(){
    }

    public Animal(String Nome){
        this.Nome = Nome;
    }
    public void FazerSom(){
        System.out.println("Som genérico de animal");
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String nome) {
        Nome = nome;
    }
}
