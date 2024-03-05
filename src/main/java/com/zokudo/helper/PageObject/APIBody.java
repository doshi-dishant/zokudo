package com.zokudo.helper.PageObject;

import java.util.Map;

public class APIBody {
	static String apiBody = null;

	public static String getAuthDebitRequestBody(Map<Object, Object> map) {
		apiBody = "{\"fee\":\"0\",\"merchantName\":\"%s\",\"terminalID\":\"%s\",\"mcc\":\"%s\",\"traceNo\":\"900780\",\"institutionCode\":\"123456\",\"productCode\":null,\"retrievalRefNo\":\"%s\",\"systemTraceAuditNumber\":\"900780\",\"entityId\":\"%s\",\"proxyCardNo\":\"%s\",\"network\":\"%s\",\"channel\":\"%s\",\"transactionType\":null,\"transactionCurrency\":\"356\",\"merchantId\":\"%s\",\"tenant\":\"BUSINESS\",\"amount\":\"%s\",\"transactionAmount\":\"%s\",\"txnRefNo\":\"TEST"
				+ System.nanoTime()
				+ "\",\"billingCurrency\":356,\"billingAmount\":\"%s\",\"settlementCurrency\":null,\"settlementAmount\":null,\"dccCurrency\":null,\"dccAmount\":null,\"auth\":{\"tcc\":\"T\",\"entry\":\"ECOM SecureCode-AAV\",\"otp\":\"N\",\"cavv\":\"NA\",\"cvv1\":\"NA\",\"cvv2\":\"Y\",\"pin\":\"NA\",\"emv\":\"NA\"}}";
		return String.format(apiBody, map.get("merchantName"), map.get("terminalID"), map.get("mcc"),
				map.get("retrievalRefNo"), map.get("entityId"), map.get("proxyCardNo"), map.get("network"),
				map.get("channel"), map.get("merchantId"), map.get("amount"), map.get("transactionAmount"),
				map.get("billingAmount"));
	}

	public static String getAuthDebitRequestBodyWithDuplicateTxnRefNo(Map<Object, Object> map) {
		apiBody = "{\"fee\":\"0\",\"merchantName\":\"%s\",\"terminalID\":\"%s\",\"mcc\":\"%s\",\"traceNo\":\"900780\",\"institutionCode\":\"123456\",\"productCode\":null,\"retrievalRefNo\":\"%s\",\"systemTraceAuditNumber\":\"900780\",\"entityId\":\"%s\",\"proxyCardNo\":\"%s\",\"network\":\"%s\",\"channel\":\"%s\",\"transactionType\":null,\"transactionCurrency\":\"356\",\"merchantId\":\"%s\",\"tenant\":\"BUSINESS\",\"amount\":\"%s\",\"transactionAmount\":\"%s\",\"txnRefNo\":\"%s\",\"billingCurrency\":356,\"billingAmount\":\"%s\",\"settlementCurrency\":null,\"settlementAmount\":null,\"dccCurrency\":null,\"dccAmount\":null,\"auth\":{\"tcc\":\"T\",\"entry\":\"ECOM SecureCode-AAV\",\"otp\":\"N\",\"cavv\":\"NA\",\"cvv1\":\"NA\",\"cvv2\":\"Y\",\"pin\":\"NA\",\"emv\":\"NA\"}}";
		return String.format(apiBody, map.get("merchantName"), map.get("terminalID"), map.get("mcc"),
				map.get("retrievalRefNo"), map.get("entityId"), map.get("proxyCardNo"), map.get("network"),
				map.get("channel"), map.get("merchantId"), map.get("amount"), map.get("transactionAmount"),
				map.get("txnRefNo"), map.get("billingAmount"));
	}

	public static String getAuthReversalRequestBody(Map<Object, Object> map) {
		apiBody = "{\"channel\":\"%s\",\"transactionAmount\":\"%s\",\"productCode\":\"%s\",\"amount\":\"%s\",\"merchantName\":\"%s\",\"txnRefNo\":\""
				+ System.nanoTime()
				+ "\",\"proxyCardNo\":\"%s\",\"mcc\":\"%s\",\"traceNo\":\"900781\",\"senderName\":null,\"businessAppID\":null,\"network\":\"%s\",\"merchantID\":%s,\"curCode\":\"INR\",\"terminalID\":\"%s\",\"senderRefNo\":null,\"transactionCurrency\":\"356\",\"institutionCode\":\"%s\",\"retrievalRefNo\":\"%s\",\"senderAccountNo\":null,\"transactionType\":null,\"billingCurrency\":null,\"BillingAmount\":null,\"settlementCurrency\":null,\"settlementAmount\":null,\"dccCurrency\":null,\"dccAmount\":null}";
		return String.format(apiBody, map.get("channel"), map.get("transactionAmount"), map.get("productCode"),
				map.get("amount"), map.get("merchantName"), map.get("proxyCardNo"), map.get("mcc"), map.get("network"),
				map.get("merchantID"), map.get("terminalID"), map.get("institutionCode"), map.get("retrievalRefNo"));
	}

