package ch02;

public class OverflowEx {

	public static void main(String[] args) {
		short sMin = -32768;	// short(2byte)	
		short sMax = 32767;
		char cMin = 0;			// char(2byte)
		char cMax = 65535;
		
		System.out.println("sMin   = " + sMin);
		System.out.println("sMin-1 = " + (short)(sMin-1));
		System.out.println("smax   = " + sMax);
		System.out.println("sMan+1 = " + (short)(sMin+1));
		System.out.println("cMin   = " + (int)cMin);
		System.out.println("cMin-1 = " + (int)--cMin); // -- : 1 먼저 감소하고 사용
		System.out.println("cMin-1 = " + (int)cMin--); // -- : 먼저 사용 1 감소
		System.out.println("cMin = " + (int)cMin); 
		System.out.println("cMax   = " + (int)cMax);
		System.out.println("cMax+1 = " + (int)++cMax); // ++ : 1먼저 증가하고 사용


	}

}
