import java.io.FileReader;
import java.net.URLDecoder;
import java.util.Properties;

public class PropertiesEx {
    public static void main(String[] args) throws Exception {   // throws Exception 추가(파일 불러오는 것이기때문)
        Properties properties = new Properties();

//        Properties는 String 타입으로 고정되어있기때문에 <String> 생략
//        현재 클래스의 리스소를 가져온다(src폴더의 리소스) -> getResource(위치) : 파일의 위치 , getPath() : 파일 위치의 전체 경로 가져오기
        String path = PropertiesEx.class.getResource("database.properties").getPath();  // 불러올 파일 위치 잡기

        path = URLDecoder.decode(path, "utf-8");    // 한글이 있을때 안깨지게 utf-8 로 바꿔라
        System.out.println("파일 경로 : " + path); // 결과값 : /D:/java505/intellij/chap07/out/production/chap07/database.properties

//        load를 통해 파일 내용을 읽어옴
        properties.load(new FileReader(path));  // 해당 파일 가져오기,


        String driver = properties.getProperty("driver");
        String url = properties.getProperty("url");
        String username = properties.getProperty("username");
        String password = properties.getProperty("password");

        System.out.println("driver : " + driver);
        System.out.println("url : " + url);
        System.out.println("username : " + username);
        System.out.println("password : " + password);

    }
}
