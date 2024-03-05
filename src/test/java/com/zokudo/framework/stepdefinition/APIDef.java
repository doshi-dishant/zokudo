package com.zokudo.framework.stepdefinition;

import java.util.LinkedHashMap;
import java.util.Map;

import org.apache.commons.lang.RandomStringUtils;
import org.testng.Assert;

import com.zokudo.constants.APIConstants;
import com.zokudo.framework.helper.API.APIHelper;
import com.zokudo.helper.PageObject.APIBody;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import io.restassured.response.Response;

public class APIDef {

//	private static final String EntityId1 = "4b16d080-594e-4f28-a73d-6e18b7ff96ee";
//	private static final String EntityId2 = "4c06fe14-3564-4d76-b5bb-2617c1ef6426";
//	private static final String EntityId3 = "89e9f493-ff6d-4e99-963b-f51178fae2d1";
//	private static final String EntityId4 = "2c550941-6abc-409e-bace-2ef75094b835";
//	private static final String Card1 = "18000035";
//	private static final String Card2 = "18000026";
//	private static final String Card3 = "18000027";
//	private static final String Card4 = "18000028";
//	private static final String Card5 = "126000032";
//	private static final String Card6 = "18000327";
//	private static final String Card7 = "18000086";
	private static final String EntityId1 = "72d0550c-3e30-4d18-8503-2d3c18a4edd5";
	private static final String EntityId2 = "ae7d88d1-52ec-4fb6-aea2-6d1828b0143c";
	private static final String EntityId3 = "86beb578-96fd-47cc-b7a5-d50e75e7bbf2";
	private static final String EntityId4 = "421bff79-aed9-44cd-95b7-82be28434819";
	private static final String EntityId5 = "826e8bae-672f-49d4-bdce-f77e1a3e293c";
	private static final String EntityId6 = "f69fffd1-44a6-4332-85f8-5e6749981b5c";
	private static final String EntityId7 = "3d1c220c-d849-494f-969e-aceab27e1a3a";
	private static final String EntityId8 = "17376f7b-d00c-42cf-b814-d605196e2d4e";
	private static final String EntityId9 = "344b246f-e193-4378-a196-5034137af332";
	private static final String EntityId10 = "91e9fa0a-8fdc-4c5d-9203-e7598a5a5d8a";
//	private static final String EntityId11 = "60eae9eb-d5cb-4375-a9b0-4c58c1fe4ca3";
	private static final String EntityId12 = "e9c612a1-b256-45e5-8299-0d5f2a4326de";
	private static final String EntityId13 = "67c789f0-fbb5-4fa6-b86e-ea20754a325c";
	private static final String EntityId14 = "ccc1b1f7-351f-46f6-bf3f-4b6fccb7f289";
	private static final String EntityId15 = "66abbf3d-a2b8-454b-a103-ea9fcf738a4d";
	private static final String EntityId16 = "f0c77686-e0df-447d-a0cc-77a35ab01b90";
	private static final String EntityId17 = "8cccf3a3-aec2-47c3-850f-0a55bf8528a3";
	private static final String EntityId18 = "bb3167b2-9b25-45bf-b370-1cf1ad4f944b";
	private static final String EntityId19 = "c1296dbe-4362-429f-9b07-8653c87b72bc";
	private static final String Card1 = "700000100";
	private static final String Card2 = "19530095";
	private static final String Card3 = "19530096";
	private static final String Card4 = "19530083";
	private static final String Card5 = "126000032";
	private static final String Card6 = "18000473";
	private static final String Card7 = "70000112";
	private static final String Card8 = "700000119";
	private static final String Card9 = "31000117";
	private static final String Card10 = "70000113";
	private static final String Card11 = "126000009";
	private static final String Card12 = "126000008";
	private static final String Card13 = "700000122";
//	private static final String Card14 = "700000123";
//	private static final String Card15 = "700000124";
	private static final String Card16 = "18000252";
//	private static final String Card17 = "18902009";
	private static final String Card18 = "18902010";
	private static final String Card19 = "18901987";
	private static final String Card20 = "18901981";
	private static final String Card21 = "19500214";
	private static final String Card22 = "18901882";
	private static final String Card23 = "27500000";
//	private static final String Card24 = "27500005";
	private static final String Card24 = "27500013";
	private static final String Card25 = "27500002";
	private static final String Card26 = "18000500";
	private static final String Card27 = "18000497";
	private static final String Card28 = "18000487";
	private static final String Card29 = "27500006";
	private static final String Card30 = "654000085";
	private static final String Card31 = "654000083";
	private static final String Card32 = "654000084";
	private static final String Terminal_ID_Blocked = "011";
	private static final String terminal_one = "Terminal 1";
	private static final String Merchant_ID = "1223334";
//	private static final String Merchant_ID_one = "12322155";
	private static final String MaathavanHome = "Maathavan Home";
	private static final String FUNDPOST_CREDIT = "FUNDPOST_CREDIT";
	private static final String FUND_POST = "FUND_POST";
	private static final String SARAVANAN_TESTING_CITY_NAME_IN = "SARAVANAN TESTING CITY NAME IN";
	private static final String RUPAY = "RUPAY";
	private static final String CONTACTLESS = "CONTACTLESS";
	private static final String ATM = "ATM";
	private static final String POS = "POS";
	private static final String ECOM = "ECOM";
	private static final String MCC_742 = "0742";
	private static final String MCC_743 = "0743";
	private static final String MCC_3017 = "3017";
	private static final String MCC_3000 = "3000";
	private static final String MCC_3001 = "3001";
	private static final String MCC_3221 = "3221";
	private static final String MCC_3222 = "3222";
	private static final String MCC_1000 = "1000";
	private static final String MCC_5021 = "5021";
	private static final String Rs_2 = "000000000200";
	private static final String Rs_5 = "000000000500";
	private static final String Rs_10 = "000000001000";
//	private static final String Rs_15 = "000000001500";
	private static final String Rs_18 = "000000001800";
	private static final String Rs_20 = "000000000500";
	private static final String Rs_50 = "000000005000";
//	private static final String Rs_200 = "000000020000";
	private static final String Rs_201 = "000000020100";
	private Response response;
	private APIHelper api = new APIHelper();

	@Given("^user send post request for verify insufficient funds$")
	public void user_send_post_request_for_verify_insufficient_funds() throws Throwable {
		Map<Object, Object> map = new LinkedHashMap<Object, Object>();
		map.put("merchantName", MaathavanHome);
		map.put("terminalID", "null");
		map.put("mcc", MCC_742);
		map.put("entityId", EntityId1);
		map.put("proxyCardNo", Card1);
		map.put("network", RUPAY);
		map.put("channel", ECOM);
		map.put("merchantId", "null");
		map.put("amount", Rs_20);
		map.put("transactionAmount", Rs_20);
		map.put("billingAmount", Rs_20);
		APIConstants.retrivalRefNo = RandomStringUtils.randomNumeric(10);
		map.put("retrievalRefNo", APIConstants.retrivalRefNo);
		response = api.post(APIConstants.AuthDebit_CashbackCreditURL, APIBody.getAuthDebitRequestBody(map));
	}

	@Then("^user must be get description Insufficient funds$")
	public void user_must_be_get_description_Insufficient_funds() throws Throwable {
		String desc = api.getDescription(response);
		if (!desc.equalsIgnoreCase("Insufficient funds"))
			Assert.assertEquals(desc, "Insufficient funds");
		String status = api.getStatus(response);
		if (!desc.equalsIgnoreCase("51"))
			Assert.assertEquals(status, "51");
		APIConstants.txnRefNo = response.getBody().path("txnRefNo").toString();
		// APIConstants.balance = String.valueOf(response.getBody().path("balance"));
	}

	@Given("^user send post request for get balance of default pocket$")
	public void user_send_post_request_for_get_balance_of_default_pocket() throws Throwable {
		Map<Object, Object> map = new LinkedHashMap<Object, Object>();
		map.put("merchantName", MaathavanHome);
		map.put("terminalID", "null");
		map.put("mcc", MCC_742);
		map.put("entityId", EntityId2);
		map.put("proxyCardNo", Card2);
		map.put("network", RUPAY);
		map.put("channel", ECOM);
		map.put("merchantId", "null");
		map.put("amount", Rs_20);
		map.put("transactionAmount", Rs_20);
		map.put("billingAmount", Rs_20);
		APIConstants.retrivalRefNo = RandomStringUtils.randomNumeric(10);
		APIConstants.tempRetrivalRefNo = APIConstants.retrivalRefNo;
		map.put("retrievalRefNo", APIConstants.retrivalRefNo);
		response = api.post(APIConstants.AuthDebit_CashbackCreditURL, APIBody.getAuthDebitRequestBody(map));
	}

	@Given("^user send post request for get balance of default pocket after update fee$")
	public void user_send_post_request_for_get_balance_of_default_pocket_after_update_fee() throws Throwable {
		Map<Object, Object> map = new LinkedHashMap<Object, Object>();
		map.put("merchantName", MaathavanHome);
		map.put("terminalID", "null");
		map.put("mcc", MCC_742);
		map.put("entityId", EntityId19);
		map.put("proxyCardNo", Card30);
		map.put("network", RUPAY);
		map.put("channel", ATM);
		map.put("merchantId", "null");
		map.put("amount", Rs_20);
		map.put("transactionAmount", Rs_20);
		map.put("billingAmount", Rs_20);
		APIConstants.retrivalRefNo = RandomStringUtils.randomNumeric(10);
		APIConstants.tempRetrivalRefNo = APIConstants.retrivalRefNo;
		map.put("retrievalRefNo", APIConstants.retrivalRefNo);
		response = api.post(APIConstants.AuthDebit_CashbackCreditURL, APIBody.getAuthDebitRequestBody(map));
	}

	@Given("^user send post request for get balance of default pocket after update fee with markup$")
	public void user_send_post_request_for_get_balance_of_default_pocket_after_update_fee_with_markup()
			throws Throwable {
		Map<Object, Object> map = new LinkedHashMap<Object, Object>();
		map.put("merchantName", MaathavanHome);
		map.put("terminalID", "null");
		map.put("mcc", MCC_3017);
		map.put("entityId", EntityId19);
		map.put("proxyCardNo", Card32);
		map.put("network", RUPAY);
		map.put("channel", ATM);
		map.put("merchantId", "null");
		map.put("amount", Rs_20);
		map.put("transactionAmount", Rs_20);
		map.put("billingAmount", Rs_20);
		APIConstants.retrivalRefNo = RandomStringUtils.randomNumeric(10);
		APIConstants.tempRetrivalRefNo = APIConstants.retrivalRefNo;
		map.put("retrievalRefNo", APIConstants.retrivalRefNo);
		response = api.post(APIConstants.AuthDebit_CashbackCreditURL, APIBody.getAuthDebitRequestBody(map));
	}

	@Given("^user send post request for get balance of default pocket after update fee with different markup$")
	public void user_send_post_request_for_get_balance_of_default_pocket_after_update_fee_with_different_markup()
			throws Throwable {
		Map<Object, Object> map = new LinkedHashMap<Object, Object>();
		map.put("merchantName", MaathavanHome);
		map.put("terminalID", "0123");
		map.put("mcc", MCC_3017);
		map.put("entityId", EntityId19);
		map.put("proxyCardNo", Card32);
		map.put("network", RUPAY);
		map.put("channel", ATM);
		map.put("merchantId", "11223344");
		map.put("amount", Rs_20);
		map.put("transactionAmount", Rs_20);
		map.put("billingAmount", Rs_20);
		APIConstants.retrivalRefNo = RandomStringUtils.randomNumeric(10);
		APIConstants.tempRetrivalRefNo = APIConstants.retrivalRefNo;
		map.put("retrievalRefNo", APIConstants.retrivalRefNo);
		response = api.post(APIConstants.AuthDebit_CashbackCreditURL, APIBody.getAuthDebitRequestBody(map));
	}

	@Given("^user send post request for get balance of default pocket with same rrn$")
	public void user_send_post_request_for_get_balance_of_default_pocket_with_same_rrn() throws Throwable {
		Map<Object, Object> map = new LinkedHashMap<Object, Object>();
		map.put("merchantName", MaathavanHome);
		map.put("terminalID", "null");
		map.put("mcc", MCC_742);
		map.put("entityId", EntityId2);
		map.put("proxyCardNo", Card2);
		map.put("network", RUPAY);
		map.put("channel", ECOM);
		map.put("merchantId", "null");
		map.put("amount", Rs_20);
		map.put("transactionAmount", Rs_20);
		map.put("billingAmount", Rs_20);
		map.put("retrievalRefNo", APIConstants.retrivalRefNo);
		response = api.post(APIConstants.AuthDebit_CashbackCreditURL, APIBody.getAuthDebitRequestBody(map));
	}

	@Then("^user must be get description Successful$")
	public void user_must_be_get_description_Successful() throws Throwable {
		String desc = api.getDescription(response);
		System.out.println(response.getBody().asString());
		if (!desc.equalsIgnoreCase("Successful"))
			Assert.assertEquals(desc, "Successful");
		String status = api.getStatus(response);
		if (!desc.equalsIgnoreCase("00"))
			Assert.assertEquals(status, "00");
		APIConstants.txnRefNo = response.getBody().path("txnRefNo").toString();
		APIConstants.txnRefNo1 = APIConstants.txnRefNo;
		// APIConstants.balance = String.valueOf(response.getBody().path("balance"));
	}

	@Then("^user must be get description Channel limit Exceeded$")
	public void user_must_be_get_description_Channel_limit_Exceeded() throws Throwable {
		String desc = api.getDescription(response);
		System.out.println(response.getBody().asString());
		if (!desc.equalsIgnoreCase("Channel limit Exceeded"))
			Assert.assertEquals(desc, "Channel limit Exceeded");
	}

	@Given("^user send post request for get balance of other pocket$")
	public void user_send_post_request_for_get_balance_of_other_pocket() throws Throwable {
		Map<Object, Object> map = new LinkedHashMap<Object, Object>();
		map.put("merchantName", MaathavanHome);
		map.put("terminalID", "null");
		map.put("mcc", MCC_3001);
		map.put("entityId", EntityId2);
		map.put("proxyCardNo", Card3);
		map.put("network", RUPAY);
		map.put("channel", ECOM);
		map.put("merchantId", "null");
		map.put("amount", Rs_20);
		map.put("transactionAmount", Rs_20);
		map.put("billingAmount", Rs_20);
		APIConstants.retrivalRefNo = RandomStringUtils.randomNumeric(10);
		map.put("retrievalRefNo", APIConstants.retrivalRefNo);
		response = api.post(APIConstants.AuthDebit_CashbackCreditURL, APIBody.getAuthDebitRequestBody(map));
	}

	@Given("^user send post request for verify CONTACTLESS transaction not allowed for GC$")
	public void user_send_post_request_for_verify_CONTACTLESS_transaction_not_allowed_for_GC() throws Throwable {
		Map<Object, Object> map = new LinkedHashMap<Object, Object>();
		map.put("merchantName", MaathavanHome);
		map.put("terminalID", "null");
		map.put("mcc", "null");
		map.put("entityId", EntityId2);
		map.put("proxyCardNo", Card2);
		map.put("network", RUPAY);
		map.put("channel", CONTACTLESS);
		map.put("merchantId", "null");
		map.put("amount", Rs_10);
		map.put("transactionAmount", Rs_10);
		map.put("billingAmount", Rs_10);
		APIConstants.retrivalRefNo = RandomStringUtils.randomNumeric(10);
		map.put("retrievalRefNo", APIConstants.retrivalRefNo);
		response = api.post(APIConstants.AuthDebit_CashbackCreditURL, APIBody.getAuthDebitRequestBody(map));
	}

	@Given("^user send post request for verify CONTACTLESS transaction not allowed for GC success$")
	public void user_send_post_request_for_verify_CONTACTLESS_transaction_not_allowed_for_GC_success()
			throws Throwable {
		Map<Object, Object> map = new LinkedHashMap<Object, Object>();
		map.put("merchantName", MaathavanHome);
		map.put("terminalID", "null");
		map.put("mcc", "null");
		map.put("entityId", EntityId2);
		map.put("proxyCardNo", Card2);
		map.put("network", RUPAY);
		map.put("channel", CONTACTLESS);
		map.put("merchantId", "null");
		map.put("amount", Rs_2);
		map.put("transactionAmount", Rs_2);
		map.put("billingAmount", Rs_2);
		APIConstants.retrivalRefNo = RandomStringUtils.randomNumeric(10);
		map.put("retrievalRefNo", APIConstants.retrivalRefNo);
		response = api.post(APIConstants.AuthDebit_CashbackCreditURL, APIBody.getAuthDebitRequestBody(map));
	}

	@Then("^user must be get description CONTACTLESS transaction doesn't allowed for GC card$")
	public void user_must_be_get_description_CONTACTLESS_transaction_does_not_allowed_for_GC_card() throws Throwable {
		String desc = api.getDescription(response);
		if (!desc.equalsIgnoreCase("CONTACTLESS transaction doesn't allowed for GC card"))
			Assert.assertEquals(desc, "CONTACTLESS transaction doesn't allowed for GC card");
		APIConstants.txnRefNo = response.getBody().path("txnRefNo").toString();
		// APIConstants.balance = String.valueOf(response.getBody().path("balance"));
	}

	@Given("^user send post request for get balance of pocket with markup$")
	public void user_send_post_request_for_get_balance_of_pocket_with_markup() throws Throwable {
		Map<Object, Object> map = new LinkedHashMap<Object, Object>();
		map.put("merchantName", MaathavanHome);
		map.put("terminalID", "null");
		map.put("mcc", MCC_3017);
		map.put("entityId", EntityId2);
		map.put("proxyCardNo", Card4);
		map.put("network", RUPAY);
		map.put("channel", ECOM);
		map.put("merchantId", "null");
		map.put("amount", Rs_20);
		map.put("transactionAmount", Rs_20);
		map.put("billingAmount", Rs_20);
		APIConstants.retrivalRefNo = RandomStringUtils.randomNumeric(10);
		map.put("retrievalRefNo", APIConstants.retrivalRefNo);
		response = api.post(APIConstants.AuthDebit_CashbackCreditURL, APIBody.getAuthDebitRequestBody(map));
	}

	@Given("^user send post request for verify blocked merchant$")
	public void user_send_post_request_for_verify_blocked_merchant() throws Throwable {
		Map<Object, Object> map = new LinkedHashMap<Object, Object>();
		map.put("merchantName", MaathavanHome);
		map.put("terminalID", "011");
		map.put("mcc", MCC_3017);
		map.put("entityId", EntityId2);
		map.put("proxyCardNo", Card2);
		map.put("network", RUPAY);
		map.put("channel", ATM);
		map.put("merchantId", "1223334");
		map.put("amount", Rs_2);
		map.put("transactionAmount", Rs_2);
		map.put("billingAmount", Rs_2);
		APIConstants.retrivalRefNo = RandomStringUtils.randomNumeric(10);
		map.put("retrievalRefNo", APIConstants.retrivalRefNo);
		response = api.post(APIConstants.AuthDebit_CashbackCreditURL, APIBody.getAuthDebitRequestBody(map));
	}

	@Then("^user must be get description Merchant is blocked$")
	public void user_must_be_get_description_Merchant_is_blocked() throws Throwable {
		String desc = api.getDescription(response);
		if (!desc.equalsIgnoreCase("Merchant is blocked"))
			Assert.assertEquals(desc, "Merchant is blocked");
		APIConstants.txnRefNo = response.getBody().path("txnRefNo").toString();
		// APIConstants.balance = String.valueOf(response.getBody().path("balance"));
	}

	@Given("^user send post request for get cashback with offer at perticular MID and TID with markup$")
	public void user_send_post_request_for_get_cashback_with_offer_at_perticular_MID_and_TID_with_markup()
			throws Throwable {
		Map<Object, Object> map = new LinkedHashMap<Object, Object>();
		map.put("merchantName", MaathavanHome);
		map.put("terminalID", "Terminal 1");
		map.put("mcc", MCC_3017);
		map.put("entityId", EntityId2);
		map.put("proxyCardNo", Card4);
		map.put("network", RUPAY);
		map.put("channel", ECOM);
		map.put("merchantId", "12322155");
		map.put("amount", Rs_20);
		map.put("transactionAmount", Rs_20);
		map.put("billingAmount", Rs_20);
		APIConstants.retrivalRefNo = RandomStringUtils.randomNumeric(10);
		map.put("retrievalRefNo", APIConstants.retrivalRefNo);
		response = api.post(APIConstants.AuthDebit_CashbackCreditURL, APIBody.getAuthDebitRequestBody(map));
	}

	@Given("^user send post request for get cashback with offer at perticular MID and TID$")
	public void user_send_post_request_for_get_cashback_with_offer_at_perticular_MID_and_TID() throws Throwable {
		Map<Object, Object> map = new LinkedHashMap<Object, Object>();
		map.put("merchantName", MaathavanHome);
		map.put("terminalID", "Terminal 1");
		map.put("mcc", MCC_3001);
		map.put("entityId", EntityId2);
		map.put("proxyCardNo", Card3);
		map.put("network", RUPAY);
		map.put("channel", ECOM);
		map.put("merchantId", "12322155");
		map.put("amount", Rs_20);
		map.put("transactionAmount", Rs_20);
		map.put("billingAmount", Rs_20);
		APIConstants.retrivalRefNo = RandomStringUtils.randomNumeric(10);
		map.put("retrievalRefNo", APIConstants.retrivalRefNo);
		response = api.post(APIConstants.AuthDebit_CashbackCreditURL, APIBody.getAuthDebitRequestBody(map));
	}

	@Given("^user send post request for channel limit is disallowed$")
	public void user_send_post_request_for_channel_limit_is_disallowed() throws Throwable {
		Map<Object, Object> map = new LinkedHashMap<Object, Object>();
		map.put("merchantName", MaathavanHome);
		map.put("terminalID", "null");
		map.put("mcc", MCC_1000);
		map.put("entityId", EntityId2);
		map.put("proxyCardNo", Card2);
		map.put("network", RUPAY);
		map.put("channel", POS);
		map.put("merchantId", "null");
		map.put("amount", Rs_5);
		map.put("transactionAmount", Rs_5);
		map.put("billingAmount", Rs_5);
		APIConstants.retrivalRefNo = RandomStringUtils.randomNumeric(10);
		map.put("retrievalRefNo", APIConstants.retrivalRefNo);
		response = api.post(APIConstants.AuthDebit_CashbackCreditURL, APIBody.getAuthDebitRequestBody(map));
	}

	@Then("^user must be get description Channel Limit is Disallowed$")
	public void user_must_be_get_description_Channel_Limit_is_Disallowed() throws Throwable {
		String desc = api.getDescription(response);
		if (!desc.equalsIgnoreCase("Channel limit is disallowed"))
			Assert.assertEquals(desc, "Channel limit is disallowed");
		APIConstants.txnRefNo = response.getBody().path("txnRefNo").toString();
		// APIConstants.balance = String.valueOf(response.getBody().path("balance"));
	}

	@Given("^user send post request for channel limit exceeded$")
	public void user_send_post_request_for_channel_limit_exceeded() throws Throwable {
		Map<Object, Object> map = new LinkedHashMap<Object, Object>();
		map.put("merchantName", MaathavanHome);
		map.put("terminalID", "null");
		map.put("mcc", MCC_1000);
		map.put("entityId", EntityId2);
		map.put("proxyCardNo", Card2);
		map.put("network", RUPAY);
		map.put("channel", ECOM);
		map.put("merchantId", "null");
		map.put("amount", Rs_201);
		map.put("transactionAmount", Rs_201);
		map.put("billingAmount", Rs_201);
		APIConstants.retrivalRefNo = RandomStringUtils.randomNumeric(10);
		map.put("retrievalRefNo", APIConstants.retrivalRefNo);
		response = api.post(APIConstants.AuthDebit_CashbackCreditURL, APIBody.getAuthDebitRequestBody(map));
	}

	@Then("^user must be get description Channel limit exceeded$")
	public void user_must_be_get_description_Channel_limit_exceeded() throws Throwable {
		String desc = api.getDescription(response);
		if (!desc.equalsIgnoreCase("Channel limit exceeded"))
			Assert.assertEquals(desc, "Channel limit exceeded");
		APIConstants.txnRefNo = response.getBody().path("txnRefNo").toString();
		// APIConstants.balance = String.valueOf(response.getBody().path("balance"));
	}

	@Given("^user send post request for transaction more than daily limit$")
	public void user_send_post_request_for_transaction_more_than_daily_limit() throws Throwable {
		Map<Object, Object> map = new LinkedHashMap<Object, Object>();
		map.put("merchantName", MaathavanHome);
		map.put("terminalID", "null");
		map.put("mcc", MCC_3001);
		map.put("entityId", EntityId2);
		map.put("proxyCardNo", Card3);
		map.put("network", RUPAY);
		map.put("channel", ATM);
		map.put("merchantId", "null");
		map.put("amount", "000000030000");
		map.put("transactionAmount", "000000030000");
		map.put("billingAmount", "000000030000");
		APIConstants.retrivalRefNo = RandomStringUtils.randomNumeric(10);
		map.put("retrievalRefNo", APIConstants.retrivalRefNo);
		response = api.post(APIConstants.AuthDebit_CashbackCreditURL, APIBody.getAuthDebitRequestBody(map));
	}

	@Given("^user send post request for transaction less than daily limit$")
	public void user_send_post_request_for_transaction_less_than_daily_limit() throws Throwable {
		Map<Object, Object> map = new LinkedHashMap<Object, Object>();
		map.put("merchantName", MaathavanHome);
		map.put("terminalID", "null");
		map.put("mcc", MCC_742);
		map.put("entityId", EntityId2);
		map.put("proxyCardNo", Card2);
		map.put("network", RUPAY);
		map.put("channel", ECOM);
		map.put("merchantId", "null");
		map.put("amount", Rs_20);
		map.put("transactionAmount", Rs_20);
		map.put("billingAmount", Rs_20);
		APIConstants.retrivalRefNo = RandomStringUtils.randomNumeric(10);
		map.put("retrievalRefNo", APIConstants.retrivalRefNo);
		response = api.post(APIConstants.AuthDebit_CashbackCreditURL, APIBody.getAuthDebitRequestBody(map));
	}

	@Then("^user must be get description Daily limit exceeded$")
	public void user_must_be_get_description_Daily_limit_exceeded() throws Throwable {
		String desc = api.getDescription(response);
		if (!desc.equalsIgnoreCase("Daily limit exceeded"))
			Assert.assertEquals(desc, "Daily limit exceeded");
		APIConstants.txnRefNo = response.getBody().path("txnRefNo").toString();
		// APIConstants.balance = String.valueOf(response.getBody().path("balance"));
	}

	@Given("^user send post request for transaction attemped less than daily count$")
	public void user_send_post_request_for_transaction_attemped_less_than_daily_count() throws Throwable {
		Map<Object, Object> map = new LinkedHashMap<Object, Object>();
		map.put("merchantName", MaathavanHome);
		map.put("terminalID", "null");
		map.put("mcc", MCC_742);
		map.put("entityId", EntityId2);
		map.put("proxyCardNo", Card2);
		map.put("network", RUPAY);
		map.put("channel", ECOM);
		map.put("merchantId", "null");
		map.put("amount", Rs_20);
		map.put("transactionAmount", Rs_20);
		map.put("billingAmount", Rs_20);
		APIConstants.retrivalRefNo = RandomStringUtils.randomNumeric(10);
		map.put("retrievalRefNo", APIConstants.retrivalRefNo);
		response = api.post(APIConstants.AuthDebit_CashbackCreditURL, APIBody.getAuthDebitRequestBody(map));
	}

	@Given("^user send post request for transaction attemped more than daily count$")
	public void user_send_post_request_for_transaction_attemped_more_than_daily_count() throws Throwable {
		Map<Object, Object> map = new LinkedHashMap<Object, Object>();
		map.put("merchantName", MaathavanHome);
		map.put("terminalID", "null");
		map.put("mcc", MCC_3001);
		map.put("entityId", EntityId2);
		map.put("proxyCardNo", Card3);
		map.put("network", RUPAY);
		map.put("channel", ECOM);
		map.put("merchantId", "null");
		map.put("amount", Rs_201);
		map.put("transactionAmount", Rs_201);
		map.put("billingAmount", Rs_201);
		APIConstants.retrivalRefNo = RandomStringUtils.randomNumeric(10);
		map.put("retrievalRefNo", APIConstants.retrivalRefNo);
		response = api.post(APIConstants.AuthDebit_CashbackCreditURL, APIBody.getAuthDebitRequestBody(map));
	}

	@Given("^user send post request for puased card$")
	public void user_send_post_request_for_puased_card() throws Throwable {
		Map<Object, Object> map = new LinkedHashMap<Object, Object>();
		map.put("merchantName", MaathavanHome);
		map.put("terminalID", "null");
		map.put("mcc", MCC_742);
		map.put("entityId", EntityId9);
		map.put("proxyCardNo", "888000007");
		map.put("network", RUPAY);
		map.put("channel", ATM);
		map.put("merchantId", "null");
		map.put("amount", Rs_20);
		map.put("transactionAmount", Rs_20);
		map.put("billingAmount", Rs_20);
		APIConstants.retrivalRefNo = RandomStringUtils.randomNumeric(10);
		map.put("retrievalRefNo", APIConstants.retrivalRefNo);
		response = api.post(APIConstants.AuthDebit_CashbackCreditURL, APIBody.getAuthDebitRequestBody(map));
	}

	@Given("^user send post request for blocked card$")
	public void user_send_post_request_for_blocked_card() throws Throwable {
		Map<Object, Object> map = new LinkedHashMap<Object, Object>();
		map.put("merchantName", MaathavanHome);
		map.put("terminalID", "null");
		map.put("mcc", MCC_742);
		map.put("entityId", "7364dfa3-1fa9-4d73-927e-0d37e96dfa67");
		map.put("proxyCardNo", "19400043");
		map.put("network", RUPAY);
		map.put("channel", ATM);
		map.put("merchantId", "null");
		map.put("amount", Rs_20);
		map.put("transactionAmount", Rs_20);
		map.put("billingAmount", Rs_20);
		APIConstants.retrivalRefNo = RandomStringUtils.randomNumeric(10);
		map.put("retrievalRefNo", APIConstants.retrivalRefNo);
		response = api.post(APIConstants.AuthDebit_CashbackCreditURL, APIBody.getAuthDebitRequestBody(map));
	}

	@Then("^user must be get description Card not Active$")
	public void user_must_be_get_description_Card_not_Active() throws Throwable {
		String desc = api.getDescription(response);
		if (!desc.equalsIgnoreCase("Card not Active"))
			Assert.assertEquals(desc, "Card not Active");
		APIConstants.txnRefNo = response.getBody().path("txnRefNo").toString();
		// APIConstants.balance = String.valueOf(response.getBody().path("balance"));
	}

