package banana.and.lighter.operator;

public class BitOperator {

	private int ONE_ZERO = 0xaaaaaaaa;
	private int ZERO_ONE = 0x55555555;
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		BitOperator bo = new BitOperator();
		System.out.println(Integer.toBinaryString(bo.ONE_ZERO));
		System.out.println(Integer.toBinaryString(bo.ZERO_ONE));
		System.out.println(Integer.toBinaryString(bo.ZERO_ONE & bo.ONE_ZERO));
		System.out.println(Integer.toBinaryString(bo.ZERO_ONE | bo.ONE_ZERO));
		System.out.println(Integer.toBinaryString(~bo.ZERO_ONE));
		System.out.println(Integer.toBinaryString(~bo.ONE_ZERO));
		System.out.println(Integer.toBinaryString(bo.ZERO_ONE ^ bo.ONE_ZERO));
	}

}
