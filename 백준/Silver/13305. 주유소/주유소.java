import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		
		StringTokenizer distance = new StringTokenizer(br.readLine());
		
		int[] d = new int[N];
		
		int sum = 0;
		
		for(int i = 1; i < N; i++) {
			
			sum += Integer.parseInt(distance.nextToken());
			
			d[i] = sum;
			
		}
		
		
		StringTokenizer price = new StringTokenizer(br.readLine());
		
		List<City> cities = new ArrayList<>();
		
		for(int i = 1; i <= N; i++) {
			
			City city = new City(i, Integer.parseInt(price.nextToken()));
			
			cities.add(city);
			
		}
		
		Collections.sort(cities);
		
		int result = 0;
		int index = 0;
		int pre = N-1;
		
		City city = cities.get(index);
		
		int tempPrice = city.price;
		
		int tempOrder = city.order;
		
		result += tempPrice * (d[pre] - d[tempOrder - 1]);
		
		if(tempOrder == 1) {
			System.out.println(result);
		}else {
			
			pre = tempOrder - 1;
			index++;
			
			
			while(true) {
				
				City tempCity = cities.get(index);
				
				
				if(tempCity.order < city.order) {
					
					tempPrice = tempCity.price;
					
					tempOrder = tempCity.order;
					
					result += tempPrice * (d[pre] - d[tempOrder - 1]);
					
					pre = tempOrder - 1;
					city = tempCity;
				}else if(tempCity.order == 1){
					
					tempPrice = tempCity.price;
					
					tempOrder = tempCity.order;
					
					result += tempPrice * (d[pre] - d[tempOrder - 1]);
					
					break;
					
				}else {
					index++;
				}
				
			}
			
			System.out.println(result);
			
		}
		
		

	}
	
	static class City implements Comparable<City> {
		private int order;
		private int price;
		
		public City(int order, int price) {
			this.order = order;
			this.price = price;
		}
		
		@Override
		public int compareTo(City c) {
			
			if(this.price < c.price) {
				return -1;
			}else if(this.price > c.price) {
				return 1;
			}else {
				if(this.order < c.order) {
					return -1;
				}else if(this.order > c.order) {
					return 1;
				}else {
					return 0;
				}
			}
			
		}
		
	}

}
