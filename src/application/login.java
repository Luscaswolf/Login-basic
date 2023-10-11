package application;

import java.util.Scanner;

public class login {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		String user = "adm";
		String password = "123";
		
		System.out.println("digite seu usuario");
		String inputUser = scanner.nextLine();
		
		System.out.println("digite sua senha");
		String inputPassword = scanner.nextLine();
		
		if(inputUser.equals(user) && inputPassword.equals(password)) {
			System.out.println("Bem vindo!");
		}else {
			System.out.println("Erro ao logar");
		}
		
		
		scanner.close();
	}

}
