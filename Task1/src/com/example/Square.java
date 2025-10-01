package com.example;

public class Square implements Shape{

    Draw3D draw3D;

    public void setDraw3D(Draw3D draw3D) {
        this.draw3D = draw3D;
    }

    public void drawRectangle(Shape shape){
        draw3D.drawShape(shape);
    }
}
