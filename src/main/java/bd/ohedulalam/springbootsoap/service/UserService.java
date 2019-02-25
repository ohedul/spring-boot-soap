package bd.ohedulalam.springbootsoap.service;

import ohedulalam.bd.spring_boot_soap.User;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.HashMap;
import java.util.Map;

@Service
public class UserService {

    private static final Map<String, User> users = new HashMap<>();

    @PostConstruct
    public void initialize(){
        User peter = new User();
        peter.setName("Mr. Peter Jackson");
        peter.setEmpId(100);
        peter.setSalary(25000);

        User sam = new User();
        sam.setName("Mr. Sam Agarwal");
        sam.setEmpId(101);
        sam.setSalary(12500);

        User robin = new User();
        robin.setName("Mr. Robin Palit");
        robin.setEmpId(102);
        robin.setSalary(10000);

        users.put(peter.getName(), peter);
        users.put(sam.getName(), sam);
        users.put(robin.getName(), robin);
    }

    public User getUsers(String name) {
        return users.get(name);
    }
}
