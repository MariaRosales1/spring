package com.platzi.spring.web.controllers;

import com.platzi.spring.domain.Product;
import com.platzi.spring.domain.Purchase;
import com.platzi.spring.domain.service.PurchaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/purchases")
public class PurchaseController {

    @Autowired
    private PurchaseService purchaseService;

    @GetMapping("/all")
    public ResponseEntity<List<Purchase>> getAll(){
        return new ResponseEntity<>(purchaseService.getAll(), HttpStatus.OK);
    }


    @GetMapping("/client/{idClient}")
    public ResponseEntity<List<Purchase>> getProduct(@PathVariable("idClient") String clientId){
        return purchaseService.getByClient(clientId)
                .map(purchase -> new ResponseEntity<>(purchase,HttpStatus.OK))
                .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @PostMapping("/save")
    public  ResponseEntity<Purchase> save(@RequestBody Purchase purchase){
        return new ResponseEntity<>(purchaseService.save(purchase), HttpStatus.CREATED) ;
    }
}
