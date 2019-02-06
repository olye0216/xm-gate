package com.icthh.xm.gate.web.client;

import feign.RequestLine;

import java.net.URI;
import java.util.Map;

public interface HealthCheckClient {

    @RequestLine("GET /management/health")
    Map get(URI baseUrl);
}
