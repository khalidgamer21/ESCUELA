package edu.iudigital;

import javax.swing.*;
import java.awt.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.time.LocalDate;

public class InterfazProfesor extends JFrame {
    private JTextField txtNombre, txtApellido, txtFechaNacimiento, txtGenero, txtEstatura, txtPeso, txtEspecialidad, txtExperiencia;
    private JButton btnGuardar;

    public InterfazProfesor() {
        setTitle("Registro de Profesores");
        setSize(400, 400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new GridLayout(9, 2));

        txtNombre = new JTextField(); txtApellido = new JTextField();
        txtFechaNacimiento = new JTextField(); txtGenero = new JTextField();
        txtEstatura = new JTextField(); txtPeso = new JTextField();
        txtEspecialidad = new JTextField(); txtExperiencia = new JTextField();
        btnGuardar = new JButton("Guardar");

        add(new JLabel("Nombre:")); add(txtNombre);
        add(new JLabel("Apellido:")); add(txtApellido);
        add(new JLabel("Fecha Nacimiento (AAAA-MM-DD):")); add(txtFechaNacimiento);
        add(new JLabel("Género:")); add(txtGenero);
        add(new JLabel("Estatura:")); add(txtEstatura);
        add(new JLabel("Peso:")); add(txtPeso);
        add(new JLabel("Especialidad:")); add(txtEspecialidad);
        add(new JLabel("Experiencia (años):")); add(txtExperiencia);
        add(btnGuardar);

        btnGuardar.addActionListener(e -> guardarProfesor());

        setVisible(true);
    }
    private void guardarProfesor() {
        try {
            Profesor profesor = new Profesor(
                    txtNombre.getText(),
                    txtApellido.getText(),
                    LocalDate.parse(txtFechaNacimiento.getText()),
                    txtGenero.getText(),
                    Double.parseDouble(txtEstatura.getText()),
                    Double.parseDouble(txtPeso.getText()),
                    txtEspecialidad.getText(),
                    Integer.parseInt(txtExperiencia.getText())
            );

    }
}