	@Given("^user send post request for entity and proxy no$")
	public void user_send_post_request_for_entity_and_proxy_no() throws Throwable {
		Map<Object, Object> map = new LinkedHashMap<Object, Object>();
		map.put("merchantName", MaathavanHome);
		map.put("terminalID", "null");
		map.put("mcc", MCC_742);
		map.put("entityId", EntityId2);
		map.put("proxyCardNo", Card5);
		map.put("network", RUPAY);
		map.put("channel", ATM);
		map.put("merchantId", "null");
		map.put("amount", Rs_20);
		map.put("transactionAmount", Rs_20);
		map.put("billingAmount", Rs_20);
		APIConstants.retrivalRefNo = RandomStringUtils.randomNumeric(10);
		map.put("retrievalRefNo", APIConstants.retrivalRefNo);
		response = api.post(APIConstants.AuthDebit_CashbackCreditURL, APIBody.getAuthDebitRequestBody(map));
	}

	@Given("^user send post request for Successful$")
	public void user_send_post_request_for_Successful() throws Throwable {
		Map<Object, Object> map = new LinkedHashMap<Object, Object>();
		map.put("merchantName", MaathavanHome);
		map.put("terminalID", "null");
		map.put("mcc", MCC_742);
		map.put("entityId", EntityId2);
		map.put("proxyCardNo", Card2);
		map.put("network", RUPAY);
		map.put("channel", ECOM);
		map.put("merchantId", "null");
		map.put("amount", Rs_20);
		map.put("transactionAmount", Rs_20);
		map.put("billingAmount", Rs_20);
		APIConstants.retrivalRefNo = RandomStringUtils.randomNumeric(10);
		map.put("retrievalRefNo", APIConstants.retrivalRefNo);
		response = api.post(APIConstants.AuthDebit_CashbackCreditURL, APIBody.getAuthDebitRequestBody(map));
	}

	@Given("^user send post request for duplicate txnRefNo$")
	public void user_send_post_request_for_duplicate_txnRefNo() throws Throwable {
		Map<Object, Object> map = new LinkedHashMap<Object, Object>();
		map.put("merchantName", MaathavanHome);
		map.put("terminalID", "null");
		map.put("mcc", MCC_3001);
		map.put("entityId", EntityId2);
		map.put("proxyCardNo", Card3);
		map.put("network", RUPAY);
		map.put("channel", ATM);
		map.put("merchantId", "null");
		map.put("amount", Rs_10);
		map.put("transactionAmount", Rs_10);
		map.put("txnRefNo", APIConstants.txnRefNo);
		map.put("billingAmount", Rs_10);
//		APIConstants.retrivalRefNo = RandomStringUtils.randomNumeric(10);
		map.put("retrievalRefNo", APIConstants.retrivalRefNo);
		response = api.post(APIConstants.AuthDebit_CashbackCreditURL,
				APIBody.getAuthDebitRequestBodyWithDuplicateTxnRefNo(map));
	}

	@Then("^user must be get description Transaction Duplicate$")
	public void user_must_be_get_description_Transaction_Duplicate() throws Throwable {
		String desc = api.getDescription(response);
		if (!desc.equalsIgnoreCase("Transaction Duplicate"))
			Assert.assertEquals(desc, "Transaction Duplicate");
		APIConstants.txnRefNo = response.getBody().path("txnRefNo").toString();
		// APIConstants.balance = String.valueOf(response.getBody().path("balance"));
	}

	@Given("^user send post request for duplicate txnRefNo Successful$")
	public void user_send_post_request_for_duplicate_txnRefNo_Successful() throws Throwable {
		Map<Object, Object> map = new LinkedHashMap<Object, Object>();
		map.put("merchantName", MaathavanHome);
		map.put("terminalID", "null");
		map.put("mcc", MCC_3001);
		map.put("entityId", EntityId2);
		map.put("proxyCardNo", Card3);
		map.put("network", RUPAY);
		map.put("channel", ECOM);
		map.put("merchantId", "null");
		map.put("amount", Rs_20);
		map.put("transactionAmount", Rs_20);
		map.put("txnRefNo", APIConstants.txnRefNo);
		map.put("billingAmount", Rs_20);
		APIConstants.retrivalRefNo = RandomStringUtils.randomNumeric(10);
		map.put("retrievalRefNo", APIConstants.retrivalRefNo);
		response = api.post(APIConstants.AuthDebit_CashbackCreditURL,
				APIBody.getAuthDebitRequestBodyWithDuplicateTxnRefNo(map));
	}

	@Given("^user send post request for balance check$")
	public void user_send_post_request_for_balance_check() throws Throwable {
		Map<Object, Object> map = new LinkedHashMap<Object, Object>();
		map.put("merchantName", MaathavanHome);
		map.put("terminalID", "null");
		map.put("mcc", "null");
		map.put("entityId", EntityId2);
		map.put("proxyCardNo", Card3);
		map.put("network", RUPAY);
		map.put("channel", ATM);
		map.put("merchantId", "null");
		map.put("amount", Rs_2);
		map.put("transactionAmount", Rs_2);
		map.put("billingAmount", Rs_2);
		APIConstants.retrivalRefNo = RandomStringUtils.randomNumeric(10);
		map.put("retrievalRefNo", APIConstants.retrivalRefNo);
		response = api.post(APIConstants.AuthDebit_CashbackCreditURL, APIBody.getAuthDebitRequestBody(map));
	}

	@Given("^user send post request for Medical pocket$")
	public void user_send_post_request_for_Medical_pocket() throws Throwable {
		Map<Object, Object> map = new LinkedHashMap<Object, Object>();
		map.put("merchantName", MaathavanHome);
		map.put("terminalID", "null");
		map.put("mcc", MCC_3001);
		map.put("entityId", EntityId2);
		map.put("proxyCardNo", Card3);
		map.put("network", RUPAY);
		map.put("channel", ECOM);
		map.put("merchantId", "null");
		map.put("amount", Rs_20);
		map.put("transactionAmount", Rs_20);
		map.put("billingAmount", Rs_20);
		APIConstants.retrivalRefNo = RandomStringUtils.randomNumeric(10);
		map.put("retrievalRefNo", APIConstants.retrivalRefNo);
		response = api.post(APIConstants.AuthDebit_CashbackCreditURL, APIBody.getAuthDebitRequestBody(map));
	}

	@Given("^user send post request for auth reversal$")
	public void user_send_post_request_for_auth_reversal() throws Throwable {
		Map<Object, Object> map = new LinkedHashMap<Object, Object>();
		map.put("channel", ECOM);
		map.put("transactionAmount", Rs_20);
		map.put("productCode", "null");
		map.put("amount", "0000000020");
		map.put("merchantName", SARAVANAN_TESTING_CITY_NAME_IN);
		map.put("proxyCardNo", Card3);
		map.put("mcc", "null");
		map.put("network", RUPAY);
		map.put("merchantID", "null");
		map.put("terminalID", "null");
		map.put("institutionCode", "458519");
		APIConstants.retrivalRefNo = RandomStringUtils.randomNumeric(10);
		map.put("retrievalRefNo", APIConstants.retrivalRefNo);
		response = api.post(APIConstants.AuthReversal_CashbackDebitURL, APIBody.getAuthReversalRequestBody(map));
	}

	@Given("^user send post request for auth reversal invalid transaction amount$")
	public void user_send_post_request_for_auth_reversal_invalid_transaction_amount() throws Throwable {
		Map<Object, Object> map = new LinkedHashMap<Object, Object>();
		map.put("channel", ECOM);
		map.put("transactionAmount", "000000002123");
		map.put("productCode", "null");
		map.put("amount", "0000000020");
		map.put("merchantName", SARAVANAN_TESTING_CITY_NAME_IN);
		map.put("txnRefNo", APIConstants.txnRefNo);
		map.put("proxyCardNo", Card2);
		map.put("mcc", "null");
		map.put("network", RUPAY);
		map.put("merchantID", "null");
		map.put("terminalID", "null");
		map.put("institutionCode", "458519");
		APIConstants.retrivalRefNo = RandomStringUtils.randomNumeric(10);
		map.put("retrievalRefNo", APIConstants.retrivalRefNo);
		response = api.post(APIConstants.AuthReversal_CashbackDebitURL, APIBody.getAuthReversalRequestBody(map));
	}

	@Then("^user must be get description Invalid Transaction$")
	public void user_must_be_get_description_Invalid_Transaction() throws Throwable {
		String desc = api.getDescription(response);
		if (!desc.equalsIgnoreCase("Invalid Transaction"))
			Assert.assertEquals(desc, "Invalid Transaction");
		APIConstants.txnRefNo = response.getBody().path("txnRefNo").toString();
		// APIConstants.balance = String.valueOf(response.getBody().path("balance"));
	}

	@And("^user set log$")
	public void user_set_log() throws Throwable {
		api.setLogs();
	}

	@Given("^user send post request for auth credit$")
	public void user_send_post_request_for_auth_credit() throws Throwable {
		Map<Object, Object> map = new LinkedHashMap<Object, Object>();
		map.put("entityId", EntityId2);
		map.put("proxyCardNo", Card2);
		map.put("rrn", APIConstants.retrivalRefNo);
		map.put("transactionAmount", Rs_20);
		map.put("amount", Rs_20);
		map.put("merchantID", "null");
		map.put("merchantName", MaathavanHome);
		map.put("transactionType", FUNDPOST_CREDIT);
		map.put("terminalID", "null");
		map.put("mcc", "null");
		map.put("network", RUPAY);
		map.put("channel", FUND_POST);
		map.put("originalRrn", APIConstants.retrivalRefNo);
		map.put("txnRefNo", APIConstants.txnRefNo);
		response = api.post(APIConstants.AuthCredit_CashbackRefundURL,
				APIBody.getAuthCreditRequestBodyWithDuplicateTxnRefNo(map));
	}

	@Then("^user must be get description credited$")
	public void user_must_be_get_description_credited() throws Throwable {
		String desc = api.getDescription(response);
		if (!desc.equalsIgnoreCase("credited"))
			Assert.assertEquals(desc, "credited");
	}

	@Then("^user must be get description Already partial reversed$")
	public void user_must_be_get_description_Already_partial_reversed() throws Throwable {
		String desc = api.getDescription(response);
		if (!desc.equalsIgnoreCase("Already partial reversed"))
			Assert.assertEquals(desc, "Already partial reversed");
		APIConstants.txnRefNo = response.getBody().path("txnRefNo").toString();
		// APIConstants.balance = String.valueOf(response.getBody().path("balance"));
	}

	@Given("^user send post request for auth credit other pocket$")
	public void user_send_post_request_for_auth_credit_other_pocket() throws Throwable {
		Map<Object, Object> map = new LinkedHashMap<Object, Object>();
		map.put("entityId", EntityId2);
		map.put("proxyCardNo", Card3);
		map.put("rrn", APIConstants.retrivalRefNo);
		map.put("transactionAmount", Rs_10);
		map.put("amount", Rs_10);
		map.put("merchantID", "null");
		map.put("merchantName", MaathavanHome);
		map.put("transactionType", FUNDPOST_CREDIT);
		map.put("terminalID", "null");
		map.put("mcc", MCC_3001);
		map.put("network", RUPAY);
		map.put("channel", FUND_POST);
		map.put("originalRrn", APIConstants.retrivalRefNo);
		map.put("txnRefNo", APIConstants.txnRefNo);
		response = api.post(APIConstants.AuthCredit_CashbackRefundURL,
				APIBody.getAuthCreditRequestBodyWithDuplicateTxnRefNo(map));
	}

	@Given("^user send post request for auth reversal offer at perticular MID and TID with markup$")
	public void user_send_post_request_for_auth_reversal_offer_at_perticular_MID_and_TID_with_markup()
			throws Throwable {
		Map<Object, Object> map = new LinkedHashMap<Object, Object>();
		map.put("channel", ECOM);
		map.put("transactionAmount", Rs_20);
		map.put("productCode", "null");
		map.put("amount", Rs_20);
		map.put("merchantName", MaathavanHome);
		map.put("txnRefNo", APIConstants.txnRefNo);
		map.put("proxyCardNo", Card4);
		map.put("mcc", MCC_3017);
		map.put("network", RUPAY);
		map.put("merchantID", "12322155");
		map.put("terminalID", "Terminal 1");
		map.put("institutionCode", "458519");
		map.put("txnRefNo", APIConstants.txnRefNo);
		map.put("retrievalRefNo", APIConstants.retrivalRefNo);
		response = api.post(APIConstants.AuthReversal_CashbackDebitURL,
				APIBody.getAuthReversalRequestBodyWithDuplicateTxnRefNo(map));
	}

	@Given("^user send post request for auth reversal offer at perticular MID and TID$")
	public void user_send_post_request_for_auth_reversal_offer_at_perticular_MID_and_TID() throws Throwable {
		Map<Object, Object> map = new LinkedHashMap<Object, Object>();
		map.put("channel", ECOM);
		map.put("transactionAmount", Rs_20);
		map.put("productCode", "null");
		map.put("amount", Rs_20);
		map.put("merchantName", MaathavanHome);
		map.put("txnRefNo", APIConstants.txnRefNo);
		map.put("proxyCardNo", Card3);
		map.put("mcc", MCC_3001);
		map.put("network", RUPAY);
		map.put("merchantID", "12322155");
		map.put("terminalID", "Terminal 1");
		map.put("institutionCode", "458519");
		map.put("txnRefNo", APIConstants.txnRefNo);
		map.put("retrievalRefNo", APIConstants.retrivalRefNo);
		response = api.post(APIConstants.AuthReversal_CashbackDebitURL,
				APIBody.getAuthReversalRequestBodyWithDuplicateTxnRefNo(map));
	}

	@Then("^user must be get description Transaction not found for originalRrn$")
	public void user_must_be_get_description_Transaction_not_found_for_originalRrn() throws Throwable {
		String desc = api.getDescription(response);
		if (!desc.equalsIgnoreCase("Transaction not found for originalRrn"))
			Assert.assertEquals(desc, "Transaction not found for originalRrn");
		String status = api.getStatus(response);
		if (!status.equalsIgnoreCase("false"))
			Assert.assertEquals(status, "false");
	}

	@Given("^user send post request for auth credit card not found$")
	public void user_send_post_request_for_auth_credit_card_not_found() throws Throwable {
		Map<Object, Object> map = new LinkedHashMap<Object, Object>();
		map.put("entityId", EntityId2);
		map.put("proxyCardNo", "12345678");
		map.put("rrn", APIConstants.retrivalRefNo);
		map.put("transactionAmount", "000000002100");
		map.put("amount", "000000002100");
		map.put("merchantID", "null");
		map.put("merchantName", MaathavanHome);
		map.put("transactionType", FUNDPOST_CREDIT);
		map.put("terminalID", "null");
		map.put("mcc", "null");
		map.put("network", RUPAY);
		map.put("channel", FUND_POST);
		map.put("originalRrn", APIConstants.retrivalRefNo);
		map.put("txnRefNo", APIConstants.txnRefNo);
		response = api.post(APIConstants.AuthCredit_CashbackRefundURL,
				APIBody.getAuthCreditRequestBodyWithDuplicateTxnRefNo(map));
	}

	@Then("^user must be get description Card not found$")
	public void user_must_be_get_description_Card_not_found() throws Throwable {
		String desc = api.getDescription(response);
		if (!desc.equalsIgnoreCase("Card not found"))
			Assert.assertEquals(desc, "Card not found");
	}

	@Given("^user send post request for auth credit entity details not found$")
	public void user_send_post_request_for_auth_credit_entity_details_not_found() throws Throwable {
		Map<Object, Object> map = new LinkedHashMap<Object, Object>();
		map.put("entityId", "72d0550c-3e30");
		map.put("proxyCardNo", Card2);
		map.put("rrn", APIConstants.retrivalRefNo);
		map.put("transactionAmount", Rs_20);
		map.put("amount", Rs_20);
		map.put("merchantID", "null");
		map.put("merchantName", MaathavanHome);
		map.put("transactionType", FUNDPOST_CREDIT);
		map.put("terminalID", "null");
		map.put("mcc", "null");
		map.put("network", RUPAY);
		map.put("channel", FUND_POST);
		map.put("originalRrn", APIConstants.retrivalRefNo);
		map.put("txnRefNo", APIConstants.txnRefNo);
		response = api.post(APIConstants.AuthCredit_CashbackRefundURL,
				APIBody.getAuthCreditRequestBodyWithDuplicateTxnRefNo(map));
	}

	@Then("^user must be get description Entity details not found$")
	public void user_must_be_get_description_Entity_details_not_found() throws Throwable {
		String desc = api.getDescription(response);
		if (!desc.equalsIgnoreCase("Entity details not found"))
			Assert.assertEquals(desc, "Entity details not found");
//		APIConstants.txnRefNo = response.getBody().path("txnRefNo").toString();
//		//APIConstants.balance = String.valueOf(response.getBody().path("balance"));
	}

	@Given("^user send post request for auth reversal invalid transaction$")
	public void user_send_post_request_for_auth_reversal_invalid_transaction() throws Throwable {
		Map<Object, Object> map = new LinkedHashMap<Object, Object>();
		map.put("channel", ECOM);
		map.put("transactionAmount", Rs_20);
		map.put("productCode", "null");
		map.put("amount", Rs_20);
		map.put("merchantName", MaathavanHome);
		map.put("txnRefNo", APIConstants.txnRefNo);
		map.put("proxyCardNo", "31000018");
		map.put("mcc", "null");
		map.put("network", RUPAY);
		map.put("merchantID", "null");
		map.put("terminalID", "null");
		map.put("institutionCode", "458519");
		map.put("txnRefNo", APIConstants.txnRefNo);
		map.put("retrievalRefNo", APIConstants.retrivalRefNo);
		response = api.post(APIConstants.AuthReversal_CashbackDebitURL,
				APIBody.getAuthReversalRequestBodyWithDuplicateTxnRefNo(map));
	}

	@Given("^user send post request for auth credit transaction not found for original rrn$")
	public void user_send_post_request_for_auth_credit_transaction_not_found_for_original_rrn() throws Throwable {
		Map<Object, Object> map = new LinkedHashMap<Object, Object>();
		map.put("entityId", EntityId2);
		map.put("proxyCardNo", Card13);
		map.put("rrn", APIConstants.retrivalRefNo);
		map.put("txnRefNo", APIConstants.retrivalRefNo);
		map.put("transactionAmount", "000000005500");
		map.put("amount", "000000005500");
		map.put("merchantID", "null");
		map.put("merchantName", MaathavanHome);
		map.put("transactionType", FUNDPOST_CREDIT);
		map.put("terminalID", "null");
		map.put("mcc", "null");
		map.put("network", RUPAY);
		map.put("channel", FUND_POST);
		map.put("originalRrn", APIConstants.retrivalRefNo);
		response = api.post(APIConstants.AuthCredit_CashbackRefundURL,
				APIBody.getAuthCreditRequestBodyWithDuplicateTxnRefNo(map));
	}

	@Given("^user send post request for auth reversal already reversed$")
	public void user_send_post_request_for_auth_reversal_already_reversed() throws Throwable {
		Map<Object, Object> map = new LinkedHashMap<Object, Object>();
		map.put("channel", ECOM);
		map.put("transactionAmount", Rs_20);
		map.put("productCode", "null");
		map.put("amount", Rs_20);
		map.put("merchantName", MaathavanHome);
		map.put("txnRefNo", APIConstants.txnRefNo);
		map.put("proxyCardNo", Card3);
		map.put("mcc", MCC_3001);
		map.put("network", RUPAY);
		map.put("merchantID", "null");
		map.put("terminalID", "null");
		map.put("institutionCode", "458519");
//		APIConstants.retrivalRefNo = RandomStringUtils.randomNumeric(10);
		map.put("retrievalRefNo", APIConstants.retrivalRefNo);
		response = api.post(APIConstants.AuthReversal_CashbackDebitURL,
				APIBody.getAuthReversalRequestBodyWithDuplicateTxnRefNo(map));
	}

	@Then("^user must be get description Already Reversed$")
	public void user_must_be_get_description_Already_Reversed() throws Throwable {
		String desc = api.getDescription(response);
		if (!desc.equalsIgnoreCase("Already Reversed"))
			Assert.assertEquals(desc, "Already Reversed");
		APIConstants.txnRefNo = response.getBody().path("txnRefNo").toString();
		// APIConstants.balance = String.valueOf(response.getBody().path("balance"));
	}

	@Given("^user send post request for auth reversal already reversed with markup$")
	public void user_send_post_request_for_auth_reversal_already_reversed_with_markup() throws Throwable {
		Map<Object, Object> map = new LinkedHashMap<Object, Object>();
		map.put("channel", ECOM);
		map.put("transactionAmount", Rs_20);
		map.put("productCode", "null");
		map.put("amount", Rs_20);
		map.put("merchantName", MaathavanHome);
		map.put("txnRefNo", APIConstants.txnRefNo);
		map.put("proxyCardNo", Card4);
		map.put("mcc", MCC_3017);
		map.put("network", RUPAY);
		map.put("merchantID", "null");
		map.put("terminalID", "null");
		map.put("institutionCode", "458519");
		APIConstants.retrivalRefNo = RandomStringUtils.randomNumeric(10);
		map.put("retrievalRefNo", APIConstants.retrivalRefNo);
		response = api.post(APIConstants.AuthReversal_CashbackDebitURL,
				APIBody.getAuthReversalRequestBodyWithDuplicateTxnRefNo(map));
	}

	@Given("^user send post request for auth reversal failed$")
	public void user_send_post_request_for_auth_reversal_failed() throws Throwable {
		Map<Object, Object> map = new LinkedHashMap<Object, Object>();
		map.put("channel", ATM);
		map.put("transactionAmount", Rs_20);
		map.put("productCode", "null");
		map.put("amount", Rs_20);
		map.put("merchantName", MaathavanHome);
		map.put("txnRefNo", APIConstants.txnRefNo);
		map.put("proxyCardNo", Card1);
		map.put("mcc", "null");
		map.put("network", RUPAY);
		map.put("merchantID", "null");
		map.put("terminalID", "null");
		map.put("institutionCode", "458519");
		APIConstants.retrivalRefNo = RandomStringUtils.randomNumeric(10);
		map.put("retrievalRefNo", APIConstants.retrivalRefNo);
		response = api.post(APIConstants.AuthReversal_CashbackDebitURL,
				APIBody.getAuthReversalRequestBodyWithDuplicateTxnRefNo(map));
	}

	@Given("^user send post request for auth reversal after uplate fee$")
	public void user_send_post_request_for_auth_reversal_after_uplate_fee() throws Throwable {
		Map<Object, Object> map = new LinkedHashMap<Object, Object>();
		map.put("channel", ATM);
		map.put("transactionAmount", Rs_20);
		map.put("productCode", "null");
		map.put("amount", Rs_20);
		map.put("merchantName", MaathavanHome);
		map.put("txnRefNo", APIConstants.txnRefNo);
		map.put("proxyCardNo", Card30);
		map.put("mcc", MCC_3001);
		map.put("network", RUPAY);
		map.put("merchantID", "null");
		map.put("terminalID", "null");
		map.put("institutionCode", "458519");
		map.put("retrievalRefNo", APIConstants.retrivalRefNo);
		response = api.post(APIConstants.AuthReversal_CashbackDebitURL,
				APIBody.getAuthReversalRequestBodyWithDuplicateTxnRefNo(map));
	}

	@Given("^user send post request for auth reversal ATM_FEE will be reversed during Auth Reversal$")
	public void user_send_post_request_for_auth_reversal_ATM_FEE_will_be_reversed_during_Auth_Reversal()
			throws Throwable {
		Map<Object, Object> map = new LinkedHashMap<Object, Object>();
		map.put("channel", ATM);
		map.put("transactionAmount", Rs_20);
		map.put("productCode", "null");
		map.put("amount", Rs_20);
		map.put("merchantName", MaathavanHome);
		map.put("txnRefNo", APIConstants.txnRefNo);
		map.put("proxyCardNo", Card32);
		map.put("mcc", MCC_3017);
		map.put("network", RUPAY);
		map.put("merchantID", "null");
		map.put("terminalID", "null");
		map.put("institutionCode", "458519");
		map.put("retrievalRefNo", APIConstants.retrivalRefNo);
		response = api.post(APIConstants.AuthReversal_CashbackDebitURL,
				APIBody.getAuthReversalRequestBodyWithDuplicateTxnRefNo(map));
	}

	@Given("^user send post request for auth reversal ATM_FEE will be reversed during Auth Reversal second$")
	public void user_send_post_request_for_auth_reversal_ATM_FEE_will_be_reversed_during_Auth_Reversal_second()
			throws Throwable {
		Map<Object, Object> map = new LinkedHashMap<Object, Object>();
		map.put("channel", ATM);
		map.put("transactionAmount", Rs_20);
		map.put("productCode", "null");
		map.put("amount", Rs_20);
		map.put("merchantName", MaathavanHome);
		map.put("txnRefNo", APIConstants.txnRefNo);
		map.put("proxyCardNo", Card31);
		map.put("mcc", MCC_3001);
		map.put("network", RUPAY);
		map.put("merchantID", "12322155");
		map.put("terminalID", "Terminal 1");
		map.put("institutionCode", "458519");
		map.put("retrievalRefNo", APIConstants.retrivalRefNo);
		response = api.post(APIConstants.AuthReversal_CashbackDebitURL,
				APIBody.getAuthReversalRequestBodyWithDuplicateTxnRefNo(map));
	}
	@Given("^user send post request for auth reversal ATM_FEE will be reversed during Auth Reversal third$")
	public void user_send_post_request_for_auth_reversal_ATM_FEE_will_be_reversed_during_Auth_Reversal_third()
			throws Throwable {
		Map<Object, Object> map = new LinkedHashMap<Object, Object>();
		map.put("channel", ATM);
		map.put("transactionAmount", Rs_20);
		map.put("productCode", "null");
		map.put("amount", Rs_20);
		map.put("merchantName", MaathavanHome);
		map.put("txnRefNo", APIConstants.txnRefNo);
		map.put("proxyCardNo", Card32);
		map.put("mcc", MCC_3017);
		map.put("network", RUPAY);
		map.put("merchantID", "12322155");
		map.put("terminalID", "Terminal 1");
		map.put("institutionCode", "458519");
		map.put("retrievalRefNo", APIConstants.retrivalRefNo);
		response = api.post(APIConstants.AuthReversal_CashbackDebitURL,
				APIBody.getAuthReversalRequestBodyWithDuplicateTxnRefNo(map));
	}

	@Given("^user send post request for auth credit for auth debit failed$")
	public void user_send_post_request_for_auth_credit_for_auth_debit_failed() throws Throwable {
		Map<Object, Object> map = new LinkedHashMap<Object, Object>();
		map.put("entityId", EntityId1);
		map.put("proxyCardNo", Card1);
		map.put("rrn", APIConstants.retrivalRefNo);
		map.put("txnRefNo", APIConstants.retrivalRefNo);
		map.put("transactionAmount", "000000001200");
		map.put("amount", Rs_20);
		map.put("merchantID", "null");
		map.put("merchantName", MaathavanHome);
		map.put("transactionType", FUNDPOST_CREDIT);
		map.put("terminalID", "null");
		map.put("mcc", "null");
		map.put("network", RUPAY);
		map.put("channel", FUND_POST);
		map.put("originalRrn", APIConstants.retrivalRefNo);
		response = api.post(APIConstants.AuthCredit_CashbackRefundURL,
				APIBody.getAuthCreditRequestBodyWithDuplicateTxnRefNo(map));
	}

	@Given("^user send post request for auth credit after fee update$")
	public void user_send_post_request_for_auth_credit_after_fee_update() throws Throwable {
		Map<Object, Object> map = new LinkedHashMap<Object, Object>();
		map.put("entityId", EntityId19);
		map.put("proxyCardNo", Card30);
		map.put("rrn", APIConstants.retrivalRefNo);
		map.put("txnRefNo", APIConstants.retrivalRefNo);
		map.put("transactionAmount", Rs_20);
		map.put("amount", Rs_20);
		map.put("merchantID", "null");
		map.put("merchantName", MaathavanHome);
		map.put("transactionType", FUNDPOST_CREDIT);
		map.put("terminalID", "null");
		map.put("mcc", "null");
		map.put("network", RUPAY);
		map.put("channel", FUND_POST);
		map.put("originalRrn", APIConstants.retrivalRefNo);
		response = api.post(APIConstants.AuthCredit_CashbackRefundURL,
				APIBody.getAuthCreditRequestBodyWithDuplicateTxnRefNo(map));
	}

	@Given("^user send post request for auth credit for card loaded with other pocket$")
	public void user_send_post_request_for_auth_credit_for_card_loaded_with_other_pocket() throws Throwable {
		Map<Object, Object> map = new LinkedHashMap<Object, Object>();
		map.put("entityId", EntityId2);
		map.put("proxyCardNo", Card3);
		map.put("rrn", APIConstants.retrivalRefNo);
		map.put("txnRefNo", APIConstants.retrivalRefNo);
		map.put("transactionAmount", "000000001200");
		map.put("amount", Rs_20);
		map.put("merchantID", "null");
		map.put("merchantName", MaathavanHome);
		map.put("transactionType", FUNDPOST_CREDIT);
		map.put("terminalID", "null");
		map.put("mcc", "null");
		map.put("network", RUPAY);
		map.put("channel", FUND_POST);
		map.put("originalRrn", APIConstants.retrivalRefNo);
		response = api.post(APIConstants.AuthCredit_CashbackRefundURL,
				APIBody.getAuthCreditRequestBodyWithDuplicateTxnRefNo(map));
	}

	@Given("^user send post request for auth credit for amount can be credited back entity having markup$")
	public void user_send_post_request_for_auth_credit_for_amount_can_be_credited_back_entity_having_markup()
			throws Throwable {
		Map<Object, Object> map = new LinkedHashMap<Object, Object>();
		map.put("entityId", EntityId2);
		map.put("proxyCardNo", Card4);
		map.put("rrn", APIConstants.retrivalRefNo);
		map.put("txnRefNo", APIConstants.retrivalRefNo);
		map.put("transactionAmount", "000000000900");
		map.put("amount", Rs_20);
		map.put("merchantID", "null");
		map.put("merchantName", MaathavanHome);
		map.put("transactionType", FUNDPOST_CREDIT);
		map.put("terminalID", "null");
		map.put("mcc", MCC_3017);
		map.put("network", RUPAY);
		map.put("channel", FUND_POST);
		map.put("originalRrn", APIConstants.retrivalRefNo);
		response = api.post(APIConstants.AuthCredit_CashbackRefundURL,
				APIBody.getAuthCreditRequestBodyWithDuplicateTxnRefNo(map));
	}

	@Given("^user send post request for auth credit for amount can be credited back entity having markup and cashback$")
	public void user_send_post_request_for_auth_credit_for_amount_can_be_credited_back_entity_having_markup_and_cashback()
			throws Throwable {
		Map<Object, Object> map = new LinkedHashMap<Object, Object>();
		map.put("entityId", EntityId2);
		map.put("proxyCardNo", Card4);
		map.put("rrn", APIConstants.retrivalRefNo);
		map.put("txnRefNo", APIConstants.retrivalRefNo);
		map.put("transactionAmount", "000000000900");
		map.put("amount", Rs_20);
		map.put("merchantID", "null");
		map.put("merchantName", MaathavanHome);
		map.put("transactionType", FUNDPOST_CREDIT);
		map.put("terminalID", "null");
		map.put("mcc", MCC_3017);
		map.put("network", RUPAY);
		map.put("channel", FUND_POST);
		map.put("originalRrn", APIConstants.retrivalRefNo);
		response = api.post(APIConstants.AuthCredit_CashbackRefundURL,
				APIBody.getAuthCreditRequestBodyWithDuplicateTxnRefNo(map));
	}

