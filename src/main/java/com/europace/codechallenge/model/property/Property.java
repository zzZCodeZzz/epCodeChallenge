package com.europace.codechallenge.model.property;

import com.europace.codechallenge.model.common.Address;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.validation.Valid;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

@NoArgsConstructor
@Getter
@Setter
@ApiModel(description = "Model class representing a property, ie. building or plot etc")
public class Property {

    @NotNull
    @ApiModelProperty(example = "FLAT")
    private PropertyType type;

    @Valid
    private Address address;

    @NotNull
    @Min(1)
    @ApiModelProperty(example = "120")
    private float sizeInSquareMeter;
}


