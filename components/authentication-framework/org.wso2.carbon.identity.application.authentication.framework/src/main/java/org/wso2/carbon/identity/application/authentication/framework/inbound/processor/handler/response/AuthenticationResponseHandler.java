package org.wso2.carbon.identity.application.authentication.framework.inbound.processor.handler.response;

import org.wso2.carbon.identity.application.authentication.framework.inbound.FrameworkHandlerStatus;
import org.wso2.carbon.identity.application.authentication.framework.inbound.IdentityMessageContext;

public class AuthenticationResponseHandler extends AbstractResponseHandler {
    @Override
    public FrameworkHandlerStatus doBuildErrorResponse(
            IdentityMessageContext identityMessageContext) {
        return null;
    }

    @Override
    public FrameworkHandlerStatus doBuildResponse(IdentityMessageContext identityMessageContext) {
        return null;
    }

    @Override
    public String getName() {
        return null;
    }
}
