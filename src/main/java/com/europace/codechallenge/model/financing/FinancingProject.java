package com.europace.codechallenge.model.financing;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@ApiModel(description = "Financing specific data for one project")
@NoArgsConstructor
@Getter
@Setter
public class FinancingProject {

    @ApiModelProperty(example = "PURCHASE")
    private FinancingPurpose purpose;

    @ApiModelProperty(example = "100000")
    private float purchasePrice;

    @ApiModelProperty(example = "3")
    private float landTransferTaxInPercent;

    @ApiModelProperty(example = "20000")
    private float furnishingsPrice;

    @ApiModelProperty(example = "5")
    private float notarialFeeInPercent;

    @ApiModelProperty(example = "10000")
    private float otherCosts;

    @ApiModelProperty(example = "7")
    private float brokerageInPercent;

    @ApiModelProperty(example = "false")
    private boolean modernizing;
}




