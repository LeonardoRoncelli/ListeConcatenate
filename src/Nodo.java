public class Nodo<T> {
    private T informazione;
    private Nodo<T> puntatore;
    public Nodo(T informazione, Nodo<T> puntatore) {
        this.informazione = informazione;
        this.puntatore=puntatore;
    }
    public T getInformazione() {
        return informazione;
    }
    public void setInformazione(T informazione) {
        this.informazione = informazione;
    }
    public Nodo<T> getPuntatore() {
        return puntatore;
    }
    public void setPuntatore(Nodo<T> puntatore) {
        this.puntatore = puntatore;
    }
}