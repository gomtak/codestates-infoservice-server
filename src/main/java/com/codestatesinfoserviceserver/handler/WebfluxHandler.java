package com.codestatesinfoserviceserver.handler;

import com.codestatesinfoserviceserver.entity.Infos;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;
import reactor.core.publisher.Mono;

@Component
public class WebfluxHandler {
    public Mono<ServerResponse> getInfo(ServerRequest request) {

        String name = request.queryParam("name").get();
        Infos message = new Infos("", "");

        return ServerResponse.ok().contentType(MediaType.APPLICATION_JSON).bodyValue(message);
    }
}