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

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@AllArgsConstructor
public class ProductsRepositoryImpl implements ProductsRepository {

    @PersistenceContext
    EntityManager manager;

    @Override
    public List<String> getProductName(String name) {
        // HQL
        var query = manager.createQuery("select productName from Order o where o.customer.name = :name");
        query.setParameter("name", name);
        return query.getResultList();
    }
}
