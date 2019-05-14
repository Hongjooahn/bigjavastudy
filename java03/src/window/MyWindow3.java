package window;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Font;
import javax.swing.SwingConstants;

public class MyWindow3 {

    public static void main(String[] args) {
        //프레임
        JFrame f = new JFrame("입력값 받는 프로그램.");
        f.setSize(474, 294);
        
        //물흐르듯이 배치
        FlowLayout flow = new FlowLayout();
        JTextField text = new JTextField(20);
        text.setBackground(Color.YELLOW);
        text.setFont(new Font("굴림", Font.PLAIN, 18));
        JLabel label = new JLabel("당신의 과목을 입력하세요.");
        label.setFont(new Font("굴림", Font.PLAIN, 16));
        JTextField text2 = new JTextField(20);
        text2.setBackground(Color.YELLOW);
        text2.setFont(new Font("굴림", Font.PLAIN, 18));
        JLabel label2 = new JLabel("당신의 주요 프로그램 언어를 입력하세요.");
        label2.setFont(new Font("굴림", Font.PLAIN, 16));
        JButton button = new JButton("나를 눌러요.");    
        button.setFont(new Font("굴림", Font.BOLD, 20));
        
        f.getContentPane().setLayout(flow);
        
        //버튼
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                System.out.println("버튼이 눌러졌군요..!!");
                String data = text.getText();
                String data2 = text2.getText();
                System.out.println("당신의 주요 과목은 : " + data);
                System.out.println("당신의 주요 프로그램언어는 : " + data2);
            }
        });
        
        //글자들
        //입력받는 화면(한줄짜리)
        
        f.getContentPane().add(label);
        f.getContentPane().add(text);
        f.getContentPane().add(label2);
        f.getContentPane().add(text2);
        f.getContentPane().add(button);
        
        f.setVisible(true);
    }

}