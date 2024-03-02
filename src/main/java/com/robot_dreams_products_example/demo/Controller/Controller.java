package com.robot_dreams_products_example.demo.Controller;

import com.robot_dreams_products_example.demo.Dto.ProductDto;
import com.robot_dreams_products_example.demo.Service.ProductService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
@RequestMapping("/product")
@AllArgsConstructor
public class Controller {

    private final ProductService productService;

    @GetMapping("/getProducts")
    public List<ProductDto> getAllProductsByCategory(@RequestParam String category)
    {
        return productService.getAllProductsByCategory(category);
    }

}
