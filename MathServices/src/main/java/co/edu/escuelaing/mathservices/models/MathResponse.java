/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.escuelaing.mathservices.models;

import java.util.ArrayList;

/**
 *
 * @author jaider.vargas-n
 */
public class MathResponse {
    public String operation = "factors";
    public String input = "";
    public ArrayList<Integer> output = new ArrayList<>();
    
    public MathResponse(String operation, String input, ArrayList<Integer> output){
        this.operation = operation;
        this.input = input;
        this.output = output;
    }
    
}
