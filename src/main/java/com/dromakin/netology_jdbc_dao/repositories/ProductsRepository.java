/*
 * File:     ProductsRepository
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

import java.util.List;

public interface ProductsRepository {
    List<Product> getProductName(String name);
}
