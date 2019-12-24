package com.example.mapstructspringBoot.pojo;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@NoArgsConstructor
@Getter
@Setter
public class Orders {

    private int orderTotal;
    private List<Product> productList;

}
