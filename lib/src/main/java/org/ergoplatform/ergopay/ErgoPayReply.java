package org.ergoplatform.ergopay;

/**
 * After signing is performed and the SignedTransaction data is obtained, the wallet can POST the
 * following data to the dApp using replyToUrl from the signing request (json format) if it is provided.
 */
public class ErgoPayReply {
    public String txId;
}
