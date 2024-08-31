package Section3_3;

public class Student implements Comparable<Student>

{

    // properties
    private String nome;
    private String sobrenome;
    private int nota;

    // Constructors
    public Student(String nome, String sobrenome, int nota) // inicializando variáveis no construtor
    {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.nota = nota;
    }

    // getters and setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public int getNota() {
        return nota;
    }

    public void setNota(int nota) {
        this.nota = nota;
    }

    @Override
    public String toString() {
        return "Detalhes do estudante: " + nome + ", sobrenome: " + sobrenome + ", nota: " + nota;
    }

    @Override
    public int compareTo(Student stu) {

        // recursividade do método: criar um método e chamar o mesmo metodo dentro dele
        // Use com cautela :)
        if (nome.compareTo(stu.getNome()) < 0) {
            return -1;
        } else if (nome.compareTo(stu.getNome()) > 0)

        {
            return 1;
        } else
            return 0;

        /*
         * if (Integer.valueOf(nota).compareTo(stu.getNota()) < 0) {
         * return -1;
         * } else if (Integer.valueOf(nota).compareTo(stu.getNota()) > 0){
         * return 1;
         * } else
         * return 0;
         */

        /*
         * if (sobrenome.compareTo(stu.getNome()) < 0) {
         * return -1;
         * } else if (sobrenome.compareTo(stu.getSobrenome()) > 0)
         * 
         * {
         * return 1;
         * } else
         * return 0;
         */
    }

    // Behaviors
}
