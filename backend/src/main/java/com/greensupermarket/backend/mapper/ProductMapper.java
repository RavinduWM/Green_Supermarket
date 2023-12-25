package com.greensupermarket.backend.mapper;

import com.greensupermarket.backend.dto.ProductDto;
import com.greensupermarket.backend.entity.Product;

public class ProductMapper {
    public static ProductDto mapToProductDto(Product product) {
        return new ProductDto(
                product.getId(),
                product.getProductName(),
                product.getStock(),
                product.getTags(),
                product.getBrand(),
                product.getDescription(),
                product.getMainImage(),
                product.getOtherImages(),
                product.getLife(),
                product.getMfg(),
                product.getType(),
                product.getCategory()
        );
    }

    public static Product mapToProduct(ProductDto productDto) {
        return new Product(
                productDto.getId(),
                productDto.getProductName(),
                productDto.getStock(),
                productDto.getTags(),
                productDto.getBrand(),
                productDto.getDescription(),
                productDto.getMainImage(),
                productDto.getOtherImages(),
                productDto.getLife(),
                productDto.getMfg(),
                productDto.getType(),
                productDto.getCategory()
        );
    }
}
