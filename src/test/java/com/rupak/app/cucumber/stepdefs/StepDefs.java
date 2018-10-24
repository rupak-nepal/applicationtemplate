package com.rupak.app.cucumber.stepdefs;

import com.rupak.app.SpringtemplateApp;

import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.ResultActions;

import org.springframework.boot.test.context.SpringBootTest;

@WebAppConfiguration
@SpringBootTest
@ContextConfiguration(classes = SpringtemplateApp.class)
public abstract class StepDefs {

    protected ResultActions actions;

}
