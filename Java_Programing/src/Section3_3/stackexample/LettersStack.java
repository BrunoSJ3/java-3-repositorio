package Section3_3.stackexample;

import java.util.LinkedList;

public class LettersStack

{
    public static void main(String[] args) {
        LinkedList<Character> lettersStk = new LinkedList<>();

        lettersStk.push('A');
        lettersStk.push('B');
        lettersStk.push('C');
        lettersStk.push('D');

        System.out.println("Linked List:" + lettersStk);
        System.out.println("tamanho da fila: " + lettersStk.size());
        lettersStk.pop();
        System.out.println("Linked List:" + lettersStk);
        System.out.println("tamanho da fila: " + lettersStk.size());
        lettersStk.pop();
        System.out.println("Linked List:" + lettersStk);
        System.out.println("tamanho da fila: " + lettersStk.size());
        lettersStk.pop();
        System.out.println("Linked List:" + lettersStk);
        System.out.println("tamanho da fila: " + lettersStk.size());
        lettersStk.pop();
        System.out.println("Linked List:" + lettersStk);
        System.out.println("tamanho da fila: " + lettersStk.size());
    }
}
