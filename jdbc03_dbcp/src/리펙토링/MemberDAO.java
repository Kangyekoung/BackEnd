package 리펙토링;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class MemberDAO { // member테이블에 crud를 하고 싶으면 MemberDAO를 사용하면 됨.!
	// DAO : db access object
	// shop db member table에
	// 접근해서 처리하는 객체
	
	
	//전역변수(글로벌 변수)//초기화는 null
	Connection con; //클래스 바로 아래에 만들어주면 클래스 전체영역에서 사용 가능
	
	// new를 이용해서 객체생성시 클래스이름과 동일한 메서드가 있으면 자동실행
	public MemberDAO() {
	//생성자에 private를 붙여놓으면 외부 자바파일에서 객체생성불가능!
		//private MemberDAO() {
		// 객체생성시 자동호출되는 메서드 == 생성자 (메서드), constructor
		// jdbc1,2단계
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("1. 커넥터 연결 성공!!");
			String url = "jdbc:mysql://localhost:3306/shop?useUnicode=true&serverTimezone=Asia/Seoul";
			String user = "root";
			String password = "1234";
			//지역변수(로컬변수)
			//Connection con = DriverManager.getConnection(url, user, password);
			con = DriverManager.getConnection(url, user, password);
			System.out.println("2. shop db연결 성공!!");
		} catch (ClassNotFoundException e) {
			System.out.println("드라이버 파일을 찾을 수 없음.");
		} catch (SQLException e) {
			System.out.println("mySQL 연결할 때 문제가 생김.");
			e.printStackTrace();
		} finally {
			//con.close();
		}

	}

	public MemberVO one(String id) {
		MemberVO bag = new MemberVO(); // 자바 리턴은 1개, sql 결과는 여러개라서 가방에 담아야한다.
		try {

			String sql = "select * from member where id = ? ";
			PreparedStatement ps = con.prepareStatement(sql); //
			ps.setString(1, id); // 물음표 번호 1번에 id에 저장한 변수값을 넣어줘!
			System.out.println("3. sql문 생성 성공!!");
			ResultSet table = ps.executeQuery(); // 테이블로 mysql로 받아온다.
			System.out.println("4. SQL문 mySQL로 전송 성공!!");
			// System.out.println(table.next()); //table안에 데이터가 있으면 true
			if (table.next()) { // table안에 검색결과인 row가 있는지 체크
				String id2 = table.getString("id"); // id는 컬럼명
				String pw = table.getString("pw");
				String name = table.getString("name");
				String tel = table.getString("tel");
//                System.out.println(id2);
//                System.out.println(pw);
//                System.out.println(name);
//                System.out.println(tel);

				bag.setId(id2);
				bag.setPw(pw);
				bag.setName(name);
				bag.setTel(tel);

			} else {
				System.out.println("검색결과가 없음.");
			}

			
			ps.close();
			table.close();
		} catch (Exception e) { // Exception == Error
			e.printStackTrace();// 에러정보를 추적해서 프린트해줘.!
			System.out.println("에러발생함.!!!!");
		}

		return bag;
	} // one

	public int delete(String id) {
		int result = 0;
		try {
			String sql = "delete from member where id = ? ";
			PreparedStatement ps = con.prepareStatement(sql); //
			ps.setString(1, id); // 물음표 번호 1번에 id에 저장한 변수값을 넣어줘!
			System.out.println("3. sql문 생성 성공!!");

			result = ps.executeUpdate();
			System.out.println("result : " + result);
			System.out.println("4. SQL문 mySQL로 전송 성공!!");
		} catch (Exception e) { // Exception == Error
			e.printStackTrace();// 에러정보를 추적해서 프린트해줘.!
			System.out.println("에러발생함.!!!!");
		}
		return result;
	} // delete

	// public void insert(String id, String pw, String name, String tel) {
	public int insert(MemberVO bag) {
		// Java-DB연결 (JDBC) 4단계
		// 1. 연결할 부품(커넥터, driver, 드라이버) 설정
		int result = 0;
		try {

			// 3. 2번에서 연결된 것을 가지고 sql문 생성
			String sql = "insert into member values (?, ?, ?, ?)";

			PreparedStatement ps = con.prepareStatement(sql); //
			ps.setString(1, bag.getId()); // 물음표 번호 1번에 id에 저장한 변수값을 넣어줘!
			ps.setString(2, bag.getPw()); // 물음표 번호 2번에 pw에 저장한 변수값을 넣어줘!
			ps.setString(3, bag.getName()); // 물음표 번호 3번에 name에 저장한 변수값을 넣어줘!
			ps.setString(4, bag.getTel()); // 물음표 번호 3번에 tel에 저장한 변수값을 넣어줘!
			System.out.println("3. sql문 생성 성공!!");

			// 4. 3번에서 생성된 sql문을 Mysql로 전송
			result = ps.executeUpdate(); // int;
			System.out.println("result : " + result);
			System.out.println("4. SQL문 mySQL로 전송 성공!!");

			con.close();
			ps.close();
		} catch (Exception e) { // Exception == Error
			e.printStackTrace();// 에러정보를 추적해서 프린트해줘.!
			System.out.println("에러발생함.!!!!");
		}
		return result;

	} // insert

	public int update(String id, String tel) {
		// Java-DB연결 (JDBC) 4단계
		// 1. 연결할 부품(커넥터, driver, 드라이버) 설정
		int result = 0;
		try {

			// 3. 2번에서 연결된 것을 가지고 sql문 생성
			String sql = "update member set tel = ? where id = ? ";
			PreparedStatement ps = con.prepareStatement(sql); //
			ps.setString(1, tel); // 물음표 번호 1번에 id에 저장한 변수값을 넣어줘!
			ps.setString(2, id); // 물음표 번호 2번에 pw에 저장한 변수값을 넣어줘!
			System.out.println("3. sql문 생성 성공!!");

			// URL site = new URL(site);

			// 4. 3번에서 생성된 sql문을 Mysql로 전송
			result = ps.executeUpdate();
			System.out.println("result : " + result);
			System.out.println("4. SQL문 mySQL로 전송 성공!!");

			con.close();
			ps.close();
		} catch (Exception e) { // Exception == Error
			e.printStackTrace();// 에러정보를 추적해서 프린트해줘.!
			System.out.println("에러발생함.!!!!");
		}
		return result;
	} // update

} // class
