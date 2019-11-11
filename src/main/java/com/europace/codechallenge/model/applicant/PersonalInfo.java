package com.europace.codechallenge.model.applicant;

import com.europace.codechallenge.model.common.Address;
import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.time.LocalDate;

@ApiModel(description = "person specific information")
@NoArgsConstructor
@Setter
@Getter
public class PersonalInfo {

    @Valid
    private Address address;

    @NotNull
    @JsonFormat(pattern = "dd.MM.yyyy")
    @ApiModelProperty(example = "28.06.1988")
    private LocalDate birthday;

    @NotNull
    @Size(min = 3, max = 30)
    @ApiModelProperty(example = "Berlin")
    private String birthPlace;

    @NotNull
    @Valid
    private ContactInfo contactInfo;

    @NotNull
    @Size(min = 2, max = 30)
    @ApiModelProperty(example = "Manuel")
    private String firstName;

    @NotNull
    @Size(min = 2, max = 30)
    @ApiModelProperty(example = "Zach")
    private String lastName;
}
