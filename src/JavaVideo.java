
public class JavaVideo {
	
	public static void main(String[] args){
		
	  int[][] a = new int[2][3];
	  int num = 2;
	  
	  for(int i = 0;i < a.length;i++){
		  
		   for(int j = 0;j < a[i].length;j++)
		   {
			   
			   a[i][j] = num; 
			   num = num + 2;
			   System.out.println("a["+i+"]"+"b["+j+"]"+"="+a[i][j]);
			   
		   }
		  
	  }
	  
	  
	  
	
	  
	  
	  
	}
	
	
}

