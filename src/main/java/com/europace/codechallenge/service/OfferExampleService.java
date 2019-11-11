package com.europace.codechallenge.service;

import com.europace.codechallenge.model.offer.OfferExample;
import com.europace.codechallenge.model.forms.FinancingProposal;
import org.springframework.stereotype.Service;

@Service
public class OfferExampleService {

    public OfferExample getExampleOffer(FinancingProposal financingProposal){

        // simulate db and api calls
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {

            System.err.println("simulating api failed");
        }

        return OfferExample.builder().build();
    }
}
