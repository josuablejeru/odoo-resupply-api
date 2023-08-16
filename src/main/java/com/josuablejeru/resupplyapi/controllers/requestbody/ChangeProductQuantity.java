package com.josuablejeru.resupplyapi.controllers.requestbody;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
public class ChangeProductQuantity {
    private Integer quantity;
}