	public static String getAuthReversalRequestBodyWithDuplicateTxnRefNo(Map<Object, Object> map) {
		apiBody = "{\"channel\":\"%s\",\"transactionAmount\":\"%s\",\"productCode\":\"%s\",\"amount\":\"%s\",\"merchantName\":\"%s\",\"txnRefNo\":\"%s\",\"proxyCardNo\":\"%s\",\"mcc\":\"%s\",\"traceNo\":\"900781\",\"senderName\":null,\"businessAppID\":null,\"network\":\"%s\",\"merchantID\":%s,\"curCode\":\"INR\",\"terminalID\":\"%s\",\"senderRefNo\":null,\"transactionCurrency\":\"356\",\"institutionCode\":\"%s\",\"retrievalRefNo\":\"%s\",\"senderAccountNo\":null,\"transactionType\":null,\"billingCurrency\":null,\"BillingAmount\":null,\"settlementCurrency\":null,\"settlementAmount\":null,\"dccCurrency\":null,\"dccAmount\":null}";
		return String.format(apiBody, map.get("channel"), map.get("transactionAmount"), map.get("productCode"),
				map.get("amount"), map.get("merchantName"), map.get("txnRefNo"), map.get("proxyCardNo"), map.get("mcc"),
				map.get("network"), map.get("merchantID"), map.get("terminalID"), map.get("institutionCode"),
				map.get("retrievalRefNo"));
	}

	public static String getAuthCreditRequestBody(Map<Object, Object> map) {
		apiBody = "{\"entityId\":\"%s\",\"proxyCardNo\":\"%s\",\"rrn\":\"%s\",\"txnRefNo\":\"" + System.nanoTime()
				+ "\",\"transactionAmount\":\"%s\",\"amount\":\"%s\",\"traceNo\":\"123456\",\"merchantID\":\"%s\",\"merchantName\":\"%s\",\"transactionType\":\"%s\",\"senderAccountNo\":null,\"curCode\":null,\"terminalID\":\"%s\",\"mcc\":\"%s\",\"senderRefNo\":null,\"network\":\"%s\",\"senderName\":null,\"transactionCurrency\":null,\"institutionCode\":null,\"productCode\":null,\"channel\":\"%s\",\"billingCurrency\":null,\"BillingAmount\":null,\"settlementCurrency\":null,\"settlementAmount\":null,\"dccCurrency\":null,\"dccAmount\":null,\"crdr\":\"C\",\"originalRrn\":\"%s\",\"originalTxnDate\":\"18-Jul-2018\"}";
		return String.format(apiBody, map.get("entityId"), map.get("proxyCardNo"), map.get("rrn"),
				map.get("transactionAmount"), map.get("amount"), map.get("merchantID"), map.get("merchantName"),
				map.get("transactionType"), map.get("terminalID"), map.get("mcc"), map.get("network"),
				map.get("channel"), map.get("originalRrn"));
	}

	public static String getAuthCreditRequestBodyWithDuplicateTxnRefNo(Map<Object, Object> map) {
		apiBody = "{\"entityId\":\"%s\",\"proxyCardNo\":\"%s\",\"rrn\":\"%s\",\"txnRefNo\":\"%s\",\"transactionAmount\":\"%s\",\"amount\":\"%s\",\"traceNo\":\"123456\",\"merchantID\":\"%s\",\"merchantName\":\"%s\",\"transactionType\":\"%s\",\"senderAccountNo\":null,\"curCode\":null,\"terminalID\":\"%s\",\"mcc\":\"%s\",\"senderRefNo\":null,\"network\":\"%s\",\"senderName\":null,\"transactionCurrency\":null,\"institutionCode\":null,\"productCode\":null,\"channel\":\"%s\",\"billingCurrency\":null,\"BillingAmount\":null,\"settlementCurrency\":null,\"settlementAmount\":null,\"dccCurrency\":null,\"dccAmount\":null,\"crdr\":\"C\",\"originalRrn\":\"%s\",\"originalTxnDate\":\"18-Jul-2018\"}";
		return String.format(apiBody, map.get("entityId"), map.get("proxyCardNo"), map.get("rrn"), map.get("txnRefNo"),
				map.get("transactionAmount"), map.get("amount"), map.get("merchantID"), map.get("merchantName"),
				map.get("transactionType"), map.get("terminalID"), map.get("mcc"), map.get("network"),
				map.get("channel"), map.get("originalRrn"));
	}

}
