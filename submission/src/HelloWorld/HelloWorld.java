package HelloWorld;

import java.time.DayOfWeek;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

public class HelloWorld {

	public static void main(String[] args) {

		String greeting = "Hello World";
		int yearsLater = 3;
		int inum = 0;

		// HelloWorldを表示
		System.out.println("<課題1>");
		helloWorld(greeting);

		// 3年後の今日が何曜日なのか
		System.out.println("<課題2>");
		dayOfTheWeek(yearsLater);

		// 引数が0なら偽。引数が1なら真
		System.out.println("<課題3>");
		trueFalse(inum);
		trueFalse(inum + 1);

		// コレクション型
		System.out.println("<課題4 List>");
		viewFruit();
		System.out.println("<課題4 Mep>");
		enegori();
	}

	// HelloWorldを表示する
	private static void  helloWorld(String greeting){
		for(int count = 0; count < 20; count++) {
			if(count < 10)
			{
				System.out.println(count+1 + ": " + greeting);
			}else{
				greeting  = "Hello";
				System.out.println(count+1 + ": " + greeting);
			}
		}
	}

	// 3年後の今日が何曜日なのか
	private static void  dayOfTheWeek(int yearsLater){

		// 今日の日時を取得
		LocalDateTime today = LocalDateTime.now();
		DayOfWeek week = today.getDayOfWeek();
		int year = today.getYear();
		int month = today.getMonthValue();
		int day = today.getDayOfMonth();
		int hour = today.getDayOfMonth();
		int minit = today.getDayOfMonth();

		System.out.println( "今日は" + year + "年" + month + "月" + day + "日 " + week);

		// X年後の日時を取得
		LocalDateTime days = LocalDateTime.of(year + yearsLater, month, day, hour, minit);
		year = days.getYear();
		month = days.getMonthValue();
		day = days.getDayOfMonth();
		hour = days.getDayOfMonth();
		minit = days.getDayOfMonth();
		week = days.getDayOfWeek();

		System.out.println( yearsLater + "年後の今日は" + year + "年" + month + "月" + day + "日 " + week);
	}

	//引数が0なら偽。引数が1なら真と表示
	private static void  trueFalse(int iNum){

		if(iNum != 0)
		{
			System.out.println("引数が" + iNum + "なら真");
		}else{
			System.out.println("引数が" + iNum + "なら偽");
		}
	}

	//Listで表示
	private static void  viewFruit(){

		List<String> list = new ArrayList<String>();
		list.add("桃");
		list.add("苺");
		list.add("蜜柑");

	   for(Iterator it = list.iterator(); it.hasNext();) {
			System.out.println(it.next());
			}
	}

	//Mapで表示
	private static void  enegori(){

		HashMap<String,String> map = new HashMap<String,String>();
		map.put("power", "バナナ");

		for (String key : map.keySet()) {
			System.out.println("えねごりくん辞書　" + key +":" + map.get(key));
		}

		System.out.println("H2ってわかりますか？");
		if (map.containsKey("H2"))
		{
			System.out.println(map.get("H2"));
			if(map.get("H2").equals("水素"))
			{
				System.out.println(map.get("正解です"));
			}else
			{
				System.out.println(map.get("H2")+"ではありません");
				map.remove("H2");
				map.put("H2", "水素");
				map.put("power", "未来のクリーンエネルギー");
			}
		}else{
			System.out.println("?");
			map.put("H2", "水素");
			map.put("水素", "未来のクリーンエネルギー");
		}
		System.out.println("H2とは" + map.get("H2") + "のこと");

		for (String key : map.keySet()) {
			System.out.println("えねごりくん辞書　"+ key +":" + map.get(key));
		}

		System.out.println("近い将来は発電しようとしているのは？");
		if (map.containsKey("power"))
		{
			System.out.println(map.get("power"));
			if(map.get("power").equals("水素エネルギー"))
			{
				System.out.println(map.get("正解です"));
			}else {
				System.out.println("いいえ" + map.get("power")+"は関係ありません");
				map.remove("power");
				map.put("power", "水素エネルギー");
			}
		}else{
				System.out.println("?");
				map.put("power", "水素エネルギー");
		}

		for (String key : map.keySet()) {
			System.out.println("えねごりくん辞書　" + key +":" + map.get(key));
		}
	}
}