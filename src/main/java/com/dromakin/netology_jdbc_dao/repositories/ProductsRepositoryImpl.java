/*
 * File:     ProductsRepositoryImpl
 * Package:  com.dromakin.netology_jdbc_dao.repositories
 * Project:  netology_jdbc_dao
 *
 * Created by dromakin as 06.10.2023
 *
 * author - dromakin
 * maintainer - dromakin
 * version - 2023.10.06
 * copyright - ORGANIZATION_NAME Inc. 2023
 */
package com.dromakin.netology_jdbc_dao.repositories;

import com.dromakin.netology_jdbc_dao.dto.Product;
import com.dromakin.netology_jdbc_dao.utils.ResourceReader;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.stream.Collectors;

@Repository
public class ProductsRepositoryImpl implements ProductsRepository {

    private final String productNameRequest;
    private final NamedParameterJdbcTemplate namedParameterJdbcTemplate;
    private final ResourceReader resourceReader;

    public ProductsRepositoryImpl(NamedParameterJdbcTemplate namedParameterJdbcTemplate) {
        this.namedParameterJdbcTemplate = namedParameterJdbcTemplate;
        this.resourceReader = new ResourceReader();
        this.productNameRequest = resourceReader.read("find_product_name.sql");
    }

    @Override
    public List<Product> getProductName(String name) {
        SqlParameterSource namedParameters = new MapSqlParameterSource("username", name);
        var response = namedParameterJdbcTemplate.queryForList(productNameRequest, namedParameters);
        return response.stream().map(p -> Product.builder().name((String) p.get("product_name")).build()).collect(Collectors.toList());
    }


}
