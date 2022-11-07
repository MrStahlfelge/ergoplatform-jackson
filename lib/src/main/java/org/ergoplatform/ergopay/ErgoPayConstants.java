package org.ergoplatform.ergopay;

public class ErgoPayConstants {
    /**
     * Header field indicating support to process multiple reducedTx at once,
     * {@link ErgoPayResponse#reducedTxList} field can be used
     */
    public static final String HEADER_KEY_MULTIPLE_TX = "ErgoPay-MultipleTx";

    /**
     * Header field indicating support to process
     * {@link ErgoPayResponse#addresses} field
     */
    public static final String HEADER_KEY_MULTIPLE_ADDRESSES = "ErgoPay-CanSelectMultipleAddresses";

    public static final String HEADER_VALUE_SUPPORTED = "supported";



    public static final String URL_CONST_MULTIPLE_ADDRESSES_CHECK = "multiple_check";
    public static final String URL_CONST_MULTIPLE_ADDRESSES = "multiple";
}
