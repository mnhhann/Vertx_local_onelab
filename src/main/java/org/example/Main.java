package org.example;

import io.vertx.core.Vertx;
import org.example.controller.ICD10Controller;

public class Main {
    public static void main(String[] args) {
        System.out.println("Starting the application...");
        Vertx vertx = Vertx.vertx();
        ICD10Controller icd10Controller = new ICD10Controller();
        vertx.createHttpServer().requestHandler(icd10Controller.configureRouter(vertx)).listen(8080, http -> {
            if (http.succeeded()) {
                System.out.println("HTTP server started on port 8080");
            } else {
                System.out.println("Failed to start HTTP server: " + http.cause());
            }
        });
    }
}