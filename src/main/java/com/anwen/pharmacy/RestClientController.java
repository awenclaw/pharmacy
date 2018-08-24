package com.anwen.pharmacy;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.WebResource;
import com.sun.jersey.api.client.config.ClientConfig;
import com.sun.jersey.api.client.config.DefaultClientConfig;
import org.springframework.stereotype.Controller;

import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.UriBuilder;

@Controller
public class RestClientController {
    private WebResource service;
    private static final String URI="https://gturnquist-quoters.cfapps.io/api/random";

    public RestClientController(){
        ClientConfig clientConfig = new DefaultClientConfig();
        Client client = Client.create(clientConfig);
        service = client.resource(UriBuilder.fromUri(URI).build());
    }

    public String makeRequest(){
        return service.accept(MediaType.APPLICATION_JSON_TYPE).get(String.class);
    }

}
