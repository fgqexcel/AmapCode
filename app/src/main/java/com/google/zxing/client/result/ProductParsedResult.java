package com.google.zxing.client.result;

public final class ProductParsedResult extends ParsedResult {
    private final String normalizedProductID;
    private final String productID;

    ProductParsedResult(String str) {
        this(str, str);
    }

    ProductParsedResult(String str, String str2) {
        super(ParsedResultType.PRODUCT);
        this.productID = str;
        this.normalizedProductID = str2;
    }

    public final String getProductID() {
        return this.productID;
    }

    public final String getNormalizedProductID() {
        return this.normalizedProductID;
    }

    public final String getDisplayResult() {
        return this.productID;
    }
}
