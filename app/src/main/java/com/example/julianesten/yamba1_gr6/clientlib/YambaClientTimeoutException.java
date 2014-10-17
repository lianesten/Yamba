
package com.example.julianesten.yamba1_gr6.clientlib;

import com.example.julianesten.yamba1_gr6.clientlib.*;

public class YambaClientTimeoutException extends com.example.julianesten.yamba1_gr6.clientlib.YambaClientIOException {

    private static final long serialVersionUID = -3792023133642909075L;

    public YambaClientTimeoutException(String detailMessage) {
        super(detailMessage);
    }

    public YambaClientTimeoutException(String detailMessage, Throwable throwable) {
        super(detailMessage, throwable);
    }
}
