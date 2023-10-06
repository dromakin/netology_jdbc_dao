package com.dromakin.netology_jdbc_dao.services;

import com.dromakin.netology_jdbc_dao.dto.Product;
import com.dromakin.netology_jdbc_dao.exceptions.DataNotFoundException;
import com.dromakin.netology_jdbc_dao.repositories.ProductsRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class ProductsService {

    private final ProductsRepository productsRepository;

    public List<Product> fetchProduct(String name) {
        List<Product> result = productsRepository.getProductName(name);

        if (result.isEmpty()) {
            throw new DataNotFoundException("Not found: " + name);
        }

        return result;
    }
}
