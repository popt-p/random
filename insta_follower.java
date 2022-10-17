import java.util.*;
import java.io.*;  // Import the File class

public class insta_follower{
    public static void main(String[] args) {
        try {
            File follower = new File("/home/popt/code/user_followers.txt");
            Scanner myFollower = new Scanner(follower);
            File following = new File("/home/popt/code/user_followings.txt");
            Scanner myFollowing = new Scanner(following);
            HashSet<String> wers = new HashSet<>();
            HashSet<String> wings = new HashSet<>();

            while (myFollower.hasNextLine()) {
                String data = myFollower.nextLine();
                if(data.contains("profile picture")){
                    wers.add(data);
                    //System.out.println(data);
                }
            }
            
            while (myFollowing.hasNextLine()) {
                String data = myFollowing.nextLine();
                if(data.contains("profile picture")){
                    wings.add(data);
                    //System.out.println(data);
                    };
            }
            myFollower.close();
            myFollowing.close();
            // now checking
            System.out.println(" ");
            System.out.println("Followers who is not following you");
            int i =1;
            for(String x: wings){
                if(!wers.contains(x)){
                    System.out.println((i++)+": "+x.substring(0, x.length()-18));
                }
            }

          } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
          }
    }
}

