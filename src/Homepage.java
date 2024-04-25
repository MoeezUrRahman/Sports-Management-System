import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Homepage extends JFrame implements MouseListener, ActionListener {
    CardLayout cardLayout=new CardLayout();
    JPanel container=new JPanel(cardLayout);
    JButton logout=new JButton();
    JLabel containerlavel=new JLabel();


    JPanel panelbad=new JPanel();
    JLabel badmin=new JLabel();
    JButton adddatabad=new JButton();
    JButton deletedata=new JButton();
    JButton back=new JButton();



    JLabel badlabel=new JLabel();
    JPanel panelbasket=new JPanel();
    JLabel panelbasketlabel=new JLabel();
    JLabel basket=new JLabel();
    JButton adddatabad1=new JButton();
    JButton deletedata1=new JButton();

    JButton back1=new JButton();
    JButton back2=new JButton();
    JButton back3=new JButton();



    JPanel panelvolley=new JPanel();
    JLabel panelvolleylabel=new JLabel();
    JButton addddatabad2=new JButton();
    JButton deletedata2=new JButton();
    JLabel volley=new JLabel();




    JPanel paneltennis=new JPanel();
    JLabel paneltennislabel=new JLabel();
    JButton adddatabad3=new JButton();
    JButton deletedata3=new JButton();
    JLabel tennis=new JLabel();





    SimpleDateFormat timeformat;
    SimpleDateFormat dayformat;
    SimpleDateFormat dateformat;



    ImageIcon homeicon=new ImageIcon("homeicon.png");
    Image Home=homeicon.getImage().getScaledInstance(40,39,Image.SCALE_SMOOTH);
    ImageIcon badmintonicon=new ImageIcon("badmintonicon.png");
    Image badmintonn=badmintonicon.getImage().getScaledInstance(40,39,Image.SCALE_SMOOTH);
    ImageIcon basketballlicon=new ImageIcon("basketballicon.png");
    Image basketballl=basketballlicon.getImage().getScaledInstance(40,39,Image.SCALE_SMOOTH);
    ImageIcon volleyballicon=new ImageIcon("volleyballicon.png");
    Image volleyballl=volleyballicon.getImage().getScaledInstance(40,39,Image.SCALE_SMOOTH);
    ImageIcon tabletennisicon=new ImageIcon("tabletennisicon.png");
    Image tabletenniss=tabletennisicon.getImage().getScaledInstance(40,39,Image.SCALE_SMOOTH);
    ImageIcon panelicon=new ImageIcon("panelicon.png");
    Image panel=panelicon.getImage().getScaledInstance(900,590,Image.SCALE_SMOOTH);
    ImageIcon panelsicon=new ImageIcon("panelsicon.png");
    Image panels=panelsicon.getImage().getScaledInstance(900,590,Image.SCALE_SMOOTH);
    ImageIcon bulleticon=new ImageIcon("bulletsign.png");
    Image bullet=bulleticon.getImage().getScaledInstance(50,50,Image.SCALE_SMOOTH);
    ImageIcon close=new ImageIcon("closebutton.png");
    Image closee=close.getImage().getScaledInstance(20,15,Image.SCALE_SMOOTH);
    ImageIcon returnicon=new ImageIcon("returnicon.png");
    Image returnn=returnicon.getImage().getScaledInstance(25,20,Image.SCALE_SMOOTH);
    ImageIcon nustlogo=new ImageIcon("nustlogo.png");
    Image nust=nustlogo.getImage().getScaledInstance(150,120,Image.SCALE_SMOOTH);
    ImageIcon logouticon=new ImageIcon("bulletsign.png");
    Image logoutt=logouticon.getImage().getScaledInstance(15,10,Image.SCALE_SMOOTH);




    JLabel timelabel=new JLabel();
    JLabel datelabel=new JLabel();
    JLabel daylabel=new JLabel();
    String day,date,time;
    JLabel leftlabel=new JLabel();
    JLabel toplabel=new JLabel();
    JLabel imagelabel=new JLabel();





    Border border=BorderFactory.createEmptyBorder();
    JButton home=new JButton();
    JButton closebutton=new JButton();
    JButton badminton=new JButton();
    JButton tabletennis=new JButton();
    JButton volleyball=new JButton();
    JButton basketball=new JButton();
    JButton currentstatus=new JButton();
    Homepage(){
        Panels();
        Buttons();
        leftlabel();
        toplabel();
        frame();
        timendate();
    }
    protected void Panels(){
        bulleticon.setImage(bullet);
        returnicon.setImage(returnn);

        //-----------TABLE TENNIS PANEL-------------

        adddatabad3.setBounds(200,300,500,40);
        adddatabad3.setBackground(new Color(14, 11, 47));
        adddatabad3.setOpaque(false);
        adddatabad3.setText("Add Student Data");
        adddatabad3.setForeground(Color.white);
        adddatabad3.setFont(new Font("SDRoboticsDemo",Font.BOLD,40));
        adddatabad3.setFocusable(false);
        adddatabad3.setBorder(border);
        adddatabad3.setIcon(bulleticon);
        adddatabad3.setIconTextGap(50);
        adddatabad3.setHorizontalAlignment(JButton.LEFT);
        adddatabad3.addMouseListener(this);
        adddatabad3.addActionListener(this);

        deletedata3.setBounds(200,400,500,40);
        deletedata3.setBackground(new Color(14, 11, 47));
        deletedata3.setOpaque(false);
        deletedata3.setText("Delete Student Data");
        deletedata3.setForeground(Color.white);
        deletedata3.setFont(new Font("SDRoboticsDemo",Font.BOLD,36));
        deletedata3.setFocusable(false);
        deletedata3.setBorder(border);
        deletedata3.setIcon(bulleticon);
        deletedata3.setIconTextGap(50);
        deletedata3.setHorizontalAlignment(JButton.LEFT);
        deletedata3.addMouseListener(this);
        deletedata3.addActionListener(this);

        back3.setBounds(20,30,140,25);
        back3.setText("Return");
        back3.setBorder(border);
        back3.setBackground(new Color(14,11,47));
        back3.setFocusable(false);
        back3.setOpaque(false);
        back3.setForeground(Color.WHITE);
        back3.setFont(new Font("Times new Roman",Font.PLAIN,24));
        back3.setIcon(returnicon);
        back3.setHorizontalAlignment(JButton.LEFT);
        back3.setIconTextGap(13);
        back3.addMouseListener(this);
        back3.addActionListener(this);

        tabletennisicon.setImage(tabletenniss);
        tennis.setBounds(360,30,400,40);
        tennis.setText("TABLE TENNIS");
        tennis.setFocusable(false);
        tennis.setForeground(Color.WHITE);
        tennis.setFont(new Font("Times new Roman",Font.BOLD,24));
        tennis.setOpaque(false);
        tennis.setBackground(new Color(13,36,51));
        tennis.setBorder(border);
        tennis.setIcon(tabletennisicon);
        tennis.setHorizontalAlignment(JLabel.LEFT);
        tennis.setIconTextGap(25);

        panelsicon.setImage(panels);
        paneltennislabel.setBounds(300,160,885,553);
        paneltennislabel.setIcon(panelsicon);
        paneltennislabel.add(adddatabad3);
        paneltennislabel.add(deletedata3);
        paneltennislabel.add(back3);
        paneltennislabel.add(tennis);
        paneltennis.setBounds(300,160,885,553);
        paneltennis.add(paneltennislabel);

        //-----VOLLEYBALL PANEL---------------

        addddatabad2.setBounds(200,300,500,40);
        addddatabad2.setBackground(new Color(14, 11, 47));
        addddatabad2.setOpaque(false);
        addddatabad2.setText("Add Student Data");
        addddatabad2.setForeground(Color.white);
        addddatabad2.setFont(new Font("SDRoboticsDemo",Font.BOLD,40));
        addddatabad2.setFocusable(false);
        addddatabad2.setBorder(border);
        addddatabad2.setIcon(bulleticon);
        addddatabad2.setIconTextGap(50);
        addddatabad2.setHorizontalAlignment(JButton.LEFT);
        addddatabad2.addMouseListener(this);
        addddatabad2.addActionListener(this);

        deletedata2.setBounds(200,400,500,40);
        deletedata2.setBackground(new Color(14, 11, 47));
        deletedata2.setOpaque(false);
        deletedata2.setText("Delete Student Data");
        deletedata2.setForeground(Color.white);
        deletedata2.setFont(new Font("SDRoboticsDemo",Font.BOLD,36));
        deletedata2.setFocusable(false);
        deletedata2.setBorder(border);
        deletedata2.setIcon(bulleticon);
        deletedata2.setIconTextGap(50);
        deletedata2.setHorizontalAlignment(JButton.LEFT);
        deletedata2.addMouseListener(this);
        deletedata2.addActionListener(this);

        back2.setBounds(20,30,140,25);
        back2.setText("Return");
        back2.setBorder(border);
        back2.setBackground(new Color(14,11,47));
        back2.setFocusable(false);
        back2.setOpaque(false);
        back2.setForeground(Color.WHITE);
        back2.setFont(new Font("Times new Roman",Font.PLAIN,24));
        back2.setIcon(returnicon);
        back2.setHorizontalAlignment(JButton.LEFT);
        back2.setIconTextGap(13);
        back2.addMouseListener(this);
        back2.addActionListener(this);

        volleyballicon.setImage(volleyballl);
        volley.setBounds(360,30,400,40);
        volley.setText("VOLLEYBALL");
        volley.setFocusable(false);
        volley.setForeground(Color.WHITE);
        volley.setFont(new Font("Times new Roman",Font.BOLD,24));
        volley.setOpaque(false);
        volley.setBackground(new Color(13,36,51));
        volley.setBorder(border);
        volley.setIcon(volleyballicon);
        volley.setHorizontalAlignment(JLabel.LEFT);
        volley.setIconTextGap(25);

        panelsicon.setImage(panels);
        panelvolleylabel.setBounds(300,160,885,553);
        panelvolleylabel.setIcon(panelsicon);
        panelvolleylabel.add(addddatabad2);
        panelvolleylabel.add(deletedata2);
        panelvolleylabel.add(back2);
        panelvolleylabel.add(volley);
        panelvolley.setBounds(300,160,885,553);
        panelvolley.add(panelvolleylabel);


        //-------------BASKETBALL PANEL-----------


        adddatabad1.setBounds(200,300,500,40);
        adddatabad1.setBackground(new Color(14, 11, 47));
        adddatabad1.setOpaque(false);
        adddatabad1.setText("Add Student Data");
        adddatabad1.setForeground(Color.white);
        adddatabad1.setFont(new Font("SDRoboticsDemo",Font.BOLD,40));
        adddatabad1.setFocusable(false);
        adddatabad1.setBorder(border);
        adddatabad1.setIcon(bulleticon);
        adddatabad1.setIconTextGap(50);
        adddatabad1.setHorizontalAlignment(JButton.LEFT);
        adddatabad1.addMouseListener(this);
        adddatabad1.addActionListener(this);

        deletedata1.setBounds(200,400,500,40);
        deletedata1.setBackground(new Color(14, 11, 47));
        deletedata1.setOpaque(false);
        deletedata1.setText("Delete Student Data");
        deletedata1.setForeground(Color.white);
        deletedata1.setFont(new Font("SDRoboticsDemo",Font.BOLD,36));
        deletedata1.setFocusable(false);
        deletedata1.setBorder(border);
        deletedata1.setIcon(bulleticon);
        deletedata1.setIconTextGap(50);
        deletedata1.setHorizontalAlignment(JButton.LEFT);
        deletedata1.addMouseListener(this);
        deletedata1.addActionListener(this);

        back1.setBounds(20,30,140,25);
        back1.setText("Return");
        back1.setBorder(border);
        back1.setBackground(new Color(14,11,47));
        back1.setFocusable(false);
        back1.setOpaque(false);
        back1.setForeground(Color.WHITE);
        back1.setFont(new Font("Times new Roman",Font.PLAIN,24));
        back1.setIcon(returnicon);
        back1.setHorizontalAlignment(JButton.LEFT);
        back1.setIconTextGap(13);
        back1.addMouseListener(this);
        back1.addActionListener(this);

        basketballlicon.setImage(basketballl);
        basket.setBounds(360,30,400,40);
        basket.setText("BASKETBALL");
        basket.setFocusable(false);
        basket.setForeground(Color.WHITE);
        basket.setFont(new Font("Times new Roman",Font.BOLD,24));
        basket.setOpaque(false);
        basket.setBackground(new Color(13,36,51));
        basket.setBorder(border);
        basket.setIcon(basketballlicon);
        basket.setHorizontalAlignment(JLabel.LEFT);
        basket.setIconTextGap(25);


        panelsicon.setImage(panels);
        panelbasketlabel.setBounds(300,160,885,553);
        panelbasketlabel.setIcon(panelsicon);
        panelbasketlabel.add(adddatabad1);
        panelbasketlabel.add(deletedata1);
        panelbasketlabel.add(back1);
        panelbasketlabel.add(basket);
        panelbasket.setBounds(300,160,885,553);
        panelbasket.add(panelbasketlabel);


        //--------BADMINTON PANEL----------


        adddatabad.setBounds(200,300,500,40);
        adddatabad.setBackground(new Color(14, 11, 47));
        adddatabad.setOpaque(false);
        adddatabad.setText("Add Student Data");
        adddatabad.setForeground(Color.white);
        adddatabad.setFont(new Font("SDRoboticsDemo",Font.BOLD,40));
        adddatabad.setFocusable(false);
        adddatabad.setBorder(border);
        adddatabad.setIcon(bulleticon);
        adddatabad.setIconTextGap(50);
        adddatabad.setHorizontalAlignment(JButton.LEFT);
        adddatabad.addMouseListener(this);
        adddatabad.addActionListener(this);

        deletedata.setBounds(200,400,500,40);
        deletedata.setBackground(new Color(14, 11, 47));
        deletedata.setOpaque(false);
        deletedata.setText("Delete Student Data");
        deletedata.setForeground(Color.white);
        deletedata.setFont(new Font("SDRoboticsDemo",Font.BOLD,36));
        deletedata.setFocusable(false);
        deletedata.setBorder(border);
        deletedata.setIcon(bulleticon);
        deletedata.setIconTextGap(50);
        deletedata.setHorizontalAlignment(JButton.LEFT);
        deletedata.addMouseListener(this);
        deletedata.addActionListener(this);

        back.setBounds(20,30,140,25);
        back.setText("Return");
        back.setBorder(border);
        back.setBackground(new Color(14,11,47));
        back.setFocusable(false);
        back.setOpaque(false);
        back.setForeground(Color.WHITE);
        back.setFont(new Font("Times new Roman",Font.PLAIN,24));
        back.setIcon(returnicon);
        back.setHorizontalAlignment(JButton.LEFT);
        back.setIconTextGap(13);
        back.addMouseListener(this);
        back.addActionListener(this);


        badmin.setBounds(360,30,400,40);
        badmin.setText("BADMINTON");
        badmin.setForeground(Color.WHITE);
        badmin.setFont(new Font("Times new Roman",Font.BOLD,24));
        badmin.setOpaque(false);
        badmin.setBackground(new Color(13,36,51));
        badmin.setBorder(border);
        badmin.setIcon(badmintonicon);
        badmin.setHorizontalAlignment(JButton.LEFT);
        badmin.setIconTextGap(25);


        panelsicon.setImage(panels);
        badlabel.setBounds(310,140,875,553);
        badlabel.setIcon(panelsicon);
        badlabel.add(adddatabad);
        badlabel.add(deletedata);
        badlabel.add(back);
        badlabel.add(badmin);
        panelbad.setBounds(310,140,875,553);
        panelbad.add(badlabel);

        //-------CONTAINER PANEL----------

        logouticon.setImage(logoutt);
        logout.setBounds(785,10,120,30);
        logout.setText("Logout");
        logout.setIcon(logouticon);
        logout.setIconTextGap(10);
        logout.setBackground(Color.white);
        logout.setOpaque(false);
        logout.setForeground(Color.white);
        logout.setFont(new Font("Times new ROman",Font.PLAIN,20));
        logout.setBorder(border);
        logout.addActionListener(this);

        panelicon.setImage(panel);
        containerlavel.setBounds(300,150,895,600);
        containerlavel.setIcon(panelicon);
        containerlavel.add(logout);

        container.setBounds(300,170,900,590);
        container.add(containerlavel,"1");
        container.add(panelbad,"2");
        container.add(panelbasket,"3");
        container.add(panelvolley,"4");
        container.add(paneltennis,"5");
    }
    protected void Buttons(){
        //--------CURRENT STATUS----------
        
        currentstatus.setBounds(15,100,250,40);
        currentstatus.setText("View Current Status");
        currentstatus.setFocusable(false);
        currentstatus.setForeground(Color.WHITE);
        currentstatus.setFont(new Font("Times new Roman",Font.BOLD,24));
        currentstatus.setOpaque(true);
        currentstatus.setBackground(new Color(13,36,51));
        currentstatus.setBorder(border);
        currentstatus.setIcon(logouticon);
        currentstatus.setHorizontalAlignment(JButton.LEFT);
        currentstatus.setIconTextGap(20);
        currentstatus.addMouseListener(this);
        currentstatus.addActionListener(this);        
        
        //-------- CLOSE BUTTON-----------
        closebutton.setBounds(1175,5,20,15);
        closebutton.setBackground(Color.WHITE);
        closebutton.setOpaque(false);
        closebutton.setFocusable(false);
        closebutton.setBorder(border);
        close.setImage(closee);
        closebutton.setIcon(close);
        closebutton.addActionListener(this);





        //----------HOMEEEEEEEE-----------
        homeicon.setImage(Home);
        home.setBounds(30,30,250,40);
        home.setFocusable(false);
        home.setText("Homepage");
        home.setForeground(Color.WHITE);
        home.setFont(new Font("Times new Roman",Font.BOLD,28));
        home.setOpaque(true);
        home.setBackground(new Color(13,36,51));
        home.setBorder(border);
        home.setIcon(homeicon);
        home.setHorizontalAlignment(JButton.LEFT);
        home.setIconTextGap(25);
        home.addMouseListener(this);
        home.addActionListener(this);


        //--------------BADMINTON-----------------
        badmintonicon.setImage(badmintonn);
        badminton.setBounds(50,165,250,40);
        badminton.setText("BADMINTON");
        badminton.setFocusable(false);
        badminton.setForeground(Color.WHITE);
        badminton.setFont(new Font("Times new Roman",Font.BOLD,24));
        badminton.setOpaque(true);
        badminton.setBackground(new Color(13,36,51));
        badminton.setBorder(border);
        badminton.setIcon(badmintonicon);
        badminton.setHorizontalAlignment(JButton.LEFT);
        badminton.setIconTextGap(25);
        badminton.addMouseListener(this);
        badminton.addActionListener(this);


        //----------BASKETBALL------------
        basketballlicon.setImage(basketballl);
        basketball.setBounds(50,255,250,40);
        basketball.setText("BASKETBALL");
        basketball.setFocusable(false);
        basketball.setForeground(Color.WHITE);
        basketball.setFont(new Font("Times new Roman",Font.BOLD,24));
        basketball.setOpaque(true);
        basketball.setBackground(new Color(13,36,51));
        basketball.setBorder(border);
        basketball.setIcon(basketballlicon);
        basketball.setHorizontalAlignment(JButton.LEFT);
        basketball.setIconTextGap(25);
        basketball.addMouseListener(this);
        basketball.addActionListener(this);


        //------------VOLLEYBALL---------
        volleyballicon.setImage(volleyballl);
        volleyball.setBounds(50,345,250,40);
        volleyball.setText("VOLLEYBALL");
        volleyball.setFocusable(false);
        volleyball.setForeground(Color.WHITE);
        volleyball.setFont(new Font("Times new Roman",Font.BOLD,24));
        volleyball.setOpaque(true);
        volleyball.setBackground(new Color(13,36,51));
        volleyball.setBorder(border);
        volleyball.setIcon(volleyballicon);
        volleyball.setHorizontalAlignment(JButton.LEFT);
        volleyball.setIconTextGap(25);
        volleyball.addMouseListener(this);
        volleyball.addActionListener(this);


        //--------------TABLETENNIS---------
        tabletennisicon.setImage(tabletenniss);
        tabletennis.setBounds(50,435,250,40);
        tabletennis.setText("TABLTENNIS");
        tabletennis.setFocusable(false);
        tabletennis.setForeground(Color.WHITE);
        tabletennis.setFont(new Font("Times new Roman",Font.BOLD,24));
        tabletennis.setOpaque(true);
        tabletennis.setBackground(new Color(13,36,51));
        tabletennis.setBorder(border);
        tabletennis.setIcon(tabletennisicon);
        tabletennis.setHorizontalAlignment(JButton.LEFT);
        tabletennis.setIconTextGap(25);
        tabletennis.addMouseListener(this);
        tabletennis.addActionListener(this);
    }


    protected void timendate(){
        timeformat=new SimpleDateFormat("HH:mm:ss");
        dayformat=new SimpleDateFormat("EEEEE");
        dateformat=new SimpleDateFormat("MMMMM dd,yyyy");


        timelabel.setBounds(90,510,300,30);
        timelabel.setOpaque(false);
        timelabel.setBackground(new Color(13,36,51));
        timelabel.setForeground(new Color(250,151,47));
        timelabel.setFont(new Font("Roboto",Font.BOLD,25));


        daylabel.setBounds(160,550,300,30);
        daylabel.setOpaque(false);
        daylabel.setBackground(new Color(13,36,51));
        daylabel.setForeground(new Color(250,151,47));
        daylabel.setFont(new Font("Roboto",Font.BOLD,25));


        datelabel.setBounds(10,550,300,30);
        datelabel.setOpaque(false);
        datelabel.setBackground(new Color(13,36,51));
        datelabel.setForeground(new Color(250,151,47));
        datelabel.setFont(new Font("Roboto",Font.BOLD,25));


        setdata();
    }
    protected void setdata(){
        while(isActive()) {
            time = timeformat.format(Calendar.getInstance().getTime());
            timelabel.setText(time);
            day = dayformat.format(Calendar.getInstance().getTime());
            daylabel.setText(day);
            date = dateformat.format(Calendar.getInstance().getTime());
            datelabel.setText(date);

            }}


    protected void toplabel(){
        nustlogo.setImage(nust);

        imagelabel.setBounds(40,0,150,145);
        imagelabel.setOpaque(true);
        imagelabel.setBackground(new Color(13,36,51));
        imagelabel.setIcon(nustlogo);

        toplabel.setBounds(0,0,1200,180);
        toplabel.setBackground(new Color(13,36,51));
        toplabel.setOpaque(true);
        toplabel.setText("                         National University Of Sciences And Technology");
        toplabel.setForeground(Color.white);
        toplabel.setFont(new Font("Cinzel",Font.BOLD,34));
        toplabel.add(closebutton);
        toplabel.add(imagelabel);
    }
    protected void leftlabel(){
        leftlabel.setBounds(0,150,300,600);
        leftlabel.setBackground(new Color(13,36,51));
        leftlabel.setOpaque(true);
        leftlabel.add(home);
        leftlabel.add(currentstatus);
        leftlabel.add(badminton);
        leftlabel.add(basketball);
        leftlabel.add(volleyball);
        leftlabel.add(tabletennis);
        leftlabel.add(timelabel);
        leftlabel.add(datelabel);
        leftlabel.add(daylabel);
    }
    protected void frame(){
        this.setSize(1200,750);
        this.setUndecorated(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.setLayout(null);
        this.add(toplabel);
        this.add(leftlabel);
        this.add(container);
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        if(e.getSource()==home){
            home.setBackground(new Color(250, 151, 57));}

        if(e.getSource()==badminton){
            badminton.setBackground(new Color(250, 151, 57));}
        if(e.getSource()==basketball){
            basketball.setBackground(new Color(250, 151, 57));
        }
        if(e.getSource()==volleyball){
            volleyball.setBackground(new Color(250,151,57));
        }
        if(e.getSource()==tabletennis){
            tabletennis.setBackground(new Color(250,151,57));
        }if(e.getSource()==adddatabad){
            adddatabad.setBackground(new Color(250,151,57));
        }
        if(e.getSource()==deletedata){
            deletedata.setBackground(new Color(250,151,57));
        }
        if(e.getSource()==adddatabad1){
            adddatabad1.setBackground(new Color(250,151,57));
        }
        if(e.getSource()==deletedata1){
            deletedata1.setBackground(new Color(250,151,57));
        }
        if(e.getSource()==addddatabad2){
            addddatabad2.setBackground(new Color(250,151,57));
        }
        if(e.getSource()==deletedata2){
            deletedata2.setBackground(new Color(250,151,57));
        }
        if(e.getSource()==adddatabad3){
            adddatabad3.setBackground(new Color(250,151,57));
        }
        if(e.getSource()==deletedata3){
            deletedata3.setBackground(new Color(250,151,57));
        }
        if(e.getSource()==back){
            back.setBackground(new Color(250,151,57));
        }if(e.getSource()==back1){
            back1.setBackground(new Color(250,151,57));
        }if(e.getSource()==back2){
            back2.setBackground(new Color(250,151,57));
        }if(e.getSource()==back3){
            back3.setBackground(new Color(250,151,57));
        }if(e.getSource()==currentstatus){
            currentstatus.setBackground(new Color(250,151,57));
        }
    }

    @Override
    public void mousePressed(MouseEvent e) {
        if(e.getSource()==home){
        home.setBackground(new Color(250, 151, 57));}
        if(e.getSource()==badminton){
            badminton.setBackground(new Color(250, 151, 57));}
        if(e.getSource()==basketball){
            basketball.setBackground(new Color(250, 151, 57));
        }
        if(e.getSource()==volleyball){
            volleyball.setBackground(new Color(250,151,57));
        }
        if(e.getSource()==tabletennis){
            tabletennis.setBackground(new Color(250,151,57));
        }
        if(e.getSource()==adddatabad){
            adddatabad.setBackground(new Color(250,151,57));
        }
        if(e.getSource()==deletedata){
            deletedata.setBackground(new Color(250,151,57));
        }
        if(e.getSource()==adddatabad1){
            adddatabad1.setBackground(new Color(250,151,57));
        }
        if(e.getSource()==deletedata1){
            deletedata1.setBackground(new Color(250,151,57));
        }
        if(e.getSource()==addddatabad2){
            addddatabad2.setBackground(new Color(250,151,57));
        }
        if(e.getSource()==deletedata2){
            deletedata2.setBackground(new Color(250,151,57));
        }
        if(e.getSource()==adddatabad3){
            adddatabad3.setBackground(new Color(250,151,57));
        }
        if(e.getSource()==deletedata3){
            deletedata3.setBackground(new Color(250,151,57));
        }
        if(e.getSource()==back){
            back.setBackground(new Color(250,151,57));
        }if(e.getSource()==back1){
            back1.setBackground(new Color(250,151,57));
        }if(e.getSource()==back2){
            back2.setBackground(new Color(250,151,57));
        }if(e.getSource()==back3){
            back3.setBackground(new Color(250,151,57));
        }
        if(e.getSource()==currentstatus){
            currentstatus.setBackground(new Color(250,151,57));
        }
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        if(e.getSource()==home){
            home.setBackground(new Color(250, 151, 57));}
        if(e.getSource()==badminton){
            badminton.setBackground(new Color(250, 151, 57));}
        if(e.getSource()==basketball){
            basketball.setBackground(new Color(250, 151, 57));
        }
        if(e.getSource()==volleyball){
            volleyball.setBackground(new Color(250,151,57));
        }
        if(e.getSource()==tabletennis){
            tabletennis.setBackground(new Color(250,151,57));
        }if(e.getSource()==adddatabad){
            adddatabad.setBackground(new Color(250,151,57));
        }
        if(e.getSource()==deletedata){
            deletedata.setBackground(new Color(250,151,57));
        }
        if(e.getSource()==adddatabad1){
            adddatabad1.setBackground(new Color(250,151,57));
        }
        if(e.getSource()==deletedata1){
            deletedata1.setBackground(new Color(250,151,57));
        }
        if(e.getSource()==addddatabad2){
            addddatabad2.setBackground(new Color(250,151,57));
        }
        if(e.getSource()==deletedata2){
            deletedata2.setBackground(new Color(250,151,57));
        }
        if(e.getSource()==adddatabad3){
            adddatabad3.setBackground(new Color(250,151,57));
        }
        if(e.getSource()==deletedata3){
            deletedata3.setBackground(new Color(250,151,57));
        }
        if(e.getSource()==back){
            back.setBackground(new Color(250,151,57));
        }if(e.getSource()==back1){
            back1.setBackground(new Color(250,151,57));
        }if(e.getSource()==back2){
            back2.setBackground(new Color(250,151,57));
        }if(e.getSource()==back3){
            back3.setBackground(new Color(250,151,57));
        }
        if(e.getSource()==currentstatus){
            currentstatus.setBackground(new Color(250,151,57));
        }
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        if(e.getSource()==home){
            home.setBackground(new Color(250, 151, 57));}
        if(e.getSource()==badminton){
            badminton.setBackground(new Color(250, 151, 57));}
        if(e.getSource()==basketball){
            basketball.setBackground(new Color(250, 151, 57));
        }
        if(e.getSource()==volleyball){
            volleyball.setBackground(new Color(250,151,57));
        }
        if(e.getSource()==tabletennis){
            tabletennis.setBackground(new Color(250,151,57));
        }
        if(e.getSource()==adddatabad){
            adddatabad.setBackground(new Color(250,151,57));
        }
        if(e.getSource()==deletedata){
            deletedata.setBackground(new Color(250,151,57));
        }
        if(e.getSource()==adddatabad1){
            adddatabad1.setBackground(new Color(250,151,57));
        }
        if(e.getSource()==deletedata1){
            deletedata1.setBackground(new Color(250,151,57));
        }
        if(e.getSource()==addddatabad2){
            addddatabad2.setBackground(new Color(250,151,57));
        }
        if(e.getSource()==deletedata2){
            deletedata2.setBackground(new Color(250,151,57));
        }
        if(e.getSource()==adddatabad3){
            adddatabad3.setBackground(new Color(250,151,57));
        }
        if(e.getSource()==deletedata3){
            deletedata3.setBackground(new Color(250,151,57));
        }
        if(e.getSource()==back){
            back.setBackground(new Color(250,151,57));
        }if(e.getSource()==back1){
            back1.setBackground(new Color(250,151,57));
        }if(e.getSource()==back2){
            back2.setBackground(new Color(250,151,57));
        }if(e.getSource()==back3){
            back3.setBackground(new Color(250,151,57));
        }
        if(e.getSource()==currentstatus){
            currentstatus.setBackground(new Color(250,151,57));
        }
    }

    @Override
    public void mouseExited(MouseEvent e) {
        if(e.getSource()==home){
            home.setBackground(new Color(13,36,51));}
        if(e.getSource()==badminton){
            badminton.setBackground(new Color(13,36,51));}
        if(e.getSource()==basketball){
            basketball.setBackground(new Color(13,36,51));
        }
        if(e.getSource()==volleyball){
            volleyball.setBackground(new Color(13,36,51));
        }
        if(e.getSource()==tabletennis){
            tabletennis.setBackground(new Color(13,36,51));
        }
        if(e.getSource()==adddatabad){
            adddatabad.setBackground(new Color(14, 11, 47));
        }
        if(e.getSource()==deletedata){
            deletedata.setBackground(new Color(14, 11, 47));
        }
        if(e.getSource()==adddatabad1){
            adddatabad1.setBackground(new Color(14, 11, 47));
        }
        if(e.getSource()==deletedata1){
            deletedata1.setBackground(new Color(14, 11, 47));
        }
        if(e.getSource()==addddatabad2){
            addddatabad2.setBackground(new Color(14, 11, 47));
        }
        if(e.getSource()==deletedata2){
            deletedata2.setBackground(new Color(14, 11, 47));
        }
        if(e.getSource()==adddatabad3){
            adddatabad3.setBackground(new Color(14,11,47));
        }
        if(e.getSource()==deletedata3){
            deletedata3.setBackground(new Color(14,11,47));
        } if(e.getSource()==back){
            back.setBackground(new Color(14,11,47));
        }if(e.getSource()==back1){
            back1.setBackground(new Color(14,11,47));
        }if(e.getSource()==back2){
            back2.setBackground(new Color(14,11,47));
        }if(e.getSource()==back3){
            back3.setBackground(new Color(14,11,47));
        }
        if(e.getSource()==currentstatus){
            currentstatus.setBackground(new Color(13,36,51));
        }
    }
    int a=0;int b=0;int c=0;int d=0;int f=0;int g=0;int h=0;int i=0;int j=0;


    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==home){
            cardLayout.show(container,"1");
        }
        if(e.getSource()==currentstatus){
            try {
                new currentstatus();
            } catch (InterruptedException ex) {
                throw new RuntimeException(ex);
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        }

        if(e.getSource()==logout){
            JOptionPane.showMessageDialog(null,"You have been logged out");
            this.dispose();
            new Loginpage();
        }
        if(e.getSource()==adddatabad){
            if(b==0){
            new badmintondataentry();
            b=1;a=0;c=0;d=0;f=0;g=0;h=0;i=0;j=0;}
        }
        if(e.getSource()==deletedata){
            if(c==0){
            new badmintondeleteentry();
            c=1;a=0;b=0;d=0;f=0;g=0;h=0;i=0;j=0;}
        }
        if(e.getSource()==adddatabad1){
            if(d==0){
            new basketballdataentry();
            d=1;a=0;b=0;c=0;f=0;g=0;h=0;i=0;j=0;}
        }
        if(e.getSource()==deletedata1){
            if(f==0){
            new basketballdeleteentry();
            f=1;a=0;b=0;c=0;d=0;g=0;h=0;i=0;j=0;}
        }
        if(e.getSource()==addddatabad2){
            if(g==0){
            new volleyballdataentry();
            g=1;a=0;b=0;c=0;d=0;f=0;h=0;i=0;j=0;}
        }
        if(e.getSource()==deletedata2){
            if(h==0){
            new volleyballdeleteentry();
            h=1;a=0;b=0;c=0;d=0;f=0;g=0;i=0;j=0;}
        }
        if(e.getSource()==adddatabad3){
            if(i==0){
            new tabletennisdataentry();
            i=1;a=0;b=0;c=0;d=0;f=0;g=0;h=0;j=0;}
        }
        if(e.getSource()==deletedata3){
            if(j==0){
            new tabletennisdeleteentry();
            j=1;a=0;b=0;c=0;d=0;f=0;g=0;h=0;i=0;}
        }
        if(e.getSource()==back){
            cardLayout.previous(container);
        }if(e.getSource()==back1){
            cardLayout.previous(container);
        }if(e.getSource()==back2){
            cardLayout.previous(container);
        }if(e.getSource()==back3){
            cardLayout.previous(container);
        }
        if(e.getSource()==closebutton){
            this.dispose();
        }
            if(e.getSource()==badminton){
                a=0;b=0;c=0;d=0;f=0;g=0;h=0;i=0;j=0;
                cardLayout.show(container,"2");
            }if(e.getSource()==basketball){
            a=0;b=0;c=0;d=0;f=0;g=0;h=0;i=0;j=0;
                cardLayout.show(container,"3");
            } if(e.getSource()==volleyball){
            a=0;b=0;c=0;d=0;f=0;g=0;h=0;i=0;j=0;
            cardLayout.show(container,"4");
            } if(e.getSource()==tabletennis){
            a=0;b=0;c=0;d=0;f=0;g=0;h=0;i=0;j=0;
            cardLayout.show(container,"5");
            }

    }}

