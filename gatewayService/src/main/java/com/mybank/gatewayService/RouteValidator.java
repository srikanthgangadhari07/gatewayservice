package com.mybank.gatewayService;

import java.util.List;
import java.util.function.Predicate;

import org.springframework.stereotype.Component;
import org.springframework.http.server.reactive.ServerHttpRequest;

@Component
public class RouteValidator {
    public static final List<String> openApiEndpoints = List.of(
            "/auth/welcome",
            "/auth/addUser",
            "/auth/authenticate",
            "/authenticationService/swagger-ui.html",
            "/authenticationService/swagger-ui/**",
            "/accountService/swagger-ui.html",
            "/accountService/swagger-ui/**",
            "/transactionservice/swagger-ui.html",
            "/transactionservice/swagger-ui/**",
            "/notificationService/swagger-ui.html",
            "/notificationService/swagger-ui/**",
            "/actuator/**",
            "/v3/api-docs/**"
    );

    public Predicate<ServerHttpRequest> isSecured = request -> openApiEndpoints.stream()
            .noneMatch(uri -> request.getURI().getPath().contains(uri));
}