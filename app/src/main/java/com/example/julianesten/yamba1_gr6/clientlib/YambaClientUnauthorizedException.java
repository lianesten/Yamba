
package com.example.julianesten.yamba1_gr6.clientlib;

import com.example.julianesten.yamba1_gr6.clientlib.*;

public class YambaClientUnauthorizedException extends com.example.julianesten.yamba1_gr6.clientlib.YambaClientException {

    private static final long serialVersionUID = -3792023133642909075L;

    public YambaClientUnauthorizedException(String detailMessage) {
        super(detailMessage);
    }

    public YambaClientUnauthorizedException(String detailMessage, Throwable throwable) {
        super(detailMessage, throwable);
    }
}
