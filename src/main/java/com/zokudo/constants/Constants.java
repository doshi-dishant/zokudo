
package com.zokudo.constants;

import java.io.File;

import com.zokudo.framework.settings.ObjectRepo;

public class Constants {
	public static final int WAIT_EXPLICIT_SEC = ObjectRepo.reader.getExplicitWait();
	public static final int WAIT_POLLING_MS = ObjectRepo.reader.getPollingTime();
	public static final String URL = ObjectRepo.reader.getAdminURL().split("mss")[0];
	public static final int LOADER_WAIT = 90;
	public static final boolean IS_HEADLESS = Boolean.parseBoolean(System.getProperty("isHeadless"));
	public static final String DOWNLOAD_DIR = System.getProperty("user.dir") + File.separator + "downloads";
//	public static final String prefix = "Automation_Test_";
	public static final int BalanceLimit = 200000;
	public static int loginCounter = 0;
	public static String uploadPath = System.getProperty("user.dir") + "/src/main/resources/uploads/";
	public static String fileName = uploadPath + "Kits.xls";
	public static String GC_ProgramName = "ZOKUDOQASEPTGCDIST";
	public static String GC1_ProgramName = "ZOKUDOQADECDISTGC1";
	public static String GPR_ProgramName = "ZOKUDOQASEPTGPRDIST";
	public static String GC_Default_ProgramName = "ZOKUDOQASEPTGC";
	public static String GPR_Default_ProgramName = "ZOKUDOQASEPTGPR";
	public static String GC1_Default_ProgramName1 = "ZOKUDOQADECGC1";
	public static String clientName = "SEPTQASDTesting";
	public static String defaultClientName = "SEPTQADefTesting";
	public static String clientName1 = "RetailerDECGC1";
	public static String defaultClientName1 = "SEPTGC1Testing";
	public static String cardType = "Virtual";
	public static String defaultClientName2 = "QA Automation Test";
	public static String GC_Default_ProgramName1 = "ZOKUDODEVGC5";
	public static String defaultClientName3 = "DefaultDECGC1";
	public static String GC1_Default_ProgramName = "ZOKUDOQASEPTGC1";
	public static String gc1ClientName = "RetailerDECGC1";
	public static String lendingClientName = "LendPartner";
	public static String GPR_Lending_ProgramName = "ZOKUDOQAMAYLGPR";
	public static String GC_Lending_ProgramName = "ZOKUDOQAMAYLGC";
}