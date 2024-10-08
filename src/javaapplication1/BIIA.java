
package javaapplication1;

import java.awt.BorderLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.lang.reflect.InvocationTargetException;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.Timer;


public class BIIA extends javax.swing.JFrame {
    private Timer timer;
    private int timeRemaining = 2400;

    private int currentPanelIndex = 0;
    private final Class<?>[] panelClasses = {
        quest01.class,quest02.class, quest03.class, quest04.class, quest05.class, quest06.class, quest07.class, quest08.class
            , quest09.class, quest10.class, quest11.class, quest12.class, quest13.class, quest14.class, quest15.class, quest16.class, quest17.class
            , quest18.class, quest19.class, quest20.class, quest21.class, quest22.class, quest23.class, quest24.class, quest25.class, quest26.class
            , quest27.class, quest28.class, quest29.class, quest30.class, quest31.class, quest32.class, quest33.class, quest34.class, quest35.class
            , quest36.class, quest37.class, quest38.class, quest39.class, quest40.class
    };
    public BIIA() {
        initComponents();
        this.setExtendedState(this.MAXIMIZED_BOTH);
        ImageIcon img2= new ImageIcon(getClass().getResource("/img/3125623.png"));
        Icon fnd2 = new ImageIcon(img2.getImage().getScaledInstance(jLabel3.getWidth(), jLabel3.getHeight(), Image.SCALE_DEFAULT));
        jLabel3.setIcon(fnd2);
        setButtonIcon(btnAvanzar, "/img/flecha_avanzar.png", "/img/flecha_avanzar_activado.png");
        setButtonIcon(btnRetroceder, "/img/flecha_retroceder.png", "/img/flecha_retroceder_activado.png");
        this.repaint();
        
        ImageIcon img3= new ImageIcon(getClass().getResource("/img/ip.png"));
        Icon fnd3 = new ImageIcon(img3.getImage().getScaledInstance(jLabelIp.getWidth(), jLabelIp.getHeight(), Image.SCALE_DEFAULT));
        jLabelIp.setIcon(fnd3);
        this.repaint();
        
        ImageIcon img4= new ImageIcon(getClass().getResource("/img/puerto.png"));
        Icon fnd4 = new ImageIcon(img4.getImage().getScaledInstance(jLabelMac.getWidth(), jLabelMac.getHeight(), Image.SCALE_DEFAULT));
        jLabelMac.setIcon(fnd4);
        this.repaint();
        
        ImageIcon img5= new ImageIcon(getClass().getResource("/img/huella.png"));
        Icon fnd5 = new ImageIcon(img5.getImage().getScaledInstance(jLabelHuella.getWidth(), jLabelHuella.getHeight(), Image.SCALE_DEFAULT));
        jLabelHuella.setIcon(fnd5);
        this.repaint();
        
        ImageIcon img6= new ImageIcon(getClass().getResource("/img/da.png"));
        Icon fnd6 = new ImageIcon(img6.getImage().getScaledInstance(jLabelDa.getWidth(), jLabelDa.getHeight(), Image.SCALE_DEFAULT));
        jLabelDa.setIcon(fnd6);
        this.repaint();
        
        ImageIcon img7= new ImageIcon(getClass().getResource("/img/led.png"));
        Icon fnd7 = new ImageIcon(img7.getImage().getScaledInstance(jLabelLed.getWidth(), jLabelLed.getHeight(), Image.SCALE_DEFAULT));
        jLabelLed.setIcon(fnd7);
        this.repaint();
        
        cuentaRegresiva.setText("40:00");
        cuentaRegresiva.setFont(new java.awt.Font("Segoe UI", 1, 24));
        
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowOpened(WindowEvent e) {
                startTimer();
            }
        });
        
        showPanel(currentPanelIndex);
    }
    private void setButtonIcon(JButton button, String imagePath, String pressedImagePath) {
        ImageIcon img = new ImageIcon(getClass().getResource(imagePath));
        Icon icon = new ImageIcon(img.getImage().getScaledInstance(button.getWidth(), button.getHeight(), Image.SCALE_DEFAULT));
        button.setIcon(icon);
        
        ImageIcon pressedImg = new ImageIcon(getClass().getResource(pressedImagePath));
        Icon pressedIcon = new ImageIcon(pressedImg.getImage().getScaledInstance(button.getWidth(), button.getHeight(), Image.SCALE_DEFAULT));
        button.setPressedIcon(pressedIcon);
    }
    

    private void startTimer() {
        timer = new Timer(1000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (timeRemaining > 0) {
                    timeRemaining--;
                    int minutes = timeRemaining / 60;
                    int seconds = timeRemaining % 60;
                    cuentaRegresiva.setText(String.format("%02d:%02d", minutes, seconds));
                } else {
                    timer.stop();
                    cuentaRegresiva.setText("00:00");
                    JOptionPane.showMessageDialog(BIIA.this, "El tiempo se ha terminado.");
                }
            }
        });
        timer.start();
    }
    
    private void showPanel(int index) {
        try {
            JPanel panel = (JPanel) panelClasses[index].getDeclaredConstructor().newInstance();
            panel.setSize(680, 420);
            panel.setLocation(0, 0);

            questArea.removeAll();
            questArea.add(panel, BorderLayout.CENTER);
            questArea.revalidate();
            questArea.repaint();

            jlabelNumero.setText((currentPanelIndex + 1) + "/40");
            btnRetroceder.setEnabled(currentPanelIndex > 0);
            btnAvanzar.setEnabled(currentPanelIndex < panelClasses.length - 1);
        } catch (InstantiationException | IllegalAccessException | InvocationTargetException | NoSuchMethodException ex) {
            ex.printStackTrace();
        }
    }

    private void showNextPanel() {
        if (currentPanelIndex < panelClasses.length - 1) {
            currentPanelIndex++;
            showPanel(currentPanelIndex);
        }
    }

    private void showPreviousPanel() {
        if (currentPanelIndex > 0) {
            currentPanelIndex--;
            showPanel(currentPanelIndex);
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        p1_bg = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        questArea = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        cuentaRegresiva = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabelPuerto = new javax.swing.JLabel();
        jLabelTextoDa = new javax.swing.JLabel();
        jLabelMacNumber = new javax.swing.JLabel();
        jLabelIp = new javax.swing.JLabel();
        jLabelMac = new javax.swing.JLabel();
        jLabelHuella = new javax.swing.JLabel();
        jLabelDa = new javax.swing.JLabel();
        jLabelLed = new javax.swing.JLabel();
        jLabelNumeros = new javax.swing.JLabel();
        btnAvanzar = new javax.swing.JButton();
        btnRetroceder = new javax.swing.JButton();
        jlabelNumero = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setExtendedState(6);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(169, 30, 30));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("POSTULANTE");

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/3125623.png"))); // NOI18N

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("APELLIDOS Y NOMBRES");

        jLabel11.setText("PREGUNTAS:");

        jScrollPane2.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);

        jTextArea1.setEditable(false);
        jTextArea1.setBackground(new java.awt.Color(255, 255, 255));
        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jTextArea1.setText("\n1.- Respecto de los dispositivos de control o regulación del \ntránsito:\n\n2.- La señal vertical reglamentaria R-6 “prohibido voltear a la \nizquierda”, significa que:\n\n3.- La señal vertical reglamentaria R-3 significa que:\n\n4.- En las vías, las marcas en el pavimento que son del tipo \ncentral discontinua y de color amarillo significan que:\n\n5.- El color ámbar o amarillo del semáforo significa que:\n\n6.- Los colores del semáforo tienen el siguiente significado: \nrojo:_____; ámbar o amarillo: _____; verde:___.\n\n7.- ¿Qué indica una flecha verde en un semáforo vehicular?\n\n8.- La siguiente señal vertical reglamentaria R-53:\n\n9.- Si llega a una intersección y visualiza el semáforo con una \nflecha roja hacia la izquierda y la luz circular verde prendidas \nal mismo tiempo, la acción correcta es:\n\n10.- Si llega a una intersección donde el semáforo muestra \nuna luz intermitente, qué afirmación es correcta:\n\n11.- ¿La luz intermitente roja es igual que una señal de PARE?\n\n12.- Al aproximarse a una intersección con giro permitido a la \nizquierda, la conducta correcta es:\n\n13.- Al cambiar de carril en una vía de un solo sentido con \nmúltiples carriles, ¿cuál es la conducta correcta?\n\n14.- Respecto a los cruces a nivel con vías férreas, señale la \nafirmación correcta:\n\n15.- Ante la señal de color rojo del semáforo y la indicación \nde continuar la marcha del efectivo de la Policía Nacional del \nPerú asignado al control del tránsito, corresponde:\n\n16.- Está prohibido estacionar un vehículo:\n\n17.- La siguiente señal vertical reglamentaria (R-29:\n\n18.- Se le impondrá el pago de una multa y no podrá obtener \nla licencia de conducir por 3 años a la persona que:\n\n 19.- En el supuesto que se encuentre manejando y un vehículo \nque tiene la intención de sobrepasarlo o adelantarlo lo alcance, \n¿qué debería hacer usted?\n\n20.- ¿Cuál de las siguientes afi rmaciones es correcta?\n\n21.- En la circulación vehicular, es correcto afi rmar que:\n\n22.- En caso de accidentes, el SOAT cubre los daños que sufren:\n\n23.- ¿Cuál de los siguientes seguros es exigible para conducir un \nvehículo automotor?\n\n24.- Cuándo es obligatorio darle preferencia de paso a un vehículo \nde emergencia o vehículo oficial:\n\n25.- Si por el carril por donde está conduciendo se aproxima a un \nvehículo de transporte escolar que se encuentra detenido, recogiendo \no dejando escolares ¿Qué debe hacer?\n\n26.- ¿Qué signifi ca un triángulo rojo de seguridad colocado en la calzada?\n\n27.- ¿En la conducción vehicular, existe excepción a la obligación de \nconservar la distancia obligatoria entre vehículos?\n\n28.- En intersecciones que no tienen señales de Pare, Ceda el Paso o \nSemáforo, ¿las vías de doble sentido tienen prioridad de paso respecto \na las vías de un solo sentido de igual clasificación?\n\n29.- Si usted se aproxima a una señal de PARE colocada verticalmente \no pintada en la vía, la acción correcta es:\n\n30.- ¿Cuál es la diferencia entre las señales P-2A y P-1A?\n\n31.- ¿Qué indica la señal R-30F?\n\n32.- ¿Que indica la siguiente señal R-23?\n\n33.- Si dos vehículos se aproximan simultáneamente a una intersección \nno regulada (sin señalización) procedentes de vías diferentes, ¿quién \ntiene preferencia de paso?\n\n34.- En una intersección no regulada (sin señalización) tiene preferencia \nde paso:\n\n35.- En una rotonda, tiene prioridad de paso el vehículo que:\n\n36.- El sobrepaso o adelantamiento de un vehículo en movimiento \nse efectúa, salvo excepciones, por la _________ retornando el vehículo \ndespués de la maniobra a su carril original.\n\n37.- Si un conductor está tomando medicamentos y por ello siente \nsueño ¿qué debe hacer?\n\n38.- Son documentos que deben portarse obligatoriamente, durante \nla conducción del vehículo, y exhibirse cuando la autoridad competente \nlo solicite:\n\n39.- La siguiente señal indica:\n\n40.- Al cambiar de dirección, un conductor debe:");
        jTextArea1.setAutoscrolls(false);
        jTextArea1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jScrollPane2.setViewportView(jTextArea1);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(99, 99, 99)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(85, 85, 85)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 448, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 328, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(169, 30, 30));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Examen de Conocimientos - CATEGORIA A");

        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/mtcLogo.png"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(98, 98, 98)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 614, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 352, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        questArea.setBackground(new java.awt.Color(255, 255, 255));
        questArea.setLayout(new java.awt.BorderLayout());

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(169, 30, 30));
        jLabel5.setText("Tiempo restante:");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(cuentaRegresiva, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(112, 112, 112))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 21, Short.MAX_VALUE)
                    .addComponent(cuentaRegresiva, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jPanel5.setBackground(new java.awt.Color(169, 30, 30));

        jLabelPuerto.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabelPuerto.setForeground(new java.awt.Color(255, 255, 255));
        jLabelPuerto.setText("192.168.24.11");

        jLabelTextoDa.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabelTextoDa.setForeground(new java.awt.Color(255, 255, 255));
        jLabelTextoDa.setText("Desarrollado por la Oficina General de Tecnologia de la Informacion OGTI - Ministerio de Transporte y Comunicaciones @2024");

        jLabelMacNumber.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabelMacNumber.setForeground(new java.awt.Color(255, 255, 255));
        jLabelMacNumber.setText("04-33-C2-22-15-OA");

        jLabelIp.setText("jLabel10");

        jLabelMac.setText("jLabel10");

        jLabelHuella.setText("jLabel10");

        jLabelDa.setText("jLabel10");

        jLabelLed.setText("jLabel10");

        jLabelNumeros.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabelNumeros.setForeground(new java.awt.Color(255, 255, 255));
        jLabelNumeros.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelNumeros.setText("1.0.0.508");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelIp, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelPuerto)
                .addGap(40, 40, 40)
                .addComponent(jLabelMac, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabelMacNumber)
                .addGap(44, 44, 44)
                .addComponent(jLabelHuella, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(161, 161, 161)
                .addComponent(jLabelDa, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabelTextoDa)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                .addComponent(jLabelLed, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(jLabelNumeros)
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelHuella, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelLed, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelPuerto)
                            .addComponent(jLabelMacNumber)
                            .addComponent(jLabelIp)
                            .addComponent(jLabelNumeros)
                            .addComponent(jLabelTextoDa)
                            .addComponent(jLabelMac, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabelDa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(5, 5, 5))))
        );

        btnAvanzar.setBorderPainted(false);
        btnAvanzar.setContentAreaFilled(false);
        btnAvanzar.setFocusPainted(false);
        btnAvanzar.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/flecha_avanzar_activado.png"))); // NOI18N
        btnAvanzar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAvanzarActionPerformed(evt);
            }
        });

        btnRetroceder.setBorder(null);
        btnRetroceder.setBorderPainted(false);
        btnRetroceder.setContentAreaFilled(false);
        btnRetroceder.setFocusPainted(false);
        btnRetroceder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRetrocederActionPerformed(evt);
            }
        });

        jlabelNumero.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlabelNumero.setText("1/40");

        jButton1.setBackground(new java.awt.Color(169, 30, 30));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Finalizar Examen");
        jButton1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(169, 30, 30));
        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Ayuda tecnica");
        jButton2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(questArea, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(17, 17, 17)
                                .addComponent(btnRetroceder, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jlabelNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(24, 24, 24)
                                .addComponent(btnAvanzar, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(24, 24, 24))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(164, 164, 164))))
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(questArea, javax.swing.GroupLayout.PREFERRED_SIZE, 398, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnRetroceder, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnAvanzar, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jlabelNumero, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 57, Short.MAX_VALUE)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(39, 39, 39)))
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAvanzarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAvanzarActionPerformed
        showNextPanel();
    }//GEN-LAST:event_btnAvanzarActionPerformed

    private void btnRetrocederActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRetrocederActionPerformed
        showPreviousPanel();
    }//GEN-LAST:event_btnRetrocederActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
    int respuesta = JOptionPane.showConfirmDialog(
        null, 
        "¿Ya has terminado el examen?", 
        "Confirmar", 
        JOptionPane.YES_NO_OPTION
    );

    if (respuesta == JOptionPane.YES_OPTION) {
        LoginUsuario loginUsuario = new LoginUsuario("A");
        loginUsuario.setLocationRelativeTo(null);
        loginUsuario.setVisible(true);

        this.setVisible(false);
    }
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(BIIA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BIIA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BIIA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BIIA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BIIA().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAvanzar;
    private javax.swing.JButton btnRetroceder;
    private javax.swing.JLabel cuentaRegresiva;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelDa;
    private javax.swing.JLabel jLabelHuella;
    private javax.swing.JLabel jLabelIp;
    private javax.swing.JLabel jLabelLed;
    private javax.swing.JLabel jLabelMac;
    private javax.swing.JLabel jLabelMacNumber;
    private javax.swing.JLabel jLabelNumeros;
    private javax.swing.JLabel jLabelPuerto;
    private javax.swing.JLabel jLabelTextoDa;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JLabel jlabelNumero;
    private javax.swing.ButtonGroup p1_bg;
    private javax.swing.JPanel questArea;
    // End of variables declaration//GEN-END:variables
}
