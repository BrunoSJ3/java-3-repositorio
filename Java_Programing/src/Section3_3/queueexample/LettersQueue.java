package Section3_3.queueexample;

import java.util.LinkedList;//importar a linked list

public class LettersQueue

{
    public static void main(String[] args)

    {
        LinkedList<Character> lettersq = new LinkedList<>();

        lettersq.add('A');// FILA - QUEUE entra o primeiro
        lettersq.add('B');// FILA - QUEUE entra o segundo mas é o primeiro na ordem na fila
        lettersq.push('C');// PILHA - STACK/DEQUE (double ended queue) adiciona primeiro
        lettersq.push('D');// PILHA - STACK/DEQUE (double ended queue) adiciona segundo mas empurra o 1º

        System.out.println("Linked List:" + lettersq);
        System.out.println("tamanho da fila: " + lettersq.size());

        lettersq.remove();
        System.out.println("Linked List:" + lettersq);
        System.out.println("tamanho da fila: " + lettersq.size());

        lettersq.removeLast();
        System.out.println("Linked List:" + lettersq);
        System.out.println("tamanho da fila: " + lettersq.size());
    }
}
