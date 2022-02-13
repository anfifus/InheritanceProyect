package com.company;

public class Square extends Rectangle{
    private double height;
    private double width;

    public Square(double height,double width){
        super(height, width*2);
        this.height = height;
        this.width = width;

    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }
    public double calculatePartialArea(){
        return this.width * this.height;
    }
    public double calculateAllArea(){
      return super.calculateArea();
    }
}
