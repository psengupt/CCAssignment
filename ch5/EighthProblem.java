
public class EighthProblem {
	public static void drawLine(byte[] screen, int x1, int x2, int width, int y){
		int start_offset_byte = x1%8;
		int first_full_byte = x1/8;
		
		int last_offset_byte = x1%8;
		int last_full_byte = x1/8;
		
		if(start_offset_byte!=0){
			first_full_byte++;
		}
		
		if(last_offset_byte!=7){
			last_full_byte--;
		}
		
		for(int b = first_full_byte; b<=last_full_byte; b++){
			screen[(width/8)*y+b] = (byte)0xFF;
		}
		
		byte start_mask = (byte)(0xFF>>start_offset_byte);
		byte last_mask = (byte)~(0xFF>>last_offset_byte);
		//that is when both the starting point and the ending point starts at the same byte
		if(x1/8==x2/8){
			byte mask = (byte)(start_mask&last_mask);
			screen[width/8*y+(x1/8)]  |=mask;
		}
		else{
			if(start_offset_byte!=0){
				int byte_number = (width/8)*y+first_full_byte-1;
				screen[byte_number]|=start_mask;
				
			}
			if(last_offset_byte!=7){
				int byte_number = (width/8)*y+last_full_byte+1;
				screen[byte_number]|=last_mask;
			}
		}
			
	}
}
