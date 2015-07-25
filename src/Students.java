
public class Students{
		
		String name;
		
		public Students(String name2) {
			this.name = name2;
		}
		
		public boolean equals(Object obj){
			if(this == obj){
				return true;
			}
			if(obj instanceof Students){
				
				Students sobj = (Students)obj;
				if(sobj.name.equals(this.name)){
					
					return true;
				}
			}
			
			
			
			return false;
			
		}
		
		
	}
