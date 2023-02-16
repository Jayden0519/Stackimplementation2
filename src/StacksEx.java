import java.util.Stack;

public class StacksEx
{
    public static void main(String[] args)
    {
        Stack<String> videoGames = new Stack<String>();

        videoGames.add("Super Mario Brothers WII");
        videoGames.add("Sons Of the Forest");
        videoGames.add("Smite Battleground of The Gods");
        videoGames.add("Call of Duty Modern Warfare 2");
        videoGames.add("Dead By Daylight");

        System.out.println(videoGames.pop());
        System.out.println(videoGames.pop());
        System.out.println(videoGames.pop());
        System.out.println(videoGames.peek());
        System.out.println(videoGames.size());
    }
}
