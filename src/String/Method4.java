package String;

public class Method4 {
    public static void main(String[] args) {
        String text="Selenium";
        //contain();it will if the string has given value or not,return true/false
      boolean result1=  text.contains("le");
        System.out.println(result1);
        System.out.println(text.contains("t"));
        System.out.println(text.contains("selenium"));
        System.out.println(text.contains("1"));
        System.out.println(text.contains("ium"));
        //equal():it will check id the give string has exactly same order of char.will return true/false


        System.out.println(text.equals("Selenium"));
        System.out.println(text.equals("nium"));
        System.out.println(text.equals("selenium"));
        //equalsignoreCase();
        System.out.println(text.equalsIgnoreCase("SELEnium"));

        String text2="Java";
        System.out.println(text.equalsIgnoreCase(text2));
        String text3="SELENIUM";
       boolean result2= text3.equalsIgnoreCase(text);
        System.out.println(result2);


        text3.concat(text);
        text3.toLowerCase();

        text=text3;
        System.out.println(text3.equals(text));

    }
}
