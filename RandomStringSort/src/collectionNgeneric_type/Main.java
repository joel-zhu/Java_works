package collectionNgeneric_type;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
/** * 1、创建完List<String>之后，往其中添加十条随机字符串 * 
 * 2、每条字符串的长度为10以内的随机整数 * 
 * 3、每条字符串的每个字符都为随机生成的字符，字符可以重复 *
 *  4、每条随机字符串不可重复 
 *  */
public class Main {

	static List<String> list = new ArrayList<String>();
	
	//创建方法，随机生成任意内容的长度10以内的字符串
	public static void getRandom() {
		Random random = new Random();
		String str = "0123456789zxcvbnmlkjhgfdsaqwertyuiopZXCVBNMLKJHGFDSAQWERTYUIOP";
		//随机的10个字符串
		for(int i = 0; i<10 ;i++) {
			StringBuilder sb = new StringBuilder();
			do {
				int n = random.nextInt(10);//长度10以内的任意字符串
				for(int j = 0; j<=n; j++) {
					int stN = random.nextInt(str.length());
					sb.append(str.charAt(random.nextInt(stN)));
				}			
			}while(list.contains(sb.toString()));//每条字符串不重复
			list.add(sb.toString());
		}
		System.out.println("******排序前******");
		for(String st : list) {
			System.out.println("第" + (list.indexOf(st)+1) + "个元素是:" + st);
		}
		System.out.println("******排序后******");
		Collections.sort(list);//sort排序
		for(String st : list) {
			System.out.println("第" + (list.indexOf(st)+1) + "个元素是:" + st);
		}
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		getRandom();
	}

}
