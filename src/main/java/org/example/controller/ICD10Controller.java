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
import org.example.mapper.Icd10Mapper;
import org.example.model.Icd10;

import java.io.InputStream;
import java.util.List;

public class ICD10Controller {
    private SqlSessionFactory sqlSessionFactory;

    public Router configureRouter(Vertx vertx) {
        initializeSqlSessionFactory();
        Router router = Router.router(vertx);
        router.route().handler(BodyHandler.create());

        router.get("/ICD10").handler(this::handleGetAllICD10s);
        router.get("/ICD10/:code").handler(this::handleGetICD10ByCode);
        router.post("/ICD10").handler(this::handleCreateICD10);
        router.put("/ICD10/:code").handler(this::handleUpdateICD10);
        router.delete("/ICD10/:code").handler(this::handleDeleteICD10);

        return router;
    }

    private void initializeSqlSessionFactory() {
        String resource = "mybatis-config.xml";
        InputStream inputStream = getClass().getClassLoader().getResourceAsStream(resource);
        sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
    }

    private void handleGetAllICD10s(RoutingContext ctx) {
        try (SqlSession session = sqlSessionFactory.openSession()) {

            Icd10Mapper mapper = session.getMapper(Icd10Mapper.class);
            List<Icd10> icd10s = mapper.getAllICD10s();

            JsonArray responseArray = new JsonArray();
            for (Icd10 icd10 : icd10s) {
                responseArray.add(JsonObject.mapFrom(icd10));
            }
            ctx.response()
                    .putHeader("content-type", "application/json")
                    .end(new JsonObject().put("status", "success").put("message", "ICD10 retrieved successfully").put("data", responseArray).encodePrettily());
        } catch (Exception e) {
            e.printStackTrace();
            ctx.response()
                    .setStatusCode(500)
                    .end(new JsonObject().put("status", "error").put("message", "Internal Server Error").encodePrettily());
        }
    }

    private void handleGetICD10ByCode(RoutingContext ctx) {
        String code = ctx.pathParam("code");
        try (SqlSession session = sqlSessionFactory.openSession()) {
            Icd10Mapper mapper = session.getMapper(Icd10Mapper.class);
            Icd10 icd10 = mapper.selectByPrimaryKey(code);
            if (icd10 != null) {
                ctx.response()
                        .putHeader("content-type", "application/json")
                        .end(new JsonObject().put("status", "success").put("message", "ICD10 retrieved successfully").put("data", JsonObject.mapFrom(icd10)).encodePrettily());
            } else {
                ctx.response()
                        .setStatusCode(404)
                        .end(new JsonObject().put("status", "error").put("message", "ICD10 not found").encodePrettily());
            }
        } catch (Exception e) {
            e.printStackTrace();
            ctx.response()
                    .setStatusCode(500)
                    .end(new JsonObject().put("status", "error").put("message", "Internal Server Error").encodePrettily());
        }
    }

    private void handleCreateICD10(RoutingContext ctx) {
        JsonObject requestBody = ctx.getBodyAsJson();
        Icd10 newICD10 = requestBody.mapTo(Icd10.class);
        try (SqlSession session = sqlSessionFactory.openSession()) {
            Icd10Mapper mapper = session.getMapper(Icd10Mapper.class);
            mapper.insert(newICD10);
            session.commit();
            ctx.response()
                    .putHeader("content-type", "application/json")
                    .setStatusCode(201)
                    .end(new JsonObject().put("status", "success").put("message", "ICD10 created successfully").encodePrettily());
        } catch (Exception e) {
            e.printStackTrace();
            ctx.response()
                    .setStatusCode(500)
                    .end(new JsonObject().put("status", "error").put("message", "Failed to create ICD10").encodePrettily());
        }
    }

    private void handleUpdateICD10(RoutingContext ctx) {
        String code = ctx.pathParam("code");
        JsonObject requestBody = ctx.getBodyAsJson();
        Icd10 updatedICD10 = requestBody.mapTo(Icd10.class);
        updatedICD10.setCode(code);
        try (SqlSession session = sqlSessionFactory.openSession()) {
            Icd10Mapper mapper = session.getMapper(Icd10Mapper.class);
            mapper.updateByPrimaryKey(updatedICD10);
            session.commit();
            ctx.response()
                    .putHeader("content-type", "application/json")
                    .setStatusCode(200)
                    .end(new JsonObject().put("status", "success").put("message", "ICD10 updated successfully").encodePrettily());
        } catch (Exception e) {
            e.printStackTrace();
            ctx.response()
                    .setStatusCode(500)
                    .end(new JsonObject().put("status", "error").put("message", "Failed to update ICD10").encodePrettily());
        }
    }

    private void handleDeleteICD10(RoutingContext ctx) {
        String code = ctx.pathParam("code");
        try (SqlSession session = sqlSessionFactory.openSession()) {
            Icd10Mapper mapper = session.getMapper(Icd10Mapper.class);
            mapper.deleteByPrimaryKey(code);
            session.commit();
            ctx.response()
                    .putHeader("content-type", "application/json")
                    .setStatusCode(200)
                    .end(new JsonObject().put("status", "success").put("message", "ICD10 deleted successfully").encodePrettily());
        } catch (Exception e) {
            e.printStackTrace();
            ctx.response()
                    .setStatusCode(500)
                    .end(new JsonObject().put("status", "error").put("message", "Failed to delete ICD10").encodePrettily());
        }
    }

}
