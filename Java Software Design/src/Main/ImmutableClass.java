package Main;

import java.util.ArrayList;
import java.util.List;

public final class ImmutableClass

{
    // properties
    private final String SCIENTIFIC_NAME;
    private final String POPULAR_NAME;
    private final int AGE;
    private final double MASS;
    private final List<String> HABITAT;

    // constructors
    public ImmutableClass(String SCIENTIFIC_NAME, String POPULAR_NAME, int AGE, double MASS, List<String> HABITAT)

    {
        this.SCIENTIFIC_NAME = SCIENTIFIC_NAME;
        this.POPULAR_NAME = POPULAR_NAME;
        this.AGE = AGE;
        this.MASS = MASS;
        this.HABITAT = new ArrayList<>(HABITAT);
    }

    // behavious

    // getters and setters
    public String getSCIENTIFIC_NAME() {
        return SCIENTIFIC_NAME;
    }

    public String getPOPULAR_NAME() {
        return POPULAR_NAME;
    }

    public int getAGE() {
        return AGE;
    }

    public double getMASS() {
        return MASS;
    }

    public List<String> getHabitat() // devo retornar uma variável defensiva para tratar objetos mutáveis, já que
                                     // List é final

    {
        return new ArrayList<>(HABITAT);
    }

    // convertendo em ToString
    @Override
    public String toString()

    {
        String INFO = "Nome Científico = " + SCIENTIFIC_NAME + "\nNome Popular = " + POPULAR_NAME + "\nIdade = " + AGE
                + "\nMassa = " + MASS + "\nHabitat = " + HABITAT;
        return INFO;
    }
}
