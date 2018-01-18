/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package functions;

/**
 *
 * @author rio197
 */
public class Functions {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int result;
        
        result = Add(5,10);
        System.out.println("The result is");
        System.out.print(result);
    }
    
    public static int Add(int x, int y) {
        return (x + y);
    }
}
