package com.danskeit.pact.test.util;

public interface ResponseData {

	public static String ACCOUNTS_LIST = "{\r\n" + "	\"responseStatus\": \"complete\",\r\n" + "	\"accounts\": [\r\n"
			+ "		{\r\n" + "			\r\n" + "			\"servicer\": {\r\n"
			+ "				\"identifier\": {\r\n" + "					\"countryOfResidence\": \"NO\",\r\n"
			+ "					\"value\": \"test\",\r\n"
			+ "					\"type\": \"countryIdentificationCode\"\r\n" + "				},\r\n"
			+ "				\"name\": \"Danske Bank A/S\"\r\n" + "			},\r\n" + "			\"links\": [\r\n"
			+ "				{\r\n" + "					\"rel\": \"transactions\",\r\n"
			+ "					\"href\": \"/accounts/NDgyNzQwMzcwOQ==/transactions\"\r\n" + "				},\r\n"
			+ "				{\r\n" + "					\"rel\": null,\r\n" + "					\"href\": null\r\n"
			+ "				},\r\n" + "				{\r\n" + "					\"rel\": null,\r\n"
			+ "					\"href\": null\r\n" + "				}\r\n" + "			],\r\n"
			+ "			\"accountIdentifier\": \"1234567890\",\r\n"
			+ "			\"accountReference\": \"NDgyNzQwMzcwOQ==\",\r\n"
			+ "			\"type\": \"businessAccount\",\r\n" + "			\"currency\": \"NOK\",\r\n"
			+ "			\"primaryOwner\": {\r\n" + "				\"permission\": \"rightToUseAlone\",\r\n"
			+ "				\"identifier\": {\r\n" + "					\"countryOfResidence\": \"NO\",\r\n"
			+ "					\"value\": \"12345678\",\r\n"
			+ "					\"type\": \"nationalIdentityNumber\"\r\n" + "				},\r\n"
			+ "				\"name\": \"\",\r\n" + "				\"startDate\": \"2002-04-19\",\r\n"
			+ "				\"endDate\": null,\r\n" + "				\"postalAddress\": {\r\n"
			+ "					\"postCode\": \"4662\",\r\n" + "					\"type\": \"business\",\r\n"
			+ "					\"streetName\": \"test\",\r\n" + "					\"buildingNumber\": \"23\",\r\n"
			+ "					\"townName\": \"\",\r\n" + "					\"country\": \"NO\",\r\n"
			+ "					\"addressLines\": [\r\n" + "						\"test\"\r\n"
			+ "					]\r\n" + "				},\r\n" + "				\"electronicAddresses\": [\r\n"
			+ "					{\r\n" + "						\"type\": \"phoneNumber\",\r\n"
			+ "						\"value\": \"96711125\"\r\n" + "					}\r\n" + "				]\r\n"
			+ "			},\r\n" + "			\"name\": \"test\",\r\n" + "			\"status\": \"enabled\"\r\n"
			+ "		},\r\n" + "		{\r\n" + "			\r\n" + "			\"servicer\": {\r\n"
			+ "				\"identifier\": {\r\n" + "					\"countryOfResidence\": \"NO\",\r\n"
			+ "					\"value\": \"test\",\r\n"
			+ "					\"type\": \"countryIdentificationCode\"\r\n" + "				},\r\n"
			+ "				\"name\": \"Danske Bank A/S\"\r\n" + "			},\r\n" + "			\"links\": [\r\n"
			+ "				{\r\n" + "					\"rel\": \"transactions\",\r\n"
			+ "					\"href\": \"/accounts/NDgxNzAxOTY4NA==/transactions\"\r\n" + "				},\r\n"
			+ "				{\r\n" + "					\"rel\": null,\r\n" + "					\"href\": null\r\n"
			+ "				},\r\n" + "				{\r\n" + "					\"rel\": null,\r\n"
			+ "					\"href\": null\r\n" + "				}\r\n" + "			],\r\n"
			+ "			\"accountIdentifier\": \"test\",\r\n"
			+ "			\"accountReference\": \"NDgxNzAxOTY4NA==\",\r\n"
			+ "			\"type\": \"taxDeductionAccount\",\r\n" + "			\"currency\": \"NOK\",\r\n"
			+ "			\"primaryOwner\": {\r\n" + "				\"permission\": \"rightToUseAlone\",\r\n"
			+ "				\"identifier\": {\r\n" + "					\"countryOfResidence\": \"NO\",\r\n"
			+ "					\"value\": \"test\",\r\n"
			+ "					\"type\": \"countryIdentificationCode\"\r\n" + "				},\r\n"
			+ "				\"name\": \"\",\r\n" + "				\"startDate\": \"2010-04-15\",\r\n"
			+ "				\"endDate\": null,\r\n" + "				\"postalAddress\": {\r\n"
			+ "					\"postCode\": \"4662\",\r\n" + "					\"type\": \"business\",\r\n"
			+ "					\"streetName\": \"tset\",\r\n" + "					\"buildingNumber\": \"23\",\r\n"
			+ "					\"townName\": \"\",\r\n" + "					\"country\": \"NO\",\r\n"
			+ "					\"addressLines\": [\r\n" + "						\"test\"\r\n"
			+ "					]\r\n" + "				},\r\n" + "				\"electronicAddresses\": [\r\n"
			+ "					{\r\n" + "						\"type\": \"phoneNumber\",\r\n"
			+ "						\"value\": \"96711125\"\r\n" + "					}\r\n" + "				]\r\n"
			+ "			},\r\n" + "			\"name\": \"Skattetrekk\",\r\n" + "			\"status\": \"enabled\"\r\n"
			+ "		},\r\n" + "		{\r\n" + "			\"servicer\": {\r\n" + "				\"identifier\": {\r\n"
			+ "					\"countryOfResidence\": \"NO\",\r\n" + "					\"value\": \"test\",\r\n"
			+ "					\"type\": \"countryIdentificationCode\"\r\n" + "				},\r\n"
			+ "				\"name\": \"Danske Bank A/S\"\r\n" + "			},\r\n" + "			\"links\": [\r\n"
			+ "				{\r\n" + "					\"rel\": \"transactions\",\r\n"
			+ "					\"href\": \"/accounts/NDgxNzIwMTQ2Ng==/transactions\"\r\n" + "				},\r\n"
			+ "				{\r\n" + "					\"rel\": null,\r\n" + "					\"href\": null\r\n"
			+ "				},\r\n" + "				{\r\n" + "					\"rel\": null,\r\n"
			+ "					\"href\": null\r\n" + "				}\r\n" + "			],\r\n"
			+ "			\"accountIdentifier\": \"test\",\r\n"
			+ "			\"accountReference\": \"NDgxNzIwMTQ2Ng==\",\r\n" + "			\"type\": \"loanAccount\",\r\n"
			+ "			\"currency\": \"NOK\",\r\n" + "			\"primaryOwner\": {\r\n"
			+ "				\"permission\": \"rightToUseAlone\",\r\n" + "				\"identifier\": {\r\n"
			+ "					\"countryOfResidence\": \"NO\",\r\n" + "					\"value\": \"tset\",\r\n"
			+ "					\"type\": \"nationalIdentityNumber\"\r\n" + "				},\r\n"
			+ "				\"name\": \"\",\r\n" + "				\"startDate\": \"2015-03-31\",\r\n"
			+ "				\"endDate\": null,\r\n" + "				\"postalAddress\": {\r\n"
			+ "					\"postCode\": \"4662\",\r\n" + "					\"type\": \"business\",\r\n"
			+ "					\"streetName\": \"test STRANDGATE\",\r\n"
			+ "					\"buildingNumber\": \"23\",\r\n" + "					\"townName\": \"\",\r\n"
			+ "					\"country\": \"NO\",\r\n" + "					\"addressLines\": [\r\n"
			+ "						\"test\"\r\n" + "					]\r\n" + "				},\r\n"
			+ "				\"electronicAddresses\": [\r\n" + "					{\r\n"
			+ "						\"type\": \"phoneNumber\",\r\n" + "						\"value\": \"96711125\"\r\n"
			+ "					}\r\n" + "				]\r\n" + "			},\r\n" + "			\"name\": \"test\",\r\n"
			+ "			\"status\": \"enabled\"\r\n" + "		}\r\n" + "	]\r\n" + "}";

