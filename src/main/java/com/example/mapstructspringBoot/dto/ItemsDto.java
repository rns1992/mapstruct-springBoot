package com.example.mapstructspringBoot.dto;

import com.example.mapstructspringBoot.pojo.Orders;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@NoArgsConstructor
@Getter
@Setter
public class ItemsDto {

    private String firstName;
    private String lastName;
    private String location;
    private String itemName;

}
