/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Estructura.EstructuraGuardado;
import Controlador.Funciones;
import Modelo.Personaje;
import Personaje.Narrador;
import Personaje.Vito_Scaletta;
import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.DomDriver;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import javax.swing.DefaultListModel;
import Personaje.Mia_Winters;
import Personaje.Señor;
import java.applet.Applet;
import java.applet.AudioClip;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author puesto1
 */
public class Principal extends javax.swing.JFrame {

    public DefaultListModel listModel = new DefaultListModel();
    DefaultListModel model = new DefaultListModel<>();
    DefaultListModel model2 = new DefaultListModel<>();
    
    private static ArrayList<String> palabras_clave = new ArrayList();
    private static ArrayList<String> inventario = new ArrayList();
    private static ArrayList<String> habilidades = new ArrayList();
    private Personaje per;
    
    private final String habitacion = "src/Imagenes/habitacion.jpg";
    private final String bar = "src/Imagenes/bar.jpg";
    private final String manicomio = "src/Imagenes/manicomio.jpg";
    private final String biblioteca = "src/Imagenes/biblioteca.jpg";
    private final String calle = "src/Imagenes/calle.jpg";
    private final String iglesia = "src/Imagenes/iglesia.jpg";
    private final String casa = "src/Imagenes/casa.jpg";
    
    AudioClip sonido1 = new Applet().newAudioClip(getClass().getResource("/Musica/8 - Grzegorz Mazur - Monday Cigarette.mp3"));
    AudioClip sonido2 = new Applet().newAudioClip(getClass().getResource("/Musica/9 - Grzegorz Mazur - Time Is Running Out.mp3"));
    
    public Principal(Personaje per,ArrayList<String> hab) {
        initComponents();
        this.per = per;
        this.habilidades = hab;
        jTextAreaDialogo.setText(Narrador.apartamento1);
        
        for(String aux : palabras_clave)
         model.addElement(aux); 
        jListClav.setModel(model);
        
        for(String aux : inventario)
         model2.addElement(aux); 
        jListInv.setModel(model2);
        
        ImageIcon img = new ImageIcon(habitacion);
            File f = new File(habitacion);
            
            if(!f.exists())
            {
                img = new ImageIcon("../"+habitacion);
            }
            jLabelImg.setIcon(img);
        
        
        sonido1.loop();
        setLocationRelativeTo(null);
    }
    
    public Principal() {
        initComponents();
        jTextAreaDialogo.setText(Narrador.apartamento1);
    }
    
