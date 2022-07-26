/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Pantallas;

import com.mycompany.cuestionario.Cuestionario;
import java.util.Random;

/**
 *
 * @author th3tici
 */
public class Preguntas extends javax.swing.JFrame {
    Random numeroAleatorio;
    int preguntaActual;
    Cuestionario preguntas [];
    int cantPreguntas; 
    int respuestasCorrectas; 
    /**
     * Creates new form Preguntas
     */
    public Preguntas() {
        initComponents();
        preguntas = new Cuestionario [10];
        preguntas[0] = new Cuestionario("El lenguaje de programacion es la herramienta de comunicacion entre Usuario-Maquina", "True");
        preguntas[1] = new Cuestionario("Java es un lenguaje orientado a Objetos", "True");
        preguntas[2] = new Cuestionario("Hola", "True");
        preguntas[3] = new Cuestionario("Hola?", "True");
        preguntas[4] = new Cuestionario("Hola?", "True");
        preguntas[5] = new Cuestionario("Hola?", "True");
        preguntas[6] = new Cuestionario("Hola?", "True");
        preguntas[7] = new Cuestionario("Hola?", "True");
        preguntas[8] = new Cuestionario("Hola?", "True");
        preguntas[9] = new Cuestionario("Hola?", "True");
        numeroAleatorio = new Random();
        
        cantPreguntas = 0; 
        respuestasCorrectas = 0; 
        
        preguntaActual = numeroAleatorio.nextInt(10);
        lblPreguntas.setText(preguntas[preguntaActual].getPregunta());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jRTrue = new javax.swing.JRadioButton();
        jRFalse = new javax.swing.JRadioButton();
        lblPreguntas = new javax.swing.JLabel();
        btnverificar = new javax.swing.JButton();
        lblResultado = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        buttonGroup1.add(jRTrue);
        jRTrue.setFont(new java.awt.Font("SimSun-ExtB", 0, 12)); // NOI18N
        jRTrue.setText("True");

        buttonGroup1.add(jRFalse);
        jRFalse.setFont(new java.awt.Font("SimSun-ExtB", 0, 12)); // NOI18N
        jRFalse.setText("False");

        lblPreguntas.setText("jLabel2");

        btnverificar.setText("Verificar");
        btnverificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnverificarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addContainerGap(567, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblPreguntas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(276, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnverificar)
                    .addComponent(lblResultado, javax.swing.GroupLayout.PREFERRED_SIZE, 317, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jRTrue)
                    .addComponent(jRFalse))
                .addGap(207, 207, 207))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(108, 108, 108)
                .addComponent(lblPreguntas, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addGap(48, 48, 48)
                .addComponent(jRTrue)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRFalse)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnverificar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblResultado, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnverificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnverificarActionPerformed
        // TODO add your handling code here:
        cantPreguntas ++;
      
        if (preguntas[preguntaActual].getRespuestaCorrecta() == "True" && this.jRTrue.isSelected()) {
            respuestasCorrectas ++;
            lblResultado.setText("La Respuesta Anterior es Correcta");
        }else{
          
         if (preguntas[preguntaActual].getRespuestaCorrecta() == "False" && this.jRFalse.isSelected()) {
             respuestasCorrectas ++; 
        }else{
             lblResultado.setText("La Respuesta Anterior es Incorrecta");
        }
        }
        if (cantPreguntas < 20){
        preguntaActual = numeroAleatorio.nextInt(10);
        lblPreguntas.setText(preguntas[preguntaActual].getPregunta());
        }else{
            new Resultado(respuestasCorrectas).setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_btnverificarActionPerformed

    /**
     * @param args the command line arguments
     */
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnverificar;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JRadioButton jRFalse;
    private javax.swing.JRadioButton jRTrue;
    private javax.swing.JLabel lblPreguntas;
    private javax.swing.JLabel lblResultado;
    // End of variables declaration//GEN-END:variables
}
