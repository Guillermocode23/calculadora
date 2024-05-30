package calculator;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

import java.awt.Toolkit;
import java.awt.Dialog.ModalExclusionType;



/**
 * @author Guillermo
 * @param operador (carecter que define a cada operacion)
 * Aqui  la clase interfaz que hereda de JFrame 
 */

public class interfaz extends JFrame {
	
	private String operador;
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
  
   
 
 
    public interfaz() {
    	setAlwaysOnTop(true);
    	setModalExclusionType(ModalExclusionType.TOOLKIT_EXCLUDE);
    	setType(Type.UTILITY);
    	setResizable(false);
    	setForeground(new Color(255, 128, 192));
    	setFont(new Font("French Script MT", Font.PLAIN, 16));
    	setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Guillermo\\AppData\\Local\\Microsoft\\Windows\\INetCache\\IE\\D40JG7F4\\eda5c4eae0acc7586b2fa6a3744fb8fc[1].jpg"));
    	setTitle("calculadora belica");
    	setBackground(new Color(255, 128, 192));
    		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    		setBounds(100, 100, 298, 495);
    		contentPane = new JPanel();
    		contentPane.setBackground(Color.BLACK);
    		setContentPane(contentPane);
    		contentPane.setLayout(null);

    		JButton Borrar = new JButton("C");
    		Borrar.setSelectedIcon(null);
            Borrar.setHorizontalTextPosition(SwingConstants.CENTER);
            Borrar.setIcon(new ImageIcon("C:\\Users\\Guillermo\\Desktop\\calculadora\\calculator\\boton2.jpg"));
            Borrar.setBackground(new Color(0, 0, 0, 0)); // Fondo transparente
            Borrar.setForeground(Color.WHITE);
            Borrar.setFont(new Font("Arial", Font.BOLD, 20));
            Borrar.setBorder(null); // Elimina el borde
            Borrar.setBounds(5, 140, 60, 60);
            contentPane.add(Borrar);

            JLabel operacion = new JLabel("");
            operacion.setForeground(Color.WHITE);
            operacion.setVerticalAlignment(SwingConstants.TOP);
            operacion.setFont(new Font("Arial", Font.PLAIN, 23));
            operacion.setBounds(0, 22, 282, 21);
            contentPane.add(operacion);

            JLabel resultado = new JLabel("");
            resultado.setForeground(Color.WHITE);
            resultado.setHorizontalAlignment(SwingConstants.LEFT);
            resultado.setFont(new Font("Arial", Font.BOLD, 42));
            resultado.setBounds(5, 36, 282, 51);
            contentPane.add(resultado);

            Borrar.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    operacion.setText("");
                    resultado.setText("");
                }
            });
       
            
            /* Crea los botónes de los simbolos matematicos y 
             * añade caracteristicas a cada uno .
             * A su vez asignamos un valor para el valor operador	 */

            
            JButton punto = new JButton(".");
            punto.setIcon(new ImageIcon("C:\\Users\\Guillermo\\Desktop\\calculadora\\calculator\\numeros.jpg"));
            punto.setHorizontalTextPosition(SwingConstants.CENTER);
            punto.setForeground(Color.WHITE);
            punto.setFont(new Font("Arial", Font.BOLD, 20));
            punto.setBorder(null);
            punto.setBackground(new Color(0, 0, 0, 0));
            punto.setBounds(80, 395, 52, 61);
            
            
            punto.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                	
                	
                	operador=".";
                	
                	 operacion.setText(operacion.getText() + operador);
                }
            });        


            contentPane.add(punto);
            
            
            JButton mas = new JButton("+");	
            mas.setIcon(new ImageIcon("C:\\Users\\Guillermo\\Desktop\\calculadora\\calculator\\boton1.jpg"));
            mas.setHorizontalTextPosition(SwingConstants.CENTER);
            mas.setForeground(Color.WHITE);
            mas.setFont(new Font("Arial", Font.BOLD, 20));
            mas.setBorder(null);
            mas.setBackground(new Color(0, 0, 0, 0));
            mas.setBounds(75, 140, 60, 60);
            contentPane.add(mas);

            mas.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    
                    operador = "+";
                    operacion.setText(operacion.getText() + operador);
                   
                }
            });

        
    
        
        JButton menos = new JButton("-");
        menos.setIcon(new ImageIcon("C:\\Users\\Guillermo\\Desktop\\calculadora\\calculator\\boton1.jpg"));
        menos.setHorizontalTextPosition(SwingConstants.CENTER);
        menos.setForeground(Color.WHITE);
        menos.setFont(new Font("Arial", Font.BOLD, 30));
        menos.setBorder(null);
        menos.setBackground(new Color(0, 0, 0, 0));
        menos.setBounds(145, 140, 60, 60);
        contentPane.add(menos);
        menos.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	
            	
            	  operador = "-";
                operacion.setText(operacion.getText() + operador);
              
            	
            }}
        );
        JButton por = new JButton("X");
        por.setSelectedIcon(null);
        por.setIcon(new ImageIcon("C:\\Users\\Guillermo\\Desktop\\calculadora\\calculator\\boton1.jpg"));
        por.setHorizontalTextPosition(SwingConstants.CENTER);
        por.setForeground(Color.WHITE);
        por.setFont(new Font("Arial", Font.BOLD, 15));
        por.setBorder(null);
        por.setBackground(Color.black);
        por.setBounds(212, 140, 60, 60);
        contentPane.add(por);
        
        por.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	
            	operador = "x"; 
                operacion.setText(operacion.getText() + operador);
                
            }}
        );

        
        JButton uno = new JButton("1");
        	uno.setIcon(new ImageIcon("C:\\Users\\Guillermo\\Desktop\\calculadora\\calculator\\numeros.jpg"));
        	uno.setHorizontalTextPosition(SwingConstants.CENTER);
        	uno.setForeground(Color.WHITE);
        	uno.setFont(new Font("Arial", Font.BOLD, 20));
        	uno.setBorder(null);
        	uno.setBackground(new Color(0, 0, 0, 0));
        	uno.setBounds(10,222,52,61);
        	uno.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) {
        	contentPane.setBackground(Color.black); // Negro sin usar la palabra
        	uno.setBackground(Color.black); // Negro sin usar la palabra
            }
        });
        	uno.addMouseListener(new java.awt.event.MouseAdapter() {
        public void mouseEntered(java.awt.event.MouseEvent evt) {
        	contentPane.setBackground(Color.black);
    
                
            }

            public void mouseExited(java.awt.event.MouseEvent evt) {
                contentPane.setBackground(Color.black); // Negro sin usar la palabra
           
            }
        });
        
        contentPane.add(uno);

        uno.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
             
             String IngreseNumero=operacion.getText()+uno.getText();      
            operacion.setText(IngreseNumero);    
            }
        });
    
        
        JButton dos = new JButton("2");
        dos.setIcon(new ImageIcon("C:\\Users\\Guillermo\\Desktop\\calculadora\\calculator\\numeros.jpg"));
        dos.setHorizontalTextPosition(SwingConstants.CENTER);
        dos.setForeground(Color.WHITE);
        dos.setFont(new Font("Arial", Font.BOLD, 20));
        dos.setBorder(null);
        dos.setBackground(new Color(0, 0, 0, 0));
        dos.setBounds(80, 222, 52, 61);
        dos.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                contentPane.setBackground(new Color(0, 0, 0)); // Negro sin usar la palabra
                dos.setBackground(new Color(0, 0, 0)); // Negro sin usar la palabra
            }
        });
        dos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                contentPane.setBackground(Color.black);
            }

            public void mouseExited(java.awt.event.MouseEvent evt) {
                contentPane.setBackground(new Color(0, 0, 0)); // Negro sin usar la palabra
            }
        });
        
        contentPane.add(dos);

        dos.addActionListener(new ActionListener() {
        	
            public void actionPerformed(ActionEvent e) {
            	String IngreseNumero=operacion.getText()+dos.getText();      
                operacion.setText(IngreseNumero);    
                
            }
        });
    
        JButton tres = new JButton("3");
        tres.setIcon(new ImageIcon("C:\\Users\\Guillermo\\Desktop\\calculadora\\calculator\\numeros.jpg"));
        tres.setHorizontalTextPosition(SwingConstants.CENTER);
        tres.setForeground(Color.WHITE);
        tres.setFont(new Font("Arial", Font.BOLD, 20));
        tres.setBorder(null);
        tres.setBackground(new Color(0, 0, 0, 0));
        tres.setBounds(150, 222, 52, 61);
        tres.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                contentPane.setBackground(new Color(0, 0, 0)); // Negro sin usar la palabra
                tres.setBackground(new Color(0, 0, 0)); // Negro sin usar la palabra
            }
        });
        tres.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                contentPane.setBackground(Color.black);
            }

            public void mouseExited(java.awt.event.MouseEvent evt) {
                contentPane.setBackground(new Color(0, 0, 0)); // Negro sin usar la palabra
            }
        });
        contentPane.add(tres);
        
        tres.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	String IngreseNumero=operacion.getText()+tres.getText();      
                operacion.setText(IngreseNumero);    
                
            }
        });

        JButton cuatro = new JButton("4");
        cuatro.setIcon(new ImageIcon("C:\\Users\\Guillermo\\Desktop\\calculadora\\calculator\\numeros.jpg"));
        cuatro.setHorizontalTextPosition(SwingConstants.CENTER);
        cuatro.setForeground(Color.WHITE);
        cuatro.setFont(new Font("Arial", Font.BOLD, 20));
        cuatro.setBorder(null);
        cuatro.setBackground(new Color(0, 0, 0, 0));
        cuatro.setBounds(10, 284, 52, 61);
        cuatro.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                contentPane.setBackground(new Color(0, 0, 0)); // Negro sin usar la palabra
                cuatro.setBackground(new Color(0, 0, 0)); // Negro sin usar la palabra
            }
        });
        cuatro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                contentPane.setBackground(Color.black);
            }

            public void mouseExited(java.awt.event.MouseEvent evt) {
                contentPane.setBackground(new Color(0, 0, 0)); // Negro sin usar la palabra
            }
        });
        contentPane.add(cuatro);
        
        cuatro.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	String IngreseNumero=operacion.getText()+cuatro.getText();      
                operacion.setText(IngreseNumero);    
            }
        });

        JButton cinco = new JButton("5");
        cinco.setIcon(new ImageIcon("C:\\Users\\Guillermo\\Desktop\\calculadora\\calculator\\numeros.jpg"));
        cinco.setHorizontalTextPosition(SwingConstants.CENTER);
        cinco.setForeground(Color.WHITE);
        cinco.setFont(new Font("Arial", Font.BOLD, 20));
        cinco.setBorder(null);
        cinco.setBackground(new Color(0, 0, 0, 0));
        cinco.setBounds(80, 284, 52, 61);
        cinco.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                contentPane.setBackground(new Color(0, 0, 0)); // Negro sin usar la palabra
                cinco.setBackground(new Color(0, 0, 0)); // Negro sin usar la palabra
            }
        });
        cinco.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                contentPane.setBackground(Color.black);
            }

            public void mouseExited(java.awt.event.MouseEvent evt) {
                contentPane.setBackground(new Color(0, 0, 0)); // Negro sin usar la palabra
            }
        });
        contentPane.add(cinco);

        cinco.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	String IngreseNumero=operacion.getText()+cinco.getText();      
                operacion.setText(IngreseNumero);    
                
            }
        });
        JButton seis = new JButton("6\r\n");
        seis.setIcon(new ImageIcon("C:\\Users\\Guillermo\\Desktop\\calculadora\\calculator\\numeros.jpg"));
        seis.setHorizontalTextPosition(SwingConstants.CENTER);
        seis.setForeground(Color.WHITE);
        seis.setFont(new Font("Arial", Font.BOLD, 20));
        seis.setBorder(null);
        seis.setBackground(new Color(0, 0, 0, 0));
        seis.setBounds(150, 284, 51, 60);
        seis.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                contentPane.setBackground(new Color(0, 0, 0)); // Negro sin usar la palabra
                seis.setBackground(new Color(0, 0, 0)); // Negro sin usar la palabra
            }
        });
        seis.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                contentPane.setBackground(Color.black);
            }

            public void mouseExited(java.awt.event.MouseEvent evt) {
                contentPane.setBackground(new Color(0, 0, 0)); // Negro sin usar la palabra
            }
        });
        contentPane.add(seis);
        
        seis.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	String IngreseNumero=operacion.getText()+seis.getText();      
                operacion.setText(IngreseNumero);    
            }
        });
        
        JButton siete = new JButton("7");
        siete.setIcon(new ImageIcon("C:\\Users\\Guillermo\\Desktop\\calculadora\\calculator\\numeros.jpg"));
        siete.setHorizontalTextPosition(SwingConstants.CENTER);
        siete.setForeground(Color.WHITE);
        siete.setFont(new Font("Arial", Font.BOLD, 20));
        siete.setBorder(null);
        siete.setBackground(new Color(0, 0, 0, 0));
        siete.setBounds(10, 346, 52, 61);
        siete.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                contentPane.setBackground(new Color(0, 0, 0)); // Negro sin usar la palabra
                siete.setBackground(new Color(0, 0, 0)); // Negro sin usar la palabra
            }
        });
        siete.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                contentPane.setBackground(Color.black);
            }

            public void mouseExited(java.awt.event.MouseEvent evt) {
                contentPane.setBackground(new Color(0, 0, 0)); // Negro sin usar la palabra
            }
        });
        contentPane.add(siete);
        
        siete.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	String IngreseNumero=operacion.getText()+siete.getText();      
                operacion.setText(IngreseNumero);    
                
            }
        });
        
        JButton ocho = new JButton("8");
        ocho.setIcon(new ImageIcon("C:\\Users\\Guillermo\\Desktop\\calculadora\\calculator\\numeros.jpg"));
        ocho.setHorizontalTextPosition(SwingConstants.CENTER);
        ocho.setForeground(Color.WHITE);
        ocho.setFont(new Font("Arial", Font.BOLD, 20));
        ocho.setBorder(null);
        ocho.setBackground(new Color(0, 0, 0, 0));
        ocho.setBounds(80, 346, 52, 61);
        ocho.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                contentPane.setBackground(new Color(0, 0, 0)); // Negro sin usar la palabra
                ocho.setBackground(new Color(0, 0, 0)); // Negro sin usar la palabra
            }
        });
        ocho.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                contentPane.setBackground(Color.black);
            }

            public void mouseExited(java.awt.event.MouseEvent evt) {
                contentPane.setBackground(new Color(0, 0, 0)); // Negro sin usar la palabra
            }
        });
        contentPane.add(ocho);

        ocho.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	String IngreseNumero=operacion.getText()+ocho.getText();      
                operacion.setText(IngreseNumero);    
                
            }
        });
        
        JButton nueve = new JButton("9");
        nueve.setIcon(new ImageIcon("C:\\Users\\Guillermo\\Desktop\\calculadora\\calculator\\numeros.jpg"));
        nueve.setHorizontalTextPosition(SwingConstants.CENTER);
        nueve.setForeground(Color.WHITE);
        nueve.setFont(new Font("Arial", Font.BOLD, 20));
        nueve.setBorder(null);
        nueve.setBackground(new Color(0, 0, 0, 0));
        nueve.setBounds(150, 346,  52, 61);
        
      
       
 
        contentPane.add(nueve);

        nueve.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	String IngreseNumero=operacion.getText()+nueve.getText();      
                operacion.setText(IngreseNumero);    
                
            }
        });
        
        JButton cero = new JButton("0");
        cero.setIcon(new ImageIcon("C:\\Users\\Guillermo\\Desktop\\calculadora\\calculator\\numeros.jpg"));
        cero.setHorizontalTextPosition(SwingConstants.CENTER);
        cero.setForeground(Color.WHITE);
        cero.setFont(new Font("Arial", Font.BOLD, 20));
        cero.setBorder(null);
        cero.setBackground(new Color(0, 0, 0, 0));
        cero.setBounds(10,395, 52, 61);
        cero.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                contentPane.setBackground(new Color(0, 0, 0)); // Negro sin usar la palabra
                cero.setBackground(new Color(0, 0, 0)); // Negro sin usar la palabra
            }
        });
        cero.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                contentPane.setBackground(new Color(0,0,0));
            }

            public void mouseExited(java.awt.event.MouseEvent evt) {
                contentPane.setBackground(new Color(0, 0, 0)); // Negro sin usar la palabra
            }
        });
        contentPane.add(cero);
        cero.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	
            	String IngreseNumero=operacion.getText()+cero.getText();      
                operacion.setText(IngreseNumero);    
                
            }
        });
        
        
        /*
         * crea los iconos de las operaciones y le da sus caracteristicas como su icono 
         * color y tipo de fuente
         */
        
        
        JButton division = new JButton("/");
        division.setIcon(new ImageIcon("C:\\Users\\Guillermo\\Desktop\\calculadora\\calculator\\boton1.jpg"));
        division.setHorizontalTextPosition(SwingConstants.CENTER);
        division.setForeground(Color.WHITE);
        division.setFont(new Font("Arial", Font.BOLD, 20));
        division.setBorder(null);
        division.setBackground(new Color(0, 0, 0, 0));
        division.setBounds(212, 225, 60, 60);
        contentPane.add(division);

        division.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                 
                operador = "/";
                operacion.setText(operacion.getText() + operador);
               
            }
        });
        JButton raiz = new JButton("√");
        raiz.setIcon(new ImageIcon("C:\\Users\\Guillermo\\Desktop\\calculadora\\calculator\\boton1.jpg"));
        raiz.setHorizontalTextPosition(SwingConstants.CENTER);
        raiz.setForeground(Color.WHITE);
        raiz.setFont(new Font("Arial", Font.BOLD, 20));
        raiz.setBorder(null);
        raiz.setBackground(new Color(0, 0, 0, 0));
        raiz.setBounds(212, 310, 60, 60);
        raiz.addActionListener(new ActionListener() {
        	
            public void actionPerformed(ActionEvent e) {
            	
                operador = "√";
                operacion.setText(operador); 
                
            }
        });

  
        contentPane.add(raiz);
        
        JButton igual = new JButton("=");
        
        igual.setIcon(new ImageIcon("C:\\Users\\Guillermo\\Desktop\\calculadora\\calculator\\boton2.jpg"));
       

        igual.setHorizontalTextPosition(SwingConstants.CENTER);
        igual.setForeground(Color.WHITE);
        igual.setFont(new Font("Arial", Font.BOLD, 20));
        igual.setBorder(null);
        igual.setBackground(new Color(0, 0, 0, 0));
        igual.setBounds(212, 390, 60, 60);

        /**
         * El botón igual contiene los @param numero2 
         * y para el operador @param operador con el cual 
         * elegimos que operación realizar a través de un switch
         */        
        igual.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	
           	
            	String expresion = operacion.getText();
                double resultadoCalculado;
                resultadoCalculado = calculadora.evaluarExpresion(expresion);
                
                    resultado.setText(Double.toString(resultadoCalculado));
                    operacion.setText("");
               }
            	
            	
            
        });

        // Agrega el botón igual al contenedor (suponiendo que el código para "igual" ya está definido)
   
        contentPane.add(igual);
       
        
        JButton btnB = new JButton("");
        btnB.setIcon(new ImageIcon("C:\\Users\\Guillermo\\Desktop\\calculadora\\calculator\\borrar.jpg"));
        btnB.setHorizontalTextPosition(SwingConstants.CENTER);
        btnB.setForeground(Color.WHITE);
        btnB.setFont(new Font("Arial", Font.BOLD, 20));
        btnB.setBorder(null);
        btnB.setBackground(new Color(0, 0, 0, 0));
        btnB.setBounds(237, 81, 35, 35);
        
        btnB.addActionListener(new ButtonActionHandler(operacion, resultado));
        
        contentPane.add(btnB);
        
        
   
    }	
    } 

    
