/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matrix;
import Java.util.*;
/**
 *
 * @author jasonfujii
 */
public class Matrix implements matrixInterface {

    private int[][] mat;
    private int row;
    private int col;
    private boolean isIdentity;
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Matrix m = new Matrix(3,3);
        m.fill();
        System.out.println(m.printMatrix());
        Matrix m1 = new Matrix(3,3);
        m1.fill();
        
        Matrix m2 = m.add(m1);
        System.out.println(m2.printMatrix());
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
        //fill();
    }
    
    public int getVal(int r, int c)
    {
        return mat[r][c];
    }
    
    public void setVal(int r, int c, int val)
    {
        mat[r][c] = val;
    }
    
    public void fill()
    {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        for(int r = 0; r < row; r++)
        {
            for(int c = 0; c < col; c++)
            {
                System.out.println("Please insert the value for [" +r+ "][" +c+ "]");
                mat[r][c] = sc.nextInt();
            }
        }
    }
    
    public Matrix add(Matrix m)
    {
        Matrix sum = new Matrix(row, col);
        if(row == m.getRow() && col == m.getCol())
        {
            for(int r = 0; r < row; r++)
            {
                for(int c = 0; c < col; c++)
                {
                    sum.setVal(r,c, (mat[r][c] + m.getVal(r,c)));
                }
            }
        }
        else
            System.out.println("You cannot add matrices of different size");
        
        return sum;
    }
    
    public Matrix subtract(Matrix m)
    {   
        Matrix diff = new Matrix(row, col);
        
        return diff;
    }
    
    public Matrix mult(Matrix m)
    {
        Matrix product = new Matrix(col, m.getRow());
        
        return product;
    }
    
    public Matrix div(Matrix m)
    {
        Matrix quotient = new Matrix(col, m.getRow());
        
        return quotient;
    }
    
    public String printMatrix()
    {
        String matrix = new String("");
        for(int r = 0; r < row; r++)
        {
            for(int c = 0; c < col; c++)
            {
                matrix = matrix + mat[r][c] + " ";
            }
            matrix = matrix + "\n";
        }
        return matrix;
    }
    
    public String printSystem()
    {
        return " ";
    }
    
    public boolean isEqual()
    {
        return false;
    }    
    
    public int getCol()
    {
        return col;
    }
    
    public int getRow()
    {
        return row;
    }
    
    

}
