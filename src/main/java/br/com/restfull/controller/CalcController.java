package br.com.restfull.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/calculadora")
public class CalcController {

	@RequestMapping(value ="/soma", method = RequestMethod.GET)
    public Double soma(@RequestParam("valA") Double valA, @RequestParam("valB") Double valB) {
 
        return valA + valB;
    }
 
    @RequestMapping(value ="/subtrai", method = RequestMethod.GET)
    public Double subtrai(@RequestParam("valA") Double valA, @RequestParam("valB") Double valB) {
 
        return valA - valB;
    }
 
    @RequestMapping(value ="/multiplica", method = RequestMethod.GET)
    public Double multiplica(@RequestParam("valA") Double valA, @RequestParam("valB") Double valB) {
 
        return valA * valB;
    }
 
    @RequestMapping(value ="/divide", method = RequestMethod.GET)
    public Double divide(@RequestParam("valA") Double valA, @RequestParam("valB") Double valB) {
 
        return valA / valB;
    }

}
