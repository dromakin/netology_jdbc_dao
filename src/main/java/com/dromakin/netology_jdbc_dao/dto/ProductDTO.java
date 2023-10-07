/*
 * File:     ProductDTO
 * Package:  com.dromakin.netology_jdbc_dao.dto
 * Project:  netology_jdbc_dao
 *
 * Created by dromakin as 06.10.2023
 *
 * author - dromakin
 * maintainer - dromakin
 * version - 2023.10.06
 * copyright - ORGANIZATION_NAME Inc. 2023
 */
package com.dromakin.netology_jdbc_dao.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class ProductDTO {
    private String name;
}