	@Given("^user send post request for auth credit for amount can be credited back entity having cashback$")
	public void user_send_post_request_for_auth_credit_for_amount_can_be_credited_back_entity_having_cashback()
			throws Throwable {
		Map<Object, Object> map = new LinkedHashMap<Object, Object>();
		map.put("entityId", EntityId2);
		map.put("proxyCardNo", Card3);
		map.put("rrn", APIConstants.retrivalRefNo);
		map.put("txnRefNo", APIConstants.retrivalRefNo);
		map.put("transactionAmount", "000000000900");
		map.put("amount", Rs_20);
		map.put("merchantID", "null");
		map.put("merchantName", MaathavanHome);
		map.put("transactionType", FUNDPOST_CREDIT);
		map.put("terminalID", "null");
		map.put("mcc", MCC_3001);
		map.put("network", RUPAY);
		map.put("channel", FUND_POST);
		map.put("originalRrn", APIConstants.retrivalRefNo);
		response = api.post(APIConstants.AuthCredit_CashbackRefundURL,
				APIBody.getAuthCreditRequestBodyWithDuplicateTxnRefNo(map));
	}

	@Given("^user send post request for auth credit for same rrn in 2 auth debit$")
	public void user_send_post_request_for_auth_credit_for_same_rrn_in_2_auth_debit() throws Throwable {
		Map<Object, Object> map = new LinkedHashMap<Object, Object>();
		map.put("entityId", EntityId2);
		map.put("proxyCardNo", Card2);
		map.put("rrn", APIConstants.retrivalRefNo);
		map.put("transactionAmount", Rs_20);
		map.put("amount", Rs_20);
		map.put("merchantID", "null");
		map.put("merchantName", MaathavanHome);
		map.put("transactionType", FUNDPOST_CREDIT);
		map.put("terminalID", "null");
		map.put("mcc", MCC_742);
		map.put("network", RUPAY);
		map.put("channel", FUND_POST);
		map.put("originalRrn", APIConstants.retrivalRefNo);
		map.put("txnRefNo", APIConstants.txnRefNo);
		response = api.post(APIConstants.AuthCredit_CashbackRefundURL,
				APIBody.getAuthCreditRequestBodyWithDuplicateTxnRefNo(map));
	}

	@Given("^user send post request for markup check for default gc$")
	public void user_send_post_request_for_markup_check_for_default_gc() throws Throwable {
		Map<Object, Object> map = new LinkedHashMap<Object, Object>();
		map.put("merchantName", MaathavanHome);
		map.put("terminalID", "null");
		map.put("mcc", MCC_3017);
		map.put("entityId", EntityId2);
		map.put("proxyCardNo", Card4);
		map.put("network", RUPAY);
		map.put("channel", POS);
		map.put("merchantId", "null");
		map.put("amount", Rs_20);
		map.put("transactionAmount", Rs_20);
		map.put("billingAmount", Rs_20);
		APIConstants.retrivalRefNo = RandomStringUtils.randomNumeric(10);
		map.put("retrievalRefNo", APIConstants.retrivalRefNo);
		response = api.post(APIConstants.AuthDebit_CashbackCreditURL, APIBody.getAuthDebitRequestBody(map));
	}

	@Given("^user send post request for markup check for sd gc$")
	public void user_send_post_request_for_markup_check_for_sd_gc() throws Throwable {
		Map<Object, Object> map = new LinkedHashMap<Object, Object>();
		map.put("merchantName", MaathavanHome);
		map.put("terminalID", "null");
		map.put("mcc", MCC_3017);
		map.put("entityId", EntityId3);
		map.put("proxyCardNo", Card6);
		map.put("network", RUPAY);
		map.put("channel", ECOM);
		map.put("merchantId", "null");
		map.put("amount", Rs_2);
		map.put("transactionAmount", Rs_2);
		map.put("billingAmount", Rs_2);
		APIConstants.retrivalRefNo = RandomStringUtils.randomNumeric(10);
		map.put("retrievalRefNo", APIConstants.retrivalRefNo);
		response = api.post(APIConstants.AuthDebit_CashbackCreditURL, APIBody.getAuthDebitRequestBody(map));
	}

	@Given("^user send post request for markup check for default GPR$")
	public void user_send_post_request_for_markup_check_for_default_gpr() throws Throwable {
		Map<Object, Object> map = new LinkedHashMap<Object, Object>();
		map.put("merchantName", MaathavanHome);
		map.put("terminalID", "null");
		map.put("mcc", "3030");
		map.put("entityId", EntityId4);
		map.put("proxyCardNo", Card7);
		map.put("network", RUPAY);
		map.put("channel", ECOM);
		map.put("merchantId", "null");
		map.put("amount", Rs_20);
		map.put("transactionAmount", Rs_20);
		map.put("billingAmount", Rs_20);
		APIConstants.retrivalRefNo = RandomStringUtils.randomNumeric(10);
		map.put("retrievalRefNo", APIConstants.retrivalRefNo);
		response = api.post(APIConstants.AuthDebit_CashbackCreditURL, APIBody.getAuthDebitRequestBody(map));
	}

	@Given("^user send post request for markup check for 6.3$")
	public void user_send_post_request_for_markup_check_for_6_3() throws Throwable {
		Map<Object, Object> map = new LinkedHashMap<Object, Object>();
		map.put("merchantName", MaathavanHome);
		map.put("terminalID", "null");
		map.put("mcc", MCC_3017);
		map.put("entityId", EntityId6);
		map.put("proxyCardNo", Card10);
		map.put("network", RUPAY);
		map.put("channel", ECOM);
		map.put("merchantId", "null");
		map.put("amount", Rs_20);
		map.put("transactionAmount", Rs_20);
		map.put("billingAmount", Rs_20);
		APIConstants.retrivalRefNo = RandomStringUtils.randomNumeric(10);
		map.put("retrievalRefNo", APIConstants.retrivalRefNo);
		response = api.post(APIConstants.AuthDebit_CashbackCreditURL, APIBody.getAuthDebitRequestBody(map));
	}

	@Given("^user send post request for auth credit for rrn mismatch$")
	public void user_send_post_request_for_auth_credit_for_rrn_mismatch() throws Throwable {
		Map<Object, Object> map = new LinkedHashMap<Object, Object>();
		map.put("entityId", EntityId2);
		map.put("proxyCardNo", Card2);
		map.put("rrn", APIConstants.retrivalRefNo);
		map.put("transactionAmount", Rs_20);
		map.put("amount", Rs_20);
		map.put("merchantID", "null");
		map.put("merchantName", MaathavanHome);
		map.put("transactionType", FUNDPOST_CREDIT);
		map.put("terminalID", "null");
		map.put("mcc", MCC_742);
		map.put("network", RUPAY);
		map.put("channel", FUND_POST);
		APIConstants.retrivalRefNo = RandomStringUtils.randomNumeric(10);
		map.put("originalRrn", APIConstants.retrivalRefNo);
		map.put("txnRefNo", APIConstants.txnRefNo);
		response = api.post(APIConstants.AuthCredit_CashbackRefundURL,
				APIBody.getAuthCreditRequestBodyWithDuplicateTxnRefNo(map));
	}

	@Given("^user send post request for proxy card with mcc pocket limit 0$")
	public void user_send_post_request_for_proxy_card_with_mcc_pocket_limit_0() throws Throwable {
		Map<Object, Object> map = new LinkedHashMap<Object, Object>();
		map.put("merchantName", MaathavanHome);
		map.put("terminalID", "null");
		map.put("mcc", MCC_3000);
		map.put("entityId", EntityId1);
		map.put("proxyCardNo", Card8);
		map.put("network", RUPAY);
		map.put("channel", ECOM);
		map.put("merchantId", "null");
		map.put("amount", Rs_20);
		map.put("transactionAmount", Rs_20);
		map.put("billingAmount", Rs_20);
		APIConstants.retrivalRefNo = RandomStringUtils.randomNumeric(10);
		map.put("retrievalRefNo", APIConstants.retrivalRefNo);
		response = api.post(APIConstants.AuthDebit_CashbackCreditURL, APIBody.getAuthDebitRequestBody(map));
	}

	@Then("^user must be get description Insufficient funds - MCC Restriction$")
	public void user_must_be_get_description_Insufficient_funds_MCC_Restriction() throws Throwable {
		String desc = api.getDescription(response);
		if (!desc.equalsIgnoreCase("Insufficient funds - MCC Restriction"))
			Assert.assertEquals(desc, "Insufficient funds - MCC Restriction");
		APIConstants.txnRefNo = response.getBody().path("txnRefNo").toString();
		// APIConstants.balance = String.valueOf(response.getBody().path("balance"));
	}

	@Given("^user send post request for auth reversal for txn amount is greter than debit amount$")
	public void user_send_post_request_for_auth_reversal_for_txn_amount_is_greter_than_debit_amount() throws Throwable {
		Map<Object, Object> map = new LinkedHashMap<Object, Object>();
		map.put("channel", ECOM);
		map.put("transactionAmount", Rs_201);
		map.put("productCode", "null");
		map.put("amount", Rs_201);
		map.put("txnRefNo", APIConstants.txnRefNo);
		map.put("merchantName", MaathavanHome);
		map.put("proxyCardNo", Card2);
		map.put("mcc", "null");
		map.put("network", RUPAY);
		map.put("merchantID", "null");
		map.put("terminalID", "null");
		map.put("institutionCode", "458519");
		map.put("retrievalRefNo", APIConstants.retrivalRefNo);
		response = api.post(APIConstants.AuthReversal_CashbackDebitURL,
				APIBody.getAuthReversalRequestBodyWithDuplicateTxnRefNo(map));
	}

	@Then("^user must be get description Transaction amount is not matching with original transaction$")
	public void user_must_be_get_description_Transaction_amount_is_not_matching_with_original_transaction()
			throws Throwable {
		String desc = api.getDescription(response);
		if (!desc.equalsIgnoreCase("Transaction amount is not matching with original transaction"))
			Assert.assertEquals(desc, "Transaction amount is not matching with original transaction");
		APIConstants.txnRefNo = response.getBody().path("txnRefNo").toString();
		// APIConstants.balance = String.valueOf(response.getBody().path("balance"));
	}

	@Given("^user send post request for auth credit for txn amount is greter than debit amount$")
	public void user_send_post_request_for_auth_credit_for_txn_amount_is_greter_than_debit_amount() throws Throwable {
		Map<Object, Object> map = new LinkedHashMap<Object, Object>();
		map.put("entityId", EntityId2);
		map.put("proxyCardNo", Card2);
		map.put("rrn", APIConstants.retrivalRefNo);
		map.put("transactionAmount", Rs_201);
		map.put("amount", Rs_201);
		map.put("merchantID", "null");
		map.put("merchantName", MaathavanHome);
		map.put("transactionType", FUNDPOST_CREDIT);
		map.put("terminalID", "null");
		map.put("mcc", "null");
		map.put("network", RUPAY);
		map.put("channel", FUND_POST);
		map.put("originalRrn", APIConstants.retrivalRefNo);
		map.put("txnRefNo", APIConstants.txnRefNo);
		response = api.post(APIConstants.AuthCredit_CashbackRefundURL,
				APIBody.getAuthCreditRequestBodyWithDuplicateTxnRefNo(map));
	}

	@Given("^user send post request for auth reversal for txn amount is less than debit amount$")
	public void user_send_post_request_for_auth_reversal_for_txn_amount_is_less_than_debit_amount() throws Throwable {
		Map<Object, Object> map = new LinkedHashMap<Object, Object>();
		map.put("channel", ECOM);
		map.put("transactionAmount", Rs_2);
		map.put("productCode", "null");
		map.put("amount", Rs_2);
		map.put("merchantName", MaathavanHome);
		map.put("txnRefNo", APIConstants.txnRefNo);
		map.put("proxyCardNo", Card2);
		map.put("mcc", "null");
		map.put("network", RUPAY);
		map.put("merchantID", "null");
		map.put("terminalID", "null");
		map.put("institutionCode", "458519");
		map.put("retrievalRefNo", APIConstants.retrivalRefNo);
		response = api.post(APIConstants.AuthReversal_CashbackDebitURL,
				APIBody.getAuthReversalRequestBodyWithDuplicateTxnRefNo(map));
	}

	@Given("^user send post request for auth credit for txn amount is equal to debit amount$")
	public void user_send_post_request_for_auth_credit_for_txn_amount_is_equal_to_debit_amount() throws Throwable {
		Map<Object, Object> map = new LinkedHashMap<Object, Object>();
		map.put("entityId", EntityId2);
		map.put("proxyCardNo", Card2);
		map.put("rrn", APIConstants.retrivalRefNo);
		map.put("transactionAmount", Rs_20);
		map.put("amount", Rs_20);
		map.put("merchantID", "null");
		map.put("merchantName", MaathavanHome);
		map.put("transactionType", FUNDPOST_CREDIT);
		map.put("terminalID", "null");
		map.put("mcc", "null");
		map.put("network", RUPAY);
		map.put("channel", FUND_POST);
		map.put("originalRrn", APIConstants.retrivalRefNo);
		map.put("txnRefNo", APIConstants.txnRefNo);
		response = api.post(APIConstants.AuthCredit_CashbackRefundURL,
				APIBody.getAuthCreditRequestBodyWithDuplicateTxnRefNo(map));
	}

	@Given("^user send post request for auth reversal for proxy card no is not same as original transaction proxy card no$")
	public void user_send_post_request_for_auth_reversal_for_proxy_card_no_is_not_same_as_original_transaction_proxy_card_no()
			throws Throwable {
		Map<Object, Object> map = new LinkedHashMap<Object, Object>();
		map.put("channel", ECOM);
		map.put("transactionAmount", Rs_20);
		map.put("productCode", "null");
		map.put("amount", Rs_20);
		map.put("merchantName", MaathavanHome);
		map.put("proxyCardNo", Card2);
		map.put("mcc", "null");
		map.put("network", RUPAY);
		map.put("merchantID", "null");
		map.put("terminalID", "null");
		map.put("institutionCode", "458519");
		map.put("retrievalRefNo", APIConstants.retrivalRefNo);
		map.put("txnRefNo", APIConstants.txnRefNo);
		response = api.post(APIConstants.AuthReversal_CashbackDebitURL,
				APIBody.getAuthReversalRequestBodyWithDuplicateTxnRefNo(map));
	}

	@Given("^user send post request for auth credit for txn not found$")
	public void user_send_post_request_for_auth_credit_for_txn_not_found() throws Throwable {
		Map<Object, Object> map = new LinkedHashMap<Object, Object>();
		map.put("entityId", EntityId2);
		map.put("proxyCardNo", Card3);
		map.put("rrn", APIConstants.tempRetrivalRefNo);
		map.put("transactionAmount", Rs_20);
		map.put("amount", Rs_20);
		map.put("merchantID", "null");
		map.put("merchantName", MaathavanHome);
		map.put("transactionType", FUNDPOST_CREDIT);
		map.put("terminalID", "null");
		map.put("mcc", "null");
		map.put("network", RUPAY);
		map.put("channel", FUND_POST);
		map.put("originalRrn", APIConstants.tempRetrivalRefNo);
		map.put("txnRefNo", APIConstants.txnRefNo);
		response = api.post(APIConstants.AuthCredit_CashbackRefundURL,
				APIBody.getAuthCreditRequestBodyWithDuplicateTxnRefNo(map));
	}

	@Given("^user send post request for auth credit for same user hash id$")
	public void user_send_post_request_for_auth_credit_for_same_user_hash_id() throws Throwable {
		Map<Object, Object> map = new LinkedHashMap<Object, Object>();
		map.put("entityId", EntityId2);
		map.put("proxyCardNo", Card3);
		map.put("rrn", APIConstants.retrivalRefNo);
		map.put("transactionAmount", Rs_20);
		map.put("amount", Rs_20);
		map.put("merchantID", "null");
		map.put("merchantName", MaathavanHome);
		map.put("transactionType", FUNDPOST_CREDIT);
		map.put("terminalID", "null");
		map.put("mcc", "null");
		map.put("network", RUPAY);
		map.put("channel", FUND_POST);
		map.put("originalRrn", APIConstants.retrivalRefNo);
		map.put("txnRefNo", APIConstants.txnRefNo);
		response = api.post(APIConstants.AuthCredit_CashbackRefundURL,
				APIBody.getAuthCreditRequestBodyWithDuplicateTxnRefNo(map));
	}

	@Given("^user send post request for no offer at perticular MID or TID$")
	public void user_send_post_request_for_no_offer_at_perticular_MID_or_TID() throws Throwable {
		Map<Object, Object> map = new LinkedHashMap<Object, Object>();
		map.put("merchantName", MaathavanHome);
		map.put("terminalID", "123456");
		map.put("mcc", "5013");
		map.put("entityId", EntityId2);
		map.put("proxyCardNo", "19530075");
		map.put("network", RUPAY);
		map.put("channel", ECOM);
		map.put("merchantId", "111111111");
		map.put("amount", Rs_20);
		map.put("transactionAmount", Rs_20);
		map.put("billingAmount", Rs_20);
		APIConstants.retrivalRefNo = RandomStringUtils.randomNumeric(10);
		map.put("retrievalRefNo", APIConstants.retrivalRefNo);
		response = api.post(APIConstants.AuthDebit_CashbackCreditURL, APIBody.getAuthDebitRequestBody(map));
	}

	@Given("^user send post request for auth reversal more than one mcc$")
	public void user_send_post_request_for_auth_reversal_more_than_one_mcc() throws Throwable {
		Map<Object, Object> map = new LinkedHashMap<Object, Object>();
		map.put("channel", ECOM);
		map.put("transactionAmount", Rs_20);
		map.put("productCode", "null");
		map.put("amount", Rs_20);
		map.put("merchantName", MaathavanHome);
		map.put("proxyCardNo", "19530075");
		map.put("mcc", "5021");
		map.put("network", RUPAY);
		map.put("merchantID", "111111111");
		map.put("terminalID", "123456");
		map.put("institutionCode", "458519");
		map.put("retrievalRefNo", APIConstants.retrivalRefNo);
		map.put("txnRefNo", APIConstants.txnRefNo);
		response = api.post(APIConstants.AuthReversal_CashbackDebitURL,
				APIBody.getAuthReversalRequestBodyWithDuplicateTxnRefNo(map));
	}

	@Given("^user send post request for offer at perticular MID or TID for default GC$")
	public void user_send_post_request_for_offer_at_perticular_MID_or_TID_for_default_GC() throws Throwable {
		Map<Object, Object> map = new LinkedHashMap<Object, Object>();
		map.put("merchantName", MaathavanHome);
		map.put("terminalID", "Terminal1");
		map.put("mcc", MCC_3001);
		map.put("entityId", EntityId2);
		map.put("proxyCardNo", Card3);
		map.put("network", RUPAY);
		map.put("channel", ECOM);
		map.put("merchantId", "12322155");
		map.put("amount", Rs_20);
		map.put("transactionAmount", Rs_20);
		map.put("billingAmount", Rs_20);
		APIConstants.retrivalRefNo = RandomStringUtils.randomNumeric(10);
		map.put("retrievalRefNo", APIConstants.retrivalRefNo);
		response = api.post(APIConstants.AuthDebit_CashbackCreditURL, APIBody.getAuthDebitRequestBody(map));
	}

	@Given("^user send post request for auth reversal offer at perticular MID or TID for default GC$")
	public void user_send_post_request_for_auth_reversal_offer_at_perticular_MID_or_TID_for_default_GC()
			throws Throwable {
		Map<Object, Object> map = new LinkedHashMap<Object, Object>();
		map.put("channel", ECOM);
		map.put("transactionAmount", Rs_20);
		map.put("productCode", "null");
		map.put("amount", Rs_20);
		map.put("merchantName", MaathavanHome);
		map.put("proxyCardNo", Card3);
		map.put("mcc", MCC_3001);
		map.put("network", RUPAY);
		map.put("merchantID", "12322155");
		map.put("terminalID", "Terminal1");
		map.put("institutionCode", "458519");
		map.put("retrievalRefNo", APIConstants.retrivalRefNo);
		map.put("txnRefNo", APIConstants.txnRefNo);
		response = api.post(APIConstants.AuthReversal_CashbackDebitURL,
				APIBody.getAuthReversalRequestBodyWithDuplicateTxnRefNo(map));
	}

	@Then("^user must be get description Proxy Card No is not same as original transaction proxy Card No\\.$")
	public void user_must_be_get_description_Proxy_Card_No_is_not_same_as_original_transaction_proxy_Card_No()
			throws Throwable {
		String desc = api.getDescription(response);
		if (!desc.equalsIgnoreCase("Proxy Card No is not same as original transaction proxy Card No."))
			Assert.assertEquals(desc, "Proxy Card No is not same as original transaction proxy Card No.");
		APIConstants.txnRefNo = response.getBody().path("txnRefNo").toString();
		// APIConstants.balance = String.valueOf(response.getBody().path("balance"));
	}

	@Given("^user send post request for auth credit offer at perticular MID or TID for default GC$")
	public void user_send_post_request_for_auth_credit_offer_at_perticular_MID_or_TID_for_default_GC()
			throws Throwable {
		Map<Object, Object> map = new LinkedHashMap<Object, Object>();
		map.put("entityId", EntityId2);
		map.put("proxyCardNo", Card3);
		map.put("rrn", APIConstants.retrivalRefNo);
		map.put("transactionAmount", Rs_2);
		map.put("amount", Rs_2);
		map.put("merchantID", "null");
		map.put("merchantName", MaathavanHome);
		map.put("transactionType", FUNDPOST_CREDIT);
		map.put("terminalID", "null");
		map.put("mcc", MCC_3017);
		map.put("network", RUPAY);
		map.put("channel", FUND_POST);
		map.put("originalRrn", APIConstants.retrivalRefNo);
		map.put("txnRefNo", APIConstants.txnRefNo);
		response = api.post(APIConstants.AuthCredit_CashbackRefundURL,
				APIBody.getAuthCreditRequestBodyWithDuplicateTxnRefNo(map));
	}

	@Given("^user send post request for proxy card without loaded pocket for default GPR$")
	public void user_send_post_request_for_proxy_card_without_loaded_pocket_for_default_GPR() throws Throwable {
		Map<Object, Object> map = new LinkedHashMap<Object, Object>();
		map.put("merchantName", MaathavanHome);
		map.put("terminalID", "null");
		map.put("mcc", "null");
		map.put("entityId", EntityId5);
		map.put("proxyCardNo", Card9);
		map.put("network", RUPAY);
		map.put("channel", ECOM);
		map.put("merchantId", "null");
		map.put("amount", Rs_20);
		map.put("transactionAmount", Rs_20);
		map.put("billingAmount", Rs_20);
		map.put("retrievalRefNo", APIConstants.retrivalRefNo);
		response = api.post(APIConstants.AuthDebit_CashbackCreditURL, APIBody.getAuthDebitRequestBody(map));
	}

	@Given("^user send post request for proxy card with default pocket for default GPR$")
	public void user_send_post_request_for_proxy_card_with_default_pocket_for_default_GPR() throws Throwable {
		Map<Object, Object> map = new LinkedHashMap<Object, Object>();
		map.put("merchantName", MaathavanHome);
		map.put("terminalID", "null");
		map.put("mcc", "null");
		map.put("entityId", EntityId6);
		map.put("proxyCardNo", Card10);
		map.put("network", RUPAY);
		map.put("channel", ECOM);
		map.put("merchantId", "null");
		map.put("amount", Rs_20);
		map.put("transactionAmount", Rs_20);
		map.put("billingAmount", Rs_20);
		APIConstants.retrivalRefNo = RandomStringUtils.randomNumeric(10);
		map.put("retrievalRefNo", APIConstants.retrivalRefNo);
		response = api.post(APIConstants.AuthDebit_CashbackCreditURL, APIBody.getAuthDebitRequestBody(map));
	}

	@Given("^user send post request for proxy card with other pocket for default GPR$")
	public void user_send_post_request_for_proxy_card_with_other_pocket_for_default_GPR() throws Throwable {
		Map<Object, Object> map = new LinkedHashMap<Object, Object>();
		map.put("merchantName", MaathavanHome);
		map.put("terminalID", "null");
		map.put("mcc", MCC_3001);
		map.put("entityId", EntityId6);
		map.put("proxyCardNo", Card10);
		map.put("network", RUPAY);
		map.put("channel", ECOM);
		map.put("merchantId", "null");
		map.put("amount", Rs_20);
		map.put("transactionAmount", Rs_20);
		map.put("billingAmount", Rs_20);
		APIConstants.retrivalRefNo = RandomStringUtils.randomNumeric(10);
		APIConstants.retrivalRefNo1 = APIConstants.retrivalRefNo;
		map.put("retrievalRefNo", APIConstants.retrivalRefNo);
		response = api.post(APIConstants.AuthDebit_CashbackCreditURL, APIBody.getAuthDebitRequestBody(map));
	}

	@Given("^user send post request for proxy card with other pocket for default GPR same retrival$")
	public void user_send_post_request_for_proxy_card_with_other_pocket_for_default_GPR_same_retrival()
			throws Throwable {
		Map<Object, Object> map = new LinkedHashMap<Object, Object>();
		map.put("merchantName", MaathavanHome);
		map.put("terminalID", "null");
		map.put("mcc", MCC_3001);
		map.put("entityId", EntityId6);
		map.put("proxyCardNo", Card10);
		map.put("network", RUPAY);
		map.put("channel", ECOM);
		map.put("merchantId", "null");
		map.put("amount", Rs_20);
		map.put("transactionAmount", Rs_20);
		map.put("billingAmount", Rs_20);
//		APIConstants.retrivalRefNo = RandomStringUtils.randomNumeric(10);
		map.put("retrievalRefNo", APIConstants.retrivalRefNo);
		response = api.post(APIConstants.AuthDebit_CashbackCreditURL, APIBody.getAuthDebitRequestBody(map));
	}

//	@Given("^user send post request for markup check for default GPR$")
//	public void user_send_post_request_for_markup_check_for_default_GPR() throws Throwable {
//		Map<Object, Object> map = new LinkedHashMap<Object, Object>();
//		map.put("merchantName", MaathavanHome);
//		map.put("terminalID", "null");
//		map.put("mcc", MCC_3017);
//		map.put("entityId", EntityId6);
//		map.put("proxyCardNo", Card10);
//		map.put("network", RUPAY);
//		map.put("channel", FUND_POST);
//		map.put("merchantId", "null");
//		map.put("channel", FUND_POST);
//		map.put("amount", Rs_20);
//		map.put("transactionAmount", Rs_20);
//		map.put("billingAmount", Rs_20);
//		APIConstants.retrivalRefNo = RandomStringUtils.randomNumeric(10);
//		map.put("retrievalRefNo", APIConstants.retrivalRefNo);
//		response = api.post(APIConstants.AuthDebit_CashbackCreditURL, APIBody.getAuthDebitRequestBody(map));
//	}

	@Given("^user send post request for blocked MID and TID for default GPR$")
	public void user_send_post_request_for_blocked_MID_and_TID_for_default_GPR() throws Throwable {
		Map<Object, Object> map = new LinkedHashMap<Object, Object>();
		map.put("merchantName", MaathavanHome);
		map.put("terminalID", "011");
		map.put("mcc", MCC_3001);
		map.put("entityId", EntityId6);
		map.put("proxyCardNo", Card10);
		map.put("network", RUPAY);
		map.put("channel", ECOM);
		map.put("merchantId", "1223334");
		map.put("amount", Rs_2);
		map.put("transactionAmount", Rs_2);
		map.put("billingAmount", Rs_2);
		APIConstants.retrivalRefNo = RandomStringUtils.randomNumeric(10);
		map.put("retrievalRefNo", APIConstants.retrivalRefNo);
		response = api.post(APIConstants.AuthDebit_CashbackCreditURL, APIBody.getAuthDebitRequestBody(map));
	}

	@Given("^user send post request for cashback check for default GPR$")
	public void user_send_post_request_for_cashback_check_for_default_GPR() throws Throwable {
		Map<Object, Object> map = new LinkedHashMap<Object, Object>();
		map.put("merchantName", MaathavanHome);
		map.put("terminalID", "Terminal 1");
		map.put("mcc", MCC_3017);
		map.put("entityId", EntityId6);
		map.put("proxyCardNo", Card10);
		map.put("network", RUPAY);
		map.put("channel", ECOM);
		map.put("merchantId", "12322155");
		map.put("amount", Rs_20);
		map.put("transactionAmount", Rs_20);
		map.put("billingAmount", Rs_20);
		APIConstants.retrivalRefNo = RandomStringUtils.randomNumeric(10);
		map.put("retrievalRefNo", APIConstants.retrivalRefNo);
		response = api.post(APIConstants.AuthDebit_CashbackCreditURL, APIBody.getAuthDebitRequestBody(map));
	}

	@Given("^user send post request for cashback check for default GC after update limit$")
	public void user_send_post_request_for_cashback_check_for_default_GC_after_update_limit() throws Throwable {
		Map<Object, Object> map = new LinkedHashMap<Object, Object>();
		map.put("merchantName", MaathavanHome);
		map.put("terminalID", "0123");
		map.put("mcc", MCC_3001);
		map.put("entityId", EntityId19);
		map.put("proxyCardNo", Card31);
		map.put("network", RUPAY);
		map.put("channel", ECOM);
		map.put("merchantId", "11223344");
		map.put("amount", Rs_20);
		map.put("transactionAmount", Rs_20);
		map.put("billingAmount", Rs_20);
		APIConstants.retrivalRefNo = RandomStringUtils.randomNumeric(10);
		map.put("retrievalRefNo", APIConstants.retrivalRefNo);
		response = api.post(APIConstants.AuthDebit_CashbackCreditURL, APIBody.getAuthDebitRequestBody(map));
	}

	@Given("^user send post request for cashback check offer at perticular merchant and terminal for default GPR$")
	public void user_send_post_request_for_cashback_check_offer_at_perticular_merchant_and_terminal_for_default_GPR()
			throws Throwable {
		Map<Object, Object> map = new LinkedHashMap<Object, Object>();
		map.put("merchantName", MaathavanHome);
		map.put("terminalID", "Terminal 1");
		map.put("mcc", MCC_3001);
		map.put("entityId", EntityId6);
		map.put("proxyCardNo", Card10);
		map.put("network", RUPAY);
		map.put("channel", ECOM);
		map.put("merchantId", "12322155");
		map.put("amount", Rs_20);
		map.put("transactionAmount", Rs_20);
		map.put("billingAmount", Rs_20);
		APIConstants.retrivalRefNo = RandomStringUtils.randomNumeric(10);
		map.put("retrievalRefNo", APIConstants.retrivalRefNo);
		response = api.post(APIConstants.AuthDebit_CashbackCreditURL, APIBody.getAuthDebitRequestBody(map));
	}

