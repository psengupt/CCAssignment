
public class SecondProblem {
	public static String decimalToBinary(double num){
		StringBuilder str = new StringBuilder();
		str.append(".");
		if(num>=1||num<0){
			return "ERROR";
		}
		while(num>0){
			if(str.length()>32){
				return "ERROR";
			}
			else{
				num = num*2;
				if(num>=1){
					str.append("1");
					num = num - 1;
				}
				else{
					str.append("0");
					
				}
			}
			
		}
		return str.toString();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double num = 0.75;
		System.out.println(decimalToBinary(num));

	}

}
