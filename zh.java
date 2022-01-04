package z;



public class zh {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		int n = 5, i = 0, j = 0, k = 0,b = 0;
		String z[][] = new String[n][n];
		String o[][] = new String[n][n];
		for(b = 0; b < 4;b++) {


			for(i = 0; i <n;i++) {

				for(j=0;j<n;j++) {
					if( b == 0) {

						if(i==0) {
							z[i][j] = "Z";
							System.out.print(z[i][j]); 
						}                	
						if(i==1) {
							if(j == n-2) {
								z[i][n-2] = "Z";
								System.out.print(z[i][n-2]);
							}else {                			
								z[i][j] = " ";
								System.out.print(z[i][j]);
							}                		

						}    
						if(i==2) {
							if(j == n-3) {
								z[i][n-3] = "Z";
								System.out.print(z[i][n-3]);
							}else {                			
								z[i][j] = " ";
								System.out.print(z[i][j]);
							}                		

						}  
						if(i==3) {
							if(j == n-4) {
								z[i][n-4] = "Z";
								System.out.print(z[i][n-4]);
							}else {                			
								z[i][j] = " ";
								System.out.print(z[i][j]);
							}                		

						}   
						if(i==4) {

							z[i][j] = "Z";
							System.out.print(z[i][j]); 
						}   
					}

					if( b == 1 || b == 3) {

						if(i==0 || i == 4) {
							o[i][j] = "O";
							System.out.print(o[i][j]); 
						}    
						if(i== 1 ||  i==2 || i==3) {
							if(j == 0) {
								o[i][j] = "O";
								System.out.print(o[i][j]); 
							}else if(j==4) {
								o[i][j] = "O";
								System.out.print(o[i][j]); 
							}else {
								o[i][j] = " ";
								System.out.print(o[i][j]); 

							}

						}   


					}
					if(b == 2) {

 
						if(i != 2) {
							if(j == 0) {
								o[i][j] = "H";
								System.out.print(o[i][j]); 
							}else if(j==4) {
								o[i][j] = "H";
								System.out.print(o[i][j]); 
							} 
							else {
								o[i][j] = " ";
								System.out.print(o[i][j]); 

							}  
						}else if(i ==2) {

							o[i][j] = "H";
							System.out.print(o[i][j]);
						}

 
					}

				}	


				System.out.println(" ");

			}	
			System.out.println(" ");
		}

 
	}

}
