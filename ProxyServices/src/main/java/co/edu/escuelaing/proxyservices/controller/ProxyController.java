/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.escuelaing.proxyservices.controller;

import co.edu.escuelaing.proxyservices.exception.ServerException;
import co.edu.escuelaing.proxyservices.service.ProxyService;
import java.io.IOException;
import java.util.ArrayList;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author jaider.vargas-n
 */
@RestController
public class ProxyController {
    @GetMapping("/factors")
    public String getFactors(@RequestParam(value = "value") String value)  throws IOException, ServerException {
        ProxyService service = new ProxyService();
        String response = service.getFactors(value);
        return response;
    }

    @GetMapping("/primes")
    public String getPrimes(@RequestParam(value = "value") String value) throws IOException, ServerException {
        ProxyService service = new ProxyService();
        String response = service.getPrimes(value);
        return response;
    }
}
