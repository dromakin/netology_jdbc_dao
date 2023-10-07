package com.dromakin.netology_jdbc_dao.controllers;

import com.dromakin.netology_jdbc_dao.dto.ProductDTO;
import com.dromakin.netology_jdbc_dao.services.ProductsService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RestController
@RequestMapping("/products")
@AllArgsConstructor
public class ProductsController {


    private final ProductsService productsService;

    @GetMapping("/fetch-product")
    @ResponseBody
    public Collection<ProductDTO> fetchProduct(@RequestParam String name) {
        return productsService.fetchProduct(name);
    }
}