	@Given("^user send post request for channel check for default GPR$")
	public void user_send_post_request_for_channel_check_for_default_GPR() throws Throwable {
		Map<Object, Object> map = new LinkedHashMap<Object, Object>();
		map.put("merchantName", MaathavanHome);
		map.put("terminalID", "null");
		map.put("mcc", MCC_3001);
		map.put("entityId", EntityId6);
		map.put("proxyCardNo", Card10);
		map.put("network", RUPAY);
		map.put("channel", CONTACTLESS);
		map.put("merchantId", "12322155");
		map.put("amount", Rs_2);
		map.put("transactionAmount", Rs_2);
		map.put("billingAmount", Rs_2);
		APIConstants.retrivalRefNo = RandomStringUtils.randomNumeric(10);
		map.put("retrievalRefNo", APIConstants.retrivalRefNo);
		response = api.post(APIConstants.AuthDebit_CashbackCreditURL, APIBody.getAuthDebitRequestBody(map));
	}

	@Given("^user send post request for channel check more than monthly limit for default GPR$")
	public void user_send_post_request_for_channel_check_more_than_monthly_limit_for_default_GPR() throws Throwable {
		Map<Object, Object> map = new LinkedHashMap<Object, Object>();
		map.put("merchantName", MaathavanHome);
		map.put("terminalID", "null");
		map.put("mcc", "null");
		map.put("entityId", EntityId6);
		map.put("proxyCardNo", Card10);
		map.put("network", RUPAY);
		map.put("channel", ECOM);
		map.put("merchantId", "null");
		map.put("amount", Rs_201);
		map.put("transactionAmount", Rs_201);
		map.put("billingAmount", Rs_201);
		APIConstants.retrivalRefNo = RandomStringUtils.randomNumeric(10);
		map.put("retrievalRefNo", APIConstants.retrivalRefNo);
		response = api.post(APIConstants.AuthDebit_CashbackCreditURL, APIBody.getAuthDebitRequestBody(map));
	}

	@Given("^user send post request for auth velocity check for default GPR$")
	public void user_send_post_request_for_auth_velocity_check_for_default_GPR() throws Throwable {
		Map<Object, Object> map = new LinkedHashMap<Object, Object>();
		map.put("merchantName", MaathavanHome);
		map.put("terminalID", "null");
		map.put("mcc", "null");
		map.put("entityId", EntityId6);
		map.put("proxyCardNo", Card10);
		map.put("network", RUPAY);
		map.put("channel", ECOM);
		map.put("merchantId", "null");
		map.put("amount", Rs_20);
		map.put("transactionAmount", Rs_20);
		map.put("billingAmount", Rs_20);
		APIConstants.retrivalRefNo = RandomStringUtils.randomNumeric(10);
		map.put("retrievalRefNo", APIConstants.retrivalRefNo);
		response = api.post(APIConstants.AuthDebit_CashbackCreditURL, APIBody.getAuthDebitRequestBody(map));
	}

	@Given("^user send post request for auth velocity check for default GPR daily limit$")
	public void user_send_post_request_for_auth_velocity_check_for_default_GPR_daily_limit() throws Throwable {
		Map<Object, Object> map = new LinkedHashMap<Object, Object>();
		map.put("merchantName", MaathavanHome);
		map.put("terminalID", "null");
		map.put("mcc", "null");
		map.put("entityId", EntityId6);
		map.put("proxyCardNo", Card10);
		map.put("network", RUPAY);
		map.put("channel", ECOM);
		map.put("merchantId", "null");
		map.put("amount", Rs_201);
		map.put("transactionAmount", Rs_201);
		map.put("billingAmount", Rs_201);
		APIConstants.retrivalRefNo = RandomStringUtils.randomNumeric(10);
		map.put("retrievalRefNo", APIConstants.retrivalRefNo);
		response = api.post(APIConstants.AuthDebit_CashbackCreditURL, APIBody.getAuthDebitRequestBody(map));
	}

	@Given("^user send post request for auth velocity check for default GPR for daily limit exeeds$")
	public void user_send_post_request_for_auth_velocity_check_for_default_GPR_for_daily_limit_exeeds()
			throws Throwable {
		Map<Object, Object> map = new LinkedHashMap<Object, Object>();
		map.put("merchantName", MaathavanHome);
		map.put("terminalID", "null");
		map.put("mcc", "null");
		map.put("entityId", EntityId6);
		map.put("proxyCardNo", Card10);
		map.put("network", RUPAY);
		map.put("channel", ECOM);
		map.put("merchantId", "null");
		map.put("amount", Rs_20);
		map.put("transactionAmount", Rs_201);
		map.put("billingAmount", Rs_201);
		APIConstants.retrivalRefNo = RandomStringUtils.randomNumeric(10);
		map.put("retrievalRefNo", APIConstants.retrivalRefNo);
		response = api.post(APIConstants.AuthDebit_CashbackCreditURL, APIBody.getAuthDebitRequestBody(map));
	}

	@Given("^user send post request for auth velocity check for default GPR for daily limit exceeded$")
	public void user_send_post_request_for_auth_velocity_check_for_default_GPR_for_daily_limit_exceeded()
			throws Throwable {
		Map<Object, Object> map = new LinkedHashMap<Object, Object>();
		map.put("merchantName", MaathavanHome);
		map.put("terminalID", "null");
		map.put("mcc", MCC_3001);
		map.put("entityId", EntityId6);
		map.put("proxyCardNo", Card10);
		map.put("network", RUPAY);
		map.put("channel", ECOM);
		map.put("merchantId", "null");
		map.put("amount", Rs_201);
		map.put("transactionAmount", Rs_201);
		map.put("billingAmount", Rs_201);
		APIConstants.retrivalRefNo = RandomStringUtils.randomNumeric(10);
		map.put("retrievalRefNo", APIConstants.retrivalRefNo);
		response = api.post(APIConstants.AuthDebit_CashbackCreditURL, APIBody.getAuthDebitRequestBody(map));
	}

	@Given("^user send post request for auth check for puased crad for default GPR$")
	public void user_send_post_request_for_auth_check_for_puased_crad_for_default_GPR() throws Throwable {
		Map<Object, Object> map = new LinkedHashMap<Object, Object>();
		map.put("merchantName", MaathavanHome);
		map.put("terminalID", "null");
		map.put("mcc", "null");
		map.put("entityId", EntityId7);
		map.put("proxyCardNo", Card11);
		map.put("network", RUPAY);
		map.put("channel", ECOM);
		map.put("merchantId", "null");
		map.put("amount", Rs_20);
		map.put("transactionAmount", Rs_20);
		map.put("billingAmount", Rs_20);
		APIConstants.retrivalRefNo = RandomStringUtils.randomNumeric(10);
		map.put("retrievalRefNo", APIConstants.retrivalRefNo);
		response = api.post(APIConstants.AuthDebit_CashbackCreditURL, APIBody.getAuthDebitRequestBody(map));
	}

	@Given("^user send post request for Auth check for Blocked Card for default GPR$")
	public void user_send_post_request_for_Auth_check_for_Blocked_Card_for_default_GPR() throws Throwable {
		Map<Object, Object> map = new LinkedHashMap<Object, Object>();
		map.put("merchantName", MaathavanHome);
		map.put("terminalID", "null");
		map.put("mcc", "null");
		map.put("entityId", EntityId8);
		map.put("proxyCardNo", Card12);
		map.put("network", RUPAY);
		map.put("channel", ECOM);
		map.put("merchantId", "null");
		map.put("amount", Rs_20);
		map.put("transactionAmount", Rs_20);
		map.put("billingAmount", Rs_20);
		APIConstants.retrivalRefNo = RandomStringUtils.randomNumeric(10);
		map.put("retrievalRefNo", APIConstants.retrivalRefNo);
		response = api.post(APIConstants.AuthDebit_CashbackCreditURL, APIBody.getAuthDebitRequestBody(map));
	}

	@Given("^user send post request for Auth Check for Entity for default GPR$")
	public void user_send_post_request_for_Auth_Check_for_Entity_for_default_GPR() throws Throwable {
		Map<Object, Object> map = new LinkedHashMap<Object, Object>();
		map.put("merchantName", MaathavanHome);
		map.put("terminalID", "null");
		map.put("mcc", "null");
		map.put("entityId", EntityId9);
		map.put("proxyCardNo", Card10);
		map.put("network", RUPAY);
		map.put("channel", ECOM);
		map.put("merchantId", "null");
		map.put("amount", Rs_20);
		map.put("transactionAmount", Rs_20);
		map.put("billingAmount", Rs_20);
		APIConstants.retrivalRefNo = RandomStringUtils.randomNumeric(10);
		map.put("retrievalRefNo", APIConstants.retrivalRefNo);
		response = api.post(APIConstants.AuthDebit_CashbackCreditURL, APIBody.getAuthDebitRequestBody(map));
	}

	@Given("^user send post request for Auth Check for Duplicate txnRefNo for default GPR$")
	public void user_send_post_request_for_Auth_Check_for_Duplicate_txnRefNo_for_default_GPR() throws Throwable {
		Map<Object, Object> map = new LinkedHashMap<Object, Object>();
		map.put("merchantName", MaathavanHome);
		map.put("terminalID", "null");
		map.put("mcc", MCC_3001);
		map.put("entityId", EntityId6);
		map.put("proxyCardNo", Card10);
		map.put("network", RUPAY);
		map.put("channel", ECOM);
		map.put("merchantId", "null");
		map.put("amount", Rs_20);
		map.put("transactionAmount", Rs_20);
		map.put("billingAmount", Rs_20);
//		map.put("txnRefNo", APIConstants.txnRefNo);
		APIConstants.retrivalRefNo = RandomStringUtils.randomNumeric(10);
		map.put("retrievalRefNo", APIConstants.retrivalRefNo);
		response = api.post(APIConstants.AuthDebit_CashbackCreditURL, APIBody.getAuthDebitRequestBody(map));
	}

	@Given("^user send post request for Auth Check for Duplicate txnRefNo for default GPR with same details$")
	public void user_send_post_request_for_Auth_Check_for_Duplicate_txnRefNo_for_default_GPR_with_same_details()
			throws Throwable {
		Map<Object, Object> map = new LinkedHashMap<Object, Object>();
		map.put("merchantName", MaathavanHome);
		map.put("terminalID", "null");
		map.put("mcc", MCC_3001);
		map.put("entityId", EntityId6);
		map.put("proxyCardNo", Card10);
		map.put("network", RUPAY);
		map.put("channel", ECOM);
		map.put("merchantId", "null");
		map.put("amount", Rs_10);
		map.put("transactionAmount", Rs_10);
		map.put("billingAmount", Rs_10);
		map.put("txnRefNo", APIConstants.txnRefNo);
//		APIConstants.retrivalRefNo = RandomStringUtils.randomNumeric(10);
		map.put("retrievalRefNo", APIConstants.retrivalRefNo);
		response = api.post(APIConstants.AuthDebit_CashbackCreditURL,
				APIBody.getAuthDebitRequestBodyWithDuplicateTxnRefNo(map));
	}

	@Given("^user send post request for Auth Check for Duplicate txnRefNo$")
	public void user_send_post_request_for_Auth_Check_for_Duplicate_txnRefNo() throws Throwable {
		Map<Object, Object> map = new LinkedHashMap<Object, Object>();
		map.put("merchantName", MaathavanHome);
		map.put("terminalID", "null");
		map.put("mcc", "null");
		map.put("entityId", EntityId5);
		map.put("proxyCardNo", Card9);
		map.put("network", RUPAY);
		map.put("channel", ECOM);
		map.put("merchantId", "null");
		map.put("amount", Rs_20);
		map.put("transactionAmount", Rs_20);
		map.put("billingAmount", Rs_20);
//		map.put("txnRefNo", APIConstants.txnRefNo);
		APIConstants.retrivalRefNo = RandomStringUtils.randomNumeric(10);
		map.put("retrievalRefNo", APIConstants.retrivalRefNo);
		response = api.post(APIConstants.AuthDebit_CashbackCreditURL, APIBody.getAuthDebitRequestBody(map));
	}

	@Given("^user send post request for Auth Check for Duplicate txnRefNo transaction 2$")
	public void user_send_post_request_for_Auth_Check_for_Duplicate_txnRefNo_transaction_2() throws Throwable {
		Map<Object, Object> map = new LinkedHashMap<Object, Object>();
		map.put("merchantName", MaathavanHome);
		map.put("terminalID", "null");
		map.put("mcc", "null");
		map.put("entityId", EntityId6);
		map.put("proxyCardNo", Card10);
		map.put("network", RUPAY);
		map.put("channel", ECOM);
		map.put("merchantId", "null");
		map.put("amount", Rs_20);
		map.put("transactionAmount", Rs_20);
		map.put("billingAmount", Rs_20);
		map.put("txnRefNo", APIConstants.txnRefNo);
//		APIConstants.retrivalRefNo = RandomStringUtils.randomNumeric(10);
		map.put("retrievalRefNo", APIConstants.retrivalRefNo);
		response = api.post(APIConstants.AuthDebit_CashbackCreditURL,
				APIBody.getAuthDebitRequestBodyWithDuplicateTxnRefNo(map));
	}

	@Given("^user send post request for Auth Check for Duplicate txnRefNo transaction 2 with same details$")
	public void user_send_post_request_for_Auth_Check_for_Duplicate_txnRefNo_transaction_2_with_same_details()
			throws Throwable {
		Map<Object, Object> map = new LinkedHashMap<Object, Object>();
		map.put("merchantName", MaathavanHome);
		map.put("terminalID", "null");
		map.put("mcc", MCC_3017);
		map.put("entityId", EntityId6);
		map.put("proxyCardNo", Card10);
		map.put("network", RUPAY);
		map.put("channel", CONTACTLESS);
		map.put("merchantId", "null");
		map.put("amount", Rs_20);
		map.put("transactionAmount", Rs_20);
		map.put("billingAmount", Rs_20);
		map.put("txnRefNo", APIConstants.txnRefNo);
//		APIConstants.retrivalRefNo = RandomStringUtils.randomNumeric(10);
		map.put("retrievalRefNo", APIConstants.retrivalRefNo);
		response = api.post(APIConstants.AuthDebit_CashbackCreditURL,
				APIBody.getAuthDebitRequestBodyWithDuplicateTxnRefNo(map));
	}

	@Given("^user send post request for Auth Balance Check for default GPR$")
	public void user_send_post_request_for_Auth_Balance_Check_for_default_GPR() throws Throwable {
		Map<Object, Object> map = new LinkedHashMap<Object, Object>();
		map.put("merchantName", MaathavanHome);
		map.put("terminalID", "null");
		map.put("mcc", "null");
		map.put("entityId", EntityId10);
		map.put("proxyCardNo", Card16);
		map.put("network", RUPAY);
		map.put("channel", ECOM);
		map.put("merchantId", "null");
		map.put("amount", Rs_20);
		map.put("transactionAmount", Rs_20);
		map.put("billingAmount", Rs_20);
//		map.put("txnRefNo", APIConstants.txnRefNo);
		APIConstants.retrivalRefNo = RandomStringUtils.randomNumeric(10);
		map.put("retrievalRefNo", APIConstants.retrivalRefNo);
		response = api.post(APIConstants.AuthDebit_CashbackCreditURL, APIBody.getAuthDebitRequestBody(map));
	}

	@Given("^user send post request for Auth Balance Check for default GPR success$")
	public void user_send_post_request_for_Auth_Balance_Check_for_default_GPR_success() throws Throwable {
		Map<Object, Object> map = new LinkedHashMap<Object, Object>();
		map.put("merchantName", MaathavanHome);
		map.put("terminalID", "null");
		map.put("mcc", MCC_3001);
		map.put("entityId", EntityId10);
		map.put("proxyCardNo", Card16);
		map.put("network", RUPAY);
		map.put("channel", ECOM);
		map.put("merchantId", "null");
		map.put("amount", Rs_20);
		map.put("transactionAmount", Rs_20);
		map.put("billingAmount", Rs_20);
		map.put("txnRefNo", APIConstants.txnRefNo);
//		APIConstants.retrivalRefNo = RandomStringUtils.randomNumeric(10);
		map.put("retrievalRefNo", APIConstants.retrivalRefNo);
		response = api.post(APIConstants.AuthDebit_CashbackCreditURL,
				APIBody.getAuthDebitRequestBodyWithDuplicateTxnRefNo(map));
	}

	@Given("^user send post request for Auth Balance Check for default GPR success for 6.15$")
	public void user_send_post_request_for_Auth_Balance_Check_for_default_GPR_success_for_6_15() throws Throwable {
		Map<Object, Object> map = new LinkedHashMap<Object, Object>();
		map.put("merchantName", MaathavanHome);
		map.put("terminalID", "null");
		map.put("mcc", MCC_3001);
		map.put("entityId", EntityId10);
		map.put("proxyCardNo", Card16);
		map.put("network", RUPAY);
		map.put("channel", ECOM);
		map.put("merchantId", "null");
		map.put("amount", Rs_2);
		map.put("transactionAmount", Rs_2);
		map.put("billingAmount", Rs_2);
		APIConstants.retrivalRefNo = RandomStringUtils.randomNumeric(10);
		map.put("retrievalRefNo", APIConstants.retrivalRefNo);
		response = api.post(APIConstants.AuthDebit_CashbackCreditURL, APIBody.getAuthDebitRequestBody(map));
	}

	@Given("^user send post request for auth reversal invalid transaction for default GPR$")
	public void user_send_post_request_for_auth_reversal_invalid_transaction_for_default_GPR() throws Throwable {
		Map<Object, Object> map = new LinkedHashMap<Object, Object>();
		map.put("channel", ECOM);
		map.put("transactionAmount", Rs_201);
		map.put("productCode", "null");
		map.put("amount", Rs_201);
		map.put("merchantName", SARAVANAN_TESTING_CITY_NAME_IN);
		map.put("proxyCardNo", Card10);
		map.put("mcc", "null");
		map.put("network", RUPAY);
		map.put("merchantID", "null");
		map.put("terminalID", "null");
		map.put("institutionCode", "458519");
		map.put("retrievalRefNo", APIConstants.retrivalRefNo);
		map.put("txnRefNo", RandomStringUtils.randomNumeric(10));
		response = api.post(APIConstants.AuthReversal_CashbackDebitURL,
				APIBody.getAuthReversalRequestBodyWithDuplicateTxnRefNo(map));
	}

	@Given("^user send post request for auth reversal invalid transaction for default GPR with previous case 18 details$")
	public void user_send_post_request_for_auth_reversal_invalid_transaction_for_default_GPR_with_previous_case_18_details()
			throws Throwable {
		Map<Object, Object> map = new LinkedHashMap<Object, Object>();
		map.put("channel", ECOM);
		map.put("transactionAmount", Rs_20);
		map.put("productCode", "null");
		map.put("amount", Rs_20);
		map.put("merchantName", SARAVANAN_TESTING_CITY_NAME_IN);
		map.put("proxyCardNo", "18000253");
		map.put("mcc", "null");
		map.put("network", RUPAY);
		map.put("merchantID", "null");
		map.put("terminalID", "null");
		map.put("institutionCode", "458519");
//		APIConstants.retrivalRefNo = RandomStringUtils.randomNumeric(10);
		map.put("txnRefNo", APIConstants.txnRefNo);
		map.put("retrievalRefNo", APIConstants.retrivalRefNo);
		response = api.post(APIConstants.AuthReversal_CashbackDebitURL,
				APIBody.getAuthReversalRequestBodyWithDuplicateTxnRefNo(map));
	}

	@Given("^user send post request for auth reversal successfull for default GPR$")
	public void user_send_post_request_for_auth_reversal_successfull_for_default_GPR() throws Throwable {
		Map<Object, Object> map = new LinkedHashMap<Object, Object>();
		map.put("channel", ECOM);
		map.put("transactionAmount", Rs_20);
		map.put("productCode", "null");
		map.put("amount", Rs_20);
		map.put("merchantName", SARAVANAN_TESTING_CITY_NAME_IN);
		map.put("proxyCardNo", Card10);
		map.put("mcc", MCC_3001);
		map.put("network", RUPAY);
		map.put("merchantID", "null");
		map.put("terminalID", "null");
		map.put("institutionCode", "458519");
//		APIConstants.retrivalRefNo = RandomStringUtils.randomNumeric(10);
		map.put("txnRefNo", APIConstants.txnRefNo);
		map.put("retrievalRefNo", APIConstants.retrivalRefNo);
		response = api.post(APIConstants.AuthReversal_CashbackDebitURL,
				APIBody.getAuthReversalRequestBodyWithDuplicateTxnRefNo(map));
	}

	@Given("^user send post request for auth reversal successfull for default GPR with previous case 5 details$")
	public void user_send_post_request_for_auth_reversal_successfull_for_default_GPR_with_previous_case_5_details()
			throws Throwable {
		Map<Object, Object> map = new LinkedHashMap<Object, Object>();
		map.put("channel", ECOM);
		map.put("transactionAmount", Rs_20);
		map.put("productCode", "null");
		map.put("amount", Rs_20);
		map.put("merchantName", SARAVANAN_TESTING_CITY_NAME_IN);
		map.put("proxyCardNo", Card7);
		map.put("mcc", MCC_3017);
		map.put("network", RUPAY);
		map.put("merchantID", "null");
		map.put("terminalID", "null");
		map.put("institutionCode", "458519");
//		APIConstants.retrivalRefNo = RandomStringUtils.randomNumeric(10);
		map.put("txnRefNo", APIConstants.txnRefNo);
		map.put("retrievalRefNo", APIConstants.retrivalRefNo);
		response = api.post(APIConstants.AuthReversal_CashbackDebitURL,
				APIBody.getAuthReversalRequestBodyWithDuplicateTxnRefNo(map));
	}

	@Given("^user send post request for auth reversal successfull for default GPR with previous case 8 details$")
	public void user_send_post_request_for_auth_reversal_successfull_for_default_GPR_with_previous_case_8_details()
			throws Throwable {
		Map<Object, Object> map = new LinkedHashMap<Object, Object>();
		map.put("channel", ECOM);
		map.put("transactionAmount", Rs_20);
		map.put("productCode", "null");
		map.put("amount", Rs_20);
		map.put("merchantName", SARAVANAN_TESTING_CITY_NAME_IN);
		map.put("proxyCardNo", Card10);
		map.put("mcc", MCC_3001);
		map.put("network", RUPAY);
		map.put("merchantId", "12322155");
		map.put("terminalID", "Terminal 1");
		map.put("institutionCode", "458519");
//		APIConstants.retrivalRefNo = RandomStringUtils.randomNumeric(10);
		map.put("txnRefNo", APIConstants.txnRefNo);
		map.put("retrievalRefNo", APIConstants.retrivalRefNo);
		response = api.post(APIConstants.AuthReversal_CashbackDebitURL,
				APIBody.getAuthReversalRequestBodyWithDuplicateTxnRefNo(map));
	}

	@Given("^user send post request for auth reversal successfull for default GPR with previous case 7 details$")
	public void user_send_post_request_for_auth_reversal_successfull_for_default_GPR_with_previous_case_7_details()
			throws Throwable {
		Map<Object, Object> map = new LinkedHashMap<Object, Object>();
		map.put("channel", ECOM);
		map.put("transactionAmount", Rs_20);
		map.put("productCode", "null");
		map.put("amount", Rs_20);
		map.put("merchantName", SARAVANAN_TESTING_CITY_NAME_IN);
		map.put("proxyCardNo", Card10);
		map.put("mcc", MCC_3017);
		map.put("network", RUPAY);
		map.put("merchantId", "12322155");
		map.put("terminalID", "Terminal 1");
		map.put("institutionCode", "458519");
//		APIConstants.retrivalRefNo = RandomStringUtils.randomNumeric(10);
		map.put("txnRefNo", APIConstants.txnRefNo);
		map.put("retrievalRefNo", APIConstants.retrivalRefNo);
		response = api.post(APIConstants.AuthReversal_CashbackDebitURL,
				APIBody.getAuthReversalRequestBodyWithDuplicateTxnRefNo(map));
	}

	@Given("^user send post request for auth credit for GC$")
	public void user_send_post_request_for_auth_credit_for_GC() throws Throwable {
		Map<Object, Object> map = new LinkedHashMap<Object, Object>();
		map.put("entityId", EntityId6);
		map.put("proxyCardNo", Card10);
		map.put("rrn", APIConstants.retrivalRefNo);
		map.put("transactionAmount", Rs_20);
		map.put("amount", Rs_20);
		map.put("merchantID", "null");
		map.put("merchantName", MaathavanHome);
		map.put("transactionType", FUNDPOST_CREDIT);
		map.put("terminalID", "null");
		map.put("mcc", "null");
		map.put("network", RUPAY);
		map.put("channel", FUND_POST);
		map.put("originalRrn", APIConstants.retrivalRefNo);
//		map.put("txnRefNo", APIConstants.txnRefNo);
		response = api.post(APIConstants.AuthCredit_CashbackRefundURL, APIBody.getAuthCreditRequestBody(map));
	}

	@Given("^user send post request for auth credit for default GPR$")
	public void user_send_post_request_for_auth_credit_for_default_GPR() throws Throwable {
		Map<Object, Object> map = new LinkedHashMap<Object, Object>();
		map.put("entityId", EntityId6);
		map.put("proxyCardNo", Card10);
		map.put("rrn", APIConstants.retrivalRefNo);
		map.put("transactionAmount", Rs_2);
		map.put("amount", Rs_2);
		map.put("merchantID", "null");
		map.put("merchantName", MaathavanHome);
		map.put("transactionType", FUNDPOST_CREDIT);
		map.put("terminalID", "null");
		map.put("mcc", "null");
		map.put("network", RUPAY);
		map.put("channel", FUND_POST);
		map.put("originalRrn", APIConstants.retrivalRefNo);
		map.put("txnRefNo", APIConstants.txnRefNo);
		response = api.post(APIConstants.AuthCredit_CashbackRefundURL,
				APIBody.getAuthCreditRequestBodyWithDuplicateTxnRefNo(map));
	}

	@Given("^user send post request for for auth credit transaction amount mis match for default GPR$")
	public void user_send_post_request_for_for_auth_credit_transaction_amount_mis_match_for_default_GPR()
			throws Throwable {
		Map<Object, Object> map = new LinkedHashMap<Object, Object>();
		map.put("entityId", EntityId6);
		map.put("proxyCardNo", Card10);
		map.put("rrn", APIConstants.retrivalRefNo);
		map.put("transactionAmount", Rs_201);
		map.put("amount", Rs_201);
		map.put("merchantID", "null");
		map.put("merchantName", MaathavanHome);
		map.put("transactionType", FUNDPOST_CREDIT);
		map.put("terminalID", "null");
		map.put("mcc", "null");
		map.put("network", RUPAY);
		map.put("channel", FUND_POST);
		map.put("originalRrn", APIConstants.retrivalRefNo);
		map.put("txnRefNo", APIConstants.txnRefNo);
		response = api.post(APIConstants.AuthCredit_CashbackRefundURL,
				APIBody.getAuthCreditRequestBodyWithDuplicateTxnRefNo(map));
	}

	@Given("^user send post request for for auth credit transaction card not found for default GPR$")
	public void user_send_post_request_for_for_auth_credit_transaction_card_not_found_for_default_GPR()
			throws Throwable {
		Map<Object, Object> map = new LinkedHashMap<Object, Object>();
		map.put("entityId", EntityId6);
		map.put("proxyCardNo", "12345678");
		map.put("rrn", APIConstants.retrivalRefNo);
		map.put("transactionAmount", Rs_20);
		map.put("amount", Rs_20);
		map.put("merchantID", "null");
		map.put("merchantName", MaathavanHome);
		map.put("transactionType", FUNDPOST_CREDIT);
		map.put("terminalID", "null");
		map.put("mcc", "null");
		map.put("network", RUPAY);
		map.put("channel", FUND_POST);
		map.put("originalRrn", APIConstants.retrivalRefNo);
		map.put("txnRefNo", APIConstants.txnRefNo);
		response = api.post(APIConstants.AuthCredit_CashbackRefundURL,
				APIBody.getAuthCreditRequestBodyWithDuplicateTxnRefNo(map));
	}

	@Given("^user send post request for for auth credit transaction entity not found for default GPR$")
	public void user_send_post_request_for_for_auth_credit_transaction_entity_not_found_for_default_GPR()
			throws Throwable {
		Map<Object, Object> map = new LinkedHashMap<Object, Object>();
		map.put("entityId", "91e9fa0a-8fdc-4c5d-9203-e7598a5a");
		map.put("proxyCardNo", Card10);
		map.put("rrn", APIConstants.retrivalRefNo);
		map.put("transactionAmount", Rs_201);
		map.put("amount", Rs_201);
		map.put("merchantID", "null");
		map.put("merchantName", MaathavanHome);
		map.put("transactionType", FUNDPOST_CREDIT);
		map.put("terminalID", "null");
		map.put("mcc", "null");
		map.put("network", RUPAY);
		map.put("channel", FUND_POST);
		map.put("originalRrn", APIConstants.retrivalRefNo);
		map.put("txnRefNo", APIConstants.txnRefNo);
		response = api.post(APIConstants.AuthCredit_CashbackRefundURL,
				APIBody.getAuthCreditRequestBodyWithDuplicateTxnRefNo(map));
	}

	@Given("^fundpost credit declines one$")
	public void fundpost_credit_declines_one() throws Throwable {
		Map<Object, Object> map = new LinkedHashMap<Object, Object>();
		map.put("entityId", EntityId6);
		map.put("proxyCardNo", Card10);
		map.put("rrn", APIConstants.retrivalRefNo);
		map.put("transactionAmount", Rs_2);
		map.put("amount", Rs_2);
		map.put("merchantID", "null");
		map.put("merchantName", MaathavanHome);
		map.put("transactionType", FUNDPOST_CREDIT);
		map.put("terminalID", "null");
		map.put("mcc", MCC_3001);
		map.put("network", RUPAY);
		map.put("channel", FUND_POST);
		map.put("originalRrn", APIConstants.retrivalRefNo);
		map.put("txnRefNo", APIConstants.txnRefNo);
		response = api.post(APIConstants.AuthCredit_CashbackRefundURL,
				APIBody.getAuthCreditRequestBodyWithDuplicateTxnRefNo(map));
	}

