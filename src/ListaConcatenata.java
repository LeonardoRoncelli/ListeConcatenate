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
    public void inserimentoInPosizione(T info, int posizione) {
        if (posizione <= 0) {
            inserimentoInTesta(info);
        } else if (posizione >= grandezza) {
            inserimentoInCoda(info);
        } else {
            Nodo<T> corrente = head;
            for (int i = 0; i < posizione - 1; i++) {
                corrente = corrente.getPuntatore();
            }
            Nodo<T> nuovo = new Nodo<>(info, corrente.getPuntatore());
            corrente.setPuntatore(nuovo);
            grandezza++;
        }
    }
    public void inserimentoPrimaDi(T info, T target) {
        if (head == null) return;
        if (head.getInformazione().equals(target)) {
            inserimentoInTesta(info);
            return;
        }
        Nodo<T> corrente = head;
        while (corrente.getPuntatore() != null &&
                !corrente.getPuntatore().getInformazione().equals(target)) {
            corrente = corrente.getPuntatore();
        }
        if (corrente.getPuntatore() != null) {
            Nodo<T> nuovo = new Nodo<>(info, corrente.getPuntatore());
            corrente.setPuntatore(nuovo);
            grandezza++;
        }
    }
    public void cancellaNodo(T info) {
        if (head == null) return;
        if (head.getInformazione().equals(info)) {
            head = head.getPuntatore();
            grandezza--;
            return;
        }
        Nodo<T> corrente = head;
        while (corrente.getPuntatore() != null &&
                !corrente.getPuntatore().getInformazione().equals(info)) {
            corrente = corrente.getPuntatore();
        }
        if (corrente.getPuntatore() != null) {
            corrente.setPuntatore(corrente.getPuntatore().getPuntatore());
            grandezza--;
        }
    }
}