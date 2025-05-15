package com.example.lamps;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import com.google.gson.Gson;

import java.io.IOException;

@WebServlet("/lamp")
public class LampServlet extends HttpServlet {
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {

        Lamps  lamps = new  Lamps("Світлодіодна лампа Philips 9W E27", "istockphoto-507305500-612x612.jpg", "Енергоефективна світлодіодна лампа з теплим білим світлом, ідеальна для домашнього використання.", 99.99, "9W, 806 люменів, 2700K, цоколь E27, термін служби 15 000 годин");

        Gson gson = new Gson();
        String json = gson.toJson(lamps);

        resp.setContentType("application/json");
        resp.setCharacterEncoding("UTF-8");
        resp.getWriter().write(json);
    }
}