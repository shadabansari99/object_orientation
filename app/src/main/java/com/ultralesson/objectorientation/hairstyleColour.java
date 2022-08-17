package com.ultralesson.objectorientation;

public class hairstyleColour {
    public String gender;
    public String colour;
    public String hairstyleName;

    public hairstyleColour(String gender,String colour, String hairstyleName) {
        this.gender=gender;
        this.colour=colour;
        this.hairstyleName = hairstyleName;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getGender()
    {
        return gender;
    }

    public String getColour() {
        return colour;
    }

    public String getHairstyleName() {
        return hairstyleName;
    }



    public static void main(String[] args) {
        hairstyleColour hc1 = new hairstyleColour("male","golden","spike");
        hairstyleColour hc2 = new hairstyleColour("female","red","Braids");
        hairstyleColour hc3 = new hairstyleColour("male","green","The Undercut");
        hairstyleColour hc4= new hairstyleColour("female","Blonde","Waterfall Braid");
        //System.out.println(hc.getGender());
        System.out.println("\n"+hc1);
        System.out.println(hc2);
        System.out.println(hc3);
        System.out.println(hc4);
    }
    @Override
    public String toString() {
        return "hairstyleColour{" +
                "gender='" + gender + '\'' +
                ", colour='" + colour + '\'' +
                ", hairstyleName='" + hairstyleName + '\'' +
                '}';
    }
}
