package com.josuablejeru.resupplyapi.controllers.response;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class UpdateProductResponse {
    private String productId;
    private Integer quantity;
}
