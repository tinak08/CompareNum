
public class CompareNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] ArrNum = {2,3,6,8,10,15,4,7};
		int totalLen = ArrNum.length;
		boolean Result ;
		for(int i=0;i<totalLen-1;i++){
			for(int j=i+1;j<totalLen;j++){
				int Sum = ArrNum[i] + ArrNum[j];
				if(Sum == 10){
					Result = true;
					System.out.println("The Sum of "+ArrNum[i]+" "+ArrNum[j]+" is 10: "+Result);
				}
			}
		}
	}

}
