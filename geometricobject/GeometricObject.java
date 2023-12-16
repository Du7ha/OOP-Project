package geometricobject;

import java.awt.FlowLayout;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;



public class GeometricObject extends JFrame implements ActionListener {
    
    JLabel t1,widthLabel,heightLabel,radiusLabel,areaLabel,perimeterLabel;
    JTextField widthTextField,heightTextField,radiusTextField;
    JComboBox shapesCB;
    JButton calculateButton;
    JPanel inputPanel, outputPanel;
    public GeometricObject(){
        this.setTitle("Geometric Object Area & Perimeter Calculator");
        this.setVisible(true);
        this.setSize(700,500);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        // Create a combobox to select the shape
        t1 = new JLabel("Select the shape");
        String[] shapes = {"Circle", "Rectangle", "Square"};
        shapesCB=new JComboBox<>(shapes);
        shapesCB.addActionListener(this);
         
        // Create text fields to enter the dimensions of the shape
        widthLabel = new JLabel("Width:");
        widthTextField = new JTextField(10);
        heightLabel = new JLabel("Height:");
        heightTextField = new JTextField(10);
        radiusLabel = new JLabel("Radius:");
        radiusTextField = new JTextField(10);
        
        // Create a button to calculate and display the area and perimeter
        calculateButton = new JButton("Calculate and Display");
        calculateButton.addActionListener(this);
        
        // Create a panel to hold the input components
        inputPanel = new JPanel(new GridLayout(4, 2,5,5));
        inputPanel.add(t1);
        inputPanel.add(shapesCB);
        inputPanel.add(widthLabel);
        inputPanel.add(widthTextField);
        inputPanel.add(heightLabel);
        inputPanel.add(heightTextField);
        inputPanel.add(radiusLabel);
        inputPanel.add(radiusTextField);
        inputPanel.setBackground(Color.MAGENTA);
        
        
        
        
        // Create labels to display the area and perimeter
        areaLabel = new JLabel("Area:");
        perimeterLabel = new JLabel("Perimeter:");
        
        // Create a panel to hold the output components
        outputPanel = new JPanel(new GridLayout(2, 2,5,5));
        outputPanel.add(areaLabel);
        outputPanel.add(new JLabel());
        outputPanel.add(perimeterLabel);
        outputPanel.add(new JLabel());
        outputPanel.setBackground(Color.CYAN);
        
        // Add the input and output panels to the frame
        this.add(inputPanel, BorderLayout.NORTH);
        this.add(calculateButton, BorderLayout.CENTER);
        this.add(outputPanel, BorderLayout.SOUTH);
        

    }

    
    public static void main(String[] args) {
       new GeometricObject();
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        String shape = (String) shapesCB.getSelectedItem();
        //double width = Double.parseDouble(widthTextField.getText());
        //double height = Double.parseDouble(heightTextField.getText());
        //double radius = Double.parseDouble(radiusTextField.getText());
        
        if (shape.equals("Circle")) {
            double radius = Double.parseDouble(radiusTextField.getText());
            Circle object = new Circle(radius);
            areaLabel.setText("Area: " + object.getArea());
            perimeterLabel.setText("Perimeter: " + object.getPerimeter());
        } else if (shape.equals("Rectangle")) {
            double width = Double.parseDouble(widthTextField.getText());
            double height = Double.parseDouble(heightTextField.getText());
            Rectangle object = new Rectangle(width, height);
            areaLabel.setText("Area: " + object.getArea());
            perimeterLabel.setText("Perimeter: " + object.getPerimeter());
        } else {
            double width = Double.parseDouble(widthTextField.getText());
            double height = Double.parseDouble(heightTextField.getText());
            Square object = new Square(width);
            areaLabel.setText("Area: " + object.getArea());
            perimeterLabel.setText("Perimeter: " + object.getPerimeter());
        } 
    }
}
