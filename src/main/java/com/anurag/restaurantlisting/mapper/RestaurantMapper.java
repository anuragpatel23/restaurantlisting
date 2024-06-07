package com.anurag.restaurantlisting.mapper;

import com.anurag.restaurantlisting.dto.RestaurantDTO;
import com.anurag.restaurantlisting.entity.Restaurant;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface RestaurantMapper {

    RestaurantMapper INSTANCE = Mappers.getMapper(RestaurantMapper.class);

    Restaurant mapRestaurantDTOToRestaurant (RestaurantDTO restaurantDTO);
    RestaurantDTO mapRestaurantToRestaurantDTO (Restaurant restaurant);

}
