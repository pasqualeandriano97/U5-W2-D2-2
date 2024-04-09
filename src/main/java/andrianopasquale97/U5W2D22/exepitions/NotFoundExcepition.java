package andrianopasquale97.U5W2D22.exepitions;

public class NotFoundExcepition extends RuntimeException {
    public NotFoundExcepition(int id){
        super("Elemento con id " + id + " non trovato!");
    }
}
