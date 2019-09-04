/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matrix;

/**
 *
 * @author jasonfujii
 */
public class Matrix {

    private int[][] mat;
    private int row;
    private int col;
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
    public Matrix()
    {
        mat = new int[1][1];
        row = 1; col = 1;
    }
    
    public Matrix(int r, int c)
    {
        mat = new int[r][c];
        row = r;
        col = c;
    }
    
}
