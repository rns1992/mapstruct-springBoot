package com.example.mapstructspringBoot.mapper;

import com.example.mapstructspringBoot.dto.ItemsDto;
import com.example.mapstructspringBoot.pojo.Items;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.mapstruct.factory.Mappers;

@Mapper
public interface ItemToItemDtoMapper {

    ItemToItemDtoMapper INSTANCE = Mappers.getMapper(ItemToItemDtoMapper.class);

    @Mappings({
        @Mapping(source = "first_Name", target = "firstName"),
        @Mapping(source = "city", target = "location"),
    })
    public ItemsDto mapItemstoItemsDto(Items items);
}
