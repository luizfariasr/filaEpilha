public class Pilha<T> {
    private Node<T> topo;  // Referência para o topo da pilha

    public Pilha() {
        this.topo = null;
    }

    // Método para empilhar (adicionar) um elemento no topo
    public void empilhar(T elemento) {
        Node<T> novoNode = new Node<>(elemento);
        novoNode.setProximo(topo);  // O próximo do novo nó é o atual topo
        topo = novoNode;  // O novo nó se torna o topo
    }

    // Método para desempilhar (remover) o elemento do topo
    public T desempilhar() {
        if (estaVazia()) {
            System.out.println("Pilha vazia!");
            return null;
        }
        T dado = topo.getDado();
        topo = topo.getProximo();  // O topo passa a ser o próximo nó
        return dado;
    }

    // Verificar se a pilha está vazia
    public boolean estaVazia() {
        return topo == null;
    }

    // Método para mostrar todos os elementos da pilha
    public void exibirPilha() {
        if (estaVazia()) {
            System.out.println("A pilha está vazia!");
            return;
        }
        Node<T> atual = topo;
        while (atual != null) {
            System.out.println(atual.getDado());
            atual = atual.getProximo();
        }
    }
}
