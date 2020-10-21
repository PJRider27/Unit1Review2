import java.util.Scanner;
public class RPS
{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        boolean con=true;
        
        int playerNum;
        int twin=0;
        int tloss=0;
        int tties=0;
        
        System.out.println("RPS 1.0");
        System.out.println("************************************");
        System.out.println("Good luck, human ...");
        System.out.println();
        while(con){
            boolean error=false;
            System.out.println("What do you throw? [1] Rock, [2] Paper, [3] Scissors?");
            playerNum=sc.nextInt();
            int compNum=genNum();
    if(playerNum==1){
        System.out.print("You threw rock!  ");
        if(compNum==1){
            System.out.println("I threw rock!");
            System.out.println("A draw ... pretty good, human! I demand a rematch ...");
            tties++;
        }
        else if(compNum==2){
               System.out.println("I threw paper!");
               System.out.println("I win! You are not a challenge for me ...");
               tloss++;
        }else{
               System.out.println("I threw Scissors!");
               System.out.println("Whaaa?? ... You beat me? RAGE!");
               twin++;
        }
    }
    else if(playerNum==2){
        System.out.print("You threw paper!");
        if(compNum==1){
            System.out.println("I threw rock!");
            System.out.println("Whaaa?? ... You beat me? RAGE!");
            twin++;
        }
        else if(compNum==2){
               System.out.println("I threw paper!");
               System.out.println("A draw ... pretty good, human! I demand a rematch ...");
               tties++;
         }else{
               System.out.println("I threw Scissors!");
               System.out.println("I win! You are not a challenge for me ...");
               tloss++;
         }
        }
    else if(playerNum==3){
        System.out.print("You threw Scissors!");
        if(compNum==1){
            System.out.println("I threw rock!");
            System.out.println("I win! You are not a challenge for me ...");
            tloss++;
        }
        else if(compNum==2){
               System.out.println("I threw paper!");
               System.out.println("Whaaa?? ... You beat me? RAGE!");
               twin++;
         }else{
               System.out.println("I threw Scissors!");
               System.out.println("A draw ... pretty good, human! I demand a rematch ...");
               tties++;
         }
        }else{
            System.out.println("Error....");
            error=true;
        }
        if(!error){
        System.out.println("Play again? [Y,N]");
        con=YorN();
    }
    }
    System.out.println("Good Game! Thanks for playing.");
    System.out.println("************************************");
    System.out.println("Wins: "+ twin);
    System.out.println("Losses:: "+ tloss);
    System.out.println("Ties: "+ tties);
}

public static int genNum(){
    return (int) (Math.random()*3)+1;
}
public static boolean YorN(){
    Scanner sc=new Scanner(System.in);
    String ans=sc.next();
    if(ans.equals("y")){
        return true;
    }else{
        return false;
    }    
}  
}     
