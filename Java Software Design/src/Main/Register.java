package Main;

import java.util.ArrayList;
import java.util.List;

public record Register(String SCIENTIFIC_NAME, String POPULAR_NAME, int AGE, double MASS, List<String> HABITAT)

{

    // construtor compacto feito para a variável HABITAT que naturalmente é mutável.
    public Register

    {
        HABITAT = new ArrayList<>(HABITAT);
    }

    // Verificar se há metodos para sobrescrever
    @Override
    public List<String> HABITAT()

    {
        return new ArrayList<>(HABITAT);
    }

    @Override
    public String toString()

    {
        String INFO = "Nome Científico = " + SCIENTIFIC_NAME + "\nNome Popular = " + POPULAR_NAME + "\nIdade = " + AGE
                + "\nMassa = " + MASS + "\nHabitat = " + HABITAT;
        return INFO;
    }

}
