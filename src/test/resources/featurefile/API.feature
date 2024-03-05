Feature: API Scenarios

  #TC-1.1
  Scenario: Auth Debit - 1.1
    Given user send post request for verify insufficient funds
    Then user must be get description Insufficient funds

  #TC-3.19
  Scenario: Auth Reversal - 3.19
    Given user send post request for auth reversal failed
    Then user must be get description Invalid Transaction

  #TC-3.20
  Scenario: Auth Credit - 3.20
    Given user send post request for verify insufficient funds
    Then user must be get description Insufficient funds
    Given user send post request for auth credit for auth debit failed
    Then user must be get description Transaction not found for originalRrn

  #TC-1.2
  Scenario: Auth Debit - 1.2
    Given user send post request for get balance of default pocket
    Then user must be get description Successful

  #TC-3.6
  Scenario: Auth Credit - 3.6
    Given user send post request for auth credit
    Then user must be get description credited
    Given user send post request for auth credit
    Then user must be get description Already partial reversed

  #TC-3.11
  Scenario: Auth Debit - 3.11
    Given user send post request for get balance of default pocket
    Then user must be get description Successful
    Given user send post request for get balance of default pocket with same rrn
    Then user must be get description Successful
    Given user send post request for auth credit for same rrn in 2 auth debit
    Then user must be get description Transaction not found for originalRrn

  #TC-4.1
  Scenario: Auth Credit - 4.1
    Given user send post request for get balance of default pocket
    Then user must be get description Successful
    Given user send post request for auth credit for rrn mismatch
    Then user must be get description Transaction not found for originalRrn

  #TC-4.3
  Scenario: Auth Credit And Auth Reversal - 4.3
    Given user send post request for get balance of default pocket
    Then user must be get description Successful
    Given user send post request for auth reversal for txn amount is greter than debit amount
    Then user must be get description Transaction amount is not matching with original transaction
    Given user send post request for auth credit for txn amount is greter than debit amount
    Then user must be get description Transaction not found for originalRrn

  #TC-4.4
  Scenario: Auth Reversal - 4.4
    Given user send post request for get balance of default pocket
    Then user must be get description Successful
    Given user send post request for auth reversal for txn amount is less than debit amount
    Then user must be get description Transaction amount is not matching with original transaction

  #TC-4.5
  Scenario: Auth Credit - 4.5
    Given user send post request for get balance of default pocket
    Then user must be get description Successful
    Given user send post request for auth credit for txn amount is equal to debit amount
    Then user must be get description credited

  #TC-4.8
  Scenario: Auth Credit - 4.8
    Given user send post request for get balance of default pocket
    Then user must be get description Successful
    Given user send post request for auth credit for same user hash id
    Then user must be get description Transaction not found for originalRrn

  #TC-1.3
  Scenario: Auth Debit - 1.3
    Given user send post request for get balance of other pocket
    Then user must be get description Successful

  #TC-4.6
  Scenario: Auth Reversal - 4.6
    Given user send post request for get balance of default pocket
    Then user must be get description Successful
    Given user send post request for get balance of other pocket
    Then user must be get description Successful
    Given user send post request for auth reversal for proxy card no is not same as original transaction proxy card no
    Then user must be get description Proxy Card No is not same as original transaction proxy Card No.

  #TC-4.7
  Scenario: Auth Credit - 4.7
    Given user send post request for get balance of default pocket
    Then user must be get description Successful
    Given user send post request for get balance of other pocket
    Then user must be get description Successful
    Given user send post request for auth credit for txn not found
    Then user must be get description Transaction not found for originalRrn

  #TC-3.12
  Scenario: Auth Credit - 3.12
    Given user send post request for auth credit for card loaded with other pocket
    Then user must be get description credited

  #TC-3.2
  Scenario: Auth Reversal - 3.2
    Given user send post request for get balance of other pocket
    Then user must be get description Successful
    Given user send post request for auth reversal already reversed
    Then user must be get description Successful
    Given user send post request for auth reversal already reversed
    Then user must be get description Already Reversed

  #TC-3.7
  Scenario: Auth Credit - 3.7
    Given user send post request for auth credit other pocket
    Then user must be get description Transaction not found for originalRrn

  #TC-1.4
  Scenario: Auth Debit - 1.4
    Given user send post request for verify CONTACTLESS transaction not allowed for GC
    Then user must be get description Contactless transaction cannot be greater than TransactionAmount
    Given user send post request for verify CONTACTLESS transaction not allowed for GC success
    Then user must be get description Successful

  #TC-1.5
  Scenario: Auth Debit - 1.5
    Given user send post request for get balance of pocket with markup
    Then user must be get description Successful

  #TC-3.13
  Scenario: Auth Credit - 3.13
    Given user send post request for auth credit for amount can be credited back entity having markup
    Then user must be get description credited

  #TC-3.3
  Scenario: Auth Reversal - 3.3
    Given user send post request for get balance of pocket with markup
    Then user must be get description Successful
    Given user send post request for auth reversal already reversed with markup
    Then user must be get description Successful
    Given user send post request for auth reversal already reversed with markup
    Then user must be get description Already Reversed

  #TC-1.6
  Scenario: Auth Debit - 1.6
    Given user send post request for verify blocked merchant
    Then user must be get description Merchant is blocked

  #TC-1.7
  Scenario: Auth Debit - 1.7
    Given user send post request for get cashback with offer at perticular MID and TID with markup
    Then user must be get description Successful

  #TC-3.15
  Scenario: Auth Credit - 3.15
    Given user send post request for auth credit for amount can be credited back entity having markup and cashback
    Then user must be get description credited

  #TC-3.5
  Scenario: Auth Reversal - 3.5
    Given user send post request for get cashback with offer at perticular MID and TID with markup
    Then user must be get description Successful
    Given user send post request for auth reversal offer at perticular MID and TID with markup
    Then user must be get description Successful

  #TC-1.8
  Scenario: Auth Debit - 1.8
    Given user send post request for get cashback with offer at perticular MID and TID
    Then user must be get description Successful

  #TC-3.14
  Scenario: Auth Credit - 3.14
    Given user send post request for auth credit for amount can be credited back entity having cashback
    Then user must be get description credited

  #TC-3.4
  Scenario: Auth Reversal - 3.4
    Given user send post request for get cashback with offer at perticular MID and TID
    Then user must be get description Successful
    Given user send post request for auth reversal offer at perticular MID and TID
    Then user must be get description Successful

  #TC-1.9
  Scenario: Auth Debit - 1.9
    Given user send post request for channel limit is disallowed
    Then user must be get description Channel Limit is Disallowed

  #TC-1.10
  Scenario: Auth Debit - 1.10
    Given user send post request for channel limit exceeded
    Then user must be get description Channel limit exceeded

  #TC-2.1
  #Scenario: Auth Debit - 2.1
    #Given user send post request for transaction less than daily limit
    #Then user must be get description Successful
    #Given user send post request for transaction more than daily limit
    #Then user must be get description Daily limit exceeded

  #TC-2.9
  Scenario: Auth Reversal - 2.9
    Given user send post request for auth reversal
    Then user must be get description Invalid Transaction

  #TC-2.2
  #Scenario: Auth Debit - 2.2
  #Given user send post request for transaction attemped less than daily count
  #Then user must be get description Successful
  #Given user send post request for transaction attemped more than daily count
  #Then user must be get description Daily limit exceeded

  #TC-2.3
  Scenario: Auth Debit - 2.3
    Given user send post request for puased card
    Then user must be get description Card not Active

  #TC-2.4
  Scenario: Auth Debit - 2.4
    Given user send post request for blocked card
    Then user must be get description Card not Active

  #TC-2.5
  Scenario: Auth Debit - 2.5
    Given user send post request for entity and proxy no
    Then user must be get description Card not found

  #TC-2.6
  Scenario: Auth Debit - 2.6
    Given user send post request for Successful
    Then user must be get description Successful
    Given user send post request for duplicate txnRefNo
    Then user must be get description Transaction Duplicate

  #TC-3.8
  Scenario: Auth Credit - 3.8
    Given user send post request for auth credit other pocket
    Then user must be get description Transaction not found for originalRrn

  #TC-3.9
  Scenario: Auth Credit - 3.9
    Given user send post request for Successful
    Then user must be get description Successful
    Given user send post request for auth credit card not found
    Then user must be get description Card not found

  #TC-3.10
  Scenario: Auth Credit - 3.10
    Given user send post request for Successful
    Then user must be get description Successful
    Given user send post request for auth credit entity details not found
    Then user must be get description Entity details not found

  #TC-2.10
  Scenario: Auth Reversal - 2.10
    Given user send post request for auth reversal invalid transaction amount
    Then user must be get description Invalid Transaction

  #TC-2.7
  Scenario: Auth Debit - 2.7
    Given user send post request for duplicate txnRefNo Successful
    Then user must be get description Successful

  #TC-2.8
  Scenario: Auth Debit - 2.8
    Given user send post request for balance check
    Then user must be get description Insufficient funds
    Given user send post request for Medical pocket
    Then user must be get description Successful

  #TC-3.1
  Scenario: Auth Reversal - 3.1
    Given user send post request for Medical pocket
    Then user must be get description Successful
    Given user send post request for auth reversal invalid transaction
    Then user must be get description Proxy Card No is not same as original transaction proxy Card No.

  #TC-3.16
  Scenario: Auth Debit - 3.16
    Given user send post request for markup check for default gc
    Then user must be get description Successful

  #TC-3.17
  Scenario: Auth Debit - 3.16
    Given user send post request for markup check for sd gc
    Then user must be get description Successful

  #TC-3.18
  Scenario: Auth Debit - 3.18
    Given user send post request for markup check for default GPR
    Then user must be get description Successful

  #TC-4.2
  Scenario: Auth Debit - 4.2
    Given user send post request for proxy card with mcc pocket limit 0
    Then user must be get description Insufficient funds - MCC Restriction

  #TC-4.9
  Scenario: Auth Debit - 4.9
    Given user send post request for no offer at perticular MID or TID
    Then user must be get description Successful

  #TC-4.10
  Scenario: Auth Reversal - 4.10
    Given user send post request for auth reversal more than one mcc
    Then user must be get description Successful

  #TC-4.11
  Scenario: Auth Debit - 4.11
    Given user send post request for offer at perticular MID or TID for default GC
    Then user must be get description Successful

  #TC-4.12
  Scenario: Auth Reversal - 4.12
    Given user send post request for auth reversal offer at perticular MID or TID for default GC
    Then user must be get description Successful

  #TC-4.13
  Scenario: Auth Credit - 4.13
    Given user send post request for offer at perticular MID or TID for default GC
    Then user must be get description Successful
    Given user send post request for auth credit offer at perticular MID or TID for default GC
    Then user must be get description credited

  #TC-4.14
  Scenario: Auth Debit - 4.14
    Given user send post request for proxy card without loaded pocket for default GPR
    Then user must be get description Insufficient funds

  #TC-4.15
  Scenario: Auth Debit - 4.15
    Given user send post request for proxy card with default pocket for default GPR
    Then user must be get description Successful

  #TC-4.16
  Scenario: Auth Debit - 4.16
    Given user send post request for proxy card with other pocket for default GPR
    Then user must be get description Successful

  #TC-4.17
  Scenario: Auth Debit - 4.17
    Given user send post request for markup check for default GPR
    Then user must be get description Successful

  #TC-4.18
  Scenario: Auth Debit - 4.18
    Given user send post request for blocked MID and TID for default GPR
    Then user must be get description Merchant is blocked

  #TC-4.19
  Scenario: Auth Debit - 4.19
    Given user send post request for cashback check for default GPR
    Then user must be get description Successful

  #TC-4.20
  Scenario: Auth Debit - 4.20
    Given user send post request for cashback check offer at perticular merchant and terminal for default GPR
    Then user must be get description Successful

  #TC-4.21
  Scenario: Auth Debit - 4.21
    Given user send post request for channel check for default GPR
    Then user must be get description Channel Limit is Disallowed

  #TC-4.22
  Scenario: Auth Debit - 4.22
    Given user send post request for channel check more than monthly limit for default GPR
    Then user must be get description Channel limit exceeded

  #TC-5.1
  #Scenario: Auth Debit - 5.1
    #Given user send post request for auth velocity check for default GPR
    #Then user must be get description Successful
    #Given user send post request for auth velocity check for default GPR
    #Then user must be get description Daily limit exceeded

  #TC-5.2
  #Scenario: Auth Debit - 5.2
  #Given user send post request for auth velocity check for default GPR
  #Then user must be get description Successful
  #Given user send post request for auth velocity check for default GPR for daily limit exceeded
  #Then user must be get description Daily limit exceeded
  #TC-5.3
  Scenario: Auth Debit - 5.3
    Given user send post request for auth check for puased crad for default GPR
    Then user must be get description Card not Active

  #TC-5.4
  Scenario: Auth Debit - 5.4
    Given user send post request for Auth check for Blocked Card for default GPR
    Then user must be get description Card not Active

  #TC-5.5
  Scenario: Auth Debit - 5.5
    Given user send post request for Auth Check for Entity for default GPR
    Then user must be get description Card not found

  #TC-5.6
  Scenario: Auth Debit - 5.6
    Given user send post request for Auth Check for Duplicate txnRefNo for default GPR
    Then user must be get description Successful
    Given user send post request for Auth Check for Duplicate txnRefNo for default GPR with same details
    Then user must be get description Transaction Duplicate

  #TC-5.7
  Scenario: Auth Debit - 5.7
    Given user send post request for Auth Check for Duplicate txnRefNo
    Then user must be get description Insufficient funds
    Given user send post request for Auth Check for Duplicate txnRefNo transaction 2
    Then user must be get description Successful
    Given user send post request for Auth Check for Duplicate txnRefNo transaction 2 with same details
    Then user must be get description Transaction Duplicate

  #TC-5.8
  Scenario: Auth Debit - 5.8
    Given user send post request for Auth Balance Check for default GPR
    Then user must be get description Insufficient funds
    Given user send post request for Auth Balance Check for default GPR success
    Then user must be get description Successful

  #TC-5.9
  Scenario: Auth Reversal - 5.9
    Given user send post request for auth velocity check for default GPR
    Then user must be get description Successful
    Given user send post request for auth reversal invalid transaction for default GPR
    Then user must be get description Invalid Transaction

  #TC-5.10
  Scenario: Auth Reversal - 5.10
    Given user send post request for Auth Check for Duplicate txnRefNo for default GPR
    Then user must be get description Successful
    Given user send post request for auth reversal invalid transaction for default GPR
    Then user must be get description Invalid Transaction

  #TC-5.11
  Scenario: Auth Reversal - 5.11
    Given user send post request for Auth Balance Check for default GPR
    Then user must be get description Insufficient funds
    Given user send post request for Auth Balance Check for default GPR success
    Then user must be get description Successful
    Given user send post request for auth reversal invalid transaction for default GPR with previous case 18 details
    Then user must be get description Proxy Card No is not same as original transaction proxy Card No.

  #TC-5.12
  Scenario: Auth Reversal - 5.12
    Given user send post request for proxy card with other pocket for default GPR
    Then user must be get description Successful
    Given user send post request for auth reversal successfull for default GPR
    Then user must be get description Successful
    Given user send post request for auth reversal successfull for default GPR
    Then user must be get description Already Reversed

  #TC-5.13
  Scenario: Auth Reversal - 5.13
    Given user send post request for markup check for default GPR
    Then user must be get description Successful
    Given user send post request for auth reversal successfull for default GPR with previous case 5 details
    Then user must be get description Successful
    Given user send post request for auth reversal successfull for default GPR with previous case 5 details
    Then user must be get description Already Reversed

  #TC-5.14
  Scenario: Auth Reversal - 5.14
    Given user send post request for cashback check offer at perticular merchant and terminal for default GPR
    Then user must be get description Successful
    Given user send post request for auth reversal successfull for default GPR with previous case 8 details
    Then user must be get description Successful

  #TC-5.15
  Scenario: Auth Reversal - 5.15
    Given user send post request for cashback check for default GPR
    Then user must be get description Successful
    Given user send post request for auth reversal successfull for default GPR with previous case 7 details
    Then user must be get description Successful

  #TC-5.16
  Scenario: Auth Credit - 5.16
    Given user send post request for proxy card with default pocket for default GPR
    Then user must be get description Successful
    Given user send post request for auth credit for GC
    Then user must be get description credited
    Given user send post request for auth credit for GC
    Then user must be get description Already partial reversed

  #TC-5.17
  Scenario: Auth Credit - 5.17
    Given user send post request for proxy card with other pocket for default GPR
    Then user must be get description Successful
    Given user send post request for auth reversal successfull for default GPR
    Then user must be get description Successful
    Given user send post request for auth credit for default GPR
    Then user must be get description Transaction not found for originalRrn

  #TC-5.18
  Scenario: Auth Credit - 5.18
    Given user send post request for Auth Check for Duplicate txnRefNo for default GPR
    Then user must be get description Successful
    Given user send post request for for auth credit transaction amount mis match for default GPR
    Then user must be get description Transaction not found for originalRrn

  #TC-5.19
  Scenario: Auth Credit - 5.19
    Given user send post request for for auth credit transaction card not found for default GPR
    Then user must be get description Card not found

  #TC-5.20
  Scenario: Auth Credit - 5.20
    Given user send post request for for auth credit transaction entity not found for default GPR
    Then user must be get description Entity details not found

  #6.1
  Scenario: 6.1 - Auth Credit
    Given user send post request for proxy card with other pocket for default GPR
    Then user must be get description Successful
    Given user send post request for proxy card with other pocket for default GPR same retrival
    Then user must be get description Successful
    Given fundpost credit declines one
    Then user must be get description Transaction not found for originalRrn

  #TC-6.2
  Scenario: 6.2 - Auth Credit
    Given user send post request for proxy card with other pocket for default GPR
    Then user must be get description Successful
    Given fundpost Credit for Card loaded with other pocket without entering MCC fundpost Credit
    Then user must be get description credited

  #TC-6.3
  Scenario: 6.3 - Auth Credit
    Given user send post request for markup check for 6.3
    Then user must be get description Successful
    Given partial Complete TxnAmount credited respective ProxyCard MarkUp
    Then user must be get description credited

  #TC-6.4
  Scenario: 6.4 - Auth Credit
    Given user send post request for cashback check offer at perticular merchant and terminal for default GPR
    Then user must be get description Successful
    Given partial Complete TxnAmount credited respective ProxyCard Cashback
    Then user must be get description credited

  #TC-6.5
  Scenario: 6.5 - Auth Credit
    Given user send post request for cashback check for default GPR
    Then user must be get description Successful
    Given partial Complete TxnAmount credited respective ProxyCard MarkUp and cashback
    Then user must be get description credited

  #TC-6.6
  Scenario: 6.6 - Auth Debit
    Given markup configured MCC 3017 one
    Then user must be get description Successful

  #TC-6.7
  Scenario: 6.7 - Auth Debit
    Given markup configured for ProgramPlan ProgramType Channel one
    Then user must be get description Successful

  #TC-6.8
  Scenario: 6.8 - Auth Reversal
    Given user send post request for proxy card without loaded pocket for default GPR
    Then user must be get description Insufficient funds
    Given AuthReversal should fail if Auth Debit is Failed six
    Then user must be get description Invalid Transaction

  #TC-6.9
  Scenario: 6.9 - Auth Reversal
    Given user send post request for proxy card without loaded pocket for default GPR
    Then user must be get description Insufficient funds
    Given fundpost credit should fail if Auth Debit is Failed
    Then user must be get description Transaction not found for originalRrn

  #TC-6.10
  Scenario: 6.10 - Auth Credit
    Given user send post request for proxy card with default pocket for default GPR
    Then user must be get description Successful
    Given fundpost credit declines if rrn mismatch with rrn used for Auth Debit
    Then user must be get description Transaction not found for originalRrn

  #TC-6.11
  Scenario: 6.11 - Auth Balance Check
    Given proxy_Card_with_MCC_PocketLimit_six
    Then user must be get description Insufficient funds - MCC Restriction

  #TC-6.12
  Scenario: 6.12 - AuthCredit & Auth Reversal
    Given user send post request for proxy card with default pocket for default GPR
    Then user must be get description Successful
    Given auth Reversal declines if trxAmout gtr DebitAmount
    Then user must be get description Transaction amount is not matching with original transaction
    Given auth credit declines if trxAmout gtr DebitAmount
    Then user must be get description Transaction not found for originalRrn

  #TC-6.13
  Scenario: 6.13 - Auth Reversal
    Given user send post request for proxy card with default pocket for default GPR
    Then user must be get description Successful
    Given Auth Reversal declines if txnAmount less than DebitAmount
    Then user must be get description Transaction amount is not matching with original transaction

  #TC-6.14
  Scenario: 6.14 - Auth Credit
    Given user send post request for proxy card with other pocket for default GPR
    Then user must be get description Successful
    Given auth Credit allows if trxAmount equals DebitAmount
    Then user must be get description credited

  #TC-6.15
  Scenario: 6.15 - Auth Reversal
    Given user send post request for proxy card with other pocket for default GPR
    Then user must be get description Successful
    Given user send post request for Auth Balance Check for default GPR success for 6.15
    Then user must be get description Successful
    Given auth Reversal do txn
    Then user must be get description Proxy Card No is not same as original transaction proxy Card No.

  #TC-6.16
  Scenario: 6.16 -  Auth Credit
    Given user send post request for proxy card with other pocket for default GPR
    Then user must be get description Successful
    Given user send post request for Auth Balance Check for default GPR success for 6.15
    Then user must be get description Successful
    Given fundpost_do_two_txn
    Then user must be get description Transaction not found for originalRrn

  #TC-6.17
  Scenario: 6.17 - Auth Balance Check
    Given Proxy Crad with other Pocket There is no offer at perticular In merchant Report BrandID updated as null six
    Then user must be get description Successful

  #TC-6.18
  Scenario: 6.18 - Auth Reversal
    Given proxy Card with other Pocket There is a offer at perticular in merchant Report BrandID 19
    Then user must be get description Successful
    Given If Debit deducted reversal will credit to respective pocket only irrespective of mcc in the reversal MCC
    Then user must be get description Successful

  #TC-6.19
  Scenario: 6.19 - Auth CashBack Check
    Given proxy Card with other Pocket There is a offer at perticular in merchant Report BrandID 19
    Then user must be get description Successful

  #TC-6.20
  Scenario: 6.20 - Auth Reversal
    Given proxy Card with other Pocket There is a offer at perticular in merchant Report BrandID 19
    Then user must be get description Successful
    Given in merchant Report BrandID 21
    Then user must be get description credited

  #TC-6.21
  Scenario: 6.21 - AuthCredit
    Given proxy Card with other Pocket There is a offer at perticular in merchant Report BrandID 19
    Then user must be get description Successful
    Given in merchant Report BrandID 21
    Then user must be get description credited

  #TC-7.1
  Scenario: 7.1 - Auth Balance Check
    Given Proxy Card Without LoadedPocket
    Then user must be get description Insufficient funds

  #TC-7.2
  Scenario: 7.2 - Auth Balance Check
    Given Proxy Card with Default Pocket TC seven point two
    Then user must be get description Successful

  #TC-7.3
  Scenario: 7.3 - Auth Balance Check
    Given Proxy Crad with other Pocket TC seven point three
    Then user must be get description Successful

  #TC-7.4
  Scenario: 7.4 - Auth MarkUp Check
    Given Markup configured for ProgramPlan ProgramType Channel and MCC
    Then user must be get description Successful

  #TC-7.5
  Scenario: 7.5 - Auth Check for Block MID & TID
    Given TID seven point five
    Then user must be get description Merchant is blocked

  #TC-7.6
  Scenario: 7.6 - Auth CashBack Check
    Given Offer at perticular Merchant and Terminal and MarkUp for MCC
    Then user must be get description Successful

  #TC-7.7
  Scenario: 7.7 - Auth CashBack Check
    Given Offer at perticular Merchant and Terminal seven point seven
    Then user must be get description Successful

  #TC-7.8
  Scenario: 7.8 - Auth Channel Check
    Given Transaction is not allowed If channel is disabled by Customer using APP
    Then user must be get description Channel Limit is Disallowed

  #TC-7.9
  Scenario: 7.9 - Auth Channel Check
    Given Transaction more than Monthly Channel Limit SET by customer using APP is not allowed
    Then user must be get description Channel limit exceeded

  #TC-7.10
  #Scenario: 7.10 - Auth Velocity Check
    #Given Transaction more than Wallet Daily Limit Set at Admin say 200 is not allowed
    #Then user must be get description Successful
    #Given Transaction more than Wallet Daily Limit Set at Admin say 200 is not allowed seven point ten second
    #Then user must be get description Daily limit exceeded

  #TC-7.11 skipped as per excel
  #TC-7.12
  Scenario: 7.12 - Auth check for Puased Crad
    Given Transaction is not allowed if Card is Puased
    Then user must be get description Card not Active

  #TC-7.13
  Scenario: 7.13 - Auth check for Blocked Card
    Given Transaction is not allowed if Card is Blocked
    Then user must be get description Card not Active

  #TC-7.14
  Scenario: 7.14 - Auth Check for Entity&ProxyNo.
    Given Transaction is not allowed if Entity and ProxyNo Mismatch
    Then user must be get description Card not found

  #TC-7.15
  Scenario: 7.15 - Auth Check for Duplicate txnRefNo.
    Given Proxy Card with Default Pocket with seven point fifteen
    Then user must be get description Successful
    Given Transaction is not allowed if txnRefNo is already used by other Transaction
    Then user must be get description Transaction Duplicate

  #TC-7.16
  Scenario: 7.16 - Auth Check for Duplicate txnRefNo.
    Given Proxy Card Without LoadedPocket seven point sixteen
    Then user must be get description Insufficient funds
    Given Proxy Card with Default Pocket seven point sixteen
    Then user must be get description Successful
    Given third seven point sixteen
    Then user must be get description Transaction Duplicate

  #TC-7.17
  Scenario: 7.17 - Auth Balance Check
    Given Proxy Card having Pocket MEDICAL DEFAULT
    Then user must be get description Insufficient funds
    Given Proxy Card having Pocket MEDICAL and DEFAULT two
    Then user must be get description Successful

  #TC-7.18
  Scenario: 7.18 - Auth Reversal
    Given Transaction can be reversed for Approved Debit seven point eighteen
    Then user must be get description Invalid Transaction

  #TC-7.19
  Scenario: 7.19 - Auth Reversal
    Given Transaction can be reversed for Approved Debit seven point ninteen
    Then user must be get description Invalid Transaction

  #TC-7.20
  Scenario: 7.20 - Auth Reversal
    Given Proxy Card with Default Pocket TC seven point two
    Then user must be get description Successful
    Given Transaction can be reversed for Approved Debit seven point twenty
    Then user must be get description Proxy Card No is not same as original transaction proxy Card No.

  #TC-8.2
  Scenario: 8.2 - Auth Reversal
    Given Markup configured for ProgramPlan ProgramType Channel and MCC
    Then user must be get description Successful
    Given Transaction can be reversed for Approved Debit MarkUp eight point two
    Then user must be get description Successful
    Given Transaction can be reversed for Approved Debit MarkUp eight point two
    Then user must be get description Already Reversed

  #TC-8.3
  Scenario: 8.3 - Auth Reversal
    Given Offer at perticular Merchant and Terminal seven point seven
    Then user must be get description Successful
    Given Transaction can be reversed for Approved Debit Cashback
    Then user must be get description Successful

  #TC-8.4
  Scenario: 8.4 - Auth Reversal
    Given Offer at perticular Merchant and Terminal and MarkUp for MCC
    Then user must be get description Successful
    Given Offer at perticular Merchant and Terminal and MarkUp for MCC eight point four
    Then user must be get description Successful

  #TC-8.5
  Scenario: 8.5 - Auth Credit
    Given Proxy Crad with other Pocket TC seven point three
    Then user must be get description Successful
    Given Partial Complete TxnAmount can be credited back to respective ProxyCard EnityID eight point five
    Then user must be get description credited
    Given Partial Complete TxnAmount can be credited back to respective ProxyCard EnityID eight point five
    Then user must be get description Already partial reversed

  #TC-8.1
  Scenario: 8.1 - Auth Reversal
    Given Proxy Card with Default Pocket TC seven point two
    Then user must be get description Successful
    Given Transaction can be reversed for Approved Debit eight one
    Then user must be get description Successful
    Given Transaction can be reversed for Approved Debit eight one
    Then user must be get description Already Reversed

  #TC-8.6
  Scenario: 8.6 - Auth Credit
    Given FUNDPOST_CREDIT declines if AuthDebit is already Reversed eight point six
    Then user must be get description Transaction not found for originalRrn

  #TC-8.7
  Scenario: 8.7 - Auth Credit
    Given Proxy Card with Default Pocket TC seven point two
    Then user must be get description Successful
    Given FUNDPOST_CREDIT declines if AuthDebit TxnAmount Mismatch eight point seven
    Then user must be get description Transaction not found for originalRrn

  #TC-8.8
  Scenario: 8.8 - Auth Credit
    Given user send post request for Auth Check for Duplicate txnRefNo for default GPR
    Then user must be get description Successful
    Given FUNDPOST_CREDIT declines if ProxyCard used in AuthDebit Mismatch eight point eight
    Then user must be get description Card not found

  #TC-8.9
  Scenario: 8.9 - Auth Credit
    Given user send post request for Auth Check for Duplicate txnRefNo for default GPR
    Then user must be get description Successful
    Given FUNDPOST_CREDIT declines if UserHashID used in Auth Debit Mismatch eight point nine
    Then user must be get description Entity details not found

  #TC-8.10
  Scenario: 8.10 - Auth Credit
    Given Proxy Card with Default Pocket TC seven point two
    Then user must be get description Successful
    Given Proxy Card with Default Pocket TC seven point two 2nd run
    Then user must be get description Successful
    Given FUNDPOST_CREDIT declines if two Auth Debit has same RRN
    Then user must be get description Transaction not found for originalRrn

  #TC-8.11
  Scenario: 8.11 - Auth Credit
    Given Proxy Crad with other Pocket TC seven point three
    Then user must be get description Successful
    Given Allow Fundpost_Credit for Card loaded with other pocket eight point eleven
    Then user must be get description credited

  #TC-8.12
  Scenario: 8.12 - Auth Credit
    Given Markup configured for ProgramPlan ProgramType Channel and MCC
    Then user must be get description Successful
    Given PartialComplete TxnAmount can be credited back to respective ProxyCard EntityID having MarkUp eight twelve
    Then user must be get description credited

  #TC-8.13
  Scenario: 8.13 - Auth Credit
    Given Offer at perticular Merchant and Terminal seven point seven
    Then user must be get description Successful
    Given PartialComplete TxnAmount can be credited back to respective ProxyCard EntityID having CashBack eight point thirteen
    Then user must be get description credited

  #TC-8.14
  Scenario: 8.14 - Auth Credit
    Given Offer at perticular Merchant and Terminal and MarkUp for MCC
    Then user must be get description Successful
    Given PartialComplete TxnAmount can be credited back to respective ProxyCard EntityID having MarkUp CashBack eight point forteen
    Then user must be get description credited

  #TC-8.15
  Scenario: 8.15 -  Auth MarkUp Check
    Given No Markup Debited if Channel mismatch eight point fifteen
    Then user must be get description Successful

  #TC-8.16
  Scenario: 8.16 -  Auth MarkUp Check
    Given Proxy Card with Default Pocket TC seven point two
    Then user must be get description Successful
    Given No Markup Debited if ProgramPlan eight point sixteen
    Then user must be get description Successful

  #TC-8.17
  Scenario: 8.17 -  Auth Reversal
    Given Proxy Card Without LoadedPocket
    Then user must be get description Insufficient funds
    Given AuthReversal should fail if Auth Debit is Failed eight point seventeen
    Then user must be get description Invalid Transaction

  #TC-8.18
  Scenario: 8.18 -  FUNDPOST_CREDIT
    Given Proxy Card Without LoadedPocket
    Then user must be get description Insufficient funds
    Given FUNDPOST_CREDIT should fail if Auth Debit is Failed
    Then user must be get description Transaction not found for originalRrn

  #TC-8.19
  Scenario: 8.19 -  Auth Credit
    Given Proxy Crad with other Pocket TC seven point three
    Then user must be get description Successful
    Given FUNDPOST_CREDIT declines if rrn mismatch with rrn used for Auth Debit eight point ninteen
    Then user must be get description Transaction not found for originalRrn

  #TC-8.20
  Scenario: 8.20 - Auth Balance Check
    Given Proxy Card with MCC PocketLimi eight point twenty
    Then user must be get description Insufficient funds - MCC Restriction

  #TC-9.1
  Scenario: 9.1 - Auth Reversal
    Given Proxy Card with Default Pocket TC seven point two
    Then user must be get description Successful
    Given Auth Reversal declines if trxAmount grthan DebitAmount nine point one
    Then user must be get description Transaction amount is not matching with original transaction
    Given Auth Credit FUNDPOST declines if trxAmount grt than DebitAmount nine point one one
    Then user must be get description Transaction not found for originalRrn

  #TC-9.2
  Scenario: 9.2 - Auth Credit
    Given Proxy Card with Default Pocket TC seven point two
    Then user must be get description Successful
    Given Auth Credi FUNDPOST allows if trxAmount DebitAmount nine point two
    Then user must be get description credited

  #TC-9.3
  #Scenario: 9.3 - Auth Credit
  #TC-9.4
  Scenario: 9.4 - Auth Credit
    Given Proxy Card with Default Pocket TC seven point two
    Then user must be get description Successful
    Given Proxy Crad with other Pocket TC seven point three
    Then user must be get description Successful
    Given FUNDPOST_do__two_txn nine point four
    Then user must be get description Transaction not found for originalRrn

  #TC-9.5
  Scenario: 9.5 - Auth Balance Check
    Given Proxy Card with other Pocket there is no offer at perticular MIDTID in merchant Report BrandID updated as null nine point five
    Then user must be get description Successful

  #TC-9.6
  Scenario: 9.6 - Auth Reversal
    Given Proxy Crad with other Pocket TC seven point three
    Then user must be get description Successful
    Given nine point six
    Then user must be get description Successful

  #TC-9.7
  Scenario: 9.7 - Auth CashBack Check
    Given nine point seven
    Then user must be get description Successful

  #TC-9.8
  Scenario: 9.8 - Auth Reversal
    Given Proxy Crad with other Pocket TC seven point three
    Then user must be get description Successful
    Given nine point eight
    Then user must be get description credited

  #TC-9.9
  Scenario: 9.9 - AuthCredit
    Given Proxy Crad with other Pocket TC seven point three
    Then user must be get description Successful
    Given nine point nine
    Then user must be get description credited

  #TC-9.10
  Scenario: 9.10 - Auth Balance Check
    Given nine point ten
    Then user must be get description Insufficient funds

  #TC-9.11
  Scenario: 9.11 - Auth Balance Check
    Given nine point eleven
    Then user must be get description Successful

  #TC-9.12
  Scenario: 9.12 - Auth Balance Check
    Given nine point twelve
    Then user must be get description Successful

  #TC-9.13
  Scenario: 9.13 - Auth Channel Check
    Given nine point thirteen
    Then user must be get description Contactless transaction cannot be greater than TransactionAmount
    Given nine point thirteen success
    Then user must be get description Successful

  #TC-9.14
  Scenario: 9.14 - Auth MarkUp Check
    Given nine point fourteen
    Then user must be get description Successful

  #TC-9.15
  Scenario: 9.15 - Auth Check for Block MID & TID
    Given nine point fifteen
    Then user must be get description Merchant is blocked

  #TC-9.16
  Scenario: 9.16 - Auth CashBack Check
    Given nine point sixteen
    Then user must be get description Successful

  #TC-9.17
  Scenario: 9.17 - Auth CashBack Check
    Given nine point seventeen
    Then user must be get description Successful

  #TC-9.18
  Scenario: 9.18 - Auth Channel Check
  Given nine point eighteen
  Then user must be get description Channel Limit is Disallowed
  
  #TC-9.19
  Scenario: 9.19 - Auth Channel Check
    Given nine point nineteen
    Then user must be get description Channel Limit is Disallowed

  #TC-9.20
  #Scenario: 9.20 - Auth Velocity Check
  #Given nine point twenty
  #Then user must be get description Successful

  #TC-10.1
  #Scenario: 10.1 - Auth Velocity Check
  #Given Transactions attempted more than Daily Count is not allowed ten point one
  #Then user must be get description Successful
  #Given Transactions attempted more than Daily Count is not allowed TC ten point one point one
  #Then user must be get description Daily limit exceeded

  #TC-10.2
  Scenario: 10.2 - Auth check for Blocked Card
    Given Transaction is not allowed if Card is Blocked TC ten point two
    Then user must be get description Card not Active

  #TC-10.3
  Scenario: 10.3 - Auth Check for Entity&ProxyNo
    Given Transaction is not allowed if Entity and ProxyNo Mismatch TC ten point three
    Then user must be get description Card not found

  #TC-10.4
  Scenario: 10.4 - Auth Check for Duplicate txnRefNo
    Given Proxy Card with Default Pocket TC ten point four
    Then user must be get description Successful
    Given Transaction is not allowed if txnRefNo. Is already used by other Transaction ten point four point one
    Then user must be get description Transaction Duplicate

  #TC-10.5
  Scenario: 10.5 - Auth Check for Duplicate txnRefNo
    Given ten point five
    Then user must be get description Contactless transaction cannot be greater than TransactionAmount
    Given Proxy Card with Default Pocket ten point five point one
    Then user must be get description Successful
    Given ten point five point two
    Then user must be get description Transaction Duplicate
    Then user must be get description Successful

  #TC-10.6
  Scenario: 10.6 - Auth Balance Check
    Given Proxy Card having Pocket MEDICAL and DEFAULT TC ten point six
    Then user must be get description Insufficient funds
    Given Proxy Card having Pocket MEDICAL and DEFAULT ten point six point one
    Then user must be get description Successful

  #TC-10.7
  Scenario: 10.7 - Auth Reversal
    Given nine point twelve
    Then user must be get description Successful
    Given Transaction can be reversed for Approved Debit TC ten point seven
    Then user must be get description Invalid Transaction

  #TC-10.8
  Scenario: 10.8 - Auth Reversal
    Given nine point twelve
    Then user must be get description Successful
    Given Transaction can be reversed for Approved Debit TC ten point eight
    Then user must be get description Transaction amount is not matching with original transaction

  #TC-10.9
  Scenario: 10.9 - Auth Reversal
    Given nine point twelve
    Then user must be get description Successful
    Given Transaction can be reversed for Approved Debit TC ten point nine
    Then user must be get description Proxy Card No is not same as original transaction proxy Card No.

  #TC-10.10
  Scenario: 10.10 - Auth Reversal
    Given nine point eleven
    Then user must be get description Successful
    Given Auth Reversal Transaction can be reversed for Approved Debit TC ten point ten
    Then user must be get description Successful
    Given Reject the request approved debit ten point ten point one
    Then user must be get description Already Reversed

  #TC-10.11
  Scenario: 10.11 - Auth Reversal
    Given nine point fourteen
    Then user must be get description Successful
    Given Transaction can be reversed for Approved Debit and MarkUp TC ten point eleven
    Then user must be get description Successful
    Given Auth reversal reject the request for Debit and Markup ten point eleven point one
    Then user must be get description Already Reversed

  #TC-10.12
  Scenario: 10.12 - Auth Reversal
    Given nine point seventeen
    Then user must be get description Successful
    Given Transaction can be reversed for Approved Debit and Cashback TC ten point twelve
    Then user must be get description Successful

  #TC-10.13
  Scenario: 10.13 - Auth Reversal
    Given nine point sixteen
    Then user must be get description Successful
    Given Transaction can be reversed for Approved Debit Cashback and MarkUp TC ten point thirteen
    Then user must be get description Successful

  #TC-10.14
  Scenario: 10.14 - Auth Credit
    Given nine point eleven
    Then user must be get description Successful
    Given TxnAmount can be credited back to respective ProxyCard or EntityID TC ten point fourteen
    Then user must be get description credited
    Given Reject the request for already partial reversed ten point fourteen point one
    Then user must be get description Already partial reversed

  #TC-10.15
  Scenario: 10.15 - Auth Credit
    Given nine point eleven
    Then user must be get description Successful
    Given Auth Reversal Transaction can be reversed for Approved Debit TC ten point ten
    Then user must be get description Successful
    Given FUNDPOST_CREDIT declines if AuthDebit is already Reversed TC ten point fifteen
    Then user must be get description Transaction not found for originalRrn

  #TC-10.16
  Scenario: 10.16 - Auth Credit
    Given nine point twelve
    Then user must be get description Successful
    Given FUNDPOST_CREDIT declines if AuthDebit TxnAmount Mismatch TC ten point sixteen
    Then user must be get description Transaction not found for originalRrn

  #TC-10.17
  Scenario: 10.17 - Auth Credit
    Given nine point twelve
    Then user must be get description Successful
    Given FUNDPOST_CREDIT declines if ProxyCard used in AuthDebit Mismatch TC ten point seventeen
    Then user must be get description Card not found

  #TC-10.18
  Scenario: 10.18 - Auth Credit
    Given nine point twelve
    Then user must be get description Successful
    Given FUNDPOST_CREDIT declines if UserHashID used in Auth Debit Mismatch TC ten point eighteen
    Then user must be get description Entity details not found

  #TC-10.19
  Scenario: 10.19 - Auth Credit
    Given nine point eleven
    Then user must be get description Successful
    Given nine point eleven
    Then user must be get description Successful
    Given FUNDPOST_CREDIT declines if two Auth Debit has same RRN TC ten point nineteen
    Then user must be get description credited

  #TC-10.20
  Scenario: 10.20 - Auth Credit
    Given nine point fourteen
    Then user must be get description Successful
    Given Allow Fundpost_Credit for Card loaded with other pocket TC ten point twenty
    Then user must be get description credited
