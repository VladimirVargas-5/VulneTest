package apiClient;

import io.restassured.response.Response;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.given;

public class RequestGET implements  IRequest {
    @Override
    public Response send(String url) {

        Response response = given()
               // .contentType(ContentType.JSON)
                .when()
                .get(url);
        return response;
    }
}
