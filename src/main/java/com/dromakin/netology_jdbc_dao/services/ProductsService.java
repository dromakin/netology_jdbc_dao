package com.dromakin.netology_jdbc_dao.services;

import com.dromakin.netology_jdbc_dao.dto.ProductDTO;
import com.dromakin.netology_jdbc_dao.exceptions.DataNotFoundException;
import com.dromakin.netology_jdbc_dao.repositories.ProductsRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class ProductsService {

    private final ProductsRepository productsRepository;

    public List<ProductDTO> fetchProduct(String name) {
        List<String> result = productsRepository.getProductName(name);

        if (result.isEmpty()) {
            throw new DataNotFoundException("Not found: " + name);
        }

        return result.stream().map(x -> ProductDTO.builder().name(x).build()).collect(Collectors.toList());
    }
}
