package collection.list;

import java.util.List;

public class LottoWinSimulaterMain2 {

	public static void main(String[] args) {
		// 로또 시뮬레이터 클래스의 기능을 실행만 합니다.
		LottoWinSimulaterGoodCase2 ls = new LottoWinSimulaterGoodCase2();
		
		List<Integer> powerWinNumbers = ls.getPowerNumbers();
		Integer powerWinNumber = ls.getPowerNumber();
		List<Integer> powerGetNumbers = ls.getPowerNumbers();
		Integer powerGetNumber = ls.getPowerNumber();
		ls.tryWinLoop(powerWinNumbers, powerGetNumbers, powerWinNumber, powerGetNumber);
		
		System.out.println("반복 횟수 : " + ls.getCount());
	}

}
