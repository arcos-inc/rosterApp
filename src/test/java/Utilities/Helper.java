package Utilities;

import Base.BaseUtil;
import DataProvider.ConfigFileReader;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.security.SecureRandom;
import java.util.concurrent.ThreadLocalRandom;

public class Helper extends BaseUtil {

    private BaseUtil base;
    ConfigFileReader configFileReader;
    static final String AB = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    static SecureRandom rnd = new SecureRandom();

    public void Helper(BaseUtil base) {
        this.base = base;
    }

    public void waitForAWhile(String elementSelector) throws Exception {
        try {
            configFileReader = new ConfigFileReader();
            WebDriverWait wait = new WebDriverWait(Web_Driver, configFileReader.getExplicitWait());
            // Wait till the element is not visible
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.id(elementSelector)));
        } catch (Exception ex) {
            System.out.println("You got the Error Message: " + ex);
        }
    }

    public String randomString(int len){
        StringBuilder sb = new StringBuilder( len );
        for( int i = 0; i < len; i++ )
            sb.append( AB.charAt( rnd.nextInt(AB.length()) ) );
        return sb.toString();
    }

    public String generateNames() {
        String[] maleNames = new String[]{"Aaden", "Aarav", "Aaron", "Abdiel", "Abdullah", "Abel", "Abraham", "Abram", "Ace", "Adam", "Adan", "Aden", "Adonis", "Adrian", "Adriel", "Adrien", "Agustin",
                "Ahmad", "Ahmed", "Aidan", "Aiden", "Alan", "Albert", "Alberto", "Alden", "Aldo", "Alec", "Alejandro", "Alessandro", "Alex", "Alexander", "Alexis", "Alexzander",
                "Alfonso", "Alfred", "Alfredo", "Ali", "Alijah", "Allan", "Allen", "Alonso", "Alonzo", "Alvaro", "Alvin", "Amare", "Amari", "Ameer", "Amir", "Amos", "Anakin", "Anders",
                "Anderson", "Andre", "Andres", "Andrew", "Andy", "Angel", "Angelo", "Anson", "Anthony", "Antonio", "Apollo", "Archer", "Ares", "Ari", "Arian", "Ariel", "Arjun", "Arlo",
                "Armando", "Armani", "Aron", "Arthur", "Arturo", "Aryan", "Asa", "Asher", "Ashton", "Atlas", "Atticus", "August", "Augustine", "Augustus", "Austin", "Avery", "Avi",
                "Axel", "Axl", "Axton", "Ayaan", "Ayden", "Aydin", "Azariah", "Barrett", "Baylor", "Beau", "Beckett", "Beckham", "Ben", "Benjamin", "Bennett", "Benson", "Bentlee",
                "Bentley", "Benton", "Billy", "Blaine", "Blaise", "Blake", "Blaze", "Bobby", "Bode", "Bodhi", "Boone", "Boston", "Bowen", "Braden", "Bradley", "Brady", "Braeden",
                "Braiden", "Brandon", "Branson", "Brantlee", "Brantley", "Braxton", "Brayan", "Brayden", "Braydon", "Braylen", "Braylon", "Brecken", "Brendan", "Brenden", "Brennan",
                "Brent", "Brentley", "Brett", "Brian", "Brice", "Briggs", "Brock", "Brodie", "Brody", "Bronson", "Brooks", "Bruce", "Bruno", "Bryan", "Bryant", "Bryce", "Brycen", "Bryson",
                "Byron", "Cade", "Caden", "Caiden", "Cain", "Cairo", "Caleb", "Callan", "Callen", "Callum", "Calvin", "Camden", "Camdyn", "Cameron", "Camilo", "Camron", "Canaan", "Cannon",
                "Carl", "Carlos", "Carmelo", "Carson", "Carter", "Case", "Casen", "Casey", "Cash", "Cason", "Cassius", "Castiel", "Cayden", "Cayson", "Cedric", "Cesar", "Chace", "Chad",
                "Chaim", "Chance", "Chandler", "Channing", "Charles", "Charlie", "Chase", "Chris", "Christian", "Christopher", "Clark", "Clay", "Clayton", "Clyde", "Cody", "Coen", "Cohen",
                "Colby", "Cole", "Coleman", "Colin", "Collin", "Colt", "Colten", "Colton", "Conner", "Connor", "Conor", "Conrad", "Cooper", "Corbin", "Corey", "Cory", "Craig", "Crew", "Cristian",
                "Cristiano", "Cristopher", "Crosby", "Cruz", "Cullen", "Curtis", "Cyrus", "Dakota", "Dallas", "Dalton", "Damari", "Damian", "Damien", "Damon", "Dane", "Daniel", "Danny", "Dante",
                "Darian", "Dariel", "Dario", "Darius", "Darrell", "Darren", "Darwin", "Dash", "Davian", "David", "Davion", "Davis", "Dawson", "Daxton", "Dayton", "Deacon", "Dean", "Deandre",
                "Declan", "Demetrius", "Dennis", "Denver", "Derek", "Derrick", "Desmond", "Devin", "Devon", "Dexter", "Diego", "Dilan", "Dillon", "Dimitri", "Dominic", "Dominick", "Dominik",
                "Dominique", "Donald", "Donovan", "Dorian", "Douglas", "Drake", "Draven", "Drew", "Duke", "Duncan", "Dustin", "Dwayne", "Dylan", "Easton", "Eddie", "Eden", "Edgar", "Edison",
                "Eduardo", "Edward", "Edwin", "Elian", "Elias", "Elijah", "Eliseo", "Elisha", "Elliot", "Elliott", "Ellis", "Emanuel", "Emerson", "Emery", "Emiliano", "Emilio", "Emmanuel",
                "Emmet", "Emmett", "Emmitt", "Emory", "Enoch", "Enrique", "Enzo", "Ephraim", "Eric", "Erick", "Erik", "Ernesto", "Esteban", "Ethan", "Eugene", "Evan", "Everett", "Ezekiel",
                "Ezequiel", "Ezra", "Fabian", "Felipe", "Felix", "Fernando", "Finley", "Finn", "Finnegan", "Finnley", "Fisher", "Fletcher", "Flynn", "Ford", "Forrest", "Francis", "Francisco",
                "Franco", "Frank", "Franklin", "Frederick", "Gabriel", "Gael", "Gage", "Gannon", "Garrett", "Gary", "Gauge", "Gavin", "George", "Gerald", "Gerardo", "Giancarlo", "Gianni",
                "Gibson", "Gideon", "Giovani", "Giovanni", "Gordon", "Grady", "Graham", "Grant", "Graysen", "Grayson", "Gregory", "Grey", "Greyson", "Griffin", "Guillermo", "Gunnar", "Gunner",
                "Gustavo", "Hamza", "Hank", "Harlan", "Harley", "Harold", "Harper", "Harrison", "Harry", "Harvey", "Hassan", "Hayden", "Hayes", "Heath", "Hector", "Hendrix", "Henrik", "Henry",
                "Hezekiah", "Holden", "Houston", "Hudson", "Hugh", "Hugo", "Hunter", "Ibrahim", "Ignacio", "Iker", "Immanuel", "Isaac", "Isaiah", "Isaias", "Ishaan", "Ismael", "Israel",
                "Issac", "Ivan", "Izaiah", "Jabari", "Jace", "Jack", "Jackson", "Jacob", "Jacoby", "Jaden", "Jadiel", "Jadon", "Jagger", "Jaiden", "Jaime", "Jairo", "Jake", "Jakob", "Jalen",
                "Jamal", "Jamari", "James", "Jameson", "Jamie", "Jamir", "Jamison", "Jared", "Jase", "Jasiah", "Jason", "Jasper", "Javier", "Javion", "Javon", "Jaxen", "Jaxon", "Jaxson",
                "Jaxton", "Jayce", "Jayceon", "Jayden", "Jaylen", "Jayson", "Jaziel", "Jedidiah", "Jefferson", "Jeffery", "Jensen", "Jeremiah", "Jeremy", "Jermaine", "Jerome", "Jerry",
                "Jesse", "Jessie", "Jesus", "Jett", "Jimmy", "Joaquin", "Joel", "Joey", "Johan", "John", "Johnathan", "Johnny", "Jonael", "Jonah", "Jonas", "Jonathan", "Jonathon", "Jordan",
                "Jordy", "Jorge", "Jose", "Joseph", "Joshua", "Josiah", "Josue", "Joziah", "Juan", "Judah", "Jude", "Judson", "Julian", "Julien", "Julio", "Julius", "Junior", "Justice", "Justin",
                "Justus", "Kade", "Kaden", "Kaiden", "Kaison", "Kaleb", "Kalel", "Kamari", "Kamden", "Kamdyn", "Kameron", "Kamryn", "Kane", "Kannon", "Kareem", "Karson", "Karter", "Kase",
                "Kasen", "Kash", "Kashton", "Kason", "Kayden", "Kaysen", "Kayson", "Keagan", "Keaton", "Keegan", "Keenan", "Keith", "Kellan", "Kellen", "Kelvin", "Kendall", "Kendrick",
                "Kenny", "Kevin", "Khalil", "Kian", "Kieran", "Killian", "King", "Kingsley", "Kingston", "Knox", "Kobe", "Kody", "Kohen", "Kolby", "Kole", "Kolten", "Kolton", "Konnor", "Korbin",
                "Kristian", "Kristopher", "Kylan", "Kyle", "Kyler", "Kymani", "Kyree", "Kyrie", "Kyson", "Lachlan", "Lamar", "Lance", "Landen", "Landon", "Landry", "Landyn", "Lane", "Langston",
                "Larry", "Lawrence", "Lawson", "Layne", "Layton", "Leandro", "Legend", "Leighton", "Leland", "Lennon", "Lennox", "Leon", "Leonard", "Leonardo", "Leonel", "Leonidas", "Levi",
                "Lewis", "Liam", "Lincoln", "Lionel", "Lochlan", "Logan", "London", "Lorenzo", "Louis", "Luca", "Lucas", "Lucca", "Lucian", "Luciano", "Luis", "Luka", "Lukas", "Luke", "Lyric",
                "Mack", "Madden", "Maddox", "Magnus", "Maison", "Major", "Makai", "Malachi", "Malakai", "Malcolm", "Malik", "Manuel", "Marc", "Marcel", "Marcelo", "Marco", "Marcos", "Marcus",
                "Mario", "Mark", "Markus", "Marley", "Marlon", "Marquis", "Marshall", "Martin", "Marvin", "Mason", "Mateo", "Mathew", "Mathias", "Matias", "Matteo", "Matthew", "Matthias",
                "Maurice", "Mauricio", "Maverick", "Maxim", "Maximilian", "Maximiliano", "Maximo", "Maximus", "Maxton", "Maxwell", "Mayson", "Mekhi", "Melvin", "Memphis", "Messiah",
                "Micah", "Michael", "Micheal", "Miguel", "Milan", "Miles", "Miller", "Milo", "Misael", "Mitchell", "Mohamed", "Mohammad", "Mohammed", "Moises", "Morgan", "Moses", "Moshe",
                "Muhammad", "Musa", "Mustafa", "Myles", "Nash", "Nasir", "Nathan", "Nathanael", "Nathaniel", "Nehemiah", "Neil", "Nelson", "Neymar", "Nicholas", "Nickolas", "Nico", "Nicolas",
                "Niko", "Nikolai", "Nikolas", "Nixon", "Noah", "Noel", "Nolan", "Oakley", "Odin", "Oliver", "Omar", "Omari", "Orion", "Orlando", "Oscar", "Otis", "Otto", "Owen", "Pablo",
                "Parker", "Patrick", "Paul", "Paxton", "Payton", "Pedro", "Peter", "Peyton", "Philip", "Phillip", "Phoenix", "Pierce", "Porter", "Preston", "Prince", "Princeton", "Quentin",
                "Quincy", "Quinn", "Quintin", "Quinton", "Rafael", "Raiden", "Ramon", "Randy", "Raphael", "Rashad", "Raul", "Ray", "Rayan", "Rayden", "Raylan", "Raymond", "Reece", "Reed",
                "Reese", "Reginald", "Reid", "Remington", "Remy", "Rene", "Reuben", "Reyansh", "Rhett", "Rhys", "Riaan", "Ricardo", "Richard", "Ricky", "Ridge", "Riley", "River",
                "Robert", "Roberto", "Rocco", "Rocky", "Rodney", "Rodolfo", "Rodrigo", "Rogelio", "Roger", "Rohan", "Roland", "Rolando", "Roman", "Romeo", "Ronald", "Ronan", "Ronin", "Ronnie",
                "Rory", "Rowan", "Rowen", "Royal", "Royce", "Ruben", "Rudy", "Russell", "Ryan", "Ryder", "Ryker", "Rylan", "Ryland", "Sage", "Salvador", "Sam", "Samir", "Samson", "Samuel",
                "Santana", "Santiago", "Santino", "Santos", "Saul", "Sawyer", "Scott", "Seamus", "Sean", "Sebastian", "Sergio", "Seth", "Shane", "Shaun", "Shawn", "Shiloh", "Silas", "Simon",
                "Sincere", "Skylar", "Skyler", "Solomon", "Sonny", "Soren", "Spencer", "Stanley", "Stefan", "Stephen", "Sterling", "Stetson", "Steve", "Steven", "Sullivan", "Sutton", "Sylas",
                "Talon", "Tanner", "Tate", "Tatum", "Taylor", "Terrance", "Terrell", "Terrence", "Terry", "Thaddeus", "Thatcher", "Theo", "Theodore", "Thiago", "Thomas", "Timothy", "Titan",
                "Titus", "Tobias", "Toby", "Tomas", "Tommy", "Tony", "Trace", "Travis", "Trent", "Trenton", "Trevor", "Trey", "Tripp", "Tristan", "Tristen", "Triston", "Troy", "Tucker", "Turner", "Tyler", "Tyrone", "Tyson", "Ulises", "Uriah", "Uriel", "Urijah", "Valentin", "Valentino", "Van", "Vance", "Vaughn", "Vicente", "Victor", "Vihaan", "Vincent", "Vincenzo",
                "Vivaan", "Wade", "Walker", "Walter", "Warren", "Waylon", "Wayne", "Wesley", "Westin", "Weston", "Will", "William", "Willie", "Wilson", "Winston", "Wyatt", "Xander", "Xavier",
                "Xzavier", "Yahir", "Yehuda", "Yosef", "Yousef", "Yusuf", "Zachariah", "Zachary", "Zackary", "Zaid", "Zaiden", "Zain", "Zaire", "Zander", "Zane", "Zavier", "Zayden", "Zayn",
                "Zayne", "Zechariah", "Zeke", "Zion"};

        return maleNames[ThreadLocalRandom.current().nextInt(0, 935 + 1)];
    }
}