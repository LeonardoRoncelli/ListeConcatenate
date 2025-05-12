public class ListaConcatenata<T> {
    private Nodo<T> head;
    private int grandezza = 0;
    public String toString() {
        StringBuilder sb = new StringBuilder("Lista: ");
        Nodo<T> corrente = head;
        while (corrente != null) {
            sb.append(corrente.getInformazione()).append(" - ");
            corrente = corrente.getPuntatore();
        }
        sb.append("null");
        return sb.toString();
    }
    public void inserimentoInTesta(T info) {
        head = new Nodo<>(info, head);
        grandezza++;
    }
    public void inserimentoInCoda(T info) {
        Nodo<T> nuovo = new Nodo<>(info, null);
        if (head == null) {
            head = nuovo;
        } else {
            Nodo<T> corrente = head;
            while (corrente.getPuntatore() != null) {
                corrente = corrente.getPuntatore();
            }
            corrente.setPuntatore(nuovo);
        }
        grandezza++;
    }
}