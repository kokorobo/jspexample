package Trpg;

import java.io.IOException;

import Trpg.DB.weapon;
import controller.LoginController;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class TrpgMain extends Application {
	

	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
		
		FXMLLoader loader = 
				new FXMLLoader(getClass().getResource("mainPage.fxml"));
		Parent root = loader.load();
		Scene scene = new Scene(root);
		mainController ctrl = loader.getController();
		ctrl.setRoot(root);
		
		primaryStage.setScene(scene);
		primaryStage.show();
	}
	
	public static void main(String[] args) throws InterruptedException, IOException {
		
		
		
		System.out.println("�ش� ���ӿ� ������ ��Ұ� ��û �����ϴ�.");
		weapon wp = new weapon();
		Plaing pl = new Plaing();
		ch1 ch1 = new ch1();
		
		pl.mainpage();
		
		

//		pl.wpinfo("���ҵ�");
//		pl.attack(14);
		
//		pl.defence();
//		pl.meetenemy("���");
//		ch1.sc1();
	}
}
