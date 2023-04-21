package collection.list;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Random;

// 기능 분리 없이 구현에만 초점을 맞춘 케이스
public class LottoWinSimulaterBadCase {

	public static void main(String[] args) {
		// 비교를 하기 위해서
		// 1. 당첨 번호 6개를 먼저 뽑고
		List<Integer> Lotto = new ArrayList<>();
		List<Integer> Lotto1 = new ArrayList<>();
		int i = 0;
		Random r = new Random();

		while(Lotto.size() < 6) {
		    int L = r.nextInt(45) + 1;
		    if (!Lotto.contains(L)) {
		        Lotto.add(L);
		    }
		}
		Lotto.sort(Comparator.naturalOrder());
		// 2. 추첨번호 6개 추가로 뽑아서 같은게 나올때까지 비교 -> 추첨을 반복
		Random r1 = new Random();
		while(!Lotto.equals(Lotto1)) {
			Lotto1.clear();
			while(Lotto1.size() < 6) {
				int L1 = r1.nextInt(45) + 1;
				if (!Lotto1.contains(L1)) {
					Lotto1.add(L1);
				}
		}
		Lotto1.sort(Comparator.naturalOrder());
		i++;
		}
		System.out.println(Lotto1);
		System.out.println("당첨입니다.");
		System.out.println(i + "번 만에 당첨되셨습니다.");
	}


	}


