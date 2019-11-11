package com.europace.codechallenge.controller;

import com.europace.codechallenge.model.offer.OfferExample;
import com.europace.codechallenge.model.forms.FinancingProposal;
import com.europace.codechallenge.service.OfferExampleService;
import io.swagger.annotations.ApiOperation;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequestMapping(value = "/offer")
@RequiredArgsConstructor
public class OfferController {

    private final OfferExampleService offerExampleService;

    @PostMapping("/example")
    @ApiOperation(
            value = "calculates and returns example offer",
            notes = "the resulting example offer will be a mock",
            response = OfferExample.class
    )
    public OfferExample getExampleOffer(@Valid @RequestBody FinancingProposal financingProposal) {
        return offerExampleService.getExampleOffer(financingProposal);
    }
}
