import clients.EmployeeClient;
import entities.employee.response.GetAllEmployeesResponse;
import org.apache.http.HttpStatus;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class TestClass {

    @Test
    public void getAllEmployeesTest() {
        GetAllEmployeesResponse response = new EmployeeClient().getAllEmployees();
        assertEquals(response.getHttpStatusCode(), HttpStatus.SC_OK, "Status Code is Different");
        assertTrue(response.getData().length > 1, "Data is less than expected");
    }


}
