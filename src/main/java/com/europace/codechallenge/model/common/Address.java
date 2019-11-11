package com.europace.codechallenge.model.common;

import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.validation.constraints.Digits;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@NoArgsConstructor
@Getter
@Setter
public class Address {

    @NotNull
    @Size(min = 3, max = 30)
    @ApiModelProperty(example = "Nehringstraße")
    private String street;

    @NotNull
    @Min(1)
    @ApiModelProperty(example = "28")
    private int number;

    @NotNull
    @Digits(integer = 5, fraction = 0)
    @ApiModelProperty(example = "14059")
    private String zipCode;

    @NotNull
    @Size(min = 3, max = 30)
    @ApiModelProperty(example = "Berlin")
    private String city;
}
