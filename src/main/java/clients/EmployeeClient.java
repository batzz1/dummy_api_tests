package clients;

import entities.employee.response.GetAllEmployeesResponse;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.testng.Reporter;

import static io.restassured.RestAssured.given;

public class EmployeeClient {


    private String host = "http://dummy.restapiexample.com";

    public GetAllEmployeesResponse getAllEmployees() {
        Response response = given()
                .contentType(ContentType.JSON)
                .when()
                .get(host + "/api/v1/employees");
        Reporter.log(String.format("GetEmployees Response --- {%s} %s", response.getStatusCode(), response.asString()), true);
        GetAllEmployeesResponse getAllEmployeesResponse = response.as(GetAllEmployeesResponse.class);
        getAllEmployeesResponse.setHttpStatusCode(response.getStatusCode());
        return getAllEmployeesResponse;
    }

}
