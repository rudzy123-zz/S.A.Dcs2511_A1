package matrix;
import java.util.ArrayList;
/**
 * This class provides a data representation for the AbstractMatrix
 * implementation of the Matrix API.
 * It uses a list of list of integers to store matrix elements.
 * @author Rudolf Musika Section III 
 */
public class ArrayListImplementation extends AbstractMatrix {

    /**
     * Creates a list representation of a matrix of integers.
     * Elements of the list are initialized to zero.
     * @param numRows the number of rows in the matrix
     * @param numColumns the number of columns in the matrix
     * @throws MatrixException if dimensions are not positive
     */
    public ArrayListImplementation(int numRows, int numColumns) {
        // You must provide
        super.setNumRows(numRows);
        super.setNumColumns(numColumns);
        
        elements = new ArrayList<>(numRows);

        for (int i = 0; i<numRows;i++){
            elements.add(new ArrayList<>(numColumns));//A new ArrayList is added
            for (int j=0; j<numColumns;j++){
                elements.get(i).add(j, 0);//I had to add a unique add
                                           //Unique because it mutates the j 
                                           //Column so that it sets it to 0.
            }
        }
        super.clear();
    }
    
    /**
     * Gets the element at the indicated row and column in this matrix.
     *
     * @param row the row position for the element.
     * @param column the column position for the element.
     * @return the element at the indicated row and column
     * @throws MatrixException if row or column is out of range
     */
    @Override
    public int get(int row, int column) {
        // You must provide- Provided
        checkBounds(row, column);
        return elements.get(row).get(column); 
    }

    /**
     * Sets the element at the indicated row and column in this matrix.
     *
     * @param row the row position for the element.
     * @param column the column position for the element.
     * @param element the value to set in the matrix
     * @throws MatrixException if row or column is out of range
     */
    @Override
    public void set(int row, int column, int element) {
        // Answer
        checkBounds(row, column);
        elements.get(row).set(column, element);
    }
    // Private instance fields go here
        private ArrayList<ArrayList<Integer>> elements;
}
