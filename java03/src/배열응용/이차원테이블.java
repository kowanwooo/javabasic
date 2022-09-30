package 배열응용;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class 이차원테이블 {
	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setSize(500, 500);

		String[] header = { "컴퓨터", "영어", "수학", "체육" };
		String[][] contents = {

				{"100","88","99", "77"},
				{"100","88","99", "77"},
				{"100","88","99", "77"},
				{"100","88","99", "77"},
				{"100","88","99", "77"},
				{"100","88","99", "77"},
				{"100","88","99", "77"},
				{"100","88","99", "77"},
				{"100","88","99", "77"},
				{"100","88","99", "77"},
				{"100","88","99", "77"},
				{"100","88","99", "77"},
				{"100","88","99", "77"},
				{"100","88","99", "77"},
				{"100","88","99", "77"},
				{"100","88","99", "77"}
		};
		
		JTable table = new JTable(contents, header);
		JScrollPane scroll = new JScrollPane(table);
		f.add(scroll);
		f.setVisible(true);
		
		for (int i = 0; i < contents.length; i++) {
			for (int j = 0; j < contents[0].length; j++) {
				System.out.print(contents[i][j] + " ");
			}
			System.out.println();
		}
	}
}
