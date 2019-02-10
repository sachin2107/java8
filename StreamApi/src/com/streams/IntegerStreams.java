package com.streams;

import java.util.function.IntSupplier;
import java.util.stream.IntStream;

public class IntegerStreams {

	public static void main(String[] args) {
		IntStream st = IntStream.range(1, 10);
//1.Iterate stream
		//st.forEach(System.out::print);
		
//2.Calculate average of stream
		/*OptionalDouble avg = st.average();
		System.out.println(avg);*/
		
//3. Count elements in stream
		/*long cnt = st.count();
		System.out.println(cnt);*/
		
//4.convert int -> wrapper Integer using boxed()
// i.e it converts IntStream to Stream<Integer>
		/*Stream<Integer> wrapperConverted = st.boxed();
		wrapperConverted.forEach(System.out::print);*/
		
//5. if any match present in stream returns true
		/*IntPredicate p = t -> t==9;
		boolean match9 = st.anyMatch(p);*/
		//OR
		/*boolean match9 = st.anyMatch(t -> t==9);
		System.out.println(match9);*/
		
//6. using of(int...) generating int stream
		//IntStream st1 = IntStream.of(1,2,3,4,5,6);
		
//7. using rangeClosed(inclusive, exclusive) generating range of int
		//IntStream st2 = IntStream.rangeClosed(7, 10);
		
//8. concat 2 streams		
		/*IntStream st3 = IntStream.concat(st1, st2);
		System.out.println("Concat of 1-6 and7-10: ");
		st3.forEach(System.out::println);*/
		
//9. get max number from stream
		//IntStream st4 = IntStream.of(1,200,39,239,132);
		//int maxNumber = st4.max().getAsInt();
		//System.out.println("Max number from st4 is: "+maxNumber);
		
//10. to generate infinite int numbers -> we can use limit to stop infinite sequence
		IntSupplier is = new IntSupplier() {
			public int getAsInt()
			{
				int x = (int)Math.random()*1203;
				return x;
			}
		};
		//IntStream st5 = IntStream.generate(is);
						//OR
		IntStream st5 = IntStream.generate(()->{return (int) (Math.random()*1220);});
		System.out.println("generating 3 random numbers: ");
		st5.limit(3).forEach(System.out::println);
		
//11. To evaluate stream use map		
		/*IntStream st6 = IntStream.range(10, 20).map(i -> i*2);
		st6.forEach(System.out::println);*/
		
//12. map function that returns DoubleStream and LongStream 		
		/*DoubleStream ds = IntStream.range(10, 20).mapToDouble(i->i);
		LongStream ls = IntStream.range(323, 330).mapToLong(i -> i);
		ls.forEach(System.out::println);
		
		ds.distinct().filter(t -> t==12).forEach(System.out::println);*/
	}
}
