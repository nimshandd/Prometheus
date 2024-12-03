/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Promethues;

/**
 *
 * @author LENOVO
 */
public class ThemeManager {
    private static java.awt.Color currentColor = java.awt.Color.GREEN; // Default color

    public static java.awt.Color getCurrentColor() {
        return currentColor;
    }

    public static void setCurrentColor(java.awt.Color color) {
        currentColor = color;
    }
}
