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
		System.out.println("��ɫΪ" + color);
		System.out.println("cpu�ͺ�Ϊ" + CPU);
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
