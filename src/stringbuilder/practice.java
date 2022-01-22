package stringbuilder;

public class practice {
    public static void main(String[] args) {
        StringBuilder builder =new StringBuilder();
        StringBuilder builder1=new StringBuilder("Techtorial");
        //StringBuilder builder2="java"; will not comile
        System.out.println(builder);
        builder.append("Winter");
        System.out.println(builder);
        builder.append(" is cold");
        System.out.println(builder);// winter is cold, append is like concat,
        String str ="";
        for(char ch='a';ch<'z';ch++){
            str+=ch;
            System.out.println(str);
        }
StringBuilder builder3=new StringBuilder();

        for(char ch='a';ch<'z';ch++){
            builder3.append(ch);
            System.out.println(builder3);
        }
        System.out.println("==========winter is cold=======================");
        builder.append(33);
        builder.append(false);
        System.out.println(builder);
        builder.append("  degree ").append(" negative ").append( '&' ).append(""+"");
        System.out.println(builder);

        StringBuilder success=new StringBuilder("working Hard");
        success.append("does not make u successful");
        StringBuilder truth=success.append("thinking hard makes you successful");
        System.out.println(success);
        System.out.println(truth);




    }
}
