package org.ergoplatform.ergopay;

import com.fasterxml.jackson.annotation.JsonInclude;

import java.util.List;

import javax.annotation.Nullable;

/**
 * After signing is performed and the SignedTransaction data is obtained, the wallet can POST the
 * following data to the dApp using replyToUrl from the signing request (json format) if it is provided.
 */
public class ErgoPayReply {
    /**
     * submitted transaction id, used when {@link ErgoPayResponse#reducedTx} field was filled,
     * otherwise null
     */
    @Nullable
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String txId;
    /**
     * list of submitted transaction ids, filled when {@link ErgoPayResponse#reducedTxList} field
     * was filled, otherwise null
     */
    @Nullable
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public List<String> txIds;
}
