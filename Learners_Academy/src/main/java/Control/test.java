package Control;

public class test {

		private String s="not set yet";
		public test() {
				
			this.s="is set.. heelo me :)";
		}
	
		
		public String toprint() {
			String ss=this.s;
			return ss;
		}
		
		
		public void setit() {
			Builder b=new Builder();
			
			b.createNewSubject("dss", 23);
			
			
			b.saveIt();
		}
		
		
}
