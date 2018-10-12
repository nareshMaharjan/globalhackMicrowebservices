package com.globalhack.microwebservice.app.cucumber.stepdefs;

import com.globalhack.microwebservice.app.GlobalhackMicrowebservicesApp;

import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.ResultActions;

import org.springframework.boot.test.context.SpringBootTest;

@WebAppConfiguration
@SpringBootTest
@ContextConfiguration(classes = GlobalhackMicrowebservicesApp.class)
public abstract class StepDefs {

    protected ResultActions actions;

}
