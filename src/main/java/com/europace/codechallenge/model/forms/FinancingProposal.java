package com.europace.codechallenge.model.forms;

import com.europace.codechallenge.model.financing.FinancingProject;
import com.europace.codechallenge.model.applicant.PersonalInfo;
import com.europace.codechallenge.model.property.Property;
import io.swagger.annotations.ApiModel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

@ApiModel(description = "Form class for validation and encapsulation of financing proposals")
@NoArgsConstructor
@Getter
@Setter
public class FinancingProposal {

    @NotNull
    @Valid
    private PersonalInfo applicant;

    @NotNull
    @Valid
    private Property property;

    @NotNull
    @Valid
    private FinancingProject financing;
}
