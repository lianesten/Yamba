
package com.example.julianesten.yamba1_gr6.clientlib;

public class YambaClientException extends Exception {

    private static final long serialVersionUID = 727445951100074291L;

    public YambaClientException(String detailMessage, Throwable throwable) {
        super(detailMessage, throwable);
    }

    public YambaClientException(String detailMessage) {
        super(detailMessage);
    }
}
