package controller;

import bean.UserEntity;
import module.Login;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import tools.MD5;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by Administrator on 2017/3/29.
 */
@Controller
@RequestMapping("User")
public class User {
    @RequestMapping("login.do")
    public void login (String username, String password, HttpServletRequest request, HttpServletResponse response){
        boolean flag = new Login().login(username, MD5.getMD5(password));
        if (flag == true){
            RespenseTools.success("success",response);
            request.getSession().setAttribute("islogin",true);
        }else {
            RespenseTools.fail(400,"用户名或者密码错误",response);
        }
    }
    @RequestMapping(value = "register.do", method ={RequestMethod.POST})
    public void register (UserEntity userEntity, HttpServletResponse response, HttpServletRequest request){
        String md5 = userEntity.getuser_pwd();
        md5 = MD5.getMD5(md5);
        userEntity.setuser_pwd(md5);
        Login login = new Login();
        if (login.register(userEntity)){
            RespenseTools.success("OK",response);
            request.getSession().setAttribute("islogin",true);
        }else {
            RespenseTools.fail(400,"Fail",response);
        }
    }
    @RequestMapping("islogin.do")
    public  void  islogin (HttpServletResponse response, HttpServletRequest request) throws IOException{

        try {
            if ((boolean)request.getSession().getAttribute("islogin")){
                RespenseTools.success("Already Login",response);
            }
        } catch (Exception e) {
            response.sendRedirect("./test/Login.jsp");
        }
    }
}
