package String;

public class Methods6 {
    public static void main(String[] args) {
        String name=" Techtorial Academy is located at des plains   ";
        //trim()--->it will remove spaces before and after string
       String updatename= name.trim();
        System.out.println(name);
        System.out.println(updatename);

        //substring()
      String part1=  updatename.substring(4);
        System.out.println(part1);//torial ...............
      String part2=  updatename.substring(4,11);
        System.out.println(part2);//torial, take first index,the end of index is not including



    }
}
