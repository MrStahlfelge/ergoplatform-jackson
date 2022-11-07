package org.ergoplatform.ergopay;

import com.fasterxml.jackson.annotation.JsonInclude;

import java.util.List;

import javax.annotation.Nullable;

/**
 * "ErgoPaySigningRequest" in EIP-0020 https://github.com/ergoplatform/eips/blob/master/eip-0020.md
 * From dApps view, it is a response to a http request of the wallet
 */
public class ErgoPayResponse {
    /**
     * The wallet application should show the message and display the messageSeverity in a suitable way, if provided.
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @Nullable
    public String message;

    /**
     * The wallet application should show the message and display the messageSeverity in a suitable way, if provided.
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @Nullable
    public Severity messageSeverity;

    /**
     * If address is provided by the dApp, the wallet can preselect the key the user needs to sign
     * the transaction.
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @Nullable
    public String address;

    /**
     * base64url encoded reduced transaction
     * <p>
     * example: response.reducedTx = Base64.getUrlEncoder().encodeToString(reducedTransaction)
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @Nullable
    public String reducedTx;

    /**
     * After signing is performed and the SignedTransaction data is obtained, the wallet can POST
     * the following data to the dApp using replyToUrl from the signing request (json format) if
     * it is provided. See {@link ErgoPayReply}.
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @Nullable
    public String replyTo;

    public enum Severity {NONE, INFORMATION, WARNING, ERROR}

    //********************************************************************************************//
    // EXTENSIONS                                                                                 //
    // The following fields are optional or alternative fields to fields above.                   //
    //********************************************************************************************//

    /**
     * List of addresses to sign the transaction with.
     * Do not set this field when {@link #address} field was set - you must not set both fields.
     * Also check if requesting wallet app supports the addresses field by checking
     * {@link ErgoPayConstants#HEADER_KEY_MULTIPLE_ADDRESSES} header field.
     * Note: Restrictions regarding multi-signing might apply from wallet to wallet.
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @Nullable
    public List<String> addresses;

    /**
     * List of base64url encoded reduced transactions.
     * Do not set this field when {@link #reducedTx} field was set - you must not set both fields.
     * Also check if requesting wallet app supports the txList field by checking
     * {@link ErgoPayConstants#HEADER_KEY_MULTIPLE_TX} header field.
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @Nullable
    public List<String> reducedTxList;
}
