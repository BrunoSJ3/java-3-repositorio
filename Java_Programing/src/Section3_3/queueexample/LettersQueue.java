package Section3_3.queueexample;

import java.util.LinkedList;//importar a linked list

public class LettersQueue

{
    public static void main(String[] args) {
        LinkedList<Character> lettersq = new LinkedList<>();

        lettersq.add('A');
        lettersq.add('B');
        lettersq.add('C');
        lettersq.add('D');

        System.out.println("Linked List:" + lettersq);
        System.out.println("tamanho da fila: " + lettersq.size());

        lettersq.remove();
        System.out.println("Linked List:" + lettersq);
        System.out.println("tamanho da fila: " + lettersq.size());

        lettersq.pop();
        System.out.println("Linked List:" + lettersq);
        System.out.println("tamanho da fila: " + lettersq.size());
    }
}
