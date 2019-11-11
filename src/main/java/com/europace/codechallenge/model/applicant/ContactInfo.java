package com.europace.codechallenge.model.applicant;

import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.validation.Valid;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.List;

@NoArgsConstructor
@Getter
@Setter
class ContactInfo {

    @NotNull
    @Size(min = 1, max = 5)
    @NotEmpty
    private List<@Valid Phone> phones;

    @NotNull
    @Size(min = 1, max = 5)
    @NotEmpty
    @ApiModelProperty(example = "[mail@mail.de]")
    private List<@Email String> emails;

    @ApiModelProperty(example = "#ManuOnTwitter")
    private String additionalContactMethod;
}