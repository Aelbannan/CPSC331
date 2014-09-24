
import java.util.Random;

public class RandomMain 
{
	public static void main(String[] args)
	{
		String firstNames[] = new String[]
				{
					"Green", "Fat", "Blue", "Skinny", "", "TSM", "Taipei Assassin", "Flying", "Rabid", "Red", "Yellow", "White", "Black", "Amazing", "Impressive", "Wimpy", "Big", "Small", "Courageous", "Shiny"
				};
		String lastNames[] = new String[]
				{
					"Slime", "Zombie", "Monkey", "Skeleton", "Thomas", "WIFI John", "Dog", "Cat", "Computer", "Dragon", "Waterbottle", "Cow", "Assignment", "Egg", "Pearson", "Java Program"
				};
		String bossNames[] = new String[]
				{
					"%s of Doom", "Grandmaster %s", "Extra Cool %s", "Fresh %s"
				};
		String typesString[] = new String[] { "Normal", "Fighting", "Flying", "Poison", "Ground", "Rock", "Bug", "Ghost", "Steel", "Fire", "Water", "Grass", "Electric", "Psychic", "Ice", "Dragon", "Dark", "Fairy"};
		
		String genderString[] = new String[]{"♀", "♂"};
		
		Random random = new Random();
		
		for(int i = 0; i < 999999; i++)
		{
			String name;
			int first, middle, last, level, boss, gender, type;
			first = random.nextInt(firstNames.length - 1);
			middle = random.nextInt(firstNames.length - 1);
			last = random.nextInt(lastNames.length);
			
			while (first == middle)
				middle = random.nextInt(firstNames.length);
			
			level = random.nextInt(100) + 1;
			
			if (random.nextInt(100) == 0)
				first = firstNames.length -1;
			
			name = firstNames[first] + " " + firstNames[middle] + " " + lastNames[last];
			
			if (i % 50 == 0)
			{
				boss = random.nextInt(bossNames.length);
				name = bossNames[boss].replace("%s", name);
				name += ",BOSS";
			}
			else
				name += ",NORMAL";
			
			gender = random.nextInt(2);
			name += "," + genderString[gender];
			
			type = random.nextInt(typesString.length);
			name += "," + typesString[type];
			
			if (random.nextInt(100) < 50)
			{
				type = random.nextInt(typesString.length);
				name += "-" + typesString[type];
			}
			
			System.out.println(name  + ", Lv." + level);
		}
				
	}
}
