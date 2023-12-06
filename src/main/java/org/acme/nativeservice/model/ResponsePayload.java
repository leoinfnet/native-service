package org.acme.nativeservice.model;

import java.time.LocalDateTime;

public class ResponsePayload {
    public String message;
    public LocalDateTime dataHora;

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("ResponsePayload{");
        sb.append("message='").append(message).append('\'');
        sb.append(", dataHora=").append(dataHora);
        sb.append('}');
        return sb.toString();
    }
}
