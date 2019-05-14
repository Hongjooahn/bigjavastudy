package company;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;

public class Calculator {
	public void cal(String mainfileselect) {
		File mainfile = new File(mainfileselect); // 무조건 파일이어야 함
		File save = new File("C:\\hong\\file_name_2.txt");// 파일이름 저장 대상
		File[] mainfileList = mainfile.listFiles(); // 파일 리스트들의 배열을 입력

				for (int file1 = 0; file1 < mainfileList.length; file1++) {
					try {
						if (mainfileList[file1].isFile()) {
							PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter(save, true)));
							String str = mainfileList[file1].getName();
							if (str.contains(".txt")) { // 파일 이름 조건
								pw.println(str);
								// pw.println(subfileList[file2]); 파일 경로까지 출력
								pw.flush();
								str = mainfileList[file1].getName();
//								str = subfileList[file2].getParent();// 부모디렉터리 get
//								pw2.print(str);// 부모디렉터리 입력
//								pw2.println();
//								pw2.flush();     <== 부모디렉터리 경로까지 출력됨
							}
						}
					} catch (Exception e) {

						e.getStackTrace();
					}

				}

			}
		

	public void Cal_2(String mainfileselect) { // 깊이 2

		File mainfile = new File(mainfileselect); // 무조건 파일이어야 함
		File[] mainfileList = mainfile.listFiles(); // 파일 리스트들의 배열을 입력
		File save = new File("C:\\hong\\file_name.txt");// 파일이름 저장 대상
		File save_parent = new File("C:\\hong\\file_parent.txt");// 파일이름 저장 대상

		for (int file1 = 0; file1 < mainfileList.length; file1++) {

			if (mainfileList[file1].isDirectory()) {
				File[] subfileList = mainfileList[file1].listFiles(); // 메인폴더 아래에 있는 서브 폴더안의 내용 배열

				for (int file2 = 0; file2 < subfileList.length; file2++) {
					try {
						if (subfileList[file2].isFile()) {
							PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter(save, true)));
							PrintWriter pw2 = new PrintWriter(new BufferedWriter(new FileWriter(save_parent, true)));
							String str = subfileList[file2].getName();
							if (str.contains(".txt")) { // 파일 이름 조건
								pw.println(str);
								// pw.println(subfileList[file2]); 파일 경로까지 출력
								pw.flush();

								str = mainfileList[file1].getName();
								pw2.println(str);// 부모디렉터리 입력
								pw2.flush();// <== 부모디렉터리 이름만 출력됨

//								str = subfileList[file2].getParent();// 부모디렉터리 get
//								pw2.print(str);// 부모디렉터리 입력
//								pw2.println();
//								pw2.flush();     <== 부모디렉터리 경로까지 출력됨
							}
						}
					} catch (Exception e) {

						e.getStackTrace();
					}

				}

			}
		}

	}
}
