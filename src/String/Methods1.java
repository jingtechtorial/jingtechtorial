package String;

public class Methods1 {
    public static void main(String[] args) {
        String device="microphone";
        device.concat(" is an input device");
        char ch=device.charAt(1);
     int lettercount=  device.length();//counting from1
        System.out.println(lettercount);
        device+="is expensive";
        System.out.println(device.length());
        device.concat("device");
        System.out.println(device.length());
        //take last char from this version of the string
        System.out.println();
        String example="techtorialbatch";
        char lastchar=example.charAt(example.length()-1);
        System.out.println(lastchar);
        String example2="thanksgiving is over. the price of the turkey will go down";
        int count=example2.length();
        char lastletter =example2.charAt(count-1);
        System.out.println(lastletter);
        //find the middle char from last string
        String school="Techorial";

        System.out.println(school.charAt(school.length()-1/2));
        System.out.println(school.charAt(15));





    }
}
