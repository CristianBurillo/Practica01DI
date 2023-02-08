/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.practica01Vista;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import javax.swing.AbstractAction;
import javax.swing.JComponent;
import javax.swing.KeyStroke;
import com.mycompany.practica01Modelo.Modelo;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;

/**
 *
 * @author Cristian
 */
public class Calculadora extends javax.swing.JFrame {
    
    Modelo modelo = new Modelo();
    public float result = 0;
    public String operador;
    public boolean haoperado = false;
    ComponentAdapter resizeListener;
    
    Font small = new Font("Segoe UI", Font.BOLD,  30);
    Font medium = new Font("Segoe UI", Font.BOLD,  60);
    Font big = new Font("Segoe UI", Font.BOLD,  90);
    
    public Calculadora() {
        
        //TO-DO ADAPTAR TAMAÑO
        /*
        
        */
        this.resizeListener = new ComponentAdapter() {
            @Override
         public void componentResized(ComponentEvent e) {
                
                
                
                if(getWidth()<300 && getHeight()<500){
                    casilla.setFont(small);
                    btnBorrar.setFont(small);
                    jButton0.setFont(small);
                    jButton5.setFont(small);
                    jButton4.setFont(small);
                    btnDivis.setFont(small);
                    jButton2.setFont(small);
                    btnMulti.setFont(small);
                    jButton9.setFont(small);
                    jButton8.setFont(small);
                    btnPunto.setFont(small);
                    btnResta.setFont(small);
                    jButton6.setFont(small);
                    jButton7.setFont(small);
                    btnSuma.setFont(small);
                    jButton3.setFont(small);
                    jButton1.setFont(small);
                    
                }
                
                
                if(getWidth()>400 && getHeight()>600){
                    casilla.setFont(medium);
                    btnBorrar.setFont(medium);
                    jButton0.setFont(medium);
                    jButton5.setFont(medium);
                    jButton4.setFont(medium);
                    btnDivis.setFont(medium);
                    jButton2.setFont(medium);
                    btnMulti.setFont(medium);
                    jButton9.setFont(medium);
                    jButton8.setFont(medium);
                    btnPunto.setFont(medium);
                    btnResta.setFont(medium);
                    jButton6.setFont(medium);
                    jButton7.setFont(medium);
                    btnSuma.setFont(medium);
                    jButton3.setFont(medium);
                    jButton1.setFont(medium);
                    
                }
                
                if(getWidth()>500 && getHeight()>1000){
                    casilla.setFont(big);
                    btnBorrar.setFont(big);
                    jButton0.setFont(big);
                    jButton5.setFont(big);
                    jButton4.setFont(big);
                    btnDivis.setFont(big);
                    jButton2.setFont(big);
                    btnMulti.setFont(big);
                    jButton9.setFont(big);
                    jButton8.setFont(big);
                    btnPunto.setFont(big);
                    btnResta.setFont(big);
                    jButton6.setFont(big);
                    jButton7.setFont(big);
                    btnSuma.setFont(big);
                    jButton3.setFont(big);
                    jButton1.setFont(big);
                    
                    
                }
                System.out.println("ancho : " + getWidth() + " alto: " + getHeight());
                
            }
        };
        
        
        initComponents();
        //Se cambia la localizacion de apertura por defecto de forma centrica y apariencia adaptada
        
        addComponentListener(resizeListener);
        this.setLocationRelativeTo(null);
        
        
        
        
        //0
        this.jButton0.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW)
                .put(KeyStroke.getKeyStroke(KeyEvent.VK_0, 0), "0");
        this.jButton0.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW)
                .put(KeyStroke.getKeyStroke(KeyEvent.VK_NUMPAD0, 0), "0");
        this.jButton0.getActionMap().put("0", new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                jButton0.doClick();

            }
        });

        //1
        this.jButton1.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW)
                .put(KeyStroke.getKeyStroke(KeyEvent.VK_1, 0), "1");
        this.jButton1.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW)
                .put(KeyStroke.getKeyStroke(KeyEvent.VK_NUMPAD1, 0), "1");
        this.jButton1.getActionMap().put("1", new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                jButton1.doClick();

            }
        });

        //2
        this.jButton2.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW)
                .put(KeyStroke.getKeyStroke(KeyEvent.VK_2, 0), "2");
        this.jButton2.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW)
                .put(KeyStroke.getKeyStroke(KeyEvent.VK_NUMPAD2, 0), "2");
        this.jButton2.getActionMap().put("2", new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                jButton2.doClick();

            }
        });

        //3
        this.jButton3.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW)
                .put(KeyStroke.getKeyStroke(KeyEvent.VK_3, 0), "3");
        this.jButton3.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW)
                .put(KeyStroke.getKeyStroke(KeyEvent.VK_NUMPAD3, 0), "3");
        this.jButton3.getActionMap().put("3", new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                jButton3.doClick();

            }
        });

        //4
        this.jButton4.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW)
                .put(KeyStroke.getKeyStroke(KeyEvent.VK_4, 0), "4");
        this.jButton4.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW)
                .put(KeyStroke.getKeyStroke(KeyEvent.VK_NUMPAD4, 0), "4");
        this.jButton4.getActionMap().put("4", new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                jButton4.doClick();

            }
        });

        //5
        this.jButton5.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW)
                .put(KeyStroke.getKeyStroke(KeyEvent.VK_5, 0), "5");
        this.jButton5.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW)
                .put(KeyStroke.getKeyStroke(KeyEvent.VK_NUMPAD5, 0), "5");
        this.jButton5.getActionMap().put("5", new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                jButton5.doClick();

            }
        });

        //6
        this.jButton6.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW)
                .put(KeyStroke.getKeyStroke(KeyEvent.VK_6, 0), "6");
        this.jButton6.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW)
                .put(KeyStroke.getKeyStroke(KeyEvent.VK_NUMPAD6, 0), "6");
        this.jButton6.getActionMap().put("6", new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                jButton6.doClick();

            }
        });

        //7
        this.jButton7.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW)
                .put(KeyStroke.getKeyStroke(KeyEvent.VK_7, 0), "7");
        this.jButton7.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW)
                .put(KeyStroke.getKeyStroke(KeyEvent.VK_NUMPAD7, 0), "7");
        this.jButton7.getActionMap().put("7", new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                jButton7.doClick();

            }
        });

        //8
        this.jButton8.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW)
                .put(KeyStroke.getKeyStroke(KeyEvent.VK_8, 0), "8");
        this.jButton8.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW)
                .put(KeyStroke.getKeyStroke(KeyEvent.VK_NUMPAD8, 0), "8");
        this.jButton8.getActionMap().put("8", new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                jButton8.doClick();

            }
        });

        //9
        this.jButton9.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW)
                .put(KeyStroke.getKeyStroke(KeyEvent.VK_9, 0), "9");
        this.jButton9.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW)
                .put(KeyStroke.getKeyStroke(KeyEvent.VK_NUMPAD9, 0), "9");
        this.jButton9.getActionMap().put("9", new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                jButton9.doClick();

            }
        });
        //.
        this.btnPunto.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW)
                .put(KeyStroke.getKeyStroke(KeyEvent.VK_PERIOD, 0), "+");
        this.btnPunto.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW)
                .put(KeyStroke.getKeyStroke(KeyEvent.VK_DECIMAL, 0), "+");
        this.btnPunto.getActionMap().put("+", new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                btnPunto.doClick();

            }
        });

        //+
        this.btnSuma.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW)
                .put(KeyStroke.getKeyStroke(KeyEvent.VK_PLUS, 0), "+");
        this.btnSuma.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW)
                .put(KeyStroke.getKeyStroke(KeyEvent.VK_ADD, 0), "+");
        this.btnSuma.getActionMap().put("+", new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                btnSuma.doClick();

            }
        });
        //-
        this.btnResta.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW)
                .put(KeyStroke.getKeyStroke(KeyEvent.VK_MINUS, 0), "-");
        this.btnResta.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW)
                .put(KeyStroke.getKeyStroke(KeyEvent.VK_SUBTRACT, 0), "-");
        this.btnResta.getActionMap().put("-", new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                btnResta.doClick();

            }
        });
        //*
        
        this.btnMulti.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW)
                .put(KeyStroke.getKeyStroke(KeyEvent.VK_PLUS,InputEvent.SHIFT_DOWN_MASK), "*");
        this.btnMulti.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW)
                .put(KeyStroke.getKeyStroke(KeyEvent.VK_MULTIPLY, 0), "*");
        this.btnMulti.getActionMap().put("*", new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                btnMulti.doClick();

            }
        });
        ///
      
        this.btnDivis.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW)
                .put(KeyStroke.getKeyStroke(KeyEvent.VK_7 ,  InputEvent.SHIFT_DOWN_MASK), "/");
        this.btnDivis.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW)
                .put(KeyStroke.getKeyStroke(KeyEvent.VK_DIVIDE, 0), "/");
        this.btnDivis.getActionMap().put("/", new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                btnDivis.doClick();

            }
        });
        //=
        this.btnIgual.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW)
                .put(KeyStroke.getKeyStroke(KeyEvent.VK_ENTER, 0), "=");
        this.btnIgual.getActionMap().put("=", new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                btnIgual.doClick();

            }
        });
        //BOTON IGUAL TECLADO SHIFT
        /*
        this.btnIgual.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW)
                .put(KeyStroke.getKeyStroke(KeyEvent.VK_0 ,  InputEvent.SHIFT_DOWN_MASK), "=");
        this.btnIgual.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW)
                .put(KeyStroke.getKeyStroke(KeyEvent.VK_ACCEPT, 0), "=");
        this.btnIgual.getActionMap().put("=", new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                btnIgual.doClick();

            }
        });
        */
        //BORRAR
        this.btnBorrar.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW)
                .put(KeyStroke.getKeyStroke(KeyEvent.VK_BACK_SPACE, 0), "c");
        this.btnBorrar.getActionMap().put("c", new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                btnBorrar.doClick();

            }
        });

    
    
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        casilla = new javax.swing.JLabel();
        btnDivis = new javax.swing.JButton();
        btnBorrar = new javax.swing.JButton();
        btnMulti = new javax.swing.JButton();
        btnResta = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        btnSuma = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton0 = new javax.swing.JButton();
        btnPunto = new javax.swing.JButton();
        btnIgual = new javax.swing.JButton();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(jTable2);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));

        casilla.setBackground(new java.awt.Color(255, 255, 255));
        casilla.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        casilla.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        casilla.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        casilla.setOpaque(true);

        btnDivis.setBackground(new java.awt.Color(153, 153, 153));
        btnDivis.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnDivis.setText("/");
        btnDivis.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnDivis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDivisActionPerformed(evt);
            }
        });

        btnBorrar.setBackground(new java.awt.Color(153, 153, 153));
        btnBorrar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnBorrar.setText("C");
        btnBorrar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBorrarActionPerformed(evt);
            }
        });

        btnMulti.setBackground(new java.awt.Color(153, 153, 153));
        btnMulti.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnMulti.setText("*");
        btnMulti.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnMulti.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMultiActionPerformed(evt);
            }
        });

        btnResta.setBackground(new java.awt.Color(153, 153, 153));
        btnResta.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnResta.setText("-");
        btnResta.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnResta.setMaximumSize(new java.awt.Dimension(22, 22));
        btnResta.setMinimumSize(new java.awt.Dimension(22, 22));
        btnResta.setPreferredSize(new java.awt.Dimension(22, 22));
        btnResta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRestaActionPerformed(evt);
            }
        });

        jButton7.setBackground(new java.awt.Color(153, 153, 153));
        jButton7.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton7.setText("7");
        jButton7.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jButton8.setBackground(new java.awt.Color(153, 153, 153));
        jButton8.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton8.setText("8");
        jButton8.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton8.setVerifyInputWhenFocusTarget(false);
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jButton9.setBackground(new java.awt.Color(153, 153, 153));
        jButton9.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton9.setText("9");
        jButton9.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        jButton4.setBackground(new java.awt.Color(153, 153, 153));
        jButton4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton4.setText("4");
        jButton4.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setBackground(new java.awt.Color(153, 153, 153));
        jButton5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton5.setText("5");
        jButton5.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setBackground(new java.awt.Color(153, 153, 153));
        jButton6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton6.setText("6");
        jButton6.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        btnSuma.setBackground(new java.awt.Color(153, 153, 153));
        btnSuma.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnSuma.setText("+");
        btnSuma.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnSuma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSumaActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(153, 153, 153));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton1.setText("1");
        jButton1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(153, 153, 153));
        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton2.setText("2");
        jButton2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(153, 153, 153));
        jButton3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton3.setText("3");
        jButton3.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton0.setBackground(new java.awt.Color(153, 153, 153));
        jButton0.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton0.setText("0");
        jButton0.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton0ActionPerformed(evt);
            }
        });

        btnPunto.setBackground(new java.awt.Color(153, 153, 153));
        btnPunto.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnPunto.setText(".");
        btnPunto.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnPunto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPuntoActionPerformed(evt);
            }
        });

        btnIgual.setBackground(new java.awt.Color(153, 153, 153));
        btnIgual.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnIgual.setText("=");
        btnIgual.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnIgual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIgualActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(casilla, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jButton4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
                                    .addComponent(jButton7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnBorrar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(20, 20, 20)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButton2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 62, Short.MAX_VALUE)
                                    .addComponent(jButton5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jButton8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnDivis, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addComponent(jButton0, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButton9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jButton6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnPunto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnMulti, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(20, 20, 20)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnIgual, javax.swing.GroupLayout.DEFAULT_SIZE, 51, Short.MAX_VALUE)
                            .addComponent(btnSuma, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnResta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(10, 10, 10))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(casilla, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(btnResta, javax.swing.GroupLayout.DEFAULT_SIZE, 47, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnDivis, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnBorrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnMulti, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButton7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jButton9, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
                                .addGap(1, 1, 1))
                            .addComponent(jButton8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, 53, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButton6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jButton5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                    .addComponent(btnSuma, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, 49, Short.MAX_VALUE)
                            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(17, 17, 17)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton0, javax.swing.GroupLayout.DEFAULT_SIZE, 55, Short.MAX_VALUE)
                            .addComponent(btnPunto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(btnIgual, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(20, 20, 20))
        );

        casilla.getAccessibleContext().setAccessibleName("casilla");
        jButton7.getAccessibleContext().setAccessibleDescription("");
        jButton9.getAccessibleContext().setAccessibleDescription("");
        jButton4.getAccessibleContext().setAccessibleDescription("");
        jButton1.getAccessibleContext().setAccessibleDescription("");
        jButton2.getAccessibleContext().setAccessibleDescription("");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnIgualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIgualActionPerformed
        //Resultado era antes num2
        this.modelo.setNum2(Float.parseFloat(this.casilla.getText()));
        switch(this.operador){
            case "+" :
            this.casilla.setText(Float.toString(modelo.suma()));
            break;

            case "-" :
            this.casilla.setText(Float.toString(modelo.resta()));
            break;

            case "*" :
            this.casilla.setText(Float.toString(modelo.multiplicacion()));
            break;

            case "/" :
            if (modelo.getNum2() == 0) this.casilla.setText("Exception");
            else this.casilla.setText(Float.toString(modelo.division()));
            break;
        }
        haoperado=true;
    }//GEN-LAST:event_btnIgualActionPerformed

    private void btnPuntoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPuntoActionPerformed
        //No puede haber cadenas separadas por mas de 1 puntos
        if(!this.casilla.getText().contains(".")){
            this.casilla.setText(this.casilla.getText()+".");
        }
    }//GEN-LAST:event_btnPuntoActionPerformed

    private void jButton0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton0ActionPerformed
        if(haoperado){
            this.casilla.setText("");
            haoperado=false;
        }else{this.casilla.setText(this.casilla.getText()+"0");}
    }//GEN-LAST:event_jButton0ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        if(haoperado){
            this.casilla.setText("");
            haoperado=false;
        }else{this.casilla.setText(this.casilla.getText()+"3");}
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        if(haoperado){
            this.casilla.setText("");
            haoperado=false;
        }else{this.casilla.setText(this.casilla.getText()+"2");}
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if(haoperado){
            this.casilla.setText("");
            haoperado=false;
        }else{this.casilla.setText(this.casilla.getText()+"1");}
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnSumaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSumaActionPerformed
        modelo.setNum1(Float.parseFloat(this.casilla.getText()));
        //modelo.setOperador("+"); --> No funca se lo carga todo ptm
        this.operador="+";
        //Reiniciamos casilla para numero2
        this.casilla.setText("");
        haoperado = false;
    }//GEN-LAST:event_btnSumaActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        if(haoperado){
            this.casilla.setText("");
            haoperado=false;
        }else{this.casilla.setText(this.casilla.getText()+"6");}
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        if(haoperado){
            this.casilla.setText("");
            haoperado=false;
        }else{this.casilla.setText(this.casilla.getText()+"5");}
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        if(haoperado){
            this.casilla.setText("");
            haoperado=false;
        }else{this.casilla.setText(this.casilla.getText()+"4");}
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        if(haoperado){
            this.casilla.setText("");
            haoperado=false;
        }else{this.casilla.setText(this.casilla.getText()+"9");}
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        if(haoperado){
            this.casilla.setText("");
            haoperado=false;
        }else{this.casilla.setText(this.casilla.getText()+"8");}
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        if(haoperado){
            this.casilla.setText("");
            this.casilla.setText(this.casilla.getText()+"7");
            haoperado=false;
        }else{this.casilla.setText(this.casilla.getText()+"7");}
    }//GEN-LAST:event_jButton7ActionPerformed

    private void btnRestaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRestaActionPerformed
        modelo.setNum1(Float.parseFloat(this.casilla.getText()));
        this.operador="-";
        //Reiniciamos casilla para numero2
        this.casilla.setText("");
        haoperado = false;
    }//GEN-LAST:event_btnRestaActionPerformed

    private void btnMultiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMultiActionPerformed
        modelo.setNum1(Float.parseFloat(this.casilla.getText()));
        this.operador="*";
        //Reiniciamos casilla para numero2
        this.casilla.setText("");
        haoperado = false;
    }//GEN-LAST:event_btnMultiActionPerformed

    private void btnBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBorrarActionPerformed
        //Barrer texto
        modelo.limpiar();
        this.casilla.setText("");
        haoperado =false;
    }//GEN-LAST:event_btnBorrarActionPerformed

    private void btnDivisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDivisActionPerformed
        modelo.setNum1(Float.parseFloat(this.casilla.getText()));
        this.operador="/";
        //Reiniciamos casilla para numero2
        this.casilla.setText("");
        haoperado = false;
    }//GEN-LAST:event_btnDivisActionPerformed

    
    //quitamos los 0s no utiles
    //paso el metodo al modelo---> no va lo dejo aqui xd   
    
   public String decero(float result){
       
       String retorno="";
       retorno = Float.toString(result);
       if(result%1==0){
           //quitamos decimal 0 y coma/punto
           retorno=retorno.substring(0,retorno.length()-2);
                   }
       return String.valueOf(retorno);
       
       
       
   }
    
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
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Calculadora().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBorrar;
    private javax.swing.JButton btnDivis;
    private javax.swing.JButton btnIgual;
    private javax.swing.JButton btnMulti;
    private javax.swing.JButton btnPunto;
    private javax.swing.JButton btnResta;
    private javax.swing.JButton btnSuma;
    private javax.swing.JLabel casilla;
    private javax.swing.JButton jButton0;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    // End of variables declaration//GEN-END:variables
}
