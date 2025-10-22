/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.escuelaing.proxyservices.service;

import co.edu.escuelaing.proxyservices.exception.ServerException;
import co.edu.escuelaing.proxyservices.http.HttpConnection;
import java.io.IOException;

/**
 *
 * @author jaider.vargas-n
 */
public class ProxyService {

    public static String urlBaseS1 = "http://34.197.123.137:80/";
    public static String urlBaseS2 = "http://34.228.109.106:80/";

    public String getFactors(String value) throws IOException, ServerException {
        HttpConnection connection = new HttpConnection();
        String factors;
        try {
            factors = connection.get(urlBaseS1 + "factors?value=" +value);
        } catch (ServerException e) {
            factors = connection.get(urlBaseS2 + "factors?value=" + value);
        }
        return factors;
    }

    public String getPrimes(String value) throws IOException, ServerException {
        HttpConnection connection = new HttpConnection();
        String primes;
        try {
            primes = connection.get(urlBaseS1 + "primes?value=" + value);
        } catch (ServerException e) {
            primes = connection.get(urlBaseS2 + "primes?value=" + value);
        }
        return primes;
    }

}
