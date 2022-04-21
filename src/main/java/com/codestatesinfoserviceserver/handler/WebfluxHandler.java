package com.codestatesinfoserviceserver.handler;

import com.codestatesinfoserviceserver.entity.Infos;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.client.WebClient;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;
import reactor.core.publisher.Mono;

public class WebfluxHandler {

    public static Mono<ServerResponse> getInfo(ServerRequest request) {
        String name = request.queryParam("name").orElse("User");
//        String name = request.queryParam("name").get(); 이거 안됌
        Mono<Infos> infoData = Mono.just(new Infos(name,"testJob"));

        return ServerResponse.ok().contentType(MediaType.APPLICATION_JSON).body(infoData, Infos.class);
//        return ServerResponse.ok().contentType(MediaType.APPLICATION_JSON).bodyValue(infoData); 이것도 안됨.
    }
}