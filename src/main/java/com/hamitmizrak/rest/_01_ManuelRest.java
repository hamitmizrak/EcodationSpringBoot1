package com.hamitmizrak.rest;

import com.hamitmizrak.dto.ProductDto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class _01_ManuelRest {
    //https://jsoneditoronline.org/#left=local.gesomi&right=local.revibe


    //http://localhost:8080/rest1
    @GetMapping("rest1")
    public String getRest1(){

        return "{\n" +
                "  \"adi\":\"Hamit\",\n" +
                "  \"soyadi\":\"Mızrak\"\n" +
                "}";
    }


    //http://localhost:8080/rest2
    @GetMapping("rest2")
    public ProductDto getRest2(){
        ProductDto productDto=ProductDto
                .builder()
                .productId(1L)
                .productName("Ürün Adı")
                .productTrade("ürün markası")
                .build();
        return productDto;
    }





}
