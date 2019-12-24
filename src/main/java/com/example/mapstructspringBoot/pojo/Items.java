package com.example.mapstructspringBoot.pojo;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@NoArgsConstructor
@Getter
@Setter
public class Items {

    private String first_Name;
    private String lastName;
    private String city;
    private int id;
    private List<Orders> ordersList;

}
