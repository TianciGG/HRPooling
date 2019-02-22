package com.iss.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class RandomSort {
	public static void printRandomBySort() {
		Random random = new Random(); // 创建随机数生成器
		List list = new ArrayList();
		// 生成10个随机数，并放在集合list中
		for (int i = 0; i < 10; i++) {
			list.add(random.nextInt(1000));
		}
		Collections.sort(list);// 对集合中的元素进行排序
		Iterable it = (Iterable) list.iterator();
		int count = 0;
		/*
		 * while (it.hashNext()) { System.out.println(++count + ":" +
		 * it.next()); }
		 */

	}

}
