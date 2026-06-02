package vista;

import javax.swing.*;
import java.awt.*;
import modelo.Guerrero;
import modelo.Mago;
import modelo.Personaje;
import datos.IRegistroBatallas;

public class VentanaBatalla extends JFrame {
    private IRegistroBatallas registroBatallas;
    private JButton btnGuerrero;
    private JButton btnMago;
    private JTextArea txtHistorial;
    private Personaje arthur = new Guerrero("Arthur", 120);
    private Personaje merlin = new Mago("Merlin", 80);

    public VentanaBatalla(IRegistroBatallas registroBatallas) {
        this.registroBatallas = registroBatallas;

        setTitle("Arena de Héroes - Simulador RPG");
        setSize(500, 380);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout(10, 10));

        btnGuerrero = new JButton("Atacar con Guerrero");
        btnMago = new JButton("Atacar con Mago");

        txtHistorial = new JTextArea();
        txtHistorial.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(txtHistorial);
        JPanel panelBotones = new JPanel(new FlowLayout());
        panelBotones.add(btnGuerrero);
        panelBotones.add(btnMago);
        add(panelBotones, BorderLayout.NORTH);
        add(scrollPane, BorderLayout.CENTER);

        btnGuerrero.addActionListener(e -> ejecutarAccionDeAtaque(arthur));
        btnMago.addActionListener(e -> ejecutarAccionDeAtaque(merlin));
    }

    private void ejecutarAccionDeAtaque(Personaje atacante) {
        String mensajeAtaque = atacante.atacar();
        registroBatallas.registrarAtaque(mensajeAtaque);
        renderizarHistorial();
    }

    private void renderizarHistorial() {
        StringBuilder sb = new StringBuilder();
        for (String linea : registroBatallas.obtenerHistorial()) {
            sb.append(linea).append("\n");
        }
        txtHistorial.setText(sb.toString());
    }
}
