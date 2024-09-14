public class Node<T> {
    private T dado;       // Elemento armazenado
    private Node<T> proximo;  // Referência ao próximo nó

    public Node(T dado) {
        this.dado = dado;
        this.proximo = null;
    }

    public T getDado() {
        return dado;
    }

    public void setProximo(Node<T> proximo) {
        this.proximo = proximo;
    }

    public Node<T> getProximo() {
        return proximo;
    }
}
