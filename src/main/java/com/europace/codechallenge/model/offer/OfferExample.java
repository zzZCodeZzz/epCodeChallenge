package com.europace.codechallenge.model.offer;

import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModel;
import lombok.Builder;
import lombok.Getter;

import java.time.LocalDate;

@ApiModel(description = "Model class for returning calculated offer example")
@Builder
@Getter
public class OfferExample {

    @Builder.Default
    private float borrowingRateInPercent = 1.7F;

    @Builder.Default
    private float effectiveRateInPercent = 1.2F;

    @Builder.Default
    private float ltvInPercent = 55.56f;

    @Builder.Default
    private String productProvider = "Musterbank"; // Todo should be converted to Entity

    @Builder.Default
    private float totalMonthlyRate = 264;

    @Builder.Default
    private float loanAmount = 100000;

    @Builder.Default
    private float fixedInterestInYears = 10;

    @Builder.Default
    @JsonFormat(pattern = "dd.MM.yyyy")
    private LocalDate acceptancePeriod = LocalDate.now();
}