	@Given("^fundpost Credit for Card loaded with other pocket without entering MCC fundpost Credit$")
	public void fundpost_Credit_for_Card_loaded_with_other_pocket_without_entering_MCC_fundpost_Credit()
			throws Throwable {
		Map<Object, Object> map = new LinkedHashMap<Object, Object>();
		map.put("merchantName", MaathavanHome);
		map.put("rrn", APIConstants.retrivalRefNo);
		map.put("terminalID", "null");
		map.put("mcc", "null");
		map.put("entityId", EntityId6);
		map.put("proxyCardNo", Card10);
		map.put("network", RUPAY);
		map.put("channel", FUND_POST);
		map.put("transactionType", FUNDPOST_CREDIT);
		map.put("merchantId", "null");
		map.put("amount", Rs_20);
		map.put("transactionAmount", Rs_20);
		map.put("originalRrn", APIConstants.retrivalRefNo);
		map.put("txnRefNo", APIConstants.txnRefNo);
//		APIConstants.retrivalRefNo = RandomStringUtils.randomNumeric(10);
		map.put("rrn", APIConstants.retrivalRefNo);
		response = api.post(APIConstants.AuthCredit_CashbackRefundURL,
				APIBody.getAuthCreditRequestBodyWithDuplicateTxnRefNo(map));
	}

	@Given("^partial Complete TxnAmount credited respective ProxyCard MarkUp$")
	public void partial_Complete_TxnAmount_credited_respective_ProxyCard_MarkUp() throws Throwable {
		Map<Object, Object> map = new LinkedHashMap<Object, Object>();
		map.put("merchantName", MaathavanHome);
		map.put("terminalID", "null");
		map.put("rrn", APIConstants.retrivalRefNo);
		map.put("mcc", MCC_3017);
		map.put("entityId", EntityId6);
		map.put("proxyCardNo", Card10);
		map.put("network", RUPAY);
		map.put("channel", FUND_POST);
		map.put("transactionType", FUNDPOST_CREDIT);
		map.put("merchantId", "null");
		map.put("amount", Rs_20);
		map.put("transactionAmount", Rs_20);
		map.put("originalRrn", APIConstants.retrivalRefNo);
		map.put("txnRefNo", APIConstants.txnRefNo);
		response = api.post(APIConstants.AuthCredit_CashbackRefundURL,
				APIBody.getAuthCreditRequestBodyWithDuplicateTxnRefNo(map));

	}

	@Given("^partial Complete TxnAmount credited respective ProxyCard Cashback$")
	public void partial_Complete_TxnAmount_credited_respective_ProxyCard_Cashback() throws Throwable {
		Map<Object, Object> map = new LinkedHashMap<Object, Object>();
		map.put("merchantName", MaathavanHome);
		map.put("terminalID", "null");
		map.put("mcc", MCC_3001);
		map.put("entityId", EntityId6);
		map.put("proxyCardNo", Card10);
		map.put("network", RUPAY);
		map.put("channel", FUND_POST);
		map.put("transactionType", FUNDPOST_CREDIT);
		map.put("merchantId", "null");
		map.put("amount", Rs_20);
		map.put("transactionAmount", Rs_20);
		map.put("originalRrn", APIConstants.retrivalRefNo);
		map.put("txnRefNo", APIConstants.txnRefNo);
		map.put("rrn", APIConstants.retrivalRefNo);
		response = api.post(APIConstants.AuthCredit_CashbackRefundURL,
				APIBody.getAuthCreditRequestBodyWithDuplicateTxnRefNo(map));

	}

	@Given("^partial Complete TxnAmount credited respective ProxyCard MarkUp and cashback$")
	public void partial_Complete_TxnAmount_credited_respective_ProxyCard_MarkUp_and_cashback() throws Throwable {
		Map<Object, Object> map = new LinkedHashMap<Object, Object>();
		map.put("merchantName", MaathavanHome);
		map.put("terminalID", "null");
		map.put("mcc", "null");
		map.put("entityId", EntityId6);
		map.put("proxyCardNo", Card10);
		map.put("network", RUPAY);
		map.put("channel", FUND_POST);
		map.put("transactionType", FUNDPOST_CREDIT);
		map.put("merchantId", "null");
		map.put("amount", Rs_20);
		map.put("transactionAmount", Rs_20);
		map.put("originalRrn", APIConstants.retrivalRefNo);
		map.put("txnRefNo", APIConstants.txnRefNo);
		map.put("rrn", APIConstants.retrivalRefNo);
		response = api.post(APIConstants.AuthCredit_CashbackRefundURL,
				APIBody.getAuthCreditRequestBodyWithDuplicateTxnRefNo(map));

	}

	@Given("^markup configured MCC 3017 one$")
	public void markup_configured_MCC_3017_one() throws Throwable {
		Map<Object, Object> map = new LinkedHashMap<Object, Object>();
		map.put("merchantName", MaathavanHome);
		map.put("terminalID", "null");
		map.put("mcc", MCC_3017);
		map.put("entityId", EntityId6);
		map.put("proxyCardNo", Card10);
		map.put("network", RUPAY);
		map.put("channel", POS);
		map.put("merchantId", "null");
		map.put("amount", Rs_2);
		map.put("transactionAmount", Rs_2);
		map.put("billingAmount", Rs_2);
		APIConstants.retrivalRefNo = RandomStringUtils.randomNumeric(10);
		map.put("retrievalRefNo", APIConstants.retrivalRefNo);
		response = api.post(APIConstants.AuthDebit_CashbackCreditURL, APIBody.getAuthDebitRequestBody(map));
	}

	@Given("^markup configured for ProgramPlan ProgramType Channel one$")
	public void markup_configured_for_ProgramPlan_ProgramType_Channel_one() throws Throwable {
		Map<Object, Object> map = new LinkedHashMap<Object, Object>();
		map.put("merchantName", MaathavanHome);
		map.put("terminalID", "null");
		map.put("mcc", MCC_3000);
		map.put("entityId", EntityId15);
		map.put("proxyCardNo", Card22);
		map.put("network", RUPAY);
		map.put("channel", ECOM);
		map.put("merchantId", "null");
		map.put("amount", Rs_2);
		map.put("transactionAmount", Rs_2);
		map.put("billingAmount", Rs_2);
		APIConstants.retrivalRefNo = RandomStringUtils.randomNumeric(10);
		map.put("retrievalRefNo", APIConstants.retrivalRefNo);
		response = api.post(APIConstants.AuthDebit_CashbackCreditURL, APIBody.getAuthDebitRequestBody(map));
	}

	@Given("^AuthReversal should fail if Auth Debit is Failed six$")
	public void authReversal_should_fail_if_Auth_Debit_is_Failed_six() throws Throwable {
		Map<Object, Object> map = new LinkedHashMap<Object, Object>();
		map.put("channel", ECOM);
		map.put("transactionAmount", Rs_20);
		map.put("productCode", "null");
		map.put("amount", Rs_20);
		map.put("merchantName", MaathavanHome);
		map.put("txnRefNo", APIConstants.txnRefNo);
		map.put("proxyCardNo", "70000120");
		map.put("mcc", "null");
		map.put("network", RUPAY);
		map.put("merchantID", "null");
		map.put("terminalID", "null");
		map.put("institutionCode", "458519");
//		APIConstants.retrivalRefNo = RandomStringUtils.randomNumeric(10);
		map.put("retrievalRefNo", APIConstants.retrivalRefNo);
		response = api.post(APIConstants.AuthReversal_CashbackDebitURL,
				APIBody.getAuthReversalRequestBodyWithDuplicateTxnRefNo(map));
	}

	@Given("^fundpost credit should fail if Auth Debit is Failed$")
	public void authReversal_should_fail_if_Auth_Debit_is_Failed() throws Throwable {
		Map<Object, Object> map = new LinkedHashMap<Object, Object>();
		map.put("entityId", EntityId5);
		map.put("proxyCardNo", Card9);
		map.put("rrn", APIConstants.retrivalRefNo);
		map.put("transactionAmount", Rs_20);
		map.put("amount", Rs_20);
		map.put("merchantID", "null");
		map.put("merchantName", MaathavanHome);
		map.put("transactionType", FUNDPOST_CREDIT);
		map.put("terminalID", "null");
		map.put("mcc", "null");
		map.put("network", RUPAY);
		map.put("channel", FUND_POST);
		map.put("originalRrn", APIConstants.retrivalRefNo);
		map.put("txnRefNo", APIConstants.txnRefNo);
		response = api.post(APIConstants.AuthCredit_CashbackRefundURL,
				APIBody.getAuthCreditRequestBodyWithDuplicateTxnRefNo(map));
	}

	@Given("^fundpost credit declines if rrn mismatch with rrn used for Auth Debit$")
	public void FUNDPOST_CREDIT_declines_if_rrn_mismatch_with_rrn_used_for_Auth_Debit() throws Throwable {
		Map<Object, Object> map = new LinkedHashMap<Object, Object>();
		map.put("entityId", EntityId5);
		map.put("proxyCardNo", Card9);
		APIConstants.retrivalRefNo = RandomStringUtils.randomNumeric(10);
		map.put("rrn", APIConstants.retrivalRefNo);
		map.put("transactionAmount", Rs_50);
		map.put("amount", Rs_50);
		map.put("merchantID", "null");
		map.put("merchantName", MaathavanHome);
		map.put("transactionType", FUNDPOST_CREDIT);
		map.put("terminalID", "null");
		map.put("mcc", "null");
		map.put("network", RUPAY);
		map.put("channel", FUND_POST);
		map.put("originalRrn", APIConstants.retrivalRefNo);
		map.put("txnRefNo", APIConstants.txnRefNo);
		response = api.post(APIConstants.AuthCredit_CashbackRefundURL,
				APIBody.getAuthCreditRequestBodyWithDuplicateTxnRefNo(map));
	}

	@Given("^proxy_Card_with_MCC_PocketLimit_six$")
	public void proxy_Card_with_MCC_PocketLimit_six() throws Throwable {
		Map<Object, Object> map = new LinkedHashMap<Object, Object>();
		map.put("merchantName", MaathavanHome);
		map.put("terminalID", "null");
		map.put("mcc", MCC_742);
		map.put("entityId", "fc09f97a-3459-4080-b7d6-0d997ebc75ac");
		map.put("proxyCardNo", "18901300");
		map.put("network", RUPAY);
		map.put("channel", ECOM);
		map.put("merchantId", "null");
		map.put("amount", Rs_20);
		map.put("transactionAmount", Rs_20);
		map.put("billingAmount", Rs_20);
		APIConstants.retrivalRefNo = RandomStringUtils.randomNumeric(10);
		map.put("retrievalRefNo", APIConstants.retrivalRefNo);
		response = api.post(APIConstants.AuthDebit_CashbackCreditURL, APIBody.getAuthDebitRequestBody(map));
	}

	@Given("^Proxy Crad with other Pocket There is no offer at perticular In merchant Report BrandID updated as null six$")
	public void proxy_Crad_with_other_Pocket_There_is_no_offer_at_perticular_merchant_Report_BrandID_six()
			throws Throwable {
		Map<Object, Object> map = new LinkedHashMap<Object, Object>();
		map.put("merchantName", MaathavanHome);
		map.put("terminalID", "123456");
		map.put("mcc", "5013");
		map.put("entityId", EntityId6);
		map.put("proxyCardNo", Card10);
		map.put("network", RUPAY);
		map.put("channel", ECOM);
		map.put("merchantId", "111111111");
		map.put("amount", Rs_20);
		map.put("transactionAmount", Rs_20);
		map.put("billingAmount", Rs_20);
		map.put("txnRefNo", APIConstants.txnRefNo);
		APIConstants.retrivalRefNo = RandomStringUtils.randomNumeric(10);
		map.put("retrievalRefNo", APIConstants.retrivalRefNo);
		response = api.post(APIConstants.AuthDebit_CashbackCreditURL, APIBody.getAuthDebitRequestBody(map));
	}

	@Given("^auth Reversal declines if trxAmout gtr DebitAmount$")
	public void auth_Reversal_declines_if_trxAmout_gtr_DebitAmount() throws Throwable {
		Map<Object, Object> map = new LinkedHashMap<Object, Object>();
		map.put("channel", ECOM);
		map.put("txnRefNo", APIConstants.txnRefNo);
		map.put("transactionAmount", Rs_201);
		map.put("productCode", "null");
		map.put("amount", Rs_201);
		map.put("entityId", EntityId6);
		map.put("merchantName", SARAVANAN_TESTING_CITY_NAME_IN);
		map.put("proxyCardNo", Card10);
		map.put("mcc", "null");
		map.put("network", RUPAY);
		map.put("transactionType", FUNDPOST_CREDIT);
		map.put("merchantID", "null");
		map.put("terminalID", "null");
		map.put("institutionCode", "458519");
		map.put("retrievalRefNo", APIConstants.retrivalRefNo);
		response = api.post(APIConstants.AuthReversal_CashbackDebitURL,
				APIBody.getAuthReversalRequestBodyWithDuplicateTxnRefNo(map));
	}

	@Given("^Auth Reversal declines if txnAmount less than DebitAmount$")
	public void Auth_Reversal_declines_if_txnAmount_less_than_DebitAmount() throws Throwable {
		Map<Object, Object> map = new LinkedHashMap<Object, Object>();
		map.put("channel", ECOM);
		map.put("txnRefNo", APIConstants.txnRefNo);
		map.put("transactionAmount", Rs_2);
		map.put("productCode", "null");
		map.put("amount", Rs_2);
		map.put("entityId", EntityId6);
		map.put("merchantName", SARAVANAN_TESTING_CITY_NAME_IN);
		map.put("proxyCardNo", Card10);
		map.put("mcc", "null");
		map.put("network", RUPAY);
		map.put("transactionType", FUNDPOST_CREDIT);
		map.put("merchantID", "null");
		map.put("terminalID", "null");
		map.put("institutionCode", "458519");
		map.put("retrievalRefNo", APIConstants.retrivalRefNo);
		response = api.post(APIConstants.AuthReversal_CashbackDebitURL,
				APIBody.getAuthReversalRequestBodyWithDuplicateTxnRefNo(map));
	}

	@Given("^auth Reversal do txn$")
	public void auth_Reversal_do_txn() throws Throwable {
		Map<Object, Object> map = new LinkedHashMap<Object, Object>();
		map.put("channel", ECOM);
		map.put("txnRefNo", APIConstants.txnRefNo1);
		map.put("transactionAmount", Rs_2);
		map.put("productCode", "null");
		map.put("amount", Rs_2);
		map.put("entityId", EntityId5);
		map.put("merchantName", SARAVANAN_TESTING_CITY_NAME_IN);
		map.put("proxyCardNo", Card9);
		map.put("mcc", "null");
		map.put("network", RUPAY);
		map.put("transactionType", FUNDPOST_CREDIT);
		map.put("merchantID", "null");
		map.put("terminalID", "null");
		map.put("institutionCode", "458519");
		map.put("retrievalRefNo", APIConstants.retrivalRefNo);
		response = api.post(APIConstants.AuthReversal_CashbackDebitURL,
				APIBody.getAuthReversalRequestBodyWithDuplicateTxnRefNo(map));
	}

	@Given("^If Debit deducted reversal will credit to respective pocket only irrespective of mcc in the reversal MCC$")
	public void if_Debit_deducted_reversal_will_credit_to_respective_pocket_only_irrespective_of_mcc_in_the_reversal_MCC()
			throws Throwable {
		Map<Object, Object> map = new LinkedHashMap<Object, Object>();
		map.put("channel", ECOM);
		map.put("transactionAmount", Rs_20);
		map.put("productCode", "null");
		map.put("amount", Rs_20);
		map.put("merchantName", MaathavanHome);
		map.put("txnRefNo", APIConstants.txnRefNo);
		map.put("proxyCardNo", Card10);
		map.put("mcc", "5021");
		map.put("network", RUPAY);
		map.put("merchantID", "12322155");
		map.put("terminalID", "Terminal 1");
		map.put("institutionCode", "458519");
		map.put("txnRefNo", APIConstants.txnRefNo);
		map.put("retrievalRefNo", APIConstants.retrivalRefNo);
		response = api.post(APIConstants.AuthReversal_CashbackDebitURL,
				APIBody.getAuthReversalRequestBodyWithDuplicateTxnRefNo(map));
	}

	@Given("^proxy Card with other Pocket There is a offer at perticular mid tid in merchant report brandID 20$")
	public void proxy_Card_with_other_Pocket_There_is_a_offer_at_perticular_MID_TID_In_merchant_Report_BrandID_20()
			throws Throwable {
		Map<Object, Object> map = new LinkedHashMap<Object, Object>();
		map.put("channel", ECOM);
		map.put("txnRefNo", APIConstants.txnRefNo);
		map.put("transactionAmount", Rs_20);
		map.put("productCode", "null");
		map.put("amount", Rs_20);
		map.put("merchantName", SARAVANAN_TESTING_CITY_NAME_IN);
		map.put("proxyCardNo", Card10);
		map.put("mcc", "3001");
		map.put("network", RUPAY);
		map.put("merchantID", "null");
		map.put("terminalID", "null");
		map.put("institutionCode", "458519");
//		APIConstants.retrivalRefNo = RandomStringUtils.randomNumeric(10);
		map.put("retrievalRefNo", APIConstants.retrivalRefNo);
		response = api.post(APIConstants.AuthReversal_CashbackDebitURL,
				APIBody.getAuthReversalRequestBodyWithDuplicateTxnRefNo(map));
	}

	@Given("^auth Credit allows if trxAmount equals DebitAmount$")
	public void auth_Credit_allows_if_trxAmount_equals_DebitAmount() throws Throwable {
		Map<Object, Object> map = new LinkedHashMap<Object, Object>();
		map.put("entityId", EntityId6);
		map.put("proxyCardNo", Card10);
		map.put("rrn", APIConstants.retrivalRefNo);
		map.put("transactionAmount", Rs_20);
		map.put("amount", Rs_20);
		map.put("merchantID", "null");
		map.put("merchantName", MaathavanHome);
		map.put("transactionType", FUNDPOST_CREDIT);
		map.put("terminalID", "null");
		map.put("mcc", MCC_3001);
		map.put("network", RUPAY);
		map.put("channel", FUND_POST);
		map.put("originalRrn", APIConstants.retrivalRefNo);
		map.put("txnRefNo", APIConstants.txnRefNo);
		response = api.post(APIConstants.AuthCredit_CashbackRefundURL,
				APIBody.getAuthCreditRequestBodyWithDuplicateTxnRefNo(map));
	}

	@Given("^fundpost_do_two_txn$")
	public void fUNDPOST_do_two_txn() throws Throwable {
		Map<Object, Object> map = new LinkedHashMap<Object, Object>();
		map.put("entityId", EntityId10);
		map.put("proxyCardNo", Card16);
		map.put("rrn", APIConstants.retrivalRefNo1);
		map.put("transactionAmount", Rs_20);
		map.put("amount", Rs_20);
		map.put("merchantID", "null");
		map.put("merchantName", MaathavanHome);
		map.put("transactionType", FUNDPOST_CREDIT);
		map.put("terminalID", "null");
		map.put("mcc", "null");
		map.put("network", RUPAY);
		map.put("channel", FUND_POST);
		map.put("originalRrn", APIConstants.retrivalRefNo1);
		map.put("txnRefNo", APIConstants.txnRefNo);
		response = api.post(APIConstants.AuthCredit_CashbackRefundURL,
				APIBody.getAuthCreditRequestBodyWithDuplicateTxnRefNo(map));
	}

	@Given("^in merchant Report BrandID 21$")
	public void in_merchant_Report_BrandID_21() throws Throwable {
		Map<Object, Object> map = new LinkedHashMap<Object, Object>();
		map.put("entityId", EntityId6);
		map.put("proxyCardNo", Card10);
		map.put("rrn", APIConstants.retrivalRefNo);
		map.put("transactionAmount", Rs_20);
		map.put("amount", Rs_20);
		map.put("merchantID", "12322155");
		map.put("merchantName", MaathavanHome);
		map.put("transactionType", FUNDPOST_CREDIT);
		map.put("terminalID", "Terminal 1");
		map.put("mcc", "3017");
		map.put("network", RUPAY);
		map.put("channel", FUND_POST);
		map.put("originalRrn", APIConstants.retrivalRefNo);
		map.put("txnRefNo", APIConstants.txnRefNo);
		response = api.post(APIConstants.AuthCredit_CashbackRefundURL,
				APIBody.getAuthCreditRequestBodyWithDuplicateTxnRefNo(map));
	}

	@Given("^proxy Card with other Pocket There is a offer at perticular in merchant Report BrandID 19$")
	public void proxy_Card_with_other_Pocket_There_is_a_offer_at_perticular_In_merchant_Report_BrandID_19()
			throws Throwable {
		Map<Object, Object> map = new LinkedHashMap<Object, Object>();
		map.put("merchantName", MaathavanHome);
		map.put("terminalID", "Terminal 1");
		map.put("mcc", MCC_3001);
		map.put("entityId", EntityId6);
		map.put("proxyCardNo", Card10);
		map.put("network", RUPAY);
		map.put("channel", ECOM);
		map.put("merchantId", "12322155");
		map.put("amount", Rs_20);
		map.put("transactionAmount", Rs_20);
		map.put("billingAmount", Rs_20);
		APIConstants.retrivalRefNo = RandomStringUtils.randomNumeric(10);
		map.put("retrievalRefNo", APIConstants.retrivalRefNo);
		response = api.post(APIConstants.AuthDebit_CashbackCreditURL, APIBody.getAuthDebitRequestBody(map));
	}

	@Given("^auth credit declines if trxAmout gtr DebitAmount$")
	public void auth_credit_declines_if_trxAmout_gtr_DebitAmount() throws Throwable {
		Map<Object, Object> map = new LinkedHashMap<Object, Object>();
		map.put("entityId", EntityId6);
		map.put("proxyCardNo", Card10);
		map.put("rrn", APIConstants.retrivalRefNo);
		map.put("transactionAmount", Rs_10);
		map.put("amount", Rs_10);
		map.put("merchantID", "null");
		map.put("merchantName", MaathavanHome);
		map.put("transactionType", FUNDPOST_CREDIT);
		map.put("terminalID", "null");
		map.put("mcc", MCC_3001);
		map.put("network", RUPAY);
		map.put("channel", FUND_POST);
		map.put("originalRrn", APIConstants.retrivalRefNo);
		map.put("txnRefNo", APIConstants.txnRefNo);
		response = api.post(APIConstants.AuthCredit_CashbackRefundURL,
				APIBody.getAuthCreditRequestBodyWithDuplicateTxnRefNo(map));
	}

	@Given("^Proxy Card Without LoadedPocket$")
	public void proxy_card_without_loadedPocket() throws Throwable {
		Map<Object, Object> map = new LinkedHashMap<Object, Object>();
		map.put("merchantName", MaathavanHome);
		map.put("terminalID", "null");
		map.put("mcc", "null");
		map.put("entityId", EntityId14);
		map.put("proxyCardNo", Card21);
		map.put("network", RUPAY);
		map.put("channel", ECOM);
		map.put("merchantId", "null");
		map.put("amount", Rs_20);
		map.put("transactionAmount", Rs_20);
		map.put("billingAmount", Rs_20);
		map.put("txnRefNo", APIConstants.txnRefNo);
		APIConstants.retrivalRefNo = RandomStringUtils.randomNumeric(10);
		map.put("retrievalRefNo", APIConstants.retrivalRefNo);
		response = api.post(APIConstants.AuthDebit_CashbackCreditURL, APIBody.getAuthDebitRequestBody(map));
	}

	@Given("^Proxy Card with Default Pocket TC seven point two$")
	public void proxy_card_with_default_pocket_tC_seven_point_two() throws Throwable {
		Map<Object, Object> map = new LinkedHashMap<Object, Object>();
		map.put("merchantName", MaathavanHome);
		map.put("terminalID", "null");
		map.put("mcc", "null");
		map.put("entityId", EntityId12);
		map.put("proxyCardNo", Card18);
		map.put("network", RUPAY);
		map.put("channel", ECOM);
		map.put("merchantId", "null");
		map.put("amount", Rs_20);
		map.put("transactionAmount", Rs_20);
		map.put("billingAmount", Rs_20);
		APIConstants.retrivalRefNo = RandomStringUtils.randomNumeric(10);
		map.put("retrievalRefNo", APIConstants.retrivalRefNo);
		response = api.post(APIConstants.AuthDebit_CashbackCreditURL, APIBody.getAuthDebitRequestBody(map));
	}

	@Given("^Proxy Card with Default Pocket TC seven point two 2nd run$")
	public void proxy_card_with_default_pocket_tC_seven_point_two_2nd_run() throws Throwable {
		Map<Object, Object> map = new LinkedHashMap<Object, Object>();
		map.put("merchantName", MaathavanHome);
		map.put("terminalID", "null");
		map.put("mcc", "null");
		map.put("entityId", EntityId12);
		map.put("proxyCardNo", Card18);
		map.put("network", RUPAY);
		map.put("channel", ECOM);
		map.put("merchantId", "null");
		map.put("amount", Rs_20);
		map.put("transactionAmount", Rs_20);
		map.put("billingAmount", Rs_20);
		map.put("retrievalRefNo", APIConstants.retrivalRefNo);
		response = api.post(APIConstants.AuthDebit_CashbackCreditURL, APIBody.getAuthDebitRequestBody(map));
	}

	@Given("^Proxy Crad with other Pocket TC seven point three$")
	public void proxy_crad_with_other_pocket_tc_seven_point_three() throws Throwable {
		Map<Object, Object> map = new LinkedHashMap<Object, Object>();
		map.put("merchantName", MaathavanHome);
		map.put("terminalID", "null");
		map.put("mcc", MCC_3001);
		map.put("entityId", EntityId12);
		map.put("proxyCardNo", Card18);
		map.put("network", RUPAY);
		map.put("channel", ECOM);
		map.put("merchantId", "null");
		map.put("amount", Rs_20);
		map.put("transactionAmount", Rs_20);
		map.put("billingAmount", Rs_20);
		map.put("txnRefNo", APIConstants.txnRefNo);
		APIConstants.retrivalRefNo = RandomStringUtils.randomNumeric(10);
		map.put("retrievalRefNo", APIConstants.retrivalRefNo);
		response = api.post(APIConstants.AuthDebit_CashbackCreditURL, APIBody.getAuthDebitRequestBody(map));
	}

	@Given("^Markup configured for ProgramPlan ProgramType Channel and MCC$")
	public void markup_configured_for_programplan_programtype_channel_and_MCC() throws Throwable {
		Map<Object, Object> map = new LinkedHashMap<Object, Object>();
		map.put("merchantName", MaathavanHome);
		map.put("terminalID", "null");
		map.put("mcc", MCC_3017);
		map.put("entityId", EntityId12);
		map.put("proxyCardNo", Card18);
		map.put("network", RUPAY);
		map.put("channel", ECOM);
		map.put("merchantId", "null");
		map.put("amount", Rs_20);
		map.put("transactionAmount", Rs_20);
		map.put("billingAmount", Rs_20);
		map.put("txnRefNo", APIConstants.txnRefNo);
		APIConstants.retrivalRefNo = RandomStringUtils.randomNumeric(10);
		map.put("retrievalRefNo", APIConstants.retrivalRefNo);
		response = api.post(APIConstants.AuthDebit_CashbackCreditURL, APIBody.getAuthDebitRequestBody(map));
	}

	@Given("^TID seven point five$")
	public void tid_seven_point_fivethrows_throwable() {
		Map<Object, Object> map = new LinkedHashMap<Object, Object>();
		map.put("merchantName", MaathavanHome);
		map.put("terminalID", Terminal_ID_Blocked);
		map.put("mcc", MCC_3001);
		map.put("entityId", EntityId12);
		map.put("proxyCardNo", Card18);
		map.put("network", RUPAY);
		map.put("channel", ECOM);
		map.put("merchantId", Merchant_ID);
		map.put("amount", Rs_2);
		map.put("transactionAmount", Rs_2);
		map.put("billingAmount", Rs_2);
		map.put("txnRefNo", APIConstants.txnRefNo);
		APIConstants.retrivalRefNo = RandomStringUtils.randomNumeric(10);
		map.put("retrievalRefNo", APIConstants.retrivalRefNo);
		response = api.post(APIConstants.AuthDebit_CashbackCreditURL, APIBody.getAuthDebitRequestBody(map));
	}

	@Given("^Offer at perticular Merchant and Terminal and MarkUp for MCC$")
	public void offer_at_perticular_Merchant_Terminal_and_MarkUp_for_MCC() {
		Map<Object, Object> map = new LinkedHashMap<Object, Object>();
		map.put("merchantName", MaathavanHome);
		map.put("terminalID", terminal_one);
		map.put("mcc", MCC_3017);
		map.put("entityId", EntityId12);
		map.put("proxyCardNo", Card18);
		map.put("network", RUPAY);
		map.put("channel", ECOM);
		map.put("merchantId", Merchant_ID);
		map.put("amount", Rs_20);
		map.put("transactionAmount", Rs_20);
		map.put("billingAmount", Rs_20);
		map.put("txnRefNo", APIConstants.txnRefNo);
		APIConstants.retrivalRefNo = RandomStringUtils.randomNumeric(10);
		map.put("retrievalRefNo", APIConstants.retrivalRefNo);
		response = api.post(APIConstants.AuthDebit_CashbackCreditURL, APIBody.getAuthDebitRequestBody(map));
	}

	@Given("^Offer at perticular Merchant and Terminal seven point seven$")
	public void offer_at_perticular_merchant_terminal_seven_point_seven() {
		Map<Object, Object> map = new LinkedHashMap<Object, Object>();
		map.put("merchantName", MaathavanHome);
		map.put("terminalID", terminal_one);
		map.put("mcc", MCC_3001);
		map.put("entityId", EntityId12);
		map.put("proxyCardNo", Card18);
		map.put("network", RUPAY);
		map.put("channel", ECOM);
		map.put("merchantId", Merchant_ID);
		map.put("amount", Rs_20);
		map.put("transactionAmount", Rs_20);
		map.put("billingAmount", Rs_20);
		map.put("txnRefNo", APIConstants.txnRefNo);
		APIConstants.retrivalRefNo = RandomStringUtils.randomNumeric(10);
		map.put("retrievalRefNo", APIConstants.retrivalRefNo);
		response = api.post(APIConstants.AuthDebit_CashbackCreditURL, APIBody.getAuthDebitRequestBody(map));
	}

	@Given("^Transaction is not allowed If channel is disabled by Customer using APP$")
	public void transaction_is_not_allowed_if_channel_is_disabled_by_customer_using_APP() {
		Map<Object, Object> map = new LinkedHashMap<Object, Object>();
		map.put("merchantName", MaathavanHome);
		map.put("terminalID", "null");
		map.put("mcc", MCC_3001);
		map.put("entityId", EntityId12);
		map.put("proxyCardNo", Card18);
		map.put("network", RUPAY);
		map.put("channel", CONTACTLESS);
		map.put("merchantId", Merchant_ID);
		map.put("amount", Rs_2);
		map.put("transactionAmount", Rs_2);
		map.put("billingAmount", Rs_2);
		map.put("txnRefNo", APIConstants.txnRefNo);
		APIConstants.retrivalRefNo = RandomStringUtils.randomNumeric(10);
		map.put("retrievalRefNo", APIConstants.retrivalRefNo);
		response = api.post(APIConstants.AuthDebit_CashbackCreditURL, APIBody.getAuthDebitRequestBody(map));
	}

