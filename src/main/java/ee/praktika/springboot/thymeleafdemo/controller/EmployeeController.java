package ee.praktika.springboot.thymeleafdemo.controller;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import ee.praktika.springboot.thymeleafdemo.model.Employee;

@Controller
@RequestMapping( "/employees" )
public class EmployeeController {

    //load employee data
    private List<Employee> theEmployees;

    @PostConstruct
    private void loadData(){

        //create employees
        Employee employee1 = new Employee( 1, "Lebron", "James", "LBJ@LAL.com" );
        Employee employee2 = new Employee( 1, "Anthony", "Davis", "TheBrow@LAL.com" );
        Employee employee3 = new Employee( 1, "Kobe", "Bryant", "MambaMentality@LAL.com" );

        //create the list
        theEmployees = new ArrayList<>();

        //add to the list
        theEmployees.add( employee1 );
        theEmployees.add( employee2 );
        theEmployees.add( employee3 );
    }

    //add mapping for /list
    @GetMapping( "/list" )
    public String listEmployees( Model theModel ){

        //add to the spring model
        theModel.addAttribute( "employees", theEmployees );

        return "list-employees";
    }
}
