package Section3_2;

public class CellCollection

{
    // properties
    Cell[] cells;
    int index = 0;

    // constructors
    public CellCollection(int size)

    {
        cells = new Cell[size];
        for (int i = 0; i < size; i++) {
            cells[i] = new Cell();
        }
    }
    // getters and setters

    public Cell getCell(int index) {
        return cells[index];
    }

    // behaviors
    public void add(Cell c) {
        // cells[index] = c;
        // index++;

        cells[index++] = c; // mesma coisa do que o de cima
    }
}
