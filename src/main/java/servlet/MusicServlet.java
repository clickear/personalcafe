package servlet;

import com.alibaba.fastjson.JSONObject;
import music.util.NetEaseUtil;
import service.impl.NetEaseService;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by Administrator on 2017/2/19.
 */
@WebServlet(name="MusicServlet",urlPatterns="/music")
public class MusicServlet extends javax.servlet.http.HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws javax.servlet.ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        String  text = "{'offset': 1, 'total': true, 'limit': 20}";
        PrintWriter writer=response.getWriter();

        JSONObject obj = new JSONObject();
        obj.put("offset",1);
        obj.put("total", true);
        obj.put("limit",20);

        String result =  NetEaseUtil.GetEncHtml("http://music.163.com/weapi/v1/discovery/recommend/songs", text, true);

        writer.println(result);
       // result = NetEaseUtil.GetEncHtml("http://music.163.com/weapi/v1/discovery/recommend/songs", obj, true);
       // writer.println(result);
        writer.close();
    }
}
