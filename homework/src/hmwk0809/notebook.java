package hmwk0809;

public class notebook {
		public String color;
		public int  CPU;
		
		public  notebook() {
			
		}
		public notebook(String color , int CPU) {
			
			this.color =color;
			this.CPU = CPU;
			
		}
		public void show() {
		System.out.println("颜色为" + color);
		System.out.println("cpu型号为" + CPU);
		}

		public String getColor() {
			return color;
		}

		public void setColor(String color) {
			this.color = color;
		}

		public int getCPU() {
			return CPU;
		}

		public void setCPU(int cPU) {
			CPU = cPU;
		}
		
		
}
