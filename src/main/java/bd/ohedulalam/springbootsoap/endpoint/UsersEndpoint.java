package bd.ohedulalam.springbootsoap.endpoint;

import bd.ohedulalam.springbootsoap.service.UserService;
import ohedulalam.bd.spring_boot_soap.GetUserRequest;
import ohedulalam.bd.spring_boot_soap.GetUserResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

@Endpoint
public class UsersEndpoint {

    @Autowired
    UserService userService;

    @PayloadRoot(namespace = "http://bd.ohedulalam/spring-boot-soap", localPart = "getUserRequest")
    @ResponsePayload
    public GetUserResponse getUserRequest(@RequestPayload GetUserRequest res){
        GetUserResponse response = new GetUserResponse();
        response.setName(userService.getUsers(res.getName()));
        return response;
    }
}
