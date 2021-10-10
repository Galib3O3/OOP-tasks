
package galib;
/* Name: Md. Asadullah-Al-Galib
   ID: 2012020303
   Scetion: 5G
   email:cse_2012020303@lus.ac.bd
   date:09/09/21
*/


public class Cricket extends Sports{
    String matchType;
    int over;
    Player player;
    
    
    Cricket(String matchType, int over, Player player)
    {
        this.matchType= matchType;
        this.over= over;
        this.player= player;
    }
    
    void display()
    {
        System.out.println("Match Type:"+matchType);
        System.out.println("Over :"+over);
        System.out.println("Name of the player:"+player.playerName);
        System.out.println("Jersey Number:"+player.jerseyNumber);
    }
}
