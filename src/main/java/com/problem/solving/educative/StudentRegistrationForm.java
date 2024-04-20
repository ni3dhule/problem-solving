package com.problem.solving.educative;

import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class StudentRegistrationForm extends JFrame {
    Label labelStudentName;
    TextField textStudentName;
    Label labelCity;
    TextField textCity;
    Label labelGender;
    JRadioButton radioButtonMale;
    JRadioButton radioButtonFemale;

    Label labelLangauge;
    Checkbox checkboxDataStructure;
    Checkbox checkboxJava;
    CheckboxGroup checkboxGroupLangauges;
    Button buttonSubmit;
    public StudentRegistrationForm(){
        super("Student Registration Form");
        init();
    }
    public void init() {
        setSize(1000, 600);
        setLayout(null);
        setVisible(true);

        /*labelStudentName = new Label("Student Name");
        labelStudentName.setBounds(250, 40,  300, 50);
        add(labelStudentName);*/

        labelStudentName = new Label("Student Name");
        labelStudentName.setBounds(250, 100,  150, 30);
        add(labelStudentName);

        textStudentName = new TextField();
        textStudentName.setBounds(400,100,400,30);
        add(textStudentName);

        labelCity = new Label("City");
        labelCity.setBounds(250,  150, 150,  30);
        add(labelCity);

        textCity = new TextField();
        textCity.setBounds(400,150,400,30);
        add(textCity);

        labelGender = new Label("Gender");
        labelGender.setBounds(250, 200, 150, 30);
        add(labelGender);

        radioButtonMale = new JRadioButton("Male");
        radioButtonMale.setBounds(400, 200, 150, 30);
        add(radioButtonMale);

        radioButtonMale = new JRadioButton("Female");
        radioButtonMale.setBounds(450, 200, 150, 30);
        add(radioButtonMale);

        labelLangauge = new Label("Langauges");
        labelLangauge.setBounds(250,250, 150, 30);
        add(labelLangauge);

        checkboxDataStructure = new Checkbox("Data Structure");
        checkboxDataStructure.setBounds(400, 250, 150,30);
        add(checkboxDataStructure);

        checkboxJava = new Checkbox("Java");
        checkboxJava.setBounds(550, 250, 150,30);
        add(checkboxJava);

        buttonSubmit = new Button("Submit");
        buttonSubmit.setBounds(300, 300,150, 30);
        add(buttonSubmit);

        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                super.windowClosing(e);
            }
        });
    }

    public static void main(String []args) {
        new StudentRegistrationForm();
    }
}