	public static String CARDS = "{\"responseStatus\":\"complete\",\"paymentCards\":[{\"cardIdentifier\":\"557385XXXXXX0277\",\"holderName\":\"TST FREMSTAD\",\"startDate\":\"2018-09-04\",\"expiryDate\":\"2021-10-31\",\"cardIssuerName\":\"Danske Bank A/S\",\"type\":\"debitCard\",\"cardIssuerIdentifier\":{\"countryOfResidence\":\"NO\",\"value\":\"977074010\",\"type\":\"countryIdentificationCode\"}}]}";
	
	
	public static String ACCOUNT_DETAILS = "{\r\n" + 
			"	\"responseStatus\": \"complete\",\r\n" + 
			"	\"account\": {\r\n" + 
			"		\"status\": \"enabled\",\r\n" + 
			"		\"servicer\": {\r\n" + 
			"			\"identifier\": {\r\n" + 
			"				\"countryOfResidence\": \"NO\",\r\n" + 
			"				\"value\": \"977074010\",\r\n" + 
			"				\"type\": \"countryIdentificationCode\"\r\n" + 
			"			},\r\n" + 
			"			\"name\": \"DanskeBankA/S\"\r\n" + 
			"		},\r\n" + 
			"		\"accountIdentifier\": \"86015140110\",\r\n" + 
			"		\"accountReference\": \"3133121811\",\r\n" + 
			"		\"type\": \"salaryAccount\",\r\n" + 
			"		\"currency\": \"NOK\",\r\n" + 
			"		\"name\": \"TSTAkademikerne\",\r\n" + 
			"		\"balances\": null,\r\n" + 
			"		\"primaryOwner\": {\r\n" + 
			"			\"permission\": \"rightToUseAlone\",\r\n" + 
			"			\"identifier\": {\r\n" + 
			"				\"countryOfResidence\": \"NO\",\r\n" + 
			"				\"value\": \"21118048463\",\r\n" + 
			"				\"type\": \"nationalIdentityNumber\"\r\n" + 
			"			},\r\n" + 
			"			\"name\": \"TSTFREMSTAD\",\r\n" + 
			"			\"startDate\": \"2014-10-22\",\r\n" + 
			"			\"endDate\": \"\",\r\n" + 
			"			\"postalAddress\": {\r\n" + 
			"				\"postCode\": \"7550\",\r\n" + 
			"				\"type\": null,\r\n" + 
			"				\"streetName\": \"TSTSHAUGEN\",\r\n" + 
			"				\"buildingNumber\": \"13\",\r\n" + 
			"				\"townName\": \"\",\r\n" + 
			"				\"country\": \"NO\",\r\n" + 
			"				\"addressLines\": [\r\n" + 
			"					\"TSTSAUGEN13,7550TSTVIK\"\r\n" + 
			"				]\r\n" + 
			"			},\r\n" + 
			"			\"electronicAddresses\": []\r\n" + 
			"		},\r\n" + 
			"		\"startDate\": \"2014-10-22\",\r\n" + 
			"		\"endDate\": \"\"\r\n" + 
			"	}\r\n" + 
			"}";

	public static String ROLES = "{\r\n" + 
			"	\"responseStatus\": \"complete\",\r\n" + 
			"	\"roles\": [\r\n" + 
			"		{\r\n" + 
			"			\"permission\": \"rightToUseAlone\",\r\n" + 
			"			\"identifier\": {\r\n" + 
			"				\"countryOfResidence\": \"NO\",\r\n" + 
			"				\"value\": \"21118048463\",\r\n" + 
			"				\"type\": \"nationalIdentityNumber\"\r\n" + 
			"			},\r\n" + 
			"			\"name\": \"TSTFREMSTAD\",\r\n" + 
			"			\"startDate\": \"2014-10-22\",\r\n" + 
			"			\"endDate\": \"\",\r\n" + 
			"			\"postalAddress\": {\r\n" + 
			"				\"postCode\": \"7550\",\r\n" + 
			"				\"type\": \"residential\",\r\n" + 
			"				\"streetName\": \"TSTSAUGEN\",\r\n" + 
			"				\"buildingNumber\": \"13\",\r\n" + 
			"				\"townName\": \"\",\r\n" + 
			"				\"country\": \"NO\",\r\n" + 
			"				\"addressLines\": [\r\n" + 
			"					\"TSTSAUGEN13,7550TSTLVIK\"\r\n" + 
			"				]\r\n" + 
			"			},\r\n" + 
			"			\"electronicAddresses\": [\r\n" + 
			"				{\r\n" + 
			"					\"type\": \"phoneNumber\",\r\n" + 
			"					\"value\": \"93xxxx62\"\r\n" + 
			"				}\r\n" + 
			"			]\r\n" + 
			"		},\r\n" + 
			"		{\r\n" + 
			"			\"permission\": \"rightToUseAlone\",\r\n" + 
			"			\"identifier\": {\r\n" + 
			"				\"countryOfResidence\": \"NO\",\r\n" + 
			"				\"value\": \"07077744333\",\r\n" + 
			"				\"type\": \"nationalIdentityNumber\"\r\n" + 
			"			},\r\n" + 
			"			\"name\": \"TSTSOLEM\",\r\n" + 
			"			\"startDate\": \"2014-10-22\",\r\n" + 
			"			\"endDate\": \"\",\r\n" + 
			"			\"postalAddress\": {\r\n" + 
			"				\"postCode\": \"7550\",\r\n" + 
			"				\"type\": \"residential\",\r\n" + 
			"				\"streetName\": \"TSTHAUGEN\",\r\n" + 
			"				\"buildingNumber\": \"13\",\r\n" + 
			"				\"townName\": \"\",\r\n" + 
			"				\"country\": \"NO\",\r\n" + 
			"				\"addressLines\": [\r\n" + 
			"					\"TSTSAUGEN13,7550TSTLVIK\"\r\n" + 
			"				]\r\n" + 
			"			},\r\n" + 
			"			\"electronicAddresses\": [\r\n" + 
			"				{\r\n" + 
			"					\"type\": \"phoneNumber\",\r\n" + 
			"					\"value\": \"9xxxx269\"\r\n" + 
			"				}\r\n" + 
			"			]\r\n" + 
			"		}\r\n" + 
			"	]\r\n" + 
			"}";
	
