public class ListaConcatenata<T> {
    private Nodo<T> head;
    private int grandezza = 0;
    public String toString() {
        StringBuilder sb = new StringBuilder("Lista: ");
        Nodo<T> corrente = head;
        while (corrente != null) {
            sb.append(corrente.getInformazione()).append(" -> ");
            corrente = corrente.getPuntatore();
        }
        sb.append("null");
        return sb.toString();
    }
}