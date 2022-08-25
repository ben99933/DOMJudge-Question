import java.util.Scanner;

public class Test {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Time t1 = new Time(input.nextInt(), input.nextInt(), input.nextInt());
		Time t2 = new Time(input.nextInt(), input.nextInt(), input.nextInt());
		int delta = t2.hashCode() - t1.hashCode();
		
		if(t1.hashCode() > t2.hashCode())delta += 86400;
		Time time = new Time(delta);
		System.out.printf("%d %d %d\n",time.hour, time.minute, time.secound);
		input.close();
	}
	
}
class Time{
	public int hour;
	public int minute;
	public int secound;
	public Time(int hour,int minute, int second) {
		this.hour = hour;
		this.minute = minute;
		this.secound = second;
	}
	public Time(int time) {
		hour = time/3600;
		minute = (time%3600)/60;
		secound = time % 60;
	}
	@Override
	public int hashCode() {
		return secound + minute * 60 + hour * 3600;
	}
	
}
