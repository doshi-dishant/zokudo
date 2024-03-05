
package com.zokudo.constants;

import java.util.ArrayList;
import java.util.List;

public class APIConstants {
//	public static String AuthDebit_CashbackCreditURL = "http://52.183.134.181:8089/wallet-service/api/v1/authorize";
//	public static String AuthReversal_CashbackDebitURL = "http://52.183.134.181:8089/wallet-service/api/v1/reversal";
//	public static String AuthCredit_CashbackRefundURL = "http://52.183.134.181:8089/wallet-service/api/v1/credit";
	public static String AuthDebit_CashbackCreditURL = "http://52.183.134.181:8093/wallet-service/api/v1/plaintext/authorize";
	public static String AuthReversal_CashbackDebitURL = "http://52.183.134.181:8093/wallet-service/api/v1/plaintext/reversal";
	public static String AuthCredit_CashbackRefundURL = "http://52.183.134.181:8093/wallet-service/api/v1/plaintext/credit";
//	public static String AuthDebit_CashbackCreditURL = "http://52.183.134.181:8093/wallet-service/api/v1/authorize";
//	public static String AuthReversal_CashbackDebitURL = "http://52.183.134.181:8093/wallet-service/api/v1/reversal";
//	public static String AuthCredit_CashbackRefundURL = "http://52.183.134.181:8093/wallet-service/api/v1/credit";
	public static String LimitURL = "http://52.183.134.181:8093/wallet-service/appuser/api/v1/kyc/remainingLimits";
	public static List<String> logs = new ArrayList<String>();
	public static String txnRefNo, balance, retrivalRefNo, rrn, txnRefNo1, retrivalRefNo1;
	public static String tempRetrivalRefNo;
}