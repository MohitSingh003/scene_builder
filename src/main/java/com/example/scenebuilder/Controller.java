package com.example.scenebuilder;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.shape.Circle;

public class Controller {

    @FXML
    private Circle myCircle;
    private double X;
    private double Y;

    public void moveUP(ActionEvent e){
        System.out.println("Move Up");
        myCircle.setCenterY(Y-=1);
    }

    public void moveDown(ActionEvent e){

        System.out.println("Move Down");
        myCircle.setCenterY(Y+=1);
    }

    public void moveLeft(ActionEvent e){

        System.out.println("Move Left");
        myCircle.setCenterX(X-=1);
    }

    public void moveRight(ActionEvent e){

        System.out.println("Move Right");
        myCircle.setCenterX(X+=1);
    }


}
