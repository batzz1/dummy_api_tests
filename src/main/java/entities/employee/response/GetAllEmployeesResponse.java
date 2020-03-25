package entities.employee.response;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import entities.BaseResponse;

@JsonIgnoreProperties(ignoreUnknown = true)
public class GetAllEmployeesResponse extends BaseResponse {
    private String status;
    private Data[] data;


    public Data[] getData() {
        return data;
    }

    public void setData(Data[] data) {
        this.data = data;
    }


    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
