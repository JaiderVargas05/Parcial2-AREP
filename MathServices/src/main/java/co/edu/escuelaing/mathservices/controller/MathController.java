/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.escuelaing.mathservices.controller;

/**
 *
 * @author jaider.vargas-n
 */
import co.edu.escuelaing.mathservices.models.MathResponse;
import co.edu.escuelaing.mathservices.service.MathService;
import java.net.http.HttpResponse;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicLong;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MathController {

    @GetMapping("/factors")
    public MathResponse getFactors(@RequestParam(value = "value") String value) {
        MathService service = new MathService();
        ArrayList<Integer> factors = service.getFactors(Integer.parseInt(value));
        return new MathResponse("factors", value, factors);
    }

    @GetMapping("/primes")
    public MathResponse getPrimes(@RequestParam(value = "value") String value) {
        MathService service = new MathService();
        ArrayList<Integer> factors = service.getPrimes(Integer.parseInt(value));
        return new MathResponse("primes",value, factors);
    }
}