	public static String  ACCOUNTS_TRANSACTION = "{\r\n" + 
			"	\"responseStatus\": \"complete\",\r\n" + 
			"	\"transactions\": [\r\n" + 
			"		{\r\n" + 
			"			\"transactionIdentifier\": \"DANSKEBANKTELESERVICETRANS.\",\r\n" + 
			"			\"references\": [\r\n" + 
			"				{\r\n" + 
			"					\"value\": \"1461739912\",\r\n" + 
			"					\"type\": \"archiveReference\"\r\n" + 
			"				}\r\n" + 
			"			],\r\n" + 
			"			\"creditDebitIndicator\": \"debit\",\r\n" + 
			"			\"reversalIndicator\": false,\r\n" + 
			"			\"status\": \"booked\",\r\n" + 
			"			\"transactionCode\": {\r\n" + 
			"				\"domain\": \"accountManagement\",\r\n" + 
			"				\"family\": \"additionalMiscellaneousCreditOperations\",\r\n" + 
			"				\"subFamily\": \"valueDate\",\r\n" + 
			"				\"freeText\": \"\"\r\n" + 
			"			},\r\n" + 
			"			\"bookingDate\": \"2019-08-28T10:23:38\",\r\n" + 
			"			\"valueDate\": \"2019-08-28T10:23:38\",\r\n" + 
			"			\"counterParties\": null,\r\n" + 
			"			\"additionalInfo\": \"DBT.TelenorNorge\",\r\n" + 
			"			\"currencyExchange\": null,\r\n" + 
			"			\"merchant\": \"\",\r\n" + 
			"			\"paymentCard\": {\r\n" + 
			"				\"cardIdentifier\": \"\",\r\n" + 
			"				\"holderName\": \"\",\r\n" + 
			"				\"startDate\": null,\r\n" + 
			"				\"expiryDate\": null,\r\n" + 
			"				\"cardIssuerName\": \"\",\r\n" + 
			"				\"type\": \"creditCard\",\r\n" + 
			"				\"cardIssuerIdentifier\": {\r\n" + 
			"					\"countryOfResidence\": \"\",\r\n" + 
			"					\"value\": \"\",\r\n" + 
			"					\"type\": \"nationalIdentityNumber\"\r\n" + 
			"				}\r\n" + 
			"			},\r\n" + 
			"			\"registered\": \"2019-08-27T10:23:38\",\r\n" + 
			"			\"amount\": -262.50,\r\n" + 
			"			\"currency\": \"NOK\"\r\n" + 
			"		},\r\n" + 
			"		{\r\n" + 
			"			\"transactionIdentifier\": \"Feecreatedbybundling\",\r\n" + 
			"			\"references\": [\r\n" + 
			"				{\r\n" + 
			"					\"value\": \"1600075407\",\r\n" + 
			"					\"type\": \"archiveReference\"\r\n" + 
			"				}\r\n" + 
			"			],\r\n" + 
			"			\"creditDebitIndicator\": \"debit\",\r\n" + 
			"			\"reversalIndicator\": false,\r\n" + 
			"			\"status\": \"booked\",\r\n" + 
			"			\"transactionCode\": {\r\n" + 
			"				\"domain\": \"accountManagement\",\r\n" + 
			"				\"family\": \"additionalMiscellaneousCreditOperations\",\r\n" + 
			"				\"subFamily\": \"valueDate\",\r\n" + 
			"				\"freeText\": \"\"\r\n" + 
			"			},\r\n" + 
			"			\"bookingDate\": \"2019-08-30T10:23:38\",\r\n" + 
			"			\"valueDate\": \"2019-09-01T10:23:38\",\r\n" + 
			"			\"counterParties\": null,\r\n" + 
			"			\"additionalInfo\": \"GBNOTA\",\r\n" + 
			"			\"currencyExchange\": null,\r\n" + 
			"			\"merchant\": \"\",\r\n" + 
			"			\"paymentCard\": {\r\n" + 
			"				\"cardIdentifier\": \"\",\r\n" + 
			"				\"holderName\": \"\",\r\n" + 
			"				\"startDate\":null,\r\n" + 
			"				\"expiryDate\":null,\r\n" + 
			"				\"cardIssuerName\": \"\",\r\n" + 
			"				\"type\": \"creditCard\",\r\n" + 
			"				\"cardIssuerIdentifier\": {\r\n" + 
			"					\"countryOfResidence\": \"\",\r\n" + 
			"					\"value\": \"\",\r\n" + 
			"					\"type\": \"nationalIdentityNumber\"\r\n" + 
			"				}\r\n" + 
			"			},\r\n" + 
			"			\"registered\": \"2019-08-30T10:23:38\",\r\n" + 
			"			\"amount\": -112.00,\r\n" + 
			"			\"currency\": \"NOK\"\r\n" + 
			"		},\r\n" + 
			"		{\r\n" + 
			"			\"transactionIdentifier\": \"\",\r\n" + 
			"			\"references\": [\r\n" + 
			"				{\r\n" + 
			"					\"value\": \"\",\r\n" + 
			"					\"type\": \"archiveReference\"\r\n" + 
			"				}\r\n" + 
			"			],\r\n" + 
			"			\"creditDebitIndicator\": \"credit\",\r\n" + 
			"			\"reversalIndicator\": false,\r\n" + 
			"			\"status\": \"booked\",\r\n" + 
			"			\"transactionCode\": {\r\n" + 
			"				\"domain\": \"accountManagement\",\r\n" + 
			"				\"family\": \"additionalMiscellaneousCreditOperations\",\r\n" + 
			"				\"subFamily\": \"valueDate\",\r\n" + 
			"				\"freeText\": \"\"\r\n" + 
			"			},\r\n" + 
			"			\"bookingDate\": \"2019-09-02T10:23:38\",\r\n" + 
			"			\"valueDate\": \"2019-09-02T10:23:38\",\r\n" + 
			"			\"counterParties\": null,\r\n" + 
			"			\"additionalInfo\": \"S1033825-0072262124\",\r\n" + 
			"			\"currencyExchange\": null,\r\n" + 
			"			\"merchant\": \"\",\r\n" + 
			"			\"paymentCard\": {\r\n" + 
			"				\"cardIdentifier\": \"\",\r\n" + 
			"				\"holderName\": \"\",\r\n" + 
			"				\"startDate\": null,\r\n" + 
			"				\"expiryDate\": null,\r\n" + 
			"				\"cardIssuerName\": \"\",\r\n" + 
			"				\"type\": \"creditCard\",\r\n" + 
			"				\"cardIssuerIdentifier\": {\r\n" + 
			"					\"countryOfResidence\": \"\",\r\n" + 
			"					\"value\": \"\",\r\n" + 
			"					\"type\": \"nationalIdentityNumber\"\r\n" + 
			"				}\r\n" + 
			"			},\r\n" + 
			"			\"registered\": \"2019-09-02T10:23:38\",\r\n" + 
			"			\"amount\": 1200000.00,\r\n" + 
			"			\"currency\": \"NOK\"\r\n" + 
			"		},\r\n" + 
			"		{\r\n" + 
			"			\"transactionIdentifier\": \"DANSKEBANKTELESERVICETRANS.\",\r\n" + 
			"			\"references\": [\r\n" + 
			"				{\r\n" + 
			"					\"value\": \"1425728377\",\r\n" + 
			"					\"type\": \"archiveReference\"\r\n" + 
			"				}\r\n" + 
			"			],\r\n" + 
			"			\"creditDebitIndicator\": \"debit\",\r\n" + 
			"			\"reversalIndicator\": false,\r\n" + 
			"			\"status\": \"booked\",\r\n" + 
			"			\"transactionCode\": {\r\n" + 
			"				\"domain\": \"accountManagement\",\r\n" + 
			"				\"family\": \"additionalMiscellaneousCreditOperations\",\r\n" + 
			"				\"subFamily\": \"valueDate\",\r\n" + 
			"				\"freeText\": \"\"\r\n" + 
			"			},\r\n" + 
			"			\"bookingDate\": \"2019-09-02T10:23:38\",\r\n" + 
			"			\"valueDate\": \"2019-09-02T10:23:38\",\r\n" + 
			"			\"counterParties\": null,\r\n" + 
			"			\"additionalInfo\": \"DBT.Momsmaj-juni2019\",\r\n" + 
			"			\"currencyExchange\": null,\r\n" + 
			"			\"merchant\": \"\",\r\n" + 
			"			\"paymentCard\": {\r\n" + 
			"				\"cardIdentifier\": \"\",\r\n" + 
			"				\"holderName\": \"\",\r\n" + 
			"				\"startDate\": null,\r\n" + 
			"				\"expiryDate\": null,\r\n" + 
			"				\"cardIssuerName\": \"\",\r\n" + 
			"				\"type\": \"creditCard\",\r\n" + 
			"				\"cardIssuerIdentifier\": {\r\n" + 
			"					\"countryOfResidence\": \"\",\r\n" + 
			"					\"value\": \"\",\r\n" + 
			"					\"type\": \"nationalIdentityNumber\"\r\n" + 
			"				}\r\n" + 
			"			},\r\n" + 
			"			\"registered\": \"2019-09-02T10:23:38\",\r\n" + 
			"			\"amount\": -1110019.00,\r\n" + 
			"			\"currency\": \"NOK\"\r\n" + 
			"		},\r\n" + 
			"		{\r\n" + 
			"			\"transactionIdentifier\": \"DANSKEBANKTELESERVICETRANS.\",\r\n" + 
			"			\"references\": [\r\n" + 
			"				{\r\n" + 
			"					\"value\": \"1457131029\",\r\n" + 
			"					\"type\": \"archiveReference\"\r\n" + 
			"				}\r\n" + 
			"			],\r\n" + 
			"			\"creditDebitIndicator\": \"debit\",\r\n" + 
			"			\"reversalIndicator\": false,\r\n" + 
			"			\"status\": \"booked\",\r\n" + 
			"			\"transactionCode\": {\r\n" + 
			"				\"domain\": \"accountManagement\",\r\n" + 
			"				\"family\": \"additionalMiscellaneousCreditOperations\",\r\n" + 
			"				\"subFamily\": \"valueDate\",\r\n" + 
			"				\"freeText\": \"\"\r\n" + 
			"			},\r\n" + 
			"			\"bookingDate\": \"2019-09-05T10:23:38\",\r\n" + 
			"			\"valueDate\": \"2019-09-05T10:23:38\",\r\n" + 
			"			\"counterParties\": null,\r\n" + 
			"			\"additionalInfo\": \"DBT.1103981264\",\r\n" + 
			"			\"currencyExchange\": null,\r\n" + 
			"			\"merchant\": \"\",\r\n" + 
			"			\"paymentCard\": {\r\n" + 
			"				\"cardIdentifier\": \"\",\r\n" + 
			"				\"holderName\": \"\",\r\n" + 
			"				\"startDate\": null,\r\n" + 
			"				\"expiryDate\": null,\r\n" + 
			"				\"cardIssuerName\": \"\",\r\n" + 
			"				\"type\": \"creditCard\",\r\n" + 
			"				\"cardIssuerIdentifier\": {\r\n" + 
			"					\"countryOfResidence\": \"\",\r\n" + 
			"					\"value\": \"\",\r\n" + 
			"					\"type\": \"nationalIdentityNumber\"\r\n" + 
			"				}\r\n" + 
			"			},\r\n" + 
			"			\"registered\": \"2019-09-04T10:23:38\",\r\n" + 
			"			\"amount\": -262.50,\r\n" + 
			"			\"currency\": \"NOK\"\r\n" + 
			"		},\r\n" + 
			"		{\r\n" + 
			"			\"transactionIdentifier\": \"\",\r\n" + 
			"			\"references\": [\r\n" + 
			"				{\r\n" + 
			"					\"value\": \"679880756\",\r\n" + 
			"					\"type\": \"archiveReference\"\r\n" + 
			"				}\r\n" + 
			"			],\r\n" + 
			"			\"creditDebitIndicator\": \"credit\",\r\n" + 
			"			\"reversalIndicator\": false,\r\n" + 
			"			\"status\": \"booked\",\r\n" + 
			"			\"transactionCode\": {\r\n" + 
			"				\"domain\": \"accountManagement\",\r\n" + 
			"				\"family\": \"additionalMiscellaneousCreditOperations\",\r\n" + 
			"				\"subFamily\": \"valueDate\",\r\n" + 
			"				\"freeText\": \"\"\r\n" + 
			"			},\r\n" + 
			"			\"bookingDate\": \"2019-09-10T10:23:38\",\r\n" + 
			"			\"valueDate\": \"2019-09-10T10:23:38\",\r\n" + 
			"			\"counterParties\": null,\r\n" + 
			"			\"additionalInfo\": \"NO030121197\",\r\n" + 
			"			\"currencyExchange\": null,\r\n" + 
			"			\"merchant\": \"\",\r\n" + 
			"			\"paymentCard\": {\r\n" + 
			"				\"cardIdentifier\": \"\",\r\n" + 
			"				\"holderName\": \"\",\r\n" + 
			"				\"startDate\": null,\r\n" + 
			"				\"expiryDate\": null,\r\n" + 
			"				\"cardIssuerName\": \"\",\r\n" + 
			"				\"type\": \"creditCard\",\r\n" + 
			"				\"cardIssuerIdentifier\": {\r\n" + 
			"					\"countryOfResidence\": \"\",\r\n" + 
			"					\"value\": \"\",\r\n" + 
			"					\"type\": \"nationalIdentityNumber\"\r\n" + 
			"				}\r\n" + 
			"			},\r\n" + 
			"			\"registered\": \"2019-09-10T10:23:38\",\r\n" + 
			"			\"amount\": 6960.00,\r\n" + 
			"			\"currency\": \"NOK\"\r\n" + 
			"		},\r\n" + 
			"		{\r\n" + 
			"			\"transactionIdentifier\": \"DANSKEBANKTELESERVICETRANS.\",\r\n" + 
			"			\"references\": [\r\n" + 
			"				{\r\n" + 
			"					\"value\": \"1470033441\",\r\n" + 
			"					\"type\": \"archiveReference\"\r\n" + 
			"				}\r\n" + 
			"			],\r\n" + 
			"			\"creditDebitIndicator\": \"debit\",\r\n" + 
			"			\"reversalIndicator\": false,\r\n" + 
			"			\"status\": \"booked\",\r\n" + 
			"			\"transactionCode\": {\r\n" + 
			"				\"domain\": \"accountManagement\",\r\n" + 
			"				\"family\": \"additionalMiscellaneousCreditOperations\",\r\n" + 
			"				\"subFamily\": \"valueDate\",\r\n" + 
			"				\"freeText\": \"\"\r\n" + 
			"			},\r\n" + 
			"			\"bookingDate\": \"2019-09-12T10:23:38\",\r\n" + 
			"			\"valueDate\": \"2019-09-12T10:23:38\",\r\n" + 
			"			\"counterParties\": null,\r\n" + 
			"			\"additionalInfo\": \"DBT.5680nardo\",\r\n" + 
			"			\"currencyExchange\": null,\r\n" + 
			"			\"merchant\": \"\",\r\n" + 
			"			\"paymentCard\": {\r\n" + 
			"				\"cardIdentifier\": \"\",\r\n" + 
			"				\"holderName\": \"\",\r\n" + 
			"				\"startDate\": null,\r\n" + 
			"				\"expiryDate\": null,\r\n" + 
			"				\"cardIssuerName\": \"\",\r\n" + 
			"				\"type\": \"creditCard\",\r\n" + 
			"				\"cardIssuerIdentifier\": {\r\n" + 
			"					\"countryOfResidence\": \"\",\r\n" + 
			"					\"value\": \"\",\r\n" + 
			"					\"type\": \"nationalIdentityNumber\"\r\n" + 
			"				}\r\n" + 
			"			},\r\n" + 
			"			\"registered\": \"2019-09-11T10:23:38\",\r\n" + 
			"			\"amount\": -21604.00,\r\n" + 
			"			\"currency\": \"NOK\"\r\n" + 
			"		},\r\n" + 
			"		{\r\n" + 
			"			\"transactionIdentifier\": \"Feecreatedbybundling\",\r\n" + 
			"			\"references\": [\r\n" + 
			"				{\r\n" + 
			"					\"value\": \"1600148057\",\r\n" + 
			"					\"type\": \"archiveReference\"\r\n" + 
			"				}\r\n" + 
			"			],\r\n" + 
			"			\"creditDebitIndicator\": \"debit\",\r\n" + 
			"			\"reversalIndicator\": false,\r\n" + 
			"			\"status\": \"booked\",\r\n" + 
			"			\"transactionCode\": {\r\n" + 
			"				\"domain\": \"accountManagement\",\r\n" + 
			"				\"family\": \"additionalMiscellaneousCreditOperations\",\r\n" + 
			"				\"subFamily\": \"valueDate\",\r\n" + 
			"				\"freeText\": \"\"\r\n" + 
			"			},\r\n" + 
			"			\"bookingDate\": \"2019-09-30T10:23:38\",\r\n" + 
			"			\"valueDate\": \"2019-10-01T10:23:38\",\r\n" + 
			"			\"counterParties\": null,\r\n" + 
			"			\"additionalInfo\": \"GBNOTA\",\r\n" + 
			"			\"currencyExchange\": null,\r\n" + 
			"			\"merchant\": \"\",\r\n" + 
			"			\"paymentCard\": {\r\n" + 
			"				\"cardIdentifier\": \"\",\r\n" + 
			"				\"holderName\": \"\",\r\n" + 
			"				\"startDate\": null,\r\n" + 
			"				\"expiryDate\": null,\r\n" + 
			"				\"cardIssuerName\": \"\",\r\n" + 
			"				\"type\": \"creditCard\",\r\n" + 
			"				\"cardIssuerIdentifier\": {\r\n" + 
			"					\"countryOfResidence\": \"\",\r\n" + 
			"					\"value\": \"\",\r\n" + 
			"					\"type\": \"nationalIdentityNumber\"\r\n" + 
			"				}\r\n" + 
			"			},\r\n" + 
			"			\"registered\": \"2019-09-30T10:23:38\",\r\n" + 
			"			\"amount\": -112.00,\r\n" + 
			"			\"currency\": \"NOK\"\r\n" + 
			"		},\r\n" + 
			"		{\r\n" + 
			"			\"transactionIdentifier\": \"DANSKEBANKTELESERVICETRANS.\",\r\n" + 
			"			\"references\": [\r\n" + 
			"				{\r\n" + 
			"					\"value\": \"1494066838\",\r\n" + 
			"					\"type\": \"archiveReference\"\r\n" + 
			"				}\r\n" + 
			"			],\r\n" + 
			"			\"creditDebitIndicator\": \"debit\",\r\n" + 
			"			\"reversalIndicator\": false,\r\n" + 
			"			\"status\": \"booked\",\r\n" + 
			"			\"transactionCode\": {\r\n" + 
			"				\"domain\": \"accountManagement\",\r\n" + 
			"				\"family\": \"additionalMiscellaneousCreditOperations\",\r\n" + 
			"				\"subFamily\": \"valueDate\",\r\n" + 
			"				\"freeText\": \"\"\r\n" + 
			"			},\r\n" + 
			"			\"bookingDate\": \"2019-10-04T10:23:38\",\r\n" + 
			"			\"valueDate\": \"2019-10-04T10:23:38\",\r\n" + 
			"			\"counterParties\": null,\r\n" + 
			"			\"additionalInfo\": \"DBT.4210071702\",\r\n" + 
			"			\"currencyExchange\": null,\r\n" + 
			"			\"merchant\": \"\",\r\n" + 
			"			\"paymentCard\": {\r\n" + 
			"				\"cardIdentifier\": \"\",\r\n" + 
			"				\"holderName\": \"\",\r\n" + 
			"				\"startDate\": null,\r\n" + 
			"				\"expiryDate\": null,\r\n" + 
			"				\"cardIssuerName\": \"\",\r\n" + 
			"				\"type\": \"creditCard\",\r\n" + 
			"				\"cardIssuerIdentifier\": {\r\n" + 
			"					\"countryOfResidence\": \"\",\r\n" + 
			"					\"value\": \"\",\r\n" + 
			"					\"type\": \"nationalIdentityNumber\"\r\n" + 
			"				}\r\n" + 
			"			},\r\n" + 
			"			\"registered\": \"2019-10-03T10:23:38\",\r\n" + 
			"			\"amount\": -4073.00,\r\n" + 
			"			\"currency\": \"NOK\"\r\n" + 
			"		},\r\n" + 
			"		{\r\n" + 
			"			\"transactionIdentifier\": \"DANSKEBANKTELESERVICETRANS.\",\r\n" + 
			"			\"references\": [\r\n" + 
			"				{\r\n" + 
			"					\"value\": \"1494067037\",\r\n" + 
			"					\"type\": \"archiveReference\"\r\n" + 
			"				}\r\n" + 
			"			],\r\n" + 
			"			\"creditDebitIndicator\": \"debit\",\r\n" + 
			"			\"reversalIndicator\": false,\r\n" + 
			"			\"status\": \"booked\",\r\n" + 
			"			\"transactionCode\": {\r\n" + 
			"				\"domain\": \"accountManagement\",\r\n" + 
			"				\"family\": \"additionalMiscellaneousCreditOperations\",\r\n" + 
			"				\"subFamily\": \"valueDate\",\r\n" + 
			"				\"freeText\": \"\"\r\n" + 
			"			},\r\n" + 
			"			\"bookingDate\": \"2019-10-04T10:23:38\",\r\n" + 
			"			\"valueDate\": \"2019-10-04T10:23:38\",\r\n" + 
			"			\"counterParties\": null,\r\n" + 
			"			\"additionalInfo\": \"DBT.4210071900\",\r\n" + 
			"			\"currencyExchange\": null,\r\n" + 
			"			\"merchant\": \"\",\r\n" + 
			"			\"paymentCard\": {\r\n" + 
			"				\"cardIdentifier\": \"\",\r\n" + 
			"				\"holderName\": \"\",\r\n" + 
			"				\"startDate\": null,\r\n" + 
			"				\"expiryDate\": null,\r\n" + 
			"				\"cardIssuerName\": \"\",\r\n" + 
			"				\"type\": \"creditCard\",\r\n" + 
			"				\"cardIssuerIdentifier\": {\r\n" + 
			"					\"countryOfResidence\": \"\",\r\n" + 
			"					\"value\": \"\",\r\n" + 
			"					\"type\": \"nationalIdentityNumber\"\r\n" + 
			"				}\r\n" + 
			"			},\r\n" + 
			"			\"registered\": \"2019-10-03T10:23:38\",\r\n" + 
			"			\"amount\": -18051.00,\r\n" + 
			"			\"currency\": \"NOK\"\r\n" + 
			"		},\r\n" + 
			"		{\r\n" + 
			"			\"transactionIdentifier\": \"\",\r\n" + 
			"			\"references\": [\r\n" + 
			"				{\r\n" + 
			"					\"value\": \"\",\r\n" + 
			"					\"type\": \"archiveReference\"\r\n" + 
			"				}\r\n" + 
			"			],\r\n" + 
			"			\"creditDebitIndicator\": \"credit\",\r\n" + 
			"			\"reversalIndicator\": false,\r\n" + 
			"			\"status\": \"booked\",\r\n" + 
			"			\"transactionCode\": {\r\n" + 
			"				\"domain\": \"accountManagement\",\r\n" + 
			"				\"family\": \"additionalMiscellaneousCreditOperations\",\r\n" + 
			"				\"subFamily\": \"valueDate\",\r\n" + 
			"				\"freeText\": \"\"\r\n" + 
			"			},\r\n" + 
			"			\"bookingDate\": \"2019-10-10T10:23:38\",\r\n" + 
			"			\"valueDate\": \"2019-10-10T10:23:38\",\r\n" + 
			"			\"counterParties\": null,\r\n" + 
			"			\"additionalInfo\": \"S1033825-0074138182\",\r\n" + 
			"			\"currencyExchange\": null,\r\n" + 
			"			\"merchant\": \"\",\r\n" + 
			"			\"paymentCard\": {\r\n" + 
			"				\"cardIdentifier\": \"\",\r\n" + 
			"				\"holderName\": \"\",\r\n" + 
			"				\"startDate\": null,\r\n" + 
			"				\"expiryDate\": null,\r\n" + 
			"				\"cardIssuerName\": \"\",\r\n" + 
			"				\"type\": \"creditCard\",\r\n" + 
			"				\"cardIssuerIdentifier\": {\r\n" + 
			"					\"countryOfResidence\": \"\",\r\n" + 
			"					\"value\": \"\",\r\n" + 
			"					\"type\": \"nationalIdentityNumber\"\r\n" + 
			"				}\r\n" + 
			"			},\r\n" + 
			"			\"registered\": \"2019-10-10T10:23:38\",\r\n" + 
			"			\"amount\": 855000.00,\r\n" + 
			"			\"currency\": \"NOK\"\r\n" + 
			"		},\r\n" + 
			"		{\r\n" + 
			"			\"transactionIdentifier\": \"DANSKEBANKTELESERVICETRANS.\",\r\n" + 
			"			\"references\": [\r\n" + 
			"				{\r\n" + 
			"					\"value\": \"1480263756\",\r\n" + 
			"					\"type\": \"archiveReference\"\r\n" + 
			"				}\r\n" + 
			"			],\r\n" + 
			"			\"creditDebitIndicator\": \"debit\",\r\n" + 
			"			\"reversalIndicator\": false,\r\n" + 
			"			\"status\": \"booked\",\r\n" + 
			"			\"transactionCode\": {\r\n" + 
			"				\"domain\": \"accountManagement\",\r\n" + 
			"				\"family\": \"additionalMiscellaneousCreditOperations\",\r\n" + 
			"				\"subFamily\": \"valueDate\",\r\n" + 
			"				\"freeText\": \"\"\r\n" + 
			"			},\r\n" + 
			"			\"bookingDate\": \"2019-10-10T10:23:38\",\r\n" + 
			"			\"valueDate\": \"2019-10-10T10:23:38\",\r\n" + 
			"			\"counterParties\": null,\r\n" + 
			"			\"additionalInfo\": \"DBT.Momsjuli-aug2019\",\r\n" + 
			"			\"currencyExchange\": null,\r\n" + 
			"			\"merchant\": \"\",\r\n" + 
			"			\"paymentCard\": {\r\n" + 
			"				\"cardIdentifier\": \"\",\r\n" + 
			"				\"holderName\": \"\",\r\n" + 
			"				\"startDate\": null,\r\n" + 
			"				\"expiryDate\": null,\r\n" + 
			"				\"cardIssuerName\": \"\",\r\n" + 
			"				\"type\": \"creditCard\",\r\n" + 
			"				\"cardIssuerIdentifier\": {\r\n" + 
			"					\"countryOfResidence\": \"\",\r\n" + 
			"					\"value\": \"\",\r\n" + 
			"					\"type\": \"nationalIdentityNumber\"\r\n" + 
			"				}\r\n" + 
			"			},\r\n" + 
			"			\"registered\": \"2019-10-10T10:23:38\",\r\n" + 
			"			\"amount\": -928461.00,\r\n" + 
			"			\"currency\": \"NOK\"\r\n" + 
			"		},\r\n" + 
			"		{\r\n" + 
			"			\"transactionIdentifier\": \"DANSKEBANKTELESERVICETRANS.\",\r\n" + 
			"			\"references\": [\r\n" + 
			"				{\r\n" + 
			"					\"value\": \"1498247777\",\r\n" + 
			"					\"type\": \"archiveReference\"\r\n" + 
			"				}\r\n" + 
			"			],\r\n" + 
			"			\"creditDebitIndicator\": \"debit\",\r\n" + 
			"			\"reversalIndicator\": false,\r\n" + 
			"			\"status\": \"booked\",\r\n" + 
			"			\"transactionCode\": {\r\n" + 
			"				\"domain\": \"accountManagement\",\r\n" + 
			"				\"family\": \"additionalMiscellaneousCreditOperations\",\r\n" + 
			"				\"subFamily\": \"valueDate\",\r\n" + 
			"				\"freeText\": \"\"\r\n" + 
			"			},\r\n" + 
			"			\"bookingDate\": \"2019-10-11T10:23:38\",\r\n" + 
			"			\"valueDate\": \"2019-10-11T10:23:38\",\r\n" + 
			"			\"counterParties\": null,\r\n" + 
			"			\"additionalInfo\": \"DBT.Fakt1269\",\r\n" + 
			"			\"currencyExchange\": null,\r\n" + 
			"			\"merchant\": \"\",\r\n" + 
			"			\"paymentCard\": {\r\n" + 
			"				\"cardIdentifier\": \"\",\r\n" + 
			"				\"holderName\": \"\",\r\n" + 
			"				\"startDate\": null,\r\n" + 
			"				\"expiryDate\": null,\r\n" + 
			"				\"cardIssuerName\": \"\",\r\n" + 
			"				\"type\": \"creditCard\",\r\n" + 
			"				\"cardIssuerIdentifier\": {\r\n" + 
			"					\"countryOfResidence\": \"\",\r\n" + 
			"					\"value\": \"\",\r\n" + 
			"					\"type\": \"nationalIdentityNumber\"\r\n" + 
			"				}\r\n" + 
			"			},\r\n" + 
			"			\"registered\": \"2019-10-10T10:23:38\",\r\n" + 
			"			\"amount\": -500.00,\r\n" + 
			"			\"currency\": \"NOK\"\r\n" + 
			"		},\r\n" + 
			"		{\r\n" + 
			"			\"transactionIdentifier\": \"DANSKEBANKTELESERVICETRANS.\",\r\n" + 
			"			\"references\": [\r\n" + 
			"				{\r\n" + 
			"					\"value\": \"1498872414\",\r\n" + 
			"					\"type\": \"archiveReference\"\r\n" + 
			"				}\r\n" + 
			"			],\r\n" + 
			"			\"creditDebitIndicator\": \"debit\",\r\n" + 
			"			\"reversalIndicator\": false,\r\n" + 
			"			\"status\": \"booked\",\r\n" + 
			"			\"transactionCode\": {\r\n" + 
			"				\"domain\": \"accountManagement\",\r\n" + 
			"				\"family\": \"additionalMiscellaneousCreditOperations\",\r\n" + 
			"				\"subFamily\": \"valueDate\",\r\n" + 
			"				\"freeText\": \"\"\r\n" + 
			"			},\r\n" + 
			"			\"bookingDate\": \"2019-10-14T10:23:38\",\r\n" + 
			"			\"valueDate\": \"2019-10-14T10:23:38\",\r\n" + 
			"			\"counterParties\": null,\r\n" + 
			"			\"additionalInfo\": \"DBT.1104114057\",\r\n" + 
			"			\"currencyExchange\": null,\r\n" + 
			"			\"merchant\": \"\",\r\n" + 
			"			\"paymentCard\": {\r\n" + 
			"				\"cardIdentifier\": \"\",\r\n" + 
			"				\"holderName\": \"\",\r\n" + 
			"				\"startDate\": null,\r\n" + 
			"				\"expiryDate\": null,\r\n" + 
			"				\"cardIssuerName\": \"\",\r\n" + 
			"				\"type\": \"creditCard\",\r\n" + 
			"				\"cardIssuerIdentifier\": {\r\n" + 
			"					\"countryOfResidence\": \"\",\r\n" + 
			"					\"value\": \"\",\r\n" + 
			"					\"type\": \"nationalIdentityNumber\"\r\n" + 
			"				}\r\n" + 
			"			},\r\n" + 
			"			\"registered\": \"2019-10-13T10:23:38\",\r\n" + 
			"			\"amount\": -654.10,\r\n" + 
			"			\"currency\": \"NOK\"\r\n" + 
			"		},\r\n" + 
			"		{\r\n" + 
			"			\"transactionIdentifier\": \"DANSKEBANKTELESERVICETRANS.\",\r\n" + 
			"			\"references\": [\r\n" + 
			"				{\r\n" + 
			"					\"value\": \"1498914074\",\r\n" + 
			"					\"type\": \"archiveReference\"\r\n" + 
			"				}\r\n" + 
			"			],\r\n" + 
			"			\"creditDebitIndicator\": \"debit\",\r\n" + 
			"			\"reversalIndicator\": false,\r\n" + 
			"			\"status\": \"booked\",\r\n" + 
			"			\"transactionCode\": {\r\n" + 
			"				\"domain\": \"accountManagement\",\r\n" + 
			"				\"family\": \"additionalMiscellaneousCreditOperations\",\r\n" + 
			"				\"subFamily\": \"valueDate\",\r\n" + 
			"				\"freeText\": \"\"\r\n" + 
			"			},\r\n" + 
			"			\"bookingDate\": \"2019-10-14T10:23:38\",\r\n" + 
			"			\"valueDate\": \"2019-10-14T10:23:38\",\r\n" + 
			"			\"counterParties\": null,\r\n" + 
			"			\"additionalInfo\": \"DBT.PWC\",\r\n" + 
			"			\"currencyExchange\": null,\r\n" + 
			"			\"merchant\": \"\",\r\n" + 
			"			\"paymentCard\": {\r\n" + 
			"				\"cardIdentifier\": \"\",\r\n" + 
			"				\"holderName\": \"\",\r\n" + 
			"				\"startDate\": null,\r\n" + 
			"				\"expiryDate\": null,\r\n" + 
			"				\"cardIssuerName\": \"\",\r\n" + 
			"				\"type\": \"creditCard\",\r\n" + 
			"				\"cardIssuerIdentifier\": {\r\n" + 
			"					\"countryOfResidence\": \"\",\r\n" + 
			"					\"value\": \"\",\r\n" + 
			"					\"type\": \"nationalIdentityNumber\"\r\n" + 
			"				}\r\n" + 
			"			},\r\n" + 
			"			\"registered\": \"2019-10-13T10:23:38\",\r\n" + 
			"			\"amount\": -3219.00,\r\n" + 
			"			\"currency\": \"NOK\"\r\n" + 
			"		},\r\n" + 
			"		{\r\n" + 
			"			\"transactionIdentifier\": \"DANSKEBANKTELESERVICETRANS.\",\r\n" + 
			"			\"references\": [\r\n" + 
			"				{\r\n" + 
			"					\"value\": \"1506443138\",\r\n" + 
			"					\"type\": \"archiveReference\"\r\n" + 
			"				}\r\n" + 
			"			],\r\n" + 
			"			\"creditDebitIndicator\": \"debit\",\r\n" + 
			"			\"reversalIndicator\": false,\r\n" + 
			"			\"status\": \"booked\",\r\n" + 
			"			\"transactionCode\": {\r\n" + 
			"				\"domain\": \"accountManagement\",\r\n" + 
			"				\"family\": \"additionalMiscellaneousCreditOperations\",\r\n" + 
			"				\"subFamily\": \"valueDate\",\r\n" + 
			"				\"freeText\": \"\"\r\n" + 
			"			},\r\n" + 
			"			\"bookingDate\": \"2019-10-24T10:23:38\",\r\n" + 
			"			\"valueDate\": \"2019-10-24T10:23:38\",\r\n" + 
			"			\"counterParties\": null,\r\n" + 
			"			\"additionalInfo\": \"DBT.16089435Vegsamot\",\r\n" + 
			"			\"currencyExchange\": null,\r\n" + 
			"			\"merchant\": \"\",\r\n" + 
			"			\"paymentCard\": {\r\n" + 
			"				\"cardIdentifier\": \"\",\r\n" + 
			"				\"holderName\": \"\",\r\n" + 
			"				\"startDate\": null,\r\n" + 
			"				\"expiryDate\": null,\r\n" + 
			"				\"cardIssuerName\": \"\",\r\n" + 
			"				\"type\": \"creditCard\",\r\n" + 
			"				\"cardIssuerIdentifier\": {\r\n" + 
			"					\"countryOfResidence\": \"\",\r\n" + 
			"					\"value\": \"\",\r\n" + 
			"					\"type\": \"nationalIdentityNumber\"\r\n" + 
			"				}\r\n" + 
			"			},\r\n" + 
			"			\"registered\": \"2019-10-23T10:23:38\",\r\n" + 
			"			\"amount\": -146.40,\r\n" + 
			"			\"currency\": \"NOK\"\r\n" + 
			"		},\r\n" + 
			"		{\r\n" + 
			"			\"transactionIdentifier\": \"DANSKEBANKTELESERVICETRANS.\",\r\n" + 
			"			\"references\": [\r\n" + 
			"				{\r\n" + 
			"					\"value\": \"1503527299\",\r\n" + 
			"					\"type\": \"archiveReference\"\r\n" + 
			"				}\r\n" + 
			"			],\r\n" + 
			"			\"creditDebitIndicator\": \"debit\",\r\n" + 
			"			\"reversalIndicator\": false,\r\n" + 
			"			\"status\": \"booked\",\r\n" + 
			"			\"transactionCode\": {\r\n" + 
			"				\"domain\": \"accountManagement\",\r\n" + 
			"				\"family\": \"additionalMiscellaneousCreditOperations\",\r\n" + 
			"				\"subFamily\": \"valueDate\",\r\n" + 
			"				\"freeText\": \"\"\r\n" + 
			"			},\r\n" + 
			"			\"bookingDate\": \"2019-10-25T10:23:38\",\r\n" + 
			"			\"valueDate\": \"2019-10-25T10:23:38\",\r\n" + 
			"			\"counterParties\": null,\r\n" + 
			"			\"additionalInfo\": \"DBT.41306644\",\r\n" + 
			"			\"currencyExchange\": null,\r\n" + 
			"			\"merchant\": \"\",\r\n" + 
			"			\"paymentCard\": {\r\n" + 
			"				\"cardIdentifier\": \"\",\r\n" + 
			"				\"holderName\": \"\",\r\n" + 
			"				\"startDate\": null,\r\n" + 
			"				\"expiryDate\": null,\r\n" + 
			"				\"cardIssuerName\": \"\",\r\n" + 
			"				\"type\": \"creditCard\",\r\n" + 
			"				\"cardIssuerIdentifier\": {\r\n" + 
			"					\"countryOfResidence\": \"\",\r\n" + 
			"					\"value\": \"\",\r\n" + 
			"					\"type\": \"nationalIdentityNumber\"\r\n" + 
			"				}\r\n" + 
			"			},\r\n" + 
			"			\"registered\": \"2019-10-24T10:23:38\",\r\n" + 
			"			\"amount\": -1485.00,\r\n" + 
			"			\"currency\": \"NOK\"\r\n" + 
			"		},\r\n" + 
			"		{\r\n" + 
			"			\"transactionIdentifier\": \"DANSKEBANKTELESERVICETRANS.\",\r\n" + 
			"			\"references\": [\r\n" + 
			"				{\r\n" + 
			"					\"value\": \"1509777828\",\r\n" + 
			"					\"type\": \"archiveReference\"\r\n" + 
			"				}\r\n" + 
			"			],\r\n" + 
			"			\"creditDebitIndicator\": \"debit\",\r\n" + 
			"			\"reversalIndicator\": false,\r\n" + 
			"			\"status\": \"booked\",\r\n" + 
			"			\"transactionCode\": {\r\n" + 
			"				\"domain\": \"accountManagement\",\r\n" + 
			"				\"family\": \"additionalMiscellaneousCreditOperations\",\r\n" + 
			"				\"subFamily\": \"valueDate\",\r\n" + 
			"				\"freeText\": \"\"\r\n" + 
			"			},\r\n" + 
			"			\"bookingDate\": \"2019-10-31T10:23:38\",\r\n" + 
			"			\"valueDate\": \"2019-10-31T10:23:38\",\r\n" + 
			"			\"counterParties\": null,\r\n" + 
			"			\"additionalInfo\": \"DBT.41312282\",\r\n" + 
			"			\"currencyExchange\": null,\r\n" + 
			"			\"merchant\": \"\",\r\n" + 
			"			\"paymentCard\": {\r\n" + 
			"				\"cardIdentifier\": \"\",\r\n" + 
			"				\"holderName\": \"\",\r\n" + 
			"				\"startDate\": null,\r\n" + 
			"				\"expiryDate\": null,\r\n" + 
			"				\"cardIssuerName\": \"\",\r\n" + 
			"				\"type\": \"creditCard\",\r\n" + 
			"				\"cardIssuerIdentifier\": {\r\n" + 
			"					\"countryOfResidence\": \"\",\r\n" + 
			"					\"value\": \"\",\r\n" + 
			"					\"type\": \"nationalIdentityNumber\"\r\n" + 
			"				}\r\n" + 
			"			},\r\n" + 
			"			\"registered\": \"2019-10-30T10:23:38\",\r\n" + 
			"			\"amount\": -125.00,\r\n" + 
			"			\"currency\": \"NOK\"\r\n" + 
			"		},\r\n" + 
			"		{\r\n" + 
			"			\"transactionIdentifier\": \"Feecreatedbybundling\",\r\n" + 
			"			\"references\": [\r\n" + 
			"				{\r\n" + 
			"					\"value\": \"1600078820\",\r\n" + 
			"					\"type\": \"archiveReference\"\r\n" + 
			"				}\r\n" + 
			"			],\r\n" + 
			"			\"creditDebitIndicator\": \"debit\",\r\n" + 
			"			\"reversalIndicator\": false,\r\n" + 
			"			\"status\": \"booked\",\r\n" + 
			"			\"transactionCode\": {\r\n" + 
			"				\"domain\": \"accountManagement\",\r\n" + 
			"				\"family\": \"additionalMiscellaneousCreditOperations\",\r\n" + 
			"				\"subFamily\": \"valueDate\",\r\n" + 
			"				\"freeText\": \"\"\r\n" + 
			"			},\r\n" + 
			"			\"bookingDate\": \"2019-10-31T10:23:38\",\r\n" + 
			"			\"valueDate\": \"2019-11-01T10:23:38\",\r\n" + 
			"			\"counterParties\": null,\r\n" + 
			"			\"additionalInfo\": \"GBNOTA\",\r\n" + 
			"			\"currencyExchange\": null,\r\n" + 
			"			\"merchant\": \"\",\r\n" + 
			"			\"paymentCard\": {\r\n" + 
			"				\"cardIdentifier\": \"\",\r\n" + 
			"				\"holderName\": \"\",\r\n" + 
			"				\"startDate\": null,\r\n" + 
			"				\"expiryDate\": null,\r\n" + 
			"				\"cardIssuerName\": \"\",\r\n" + 
			"				\"type\": \"creditCard\",\r\n" + 
			"				\"cardIssuerIdentifier\": {\r\n" + 
			"					\"countryOfResidence\": \"\",\r\n" + 
			"					\"value\": \"\",\r\n" + 
			"					\"type\": \"nationalIdentityNumber\"\r\n" + 
			"				}\r\n" + 
			"			},\r\n" + 
			"			\"registered\": \"2019-10-31T10:23:38\",\r\n" + 
			"			\"amount\": -112.00,\r\n" + 
			"			\"currency\": \"NOK\"\r\n" + 
			"		},\r\n" + 
			"		{\r\n" + 
			"			\"transactionIdentifier\": \"DANSKEBANKTELESERVICETRANS.\",\r\n" + 
			"			\"references\": [\r\n" + 
			"				{\r\n" + 
			"					\"value\": \"1506443734\",\r\n" + 
			"					\"type\": \"archiveReference\"\r\n" + 
			"				}\r\n" + 
			"			],\r\n" + 
			"			\"creditDebitIndicator\": \"debit\",\r\n" + 
			"			\"reversalIndicator\": false,\r\n" + 
			"			\"status\": \"booked\",\r\n" + 
			"			\"transactionCode\": {\r\n" + 
			"				\"domain\": \"accountManagement\",\r\n" + 
			"				\"family\": \"additionalMiscellaneousCreditOperations\",\r\n" + 
			"				\"subFamily\": \"valueDate\",\r\n" + 
			"				\"freeText\": \"\"\r\n" + 
			"			},\r\n" + 
			"			\"bookingDate\": \"2019-11-01T10:23:38\",\r\n" + 
			"			\"valueDate\": \"2019-11-01T10:23:38\",\r\n" + 
			"			\"counterParties\": null,\r\n" + 
			"			\"additionalInfo\": \"DBT.39504421\",\r\n" + 
			"			\"currencyExchange\": null,\r\n" + 
			"			\"merchant\": \"\",\r\n" + 
			"			\"paymentCard\": {\r\n" + 
			"				\"cardIdentifier\": \"\",\r\n" + 
			"				\"holderName\": \"\",\r\n" + 
			"				\"startDate\": null,\r\n" + 
			"				\"expiryDate\": null,\r\n" + 
			"				\"cardIssuerName\": \"\",\r\n" + 
			"				\"type\": \"creditCard\",\r\n" + 
			"				\"cardIssuerIdentifier\": {\r\n" + 
			"					\"countryOfResidence\": \"\",\r\n" + 
			"					\"value\": \"\",\r\n" + 
			"					\"type\": \"nationalIdentityNumber\"\r\n" + 
			"				}\r\n" + 
			"			},\r\n" + 
			"			\"registered\": \"2019-10-31T10:23:38\",\r\n" + 
			"			\"amount\": -1513.00,\r\n" + 
			"			\"currency\": \"NOK\"\r\n" + 
			"		},\r\n" + 
			"		{\r\n" + 
			"			\"transactionIdentifier\": \"DANSKEBANKTELESERVICETRANS.\",\r\n" + 
			"			\"references\": [\r\n" + 
			"				{\r\n" + 
			"					\"value\": \"1501880754\",\r\n" + 
			"					\"type\": \"archiveReference\"\r\n" + 
			"				}\r\n" + 
			"			],\r\n" + 
			"			\"creditDebitIndicator\": \"debit\",\r\n" + 
			"			\"reversalIndicator\": false,\r\n" + 
			"			\"status\": \"booked\",\r\n" + 
			"			\"transactionCode\": {\r\n" + 
			"				\"domain\": \"accountManagement\",\r\n" + 
			"				\"family\": \"additionalMiscellaneousCreditOperations\",\r\n" + 
			"				\"subFamily\": \"valueDate\",\r\n" + 
			"				\"freeText\": \"\"\r\n" + 
			"			},\r\n" + 
			"			\"bookingDate\": \"2019-11-04T10:23:38\",\r\n" + 
			"			\"valueDate\": \"2019-11-04T10:23:38\",\r\n" + 
			"			\"counterParties\": null,\r\n" + 
			"			\"additionalInfo\": \"DBT.1104256079\",\r\n" + 
			"			\"currencyExchange\": null,\r\n" + 
			"			\"merchant\": \"\",\r\n" + 
			"			\"paymentCard\": {\r\n" + 
			"				\"cardIdentifier\": \"\",\r\n" + 
			"				\"holderName\": \"\",\r\n" + 
			"				\"startDate\": null,\r\n" + 
			"				\"expiryDate\": null,\r\n" + 
			"				\"cardIssuerName\": \"\",\r\n" + 
			"				\"type\": \"creditCard\",\r\n" + 
			"				\"cardIssuerIdentifier\": {\r\n" + 
			"					\"countryOfResidence\": \"\",\r\n" + 
			"					\"value\": \"\",\r\n" + 
			"					\"type\": \"nationalIdentityNumber\"\r\n" + 
			"				}\r\n" + 
			"			},\r\n" + 
			"			\"registered\": \"2019-11-03T10:23:38\",\r\n" + 
			"			\"amount\": -262.50,\r\n" + 
			"			\"currency\": \"NOK\"\r\n" + 
			"		},\r\n" + 
			"		{\r\n" + 
			"			\"transactionIdentifier\": \"Outgoingforeignpayments\",\r\n" + 
			"			\"references\": [\r\n" + 
			"				{\r\n" + 
			"					\"value\": \"Outgoingforeignpayments\",\r\n" + 
			"					\"type\": \"archiveReference\"\r\n" + 
			"				}\r\n" + 
			"			],\r\n" + 
			"			\"creditDebitIndicator\": \"debit\",\r\n" + 
			"			\"reversalIndicator\": false,\r\n" + 
			"			\"status\": \"booked\",\r\n" + 
			"			\"transactionCode\": {\r\n" + 
			"				\"domain\": \"accountManagement\",\r\n" + 
			"				\"family\": \"additionalMiscellaneousCreditOperations\",\r\n" + 
			"				\"subFamily\": \"valueDate\",\r\n" + 
			"				\"freeText\": \"\"\r\n" + 
			"			},\r\n" + 
			"			\"bookingDate\": \"2019-11-12T10:23:38\",\r\n" + 
			"			\"valueDate\": \"2019-11-12T10:23:38\",\r\n" + 
			"			\"counterParties\": null,\r\n" + 
			"			\"additionalInfo\": \"DBTS1521454198\",\r\n" + 
			"			\"currencyExchange\": null,\r\n" + 
			"			\"merchant\": \"\",\r\n" + 
			"			\"paymentCard\": {\r\n" + 
			"				\"cardIdentifier\": \"\",\r\n" + 
			"				\"holderName\": \"\",\r\n" + 
			"				\"startDate\": null,\r\n" + 
			"				\"expiryDate\": null,\r\n" + 
			"				\"cardIssuerName\": \"\",\r\n" + 
			"				\"type\": \"creditCard\",\r\n" + 
			"				\"cardIssuerIdentifier\": {\r\n" + 
			"					\"countryOfResidence\": \"\",\r\n" + 
			"					\"value\": \"\",\r\n" + 
			"					\"type\": \"nationalIdentityNumber\"\r\n" + 
			"				}\r\n" + 
			"			},\r\n" + 
			"			\"registered\": \"2019-11-12T10:23:38\",\r\n" + 
			"			\"amount\": -1080.00,\r\n" + 
			"			\"currency\": \"NOK\"\r\n" + 
			"		},\r\n" + 
			"		{\r\n" + 
			"			\"transactionIdentifier\": \"Feecreatedbybundling\",\r\n" + 
			"			\"references\": [\r\n" + 
			"				{\r\n" + 
			"					\"value\": \"1600002237\",\r\n" + 
			"					\"type\": \"archiveReference\"\r\n" + 
			"				}\r\n" + 
			"			],\r\n" + 
			"			\"creditDebitIndicator\": \"debit\",\r\n" + 
			"			\"reversalIndicator\": false,\r\n" + 
			"			\"status\": \"booked\",\r\n" + 
			"			\"transactionCode\": {\r\n" + 
			"				\"domain\": \"accountManagement\",\r\n" + 
			"				\"family\": \"additionalMiscellaneousCreditOperations\",\r\n" + 
			"				\"subFamily\": \"valueDate\",\r\n" + 
			"				\"freeText\": \"\"\r\n" + 
			"			},\r\n" + 
			"			\"bookingDate\": \"2019-11-29T10:23:38\",\r\n" + 
			"			\"valueDate\": \"2019-12-01T10:23:38\",\r\n" + 
			"			\"counterParties\": null,\r\n" + 
			"			\"additionalInfo\": \"GBNOTA\",\r\n" + 
			"			\"currencyExchange\": null,\r\n" + 
			"			\"merchant\": \"\",\r\n" + 
			"			\"paymentCard\": {\r\n" + 
			"				\"cardIdentifier\": \"\",\r\n" + 
			"				\"holderName\": \"\",\r\n" + 
			"				\"startDate\": null,\r\n" + 
			"				\"expiryDate\": null,\r\n" + 
			"				\"cardIssuerName\": \"\",\r\n" + 
			"				\"type\": \"creditCard\",\r\n" + 
			"				\"cardIssuerIdentifier\": {\r\n" + 
			"					\"countryOfResidence\": \"\",\r\n" + 
			"					\"value\": \"\",\r\n" + 
			"					\"type\": \"nationalIdentityNumber\"\r\n" + 
			"				}\r\n" + 
			"			},\r\n" + 
			"			\"registered\": \"2019-12-01T10:23:38\",\r\n" + 
			"			\"amount\": -12.00,\r\n" + 
			"			\"currency\": \"NOK\"\r\n" + 
			"		}\r\n" + 
			"	],\r\n" + 
			"	\"links\": []\r\n" + 
			"}";
}