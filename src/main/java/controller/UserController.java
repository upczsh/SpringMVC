package controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.annotation.WebServlet;

@WebServlet("/user/quick22")
public class UserController {
        @RequestMapping
        @ResponseBody
        public  void save(String username, MultipartFile uploadFile)
        {
            System.out.println(username);
            System.out.println(uploadFile);
        }
        

}