    public Principal(EstructuraGuardado g)
    {
        initComponents();
        palabras_clave = g.getPalabasClave();
        inventario = g.getInventario();
        habilidades = g.getHabilidades();
        per = g.getPersonaje();
        jTextAreaDialogo.setText(g.getDialogo());
        
        if(g.getRutaImagen().contains("bar"))
        {
            ImageIcon img = new ImageIcon(bar);
            File f = new File(bar);
            
            if(!f.exists())
            {
                img = new ImageIcon("../"+bar);
            }
            jLabelImg.setIcon(img);
        }
        else if(g.getRutaImagen().contains("habitacion"))
        {   
            ImageIcon img = new ImageIcon(habitacion);
            File f = new File(habitacion);
            
            if(!f.exists())
            {
                img = new ImageIcon("../"+habitacion);
            }
            jLabelImg.setIcon(img);
            
        }else if(g.getRutaImagen().contains("biblioteca"))
        {   
            ImageIcon img = new ImageIcon(biblioteca);
            File f = new File(biblioteca);
            
            if(!f.exists())
            {
                img = new ImageIcon("../"+biblioteca);
            }
            jLabelImg.setIcon(img);
            
        }else if(g.getRutaImagen().contains("manicomio"))
        {   
            ImageIcon img = new ImageIcon(manicomio);
            File f = new File(manicomio);
            
            if(!f.exists())
            {
                img = new ImageIcon("../"+manicomio);
            }
            jLabelImg.setIcon(img);
            
        }else if(g.getRutaImagen().contains("calle"))
        {   
            ImageIcon img = new ImageIcon(calle);
            File f = new File(calle);
            
            if(!f.exists())
            {
                img = new ImageIcon("../"+calle);
            }
            jLabelImg.setIcon(img);
            
        }else if(g.getRutaImagen().contains("casa"))
        {   
            ImageIcon img = new ImageIcon(casa);
            File f = new File(casa);
            
            if(!f.exists())
            {
                img = new ImageIcon("../"+casa);
            }
            jLabelImg.setIcon(img);
            
        }else if(g.getRutaImagen().contains("iglesia"))
        {   
            ImageIcon img = new ImageIcon(iglesia);
            File f = new File(iglesia);
            
            if(!f.exists())
            {
                img = new ImageIcon("../"+iglesia);
            }
            jLabelImg.setIcon(img);
            
        }
        else
            System.out.println("No encontrado");
        
        
        this.jLabelImg.repaint(); // Repinta Label
        
        for(String aux : palabras_clave)
         model.addElement(aux); 
        jListClav.setModel(model);
        
        for(String aux : inventario)
         model2.addElement(aux); 
        jListInv.setModel(model2);
        
        if (jTextAreaDialogo.getText().contains(Narrador.casa2)){
            
            sonido2.loop();  
            
        }else{
            
            sonido1.loop();
            
        }
        
        setLocationRelativeTo(null);
        
        
        
        // ...
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabelImagen = new javax.swing.JLabel();
        jLabelImg = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextAreaDialogo = new javax.swing.JTextArea();
        jTextFieldEscritoJug = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jButtonEst = new javax.swing.JButton();
        jButtonSalir = new javax.swing.JButton();
        jButtonGuardar = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jListClav = new javax.swing.JList<>();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jListInv = new javax.swing.JList<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(102, 102, 102)
                .addComponent(jLabelImagen)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelImg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelImg, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelImagen)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTextAreaDialogo.setEditable(false);
        jTextAreaDialogo.setColumns(20);
        jTextAreaDialogo.setLineWrap(true);
        jTextAreaDialogo.setRows(5);
        jTextAreaDialogo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextAreaDialogoMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTextAreaDialogo);

        jTextFieldEscritoJug.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextFieldEscritoJug.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldEscritoJugActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Escribe:");

        jButtonEst.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButtonEst.setText("Estadisticas");
        jButtonEst.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEstActionPerformed(evt);
            }
        });

        jButtonSalir.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButtonSalir.setText("Salir");
        jButtonSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalirActionPerformed(evt);
            }
        });

        jButtonGuardar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButtonGuardar.setText("Guardar");
        jButtonGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonGuardarActionPerformed(evt);
            }
        });

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Palabras clave"));

        jScrollPane2.setViewportView(jListClav);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 159, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 198, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Inventario"));

        jScrollPane3.setViewportView(jListInv);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 159, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 194, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 512, Short.MAX_VALUE)
                            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldEscritoJug, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonEst, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 73, Short.MAX_VALUE)
                        .addComponent(jButtonSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonEst)
                    .addComponent(jButtonGuardar)
                    .addComponent(jTextFieldEscritoJug, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextAreaDialogoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextAreaDialogoMouseClicked
        // TODO add your handling code here:
       String contenido = jTextAreaDialogo.getText();
        
        if(contenido.contains(Narrador.apartamento1)){
            
            jTextAreaDialogo.setText(Narrador.apartamento2);
            palabras_clave.add("Gato Negro");
            
            for(String aux : palabras_clave)
            model.addElement(aux); 
            jListClav.setModel(model);
            
            JOptionPane.showMessageDialog(null,"Para ir al bar escribe 'ir al Gato Negro'");
            
        }else if(contenido.contains(Narrador.apartamentosalir)){ //Sales de la casa para ir al bar
            
            jTextAreaDialogo.setText(Narrador.bar1);
            
            ImageIcon img = new ImageIcon(bar);
            File f = new File(bar);
            
            if(!f.exists())
            {
                img = new ImageIcon("../"+bar);
            }
            jLabelImg.setIcon(img);
            
            
        }else if(contenido.contains(Narrador.bar1)){
            
            jTextAreaDialogo.setText(Narrador.bar2);
            
        }else if(contenido.contains(Narrador.bar2)){
            
            jTextAreaDialogo.setText(Narrador.bar3);
            
        }else if(contenido.contains(Narrador.bar3)){ // empieza conversacion con vito en el bar
            
            jTextAreaDialogo.setText(Vito_Scaletta.vito1);
            
        }else if (contenido.contains(Vito_Scaletta.vito1)){
            
            jTextAreaDialogo.setText(Vito_Scaletta.vito2);
            
        }else if (contenido.contains(Vito_Scaletta.vito2)){
            
            jTextAreaDialogo.setText(Vito_Scaletta.vito3);
            
        }else if (contenido.contains(Vito_Scaletta.vito3)){
            
            jTextAreaDialogo.setText(Vito_Scaletta.vito4);
            
        }else if (contenido.contains(Vito_Scaletta.vito4)){
            
            jTextAreaDialogo.setText(Vito_Scaletta.vito5);
            
        }else if (contenido.contains(Vito_Scaletta.vito5)){
            
            jTextAreaDialogo.setText(Vito_Scaletta.vito6);
            
        }else if (contenido.contains(Vito_Scaletta.vito6)){
            
            jTextAreaDialogo.setText(Vito_Scaletta.vito7);
            
        }else if (contenido.contains(Vito_Scaletta.vito7)){
            
            jTextAreaDialogo.setText(Vito_Scaletta.vito8);
            
        }else if (contenido.contains(Vito_Scaletta.vito8)){
            
            jTextAreaDialogo.setText(Vito_Scaletta.vito9);
            inventario.add("llave");
            per.setDinero(200);
            palabras_clave.add("Manicomio");
            palabras_clave.add("Biblioteca");
            palabras_clave.add("Alrededores casa");
            palabras_clave.add("Casa");
            
            model.removeAllElements();
            model2.removeAllElements();
            
            for(String aux : palabras_clave)
            model.addElement(aux); 
            jListClav.setModel(model);
            
            for(String aux : inventario)
            model2.addElement(aux); 
            jListInv.setModel(model2);
            
        }else if (contenido.contains(Narrador.bar_manicomio)){ // empieza escena manicomio desde el bar
            
            jTextAreaDialogo.setText(Narrador.manicomio1);
            
            ImageIcon img = new ImageIcon(manicomio);
            File f = new File(manicomio);
            
            if(!f.exists())
            {
                img = new ImageIcon("../"+manicomio);
            }
            jLabelImg.setIcon(img);
            
       
            
        }else if (contenido.contains(Narrador.bar_casa)){ // empieza escena manicomio desde los alrededores de la casa
            
            jTextAreaDialogo.setText(Narrador.calle_casa1);
            
            ImageIcon img = new ImageIcon(calle);
            File f = new File(calle);
            
            if(!f.exists())
            {
                img = new ImageIcon("../"+calle);
            }
            jLabelImg.setIcon(img);
            
            
            
        }else if (contenido.contains(Narrador.bar_biblioteca)){ // empieza escena manicomio desde la biblioteca
            
            jTextAreaDialogo.setText(Narrador.biblioteca1);
            
            ImageIcon img = new ImageIcon(biblioteca);
            File f = new File(biblioteca);
            
            if(!f.exists())
            {
                img = new ImageIcon("../"+biblioteca);
            }
            jLabelImg.setIcon(img);
            
            
        }else if (contenido.contains(Narrador.manicomio1)){
            
          jTextAreaDialogo.setText(Narrador.manicomio2);
          palabras_clave.add("Empleada");
          
          model.removeAllElements();
          
          for(String aux : palabras_clave)
            model.addElement(aux); 
            jListClav.setModel(model);
            
        }else if (contenido.contains(Narrador.manicomio_soborno)){
            
            jTextAreaDialogo.setText(Narrador.manicomio_persuasion_acierto);
            
        }else if (contenido.contains(Narrador.manicomio_persuasion_acierto)){
            
            jTextAreaDialogo.setText(Narrador.manicomio3);
            palabras_clave.add("Marido");
            palabras_clave.add("Mujer");
            
            model.removeAllElements();
          
          for(String aux : palabras_clave)
            model.addElement(aux); 
            jListClav.setModel(model);
            
        }else if (contenido.contains(Narrador.manicomio_marido1)){
            
            jTextAreaDialogo.setText(Narrador.manicomio_marido2);
            
        } else if (contenido.contains(Narrador.manicomio_marido_persuasion_acierto1)){
            
            jTextAreaDialogo.setText(Narrador.manicomio_marido_persuasion_acierto2);
            
        } else if (contenido.contains(Narrador.manicomio_mujer1)){
            
            jTextAreaDialogo.setText(Mia_Winters.mia1);
            
        }else if (contenido.contains(Mia_Winters.mia_persuasion_casa_acierto1)){
            
            jTextAreaDialogo.setText(Mia_Winters.mia_persuasion_casa_acierto2);
            
        }else if (contenido.contains(Mia_Winters.mia_persuasion_casa_acierto2)){
            
            jTextAreaDialogo.setText(Mia_Winters.mia_persuasion_casa_acierto3);
            
        }else if (contenido.contains(Mia_Winters.mia_preguntar_marido1)){
            
            jTextAreaDialogo.setText(Mia_Winters.mia_preguntar_marido2);
            
        }else if (contenido.contains(Mia_Winters.mia_preguntar_marido2)){
            
            jTextAreaDialogo.setText(Mia_Winters.mia_continuacion);
            
        }else if (contenido.contains(Mia_Winters.mia_persuasion_casa_acierto3)){
            
            jTextAreaDialogo.setText(Mia_Winters.mia_continuacion);
            
        }else if (contenido.contains(Mia_Winters.mia_persuasion_casa_fallo)){
            
            jTextAreaDialogo.setText(Mia_Winters.mia_continuacion);
            
        }else if (contenido.contains(Narrador.manicomio_biblioteca)){
            
            jTextAreaDialogo.setText(Narrador.biblioteca1);
            
            ImageIcon img = new ImageIcon(biblioteca);
            File f = new File(biblioteca);
            
            if(!f.exists())
            {
                img = new ImageIcon("../"+biblioteca);
            }
            jLabelImg.setIcon(img);
 
         
            
        }else if (contenido.contains(Narrador.manicomio_casa)){
            
            jTextAreaDialogo.setText(Narrador.calle_casa1);
            
            ImageIcon img = new ImageIcon(calle);
            File f = new File(calle);
            
            if(!f.exists())
            {
                img = new ImageIcon("../"+calle);
            }
            jLabelImg.setIcon(img);
           
            
        }else if (contenido.contains(Narrador.biblioteca_buscarlibros1)){
            
            jTextAreaDialogo.setText(Narrador.biblioteca_buscarlibros2);
            
        }else if (contenido.contains(Narrador.biblioteca_buscarlibros2)){
            
            jTextAreaDialogo.setText(Narrador.biblioteca_buscarlibros3);
            palabras_clave.add("John Corbitt");
            
            model.removeAllElements();
          
          for(String aux : palabras_clave)
            model.addElement(aux); 
            jListClav.setModel(model);
            
        }else if (contenido.contains(Narrador.biblioteca_buscarlibros3)){
            
            jTextAreaDialogo.setText(Narrador.biblioteca_buscarlibros4);
            
        }else if (contenido.contains(Narrador.biblioteca_manicomio)){
            
            jTextAreaDialogo.setText(Narrador.manicomio1);
            
            ImageIcon img = new ImageIcon(manicomio);
            File f = new File(manicomio);
            
            if(!f.exists())
            {
                img = new ImageIcon("../"+manicomio);
            }
            jLabelImg.setIcon(img);
            
        
            
        }else if (contenido.contains(Narrador.biblioteca_casa)){
            
            jTextAreaDialogo.setText(Narrador.calle_casa1);
            
            ImageIcon img = new ImageIcon(calle);
            File f = new File(calle);
            
            if(!f.exists())
            {
                img = new ImageIcon("../"+calle);
            }
            jLabelImg.setIcon(img);
            
            
            
       }else if (contenido.contains(Narrador.calle_casa1)){
            
            jTextAreaDialogo.setText(Narrador.calle_casa2);
        
       }else if (contenido.contains(Narrador.calle_casa2)){
            
            jTextAreaDialogo.setText(Narrador.calle_casa3);
             palabras_clave.add("Señor");
            
            model.removeAllElements();
          
          for(String aux : palabras_clave)
            model.addElement(aux); 
            jListClav.setModel(model);
        
       }else if (contenido.contains(Señor.señor_preguntar_casa)){
           
           jTextAreaDialogo.setText(Señor.señor_repeticion);
           
       }else if (contenido.contains(Señor.señor_preguntar_corbitt)){
           
           jTextAreaDialogo.setText(Señor.señor_repeticion);
           
       }else if (contenido.contains(Señor.señor_preguntar_iglesia)){
           
           jTextAreaDialogo.setText(Señor.señor_repeticion);
           
       }else if (contenido.contains(Narrador.calle_manicommio)){
           
           jTextAreaDialogo.setText(Narrador.manicomio1);
           
           ImageIcon img = new ImageIcon(manicomio);
            File f = new File(manicomio);
            
            if(!f.exists())
            {
                img = new ImageIcon("../"+manicomio);
            }
            jLabelImg.setIcon(img);
           
           
           
       }else if (contenido.contains(Narrador.calle_biblioteca)){
           
           jTextAreaDialogo.setText(Narrador.biblioteca1);
           
           ImageIcon img = new ImageIcon(biblioteca);
            File f = new File(biblioteca);
            
            if(!f.exists())
            {
                img = new ImageIcon("../"+biblioteca);
            }
            jLabelImg.setIcon(img);
           
           
       }else if (contenido.contains(Narrador.calle_iglesia)){
           
           jTextAreaDialogo.setText(Narrador.iglesia1);
           
           ImageIcon img = new ImageIcon(iglesia);
            File f = new File(iglesia);
            
            if(!f.exists())
            {
                img = new ImageIcon("../"+iglesia);
            }
            jLabelImg.setIcon(img);
           
           
           
       }else if (contenido.contains(Narrador.iglesia1)){
           
           jTextAreaDialogo.setText(Narrador.iglesia2);
           
       }else if (contenido.contains(Narrador.iglesia2)){
           
           jTextAreaDialogo.setText(Narrador.iglesia3);
           
       }else if (contenido.contains(Narrador.iglesia3)){
           
           jTextAreaDialogo.setText(Narrador.iglesia4);
           inventario.add("Libro extraño");
            
            model2.removeAllElements();
          
          for(String aux : inventario)
            model2.addElement(aux); 
            jListInv.setModel(model2);
           
       }else if (contenido.contains(Narrador.iglesia_casa)){
           
           jTextAreaDialogo.setText(Narrador.casa1);
           
       }else if (contenido.contains(Narrador.casa1)){
           
           jTextAreaDialogo.setText(Narrador.casa2);
           palabras_clave.add("Comedor");
           palabras_clave.add("Cocina");
           palabras_clave.add("Sala de estar");
           palabras_clave.add("Escalera");
            
            model.removeAllElements();
          
            for(String aux : palabras_clave)
               model.addElement(aux); 
               jListClav.setModel(model);
               
               ImageIcon img = new ImageIcon(casa);
            File f = new File(casa);
            
            if(!f.exists())
            {
                img = new ImageIcon("../"+casa);
            }
            jLabelImg.setIcon(img);
               
           
       }else if (contenido.contains(Narrador.casa_busqueda_salon1)){
           
           jTextAreaDialogo.setText(Narrador.casa_busqueda_salon2);
           
       }else if (contenido.contains(Narrador.casa_busqueda_despacho1)){
           
           jTextAreaDialogo.setText(Narrador.casa_busqueda_despacho2);
           
       }else if (contenido.contains(Narrador.casa_sotano1)){
           
           jTextAreaDialogo.setText(Narrador.casa_sotano2);
           
       }else if (contenido.contains(Narrador.casa_busqueda_sotano1)){
           
           jTextAreaDialogo.setText(Narrador.casa_busqueda_sotano2);
           
            palabras_clave.add("Puerta oculta");
            
            model.removeAllElements();
          
            for(String aux : palabras_clave)
               model.addElement(aux); 
               jListClav.setModel(model);
           
       }else if (contenido.contains(Narrador.casa_ritual) && inventario.contains("Libro extraño")){
           
           jTextAreaDialogo.setText(Narrador.casa_ritual_acierto1);
           
       }else if (contenido.contains(Narrador.casa_ritual) && !inventario.contains("Libro extraño")){
           
           jTextAreaDialogo.setText(Narrador.casa_ritual_fallo1);
           
       }else if (contenido.contains(Narrador.casa_ritual_acierto1)){
           
           jTextAreaDialogo.setText(Narrador.casa_ritual_acierto2);
           
       }else if (contenido.contains(Narrador.casa_ritual_acierto2)){
           
           jTextAreaDialogo.setText(Narrador.casa_ritual_acierto3);
           
       }else if (contenido.contains(Narrador.casa_ritual_acierto3)){
           
           jTextAreaDialogo.setText(Narrador.fin);
           
       }else if (contenido.contains(Narrador.casa_ritual_fallo1)){
           
           jTextAreaDialogo.setText(Narrador.casa_ritual_fallo2);
           
       }else if (contenido.contains(Narrador.casa_ritual_fallo2)){
           
           jTextAreaDialogo.setText(Narrador.casa_ritual_fallo3);
           
       }else if (contenido.contains(Narrador.casa_ritual_fallo3)){
           
           jTextAreaDialogo.setText(Narrador.casa_ritual_fallo4);
           
       }else if (contenido.contains(Narrador.casa_ritual_fallo4)){
           
           jTextAreaDialogo.setText(Narrador.fin);
           
       }else if (contenido.contains(Narrador.calle_casa)){
           
           jTextAreaDialogo.setText(Narrador.casa1);
           
       }
    }//GEN-LAST:event_jTextAreaDialogoMouseClicked

    private void jTextFieldEscritoJugActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldEscritoJugActionPerformed
        // TODO add your handling code here:
        String conDig = jTextAreaDialogo.getText();
        String conEsc = jTextFieldEscritoJug.getText();
        
        if (conDig.contains(Narrador.apartamento2) && conEsc.contains("Ir") && conEsc.contains("Gato Negro") && palabras_clave.contains("Gato Negro") ||
                conDig.contains(Narrador.apartamento2) && conEsc.contains("ir") && conEsc.contains("Gato Negro") && palabras_clave.contains("Gato Negro")){      //ir del apartamento al bar
            
            jTextAreaDialogo.setText(Narrador.apartamentosalir);
            jTextFieldEscritoJug.setText("");
            
        }else if (conDig.contains(Vito_Scaletta.vito9) && conEsc.contains("Ir") && conEsc.contains("Manicomio") && palabras_clave.contains("Manicomio") ||  
                conDig.contains(Vito_Scaletta.vito9) && conEsc.contains("ir") && conEsc.contains("Manicomio") && palabras_clave.contains("Manicomio")){          // ir del bar al manicomio
            
            jTextAreaDialogo.setText(Narrador.bar_manicomio);
            jTextFieldEscritoJug.setText("");
            
        }else if (conDig.contains(Vito_Scaletta.vito9) && conEsc.contains("Ir") && conEsc.contains("Biblioteca") && palabras_clave.contains("Biblioteca") ||
                conDig.contains(Vito_Scaletta.vito9) && conEsc.contains("ir") && conEsc.contains("Biblioteca") && palabras_clave.contains("Biblioteca")){       // ir del bar a la biblioteca
            
            jTextAreaDialogo.setText(Narrador.bar_biblioteca);
            jTextFieldEscritoJug.setText("");
            
        }else if (conDig.contains(Vito_Scaletta.vito9) && conEsc.contains("Ir") && conEsc.contains("Alrededores casa") && palabras_clave.contains("Alrededores casa") ||
                conDig.contains(Vito_Scaletta.vito9) && conEsc.contains("ir") && conEsc.contains("Alrededores casa") && palabras_clave.contains("Alrededores casa")){                   // ir del bar a los alrededores de la casa
           
           jTextAreaDialogo.setText(Narrador.bar_casa);
           jTextFieldEscritoJug.setText("");
            
        }else if (conDig.contains(Narrador.manicomio2) && conEsc.contains("Persuadir") && conEsc.contains("Empleada") && palabras_clave.contains("Empleada") || // intentar persuadir a la empleada
                conDig.contains(Narrador.manicomio2) && conEsc.contains("persuadir") && conEsc.contains("Empleada") && palabras_clave.contains("Empleada")){
            
                if(habilidades.contains("Persuadir")){
                    
                    int dado = Funciones.numero_aleatorio()-40;
                    int valor = per.getInteligencia();
                    
                    if(dado<=valor){
                        
                        jTextAreaDialogo.setText(Narrador.manicomio_persuasion_acierto);
                        jTextFieldEscritoJug.setText("");
                        
                    }else {
                        
                        jTextAreaDialogo.setText(Narrador.manicomio_persuasion_fallo);
                        jTextFieldEscritoJug.setText("");
                        
                    }
                    
                }else{
                    
                    int dado =  Funciones.numero_aleatorio();
                    int valor = per.getInteligencia();
                    
                    if(dado<=valor){
                        
                        jTextAreaDialogo.setText(Narrador.manicomio_persuasion_acierto);
                        jTextFieldEscritoJug.setText("");
                        
                    }else {
                        
                        jTextAreaDialogo.setText(Narrador.manicomio_persuasion_fallo);
                        jTextFieldEscritoJug.setText("");
                        
                    }
                    
                }
            
        }else if (conDig.contains(Narrador.manicomio2) && conEsc.contains("Sobornar") && conEsc.contains("Empleada") && palabras_clave.contains("Empleada") || // intentar persuadir a la empleada
                conDig.contains(Narrador.manicomio2) && conEsc.contains("sobornar") && conEsc.contains("Empleada") && palabras_clave.contains("Empleada")){
            
            jTextAreaDialogo.setText(Narrador.manicomio_soborno);
            int dinero = per.getDinero();
            per.setDinero(dinero-100);
            
            jTextFieldEscritoJug.setText("");
            
        }else if (conDig.contains(Narrador.manicomio_persuasion_fallo) && conEsc.contains("Sobornar") && conEsc.contains("Empleada") && palabras_clave.contains("Empleada") || // intentar sobornar a la empleada
                conDig.contains(Narrador.manicomio_persuasion_fallo) && conEsc.contains("sobornar") && conEsc.contains("Empleada") && palabras_clave.contains("Empleada")){
            
            jTextAreaDialogo.setText(Narrador.manicomio_soborno);
            int dinero = per.getDinero();
            per.setDinero(dinero-100);
            
            jTextFieldEscritoJug.setText("");
            
        } else if (conDig.contains(Narrador.manicomio3) && conEsc.contains("Ir") && conEsc.contains("Marido") && palabras_clave.contains("Marido") || // ir a ver al marido
                conDig.contains(Narrador.manicomio3) && conEsc.contains("ir") && conEsc.contains("Marido") && palabras_clave.contains("Marido")){
            
            jTextAreaDialogo.setText(Narrador.manicomio_marido1);
            jTextFieldEscritoJug.setText("");
            
        } else if (conDig.contains(Narrador.manicomio_marido2) && conEsc.contains("Revisar") && conEsc.contains("Marido") && palabras_clave.contains("Marido") || // revisar al marido
                conDig.contains(Narrador.manicomio_marido2) && conEsc.contains("revisar") && conEsc.contains("Marido") && palabras_clave.contains("Marido")){
            
            jTextAreaDialogo.setText(Narrador.manicomio_maridorevision);
            jTextFieldEscritoJug.setText("");
        
        } else if (conDig.contains(Narrador.manicomio_maridorevision) && conEsc.contains("Hablar") && conEsc.contains("Marido") && palabras_clave.contains("Marido") || // persuadir al marido
                conDig.contains(Narrador.manicomio_maridorevision) && conEsc.contains("hablar") && conEsc.contains("Marido") && palabras_clave.contains("Marido")){
            
            if(habilidades.contains("Psicologia")){
                    
                    int dado = Funciones.numero_aleatorio()-40;
                    int valor = per.getInteligencia();
                    
                    if(dado<=valor){
                        
                        jTextAreaDialogo.setText(Narrador.manicomio_marido_persuasion_acierto1);
                        jTextFieldEscritoJug.setText("");
                        
                    }else {
                        
                        jTextAreaDialogo.setText(Narrador.manicomio_marido_persuasion_fallo);
                        jTextFieldEscritoJug.setText("");
                        
                    }
                    
                }else{
                    
                    int dado =  Funciones.numero_aleatorio()+50;
                    int valor = per.getInteligencia();
                    
                    if(dado<=valor){
                        
                        jTextAreaDialogo.setText(Narrador.manicomio_marido_persuasion_acierto1);
                        jTextFieldEscritoJug.setText("");
                        
                    }else {
                        
                        jTextAreaDialogo.setText(Narrador.manicomio_marido_persuasion_fallo);
                        jTextFieldEscritoJug.setText("");
                        
                    }
             }
                   
        }else if (conDig.contains(Narrador.manicomio_marido2) && conEsc.contains("Hablar") && conEsc.contains("Marido") && palabras_clave.contains("Marido") || // persuadir al marido
                conDig.contains(Narrador.manicomio_marido2) && conEsc.contains("hablar") && conEsc.contains("Marido") && palabras_clave.contains("Marido")){
            
            if(habilidades.contains("Psicologia")){
                    
                    int dado = Funciones.numero_aleatorio()-40;
                    int valor = per.getInteligencia();
                    
                    if(dado<=valor){
                        
                        jTextAreaDialogo.setText(Narrador.manicomio_marido_persuasion_acierto1);
                        jTextFieldEscritoJug.setText("");
                        
                    }else {
                        
                        jTextAreaDialogo.setText(Narrador.manicomio_marido_persuasion_fallo);
                        jTextFieldEscritoJug.setText("");
                        
                    }
                    
                }else{
                    
                    int dado =  Funciones.numero_aleatorio()+50;
                    int valor = per.getInteligencia();
                    
                    if(dado<=valor){
                        
                        jTextAreaDialogo.setText(Narrador.manicomio_marido_persuasion_acierto1);
                        jTextFieldEscritoJug.setText("");
                        
                    }else {
                        
                        jTextAreaDialogo.setText(Narrador.manicomio_marido_persuasion_fallo);
                        jTextFieldEscritoJug.setText("");
                        
                    }
             }
                   
        } else if (conDig.contains(Narrador.manicomio_marido_persuasion_acierto2) && conEsc.contains("Revisar") && conEsc.contains("Marido") && palabras_clave.contains("Marido") || // revisar al marido
                conDig.contains(Narrador.manicomio_marido_persuasion_acierto2) && conEsc.contains("revisar") && conEsc.contains("Marido") && palabras_clave.contains("Marido")){
            
            jTextAreaDialogo.setText(Narrador.manicomio_maridorevision);
            jTextFieldEscritoJug.setText("");
            
        }else if (conDig.contains(Narrador.manicomio_marido_persuasion_fallo) && conEsc.contains("Revisar") && conEsc.contains("Marido") && palabras_clave.contains("Marido") || // ir a ver al marido
                conDig.contains(Narrador.manicomio_marido_persuasion_fallo) && conEsc.contains("revisar") && conEsc.contains("Marido") && palabras_clave.contains("Marido")){
            
            jTextAreaDialogo.setText(Narrador.manicomio_maridorevision);
            jTextFieldEscritoJug.setText("");
            
        }else if (conDig.contains(Narrador.manicomio3) && conEsc.contains("Ir") && conEsc.contains("Mujer") && palabras_clave.contains("Mujer") || // ir a ver al marido
                conDig.contains(Narrador.manicomio3) && conEsc.contains("ir") && conEsc.contains("Mujer") && palabras_clave.contains("Mujer")){
            
            jTextAreaDialogo.setText(Narrador.manicomio_mujer1);
            jTextFieldEscritoJug.setText("");
            
        } else if (conDig.contains(Narrador.manicomio_marido_persuasion_fallo) && conEsc.contains("Ir") && conEsc.contains("Mujer") && palabras_clave.contains("Mujer") || // ir a ver al marido
                conDig.contains(Narrador.manicomio_marido_persuasion_fallo) && conEsc.contains("ir") && conEsc.contains("Mujer") && palabras_clave.contains("Mujer")){
            
            jTextAreaDialogo.setText(Narrador.manicomio_mujer1);
            jTextFieldEscritoJug.setText("");
            
        }else if (conDig.contains(Narrador.manicomio_marido_persuasion_acierto2) && conEsc.contains("Ir") && conEsc.contains("Mujer") && palabras_clave.contains("Mujer") || // ir a ver al marido
                conDig.contains(Narrador.manicomio_marido_persuasion_acierto2) && conEsc.contains("ir") && conEsc.contains("Mujer") && palabras_clave.contains("Mujer")){
            
            jTextAreaDialogo.setText(Narrador.manicomio_mujer1);
            jTextFieldEscritoJug.setText("");
            
        }else if (conDig.contains(Narrador.manicomio_maridorevision) && conEsc.contains("Ir") && conEsc.contains("Mujer") && palabras_clave.contains("Mujer") || // ir a ver al marido
                conDig.contains(Narrador.manicomio_maridorevision) && conEsc.contains("ir") && conEsc.contains("Mujer") && palabras_clave.contains("Mujer")){
            
            jTextAreaDialogo.setText(Narrador.manicomio_mujer1);
            jTextFieldEscritoJug.setText("");
            
        }else if (conDig.contains(Mia_Winters.mia1) && conEsc.contains("Preguntar") && conEsc.contains("Casa") && palabras_clave.contains("Casa") || // ir a ver al marido
                conDig.contains(Mia_Winters.mia1) && conEsc.contains("preguntar") && conEsc.contains("Casa") && palabras_clave.contains("Casa")){
            
           if(habilidades.contains("Persuadir")){
                    
                    int dado = Funciones.numero_aleatorio()-40;
                    int valor = per.getInteligencia();
                    
                    if(dado<=valor){
                        
                        jTextAreaDialogo.setText(Mia_Winters.mia_persuasion_casa_acierto1);
                        jTextFieldEscritoJug.setText("");
                        
                    }else {
                        
                        jTextAreaDialogo.setText(Mia_Winters.mia_persuasion_casa_fallo);
                        jTextFieldEscritoJug.setText("");
                        
                    }
                    
                }else{
                    
                    int dado =  Funciones.numero_aleatorio();
                    int valor = per.getInteligencia();
                    
                    if(dado<=valor){
                        
                        jTextAreaDialogo.setText(Mia_Winters.mia_persuasion_casa_acierto1);
                        jTextFieldEscritoJug.setText("");
                        
                    }else {
                        
                        jTextAreaDialogo.setText(Mia_Winters.mia_persuasion_casa_fallo);
                        jTextFieldEscritoJug.setText("");
                        
                    }
                        
                    }
            
        }else if (conDig.contains(Mia_Winters.mia1) && conEsc.contains("Preguntar") && conEsc.contains("Marido") && palabras_clave.contains("Marido") || // ir a ver al marido
                conDig.contains(Mia_Winters.mia1) && conEsc.contains("preguntar") && conEsc.contains("Marido") && palabras_clave.contains("Marido")){
                    
                    jTextAreaDialogo.setText(Mia_Winters.mia_preguntar_marido1);
                    jTextFieldEscritoJug.setText("");
            
        }else if (conDig.contains(Mia_Winters.mia_continuacion) && conEsc.contains("Preguntar") && conEsc.contains("Casa") && palabras_clave.contains("Casa") || // ir a ver al marido
                conDig.contains(Mia_Winters.mia_continuacion) && conEsc.contains("preguntar") && conEsc.contains("Casa") && palabras_clave.contains("Casa")){
            
           if(habilidades.contains("Persuadir")){
                    
                    int dado = Funciones.numero_aleatorio()-40;
                    int valor = per.getInteligencia();
                    
                    if(dado<=valor){
                        
                        jTextAreaDialogo.setText(Mia_Winters.mia_persuasion_casa_acierto1);
                        jTextFieldEscritoJug.setText("");
                        
                    }else {
                        
                        jTextAreaDialogo.setText(Mia_Winters.mia_persuasion_casa_fallo);
                        jTextFieldEscritoJug.setText("");
                        
                    }
                    
                }else{
                    
                    int dado =  Funciones.numero_aleatorio();
                    int valor = per.getInteligencia();
                    
                    if(dado<=valor){
                        
                        jTextAreaDialogo.setText(Mia_Winters.mia_persuasion_casa_acierto1);
                        jTextFieldEscritoJug.setText("");
                        
                    }else {
                        
                        jTextAreaDialogo.setText(Mia_Winters.mia_persuasion_casa_fallo);
                        jTextFieldEscritoJug.setText("");
                        
                    }
                        
                    }
            
        }else if (conDig.contains(Mia_Winters.mia_continuacion) && conEsc.contains("Preguntar") && conEsc.contains("Marido") && palabras_clave.contains("Marido") || // ir a ver al marido
                conDig.contains(Mia_Winters.mia_continuacion) && conEsc.contains("preguntar") && conEsc.contains("Marido") && palabras_clave.contains("Marido")){
                    
                    jTextAreaDialogo.setText(Mia_Winters.mia_preguntar_marido1);
                    jTextFieldEscritoJug.setText("");
            
        }else if (conDig.contains(Mia_Winters.mia_continuacion) && conEsc.contains("Ir") && conEsc.contains("Alrededores casa") && palabras_clave.contains("Alrededores casa") || // ir a ver al marido
                conDig.contains(Mia_Winters.mia_continuacion) && conEsc.contains("ir") && conEsc.contains("Alrededores casa") && palabras_clave.contains("Alrededores casa")){
                    
                    jTextAreaDialogo.setText(Narrador.manicomio_casa);
                    jTextFieldEscritoJug.setText("");
                    
        }else if (conDig.contains(Mia_Winters.mia_continuacion) && conEsc.contains("Ir") && conEsc.contains("Biblioteca") && palabras_clave.contains("Biblioteca") || // ir a ver al marido
                conDig.contains(Mia_Winters.mia_continuacion) && conEsc.contains("ir") && conEsc.contains("Biblioteca") && palabras_clave.contains("Biblioteca")){
                    
                    jTextAreaDialogo.setText(Narrador.manicomio_biblioteca);
                    jTextFieldEscritoJug.setText("");
                    
        }else if (conDig.contains(Narrador.biblioteca1) && conEsc.contains("Buscar") && conEsc.contains("Biblioteca") && palabras_clave.contains("Biblioteca") || // ir a ver al marido
                conDig.contains(Narrador.biblioteca1) && conEsc.contains("buscar") && conEsc.contains("Biblioteca") && palabras_clave.contains("Biblioteca")){
                    
                     if(habilidades.contains("Buscar libros")){
                    
                    int dado = Funciones.numero_aleatorio()-40;
                    int valor = per.getEducacion();
                    
                    if(dado<=valor){
                        
                        jTextAreaDialogo.setText(Narrador.biblioteca_buscarlibros1);
                        jTextFieldEscritoJug.setText("");
                        
                    }else {
                        
                        jTextAreaDialogo.setText(Narrador.biblioteca_buscarlibros_fallo);
                        jTextFieldEscritoJug.setText("");
                        
                    }
                    
                }else{
                    
                    int dado =  Funciones.numero_aleatorio();
                    int valor = per.getInteligencia();
                    
                    if(dado<=valor){
                        
                        jTextAreaDialogo.setText(Narrador.biblioteca_buscarlibros1);
                        jTextFieldEscritoJug.setText("");
                        
                    }else {
                        
                        jTextAreaDialogo.setText(Narrador.biblioteca_buscarlibros_fallo);
                        jTextFieldEscritoJug.setText("");
                        
                    }
             }
        }else if (conDig.contains(Narrador.biblioteca_buscarlibros_fallo) && conEsc.contains("Buscar") && conEsc.contains("Biblioteca") && palabras_clave.contains("Biblioteca") || // ir a ver al marido
                conDig.contains(Narrador.biblioteca_buscarlibros_fallo) && conEsc.contains("buscar") && conEsc.contains("Biblioteca") && palabras_clave.contains("Biblioteca")){
            
            if(habilidades.contains("Buscar libros")){
                    
                    int dado = Funciones.numero_aleatorio()-40;
                    int valor = per.getEducacion();
                    
                    if(dado<=valor){
                        
                        jTextAreaDialogo.setText(Narrador.biblioteca_buscarlibros1);
                        jTextFieldEscritoJug.setText("");
                        
                    }else {
                        
                        jTextAreaDialogo.setText(Narrador.biblioteca_buscarlibros_fallo);
                        jTextFieldEscritoJug.setText("");
                        
                    }
                    
                }else{
                    
                    int dado =  Funciones.numero_aleatorio();
                    int valor = per.getInteligencia();
                    
                    if(dado<=valor){
                        
                        jTextAreaDialogo.setText(Narrador.biblioteca_buscarlibros1);
                        jTextFieldEscritoJug.setText("");
                        
                    }else {
                        
                        jTextAreaDialogo.setText(Narrador.biblioteca_buscarlibros_fallo);
                        jTextFieldEscritoJug.setText("");
                        
                    }
             }
            
        }else if (conDig.contains(Narrador.biblioteca_buscarlibros4) && conEsc.contains("Ir") && conEsc.contains("Alrededores casa") && palabras_clave.contains("Alrededores casa") || // ir a ver al marido
                conDig.contains(Narrador.biblioteca_buscarlibros4) && conEsc.contains("ir") && conEsc.contains("Alrededores casa") && palabras_clave.contains("Alrededores casa")){
            
            jTextAreaDialogo.setText(Narrador.biblioteca_casa);
            jTextFieldEscritoJug.setText("");
            
        }else if (conDig.contains(Narrador.biblioteca_buscarlibros4) && conEsc.contains("Ir") && conEsc.contains("Manicomio") && palabras_clave.contains("Manicomio") || // ir a ver al marido
                conDig.contains(Narrador.biblioteca_buscarlibros4) && conEsc.contains("ir") && conEsc.contains("Manicomio") && palabras_clave.contains("Manicomio")){
            
            jTextAreaDialogo.setText(Narrador.biblioteca_manicomio);
            jTextFieldEscritoJug.setText("");
            
        }else if (conDig.contains(Narrador.biblioteca_buscarlibros_fallo) && conEsc.contains("Ir") && conEsc.contains("Alrededores casa") && palabras_clave.contains("Alrededores casa") || // ir a ver al marido
                conDig.contains(Narrador.biblioteca_buscarlibros_fallo) && conEsc.contains("ir") && conEsc.contains("Alrededores casa") && palabras_clave.contains("Alrededores casa")){
            
            jTextAreaDialogo.setText(Narrador.biblioteca_casa);
            jTextFieldEscritoJug.setText("");
            
        }else if (conDig.contains(Narrador.biblioteca_buscarlibros_fallo) && conEsc.contains("Ir") && conEsc.contains("Manicomio") && palabras_clave.contains("Manicomio") || // ir a ver al marido
                conDig.contains(Narrador.biblioteca_buscarlibros_fallo) && conEsc.contains("ir") && conEsc.contains("Manicomio") && palabras_clave.contains("Manicomio")){
            
            jTextAreaDialogo.setText(Narrador.biblioteca_manicomio);
            jTextFieldEscritoJug.setText("");
            
        }else if (conDig.contains(Narrador.calle_casa3) && conEsc.contains("Hablar") && conEsc.contains("Señor") && palabras_clave.contains("Señor") || // ir a ver al marido
                conDig.contains(Narrador.calle_casa3) && conEsc.contains("hablar") && conEsc.contains("Señor") && palabras_clave.contains("Señor")){
            
            jTextAreaDialogo.setText(Señor.señor_saludo);
            jTextFieldEscritoJug.setText("");
            
        }else if (conDig.contains(Narrador.calle_casa3) && conEsc.contains("Hablar") && conEsc.contains("Señor") && palabras_clave.contains("Señor") || // ir a ver al marido
                conDig.contains(Narrador.calle_casa3) && conEsc.contains("hablar") && conEsc.contains("Señor") && palabras_clave.contains("Señor")){
            
            jTextAreaDialogo.setText(Señor.señor_saludo);
            jTextFieldEscritoJug.setText("");
            
        }else if (conDig.contains(Señor.señor_saludo) && conEsc.contains("Preguntar") && conEsc.contains("Casa") && palabras_clave.contains("Casa") || // ir a ver al marido
                conDig.contains(Señor.señor_saludo) && conEsc.contains("preguntar") && conEsc.contains("Casa") && palabras_clave.contains("Casa")){
            
            jTextAreaDialogo.setText(Señor.señor_preguntar_casa);
           
            if (palabras_clave.contains("John Corbitt")){
                
                jTextAreaDialogo.setText(Señor.señor_preguntar_casa);
                jTextFieldEscritoJug.setText("");
                
            }else{
                
                jTextAreaDialogo.setText(Señor.señor_preguntar_casa);
               
                palabras_clave.add("John Corbitt");
            
                model.removeAllElements();
          
                for(String aux : palabras_clave)
                    model.addElement(aux); 
                    jListClav.setModel(model);
               
                jTextFieldEscritoJug.setText("");
                
                
            }
            
             
            
        }else if (conDig.contains(Señor.señor_saludo) && conEsc.contains("Preguntar") && conEsc.contains("John Corbitt") && palabras_clave.contains("John Corbitt") || // ir a ver al marido
                conDig.contains(Señor.señor_saludo) && conEsc.contains("preguntar") && conEsc.contains("John Corbitt") && palabras_clave.contains("John Corbitt")){
            
            jTextAreaDialogo.setText(Señor.señor_preguntar_corbitt);
            
            palabras_clave.add("Iglesia");
            
                model.removeAllElements();
          
                for(String aux : palabras_clave)
                    model.addElement(aux); 
                    jListClav.setModel(model);
            
            jTextFieldEscritoJug.setText("");
            
        }else if (conDig.contains(Señor.señor_saludo) && conEsc.contains("Preguntar") && conEsc.contains("Iglesia") && palabras_clave.contains("Iglesia") || // ir a ver al marido
                conDig.contains(Señor.señor_saludo) && conEsc.contains("preguntar") && conEsc.contains("Iglesia") && palabras_clave.contains("Iglesia")){
            
            jTextAreaDialogo.setText(Señor.señor_preguntar_iglesia);
            jTextFieldEscritoJug.setText("");
            
        }else if (conDig.contains(Señor.señor_repeticion) && conEsc.contains("Preguntar") && conEsc.contains("Casa") && palabras_clave.contains("Casa") || // ir a ver al marido
                conDig.contains(Señor.señor_repeticion) && conEsc.contains("preguntar") && conEsc.contains("Casa") && palabras_clave.contains("Casa")){
            
            jTextAreaDialogo.setText(Señor.señor_preguntar_corbitt);
            jTextFieldEscritoJug.setText("");
            
        }else if (conDig.contains(Señor.señor_repeticion) && conEsc.contains("Preguntar") && conEsc.contains("John Corbitt") && palabras_clave.contains("John Corbitt") || // ir a ver al marido
                conDig.contains(Señor.señor_repeticion) && conEsc.contains("preguntar") && conEsc.contains("John Corbitt") && palabras_clave.contains("John Corbitt")){
            
           jTextAreaDialogo.setText(Señor.señor_preguntar_corbitt);
            
            palabras_clave.add("Iglesia");
            
                model.removeAllElements();
          
                for(String aux : palabras_clave)
                    model.addElement(aux); 
                    jListClav.setModel(model);
            
            jTextFieldEscritoJug.setText("");
            
        }else if (conDig.contains(Señor.señor_repeticion) && conEsc.contains("Preguntar") && conEsc.contains("Iglesia") && palabras_clave.contains("Iglesia") || // ir a ver al marido
                conDig.contains(Señor.señor_repeticion) && conEsc.contains("preguntar") && conEsc.contains("Iglesia") && palabras_clave.contains("Iglesia")){
            
            jTextAreaDialogo.setText(Señor.señor_preguntar_iglesia);
            jTextFieldEscritoJug.setText("");
            
        }else if (conDig.contains(Señor.señor_repeticion) && conEsc.contains("Ir") && conEsc.contains("Iglesia") && palabras_clave.contains("Iglesia") || // ir a ver al marido
                conDig.contains(Señor.señor_repeticion) && conEsc.contains("ir") && conEsc.contains("Iglesia") && palabras_clave.contains("Iglesia")){
            
            jTextAreaDialogo.setText(Narrador.calle_iglesia);
            jTextFieldEscritoJug.setText("");
            
        }else if (conDig.contains(Narrador.iglesia4) && conEsc.contains("Ir") && conEsc.contains("Casa") && palabras_clave.contains("Casa") || // ir a ver al marido
                conDig.contains(Narrador.iglesia4) && conEsc.contains("ir") && conEsc.contains("Casa") && palabras_clave.contains("Casa")){
            
            jTextAreaDialogo.setText(Narrador.iglesia_casa);
            jTextFieldEscritoJug.setText("");
            
        }else if (conDig.contains(Narrador.calle_casa3) && conEsc.contains("Ir") && conEsc.contains("Casa") && palabras_clave.contains("Casa") || // ir a ver al marido
                conDig.contains(Narrador.calle_casa3) && conEsc.contains("ir") && conEsc.contains("Casa") && palabras_clave.contains("Casa")){
            
            jTextAreaDialogo.setText(Narrador.calle_casa);
            jTextFieldEscritoJug.setText("");
            
        }else if (conDig.contains(Narrador.casa2) && conEsc.contains("Ir") && conEsc.contains("Sala de estar") && palabras_clave.contains("Sala de estar") || // ir a ver al marido
                conDig.contains(Narrador.casa2) && conEsc.contains("ir") && conEsc.contains("Sala de estar") && palabras_clave.contains("Sala de estar")){
            
            jTextAreaDialogo.setText(Narrador.casa_sala_de_estar);
            jTextFieldEscritoJug.setText("");
            
        }else if (conDig.contains(Narrador.casa2) && conEsc.contains("Ir") && conEsc.contains("Comedor") && palabras_clave.contains("Comedor") || // ir a ver al marido
                conDig.contains(Narrador.casa2) && conEsc.contains("ir") && conEsc.contains("Comedor") && palabras_clave.contains("Comedor")){
            
            jTextAreaDialogo.setText(Narrador.casa_comedor);
           
            jTextFieldEscritoJug.setText("");
            
        }else if (conDig.contains(Narrador.casa2) && conEsc.contains("Ir") && conEsc.contains("Cocina") && palabras_clave.contains("Cocina") || // ir a ver al marido
                conDig.contains(Narrador.casa2) && conEsc.contains("ir") && conEsc.contains("Cocina") && palabras_clave.contains("Cocina")){
            
            jTextAreaDialogo.setText(Narrador.casa_cocina);
            
            palabras_clave.add("Sotano");
            
             model.removeAllElements();
          
            for(String aux : palabras_clave)
               model.addElement(aux); 
               jListClav.setModel(model);
            
            jTextFieldEscritoJug.setText("");
            
        }else if (conDig.contains(Narrador.casa2) && conEsc.contains("Ir") && conEsc.contains("Escalera") && palabras_clave.contains("Escalera") || // ir a ver al marido
                conDig.contains(Narrador.casa2) && conEsc.contains("ir") && conEsc.contains("Escalera") && palabras_clave.contains("Escalera")){
            
            jTextAreaDialogo.setText(Narrador.casa_escalera);
            jTextFieldEscritoJug.setText("");
            
        }else if (conDig.contains(Narrador.casa_sala_de_estar) && conEsc.contains("Buscar") && conEsc.contains("Sala de estar") && palabras_clave.contains("Sala de estar") || // ir a ver al marido
                conDig.contains(Narrador.casa_sala_de_estar) && conEsc.contains("buscar") && conEsc.contains("Sala de estar") && palabras_clave.contains("Sala de estar")){
            
            jTextAreaDialogo.setText(Narrador.casa_busqueda_salon1);
            jTextFieldEscritoJug.setText("");
            
        }else if (conDig.contains(Narrador.casa_busqueda_salon2) && conEsc.contains("Ir") && conEsc.contains("Comedor") && palabras_clave.contains("Comedor") || // ir a ver al marido
                conDig.contains(Narrador.casa_busqueda_salon2) && conEsc.contains("ir") && conEsc.contains("Comedor") && palabras_clave.contains("Comedor")){
            
            jTextAreaDialogo.setText(Narrador.casa_comedor);
            jTextFieldEscritoJug.setText("");
            
        }else if (conDig.contains(Narrador.casa_busqueda_salon2) && conEsc.contains("Ir") && conEsc.contains("Cocina") && palabras_clave.contains("Cocina") || // ir a ver al marido
                conDig.contains(Narrador.casa_busqueda_salon2) && conEsc.contains("ir") && conEsc.contains("Cocina") && palabras_clave.contains("Cocina")){
            
            jTextAreaDialogo.setText(Narrador.casa_cocina);
            
            palabras_clave.add("Sotano");
            
             model.removeAllElements();
          
            for(String aux : palabras_clave)
               model.addElement(aux); 
               jListClav.setModel(model);
               
            jTextFieldEscritoJug.setText("");
            
        }else if (conDig.contains(Narrador.casa_busqueda_salon2) && conEsc.contains("Ir") && conEsc.contains("Escalera") && palabras_clave.contains("Escalera") || // ir a ver al marido
                conDig.contains(Narrador.casa_busqueda_salon2) && conEsc.contains("ir") && conEsc.contains("Escalera") && palabras_clave.contains("Escalera")){
            
            jTextAreaDialogo.setText(Narrador.casa_escalera);
            jTextFieldEscritoJug.setText("");
            
        }else if (conDig.contains(Narrador.casa_busqueda_salon2) && conEsc.contains("Ir") && conEsc.contains("Comedor") && palabras_clave.contains("Comedor") || // ir a ver al marido
                conDig.contains(Narrador.casa_busqueda_salon2) && conEsc.contains("ir") && conEsc.contains("Comedor") && palabras_clave.contains("Comedor")){
            
            jTextAreaDialogo.setText(Narrador.casa_comedor);
            jTextFieldEscritoJug.setText("");
            
        }else if (conDig.contains(Narrador.casa_busqueda_salon2) && conEsc.contains("Ir") && conEsc.contains("Cocina") && palabras_clave.contains("Cocina") || // ir a ver al marido
                conDig.contains(Narrador.casa_busqueda_salon2) && conEsc.contains("ir") && conEsc.contains("Cocina") && palabras_clave.contains("Cocina")){
            
            jTextAreaDialogo.setText(Narrador.casa_cocina);
            
            palabras_clave.add("Sotano");
            
             model.removeAllElements();
          
            for(String aux : palabras_clave)
               model.addElement(aux); 
               jListClav.setModel(model);
            
            jTextFieldEscritoJug.setText("");
            
        }else if (conDig.contains(Narrador.casa_busqueda_salon2) && conEsc.contains("Ir") && conEsc.contains("Escalera") && palabras_clave.contains("Escalera") || // ir a ver al marido
                conDig.contains(Narrador.casa_busqueda_salon2) && conEsc.contains("ir") && conEsc.contains("Escalera") && palabras_clave.contains("Escalera")){
            
            jTextAreaDialogo.setText(Narrador.casa_escalera);
            jTextFieldEscritoJug.setText("");
            
        }else if (conDig.contains(Narrador.casa_comedor) && conEsc.contains("Buscar") && conEsc.contains("Comedor") && palabras_clave.contains("Comedor") || // ir a ver al marido
                conDig.contains(Narrador.casa_comedor) && conEsc.contains("buscar") && conEsc.contains("Comedor") && palabras_clave.contains("Comedor")){
            
            jTextAreaDialogo.setText(Narrador.casa_busqueda_comedor);
            
            inventario.add("Cuchillo");
            
             model2.removeAllElements();
          
            for(String aux : inventario)
               model2.addElement(aux); 
               jListInv.setModel(model2);
            
            jTextFieldEscritoJug.setText("");
            
        }else if (conDig.contains(Narrador.casa_comedor) && conEsc.contains("Ir") && conEsc.contains("Sala de estar") && palabras_clave.contains("Sala de estar") || // ir a ver al marido
                conDig.contains(Narrador.casa_comedor) && conEsc.contains("ir") && conEsc.contains("Sala de estar") && palabras_clave.contains("Sala de estar")){
            
            jTextAreaDialogo.setText(Narrador.casa_sala_de_estar);
            jTextFieldEscritoJug.setText("");
            
        }else if (conDig.contains(Narrador.casa_comedor) && conEsc.contains("Ir") && conEsc.contains("Cocina") && palabras_clave.contains("Cocina") || // ir a ver al marido
                conDig.contains(Narrador.casa_comedor) && conEsc.contains("ir") && conEsc.contains("Cocina") && palabras_clave.contains("Cocina")){
            
            jTextAreaDialogo.setText(Narrador.casa_cocina);
            
            palabras_clave.add("Sotano");
            
             model.removeAllElements();
          
            for(String aux : palabras_clave)
               model.addElement(aux); 
               jListClav.setModel(model);
               
            jTextFieldEscritoJug.setText("");
            
        }else if (conDig.contains(Narrador.casa_comedor) && conEsc.contains("Ir") && conEsc.contains("Escalera") && palabras_clave.contains("Escalera") || // ir a ver al marido
                conDig.contains(Narrador.casa_comedor) && conEsc.contains("ir") && conEsc.contains("Escalera") && palabras_clave.contains("Escalera")){
            
            jTextAreaDialogo.setText(Narrador.casa_escalera);
            jTextFieldEscritoJug.setText("");
            
        }else if (conDig.contains(Narrador.casa_busqueda_comedor) && conEsc.contains("Ir") && conEsc.contains("Sala de estar") && palabras_clave.contains("Sala de estar") || // ir a ver al marido
                conDig.contains(Narrador.casa_busqueda_comedor) && conEsc.contains("ir") && conEsc.contains("Sala de estar") && palabras_clave.contains("Sala de estar")){
            
            jTextAreaDialogo.setText(Narrador.casa_sala_de_estar);
            jTextFieldEscritoJug.setText("");
            
        }else if (conDig.contains(Narrador.casa_busqueda_comedor) && conEsc.contains("Ir") && conEsc.contains("Cocina") && palabras_clave.contains("Cocina") || // ir a ver al marido
                conDig.contains(Narrador.casa_busqueda_comedor) && conEsc.contains("ir") && conEsc.contains("Cocina") && palabras_clave.contains("Cocina")){
            
            jTextAreaDialogo.setText(Narrador.casa_cocina);
            
             model.removeAllElements();
          
            for(String aux : palabras_clave)
               model.addElement(aux); 
               jListClav.setModel(model);
            
            jTextFieldEscritoJug.setText("");
            
        }else if (conDig.contains(Narrador.casa_busqueda_comedor) && conEsc.contains("Ir") && conEsc.contains("Escalera") && palabras_clave.contains("Escalera") || // ir a ver al marido
                conDig.contains(Narrador.casa_busqueda_comedor) && conEsc.contains("ir") && conEsc.contains("Escalera") && palabras_clave.contains("Escalera")){
            
            jTextAreaDialogo.setText(Narrador.casa_escalera);
            jTextFieldEscritoJug.setText("");
            
        }else if (conDig.contains(Narrador.casa_cocina) && conEsc.contains("Ir") && conEsc.contains("Sotano") && palabras_clave.contains("Sotano") || // ir a ver al marido
                conDig.contains(Narrador.casa_cocina) && conEsc.contains("ir") && conEsc.contains("Sotano") && palabras_clave.contains("Sotano")){
            
            jTextAreaDialogo.setText(Narrador.casa_sotano1);
            jTextFieldEscritoJug.setText("");
            
        }else if (conDig.contains(Narrador.casa_sala_de_estar) && conEsc.contains("Ir") && conEsc.contains("Escalera") && palabras_clave.contains("Escalera") || // ir a ver al marido
                conDig.contains(Narrador.casa_sala_de_estar) && conEsc.contains("ir") && conEsc.contains("Escalera") && palabras_clave.contains("Escalera")){
            
            jTextAreaDialogo.setText(Narrador.casa_escalera);
            jTextFieldEscritoJug.setText("");
            
        }else if (conDig.contains(Narrador.casa_sala_de_estar) && conEsc.contains("Ir") && conEsc.contains("Cocina") && palabras_clave.contains("Cocina") || // ir a ver al marido
                conDig.contains(Narrador.casa_sala_de_estar) && conEsc.contains("ir") && conEsc.contains("Cocina") && palabras_clave.contains("Cocina")){
            
            jTextAreaDialogo.setText(Narrador.casa_cocina);
            jTextFieldEscritoJug.setText("");
            
        }else if (conDig.contains(Narrador.casa_sala_de_estar) && conEsc.contains("Ir") && conEsc.contains("Comedor") && palabras_clave.contains("Comedor") || // ir a ver al marido
                conDig.contains(Narrador.casa_sala_de_estar) && conEsc.contains("ir") && conEsc.contains("Comedor") && palabras_clave.contains("Comedor")){
            
            jTextAreaDialogo.setText(Narrador.casa_comedor);
            jTextFieldEscritoJug.setText("");
            
        }else if (conDig.contains(Narrador.casa_sala_de_estar) && conEsc.contains("Buscar") && conEsc.contains("Sala de estar") && palabras_clave.contains("Sala de estar") || // ir a ver al marido
                conDig.contains(Narrador.casa_sala_de_estar) && conEsc.contains("buscar") && conEsc.contains("Sala de estar") && palabras_clave.contains("Sala de estar")){
            
            jTextAreaDialogo.setText(Narrador.casa_busqueda_salon1);
            jTextFieldEscritoJug.setText("");
            
        }else if (conDig.contains(Narrador.casa_busqueda_salon2) && conEsc.contains("Ir") && conEsc.contains("Escalera") && palabras_clave.contains("Escalera") || // ir a ver al marido
                conDig.contains(Narrador.casa_busqueda_salon2) && conEsc.contains("ir") && conEsc.contains("Escalera") && palabras_clave.contains("Escalera")){
            
            jTextAreaDialogo.setText(Narrador.casa_escalera);
            jTextFieldEscritoJug.setText("");
            
        }else if (conDig.contains(Narrador.casa_busqueda_salon2) && conEsc.contains("Ir") && conEsc.contains("Cocina") && palabras_clave.contains("Cocina") || // ir a ver al marido
                conDig.contains(Narrador.casa_busqueda_salon2) && conEsc.contains("ir") && conEsc.contains("Cocina") && palabras_clave.contains("Cocina")){
            
            jTextAreaDialogo.setText(Narrador.casa_cocina);
            jTextFieldEscritoJug.setText("");
            
        }else if (conDig.contains(Narrador.casa_busqueda_salon2) && conEsc.contains("Ir") && conEsc.contains("Comedor") && palabras_clave.contains("Comedor") || // ir a ver al marido
                conDig.contains(Narrador.casa_busqueda_salon2) && conEsc.contains("ir") && conEsc.contains("Comedor") && palabras_clave.contains("Comedor")){
            
            jTextAreaDialogo.setText(Narrador.casa_comedor);
            jTextFieldEscritoJug.setText("");
            
        }else if (conDig.contains(Narrador.casa_cocina) && conEsc.contains("Ir") && conEsc.contains("Sala de estar") && palabras_clave.contains("Sala de estar") || // ir a ver al marido
                conDig.contains(Narrador.casa_cocina) && conEsc.contains("ir") && conEsc.contains("Sala de estar") && palabras_clave.contains("Sala de estar")){
            
            jTextAreaDialogo.setText(Narrador.casa_sala_de_estar);
            jTextFieldEscritoJug.setText("");
            
        }else if (conDig.contains(Narrador.casa_cocina) && conEsc.contains("Ir") && conEsc.contains("Comedor") && palabras_clave.contains("Comedor") || // ir a ver al marido
                conDig.contains(Narrador.casa_cocina) && conEsc.contains("ir") && conEsc.contains("Comedor") && palabras_clave.contains("Comedor")){
            
            jTextAreaDialogo.setText(Narrador.casa_comedor);
            jTextFieldEscritoJug.setText("");
            
        }else if (conDig.contains(Narrador.casa_cocina) && conEsc.contains("Ir") && conEsc.contains("Escalera") && palabras_clave.contains("Escalera") || // ir a ver al marido
                conDig.contains(Narrador.casa_busqueda_comedor) && conEsc.contains("ir") && conEsc.contains("Escalera") && palabras_clave.contains("Escalera")){
            
            jTextAreaDialogo.setText(Narrador.casa_escalera);
            jTextFieldEscritoJug.setText("");
            
        }else if (conDig.contains(Narrador.casa_escalera) && conEsc.contains("Ir") && conEsc.contains("Habitacion hijo1") && palabras_clave.contains("Habitacion hijo1") || // ir a ver al marido
                conDig.contains(Narrador.casa_escalera) && conEsc.contains("ir") && conEsc.contains("Habitacion hijo1") && palabras_clave.contains("Habitacion hijo1")){
            
            jTextAreaDialogo.setText(Narrador.casa_cuarto_hijo_1);
            jTextFieldEscritoJug.setText("");
            
        }else if (conDig.contains(Narrador.casa_escalera) && conEsc.contains("Ir") && conEsc.contains("Habitacion hijo2") && palabras_clave.contains("Habitacion hijo2") || // ir a ver al marido
                conDig.contains(Narrador.casa_escalera) && conEsc.contains("ir") && conEsc.contains("Habitacion hijo2") && palabras_clave.contains("Habitacion hijo2")){
            
            jTextAreaDialogo.setText(Narrador.casa_cuarto_hijo_2);
            jTextFieldEscritoJug.setText("");
            
        }else if (conDig.contains(Narrador.casa_escalera) && conEsc.contains("Ir") && conEsc.contains("Habitacion padres") && palabras_clave.contains("Habitacion padres") || // ir a ver al marido
                conDig.contains(Narrador.casa_escalera) && conEsc.contains("ir") && conEsc.contains("Habitacion padres") && palabras_clave.contains("Habitacion padres")){
            
            jTextAreaDialogo.setText(Narrador.casa_cuarto_padres);
            jTextFieldEscritoJug.setText("");
            
        }else if (conDig.contains(Narrador.casa_escalera) && conEsc.contains("Ir") && conEsc.contains("Despacho") && palabras_clave.contains("Despacho") || // ir a ver al marido
                conDig.contains(Narrador.casa_escalera) && conEsc.contains("ir") && conEsc.contains("Despacho") && palabras_clave.contains("Despacho")){
            
            jTextAreaDialogo.setText(Narrador.casa_busqueda_despacho1);
            jTextFieldEscritoJug.setText("");
            
        }else if (conDig.contains(Narrador.casa_escalera) && conEsc.contains("Ir") && conEsc.contains("Escalera") && palabras_clave.contains("Escalera") || // ir a ver al marido
                conDig.contains(Narrador.casa_escalera) && conEsc.contains("ir") && conEsc.contains("Escalera") && palabras_clave.contains("Escalera")){
            
            jTextAreaDialogo.setText(Narrador.casa_escalera2);
            jTextFieldEscritoJug.setText("");
            
        }else if (conDig.contains(Narrador.casa_despacho) && conEsc.contains("Ir") && conEsc.contains("Habitacion padres") && palabras_clave.contains("Habitacion padres") || // ir a ver al marido
                conDig.contains(Narrador.casa_despacho) && conEsc.contains("ir") && conEsc.contains("Habitacion padres") && palabras_clave.contains("Habitacion padres")){
            
            jTextAreaDialogo.setText(Narrador.casa_cuarto_padres);
            jTextFieldEscritoJug.setText("");
            
        }else if (conDig.contains(Narrador.casa_despacho) && conEsc.contains("Ir") && conEsc.contains("Habitacion hijo1") && palabras_clave.contains("Habitacion hijo1") || // ir a ver al marido
                conDig.contains(Narrador.casa_despacho) && conEsc.contains("ir") && conEsc.contains("Habitacion hijo1") && palabras_clave.contains("Habitacion hijo1")){
            
            jTextAreaDialogo.setText(Narrador.casa_cuarto_hijo_1);
            jTextFieldEscritoJug.setText("");
            
        }else if (conDig.contains(Narrador.casa_despacho) && conEsc.contains("Ir") && conEsc.contains("Habitacion hijo2") && palabras_clave.contains("Habitacion hijo2") || // ir a ver al marido
                conDig.contains(Narrador.casa_despacho) && conEsc.contains("ir") && conEsc.contains("Habitacion hijo2") && palabras_clave.contains("Habitacion hijo2")){
            
            jTextAreaDialogo.setText(Narrador.casa_cuarto_hijo_2);
            jTextFieldEscritoJug.setText("");
            
        }else if (conDig.contains(Narrador.casa_despacho) && conEsc.contains("Buscar") && conEsc.contains("Despacho") && palabras_clave.contains("Despacho") || // ir a ver al marido
                conDig.contains(Narrador.casa_despacho) && conEsc.contains("buscar") && conEsc.contains("Despacho") && palabras_clave.contains("Despacho")){
            
            jTextAreaDialogo.setText(Narrador.casa_busqueda_despacho1);
            jTextFieldEscritoJug.setText("");
            
        }else if (conDig.contains(Narrador.casa_busqueda_despacho2) && conEsc.contains("Ir") && conEsc.contains("Habitacion hijo1") && palabras_clave.contains("Habitacion hijo1") || // ir a ver al marido
                conDig.contains(Narrador.casa_busqueda_despacho2) && conEsc.contains("ir") && conEsc.contains("Habitacion hijo1") && palabras_clave.contains("Habitacion hijo1")){
            
            jTextAreaDialogo.setText(Narrador.casa_cuarto_hijo_1);
            jTextFieldEscritoJug.setText("");
            
        }else if (conDig.contains(Narrador.casa_busqueda_despacho2) && conEsc.contains("Ir") && conEsc.contains("Habitacion hijo2") && palabras_clave.contains("Habitacion hijo2") || // ir a ver al marido
                conDig.contains(Narrador.casa_busqueda_despacho2) && conEsc.contains("ir") && conEsc.contains("Habitacion hijo2") && palabras_clave.contains("Habitacion hijo2")){
            
            jTextAreaDialogo.setText(Narrador.casa_cuarto_hijo_2);
            jTextFieldEscritoJug.setText("");
            
        }else if (conDig.contains(Narrador.casa_busqueda_despacho2) && conEsc.contains("Ir") && conEsc.contains("Habitacion padres") && palabras_clave.contains("Habitacion padres") || // ir a ver al marido
                conDig.contains(Narrador.casa_busqueda_despacho2) && conEsc.contains("ir") && conEsc.contains("Habitacion padres") && palabras_clave.contains("Habitacion padres")){
            
            jTextAreaDialogo.setText(Narrador.casa_cuarto_padres);
            jTextFieldEscritoJug.setText("");
            
        }else if (conDig.contains(Narrador.casa_busqueda_despacho2) && conEsc.contains("Ir") && conEsc.contains("Escaleras") && palabras_clave.contains("Escaleras") || // ir a ver al marido
                conDig.contains(Narrador.casa_busqueda_despacho2) && conEsc.contains("ir") && conEsc.contains("Escaleras") && palabras_clave.contains("Escaleras")){
            
            jTextAreaDialogo.setText(Narrador.casa_cuarto_hijo_1);
            jTextFieldEscritoJug.setText("");
            
        }else if (conDig.contains(Narrador.casa_cuarto_hijo_1) && conEsc.contains("Ir") && conEsc.contains("Habitacion hijo2") && palabras_clave.contains("Habitacion hijo2") || // ir a ver al marido
                conDig.contains(Narrador.casa_cuarto_hijo_1) && conEsc.contains("ir") && conEsc.contains("Habitacion hijo2") && palabras_clave.contains("Habitacion hijo2")){
            
            jTextAreaDialogo.setText(Narrador.casa_cuarto_hijo_2);
            jTextFieldEscritoJug.setText("");
            
        }else if (conDig.contains(Narrador.casa_cuarto_hijo_1) && conEsc.contains("Ir") && conEsc.contains("Habitacion padres") && palabras_clave.contains("Habitacion padres") || // ir a ver al marido
                conDig.contains(Narrador.casa_cuarto_hijo_1) && conEsc.contains("ir") && conEsc.contains("Habitacion padres") && palabras_clave.contains("Habitacion padres")){
            
            jTextAreaDialogo.setText(Narrador.casa_cuarto_padres);
            jTextFieldEscritoJug.setText("");
            
        }else if (conDig.contains(Narrador.casa_cuarto_hijo_1) && conEsc.contains("Ir") && conEsc.contains("Escaleras") && palabras_clave.contains("Escaleras") || // ir a ver al marido
                conDig.contains(Narrador.casa_cuarto_hijo_1) && conEsc.contains("ir") && conEsc.contains("Escaleras") && palabras_clave.contains("Escaleras")){
            
            jTextAreaDialogo.setText(Narrador.casa_escalera2);
            jTextFieldEscritoJug.setText("");
            
        }else if (conDig.contains(Narrador.casa_cuarto_hijo_2) && conEsc.contains("Ir") && conEsc.contains("Escaleras") && palabras_clave.contains("Escaleras") || // ir a ver al marido
                conDig.contains(Narrador.casa_cuarto_hijo_2) && conEsc.contains("ir") && conEsc.contains("Escaleras") && palabras_clave.contains("Escaleras")){
            
            jTextAreaDialogo.setText(Narrador.casa_escalera2);
            jTextFieldEscritoJug.setText("");
            
        }else if (conDig.contains(Narrador.casa_cuarto_hijo_2) && conEsc.contains("Ir") && conEsc.contains("Habitacion padres") && palabras_clave.contains("Habitacion padres") || // ir a ver al marido
                conDig.contains(Narrador.casa_cuarto_hijo_2) && conEsc.contains("ir") && conEsc.contains("Habitacion padres") && palabras_clave.contains("Habitacion padres")){
            
            jTextAreaDialogo.setText(Narrador.casa_cuarto_padres);
            jTextFieldEscritoJug.setText("");
            
        }else if (conDig.contains(Narrador.casa_cuarto_hijo_2) && conEsc.contains("Ir") && conEsc.contains("Habitacion hijo1") && palabras_clave.contains("Habitacion hijo1") || // ir a ver al marido
                conDig.contains(Narrador.casa_cuarto_hijo_2) && conEsc.contains("ir") && conEsc.contains("Habitacion hijo1") && palabras_clave.contains("Habitacion hijo1")){
            
            jTextAreaDialogo.setText(Narrador.casa_cuarto_hijo_2);
            jTextFieldEscritoJug.setText("");
            
        }else if (conDig.contains(Narrador.casa_cuarto_padres) && conEsc.contains("Ir") && conEsc.contains("Habitacion hijo1") && palabras_clave.contains("Habitacion hijo1") || // ir a ver al marido
                conDig.contains(Narrador.casa_cuarto_padres) && conEsc.contains("ir") && conEsc.contains("Habitacion hijo1") && palabras_clave.contains("Habitacion hijo1")){
            
            jTextAreaDialogo.setText(Narrador.casa_cuarto_hijo_1);
            jTextFieldEscritoJug.setText("");
            
        }else if (conDig.contains(Narrador.casa_cuarto_padres) && conEsc.contains("Ir") && conEsc.contains("Habitacion hijo2") && palabras_clave.contains("Habitacion hijo2") || // ir a ver al marido
                conDig.contains(Narrador.casa_cuarto_padres) && conEsc.contains("ir") && conEsc.contains("Habitacion hijo2") && palabras_clave.contains("Habitacion hijo2")){
            
            jTextAreaDialogo.setText(Narrador.casa_cuarto_hijo_2);
            jTextFieldEscritoJug.setText("");
            
        }else if (conDig.contains(Narrador.casa_cuarto_padres) && conEsc.contains("Ir") && conEsc.contains("Despacho") && palabras_clave.contains("Habitacion hijo1") || // ir a ver al marido
                conDig.contains(Narrador.casa_cuarto_padres) && conEsc.contains("ir") && conEsc.contains("Despacho") && palabras_clave.contains("Habitacion hijo1")){
            
            jTextAreaDialogo.setText(Narrador.casa_despacho);
            jTextFieldEscritoJug.setText("");
            
        }else if (conDig.contains(Narrador.casa_sotano2) && conEsc.contains("Bucar") && conEsc.contains("Sotano") && palabras_clave.contains("Sotano") || // ir a ver al marido
                conDig.contains(Narrador.casa_sotano2) && conEsc.contains("buscar") && conEsc.contains("Sotano") && palabras_clave.contains("Sotano")){
            
            jTextAreaDialogo.setText(Narrador.casa_busqueda_sotano1);
            jTextFieldEscritoJug.setText("");
            
        }else if (conDig.contains(Narrador.casa_busqueda_sotano2) && conEsc.contains("Ir") && conEsc.contains("Puerta oculta") && palabras_clave.contains("Puerta oculta") || // ir a ver al marido
                conDig.contains(Narrador.casa_busqueda_sotano2) && conEsc.contains("ir") && conEsc.contains("Puerta oculta") && palabras_clave.contains("Puerta oculta")){
            
            jTextAreaDialogo.setText(Narrador.casa_ritual);
            jTextFieldEscritoJug.setText("");
            
        }else if (conDig.contains(Narrador.calle_casa3) && conEsc.contains("Ir") && conEsc.contains("Manicomio") && palabras_clave.contains("Manicomio") || // ir a ver al marido
                conDig.contains(Narrador.calle_casa3) && conEsc.contains("ir") && conEsc.contains("Manicomio") && palabras_clave.contains("Manicomio")){
            
            jTextAreaDialogo.setText(Narrador.calle_manicommio);
            jTextFieldEscritoJug.setText("");
            
        }else if (conDig.contains(Narrador.calle_casa3) && conEsc.contains("Ir") && conEsc.contains("Biblioteca") && palabras_clave.contains("Biblioteca") || // ir a ver al marido
                conDig.contains(Narrador.calle_casa3) && conEsc.contains("ir") && conEsc.contains("Biblioteca") && palabras_clave.contains("Biblioteca")){
            
            jTextAreaDialogo.setText(Narrador.calle_biblioteca);
            jTextFieldEscritoJug.setText("");
            
        }else if (conDig.contains(Narrador.biblioteca1) && conEsc.contains("Ir") && conEsc.contains("Manicomio") && palabras_clave.contains("Manicomio") || // ir a ver al marido
                conDig.contains(Narrador.biblioteca1) && conEsc.contains("ir") && conEsc.contains("Manicomio") && palabras_clave.contains("Manicomio")){
            
            jTextAreaDialogo.setText(Narrador.biblioteca_manicomio);
            jTextFieldEscritoJug.setText("");
            
        }else if (conDig.contains(Narrador.biblioteca1) && conEsc.contains("Ir") && conEsc.contains("Alrededores casa") && palabras_clave.contains("Alrededor casa") || // ir a ver al marido
                conDig.contains(Narrador.biblioteca1) && conEsc.contains("ir") && conEsc.contains("Alrededores casa") && palabras_clave.contains("Alrededor casa")){
            
            jTextAreaDialogo.setText(Narrador.biblioteca_casa);
            jTextFieldEscritoJug.setText("");
            
        }else if (conDig.contains(Narrador.manicomio2) && conEsc.contains("Ir") && conEsc.contains("Biblioteca") && palabras_clave.contains("Biblioteca") || // ir a ver al marido
                conDig.contains(Narrador.manicomio2) && conEsc.contains("ir") && conEsc.contains("Biblioteca") && palabras_clave.contains("Biblioteca")){
            
            jTextAreaDialogo.setText(Narrador.manicomio_biblioteca);
            jTextFieldEscritoJug.setText("");
            
        }else if (conDig.contains(Narrador.manicomio2) && conEsc.contains("Ir") && conEsc.contains("Alrededores casa") && palabras_clave.contains("Alrededor casa") || // ir a ver al marido
                conDig.contains(Narrador.manicomio2) && conEsc.contains("ir") && conEsc.contains("Alrededores casa") && palabras_clave.contains("Alrededor casa")){
            
            jTextAreaDialogo.setText(Narrador.manicomio_casa);
            jTextFieldEscritoJug.setText("");
            
        }else if (conDig.contains(Narrador.manicomio2) && conEsc.contains("Ir") && conEsc.contains("Casa") && palabras_clave.contains("Casa") || // ir a ver al marido
                conDig.contains(Narrador.manicomio2) && conEsc.contains("ir") && conEsc.contains("Casa") && palabras_clave.contains("Casa")){
            
            JOptionPane.showMessageDialog(null,"ves primero a los alredeores de la casa");
            jTextFieldEscritoJug.setText("");
            
        }else if (conDig.contains(Narrador.biblioteca1) && conEsc.contains("Ir") && conEsc.contains("Casa") && palabras_clave.contains("Casa") || // ir a ver al marido
                conDig.contains(Narrador.biblioteca1) && conEsc.contains("ir") && conEsc.contains("Casa") && palabras_clave.contains("Casa")){
            
            JOptionPane.showMessageDialog(null,"ves primero a los alredeores de la casa");
            jTextFieldEscritoJug.setText("");
            
        }else if (conDig.contains(Narrador.bar3) && conEsc.contains("Ir") && conEsc.contains("Casa") && palabras_clave.contains("Casa") || // ir a ver al marido
                conDig.contains(Narrador.bar3) && conEsc.contains("ir") && conEsc.contains("Casa") && palabras_clave.contains("Casa")){
            
            JOptionPane.showMessageDialog(null,"ves primero a los alredeores de la casa");
            jTextFieldEscritoJug.setText("");
            
        }else if (conDig.contains(Narrador.manicomio_marido_persuasion_acierto2) && conEsc.contains("Ir") && conEsc.contains("Casa") && palabras_clave.contains("Casa") || // ir a ver al marido
                conDig.contains(Narrador.manicomio_marido_persuasion_acierto2) && conEsc.contains("ir") && conEsc.contains("Casa") && palabras_clave.contains("Casa")){
            
            JOptionPane.showMessageDialog(null,"ves primero a los alredeores de la casa");
            jTextFieldEscritoJug.setText("");
            
       }else if (conDig.contains(Narrador.manicomio_marido_persuasion_fallo) && conEsc.contains("Ir") && conEsc.contains("Casa") && palabras_clave.contains("Casa") || // ir a ver al marido
                conDig.contains(Narrador.manicomio_marido_persuasion_fallo) && conEsc.contains("ir") && conEsc.contains("Casa") && palabras_clave.contains("Casa")){
            
            JOptionPane.showMessageDialog(null,"ves primero a los alredeores de la casa");
            jTextFieldEscritoJug.setText("");
            
        }else if (conDig.contains(Narrador.manicomio_maridorevision) && conEsc.contains("Ir") && conEsc.contains("Casa") && palabras_clave.contains("Casa") || // ir a ver al marido
                conDig.contains(Narrador.manicomio_maridorevision) && conEsc.contains("ir") && conEsc.contains("Casa") && palabras_clave.contains("Casa")){
            
            JOptionPane.showMessageDialog(null,"ves primero a los alredeores de la casa");
            jTextFieldEscritoJug.setText("");
            
        }else if (conDig.contains(Mia_Winters.mia_continuacion) && conEsc.contains("Ir") && conEsc.contains("Casa") && palabras_clave.contains("Casa") || // ir a ver al marido
                conDig.contains(Mia_Winters.mia_continuacion) && conEsc.contains("ir") && conEsc.contains("Casa") && palabras_clave.contains("Casa")){
            
            JOptionPane.showMessageDialog(null,"ves primero a los alredeores de la casa");
            jTextFieldEscritoJug.setText("");
            
        }
    }//GEN-LAST:event_jTextFieldEscritoJugActionPerformed

    private void jButtonGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonGuardarActionPerformed
        
        System.out.println("Accedo al metodo");
        XStream xstream = new XStream(new DomDriver());
        EstructuraGuardado partida = new EstructuraGuardado();
        System.out.println("Genero XStream");
        
        try
        {
            String rutimg = jLabelImg.getIcon().toString();
            partida.setRutaImagen(rutimg);

        }
        catch(Exception e)
        {
            System.err.println(e);
            partida.setRutaImagen("");
        }
        System.out.println("Genero imagen");
       
        partida.setInventario(inventario);
        partida.setPalabasClave(palabras_clave);
        partida.setHabilidades(habilidades);
        partida.setDialogo(jTextAreaDialogo.getText());
        partida.setPersonaje(per);
        //partida.setRutaImagen(jLabelImg.getIcon().toString());
         
        
        String xml = xstream.toXML(partida);
        
        try {
            FileWriter file_output_xml = new FileWriter(new File("src/PartidaGuardada/partida.xml"));
            file_output_xml.write("<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n");
            file_output_xml.write(xml);
            file_output_xml.close();
        } catch(IOException e){
            System.err.println(e);
            
            try{
                FileWriter file_output_xml = new FileWriter(new File("..//src//PartidaGuardada//partida.xml"));
                file_output_xml.write("<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n");
                file_output_xml.write(xml);
                file_output_xml.close();
            }
            catch(IOException e2)
            {
                System.err.println(e2);
            }
        }

        
    }//GEN-LAST:event_jButtonGuardarActionPerformed

    private void jButtonSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalirActionPerformed
        // TODO add your handling code here:
        
         new Intro().setVisible(true);
        sonido1.stop();
        sonido2.stop();
        this.dispose();
        
    }//GEN-LAST:event_jButtonSalirActionPerformed

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        // TODO add your handling code here:
        
        this.dispose();
        
    }//GEN-LAST:event_formWindowClosed

    private void jButtonEstActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEstActionPerformed
        // TODO add your handling code here:
         new Estadisticas(per,habilidades).setVisible(true);
    }//GEN-LAST:event_jButtonEstActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonEst;
    private javax.swing.JButton jButtonGuardar;
    private javax.swing.JButton jButtonSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelImagen;
    private javax.swing.JLabel jLabelImg;
    private javax.swing.JList<String> jListClav;
    private javax.swing.JList<String> jListInv;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextArea jTextAreaDialogo;
    private javax.swing.JTextField jTextFieldEscritoJug;
    // End of variables declaration//GEN-END:variables
}
