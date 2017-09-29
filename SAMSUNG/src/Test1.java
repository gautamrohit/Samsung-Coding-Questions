import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
 
public class Test1 {
 
	public static void main(String[] args) {
		System.out.println(swap("876959", 3));
	}
 
	private static String swap(String value, int k) {
		return swapToMax(Arrays.asList(value), k, 0);
	}
 
	private static String swapToMax(List<String> values, int k, int level) {
		if (k == 0) {
			return Collections.max(values, new Comparator<String>() {
 
				@Override
				public int compare(String o1, String o2) {
					int i = Integer.parseInt(o1);
					int j = Integer.parseInt(o2);
					return Integer.compare(i, j);
				}
			});
		} else {
			List<String> newValues = new ArrayList<>();
 
			for (String string : values) {
				List<Integer> maxLocations = maxLocations(string, level);
				for (Integer integer : maxLocations) {
					newValues.add(swap(string, integer, level));
				}
			}
 
			return swapToMax(newValues, k - 1, level + 1);
 
		}
	}
 
	private static String swap(String string, Integer integer, int level) {
		StringBuilder sb = new StringBuilder(string);
		char temp = sb.charAt(integer);
		sb.setCharAt(integer, string.charAt(level));
		sb.setCharAt(level, temp);
		return sb.toString();
	}
 
	private static List<Integer> maxLocations(String string, int start) {
		char[] array = string.toCharArray();
 
		List<Integer> maxLocations = new ArrayList<>();
		maxLocations.add(start);
 
		char max = array[start];
 
		for (int i = start + 1; i < array.length; i++) {
			if (array[i] == max) {
				maxLocations.add(i);
			} else if (array[i] > max) {
				maxLocations.clear();
				maxLocations.add(i);
				max = array[i];
			}
		}
 
		return maxLocations;
	}
 
}