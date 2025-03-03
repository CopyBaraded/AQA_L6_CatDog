package org.example;
/*
Применяя интерфейсы написать программу расчета периметра и площади геометрических фигур: круг, прямоугольник, треугольник.
Задать для каждой фигуры цвет заливки и цвет границы.
Результат полученных характеристик [ Периметр, площадь, цвет фона, цвет границ ] по каждой фигуре вывести в консоль.
Попробуйте реализовать базовые методы, такие как расчет периметра фигур, в качестве дефолтных методов в интерфейсе.
 */

public interface Calculate {
    double getArea();
    double getPerimeter();
    String getColorBody();
    String getColorBorder();

    default void printInfo () {
        System.out.println("Area: " + getArea()
                + "\nPer: " + getPerimeter()
                + "\n color body:" + getColorBody()
                + "\n color bord: " + getColorBorder());
    }
}
