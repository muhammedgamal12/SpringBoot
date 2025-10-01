package com.example;

public class Circle implements Shape{


    Draw2D draw2D;

    //Constructor Injection
    public Circle(Draw2D draw2D){
        this.draw2D=draw2D;
    }
    public Circle(){
    }



    public void drawCircle(Shape circle){
        draw2D.drawShape(circle);
    }






}
