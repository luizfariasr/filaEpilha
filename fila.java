public class Fila<T> {
    private Node<T> inicio;  // Início da fila
    private Node<T> fim;     // Fim da fila

    public Fila() {
        this.inicio = null;
        this.fim = null;
    }

    // Método para adicionar um cliente à fila (enqueue)
    public void adicionar(T elemento) {
        Node<T> novoNode = new Node<>(elemento);
        if (estaVazia()) {
            inicio = fim = novoNode;
        } else {
            fim.setProximo(novoNode);
            fim = novoNode;
        }
    }

    // Método para remover o próximo cliente (dequeue)
    public T atender() {
        if (estaVazia()) {
            System.out.println("Fila de atendimento vazia!");
            return null;
        }
        T dado = inicio.getDado();
        inicio = inicio.getProximo();
        if (inicio == null) {
            fim = null;
        }
        return dado;
    }

    // Método para verificar se a fila está vazia
    public boolean estaVazia() {
        return inicio == null;
    }

    // Método para exibir a fila de atendimento
    public void exibirFila() {
        if (estaVazia()) {
            System.out.println("Fila vazia!");
            return;
        }
        Node<T> atual = inicio;
        while (atual != null) {
            System.out.println(atual.getDado());
            atual = atual.getProximo();
        }
    }
}
