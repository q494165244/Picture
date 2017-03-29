package controller;

import bean.UserEntity;
import module.Login;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import tools.MD5;

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
        boolean flag = new Login().login(username, password);
        if (flag == true){
            RespenseTools.success("success",response);
            request.getSession().setAttribute("islogin",true);
        }else {
            RespenseTools.fail(400,"用户名或者密码错误",response);
        }
    }
    @RequestMapping(value = "register.do", method ={RequestMethod.POST})
    public void register (UserEntity userEntity, HttpServletResponse response, HttpServletRequest request){
        String md5 = userEntity.getName();
        md5 = MD5.getMD5(md5);
        userEntity.setUserid(md5);
        Login login = new Login();
        if (login.register(userEntity)){
            RespenseTools.success("注册成功",response);
            request.getSession().setAttribute("islogin",true);
        }else {
            RespenseTools.fail(400,"注册失败",response);
        }
    }
    @RequestMapping("islogin.do")
    public  void  islogin (HttpServletResponse response, HttpServletRequest request){

        try {
            if ((boolean)request.getSession().getAttribute("islogin")){
                RespenseTools.success("已登录",response);
            }
        } catch (Exception e) {
            RespenseTools.fail(400,"未登录",response);
            e.printStackTrace();
        }
    }
}
