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
}