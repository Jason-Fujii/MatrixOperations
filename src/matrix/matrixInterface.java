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
public interface matrixInterface {
    //fill() has the user input the matrix values into the matrix
    //Will be private
    void fill();
    
    //Add(): adds two matrices together and returns a new matrix with the added values. 
    //*Matrices MUST be the same size*
    public Matrix add(Matrix m);
    
    //Subtract(): subtracts two matrices from eachother and returns a new matrix with the subtracted values 
    //*Matrices MUST be the same size* 
    public Matrix subtract(Matrix m);
    
    //Mult(): multiplies two matrices together and returns a new matrix with the multiplied values.
    //*Matrix inside dimensions must be the same (3x3 & 3x5)*
    public Matrix mult(Matrix m);
    
    //Div(): divides two matrices and returns a new matrix with the divided values. 
    //*Matrices' inside dimensions must be the same (3x3 & 3x5)*
    public Matrix div(Matrix m);
    
    //printMatrix(): prints out the Matrix in Augmented Matrix form
    public String printMatrix();
    
    //printSystem(): prints out the Matrix in system of equation form
    public String printSystem();
    
    //isEqual(): returns true if every element in two matrices are the same.
    //returns false if matrices are not the same size or if they are not identical
    public boolean isEqual();
    
    //isIdentity(): returns true if the matrix is an identity matrix (every element except for those in the diagonal of the matrix are 0. 
    //The diagonals are 1) returns false if the Matrix is not an identity matrix
    
}
    
