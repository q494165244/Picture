package controller;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by Administrator on 2017/3/29.
 */
public class RespenseTools {
    public  static  boolean success(String code, HttpServletResponse response){
        boolean flag = true;
        response.setStatus(200);
        try {
            response.getWriter().print(code);
        } catch (IOException e) {
            e.printStackTrace();
            flag = false;
            System.out.println(response);
            System.out.println("code");
        }
        return  flag;
    }
    public  static  boolean fail (int code,String res,HttpServletResponse response){
        boolean flag = true;
        response.setStatus(code);
        try {
            response.getWriter().print(res);
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println(code + " " + res + " " +response);
            flag = false;
        }
        return true;
    }
}
