package application;
import java.util.Stack;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.TilePane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.stage.StageStyle;



public class Calculator extends Application {

	private static final String[][] key = {
			{ "7", "8", "9", "/" },
			{ "4", "5", "6", "*" },
			{ "1", "2", "3", "-" },
			{ "0", "AC", "=", "+" }
	};
	private Button button[][] = new Button[4][4];
	TextField tf;  
	boolean isEqual = false;
	boolean error= false;
	int repeat=0;
	String exp;
	String temp;
	String sample = "0";
	String sample2 = "0";
	double op1;
	double op2;
	double sum;
	double checkNum=0.0;
	double temp_sum=0.0;
	Stack <String>stack = new Stack<>();
	Stack <String>stack_new = new Stack<>();

	public static void main(String[] args) 
	{ 
		launch(args);
	}
	@Override public void start(Stage stage) {


		final VBox layout = new VBox(30); 
		TilePane keypad = new TilePane(); 
		keypad.setVgap(10);
		keypad.setHgap(10);

		tf =  new TextField();
		keypad.setPrefColumns(key[0].length); 

		for (int i = 0; i < 4; i++) 
		{
			for (int j = 0; j < 4; j++) 
			{
				button[i][j] = new Button(key[i][j]);
				final int a = i;
				final int b = j;
				button[i][j].setOnAction(new EventHandler<ActionEvent>(){

					@Override
					public void handle(ActionEvent event) {
						if(isEqual){
							tf.clear();
							isEqual = false;
						}
						tf.appendText(key[a][b]);
						exp = tf.getText().toString();

					}

				}

						);

				keypad.getChildren().add(button[i][j]);
			}
		}

		button[3][1].setOnAction(new EventHandler<ActionEvent>()
		{

			@Override
			public void handle(ActionEvent arg0) {
				tf.setText("");
				error=false;
			}


		});

		button[3][2].setOnAction(new EventHandler<ActionEvent>()
		{

			@Override
			public void handle(ActionEvent arg0) 
			{

				isEqual = true;

				exp = exp+"\n";
				char [] ch = exp.toCharArray();
				int len = ch.length;
				int i=0;

				for(int j=0;j<len;j++)
				{
					if(ch[j]>='0' && ch[j]<='9')
					{
						i=j;
						sample = "0";
						while(ch[i]>='0' && ch[i]<='9' && i < len)
						{
							if(ch[i]>='0' && ch[i]<='9')
							{
								sample = sample+exp.charAt(i);
								i++;
							}
						}
						stack.push(sample);
						j=i-1;
					}
					else
					{
						stack.push(Character.toString(ch[i]));
					}
				}
				temp=stack.pop();
				int size= stack.size();

				while(!stack.isEmpty())
				{
					sample2=stack.pop();
					stack_new.push(sample2);
				}

				while(!stack_new.isEmpty())
				{
					temp=stack_new.peek();
					int type =checkString(temp) ;

					if(type == 0)
					{
						op1 = Double.parseDouble(temp);
						stack_new.pop();
					}
					else if(type ==5)
					{
						error=false;
						break;
					}
					else
					{
						int op=checkString(temp);
						stack_new.pop();
						temp=stack_new.peek();
						type =checkString(temp) ;
						if(type!=0)
						{
							error=false;
						}
						else
						{

							op2=Double.parseDouble(temp);
							if(op==1)
							{
								temp_sum=op1+op2;
							}
							else if(op==2)
							{
								temp_sum=op1-op2;
							}
							else if(op==3)
							{
								temp_sum=op1*op2;
							}
							else
							{
								if(op2!=0)
								{
									temp_sum=op1/op2;
								}
								else
								{
									error=true;
								}
							}
							op1=temp_sum;
						}
						stack_new.pop();
					}

				}
				if(error==false)
					tf.setText(""+temp_sum);
				else if(error=true)
				{
					tf.setText("Error");
					error=false;
				}
			}
			public int checkString(String temp) {

				if(temp.length()==1)
				{

					char ch=temp.charAt(0);
					if(ch=='+')
						return 1;
					else if(ch=='-')
						return 2;
					else if(ch=='*')
						return 3;
					else if(ch=='/')
						return 4;
					else 
						return 5;

				}
				else
					return 0;
			}

		});

		layout.getChildren().addAll(tf, keypad);
		stage.setTitle("Calculator");
		Scene scene = new Scene(layout);
		stage.setScene(scene);
		stage.show();
	}

}
