package Section3_2;

public class CellColectionDriver {
    public static void main(String[] args)

    {
        CellCollection celulas = new CellCollection(5);

        celulas.add(new Cell()); // só objetos String que não adiciona o new na instanciação

        celulas.add(new Cell());
        celulas.add(new Cell());
        celulas.add(new Cell());
        celulas.add(new Cell());

        System.out.println(celulas.getCell(0));
        System.out.println(celulas.getCell(1));
        System.out.println(celulas.getCell(2));
        System.out.println(celulas.getCell(3));
        System.out.println(celulas.getCell(4));

        celulas.getCell(0).setData("Primeira célula.");
        celulas.getCell(1).setData("Segunda célula.");
        celulas.getCell(2).setData("Terceira célula.");
        celulas.getCell(3).setData("Penúltima célula.");

        System.out.println(celulas.getCell(0));
        System.out.println(celulas.getCell(1));
        System.out.println(celulas.getCell(2));
        System.out.println(celulas.getCell(3));
        System.out.println(celulas.getCell(4));
    }
}
