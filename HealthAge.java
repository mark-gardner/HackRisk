public class HealthAge {

	int age;
	char gender;
	int heartRate;
	int sleepHours;
	int weight;
	int height;
	int nutrition;
	int dailyActiveIntense = 0;
	int dailyActiveChilled = 0;
    
	int sleepScore = 50;
	int activeScore = 50;
	int exerciseScore = 50;
	int nutriScore = 50;
	int wellbeingScore = 50;
	
	int healthAdjustor = 0;
	int BMI;	
	int healthAge;

	String[] fitnessRec = new String[5];
	String[] wellbeingRec = new String[5];
	String[] nutritionRec = new String[5];
	String[] sleepRec = new String[5];
	
	//Constructor One
	HealthAge(int age, char gender, int heartRate, int sleepHours, int weight, int height) {
		this.age = age;
		this.gender = gender;
		this.heartRate = heartRate;
		this.sleepHours = sleepHours;
		this.weight = weight;
		this.height = height;
		
		loadRecommendations();
		calculateAge();
	}
	
	//Constructor Two
/*	HealthAge(int age, char gender, int heartRate, int sleepHours, int weight, int height) {
		this.age = age;
		this.gender = gender;
		this.heartRate = heartRate;
		this.sleepHours = sleepHours;
		this.weight = weight;
		this.height = height;
		
		calculateAge();
	}
*/	
	private void loadRecommendations() {
		fitnessRec[0] = "30 Minute jogging Challenge! Are you up to it?!";
		wellbeingRec[0] = "10 minute meditation, and remember, breath!";
		nutritionRec[0] = "Try serve smaller portions at dinner tonight";
		sleepRec[0] = "Aim for a solid 8 hours sleep tonight";
		
		fitnessRec[1] = "Calories are best burned between the sheets!";
		wellbeingRec[1] = "Avoid stress, take 10 deep breaths and smile!";
		nutritionRec[1] = "Aim for more Veg for one meal today";
		sleepRec[1] = "No Internet / Email for 30 mins before bed";
		
		fitnessRec[2] = "Fitness Recommendation stub";
		wellbeingRec[2] = "Wellbeing Recommendation stub";
		nutritionRec[2] = "Nutrition Recommendation stub";
		sleepRec[2] = "Sleep Recommendation stub";
		
		fitnessRec[3] = "Fitness Recommendation stub";
		wellbeingRec[3] = "Wellbeing Recommendation stub";
		nutritionRec[3] = "Nutrition Recommendation stub";
		sleepRec[3] = "Sleep Recommendation stub";
		
		fitnessRec[4] = "Fitness Recommendation stub";
		wellbeingRec[4] = "Wellbeing Recommendation stub";
		nutritionRec[4] = "Nutrition Recommendation stub";
		sleepRec[4] = "Sleep Recommendation stub";
		
		/*
		 Wellbeing:

		1) Meditation Ð ability to connect to Headspace app to meditate for 10 minutes
		2) Mindful eating Ð taking the time to understand what your eating, and do so slowly - http://www.livingwell.org.au/mindfulness-exercises-3/3-eating-mindfulness/
		3) Switch off Ð limit electronic device use (only for Saturday and Sunday)
		4) Explore your surroundings Ð quote look up campaign, use GPS tracking to suggest an outdoor area nearby that the person can explore

		Fitness:

		1) Attend a yoga class at X studio
		2) Attend a spinning class at X studio
		3) Join in a group workout session in your local park
		4) Set reminders in your work calendar to stand up throughout the day Ð why not wander over to the kettle and to make a green tea, or take some phone calls standing up

		Food & Drink:

		1) Substitute your glass of wine this evening for a vodka and soda water (Saturday)
		2) Avoid carbs to avoid feeling sluggish, fill up on protein instead. LifeScore recommends fish rich in Omega 3 (promoting cardiovascular health)

		Sleep:

		1) Hit the hay at 10:05pm tonight. You need to catch up on missed zzzzÕs
		2) Switch off all electronic devices 30 minutes before bed
		 */

	}
	
	public void dailyActiveIntense(int dailyActiveIntense){
		this.dailyActiveIntense = dailyActiveIntense;
		calculateAge();
	}
	
	public void dailyActiveChilled(int dailyActiveChilled) {
		this.dailyActiveChilled = dailyActiveChilled;
		calculateAge();
	}
	
	public void updateAge(int age) {
		this.age = age;
		calculateAge();
	}
	
	public void gender(char gender) {
		this.gender = gender;
		calculateAge();
	}
	
	public void heartRate(int heartRate) {
		this.heartRate = heartRate;
		calculateAge();
	}
	
	public void sleepHours(int sleepHours) {
		this.sleepHours = sleepHours;
		calculateAge();
	}
	
	public void weight(int weight) {
		this.weight = weight;
		calculateAge();
	}
	
	public void height(int height) {
		this.height = height;
		calculateAge();
	}
	
	public String easterEgg() {
		return "LifeTime: Making the World a Better Place - Sir Adam, Health & Wellbeing Rock Star";
	}
	
	private void calculateBMI() {
		this.BMI = weight/height;
	}
	
	private int calculateAge() {
		calculateBMI();
		this.healthAge = age;
		
		int sleepScore = 50;
		int activeScore = 50;
		int exerciseScore = 50;
		int nutriScore = 50;
		int wellbeingScore = 50;
		
		// BMI indicator
		// http://www.sciencedaily.com/releases/2009/03/090319224823.htm
		if (BMI >= 40) {
			healthAdjustor += 10;
			activeScore -= 25;
		} else if (BMI >= 35) {
			healthAdjustor += 6;
			activeScore -= 15;
		} else if (BMI >= 30) {
			healthAdjustor += 3;
			activeScore -= 8;
		} else if (BMI > 23 && BMI < 24) {
			healthAdjustor -= 1;
			activeScore += 5;
	    } else if (BMI < 23) {
			healthAdjustor += 1;
			activeScore -= 5;
		}
		
		// Sleep indicator
		// http://www.nhs.uk/news/2010/05May/Pages/lifespan-link-to-sleeping-habits.aspx
		if (sleepHours < 7) {
			healthAdjustor += 1;
			sleepScore -= 10;
		} else if (sleepHours >= 12) {
			healthAdjustor += 2;
			sleepScore -= 20;
		} else {
			healthAdjustor -= 1;
			sleepScore += 20;
		}
		
		// Resting Heart Rate
		// http://scholarcommons.usf.edu/cgi/viewcontent.cgi?article=4820&context=ujmm
		if (heartRate > 35 && heartRate < 45) {
			healthAdjustor -= 50;
			wellbeingScore += 50;
		} else if (heartRate > 45 && heartRate < 55) {
			healthAdjustor -= 20;
			wellbeingScore += 30;
		} else if (heartRate > 55 && heartRate < 64) {
			healthAdjustor -= 10;
			wellbeingScore += 30;
		} else if (heartRate > 64 && heartRate < 69) {
			// Normal no adjust
			wellbeingScore += 20;
		} else if (heartRate > 69 && heartRate < 75) {
			healthAdjustor += 2;
			wellbeingScore -= 10;
		} else if (heartRate > 75 && heartRate < 82) {
			healthAdjustor += 10;
			wellbeingScore -= 20;
		}  else if (heartRate > 82 && heartRate < 88) {
			healthAdjustor += 11;
			wellbeingScore -= 20;
		} else if (heartRate > 88 && heartRate < 95) {
			healthAdjustor += 18;
			wellbeingScore -= 50;
		}
		
		// Activity / Fitness
		if (dailyActiveIntense > 30 || (dailyActiveIntense > 30 && dailyActiveChilled > 30)) {
			healthAdjustor -= 5;
			exerciseScore += 40;
		} else if (dailyActiveChilled > 30) {
			healthAdjustor -= 2;
			exerciseScore += 30;
		} else if (dailyActiveChilled > 0) {
			// Normal no adjust
		} else {
			healthAdjustor += 1;
			exerciseScore -=20;
		}
		
		// Nutrition
		if (nutrition == 1) {
			healthAdjustor -= 1;
			nutriScore += 30;
		} else if (nutrition == -1) {
			healthAdjustor += 1;
			nutriScore -= 30;
		}
		
		this.healthAge += healthAdjustor;
		return healthAge;
	}
	
	
	public String[] DayRecommendation() {
		String[] recommend = new String[3];
		// Logic for daily recommendations needs smart logic (eg understanding user diary to know when time available for exercise)
		// Currently using demo code, full logic in Release 2.0, coming summer 20xx.
		if (exerciseScore < 0) {
			recommend[0] = fitnessRec[0];
			recommend[1] = wellbeingRec[0];
			recommend[2] = sleepRec[0];
		} else {
			recommend[0] = nutritionRec[0];
			recommend[1] = wellbeingRec[1];
			recommend[2] = sleepRec[1];
		}
		
		// Logic needs to be built out
		
		return recommend;
	}

	public void test() {
		System.out.println("age: " + age);
		System.out.println("gender: " + gender);
		System.out.println("heartRate: " + heartRate);
		System.out.println("sleepHours: " + sleepHours);
		System.out.println("weight: " + weight);
		System.out.println("height: " + height);
		System.out.println("nutrition: " + nutrition);
		System.out.println("dailyActiveIntense: " + dailyActiveIntense);
		System.out.println("dailyActiveChilled: " + dailyActiveChilled);
		
		System.out.println("activeScore: " + activeScore);
		System.out.println("exerciseScore: " + exerciseScore);
		System.out.println("nutriScore:  " + nutriScore);
		System.out.println("wellbeingScore: " + wellbeingScore);

		System.out.println("BMI: " + BMI);
		
		System.out.println("healthAdjustor:  " + healthAdjustor);
		System.out.println("healthAge: " + healthAge);
	}
	
	
}


