import java.util.*;
public class TicTacToe {

	public static void main(String[] args) {
		Scanner ab=new Scanner(System.in);
		int T=ab.nextInt();
			
			while(T-->0){
			    char mat[][]=new char[3][3];
		        int x=0,o=0,flagx=0,flago=0,u=0;
		        for(int i=0;i<3;i++){
		            for(int j=0;j<3;j++){
		                mat[i][j]=ab.next().charAt(0);
		                if(mat[i][j]=='X') x++;
		                else if(mat[i][j]=='O') o++;
		                else if(mat[i][j]=='_') u++;
		            }
		        }
		        
		        for(int i=0;i<3;i++){
		            if(mat[i][0]==mat[i][1] && mat[i][2]==mat[i][1]){ //Checking rows
		                if(mat[1][0] =='X') flagx++;
		                else if(mat[1][0] =='O') flago++;
		            }
		        }
		        
		        for(int i=0;i<3;i++){
		            if(mat[0][i]==mat[1][i] && mat[2][i]==mat[1][i]){ //Checking columns
		                if(mat[0][i]=='X')flagx++;
		                else if(mat[0][i]=='O')flago++;
		            }
		        }
		        
		        if(mat[0][0]==mat[1][1] && mat[2][2]==mat[1][1]){ //Checking top left diagnol
		            if(mat[1][1]=='X') flagx++;
		            else if(mat[1][1]=='O') flago++; 
		        }
		        
		        if(mat[0][2]==mat[1][1] && mat[2][0]==mat[1][1]){ //Checking top right diagnol
		            if(mat[1][1]=='X')flagx++;
		            else if(mat[1][1]=='O')flago++;
		        }
		        
		        if(o>x) System.out.println(3); 
		        else if(x-o>1) System.out.println(3); 
		        else if((x>o) && flagx==1 && flago==0){
		        	System.out.println(1); 
		        }
		        else if((x>=o) && flago==1 && flagx==0){
		        	System.out.println(1); 
		        }
		        else if(u==0 && (flagx+flago==0)) System.out.println(3); 
		        else if(u==0 &&flagx==2){
		        	System.out.println(3);
		        }
		        else if(u>0 && (flagx+flago==0)) {
		        	System.out.println(2); 
		        }
		        else System.out.println(3); 
			}

			
		}

	}


