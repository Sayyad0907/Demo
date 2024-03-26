package sopra.edu.training.SpringBootMVC;

import org.springframework.stereotype.Service;

@Service
public class UserService {
	public boolean loginCheck(String name,String passw) {
		return name.equals("admin") && passw.equals("123");
	}
	
	public int calculate(int n1,int n2,String calc) {
		switch(calc) {
		case "ADD":{
			return n1+n2;
		}case "SUB":{
			return n1-n2;
		}case "MUL":{
			return n1*n2;
		}case "DIV":{
			return n1/n2;
		}case "MOD":{
			return n1%n2;
		}
		}
		return 0;
	}
}
