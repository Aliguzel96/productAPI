package com.robot_dreams_products_example.demo.Mapper;


import com.robot_dreams_products_example.demo.Dto.ProductDto;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class ProductMapper implements RowMapper<ProductDto> {
    @Override
    public ProductDto mapRow(ResultSet rs, int rowNum) throws SQLException {
        ProductDto productDto = new ProductDto();
        productDto.setName(rs.getString("name"));
        productDto.setCategory(rs.getString("category"));
        productDto.setPhotoUrl(rs.getString("photoUrl"));
        productDto.setDescription(rs.getString("description"));
        productDto.setPrice(rs.getDouble("price"));

        return  productDto;
    }
}
