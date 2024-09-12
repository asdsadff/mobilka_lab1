public class Demonstration {
    private final MatrixTransformation matrixTransformation= new MatrixTransformation();
    public void demonstrate() {
        matrixTransformation.enterDimentionality();
        matrixTransformation.showCredentials();
        matrixTransformation.fillMatrix();
        matrixTransformation.printMatrix();
        matrixTransformation.rotateMatrix();
        matrixTransformation.printMatrix();
    }
}
