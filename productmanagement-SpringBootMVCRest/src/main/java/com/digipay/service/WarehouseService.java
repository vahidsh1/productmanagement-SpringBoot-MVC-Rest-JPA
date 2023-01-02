package com.digipay.service;

import jakarta.ws.rs.client.Client;
import jakarta.ws.rs.client.ClientBuilder;
import jakarta.ws.rs.client.WebTarget;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.UriBuilder;
import org.glassfish.jersey.client.ClientConfig;
import org.springframework.stereotype.Service;

import java.net.URI;

@Service
public class WarehouseService {
    private static URI getBaseURIAdd() {
        return UriBuilder.fromUri("http://localhost:8087/product/store/add").build();
    }

    private static URI getBaseURIRemove() {
        return UriBuilder.fromUri("http://localhost:8087/product/store/remove").build();
    }
    public void increaseStockWareHouse() {
        ClientConfig config = new ClientConfig();
        Client client = ClientBuilder.newClient(config);
        WebTarget target = client.target(getBaseURIAdd());
        target.request(MediaType.TEXT_PLAIN)
                .header("productCount", 1)
                .get(String.class);
    }
    public void decreaseStockWareHouse() {
        ClientConfig config = new ClientConfig();
        Client client = ClientBuilder.newClient(config);
        WebTarget target = client.target(getBaseURIRemove());
        target.request(MediaType.TEXT_PLAIN)
                .header("productCount", 1)
                .get(String.class);
    }
}
