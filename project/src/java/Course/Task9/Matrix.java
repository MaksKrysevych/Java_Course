package Course.Task9;

public class Matrix {
    private double[][] matrix;

    public Matrix(double[][] matrix) {
        this.matrix = matrix;
    }
    public void setMatrixValue(int row, int col, double value){
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (i == row && j == col){
                    matrix[i][j] = value;
                }
            }
        }
    }
    public double getMatrixValue(int row, int col){
        return matrix[row][col];
    }
    public double additionOfMatrix(){
        double sum = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                sum += matrix[i][j];
            }
        }
        return sum;
    }
    public double deducationOfMatrix(){
        double ded = matrix[0][0];
        for (int i = 1; i < matrix.length; i++) {
            for (int j = 1; j < matrix[i].length; j++) {
                ded -= matrix[i][j];
            }
        }
        return ded;
    }
    public double multiplicationOfTMatrix(){
        double mult = matrix[0][0];
        for (int i = 1; i < matrix.length; i++) {
            for (int j = 1; j < matrix[i].length; j++) {
                mult *= matrix[i][j];
            }
        }
        return mult;
    }
}
