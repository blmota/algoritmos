/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lerarquivo;

/**
 *
 * @author particular
 */
public class Sala {
    private String room;
    private String porta1;
    private String porta2;
    private String porta3;
    private String porta4;
    
    public Sala(){
        this.porta1 = "N";
        this.porta2 = "N";
        this.porta3 = "N";
        this.porta4 = "N";
    }

    public String getPorta1() {
        return porta1;
    }

    public void setPorta1(String porta1) {
        this.porta1 = porta1;
    }

    public String getPorta2() {
        return porta2;
    }

    public void setPorta2(String porta2) {
        this.porta2 = porta2;
    }

    public String getPorta3() {
        return porta3;
    }

    public void setPorta3(String porta3) {
        this.porta3 = porta3;
    }

    public String getPorta4() {
        return porta4;
    }

    public void setPorta4(String porta4) {
        this.porta4 = porta4;
    }

    public String getRoom() {
        return room;
    }

    public void setRoom(String room) {
        this.room = room;
    }

    public String toString(){
        String s = "Sala: " + this.room + "; Porta 01: " + this.porta1 + ";";
        if(!this.porta2.equals("N")){
            s += " Porta 02: " + this.porta2 + ";";
        }
        if(!this.porta3.equals("N")){
            s += " Porta 03: " + this.porta3 + ";";
        }
        if(!this.porta4.equals("N")){
            s += " Porta 04: " + this.porta4 + ";";
        }
        
        return s;
    }
}
