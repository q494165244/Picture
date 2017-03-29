package controller;

import com.sun.deploy.net.HttpResponse;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by Administrator on 2017/3/13.
 */
@Controller
@RequestMapping("/test")
public class test {
    @RequestMapping("test.do")
    public void test (HttpServletRequest request, HttpServletResponse response){
        PrintWriter printWriter = null;
        try {
            printWriter =  response.getWriter();
            printWriter.print("123");
        } catch (IOException e) {

            e.printStackTrace();
        } finally {
            printWriter.close();
        }
    }
}