	@Given("^Transaction more than Monthly Channel Limit SET by customer using APP is not allowed$")
	public void transaction_more_than_monthly_channel_limit_set_by_customer_using_app_is_not_allowed() {
		Map<Object, Object> map = new LinkedHashMap<Object, Object>();
		map.put("merchantName", MaathavanHome);
		map.put("terminalID", "null");
		map.put("mcc", "null");
		map.put("entityId", EntityId12);
		map.put("proxyCardNo", Card18);
		map.put("network", RUPAY);
		map.put("channel", ECOM);
		map.put("merchantId", Merchant_ID);
		map.put("amount", Rs_201);
		map.put("transactionAmount", Rs_201);
		map.put("billingAmount", Rs_201);
		map.put("txnRefNo", APIConstants.txnRefNo);
		APIConstants.retrivalRefNo = RandomStringUtils.randomNumeric(10);
		map.put("retrievalRefNo", APIConstants.retrivalRefNo);
		response = api.post(APIConstants.AuthDebit_CashbackCreditURL, APIBody.getAuthDebitRequestBody(map));
	}

	@Given("^Transaction more than Wallet Daily Limit Set at Admin say 200 is not allowed$")
	public void transaction_more_than_wallet_daily_limit_set_at_admin_say_200_is_not_allowed() {
		Map<Object, Object> map = new LinkedHashMap<Object, Object>();
		map.put("merchantName", MaathavanHome);
		map.put("terminalID", "null");
		map.put("mcc", "null");
		map.put("entityId", EntityId12);
		map.put("proxyCardNo", Card18);
		map.put("network", RUPAY);
		map.put("channel", ECOM);
		map.put("merchantId", Merchant_ID);
		map.put("amount", Rs_20);
		map.put("transactionAmount", Rs_20);
		map.put("billingAmount", Rs_20);
		map.put("txnRefNo", APIConstants.txnRefNo);
		APIConstants.retrivalRefNo = RandomStringUtils.randomNumeric(10);
		map.put("retrievalRefNo", APIConstants.retrivalRefNo);
		response = api.post(APIConstants.AuthDebit_CashbackCreditURL, APIBody.getAuthDebitRequestBody(map));
	}

	@Given("^Transaction is not allowed if Card is Puased$")
	public void transaction_is_not_allowed_if_card_is_puased() {
		Map<Object, Object> map = new LinkedHashMap<Object, Object>();
		map.put("merchantName", MaathavanHome);
		map.put("terminalID", "null");
		map.put("mcc", "null");
		map.put("entityId", EntityId13);
		map.put("proxyCardNo", Card19);
		map.put("network", RUPAY);
		map.put("channel", ECOM);
		map.put("merchantId", Merchant_ID);
		map.put("amount", Rs_20);
		map.put("transactionAmount", Rs_20);
		map.put("billingAmount", Rs_20);
		map.put("txnRefNo", APIConstants.txnRefNo);
		APIConstants.retrivalRefNo = RandomStringUtils.randomNumeric(10);
		map.put("retrievalRefNo", APIConstants.retrivalRefNo);
		response = api.post(APIConstants.AuthDebit_CashbackCreditURL, APIBody.getAuthDebitRequestBody(map));
	}

	@Given("^Transaction is not allowed if Card is Blocked$")
	public void transaction_is_not_allowed_if_card_is_blocked() {
		Map<Object, Object> map = new LinkedHashMap<Object, Object>();
		map.put("merchantName", MaathavanHome);
		map.put("terminalID", "null");
		map.put("mcc", "null");
		map.put("entityId", EntityId13);
		map.put("proxyCardNo", Card20);
		map.put("network", RUPAY);
		map.put("channel", ECOM);
		map.put("merchantId", Merchant_ID);
		map.put("amount", Rs_20);
		map.put("transactionAmount", Rs_20);
		map.put("billingAmount", Rs_20);
		map.put("txnRefNo", APIConstants.txnRefNo);
		APIConstants.retrivalRefNo = RandomStringUtils.randomNumeric(10);
		map.put("retrievalRefNo", APIConstants.retrivalRefNo);
		response = api.post(APIConstants.AuthDebit_CashbackCreditURL, APIBody.getAuthDebitRequestBody(map));
	}

	@Given("^Transaction is not allowed if Entity and ProxyNo Mismatch$")
	public void transaction_is_not_allowed_if_entity_and_proxyNo_mismatch() {
		Map<Object, Object> map = new LinkedHashMap<Object, Object>();
		map.put("merchantName", MaathavanHome);
		map.put("terminalID", "null");
		map.put("mcc", "null");
		map.put("entityId", EntityId12);
		map.put("proxyCardNo", Card10);
		map.put("network", RUPAY);
		map.put("channel", ECOM);
		map.put("merchantId", Merchant_ID);
		map.put("amount", Rs_20);
		map.put("transactionAmount", Rs_20);
		map.put("billingAmount", Rs_20);
		map.put("txnRefNo", APIConstants.txnRefNo);
		APIConstants.retrivalRefNo = RandomStringUtils.randomNumeric(10);
		map.put("retrievalRefNo", APIConstants.retrivalRefNo);
		response = api.post(APIConstants.AuthDebit_CashbackCreditURL, APIBody.getAuthDebitRequestBody(map));
	}

	@Given("^Proxy Card with Default Pocket with seven point fifteen$")
	public void proxy_card_with_default_pocket_with_seven_point_fifteen() {
		Map<Object, Object> map = new LinkedHashMap<Object, Object>();
		map.put("merchantName", MaathavanHome);
		map.put("terminalID", "null");
		map.put("mcc", "null");
		map.put("entityId", EntityId12);
		map.put("proxyCardNo", Card18);
		map.put("network", RUPAY);
		map.put("channel", ECOM);
		map.put("merchantId", Merchant_ID);
		map.put("amount", Rs_20);
		map.put("transactionAmount", Rs_20);
		map.put("billingAmount", Rs_20);
		map.put("txnRefNo", APIConstants.txnRefNo);
		APIConstants.retrivalRefNo = RandomStringUtils.randomNumeric(10);
		map.put("retrievalRefNo", APIConstants.retrivalRefNo);
		response = api.post(APIConstants.AuthDebit_CashbackCreditURL, APIBody.getAuthDebitRequestBody(map));
	}

	@Given("^Proxy Card Without LoadedPocket seven point sixteen$")
	public void proxy_cardc_without_loadedPocket_seven_point_sixteen() {
		Map<Object, Object> map = new LinkedHashMap<Object, Object>();
		map.put("merchantName", MaathavanHome);
		map.put("terminalID", "null");
		map.put("mcc", "null");
		map.put("entityId", "ccc1b1f7-351f-46f6-bf3f-4b6fccb7f289");
		map.put("proxyCardNo", "19500214");
		map.put("network", RUPAY);
		map.put("channel", ECOM);
		map.put("merchantId", Merchant_ID);
		map.put("amount", Rs_20);
		map.put("transactionAmount", Rs_20);
		map.put("billingAmount", Rs_20);
		map.put("txnRefNo", APIConstants.txnRefNo);
		APIConstants.retrivalRefNo = RandomStringUtils.randomNumeric(10);
		map.put("retrievalRefNo", APIConstants.retrivalRefNo);
		response = api.post(APIConstants.AuthDebit_CashbackCreditURL, APIBody.getAuthDebitRequestBody(map));
	}

	@Given("^Proxy Card having Pocket MEDICAL DEFAULT$")
	public void proxy_card_having_pocket_medical_default() {
		Map<Object, Object> map = new LinkedHashMap<Object, Object>();
		map.put("merchantName", MaathavanHome);
		map.put("terminalID", "null");
		map.put("mcc", "3030");
		map.put("entityId", "2666c102-3dd8-401f-99e5-f70145625aeb");
		map.put("proxyCardNo", "888110094");
		map.put("network", RUPAY);
		map.put("channel", ECOM);
		map.put("merchantId", Merchant_ID);
		map.put("amount", Rs_2);
		map.put("transactionAmount", Rs_2);
		map.put("billingAmount", Rs_2);
		map.put("txnRefNo", APIConstants.txnRefNo);
		APIConstants.retrivalRefNo = RandomStringUtils.randomNumeric(10);
		map.put("retrievalRefNo", APIConstants.retrivalRefNo);
		response = api.post(APIConstants.AuthDebit_CashbackCreditURL, APIBody.getAuthDebitRequestBody(map));
	}

	@Given("^Transaction can be reversed for Approved Debit seven point eighteen$")
	public void transaction_can_be_reversed_for_approved_debit_seven_point_eighteen() {
		Map<Object, Object> map = new LinkedHashMap<Object, Object>();
		map.put("channel", ECOM);
		map.put("transactionAmount", Rs_20);
		map.put("productCode", "null");
		map.put("amount", Rs_20);
		map.put("merchantName", SARAVANAN_TESTING_CITY_NAME_IN);
		map.put("proxyCardNo", Card18);
		map.put("mcc", "null");
		map.put("network", RUPAY);
		map.put("merchantID", "null");
		map.put("terminalID", "null");
		map.put("institutionCode", "458519");
		APIConstants.retrivalRefNo = RandomStringUtils.randomNumeric(10);
//		map.put("txnRefNo", APIConstants.txnRefNo);
		map.put("retrievalRefNo", APIConstants.retrivalRefNo);
		response = api.post(APIConstants.AuthReversal_CashbackDebitURL, APIBody.getAuthReversalRequestBody(map));
	}

	@Given("^Transaction can be reversed for Approved Debit seven point ninteen$")
	public void transaction_can_be_reversed_for_approved_debit_seven_point_ninteen() throws Throwable {
		Map<Object, Object> map = new LinkedHashMap<Object, Object>();
		map.put("channel", ECOM);
		map.put("transactionAmount", "000000000123");
		map.put("productCode", "null");
		map.put("amount", "000000000123");
		map.put("merchantName", SARAVANAN_TESTING_CITY_NAME_IN);
		map.put("proxyCardNo", Card18);
		map.put("mcc", "null");
		map.put("network", RUPAY);
		map.put("merchantID", "null");
		map.put("terminalID", "null");
		map.put("institutionCode", "458519");
		APIConstants.retrivalRefNo = RandomStringUtils.randomNumeric(10);
		map.put("txnRefNo", APIConstants.txnRefNo);
		map.put("retrievalRefNo", APIConstants.retrivalRefNo);
		response = api.post(APIConstants.AuthReversal_CashbackDebitURL,
				APIBody.getAuthReversalRequestBodyWithDuplicateTxnRefNo(map));
	}

	@Given("^Transaction can be reversed for Approved Debit seven point twenty$")
	public void transaction_can_be_reversed_for_approved_debit_seven_point_twenty() throws Throwable {
		Map<Object, Object> map = new LinkedHashMap<Object, Object>();
		map.put("channel", ECOM);
		map.put("transactionAmount", Rs_20);
		map.put("productCode", "null");
		map.put("amount", Rs_20);
		map.put("merchantName", SARAVANAN_TESTING_CITY_NAME_IN);
		map.put("proxyCardNo", Card10);
		map.put("mcc", "null");
		map.put("network", RUPAY);
		map.put("merchantID", "null");
		map.put("terminalID", "null");
		map.put("institutionCode", "458519");
//		APIConstants.retrivalRefNo = RandomStringUtils.randomNumeric(10);
		map.put("txnRefNo", APIConstants.txnRefNo);
		map.put("retrievalRefNo", APIConstants.retrivalRefNo);
		response = api.post(APIConstants.AuthReversal_CashbackDebitURL,
				APIBody.getAuthReversalRequestBodyWithDuplicateTxnRefNo(map));
	}

	@Given("^Proxy Card having Pocket MEDICAL and DEFAULT two$")
	public void proxy_card_having_pocket_medical_and_deafult_two() throws Throwable {
		Map<Object, Object> map = new LinkedHashMap<Object, Object>();
		map.put("merchantName", MaathavanHome);
		map.put("terminalID", "null");
		map.put("mcc", MCC_3001);
		map.put("entityId", EntityId12);
		map.put("proxyCardNo", Card18);
		map.put("network", RUPAY);
		map.put("channel", ECOM);
		map.put("merchantId", "null");
		map.put("amount", Rs_2);
		map.put("transactionAmount", Rs_2);
		map.put("billingAmount", Rs_2);
		map.put("txnRefNo", APIConstants.txnRefNo);
		APIConstants.retrivalRefNo = RandomStringUtils.randomNumeric(10);
		map.put("retrievalRefNo", APIConstants.retrivalRefNo);
		response = api.post(APIConstants.AuthDebit_CashbackCreditURL, APIBody.getAuthDebitRequestBody(map));
	}

	@Given("^Proxy Card with Default Pocket seven point sixteen$")
	public void proxy_card_with_default_pocket_seven_point_sixteen() {
		Map<Object, Object> map = new LinkedHashMap<Object, Object>();
		map.put("merchantName", MaathavanHome);
		map.put("terminalID", "null");
		map.put("mcc", "null");
		map.put("entityId", EntityId12);
		map.put("proxyCardNo", Card18);
		map.put("network", RUPAY);
		map.put("channel", ECOM);
		map.put("merchantId", Merchant_ID);
		map.put("amount", Rs_20);
		map.put("transactionAmount", Rs_20);
		map.put("billingAmount", Rs_20);
		map.put("txnRefNo", APIConstants.txnRefNo);
		APIConstants.retrivalRefNo = RandomStringUtils.randomNumeric(10);
		map.put("retrievalRefNo", APIConstants.retrivalRefNo);
		response = api.post(APIConstants.AuthDebit_CashbackCreditURL, APIBody.getAuthDebitRequestBody(map));
	}

	@Given("^third seven point sixteen$")
	public void third_seven_point_sixteen() {
		Map<Object, Object> map = new LinkedHashMap<Object, Object>();
		map.put("merchantName", MaathavanHome);
		map.put("terminalID", "null");
		map.put("mcc", MCC_3017);
		map.put("entityId", EntityId14);
		map.put("proxyCardNo", Card21);
		map.put("network", RUPAY);
		map.put("channel", CONTACTLESS);
		map.put("merchantId", Merchant_ID);
		map.put("amount", Rs_20);
		map.put("transactionAmount", Rs_20);
		map.put("billingAmount", Rs_20);
		map.put("txnRefNo", APIConstants.txnRefNo);
		APIConstants.retrivalRefNo = RandomStringUtils.randomNumeric(10);
		map.put("retrievalRefNo", APIConstants.retrivalRefNo);
		response = api.post(APIConstants.AuthDebit_CashbackCreditURL,
				APIBody.getAuthDebitRequestBodyWithDuplicateTxnRefNo(map));
	}

	@Given("^Transaction is not allowed if txnRefNo is already used by other Transaction$")
	public void transaction_is_not_allowed_if_txnRefNo_is_already_used_by_other_transaction() {
		Map<Object, Object> map = new LinkedHashMap<Object, Object>();
		map.put("merchantName", MaathavanHome);
		map.put("terminalID", "null");
		map.put("mcc", MCC_3017);
		map.put("entityId", EntityId12);
		map.put("proxyCardNo", Card18);
		map.put("network", RUPAY);
		map.put("channel", CONTACTLESS);
		map.put("merchantId", Merchant_ID);
		map.put("amount", Rs_20);
		map.put("transactionAmount", Rs_20);
		map.put("billingAmount", Rs_20);
		map.put("txnRefNo", APIConstants.txnRefNo);
		APIConstants.retrivalRefNo = RandomStringUtils.randomNumeric(10);
		map.put("retrievalRefNo", APIConstants.retrivalRefNo);
		response = api.post(APIConstants.AuthDebit_CashbackCreditURL,
				APIBody.getAuthDebitRequestBodyWithDuplicateTxnRefNo(map));
	}

	@Given("^Transaction more than Wallet Daily Limit Set at Admin say 200 is not allowed seven point ten second$")
	public void seven_point_ten_second() throws Throwable {
		Map<Object, Object> map = new LinkedHashMap<Object, Object>();
		map.put("merchantName", MaathavanHome);
		map.put("terminalID", "null");
		map.put("mcc", MCC_3001);
		map.put("entityId", EntityId12);
		map.put("proxyCardNo", Card18);
		map.put("network", RUPAY);
		map.put("channel", ECOM);
		map.put("merchantId", "null");
		map.put("amount", Rs_201);
		map.put("transactionAmount", Rs_201);
		map.put("billingAmount", Rs_201);
		map.put("txnRefNo", APIConstants.txnRefNo);
		APIConstants.retrivalRefNo = RandomStringUtils.randomNumeric(10);
		map.put("retrievalRefNo", APIConstants.retrivalRefNo);
		response = api.post(APIConstants.AuthDebit_CashbackCreditURL, APIBody.getAuthDebitRequestBody(map));
	}

	@Given("^Transaction can be reversed for Approved Debit eight one$")
	public void transaction_can_be_reversed_for_Approved_debit_eight_one() throws Throwable {
		Map<Object, Object> map = new LinkedHashMap<Object, Object>();
		map.put("channel", ECOM);
		map.put("transactionAmount", Rs_20);
		map.put("productCode", "null");
		map.put("amount", Rs_20);
		map.put("merchantName", SARAVANAN_TESTING_CITY_NAME_IN);
		map.put("proxyCardNo", Card18);
		map.put("mcc", "null");
		map.put("network", RUPAY);
		map.put("merchantID", "null");
		map.put("terminalID", "null");
		map.put("institutionCode", "458519");
//		APIConstants.retrivalRefNo = RandomStringUtils.randomNumeric(10);
		map.put("txnRefNo", APIConstants.txnRefNo);
		map.put("retrievalRefNo", APIConstants.retrivalRefNo);
		response = api.post(APIConstants.AuthReversal_CashbackDebitURL,
				APIBody.getAuthReversalRequestBodyWithDuplicateTxnRefNo(map));

	}

	@Given("^Transaction can be reversed for Approved Debit MarkUp eight point two$")
	public void transaction_can_be_reversed_for_approved_debit_MarkUp_eight_point_two() throws Throwable {
		Map<Object, Object> map = new LinkedHashMap<Object, Object>();
		map.put("channel", ECOM);
		map.put("transactionAmount", Rs_20);
		map.put("productCode", "null");
		map.put("amount", Rs_20);
		map.put("merchantName", SARAVANAN_TESTING_CITY_NAME_IN);
		map.put("proxyCardNo", Card18);
		map.put("mcc", MCC_3017);
		map.put("network", RUPAY);
		map.put("merchantID", "null");
		map.put("terminalID", "null");
		map.put("institutionCode", "458519");
//		APIConstants.retrivalRefNo = RandomStringUtils.randomNumeric(10);
		map.put("txnRefNo", APIConstants.txnRefNo);
		map.put("retrievalRefNo", APIConstants.retrivalRefNo);
		response = api.post(APIConstants.AuthReversal_CashbackDebitURL,
				APIBody.getAuthReversalRequestBodyWithDuplicateTxnRefNo(map));
	}

	@Given("^Transaction can be reversed for Approved Debit Cashback$")
	public void transaction_can_be_reversed_for_Approved_Debit_Cashback() {
		Map<Object, Object> map = new LinkedHashMap<Object, Object>();
		map.put("channel", ECOM);
		map.put("transactionAmount", Rs_20);
		map.put("productCode", "null");
		map.put("amount", Rs_20);
		map.put("merchantName", SARAVANAN_TESTING_CITY_NAME_IN);
		map.put("proxyCardNo", Card18);
		map.put("mcc", MCC_3001);
		map.put("network", RUPAY);
		map.put("merchantID", "12322155");
		map.put("terminalID", "Terminal 1");
		map.put("institutionCode", "458519");
//		APIConstants.retrivalRefNo = RandomStringUtils.randomNumeric(10);
		map.put("txnRefNo", APIConstants.txnRefNo);
		map.put("retrievalRefNo", APIConstants.retrivalRefNo);
		response = api.post(APIConstants.AuthReversal_CashbackDebitURL,
				APIBody.getAuthReversalRequestBodyWithDuplicateTxnRefNo(map));
	}

	@Given("^Offer at perticular Merchant and Terminal and MarkUp for MCC eight point four$")
	public void Offer_at_perticular_Merchant_and_Terminal_and_MarkUp_for_MCC_eight_point_four() {
		Map<Object, Object> map = new LinkedHashMap<Object, Object>();
		map.put("channel", ECOM);
		map.put("transactionAmount", Rs_20);
		map.put("productCode", "null");
		map.put("amount", Rs_20);
		map.put("merchantName", SARAVANAN_TESTING_CITY_NAME_IN);
		map.put("proxyCardNo", Card18);
		map.put("mcc", MCC_3001);
		map.put("network", RUPAY);
		map.put("merchantID", "12322155");
		map.put("terminalID", "Terminal 1");
		map.put("institutionCode", "458519");
//		APIConstants.retrivalRefNo = RandomStringUtils.randomNumeric(10);
		map.put("txnRefNo", APIConstants.txnRefNo);
		map.put("retrievalRefNo", APIConstants.retrivalRefNo);
		response = api.post(APIConstants.AuthReversal_CashbackDebitURL,
				APIBody.getAuthReversalRequestBodyWithDuplicateTxnRefNo(map));
	}

	@Given("^Partial Complete TxnAmount can be credited back to respective ProxyCard EnityID eight point five$")
	public void Partial_Complete_TxnAmount_can_be_credited_back_to_respective_ProxyCard_EnityID_eight_point_five()
			throws Throwable {
		Map<Object, Object> map = new LinkedHashMap<Object, Object>();
		map.put("entityId", EntityId12);
		map.put("proxyCardNo", Card18);
		map.put("rrn", APIConstants.retrivalRefNo);
		map.put("transactionAmount", Rs_20);
		map.put("amount", Rs_20);
		map.put("merchantID", "null");
		map.put("merchantName", MaathavanHome);
		map.put("transactionType", FUNDPOST_CREDIT);
		map.put("terminalID", "null");
		map.put("mcc", MCC_3001);
		map.put("network", RUPAY);
		map.put("channel", FUND_POST);
		map.put("originalRrn", APIConstants.retrivalRefNo);
		map.put("txnRefNo", APIConstants.txnRefNo);
		response = api.post(APIConstants.AuthCredit_CashbackRefundURL,
				APIBody.getAuthCreditRequestBodyWithDuplicateTxnRefNo(map));
	}

	@Given("^FUNDPOST_CREDIT declines if AuthDebit is already Reversed eight point six$")
	public void FUNDPOST_CREDIT_declines_if_AuthDebit_is_already_Reversed_eight_point_six() throws Throwable {
		Map<Object, Object> map = new LinkedHashMap<Object, Object>();
		map.put("entityId", EntityId12);
		map.put("proxyCardNo", Card18);
		map.put("rrn", APIConstants.retrivalRefNo);
		map.put("transactionAmount", Rs_20);
		map.put("amount", Rs_20);
		map.put("merchantID", "null");
		map.put("merchantName", MaathavanHome);
		map.put("transactionType", FUNDPOST_CREDIT);
		map.put("terminalID", "null");
		map.put("mcc", "null");
		map.put("network", RUPAY);
		map.put("channel", FUND_POST);
		map.put("originalRrn", APIConstants.retrivalRefNo);
		map.put("txnRefNo", APIConstants.txnRefNo);
		response = api.post(APIConstants.AuthCredit_CashbackRefundURL,
				APIBody.getAuthCreditRequestBodyWithDuplicateTxnRefNo(map));
	}

	@Given("^FUNDPOST_CREDIT declines if AuthDebit TxnAmount Mismatch eight point seven$")
	public void FUNDPOST_CREDIT_declines_if_AuthDebit_TxnAmount_Mismatch_eight_point_seven() throws Throwable {
		Map<Object, Object> map = new LinkedHashMap<Object, Object>();
		map.put("entityId", EntityId12);
		map.put("proxyCardNo", Card18);
		map.put("rrn", APIConstants.retrivalRefNo);
		map.put("transactionAmount", Rs_50);
		map.put("amount", Rs_50);
		map.put("merchantID", "null");
		map.put("merchantName", MaathavanHome);
		map.put("transactionType", FUNDPOST_CREDIT);
		map.put("terminalID", "null");
		map.put("mcc", "null");
		map.put("network", RUPAY);
		map.put("channel", FUND_POST);
		map.put("originalRrn", APIConstants.retrivalRefNo);
		map.put("txnRefNo", APIConstants.txnRefNo);
		response = api.post(APIConstants.AuthCredit_CashbackRefundURL,
				APIBody.getAuthCreditRequestBodyWithDuplicateTxnRefNo(map));
	}

	@Given("^FUNDPOST_CREDIT declines if ProxyCard used in AuthDebit Mismatch$")
	public void FUNDPOST_CREDIT_declines_if_ProxyCard_used_in_AuthDebit_Mismatch() throws Throwable {
		Map<Object, Object> map = new LinkedHashMap<Object, Object>();
		map.put("merchantName", MaathavanHome);
		map.put("terminalID", "null");
		map.put("mcc", "null");
		map.put("entityId", EntityId12);
		map.put("proxyCardNo", "12345678");
		map.put("network", RUPAY);
		map.put("channel", FUND_POST);
		map.put("transactionType", FUNDPOST_CREDIT);
		map.put("channel", ECOM);
		map.put("merchantId", "null");
		map.put("amount", Rs_20);
		// map.put("crdr", "C");
		map.put("transactionAmount", Rs_20);
		map.put("billingAmount", Rs_20);
		map.put("txnRefNo", APIConstants.txnRefNo);
//		APIConstants.retrivalRefNo = RandomStringUtils.randomNumeric(10);
		map.put("retrievalRefNo", APIConstants.retrivalRefNo);
		response = api.post(APIConstants.AuthDebit_CashbackCreditURL,
				APIBody.getAuthDebitRequestBodyWithDuplicateTxnRefNo(map));
	}

	@Given("^FUNDPOST_CREDIT declines if ProxyCard used in AuthDebit Mismatch eight point eight$")
	public void FUNDPOST_CREDIT_declines_if_ProxyCard_used_in_AuthDebit_Mismatch_eight_point_eight() throws Throwable {
		Map<Object, Object> map = new LinkedHashMap<Object, Object>();
		map.put("entityId", EntityId12);
		map.put("proxyCardNo", "12345678");
		map.put("rrn", APIConstants.retrivalRefNo);
		map.put("transactionAmount", Rs_20);
		map.put("amount", Rs_20);
		map.put("merchantID", "null");
		map.put("merchantName", MaathavanHome);
		map.put("transactionType", FUNDPOST_CREDIT);
		map.put("terminalID", "null");
		map.put("mcc", "null");
		map.put("network", RUPAY);
		map.put("channel", FUND_POST);
		map.put("originalRrn", APIConstants.retrivalRefNo);
		map.put("txnRefNo", APIConstants.txnRefNo);
		response = api.post(APIConstants.AuthCredit_CashbackRefundURL,
				APIBody.getAuthCreditRequestBodyWithDuplicateTxnRefNo(map));
	}

	@Given("^FUNDPOST_CREDIT declines if UserHashID used in Auth Debit Mismatch eight point nine$")
	public void FUNDPOST_CREDIT_declines_if_UserHashID_used_in_Auth_Debit_Mismatch_eight_point_nine() throws Throwable {
		Map<Object, Object> map = new LinkedHashMap<Object, Object>();
		map.put("entityId", "91e9fa0a-8fdc-4c5d-9203-e7598a5a5a8d");
		map.put("proxyCardNo", Card10);
		map.put("rrn", APIConstants.retrivalRefNo);
		map.put("transactionAmount", Rs_20);
		map.put("amount", Rs_20);
		map.put("merchantID", "null");
		map.put("merchantName", MaathavanHome);
		map.put("transactionType", FUNDPOST_CREDIT);
		map.put("terminalID", "null");
		map.put("mcc", "null");
		map.put("network", RUPAY);
		map.put("channel", FUND_POST);
		map.put("originalRrn", APIConstants.retrivalRefNo);
		map.put("txnRefNo", APIConstants.txnRefNo);
		response = api.post(APIConstants.AuthCredit_CashbackRefundURL,
				APIBody.getAuthCreditRequestBodyWithDuplicateTxnRefNo(map));
	}

	@Given("^FUNDPOST_CREDIT declines if two Auth Debit has same RRN$")
	public void FUNDPOST_CREDIT_declines_if_two_Auth_Debit_has_same_RRN() throws Throwable {
		Map<Object, Object> map = new LinkedHashMap<Object, Object>();
		map.put("entityId", EntityId12);
		map.put("proxyCardNo", Card18);
		map.put("rrn", APIConstants.retrivalRefNo);
		map.put("transactionAmount", Rs_2);
		map.put("amount", Rs_2);
		map.put("merchantID", "null");
		map.put("merchantName", MaathavanHome);
		map.put("transactionType", FUNDPOST_CREDIT);
		map.put("terminalID", "null");
		map.put("mcc", "null");
		map.put("network", RUPAY);
		map.put("channel", FUND_POST);
		map.put("originalRrn", APIConstants.retrivalRefNo);
		map.put("txnRefNo", APIConstants.txnRefNo);
		response = api.post(APIConstants.AuthCredit_CashbackRefundURL,
				APIBody.getAuthCreditRequestBodyWithDuplicateTxnRefNo(map));
	}

	@Given("^Allow Fundpost_Credit for Card loaded with other pocket eight point eleven$")
	public void Allow_Fundpost_Credit_for_Card_loaded_with_other_pocket_eight_point_eleven() throws Throwable {
		Map<Object, Object> map = new LinkedHashMap<Object, Object>();
		map.put("entityId", EntityId12);
		map.put("proxyCardNo", Card18);
		map.put("rrn", APIConstants.retrivalRefNo);
		map.put("transactionAmount", Rs_20);
		map.put("amount", Rs_20);
		map.put("merchantID", "null");
		map.put("merchantName", MaathavanHome);
		map.put("transactionType", FUNDPOST_CREDIT);
		map.put("terminalID", "null");
		map.put("mcc", "null");
		map.put("network", RUPAY);
		map.put("channel", FUND_POST);
		map.put("originalRrn", APIConstants.retrivalRefNo);
		map.put("txnRefNo", APIConstants.txnRefNo);
		response = api.post(APIConstants.AuthCredit_CashbackRefundURL,
				APIBody.getAuthCreditRequestBodyWithDuplicateTxnRefNo(map));
	}

	@Given("^PartialComplete TxnAmount can be credited back to respective ProxyCard EntityID having MarkUp eight twelve$")
	public void PartialComplete_TxnAmount_can_be_credited_back_to_respective_ProxyCard_EntityID_having_MarkUp_eight_twelve()
			throws Throwable {
		Map<Object, Object> map = new LinkedHashMap<Object, Object>();
		map.put("entityId", EntityId12);
		map.put("proxyCardNo", Card18);
		map.put("rrn", APIConstants.retrivalRefNo);
		map.put("transactionAmount", Rs_20);
		map.put("amount", Rs_20);
		map.put("merchantID", "null");
		map.put("merchantName", MaathavanHome);
		map.put("transactionType", FUNDPOST_CREDIT);
		map.put("terminalID", "null");
		map.put("mcc", MCC_3017);
		map.put("network", RUPAY);
		map.put("channel", FUND_POST);
		map.put("originalRrn", APIConstants.retrivalRefNo);
		map.put("txnRefNo", APIConstants.txnRefNo);
		response = api.post(APIConstants.AuthCredit_CashbackRefundURL,
				APIBody.getAuthCreditRequestBodyWithDuplicateTxnRefNo(map));
	}

