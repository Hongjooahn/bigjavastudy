package exam;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import javax.swing.JTextField;

import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import java.awt.SystemColor;
import java.awt.Color;

public class CarUser {
	private static JTextField id;
	private static JTextField name;
	private static JTextField content;
	private static JTextField price;

	public static void main(String[] args) {

		JFrame jf = new JFrame();
		jf.getContentPane().setBackground(SystemColor.activeCaption);
		jf.setSize(400, 400);
		jf.getContentPane().setLayout(null);

		JLabel lb1 = new JLabel("아이디");
		lb1.setForeground(new Color(0, 0, 128));
		lb1.setBounds(42, 10, 120, 31);
		lb1.setFont(new Font("굴림", Font.PLAIN, 26));
		jf.getContentPane().add(lb1);

		id = new JTextField();
		id.setBounds(167, 10, 176, 32);
		id.setFont(new Font("굴림", Font.PLAIN, 22));
		jf.getContentPane().add(id);
		id.setColumns(10);

		JLabel lb2 = new JLabel("이름");
		lb2.setForeground(new Color(0, 0, 128));
		lb2.setBounds(42, 47, 120, 31);
		lb2.setFont(new Font("굴림", Font.PLAIN, 26));
		jf.getContentPane().add(lb2);

		name = new JTextField();
		name.setBounds(167, 47, 176, 32);
		name.setFont(new Font("굴림", Font.PLAIN, 22));
		name.setColumns(10);
		jf.getContentPane().add(name);

		JLabel lb3 = new JLabel("콘텐츠");
		lb3.setForeground(new Color(0, 0, 128));
		lb3.setBounds(42, 84, 120, 31);
		lb3.setFont(new Font("굴림", Font.PLAIN, 26));
		jf.getContentPane().add(lb3);

		content = new JTextField();
		content.setBounds(167, 84, 176, 32);
		content.setFont(new Font("굴림", Font.PLAIN, 22));
		content.setColumns(10);
		jf.getContentPane().add(content);

		JLabel lb4 = new JLabel("가격");
		lb4.setForeground(new Color(0, 0, 128));
		lb4.setBounds(42, 121, 120, 31);
		lb4.setFont(new Font("굴림", Font.PLAIN, 26));
		jf.getContentPane().add(lb4);

		price = new JTextField();
		price.setBounds(167, 121, 176, 32);
		price.setFont(new Font("굴림", Font.PLAIN, 22));
		price.setColumns(10);
		jf.getContentPane().add(price);

		JButton btnNewButton = new JButton("<< 이대로 만들기 >>");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					CarDAO cdao = new CarDAO();
					CarDTO cdto = new CarDTO();
					cdto.setId(id.getText());
					cdto.setName(name.getText());
					cdto.setContent(content.getText());
					cdto.setPrice(price.getText());
					cdao.create(cdto);
				} catch (Exception e1) {
					e1.printStackTrace();
				}
			}
		});
		btnNewButton.setBounds(77, 170, 219, 29);
		btnNewButton.setFont(new Font("굴림", Font.PLAIN, 18));
		jf.getContentPane().add(btnNewButton);

		JButton button = new JButton("<< ID로 정보검색 >>");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {

					CarDAO cdao = new CarDAO();
					CarDTO cdto = new CarDTO();
					cdao.select(cdto, id.getText());
					JOptionPane.showMessageDialog(null, id.getText() + "의 정보 검색완료 , 빈칸에 입력하겠습니다");
					id.setText(cdto.getId());
					name.setText(cdto.getName());
					content.setText(cdto.getContent());
					price.setText(cdto.getPrice());
				} catch (Exception e1) {
					e1.printStackTrace();
				}
			}
		});
		button.setFont(new Font("굴림", Font.PLAIN, 18));
		button.setBounds(77, 200, 219, 29);
		jf.getContentPane().add(button);

		JButton button_3 = new JButton("<< 모든 ID 전체 검색 >>");
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					CarDAO cdao = new CarDAO();
					CarDTO cdto = new CarDTO();
					ArrayList list = cdao.selectall(cdto);
					for (int i = 0; i < list.size(); i++) {
						CarDTO dto = (CarDTO) list.get(i);
						JOptionPane.showMessageDialog(null, "id : " + dto.getId() + " / name : " + dto.getName()
								+ " / content : " + dto.getContent() + " / price : " + dto.getPrice());
					}
				} catch (Exception e1) {
					e1.printStackTrace();
				}

			}
		});
		button_3.setFont(new Font("굴림", Font.PLAIN, 18));
		button_3.setBounds(60, 230, 250, 29);

		jf.getContentPane().add(button_3);
		JButton button_1 = new JButton("<< 이 정보대로 다른 ID 수정 >>");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
				CarDAO cdao = new CarDAO();
				CarDTO cdto = new CarDTO();
				cdto.setId(id.getText());
				cdto.setName(name.getText());
				cdto.setContent(content.getText());
				cdto.setPrice(price.getText());
				//
				String change = JOptionPane.showInputDialog("바꾸고 싶은 ID는 ?");
				cdao.update(cdto, change);
				JOptionPane.showMessageDialog(null, "변경이 완료되었습니다");
				}
				catch(Exception e1){
					e1.printStackTrace();
				}
			}
		});
		button_1.setFont(new Font("굴림", Font.PLAIN, 18));
		button_1.setBounds(31, 260, 298, 29);
		jf.getContentPane().add(button_1);

		JButton button_2 = new JButton("<< 이 ID의 정보 삭제 >>");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					CarDAO cdao = new CarDAO();
					CarDTO cdto = new CarDTO();
					cdao.delete(id.getText());
				} catch (Exception e1) {
					e1.printStackTrace();
				}
			}
		});
		button_2.setFont(new Font("굴림", Font.PLAIN, 18));
		button_2.setBounds(60, 290, 250, 29);
		jf.getContentPane().add(button_2);

		jf.setVisible(true);

	}
}
