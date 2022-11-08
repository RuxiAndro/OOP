public class Matrice {
    private int row;
    private int col;
    private Complex[][] mat;

    Matrice(int r, int c, Complex[][] m) {
        this.row = r;
        this.col = c;
        this.mat = m;
    }

    public void adunMat(Matrice m1) {
        // this.mat+=m1.mat;
        for (int i = 0; i < row; i++)
            for (int j = 0; j < col; j++) {
                this.mat[i][j].adunare(m1.mat[i][j]);
            }

    }

    public void afisMat() {
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.println(mat[i][j] + " ");
            }
            System.out.println("\n");
        }
    }


}
