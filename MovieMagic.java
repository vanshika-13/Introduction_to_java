import java.util.*;
class MovieMagic
{
	int release_year;
	String movie_title;
	double ratings;
	MovieMagic()
	{
		release_year = 2021;
		movie_title = "Bell Bottom";
		ratings = 3.7;
	}
	void accept()
	{
		Scanner sc1 = new Scanner(System.in);
		System.out.println("Enter the year in which movie was released ");
		release_year = sc1.nextInt();
		System.out.println("Enter the name of movie ");
		movie_title = sc1.next();
		System.out.println("Enter the rating of movie ");
		ratings = sc1.nextDouble();
	}
	void display()
	{
		System.out.println("The movie title is : " + movie_title);
		if(ratings >=0.0 && ratings <=2.0)
		{
			System.out.println("The movie is flop");
		}
		else if(ratings >=2.1 && ratings <=3.4)
		{
			System.out.println("The movie is Semi-Hit");
		}
		else if(ratings >=3.5 && ratings <=4.5)
		{
			System.out.println("The movie is Hit");
		}
		else if(ratings >=4.6 && ratings <=5.0)
		{
			System.out.println("The movie is Super-Hit");
		}
		
	}
	public static void main(String[] a)
	{
		MovieMagic m1 = new MovieMagic();
		//m1.accept();  
		m1.display(); 
	}
}