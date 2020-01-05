package com.danskeit.pact.test;

import static dsop.konsument.kontrakt.util.Unmarshaller.unmarhalTransactions;
import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import com.danskeit.pact.test.util.ResponseData;

import ske.ekstkom.utsending.kontoopplysninger.interfaces.ekstern.Transactions;

public class PactTestServiceTestSample {
	
	@DisplayName("Test verifyTransactions.get()")
	@Test
    void verifyTransactions() {
    	String jsonTransactions = ResponseData.ACCOUNTS_TRANSACTION.replaceAll("\\\\", "");
		System.out.println("jsonTransactions : " + jsonTransactions);

        Transactions transactions = unmarhalTransactions(jsonTransactions);
        assertThat(transactions).isNotNull();
        assertThat(transactions.getResponseStatus()).isNotNull();
        assertThat(transactions.getTransactions()).isNotNull();
    }
}
