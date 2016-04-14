/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package choinka;

import java.util.Scanner;

/**
 *
 * @author nykie_000
 */
public class Choinka {
     public int i;
    public StringBuilder poziom;
    static Choinka drzewko=new Choinka();
    public Choinka(){
    poziom=new StringBuilder();
}
    public void wybor(String wyb,int level)
    {
        switch(wyb)
        {
        case"up":
            {drzewko.up(level);}break;
        case"down":
            {drzewko.down(level);}break;
        case"left":
            {drzewko.left(level);}break;
        case"right":
            {drzewko.right(level);}break;
        default: System.out.print("Zly wybor");
        }
    }
    
    public String up(int levels){
        if(levels == 0) return "" ;
        
        for(int j = 1 ; j <= levels ; j++)
        {
            poziom.append(" ");
        }
        for(int k = 0; k <= i; k++)
        {
            poziom.append("x");
        }
        poziom.append("\n");
        
        this.i += 2;
        up(levels-1);
        return"";
    }

    
        public String down(int levels){
        if(levels == 0) {
                 poziom.reverse();
                 return "" ;
             }
        for(int k = 0; k <= i; k++)
        {
            poziom.append("x");
        }
        for(int j = 1 ; j <= levels ; j++)
        {
            poziom.append(" ");
        }
       
        poziom.append("\n");
        
        this.i += 2;
        down(levels-1);
        return"";
    }
        
        
        public String left(int levels){
        if(levels == 0){
            return "" ;
        }
        
        for (int o = 2; o <= levels; o++) {
         for (int j = 0; j < levels - o+1; j++)
        {
            poziom.append(" ");
        }
        for (int j = 1; j < o; j++) {
        poziom.append("x");
        }
        poziom.append("\n");
        }
        
        
        
         for (int o = levels; o >= 1; o--) {
         for (int j = 0; j < levels - o; j++)
        {
            poziom.append(" ");
        }
        for (int j = 0; j < o; j++) {
        poziom.append("x");
        }
        poziom.append("\n");
        }
        return"";
    }
        
        
        public String right(int levels){
        if(levels == 0){
            return "" ;
        }
         for (int o = levels; o >= 0; o--) {
         for (int j = 0; j < levels - o; j++)
        {
            poziom.append("x");
        }
        poziom.append("\n");
        }
        for (int o = 1; o < levels; o++) {
         for (int j = 0; j < levels - o; j++)
        {
            poziom.append("x");
        }
        poziom.append("\n");
        }
        return"";
    }    
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        Choinka pom=new Choinka();
        
        System.out.println("podaj wysokosc drzewka");
        int a;
        a=scanner.nextInt();
        
        System.out.println("podaj kierunek wzrostu(up,down,left,right)");
        String b;
        b=scanner.nextLine();
        b=scanner.nextLine();
        
        pom.wybor(b, a);
        System.out.print(drzewko.poziom);
        System.out.println();
    }
    
}
