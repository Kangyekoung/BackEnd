package 형변환응용;

import java.io.IOException;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

public class 네이버크롤링 {

	public static void main(String[] args) {
		//연결담당
		Connection conn	= Jsoup.connect("http://www.naver.com");	//Connection
		System.out.println(conn);
		try {
			//html문서
			Document doc = conn.get();
			System.out.println(doc);
			
			Elements list = doc.select("span");//ArrayList --상속 --> Elements
			//조건에 맞는거 태그들의 리스트를 객체 {태그, 태그, 태그, ...}
			System.out.println(list.size());
			
			
			for (int i = 0; i < list.size(); i++) {
				System.out.println(list.get(i).text());
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}//연결한 사이트에서 코드를 다 가지고 온다. html문서에 대해 코드 Documnet
		//위험한 상황 - 외부자원 연결(cpu, file), network
		//위험한 상황에 대해서는 상황이 발생했을 때 어떻게 처리할지를 반드시 명시해야한다.
	}

}
