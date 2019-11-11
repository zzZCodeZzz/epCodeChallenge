package com.europace.codechallenge.model.applicant;

import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@NoArgsConstructor
@Getter
@Setter
public class Phone {

    @NotNull
    @Size(min = 1, max = 10)
    @ApiModelProperty(allowableValues = "+49")
    private String dialingCode;

    @NotNull
    @ApiModelProperty(allowableValues = "1778756390")
    private int number;
}
