package cn.liuyiyou.blog.controller;

import cn.liuyiyou.AbstractTest;
import org.junit.Test;
import org.mockserver.client.server.MockServerClient;
import org.mockserver.integration.ClientAndServer;
import org.mockserver.model.Body;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.annotation.Rollback;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.client.RestTemplate;

import static org.mockserver.model.HttpRequest.request;
import static org.mockserver.model.HttpResponse.response;

/**
 * @author: liuyiyou
 * @date: 2017/11/16
 * Time: 上午9:43
 */
@Rollback
@Transactional
public class MockServerTest extends AbstractTest {

    private ClientAndServer clientAndServer;

    @Autowired
    RestTemplate restTemplate;

    @Test
    public void simple() {
        mockServerWithExpectedRequest("/hello","true");
        Boolean result = restTemplate.getForObject("/hello",Boolean.TYPE);
        System.out.println(result);
    }


    private void mockServerWithExpectedRequest(String urlPath, String body) {
        if (!(clientAndServer != null && clientAndServer.isRunning())) {
            clientAndServer = ClientAndServer.startClientAndServer(9999);
        }
        MockServerClient mockServerClient = new MockServerClient("localhost", 9999);
        mockServerClient.when(
                request().withPath(urlPath)
                        .withMethod("POST"))
                .respond(response().withStatusCode(200).withBody(body
                ));

    }

    private void mockServerWithExpectedRequest(String host, int port, String urlPath, Body body) {
        MockServerClient mockServerClient = new MockServerClient(host, port);
        mockServerClient.when(
                request().withPath(urlPath)
                        .withMethod("POST"))
                .respond(response().withStatusCode(200).withBody(body
                ));

    }
}
