package com.hamitmizrak.controller;

import com.hamitmizrak.dto.ProductDto;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.client.RestTemplate;

@Controller
public class ProductPost {

    //POST
    //http://localhost:8080/controller/post"
    @GetMapping("/controller/post")
    @ResponseBody
    public String controllerPost(){
        ProductDto productDto=ProductDto.builder().productId(0L).productName("adi 44").productTrade("trade 44").build();
        String url="http://localhost:8080/post/data1";
        RestTemplate restTemplate=new RestTemplate();
        restTemplate.postForObject(url,productDto,Void.class);
        return "Veriniz Gönderildi Teşekkürler ...";
    }


    //PUT
    //http://localhost:8080/controller/put?adi=Msi&marka=msikl52"
    @GetMapping("/controller/put")
    @ResponseBody
    public String controllerPut(
            @RequestParam(name="adi")String adi,
            @RequestParam(name="marka")String marka
    ){
        ProductDto productDto=ProductDto.builder().productId(0L).productName(adi).productTrade(marka).build();
        String url="http://localhost:8080/put/data1";
        RestTemplate restTemplate=new RestTemplate();
        ResponseEntity<ProductDto> responseEntity=restTemplate.exchange(url, HttpMethod.PUT,new HttpEntity<ProductDto>(productDto),ProductDto.class);
       ProductDto productDto1=responseEntity.getBody();
        return "Veriniz Gönderildi Teşekkürler ..."+productDto1;
    }


    //DELETE
    //http://localhost:8080/controller/delete/5"
    @GetMapping("/controller/delete/{id}")
    @ResponseBody
    public String controllerDelete(@PathVariable(name="id") Long id){
        String url="http://localhost:8080/delete/data1/4";
        RestTemplate restTemplate=new RestTemplate();
       restTemplate.exchange(url, HttpMethod.DELETE,HttpEntity.EMPTY,Void.class);
        return "Veriniz silinmiştir ...";
    }

}
