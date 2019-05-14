package java15;

import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class BbsMain {
	private JTextField id_text;
	private JTextField title_text;
	private JTextField content_text;
	private JTextField etc_text;

	public BbsMain() {
		JFrame jf = new JFrame();
		jf.getContentPane().setBackground(new Color(255, 255, 204));
		jf.setSize(400, 500);
		FlowLayout flow = new FlowLayout();
		jf.getContentPane().setLayout(flow);

		JLabel lbl1 = new JLabel("아이디>>");
		lbl1.setForeground(new Color(0, 0, 139));
		lbl1.setBackground(new Color(255, 153, 255));
		lbl1.setFont(new Font("굴림", Font.PLAIN, 26));
		jf.getContentPane().add(lbl1);

		id_text = new JTextField();
		id_text.setBackground(new Color(255, 228, 225));
		id_text.setFont(new Font("굴림", Font.PLAIN, 26));
		jf.getContentPane().add(id_text);
		id_text.setColumns(10);

		JLabel lbl2 = new JLabel("제목>>");
		lbl2.setForeground(new Color(0, 0, 139));
		lbl2.setFont(new Font("굴림", Font.PLAIN, 26));
		lbl2.setBackground(new Color(255, 153, 255));
		jf.getContentPane().add(lbl2);

		title_text = new JTextField();
		title_text.setBackground(new Color(255, 228, 225));
		title_text.setFont(new Font("굴림", Font.PLAIN, 26));
		title_text.setColumns(10);
		jf.getContentPane().add(title_text);

		JLabel lbl3 = new JLabel("컨텐츠>>");
		lbl3.setForeground(new Color(0, 0, 139));
		lbl3.setFont(new Font("굴림", Font.PLAIN, 26));
		lbl3.setBackground(new Color(255, 153, 255));
		jf.getContentPane().add(lbl3);

		content_text = new JTextField();
		content_text.setBackground(new Color(255, 228, 225));
		content_text.setFont(new Font("굴림", Font.PLAIN, 26));
		content_text.setColumns(10);
		jf.getContentPane().add(content_text);

		JLabel lbl4 = new JLabel("기타>>");
		lbl4.setForeground(new Color(0, 0, 139));
		lbl4.setFont(new Font("굴림", Font.PLAIN, 26));
		lbl4.setBackground(new Color(255, 153, 255));
		jf.getContentPane().add(lbl4);

		etc_text = new JTextField();
		etc_text.setBackground(new Color(255, 228, 225));
		etc_text.setFont(new Font("굴림", Font.PLAIN, 26));
		etc_text.setColumns(10);
		jf.getContentPane().add(etc_text);

		JButton btncreate = new JButton("BBS 만들기");
		btncreate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				BbsDAO dao = new BbsDAO();
				BbsDTO dto = new BbsDTO();

				dto.setId(id_text.getText());
				dto.setTitle(title_text.getText());
				dto.setContent(content_text.getText());
				dto.setEtc(etc_text.getText());

				dao.insert(dto);
			}
		});
		btncreate.setFont(new Font("굴림", Font.BOLD, 26));
		jf.getContentPane().add(btncreate);

		JButton btnread = new JButton("BBS 검색하기");
		btnread.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String inputId = id_text.getText();
				BbsDAO dao = new BbsDAO();
				BbsDTO dto = dao.select(inputId);
				String id = dto.getId();
				String title = dto.getTitle();
				String content = dto.getContent();
				String etc = dto.getEtc();

				id_text.setText(id);
				title_text.setText(title);
				content_text.setText(content);
				etc_text.setText(etc);
			}
		});
		btnread.setFont(new Font("굴림", Font.BOLD, 26));
		jf.getContentPane().add(btnread);

		JButton btnupdate = new JButton("BBS 수정하기");
		btnupdate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String wantchange = JOptionPane.showInputDialog("수정하고 싶은 ID는 ? ");

				BbsDAO dao = new BbsDAO();
				BbsDTO dto = new BbsDTO();
				String id = id_text.getText();
				String title = title_text.getText();
				String content = content_text.getText();
				String etc = etc_text.getText();
				dto.setId(id);
				dto.setTitle(title);
				dto.setContent(content);
				dto.setEtc(etc);

				dao.update(dto, wantchange);

			}
		});
		btnupdate.setFont(new Font("굴림", Font.BOLD, 26));
		jf.getContentPane().add(btnupdate);

		JButton btndelete = new JButton("BBS 삭제하기");
		btndelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String inputId = id_text.getText();
				BbsDAO dao = new BbsDAO();
				BbsDTO dto = new BbsDTO();
				dto.setId(inputId);

			}
		});
		btndelete.setFont(new Font("굴림", Font.BOLD, 26));
		jf.getContentPane().add(btndelete);

		jf.setVisible(true);
	}

	public static void main(String[] args) {
		BbsMain name = new BbsMain();

	}

}
