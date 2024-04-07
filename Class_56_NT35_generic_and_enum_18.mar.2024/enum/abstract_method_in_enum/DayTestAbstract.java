enum Day{
	MonDAY(1){
		public Day next(){
			return TUESDAY;
		}
	},

	TUESDAY(2){
		public Day next(){
			return WEDNESDAY;
		}
	},

	WEDNESDAY(3){
		public Day next(){
			return THURSDAY;
		}
	},

	THURSDAY(4){
		public Day next(){
			return FRIDAY;
		}
	},

	FRIDAY(5){
		public Day next(){
			return SATURDAY;
		}
	},

	SATURDAY(6){
		public Day next(){
			return SUNDAY;
		}
	},

	SUNDAY(7){
		public Day next(){
			return MonDAY;
		}
	};

	public abstract Day next();

	private final int dayNumber;

	Day(int dayNumber){
		this.dayNumber = dayNumber;
	}

	int getDayNumber(){
		return dayNumber;
	}
}

public class DayTestAbstract{
	public static void main(String[] args){
		for(Day day : Day.values()){
			System.out.printf("%s(%d), next is %s\n",day,day.getDayNumber(),day.next());
		}
	}
}
