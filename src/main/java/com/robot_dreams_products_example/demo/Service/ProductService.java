package com.robot_dreams_products_example.demo.Service;

import com.robot_dreams_products_example.demo.Dto.ProductDto;
import com.robot_dreams_products_example.demo.Mapper.ProductMapper;
import lombok.AllArgsConstructor;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class ProductService {

    private final JdbcTemplate jdbcTemplate;

    public List<ProductDto> getAllProductsByCategory(String category) {

        List<ProductDto> result = jdbcTemplate.query("select * from producttb p where p.category = ?", new Object[]{category}, new ProductMapper() {
        });

        return result;

    }
}
