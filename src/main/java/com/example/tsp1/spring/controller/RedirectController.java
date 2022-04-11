package com.example.tsp1.spring.controller;

import com.example.tsp1.domain.Client;
import com.example.tsp1.spring.repository.ClientRepository;
import lombok.extern.java.Log;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletMapping;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

@Controller
@Log
public class RedirectController {

    @Autowired
    private ClientRepository clientRepository;

    @RequestMapping(value = "", method = RequestMethod.GET)
    public String baseUrlRedirect(HttpServletRequest request, HttpServletResponse httpServletResponse)
    {
        List<Client> clientList=clientRepository.findAll();
        return"ok";
    }
}
