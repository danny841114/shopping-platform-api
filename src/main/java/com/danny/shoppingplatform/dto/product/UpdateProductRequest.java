package com.danny.shoppingplatform.dto.product;

import jakarta.validation.constraints.Min;
import org.springframework.web.multipart.MultipartFile;

import java.math.BigDecimal;

public record UpdateProductRequest(
        String name,
        String description,
        @Min(value = 0, message = "Price should not be less than 0") BigDecimal price,
        @Min(value = 0, message = "Quantity should not be less than 0") Integer quantity,
        MultipartFile photo,
        Boolean deletePhoto
) {
}
