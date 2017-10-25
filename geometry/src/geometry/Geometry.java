/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package geometry;

import java.util.ArrayList;

/**
 *
 * @author BM
 */
public class Geometry {

    ArrayList<Shape> shapes = new ArrayList<>();
    
    public void printShapes(){
        for (Shape shape : shapes) {
            System.out.println(shape.area());
            System.out.println(shape.perimeter());
        }
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
