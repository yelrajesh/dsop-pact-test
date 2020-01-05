package com.danskeit.pact.test;

import static dsop.konsument.kontrakt.util.Unmarshaller.unmarhalAccount;
import static dsop.konsument.kontrakt.util.Unmarshaller.unmarhalAccountDetails;
import static dsop.konsument.kontrakt.util.Unmarshaller.unmarhalCards;
import static dsop.konsument.kontrakt.util.Unmarshaller.unmarhalRoles;
import static dsop.konsument.kontrakt.util.Unmarshaller.unmarhalTransactions;
import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import com.danskeit.pact.test.util.ResponseData;

import ske.ekstkom.utsending.kontoopplysninger.interfaces.ekstern.AccountDetails;
import ske.ekstkom.utsending.kontoopplysninger.interfaces.ekstern.Accounts;
import ske.ekstkom.utsending.kontoopplysninger.interfaces.ekstern.Cards;
import ske.ekstkom.utsending.kontoopplysninger.interfaces.ekstern.Roles;
import ske.ekstkom.utsending.kontoopplysninger.interfaces.ekstern.Transactions;

public class PactTestServiceTest {

	@DisplayName("Test verifyAccountList.get()")
	@Test
	void verifyAccountList() {
		String jsonAccounts = ResponseData.ACCOUNTS_LIST.replaceAll("\\\\", "");
		System.out.println("jsonAccounts : " + jsonAccounts);
		Accounts accounts = unmarhalAccount(jsonAccounts);
		assertThat(accounts).isNotNull();
		assertThat(accounts.getAccounts()).isNotNull();
	}
	
	@DisplayName("Test verifyRoles.get()")
	@Test
	void verifyRoles() {
		String jsonRoles = ResponseData.ROLES.replaceAll("\\\\", "");
		System.out.println("jsonAccounts : " + jsonRoles);

        Roles roles = unmarhalRoles(jsonRoles);
        assertThat(roles).isNotNull();
        assertThat(roles.getRoles()).isNotNull();
    }

	@DisplayName("Test verifyCards.get()")
	@Test
    void verifyCards() {
    	String jsonCards = ResponseData.CARDS.replaceAll("\\\\", "");
		System.out.println("jsonCards : " + jsonCards);

        Cards cards = unmarhalCards(jsonCards);
        assertThat(cards).isNotNull();
        assertThat(cards.getPaymentCards()).isNotNull();
        assertThat(cards.getResponseStatus()).isNotNull();
    }

	@DisplayName("Test verifyTransactions.get()")
	@Test
    void verifyTransactions() {
    	String jsonTransactions = ResponseData.ACCOUNTS_LIST.replaceAll("\\\\", "");
		System.out.println("jsonTransactions : " + jsonTransactions);

        Transactions transactions = unmarhalTransactions(jsonTransactions);
        assertThat(transactions).isNotNull();
        assertThat(transactions.getResponseStatus()).isNotNull();
        assertThat(transactions.getTransactions()).isNotNull();
    }

	
	@DisplayName("Test verifyAccountDetails.get()")
	@Test
    void verifyAccountDetails() {
    	String jsonAccountDetails = ResponseData.ACCOUNTS_LIST.replaceAll("\\\\", "");
		System.out.println("jsonAccountDetails : " + jsonAccountDetails);

        AccountDetails accountDetails = unmarhalAccountDetails(jsonAccountDetails);
        assertThat(accountDetails).isNotNull();
        assertThat(accountDetails.getAccount()).isNotNull();
        assertThat(accountDetails.getResponseStatus()).isNotNull();
    }
}
