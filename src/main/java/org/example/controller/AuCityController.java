package org.example.controller;

import io.vertx.core.Vertx;
import io.vertx.core.json.JsonArray;
import io.vertx.core.json.JsonObject;
import io.vertx.ext.web.Router;
import io.vertx.ext.web.RoutingContext;
import io.vertx.ext.web.handler.BodyHandler;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.example.mapper.AuCityMapper;
import org.example.model.AuCity;

import java.io.InputStream;
import java.util.List;

public class AuCityController {
    private SqlSessionFactory sqlSessionFactory;

    public Router configureRouter(Vertx vertx) {
        initializeSqlSessionFactory();
        Router router = Router.router(vertx);
        router.route().handler(BodyHandler.create());

        router.get("/").handler(this::handleGetAllCities);
        router.get("/:code").handler(this::handleGetCityByCode);
        router.post("/").handler(this::handleCreateCity);
        router.put("/:code").handler(this::handleUpdateCity);
        router.delete("/:code").handler(this::handleDeleteCity);

        return router;
    }

    private void initializeSqlSessionFactory() {
        String resource = "mybatis-config.xml";
        InputStream inputStream = getClass().getClassLoader().getResourceAsStream(resource);
        sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
    }

    private void handleGetAllCities(RoutingContext ctx) {
        try (SqlSession session = sqlSessionFactory.openSession()) {
            System.out.println("Successfully connected to the database.");

            AuCityMapper mapper = session.getMapper(AuCityMapper.class);
            List<AuCity> cities = mapper.getAllCities();

            JsonArray responseArray = new JsonArray();
            for (AuCity city : cities) {
                responseArray.add(JsonObject.mapFrom(city));
            }

            ctx.response()
                    .putHeader("content-type", "application/json")
                    .end(new JsonObject().put("status", "success").put("message", "Cities retrieved successfully").put("data", responseArray).encodePrettily());
        } catch (Exception e) {
            e.printStackTrace();
            ctx.response()
                    .setStatusCode(500)
                    .end(new JsonObject().put("status", "error").put("message", "Internal Server Error").encodePrettily());
        }
    }

    private void handleGetCityByCode(RoutingContext ctx) {
        String code = ctx.pathParam("code");
        try (SqlSession session = sqlSessionFactory.openSession()) {
            AuCityMapper mapper = session.getMapper(AuCityMapper.class);
            AuCity city = mapper.selectByPrimaryKey(code);
            if (city != null) {
                ctx.response()
                        .putHeader("content-type", "application/json")
                        .end(new JsonObject().put("status", "success").put("message", "City retrieved successfully").put("data", JsonObject.mapFrom(city)).encodePrettily());
            } else {
                ctx.response()
                        .setStatusCode(404)
                        .end(new JsonObject().put("status", "error").put("message", "City not found").encodePrettily());
            }
        }
    }

    private void handleCreateCity(RoutingContext ctx) {
        JsonObject requestBody = ctx.getBodyAsJson();
        AuCity newCity = requestBody.mapTo(AuCity.class);
        try (SqlSession session = sqlSessionFactory.openSession()) {
            AuCityMapper mapper = session.getMapper(AuCityMapper.class);
            mapper.insert(newCity);
            session.commit();
            ctx.response()
                    .setStatusCode(201)
                    .end(new JsonObject().put("status", "success").put("message", "City created successfully").encodePrettily());
        } catch (Exception e) {
            e.printStackTrace();
            ctx.response()
                    .setStatusCode(500)
                    .end(new JsonObject().put("status", "error").put("message", "Failed to create city").encodePrettily());
        }
    }

    private void handleUpdateCity(RoutingContext ctx) {
        String code = ctx.pathParam("code");
        JsonObject requestBody = ctx.getBodyAsJson();
        AuCity updatedCity = requestBody.mapTo(AuCity.class);
        updatedCity.setCode(code);
        try (SqlSession session = sqlSessionFactory.openSession()) {
            AuCityMapper mapper = session.getMapper(AuCityMapper.class);
            mapper.updateByPrimaryKey(updatedCity);
            session.commit();
            ctx.response()
                    .setStatusCode(200)
                    .end(new JsonObject().put("status", "success").put("message", "City updated successfully").encodePrettily());
        } catch (Exception e) {
            e.printStackTrace();
            ctx.response()
                    .setStatusCode(500)
                    .end(new JsonObject().put("status", "error").put("message", "Failed to update city").encodePrettily());
        }
    }

    private void handleDeleteCity(RoutingContext ctx) {
        String code = ctx.pathParam("code");
        try (SqlSession session = sqlSessionFactory.openSession()) {
            AuCityMapper mapper = session.getMapper(AuCityMapper.class);
            mapper.deleteByPrimaryKey(code);
            session.commit();
            ctx.response()
                    .setStatusCode(200)
                    .end(new JsonObject().put("status", "success").put("message", "City deleted successfully").encodePrettily());
        } catch (Exception e) {
            e.printStackTrace();
            ctx.response()
                    .setStatusCode(500)
                    .end(new JsonObject().put("status", "error").put("message", "Failed to delete city").encodePrettily());
        }
    }
}