	@Given("^PartialComplete TxnAmount can be credited back to respective ProxyCard EntityID having CashBack eight point thirteen$")
	public void PartialComplete_TxnAmount_can_be_credited_back_to_respective_ProxyCard_EntityID_having_CashBack_eight_point_thirteen() {
		Map<Object, Object> map = new LinkedHashMap<Object, Object>();
		map.put("entityId", EntityId12);
		map.put("proxyCardNo", Card18);
		map.put("rrn", APIConstants.retrivalRefNo);
		map.put("transactionAmount", Rs_20);
		map.put("amount", Rs_20);
		map.put("merchantID", "null");
		map.put("merchantName", MaathavanHome);
		map.put("transactionType", FUNDPOST_CREDIT);
		map.put("terminalID", "null");
		map.put("mcc", MCC_3001);
		map.put("network", RUPAY);
		map.put("channel", FUND_POST);
		map.put("originalRrn", APIConstants.retrivalRefNo);
		map.put("txnRefNo", APIConstants.txnRefNo);
		response = api.post(APIConstants.AuthCredit_CashbackRefundURL,
				APIBody.getAuthCreditRequestBodyWithDuplicateTxnRefNo(map));
	}

	@Given("^PartialComplete TxnAmount can be credited back to respective ProxyCard EntityID having MarkUp CashBack eight point forteen$")
	public void PartialComplete_TxnAmount_can_be_credited_back_to_respective_ProxyCard_EntityID_having_MarkUp_CashBack_eight_point_forteen() {
		Map<Object, Object> map = new LinkedHashMap<Object, Object>();
		map.put("entityId", EntityId12);
		map.put("proxyCardNo", Card18);
		map.put("rrn", APIConstants.retrivalRefNo);
		map.put("transactionAmount", Rs_20);
		map.put("amount", Rs_20);
		map.put("merchantID", "null");
		map.put("merchantName", MaathavanHome);
		map.put("transactionType", FUNDPOST_CREDIT);
		map.put("terminalID", "null");
		map.put("mcc", MCC_3017);
		map.put("network", RUPAY);
		map.put("channel", FUND_POST);
		map.put("originalRrn", APIConstants.retrivalRefNo);
		map.put("txnRefNo", APIConstants.txnRefNo);
		response = api.post(APIConstants.AuthCredit_CashbackRefundURL,
				APIBody.getAuthCreditRequestBodyWithDuplicateTxnRefNo(map));
	}

	@Given("^No Markup Debited if Channel mismatch eight point fifteen$")
	public void No_Markup_Debited_if_Channel_mismatch_eight_point_fifteen() throws Throwable {
		Map<Object, Object> map = new LinkedHashMap<Object, Object>();
		map.put("merchantName", MaathavanHome);
		map.put("terminalID", "null");
		map.put("mcc", MCC_3017);
		map.put("entityId", EntityId12);
		map.put("proxyCardNo", Card18);
		map.put("network", RUPAY);
		map.put("channel", POS);
		map.put("merchantId", "null");
		map.put("amount", Rs_2);
		map.put("transactionAmount", Rs_2);
		map.put("billingAmount", Rs_2);
		APIConstants.retrivalRefNo = RandomStringUtils.randomNumeric(10);
		map.put("retrievalRefNo", APIConstants.retrivalRefNo);
		response = api.post(APIConstants.AuthDebit_CashbackCreditURL, APIBody.getAuthDebitRequestBody(map));
	}

	@Given("^No Markup Debited if ProgramPlan eight point sixteen$")
	public void No_Markup_Debited_if_ProgramPlan_eight_point_sixteen() throws Throwable {
		Map<Object, Object> map = new LinkedHashMap<Object, Object>();
		map.put("channel", ECOM);
		map.put("transactionAmount", Rs_20);
		map.put("productCode", "null");
		map.put("amount", Rs_20);
		map.put("merchantName", SARAVANAN_TESTING_CITY_NAME_IN);
		map.put("proxyCardNo", Card18);
		map.put("mcc", "null");
		map.put("network", RUPAY);
		map.put("merchantID", "null");
		map.put("terminalID", "null");
		map.put("institutionCode", "458519");
//		APIConstants.retrivalRefNo = RandomStringUtils.randomNumeric(10);
		map.put("txnRefNo", APIConstants.txnRefNo);
		map.put("retrievalRefNo", APIConstants.retrivalRefNo);
		response = api.post(APIConstants.AuthReversal_CashbackDebitURL,
				APIBody.getAuthReversalRequestBodyWithDuplicateTxnRefNo(map));
	}

	@Given("^AuthReversal should fail if Auth Debit is Failed eight point seventeen$")
	public void AuthReversal_should_fail_if_Auth_Debit_is_Failed_eight_point_seventeen() throws Throwable {
		Map<Object, Object> map = new LinkedHashMap<Object, Object>();
		map.put("channel", ECOM);
		map.put("transactionAmount", Rs_20);
		map.put("productCode", "null");
		map.put("amount", Rs_20);
		map.put("merchantName", SARAVANAN_TESTING_CITY_NAME_IN);
		map.put("proxyCardNo", Card18);
		map.put("mcc", "null");
		map.put("network", RUPAY);
		map.put("merchantID", "null");
		map.put("terminalID", "null");
		map.put("institutionCode", "458519");
//		APIConstants.retrivalRefNo = RandomStringUtils.randomNumeric(10);
		map.put("txnRefNo", APIConstants.txnRefNo);
		map.put("retrievalRefNo", APIConstants.retrivalRefNo);
		response = api.post(APIConstants.AuthReversal_CashbackDebitURL,
				APIBody.getAuthReversalRequestBodyWithDuplicateTxnRefNo(map));
	}

	@Given("^FUNDPOST_CREDIT should fail if Auth Debit is Failed$")
	public void FUNDPOST_CREDIT_should_fail_if_Auth_Debit_is_Failed() throws Throwable {
		Map<Object, Object> map = new LinkedHashMap<Object, Object>();
		map.put("entityId", EntityId12);
		map.put("proxyCardNo", Card18);
		map.put("rrn", APIConstants.retrivalRefNo);
		map.put("transactionAmount", Rs_20);
		map.put("amount", Rs_20);
		map.put("merchantID", "null");
		map.put("merchantName", MaathavanHome);
		map.put("transactionType", FUNDPOST_CREDIT);
		map.put("terminalID", "null");
		map.put("mcc", "null");
		map.put("network", RUPAY);
		map.put("channel", FUND_POST);
		map.put("originalRrn", APIConstants.retrivalRefNo);
		map.put("txnRefNo", APIConstants.txnRefNo);
		response = api.post(APIConstants.AuthCredit_CashbackRefundURL,
				APIBody.getAuthCreditRequestBodyWithDuplicateTxnRefNo(map));
	}

	@Given("^FUNDPOST_CREDIT declines if rrn mismatch with rrn used for Auth Debit eight point ninteen$")
	public void FUNDPOST_CREDIT_declines_if_rrn_mismatch_with_rrn_used_for_Auth_Debit_eight_point_ninteen()
			throws Throwable {
		Map<Object, Object> map = new LinkedHashMap<Object, Object>();
		map.put("entityId", EntityId12);
		map.put("proxyCardNo", Card18);
		map.put("rrn", APIConstants.retrivalRefNo);
		map.put("transactionAmount", Rs_50);
		map.put("amount", Rs_50);
		map.put("merchantID", "null");
		map.put("merchantName", MaathavanHome);
		map.put("transactionType", FUNDPOST_CREDIT);
		map.put("terminalID", "null");
		map.put("mcc", "null");
		map.put("network", RUPAY);
		map.put("channel", FUND_POST);
		map.put("originalRrn", APIConstants.retrivalRefNo);
		map.put("txnRefNo", APIConstants.txnRefNo);
		response = api.post(APIConstants.AuthCredit_CashbackRefundURL,
				APIBody.getAuthCreditRequestBodyWithDuplicateTxnRefNo(map));
	}

	@Given("^Proxy Card with MCC PocketLimi eight point twenty$")
	public void Proxy_Card_with_MCC_PocketLimi_eight_point_twenty() throws Throwable {
		Map<Object, Object> map = new LinkedHashMap<Object, Object>();
		map.put("merchantName", MaathavanHome);
		map.put("terminalID", "null");
		map.put("mcc", MCC_743);
		map.put("entityId", "1999689f-5d55-4a9b-86d1-f56422c242b3");
		map.put("proxyCardNo", "888110090");
		map.put("network", RUPAY);
		map.put("channel", ECOM);
		map.put("merchantId", "null");
		map.put("amount", Rs_20);
		map.put("transactionAmount", Rs_20);
		map.put("billingAmount", Rs_20);
		APIConstants.retrivalRefNo = RandomStringUtils.randomNumeric(10);
		map.put("retrievalRefNo", APIConstants.retrivalRefNo);
		response = api.post(APIConstants.AuthDebit_CashbackCreditURL, APIBody.getAuthDebitRequestBody(map));
	}

	@Given("^Auth Reversal declines if trxAmount grthan DebitAmount nine point one$")
	public void Auth_Reversal_declines_if_trxAmount_grthan_DebitAmount_nine_point_one() throws Throwable {
		Map<Object, Object> map = new LinkedHashMap<Object, Object>();
		map.put("channel", ECOM);
		map.put("transactionAmount", Rs_2);
		map.put("productCode", "null");
		map.put("amount", Rs_2);
		map.put("merchantName", MaathavanHome);
		map.put("txnRefNo", APIConstants.txnRefNo);
		map.put("proxyCardNo", Card18);
		map.put("mcc", "null");
		map.put("network", RUPAY);
		map.put("merchantID", "12322155");
		map.put("terminalID", "Terminal 1");
		map.put("institutionCode", "458519");
		map.put("txnRefNo", APIConstants.txnRefNo);
		map.put("retrievalRefNo", APIConstants.retrivalRefNo);
		response = api.post(APIConstants.AuthReversal_CashbackDebitURL,
				APIBody.getAuthReversalRequestBodyWithDuplicateTxnRefNo(map));
	}

	@Given("^Auth Credit FUNDPOST declines if trxAmount grt than DebitAmount nine point one one$")
	public void nine_point_one_one() throws Throwable {
		Map<Object, Object> map = new LinkedHashMap<Object, Object>();
		map.put("entityId", EntityId12);
		map.put("proxyCardNo", Card18);
		map.put("rrn", APIConstants.retrivalRefNo);
		map.put("transactionAmount", Rs_50);
		map.put("amount", Rs_50);
		map.put("merchantID", "null");
		map.put("merchantName", MaathavanHome);
		map.put("transactionType", FUNDPOST_CREDIT);
		map.put("terminalID", "null");
		map.put("mcc", "null");
		map.put("network", RUPAY);
		map.put("channel", FUND_POST);
		map.put("originalRrn", APIConstants.retrivalRefNo);
		map.put("txnRefNo", APIConstants.txnRefNo);
		response = api.post(APIConstants.AuthCredit_CashbackRefundURL,
				APIBody.getAuthCreditRequestBodyWithDuplicateTxnRefNo(map));
	}

	@Given("^Auth Credi FUNDPOST allows if trxAmount DebitAmount nine point two$")
	public void Auth_Credi_FUNDPOST_allows_if_trxAmount_DebitAmount_nine_point_two() throws Throwable {
		Map<Object, Object> map = new LinkedHashMap<Object, Object>();
		map.put("entityId", EntityId12);
		map.put("proxyCardNo", Card18);
		map.put("rrn", APIConstants.retrivalRefNo);
		map.put("txnRefNo", APIConstants.retrivalRefNo);
		map.put("transactionAmount", "00000000500");
		map.put("amount", Rs_20);
		map.put("merchantID", "null");
		map.put("merchantName", MaathavanHome);
		map.put("transactionType", FUNDPOST_CREDIT);
		map.put("terminalID", "null");
		map.put("mcc", MCC_3001);
		map.put("network", RUPAY);
		map.put("channel", FUND_POST);
		map.put("originalRrn", APIConstants.retrivalRefNo);
		response = api.post(APIConstants.AuthCredit_CashbackRefundURL,
				APIBody.getAuthCreditRequestBodyWithDuplicateTxnRefNo(map));
	}

	@Given("^FUNDPOST_do__two_txn nine point four$")
	public void FUNDPOST_do__two_txn_nine_point_four() throws Throwable {
		Map<Object, Object> map = new LinkedHashMap<Object, Object>();
		map.put("entityId", EntityId2);
		map.put("proxyCardNo", Card2);
		map.put("rrn", APIConstants.retrivalRefNo);
		map.put("transactionAmount", Rs_20);
		map.put("amount", Rs_20);
		map.put("merchantID", "null");
		map.put("merchantName", MaathavanHome);
		map.put("transactionType", FUNDPOST_CREDIT);
		map.put("terminalID", "null");
		map.put("mcc", "null");
		map.put("network", RUPAY);
		map.put("channel", FUND_POST);
		map.put("originalRrn", APIConstants.retrivalRefNo);
		map.put("txnRefNo", APIConstants.txnRefNo);
		response = api.post(APIConstants.AuthCredit_CashbackRefundURL,
				APIBody.getAuthCreditRequestBodyWithDuplicateTxnRefNo(map));
	}

	@Given("^Proxy Card with other Pocket there is no offer at perticular MIDTID in merchant Report BrandID updated as null nine point five$")
	public void nine_point_five() throws Throwable {
		Map<Object, Object> map = new LinkedHashMap<Object, Object>();
		map.put("merchantName", MaathavanHome);
		map.put("terminalID", "123456");
		map.put("mcc", MCC_3001);
		map.put("entityId", EntityId12);
		map.put("proxyCardNo", Card18);
		map.put("network", RUPAY);
		map.put("channel", ECOM);
		map.put("merchantId", "111111111");
		map.put("amount", Rs_2);
		map.put("transactionAmount", Rs_2);
		map.put("billingAmount", Rs_2);
		APIConstants.retrivalRefNo = RandomStringUtils.randomNumeric(10);
		map.put("retrievalRefNo", APIConstants.retrivalRefNo);
		response = api.post(APIConstants.AuthDebit_CashbackCreditURL, APIBody.getAuthDebitRequestBody(map));
	}

	@Given("^nine point six$")
	public void nine_point_six() throws Throwable {
		Map<Object, Object> map = new LinkedHashMap<Object, Object>();
		map.put("channel", ECOM);
		map.put("transactionAmount", Rs_20);
		map.put("productCode", "null");
		map.put("amount", Rs_20);
		map.put("merchantName", MaathavanHome);
		map.put("proxyCardNo", Card18);
		map.put("mcc", MCC_5021);
		map.put("network", RUPAY);
		map.put("merchantID", "null");
		map.put("terminalID", "null");
		map.put("institutionCode", "458519");
		map.put("retrievalRefNo", APIConstants.retrivalRefNo);
		map.put("txnRefNo", APIConstants.txnRefNo);
		response = api.post(APIConstants.AuthReversal_CashbackDebitURL,
				APIBody.getAuthReversalRequestBodyWithDuplicateTxnRefNo(map));
	}

	@Given("^nine point seven$")
	public void nine_point_seven() throws Throwable {
		Map<Object, Object> map = new LinkedHashMap<Object, Object>();
		map.put("merchantName", MaathavanHome);
		map.put("terminalID", "Terminal1");
		map.put("mcc", MCC_3001);
		map.put("entityId", EntityId12);
		map.put("proxyCardNo", Card18);
		map.put("network", RUPAY);
		map.put("channel", ECOM);
		map.put("merchantId", "12322155");
		map.put("amount", Rs_20);
		map.put("transactionAmount", Rs_20);
		map.put("billingAmount", Rs_20);
		APIConstants.retrivalRefNo = RandomStringUtils.randomNumeric(10);
		map.put("retrievalRefNo", APIConstants.retrivalRefNo);
		response = api.post(APIConstants.AuthDebit_CashbackCreditURL, APIBody.getAuthDebitRequestBody(map));
	}

	@Given("^nine point eight$")
	public void nine_point_eight() throws Throwable {
		Map<Object, Object> map = new LinkedHashMap<Object, Object>();
		map.put("channel", ECOM);
		map.put("transactionAmount", Rs_20);
		map.put("productCode", "null");
		map.put("amount", Rs_20);
		map.put("merchantName", MaathavanHome);
		map.put("proxyCardNo", Card18);
		map.put("mcc", MCC_3001);
		map.put("network", RUPAY);
		map.put("merchantID", "12322155");
		map.put("terminalID", "null");
		map.put("institutionCode", "458519");
		map.put("retrievalRefNo", APIConstants.retrivalRefNo);
		map.put("txnRefNo", APIConstants.txnRefNo);
		response = api.post(APIConstants.AuthReversal_CashbackDebitURL,
				APIBody.getAuthReversalRequestBodyWithDuplicateTxnRefNo(map));
	}

	@Given("^nine point nine$")
	public void nine_point_nine() throws Throwable {
		Map<Object, Object> map = new LinkedHashMap<Object, Object>();
		map.put("entityId", EntityId12);
		map.put("proxyCardNo", Card18);
		map.put("rrn", APIConstants.retrivalRefNo);
		map.put("transactionAmount", Rs_20);
		map.put("amount", Rs_20);
		map.put("merchantID", "null");
		map.put("merchantName", MaathavanHome);
		map.put("transactionType", FUNDPOST_CREDIT);
		map.put("terminalID", "null");
		map.put("mcc", MCC_3001);
		map.put("network", RUPAY);
		map.put("channel", FUND_POST);
		map.put("originalRrn", APIConstants.retrivalRefNo);
		map.put("txnRefNo", APIConstants.txnRefNo);
		response = api.post(APIConstants.AuthCredit_CashbackRefundURL,
				APIBody.getAuthCreditRequestBodyWithDuplicateTxnRefNo(map));
	}

	@Given("^nine point ten$")
	public void nine_point_ten() throws Throwable {
		Map<Object, Object> map = new LinkedHashMap<Object, Object>();
		map.put("merchantName", MaathavanHome);
		map.put("terminalID", "null");
		map.put("mcc", "null");
		map.put("entityId", EntityId17);
		map.put("proxyCardNo", Card26);
		map.put("network", RUPAY);
		map.put("channel", ECOM);
		map.put("merchantId", "null");
		map.put("amount", Rs_20);
		map.put("transactionAmount", Rs_20);
		map.put("billingAmount", Rs_20);
		APIConstants.retrivalRefNo = RandomStringUtils.randomNumeric(10);
		map.put("retrievalRefNo", APIConstants.retrivalRefNo);
		response = api.post(APIConstants.AuthDebit_CashbackCreditURL, APIBody.getAuthDebitRequestBody(map));
	}

	@Given("^nine point eleven$")
	public void nine_point_eleven() throws Throwable {
		Map<Object, Object> map = new LinkedHashMap<Object, Object>();
		map.put("merchantName", MaathavanHome);
		map.put("terminalID", "null");
		map.put("mcc", "null");
		map.put("entityId", EntityId16);
		map.put("proxyCardNo", Card23);
		map.put("network", RUPAY);
		map.put("channel", ECOM);
		map.put("merchantId", "null");
		map.put("amount", Rs_20);
		map.put("transactionAmount", Rs_20);
		map.put("billingAmount", Rs_20);
		APIConstants.retrivalRefNo = RandomStringUtils.randomNumeric(10);
		map.put("retrievalRefNo", APIConstants.retrivalRefNo);
		response = api.post(APIConstants.AuthDebit_CashbackCreditURL, APIBody.getAuthDebitRequestBody(map));
	}

	@Given("^nine point eleven2$")
	public void nine_point_eleven2() throws Throwable {
		Map<Object, Object> map = new LinkedHashMap<Object, Object>();
		map.put("merchantName", MaathavanHome);
		map.put("terminalID", "null");
		map.put("mcc", "null");
		map.put("entityId", EntityId16);
		map.put("proxyCardNo", Card23);
		map.put("network", RUPAY);
		map.put("channel", ECOM);
		map.put("merchantId", "null");
		map.put("amount", Rs_20);
		map.put("transactionAmount", Rs_20);
		map.put("billingAmount", Rs_20);
//		APIConstants.retrivalRefNo = RandomStringUtils.randomNumeric(10);
		map.put("retrievalRefNo", APIConstants.retrivalRefNo);
		map.put("txnRefNo", APIConstants.txnRefNo);
		response = api.post(APIConstants.AuthDebit_CashbackCreditURL,
				APIBody.getAuthDebitRequestBodyWithDuplicateTxnRefNo(map));
	}

	@Given("^nine point twelve$")
	public void nine_point_twelve() throws Throwable {
		Map<Object, Object> map = new LinkedHashMap<Object, Object>();
		map.put("merchantName", MaathavanHome);
		map.put("terminalID", "null");
		map.put("mcc", MCC_3222);
		map.put("entityId", EntityId16);
		map.put("proxyCardNo", Card24);
		map.put("network", RUPAY);
		map.put("channel", ECOM);
		map.put("merchantId", "null");
		map.put("amount", Rs_20);
		map.put("transactionAmount", Rs_20);
		map.put("billingAmount", Rs_20);
		APIConstants.retrivalRefNo = RandomStringUtils.randomNumeric(10);
		map.put("retrievalRefNo", APIConstants.retrivalRefNo);
		response = api.post(APIConstants.AuthDebit_CashbackCreditURL, APIBody.getAuthDebitRequestBody(map));
	}

	@Given("^nine point thirteen success$")
	public void nine_point_thirteen_success() throws Throwable {
		Map<Object, Object> map = new LinkedHashMap<Object, Object>();
		map.put("merchantName", MaathavanHome);
		map.put("terminalID", "null");
		map.put("mcc", "null");
		map.put("entityId", EntityId16);
		map.put("proxyCardNo", Card25);
		map.put("network", RUPAY);
		map.put("channel", CONTACTLESS);
		map.put("merchantId", "null");
		map.put("amount", Rs_2);
		map.put("transactionAmount", Rs_2);
		map.put("billingAmount", Rs_2);
		APIConstants.retrivalRefNo = RandomStringUtils.randomNumeric(10);
		map.put("retrievalRefNo", APIConstants.retrivalRefNo);
		response = api.post(APIConstants.AuthDebit_CashbackCreditURL, APIBody.getAuthDebitRequestBody(map));
	}

	@Given("^nine point thirteen$")
	public void nine_point_thirteen() throws Throwable {
		Map<Object, Object> map = new LinkedHashMap<Object, Object>();
		map.put("merchantName", MaathavanHome);
		map.put("terminalID", "null");
		map.put("mcc", "null");
		map.put("entityId", EntityId16);
		map.put("proxyCardNo", Card25);
		map.put("network", RUPAY);
		map.put("channel", CONTACTLESS);
		map.put("merchantId", "null");
		map.put("amount", Rs_10);
		map.put("transactionAmount", Rs_10);
		map.put("billingAmount", Rs_10);
		APIConstants.retrivalRefNo = RandomStringUtils.randomNumeric(10);
		map.put("retrievalRefNo", APIConstants.retrivalRefNo);
		response = api.post(APIConstants.AuthDebit_CashbackCreditURL, APIBody.getAuthDebitRequestBody(map));
	}

	@Given("^nine point fourteen$")
	public void nine_point_fourteen() throws Throwable {
		Map<Object, Object> map = new LinkedHashMap<Object, Object>();
		map.put("merchantName", MaathavanHome);
		map.put("terminalID", "null");
		map.put("mcc", MCC_3221);
		map.put("entityId", EntityId16);
		map.put("proxyCardNo", Card29);
		map.put("network", RUPAY);
		map.put("channel", ECOM);
		map.put("merchantId", "null");
		map.put("amount", Rs_20);
		map.put("transactionAmount", Rs_20);
		map.put("billingAmount", Rs_20);
		APIConstants.retrivalRefNo = RandomStringUtils.randomNumeric(10);
		map.put("retrievalRefNo", APIConstants.retrivalRefNo);
		response = api.post(APIConstants.AuthDebit_CashbackCreditURL, APIBody.getAuthDebitRequestBody(map));
	}

	@Given("^nine point fifteen$")
	public void nine_point_fifteen() throws Throwable {
		Map<Object, Object> map = new LinkedHashMap<Object, Object>();
		map.put("merchantName", MaathavanHome);
		map.put("terminalID", "011");
		map.put("mcc", MCC_3001);
		map.put("entityId", EntityId16);
		map.put("proxyCardNo", Card24);
		map.put("network", RUPAY);
		map.put("channel", ECOM);
		map.put("merchantId", "1223334");
		map.put("amount", Rs_2);
		map.put("transactionAmount", Rs_2);
		map.put("billingAmount", Rs_2);
		APIConstants.retrivalRefNo = RandomStringUtils.randomNumeric(10);
		map.put("retrievalRefNo", APIConstants.retrivalRefNo);
		response = api.post(APIConstants.AuthDebit_CashbackCreditURL, APIBody.getAuthDebitRequestBody(map));
	}

	@Given("^nine point sixteen$")
	public void nine_point_sixteen() throws Throwable {
		Map<Object, Object> map = new LinkedHashMap<Object, Object>();
		map.put("merchantName", MaathavanHome);
		map.put("terminalID", "Terminal 1");
		map.put("mcc", MCC_3221);
		map.put("entityId", EntityId16);
		map.put("proxyCardNo", Card29);
		map.put("network", RUPAY);
		map.put("channel", ECOM);
		map.put("merchantId", "12322155");
		map.put("amount", Rs_20);
		map.put("transactionAmount", Rs_20);
		map.put("billingAmount", Rs_20);
		APIConstants.retrivalRefNo = RandomStringUtils.randomNumeric(10);
		map.put("retrievalRefNo", APIConstants.retrivalRefNo);
		response = api.post(APIConstants.AuthDebit_CashbackCreditURL, APIBody.getAuthDebitRequestBody(map));
	}

	@Given("^nine point seventeen$")
	public void nine_point_seventeen() throws Throwable {
		Map<Object, Object> map = new LinkedHashMap<Object, Object>();
		map.put("merchantName", MaathavanHome);
		map.put("terminalID", "Terminal 1");
		map.put("mcc", MCC_3222);
		map.put("entityId", EntityId16);
		map.put("proxyCardNo", Card24);
		map.put("network", RUPAY);
		map.put("channel", ECOM);
		map.put("merchantId", "12322155");
		map.put("amount", Rs_20);
		map.put("transactionAmount", Rs_20);
		map.put("billingAmount", Rs_20);
		map.put("retrievalRefNo", APIConstants.retrivalRefNo);
		APIConstants.retrivalRefNo = RandomStringUtils.randomNumeric(10);
		response = api.post(APIConstants.AuthDebit_CashbackCreditURL, APIBody.getAuthDebitRequestBody(map));
	}

	@Given("^nine point eighteen$")
	public void nine_point_eighteen() throws Throwable {
		Map<Object, Object> map = new LinkedHashMap<Object, Object>();
		map.put("merchantName", MaathavanHome);
		map.put("terminalID", "null");
		map.put("mcc", MCC_3001);
		map.put("entityId", EntityId16);
		map.put("proxyCardNo", Card24);
		map.put("network", RUPAY);
		map.put("channel", POS);
		map.put("merchantId", "null");
		map.put("amount", Rs_2);
		map.put("transactionAmount", Rs_2);
		map.put("billingAmount", Rs_2);
		APIConstants.retrivalRefNo = RandomStringUtils.randomNumeric(10);
		map.put("retrievalRefNo", APIConstants.retrivalRefNo);
		response = api.post(APIConstants.AuthDebit_CashbackCreditURL, APIBody.getAuthDebitRequestBody(map));
	}

	@Given("^nine point nineteen$")
	public void nine_point_nineteen() throws Throwable {
		Map<Object, Object> map = new LinkedHashMap<Object, Object>();
		map.put("merchantName", MaathavanHome);
		map.put("terminalID", "null");
		map.put("mcc", "null");
		map.put("entityId", EntityId16);
		map.put("proxyCardNo", Card23);
		map.put("network", RUPAY);
		map.put("channel", ECOM);
		map.put("merchantId", "null");
		map.put("amount", Rs_201);
		map.put("transactionAmount", Rs_201);
		map.put("billingAmount", Rs_201);
		APIConstants.retrivalRefNo = RandomStringUtils.randomNumeric(10);
		map.put("retrievalRefNo", APIConstants.retrivalRefNo);
		response = api.post(APIConstants.AuthDebit_CashbackCreditURL, APIBody.getAuthDebitRequestBody(map));
	}

	@Given("^nine point twenty second call$")
	public void nine_point_twenty_second_call() throws Throwable {
		Map<Object, Object> map = new LinkedHashMap<Object, Object>();
		map.put("merchantName", MaathavanHome);
		map.put("terminalID", "null");
		map.put("mcc", "null");
		map.put("entityId", EntityId16);
		map.put("proxyCardNo", Card23);
		map.put("network", RUPAY);
		map.put("channel", ECOM);
		map.put("merchantId", "null");
		map.put("amount", Rs_20);
		map.put("transactionAmount", Rs_20);
		map.put("billingAmount", Rs_20);
		APIConstants.retrivalRefNo = RandomStringUtils.randomNumeric(10);
		map.put("retrievalRefNo", APIConstants.retrivalRefNo);
		response = api.post(APIConstants.AuthDebit_CashbackCreditURL, APIBody.getAuthDebitRequestBody(map));
	}

	@Given("^nine point twenty$")
	public void nine_point_twenty() throws Throwable {
		Map<Object, Object> map = new LinkedHashMap<Object, Object>();
		map.put("merchantName", MaathavanHome);
		map.put("terminalID", "null");
		map.put("mcc", MCC_3222);
		map.put("entityId", EntityId16);
		map.put("proxyCardNo", Card24);
		map.put("network", RUPAY);
		map.put("channel", ECOM);
		map.put("merchantId", "null");
		map.put("amount", Rs_20);
		map.put("transactionAmount", Rs_20);
		map.put("billingAmount", Rs_20);
		APIConstants.retrivalRefNo = RandomStringUtils.randomNumeric(10);
		map.put("retrievalRefNo", APIConstants.retrivalRefNo);
		response = api.post(APIConstants.AuthDebit_CashbackCreditURL, APIBody.getAuthDebitRequestBody(map));
	}

	@Given("^Auth check for Puased Crad$")
	public void Auth_check_for_Puased_Crad() throws Throwable {
		Map<Object, Object> map = new LinkedHashMap<Object, Object>();
		map.put("merchantName", MaathavanHome);
		map.put("terminalID", "null");
		map.put("mcc", "null");
		map.put("entityId", EntityId18);
		map.put("proxyCardNo", Card27);
		map.put("network", RUPAY);
		map.put("channel", ECOM);
		map.put("merchantId", "null");
		map.put("amount", Rs_20);
		map.put("transactionAmount", Rs_20);
		map.put("billingAmount", Rs_20);
		APIConstants.retrivalRefNo = RandomStringUtils.randomNumeric(10);
		map.put("retrievalRefNo", APIConstants.retrivalRefNo);
		response = api.post(APIConstants.AuthDebit_CashbackCreditURL, APIBody.getAuthDebitRequestBody(map));
	}

