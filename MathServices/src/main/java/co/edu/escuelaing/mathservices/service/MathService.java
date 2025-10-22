/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.escuelaing.mathservices.service;

import java.util.ArrayList;

/**
 *
 * @author jaider.vargas-n
 */
public class MathService {

    public ArrayList<Integer> getFactors(Integer value) {
        ArrayList<Integer> factors = new ArrayList<>();
        factors.add(value);
        Integer divisor = value / 2;
        while (divisor >= 2) {
            if (value % divisor == 0) {
                factors.add(0, divisor);
            }
            divisor = divisor - 1;
        }
        factors.add(0, 1);
        return factors;
    }

    public ArrayList<Integer> getPrimes(Integer value) {
        ArrayList<Integer> primes = new ArrayList<>();
        while (value > 1) {
            ArrayList<Integer> factors = this.getFactors(value);
            if (factors.size() == 2) {
                primes.add(0, value);
            }
            value = value - 1;
        }
        return primes;
    }
}
