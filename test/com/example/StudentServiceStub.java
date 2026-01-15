package com.example;

import com.github.tomakehurst.wiremock.WireMockServer;
import com.github.tomakehurst.wiremock.client.WireMock;
import static com.github.tomakehurst.wiremock.core.WireMockConfiguration.options;

public class StudentServiceStub {
    private WireMockServer wireMockServer;

    public void startServer() {
        wireMockServer = new WireMockServer(options().port(5352));
        wireMockServer.start();
        WireMock.configureFor("localhost", 5352);
    }

    public void stopServer() {
        if (wireMockServer != null) {
            wireMockServer.stop();
            wireMockServer = null;
        }
    }

    public void stubForCheckGrade(int grade, boolean isValid) {
        WireMock.stubFor(WireMock.get(WireMock.urlPathEqualTo("/checkGrade"))
                .withQueryParam("grade", WireMock.equalTo(String.valueOf(grade)))
                .willReturn(WireMock.aResponse()
                        .withStatus(200)
                        .withHeader("Content-Type", "text/plain")
                        .withBody(String.valueOf(isValid))));
    }

    public void stubForEducate(int additionalValue) {
        WireMock.stubFor(WireMock.get(WireMock.urlPathEqualTo("/educate"))
                .willReturn(WireMock.aResponse()
                        .withStatus(200)
                        .withHeader("Content-Type", "text/plain")
                        .withBody(String.valueOf(additionalValue))));
    }
}