	@Given("^Transactions attempted more than Daily Count is not allowed ten point one$")
	public void transactions_attempted_more_than_Daily_Count_is_not_allowed_ten_point_one() throws Throwable {
		Map<Object, Object> map = new LinkedHashMap<Object, Object>();
		map.put("merchantName", MaathavanHome);
		map.put("terminalID", "null");
		map.put("mcc", MCC_3222);
		map.put("entityId", EntityId16);
		map.put("proxyCardNo", Card24);
		map.put("network", RUPAY);
		map.put("channel", ECOM);
		map.put("merchantId", "null");
		map.put("amount", Rs_20);
		map.put("transactionAmount", Rs_20);
		map.put("billingAmount", Rs_20);
		APIConstants.retrivalRefNo = RandomStringUtils.randomNumeric(10);
		map.put("retrievalRefNo", APIConstants.retrivalRefNo);
		response = api.post(APIConstants.AuthDebit_CashbackCreditURL, APIBody.getAuthDebitRequestBody(map));
	}

	@Given("^Transactions attempted more than Daily Count is not allowed TC ten point one point one$")
	public void transactions_attempted_more_than_Daily_Count_is_not_allowed_TC_ten_point_one_point_one()
			throws Throwable {
		Map<Object, Object> map = new LinkedHashMap<Object, Object>();
		map.put("merchantName", MaathavanHome);
		map.put("terminalID", "null");
		map.put("mcc", "null");
		map.put("entityId", EntityId16);
		map.put("proxyCardNo", Card23);
		map.put("network", RUPAY);
		map.put("channel", ECOM);
		map.put("merchantId", "null");
		map.put("amount", Rs_201);
		map.put("transactionAmount", Rs_201);
		map.put("billingAmount", Rs_201);
		APIConstants.retrivalRefNo = RandomStringUtils.randomNumeric(10);
		map.put("retrievalRefNo", APIConstants.retrivalRefNo);
		response = api.post(APIConstants.AuthDebit_CashbackCreditURL, APIBody.getAuthDebitRequestBody(map));
	}

	@Given("^Transaction is not allowed if Card is Blocked TC ten point two$")
	public void transaction_is_not_allowed_if_Card_is_Blocked_TC_ten_point_two() throws Throwable {
		Map<Object, Object> map = new LinkedHashMap<Object, Object>();
		map.put("merchantName", MaathavanHome);
		map.put("terminalID", "null");
		map.put("mcc", "null");
		map.put("entityId", EntityId18);
		map.put("proxyCardNo", Card28);
		map.put("network", RUPAY);
		map.put("channel", ECOM);
		map.put("merchantId", "null");
		map.put("amount", Rs_20);
		map.put("transactionAmount", Rs_20);
		map.put("billingAmount", Rs_20);
		APIConstants.retrivalRefNo = RandomStringUtils.randomNumeric(10);
		map.put("retrievalRefNo", APIConstants.retrivalRefNo);
		response = api.post(APIConstants.AuthDebit_CashbackCreditURL, APIBody.getAuthDebitRequestBody(map));
	}

	@Given("^Transaction is not allowed if Entity and ProxyNo Mismatch TC ten point three$")
	public void transaction_is_not_allowed_if_Entity_and_ProxyNo_Mismatch_TC_ten_point_three() throws Throwable {
		Map<Object, Object> map = new LinkedHashMap<Object, Object>();
		map.put("merchantName", MaathavanHome);
		map.put("terminalID", "null");
		map.put("mcc", MCC_3222);
		map.put("entityId", EntityId16);
		map.put("proxyCardNo", Card5);
		map.put("network", RUPAY);
		map.put("channel", ECOM);
		map.put("merchantId", "null");
		map.put("amount", Rs_20);
		map.put("transactionAmount", Rs_20);
		map.put("billingAmount", Rs_20);
		APIConstants.retrivalRefNo = RandomStringUtils.randomNumeric(10);
		map.put("retrievalRefNo", APIConstants.retrivalRefNo);
		response = api.post(APIConstants.AuthDebit_CashbackCreditURL, APIBody.getAuthDebitRequestBody(map));
	}

	@Given("^Proxy Card with Default Pocket TC ten point four$")
	public void proxy_Card_with_Default_Pocket_TC_ten_point_four() throws Throwable {
		Map<Object, Object> map = new LinkedHashMap<Object, Object>();
		map.put("merchantName", MaathavanHome);
		map.put("terminalID", "null");
		map.put("mcc", MCC_3222);
		map.put("entityId", EntityId16);
		map.put("proxyCardNo", Card24);
		map.put("network", RUPAY);
		map.put("channel", ECOM);
		map.put("merchantId", "null");
		map.put("amount", Rs_20);
		map.put("transactionAmount", Rs_20);
		map.put("billingAmount", Rs_20);
		APIConstants.retrivalRefNo = RandomStringUtils.randomNumeric(10);
		map.put("retrievalRefNo", APIConstants.retrivalRefNo);
		response = api.post(APIConstants.AuthDebit_CashbackCreditURL, APIBody.getAuthDebitRequestBody(map));
	}

	@Given("^Transaction is not allowed if txnRefNo\\. Is already used by other Transaction ten point four point one$")
	public void transaction_is_not_allowed_if_txnRefNo_Is_already_used_by_other_Transaction_ten_point_four_point_one()
			throws Throwable {
		Map<Object, Object> map = new LinkedHashMap<Object, Object>();
		map.put("merchantName", MaathavanHome);
		map.put("terminalID", "null");
		map.put("mcc", MCC_3222);
		map.put("entityId", EntityId16);
		map.put("proxyCardNo", Card23);
		map.put("network", RUPAY);
		map.put("channel", ECOM);
		map.put("merchantId", "null");
		map.put("amount", Rs_10);
		map.put("transactionAmount", Rs_10);
		map.put("billingAmount", Rs_10);
		map.put("txnRefNo", APIConstants.txnRefNo);
		APIConstants.retrivalRefNo = RandomStringUtils.randomNumeric(10);
		map.put("retrievalRefNo", APIConstants.retrivalRefNo);
		response = api.post(APIConstants.AuthDebit_CashbackCreditURL,
				APIBody.getAuthDebitRequestBodyWithDuplicateTxnRefNo(map));
	}

	@Given("^ten point five$")
	public void ten_point_five() throws Throwable {
		Map<Object, Object> map = new LinkedHashMap<Object, Object>();
		map.put("merchantName", MaathavanHome);
		map.put("terminalID", "null");
		map.put("mcc", "null");
		map.put("entityId", EntityId16);
		map.put("proxyCardNo", Card23);
		map.put("network", RUPAY);
		map.put("channel", CONTACTLESS);
		map.put("merchantId", "null");
		map.put("amount", Rs_10);
		map.put("transactionAmount", Rs_10);
		map.put("billingAmount", Rs_10);
		map.put("txnRefNo", APIConstants.txnRefNo);
		APIConstants.retrivalRefNo = RandomStringUtils.randomNumeric(10);
		map.put("retrievalRefNo", APIConstants.retrivalRefNo);
		response = api.post(APIConstants.AuthDebit_CashbackCreditURL, APIBody.getAuthDebitRequestBody(map));

	}

	@Given("^Proxy Card with Default Pocket ten point five point one$")
	public void proxy_Card_with_Default_Pocket_ten_point_five_point_one() throws Throwable {
		Map<Object, Object> map = new LinkedHashMap<Object, Object>();
		map.put("merchantName", MaathavanHome);
		map.put("terminalID", "null");
		map.put("mcc", "null");
		map.put("entityId", EntityId16);
		map.put("proxyCardNo", Card23);
		map.put("network", RUPAY);
		map.put("channel", ECOM);
		map.put("merchantId", "null");
		map.put("amount", Rs_20);
		map.put("transactionAmount", Rs_20);
		map.put("billingAmount", Rs_20);
		map.put("txnRefNo", APIConstants.txnRefNo);
		APIConstants.retrivalRefNo = RandomStringUtils.randomNumeric(10);
		map.put("retrievalRefNo", APIConstants.retrivalRefNo);
		response = api.post(APIConstants.AuthDebit_CashbackCreditURL,
				APIBody.getAuthDebitRequestBodyWithDuplicateTxnRefNo(map));

	}

	@Given("^ten point five point two$")
	public void ten_point_five_point_two() throws Throwable {
		Map<Object, Object> map = new LinkedHashMap<Object, Object>();
		map.put("merchantName", MaathavanHome);
		map.put("terminalID", "null");
		map.put("mcc", "null");
		map.put("entityId", EntityId16);
		map.put("proxyCardNo", Card24);
		map.put("network", RUPAY);
		map.put("channel", ECOM);
		map.put("merchantId", "null");
		map.put("amount", Rs_20);
		map.put("transactionAmount", Rs_20);
		map.put("billingAmount", Rs_20);
		map.put("txnRefNo", APIConstants.txnRefNo);
		APIConstants.retrivalRefNo = RandomStringUtils.randomNumeric(10);
		map.put("retrievalRefNo", APIConstants.retrivalRefNo);
		response = api.post(APIConstants.AuthDebit_CashbackCreditURL,
				APIBody.getAuthDebitRequestBodyWithDuplicateTxnRefNo(map));
	}

	@Given("^Proxy Card having Pocket MEDICAL and DEFAULT TC ten point six$")
	public void proxy_Card_having_Pocket_MEDICAL_and_DEFAULT_TC_ten_point_six() throws Throwable {
		Map<Object, Object> map = new LinkedHashMap<Object, Object>();
		map.put("merchantName", MaathavanHome);
		map.put("terminalID", "null");
		map.put("mcc", "null");
		map.put("entityId", EntityId16);
		map.put("proxyCardNo", Card24);
		map.put("network", RUPAY);
		map.put("channel", ECOM);
		map.put("merchantId", "null");
		map.put("amount", Rs_2);
		map.put("transactionAmount", Rs_2);
		map.put("billingAmount", Rs_2);
		APIConstants.retrivalRefNo = RandomStringUtils.randomNumeric(10);
		map.put("retrievalRefNo", APIConstants.retrivalRefNo);
		response = api.post(APIConstants.AuthDebit_CashbackCreditURL, APIBody.getAuthDebitRequestBody(map));
	}

	@Given("^Proxy Card having Pocket MEDICAL and DEFAULT ten point six point one$")
	public void proxy_Card_having_Pocket_MEDICAL_and_DEFAULT_ten_point_six_point_one() throws Throwable {
		Map<Object, Object> map = new LinkedHashMap<Object, Object>();
		map.put("merchantName", MaathavanHome);
		map.put("terminalID", "null");
		map.put("mcc", MCC_3222);
		map.put("entityId", EntityId16);
		map.put("proxyCardNo", Card24);
		map.put("network", RUPAY);
		map.put("channel", ECOM);
		map.put("merchantId", "null");
		map.put("amount", Rs_2);
		map.put("transactionAmount", Rs_2);
		map.put("billingAmount", Rs_2);
		APIConstants.retrivalRefNo = RandomStringUtils.randomNumeric(10);
		map.put("retrievalRefNo", APIConstants.retrivalRefNo);
		response = api.post(APIConstants.AuthDebit_CashbackCreditURL, APIBody.getAuthDebitRequestBody(map));
	}

	@Given("^Transaction can be reversed for Approved Debit TC ten point seven$")
	public void transaction_can_be_reversed_for_Approved_Debit_TC_ten_point_seven() throws Throwable {

		Map<Object, Object> map = new LinkedHashMap<Object, Object>();
		map.put("channel", ECOM);
		map.put("transactionAmount", Rs_20);
		map.put("productCode", "null");
		map.put("amount", Rs_20);
		map.put("merchantName", SARAVANAN_TESTING_CITY_NAME_IN);
		map.put("txnRefNo", APIConstants.txnRefNo);
		map.put("proxyCardNo", Card24);
		map.put("mcc", "null");
		map.put("network", RUPAY);
		map.put("merchantID", "null");
		map.put("terminalID", "null");
		map.put("institutionCode", "458519");
		APIConstants.retrivalRefNo = RandomStringUtils.randomNumeric(10);
		map.put("retrievalRefNo", APIConstants.retrivalRefNo);
		response = api.post(APIConstants.AuthReversal_CashbackDebitURL, APIBody.getAuthReversalRequestBody(map));
	}

	@Given("^Transaction can be reversed for Approved Debit TC ten point eight$")
	public void transaction_can_be_reversed_for_Approved_Debit_TC_ten_point_eight() throws Throwable {
		Map<Object, Object> map = new LinkedHashMap<Object, Object>();
		map.put("channel", ECOM);
		map.put("transactionAmount", Rs_18);
		map.put("productCode", "null");
		map.put("amount", Rs_18);
		map.put("merchantName", MaathavanHome);
		map.put("txnRefNo", APIConstants.txnRefNo);
		map.put("proxyCardNo", Card24);
		map.put("mcc", "null");
		map.put("network", RUPAY);
		map.put("merchantID", "null");
		map.put("terminalID", "null");
		map.put("institutionCode", "458519");
		// APIConstants.retrivalRefNo = RandomStringUtils.randomNumeric(10);
		map.put("retrievalRefNo", APIConstants.retrivalRefNo);
		response = api.post(APIConstants.AuthReversal_CashbackDebitURL,
				APIBody.getAuthReversalRequestBodyWithDuplicateTxnRefNo(map));
	}

	@Given("^Transaction can be reversed for Approved Debit TC ten point nine$")
	public void transaction_can_be_reversed_for_Approved_Debit_TC_ten_point_nine() throws Throwable {
		Map<Object, Object> map = new LinkedHashMap<Object, Object>();
		map.put("channel", ECOM);
		map.put("transactionAmount", Rs_20);
		map.put("productCode", "null");
		map.put("amount", Rs_20);
		map.put("merchantName", MaathavanHome);
		map.put("proxyCardNo", Card2);
		map.put("mcc", "null");
		map.put("network", RUPAY);
		map.put("merchantID", "null");
		map.put("terminalID", "null");
		map.put("institutionCode", "458519");
		map.put("retrievalRefNo", APIConstants.retrivalRefNo);
		map.put("txnRefNo", APIConstants.txnRefNo);
		response = api.post(APIConstants.AuthReversal_CashbackDebitURL,
				APIBody.getAuthReversalRequestBodyWithDuplicateTxnRefNo(map));
	}

	@Given("^Auth Reversal Transaction can be reversed for Approved Debit TC ten point ten$")
	public void auth_Reversal_Transaction_can_be_reversed_for_Approved_Debit_TC_ten_point_ten() throws Throwable {
		Map<Object, Object> map = new LinkedHashMap<Object, Object>();
		map.put("channel", ECOM);
		map.put("transactionAmount", Rs_20);
		map.put("productCode", "null");
		map.put("amount", Rs_20);
		map.put("merchantName", MaathavanHome);
		map.put("txnRefNo", APIConstants.txnRefNo);
		map.put("proxyCardNo", Card23);
		map.put("mcc", "null");
		map.put("network", RUPAY);
		map.put("merchantID", "null");
		map.put("terminalID", "null");
		map.put("institutionCode", "458519");
		map.put("retrievalRefNo", APIConstants.retrivalRefNo);
		map.put("txnRefNo", APIConstants.txnRefNo);
		response = api.post(APIConstants.AuthReversal_CashbackDebitURL,
				APIBody.getAuthReversalRequestBodyWithDuplicateTxnRefNo(map));
	}

	@Given("^Reject the request approved debit ten point ten point one$")
	public void reject_the_request_approved_debit_ten_point_ten_point_one() throws Throwable {
		Map<Object, Object> map = new LinkedHashMap<Object, Object>();
		map.put("channel", ECOM);
		map.put("transactionAmount", Rs_20);
		map.put("productCode", "null");
		map.put("amount", Rs_20);
		map.put("merchantName", MaathavanHome);
		map.put("txnRefNo", APIConstants.txnRefNo);
		map.put("proxyCardNo", Card24);
		map.put("mcc", "null");
		map.put("network", RUPAY);
		map.put("merchantID", "null");
		map.put("terminalID", "null");
		map.put("institutionCode", "458519");
		map.put("retrievalRefNo", APIConstants.retrivalRefNo);
		map.put("txnRefNo", APIConstants.txnRefNo);
		response = api.post(APIConstants.AuthReversal_CashbackDebitURL,
				APIBody.getAuthReversalRequestBodyWithDuplicateTxnRefNo(map));
	}

	@Given("^Transaction can be reversed for Approved Debit and MarkUp TC ten point eleven$")
	public void transaction_can_be_reversed_for_Approved_Debit_and_MarkUp_TC_ten_point_eleven() throws Throwable {
		Map<Object, Object> map = new LinkedHashMap<Object, Object>();
		map.put("channel", ECOM);
		map.put("transactionAmount", Rs_20);
		map.put("productCode", "null");
		map.put("amount", Rs_20);
		map.put("merchantName", MaathavanHome);
		map.put("txnRefNo", APIConstants.txnRefNo);
		map.put("proxyCardNo", Card29);
		map.put("mcc", MCC_3221);
		map.put("network", RUPAY);
		map.put("merchantID", "null");
		map.put("terminalID", "null");
		map.put("institutionCode", "458519");
		map.put("retrievalRefNo", APIConstants.retrivalRefNo);
		response = api.post(APIConstants.AuthReversal_CashbackDebitURL,
				APIBody.getAuthReversalRequestBodyWithDuplicateTxnRefNo(map));
	}

	@Given("^Auth reversal reject the request for Debit and Markup ten point eleven point one$")
	public void auth_reversal_reject_the_request_for_Debit_and_Markup_ten_point_eleven_point_one() throws Throwable {
		Map<Object, Object> map = new LinkedHashMap<Object, Object>();
		map.put("channel", ECOM);
		map.put("transactionAmount", Rs_20);
		map.put("productCode", "null");
		map.put("amount", Rs_20);
		map.put("merchantName", MaathavanHome);
		map.put("txnRefNo", APIConstants.txnRefNo);
		map.put("proxyCardNo", Card25);
		map.put("mcc", MCC_3221);
		map.put("network", RUPAY);
		map.put("merchantID", "null");
		map.put("terminalID", "null");
		map.put("institutionCode", "458519");
		map.put("retrievalRefNo", APIConstants.retrivalRefNo);
		response = api.post(APIConstants.AuthReversal_CashbackDebitURL,
				APIBody.getAuthReversalRequestBodyWithDuplicateTxnRefNo(map));
	}

	@Given("^Transaction can be reversed for Approved Debit and Cashback TC ten point twelve$")
	public void transaction_can_be_reversed_for_Approved_Debit_and_Cashback_TC_ten_point_twelve() throws Throwable {
		Map<Object, Object> map = new LinkedHashMap<Object, Object>();
		map.put("channel", ECOM);
		map.put("transactionAmount", Rs_20);
		map.put("productCode", "null");
		map.put("amount", Rs_20);
		map.put("merchantName", MaathavanHome);
		map.put("txnRefNo", APIConstants.txnRefNo);
		map.put("proxyCardNo", Card24);
		map.put("mcc", MCC_3222);
		map.put("network", RUPAY);
		map.put("merchantID", "12322155");
		map.put("terminalID", "Terminal 1");
		map.put("institutionCode", "458519");
		map.put("retrievalRefNo", APIConstants.retrivalRefNo);
		map.put("txnRefNo", APIConstants.txnRefNo);
		response = api.post(APIConstants.AuthReversal_CashbackDebitURL,
				APIBody.getAuthReversalRequestBodyWithDuplicateTxnRefNo(map));
	}

	@Given("^Transaction can be reversed for Approved Debit Cashback and MarkUp TC ten point thirteen$")
	public void transaction_can_be_reversed_for_Approved_Debit_Cashback_and_MarkUp_TC_ten_point_thirteen()
			throws Throwable {
		Map<Object, Object> map = new LinkedHashMap<Object, Object>();
		map.put("channel", ECOM);
		map.put("transactionAmount", Rs_20);
		map.put("productCode", "null");
		map.put("amount", Rs_20);
		map.put("merchantName", MaathavanHome);
		map.put("txnRefNo", APIConstants.txnRefNo);
		map.put("proxyCardNo", Card29);
		map.put("mcc", MCC_3221);
		map.put("network", RUPAY);
		map.put("merchantID", "12322155");
		map.put("terminalID", "Terminal 1");
		map.put("institutionCode", "458519");
		map.put("retrievalRefNo", APIConstants.retrivalRefNo);
		response = api.post(APIConstants.AuthReversal_CashbackDebitURL,
				APIBody.getAuthReversalRequestBodyWithDuplicateTxnRefNo(map));
	}

	@Given("^TxnAmount can be credited back to respective ProxyCard or EntityID TC ten point fourteen$")
	public void txnamount_can_be_credited_back_to_respective_ProxyCard_or_EntityID_TC_ten_point_fourteen()
			throws Throwable {
		Map<Object, Object> map = new LinkedHashMap<Object, Object>();
		map.put("entityId", EntityId16);
		map.put("proxyCardNo", Card23);
		map.put("rrn", APIConstants.retrivalRefNo);
		map.put("transactionAmount", Rs_20);
		map.put("amount", Rs_20);
		map.put("merchantID", "null");
		map.put("merchantName", MaathavanHome);
		map.put("transactionType", FUNDPOST_CREDIT);
		map.put("terminalID", "null");
		map.put("mcc", "null");
		map.put("network", RUPAY);
		// map.put("crdr", "C");
		map.put("channel", FUND_POST);
		map.put("originalRrn", APIConstants.retrivalRefNo);
		map.put("txnRefNo", APIConstants.txnRefNo);
		response = api.post(APIConstants.AuthCredit_CashbackRefundURL, APIBody.getAuthCreditRequestBody(map));
	}

	@Given("^Reject the request for already partial reversed ten point fourteen point one$")
	public void reject_the_request_for_already_partial_reversed_ten_point_fourteen_point_one() throws Throwable {
		Map<Object, Object> map = new LinkedHashMap<Object, Object>();
		map.put("entityId", EntityId16);
		map.put("proxyCardNo", Card23);
		map.put("rrn", APIConstants.retrivalRefNo);
		map.put("transactionAmount", Rs_2);
		map.put("amount", Rs_2);
		map.put("merchantID", "null");
		map.put("merchantName", MaathavanHome);
		map.put("transactionType", FUNDPOST_CREDIT);
		map.put("terminalID", "null");
		map.put("mcc", "null");
		map.put("network", RUPAY);
		// map.put("crdr", "C");
		map.put("channel", FUND_POST);
		map.put("originalRrn", APIConstants.retrivalRefNo);
		map.put("txnRefNo", APIConstants.txnRefNo);
		response = api.post(APIConstants.AuthCredit_CashbackRefundURL,
				APIBody.getAuthCreditRequestBodyWithDuplicateTxnRefNo(map));
	}

	@Given("^FUNDPOST_CREDIT declines if AuthDebit is already Reversed TC ten point fifteen$")
	public void fundpost_credit_declines_if_AuthDebit_is_already_Reversed_TC_ten_point_fifteen() throws Throwable {
		Map<Object, Object> map = new LinkedHashMap<Object, Object>();
		map.put("entityId", EntityId16);
		map.put("proxyCardNo", Card23);
		APIConstants.retrivalRefNo = RandomStringUtils.randomNumeric(10);
		map.put("rrn", APIConstants.retrivalRefNo);
		map.put("transactionAmount", Rs_20);
		map.put("amount", Rs_20);
		map.put("merchantID", "null");
		map.put("merchantName", MaathavanHome);
		map.put("transactionType", FUNDPOST_CREDIT);
		map.put("terminalID", "null");
		map.put("mcc", "null");
		map.put("network", RUPAY);
		map.put("channel", FUND_POST);
		map.put("originalRrn", APIConstants.retrivalRefNo);
//		map.put("txnRefNo", APIConstants.txnRefNo);
		response = api.post(APIConstants.AuthCredit_CashbackRefundURL, APIBody.getAuthCreditRequestBody(map));
	}

	@Given("^FUNDPOST_CREDIT declines if AuthDebit TxnAmount Mismatch TC ten point sixteen$")
	public void fundpost_credit_declines_if_AuthDebit_TxnAmount_Mismatch_TC_ten_point_sixteen() throws Throwable {
		Map<Object, Object> map = new LinkedHashMap<Object, Object>();
		map.put("entityId", EntityId16);
		map.put("proxyCardNo", Card24);
		map.put("rrn", APIConstants.retrivalRefNo);
		map.put("transactionAmount", Rs_50);
		map.put("amount", Rs_50);
		map.put("merchantID", "null");
		map.put("merchantName", MaathavanHome);
		map.put("transactionType", FUNDPOST_CREDIT);
		map.put("terminalID", "null");
		map.put("mcc", MCC_3222);
		map.put("network", RUPAY);
		// map.put("crdr", "C");
		map.put("channel", FUND_POST);
		map.put("originalRrn", APIConstants.retrivalRefNo);
		map.put("txnRefNo", APIConstants.txnRefNo);
		response = api.post(APIConstants.AuthCredit_CashbackRefundURL,
				APIBody.getAuthCreditRequestBodyWithDuplicateTxnRefNo(map));
	}

	@Given("^FUNDPOST_CREDIT declines if ProxyCard used in AuthDebit Mismatch TC ten point seventeen$")
	public void fundpost_credit_declines_if_ProxyCard_used_in_AuthDebit_Mismatch_TC_ten_point_seventeen()
			throws Throwable {
		Map<Object, Object> map = new LinkedHashMap<Object, Object>();
		map.put("entityId", EntityId16);
		map.put("proxyCardNo", "12345678");
		map.put("rrn", APIConstants.retrivalRefNo);
		map.put("transactionAmount", Rs_20);
		map.put("amount", Rs_20);
		map.put("merchantID", "null");
		map.put("merchantName", MaathavanHome);
		map.put("transactionType", FUNDPOST_CREDIT);
		map.put("terminalID", "null");
		map.put("mcc", MCC_3222);
		map.put("network", RUPAY);
		// map.put("crdr", "C");
		map.put("channel", FUND_POST);
		map.put("originalRrn", APIConstants.retrivalRefNo);
		map.put("txnRefNo", APIConstants.txnRefNo);
		response = api.post(APIConstants.AuthCredit_CashbackRefundURL,
				APIBody.getAuthCreditRequestBodyWithDuplicateTxnRefNo(map));
	}

	@Given("^FUNDPOST_CREDIT declines if UserHashID used in Auth Debit Mismatch TC ten point eighteen$")
	public void fundpost_credit_declines_if_UserHashID_used_in_Auth_Debit_Mismatch_TC_ten_point_eighteen()
			throws Throwable {
		Map<Object, Object> map = new LinkedHashMap<Object, Object>();
		map.put("entityId", "f0c77686-e0df-447d-a0cc");
		map.put("proxyCardNo", Card24);
		map.put("rrn", APIConstants.retrivalRefNo);
		map.put("transactionAmount", Rs_50);
		map.put("amount", Rs_50);
		map.put("merchantID", "null");
		map.put("merchantName", MaathavanHome);
		map.put("transactionType", FUNDPOST_CREDIT);
		map.put("terminalID", "null");
		map.put("mcc", MCC_3222);
		map.put("network", RUPAY);
		// map.put("crdr", "C");
		map.put("channel", FUND_POST);
		map.put("originalRrn", APIConstants.retrivalRefNo);
		map.put("txnRefNo", APIConstants.txnRefNo);
		response = api.post(APIConstants.AuthCredit_CashbackRefundURL,
				APIBody.getAuthCreditRequestBodyWithDuplicateTxnRefNo(map));
	}

	@Given("^FUNDPOST_CREDIT declines if two Auth Debit has same RRN TC ten point nineteen$")
	public void fundpost_credit_declines_if_two_Auth_Debit_has_same_RRN_TC_ten_point_nineteen() throws Throwable {
		Map<Object, Object> map = new LinkedHashMap<Object, Object>();
		map.put("entityId", EntityId16);
		map.put("proxyCardNo", Card23);
		map.put("rrn", APIConstants.retrivalRefNo);
		map.put("transactionAmount", Rs_20);
		map.put("amount", Rs_20);
		map.put("merchantID", "null");
		map.put("merchantName", MaathavanHome);
		map.put("transactionType", FUNDPOST_CREDIT);
		map.put("terminalID", "null");
		map.put("mcc", "null");
		map.put("network", RUPAY);
		// map.put("crdr", "C");
		map.put("channel", FUND_POST);
		map.put("originalRrn", APIConstants.retrivalRefNo);
		map.put("txnRefNo", APIConstants.txnRefNo);
		response = api.post(APIConstants.AuthCredit_CashbackRefundURL,
				APIBody.getAuthCreditRequestBodyWithDuplicateTxnRefNo(map));
	}

	@Given("^Allow Fundpost_Credit for Card loaded with other pocket TC ten point twenty$")
	public void allow_Fundpost_Credit_for_Card_loaded_with_other_pocket_TC_ten_point_twenty() throws Throwable {
		Map<Object, Object> map = new LinkedHashMap<Object, Object>();
		map.put("entityId", EntityId16);
		map.put("proxyCardNo", Card29);
		map.put("rrn", APIConstants.retrivalRefNo);
		map.put("transactionAmount", Rs_20);
		map.put("amount", Rs_20);
		map.put("merchantID", "null");
		map.put("merchantName", MaathavanHome);
		map.put("transactionType", FUNDPOST_CREDIT);
		map.put("terminalID", "null");
		map.put("mcc", "null");
		map.put("network", RUPAY);
		// map.put("crdr", "C");
		map.put("channel", FUND_POST);
		map.put("originalRrn", APIConstants.retrivalRefNo);
		map.put("txnRefNo", APIConstants.txnRefNo);
		response = api.post(APIConstants.AuthCredit_CashbackRefundURL,
				APIBody.getAuthCreditRequestBodyWithDuplicateTxnRefNo(map));
	}

	@Given("^Test QA Env$")
	public void test_QA_Env() throws Throwable {
		response = api.post("http://52.183.134.181:8093/wallet-service/appuser/api/v1/kyc/remainingLimits",
				"{ \"mobileNumber\":\"9898976543\"}");
	}

	@Then("^user must be get description Contactless transaction cannot be greater than TransactionAmount$")
	public void user_must_be_get_description_Contactless_transaction_cannot_be_greater_than_TransactionAmount()
			throws Throwable {
		String desc = api.getDescription(response);
		System.out.println(response.getBody().asString());
		if (!desc.contains("Exceeds withdrawal amount limit | Contactless transaction cannot be greater than 5.0"))
			Assert.assertEquals(desc,
					"Exceeds withdrawal amount limit | Contactless transaction cannot be greater than 5.0");
		APIConstants.txnRefNo = response.getBody().path("txnRefNo").toString();
		APIConstants.txnRefNo1 = APIConstants.txnRefNo;
		// APIConstants.balance = String.valueOf(response.getBody().path("balance"));
	}
}