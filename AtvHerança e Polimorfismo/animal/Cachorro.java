public class Cachorro extends Animal {
    public Cachorro(String Nome) {
        super(Nome);
    }
    public Cachorro(){
        super();
    }
        @Override
    public void FazerSom(){
        super.FazerSom();
            System.out.println("O cachorro late: AU AU");
        }

    }
