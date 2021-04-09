package uz.jaxadev.Kitoblashamiz.fake.url;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import uz.jaxadev.Kitoblashamiz.fake.url.model.UserSignUp;

import java.util.ArrayList;

@RestController
public class KitoblashamizResController {

    ArrayList<UserSignUp> userSignUpInformation = new ArrayList<>();

    @GetMapping("/getUser")
    public ArrayList<UserSignUp> kitoblashamizGetRequest(){

        KitoblashamizResponse kitoblashamizResponse = new KitoblashamizResponse("+998330618707", "jaxadevumongajimo'tirdedi");

        return userSignUpInformation;
    }

    @PostMapping("/postUserSignUp")
    public UserSignUp userSignUpKitoblashamiz(

            @RequestParam(required = true)
            String fNameLName,

            @RequestParam(required = true)
            String userName,

            @RequestParam(required = true)
            String birthOfDate,

            @RequestParam(required = true)
            String phoneNumber,

            @RequestParam(required = true)
            String password

    ){

        UserSignUp userSignUp = new UserSignUp(fNameLName,userName,birthOfDate,phoneNumber,password);
        
        userSignUpInformation.add(userSignUp);

        return userSignUp;

    }

}
