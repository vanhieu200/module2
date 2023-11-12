package ss5_Ac_Modifier;

public class ThucHanh {
   private int id;
   private String name;
   private static String school = "kokoko";

   ThucHanh(int a, String b){
      id= a;
      name = b;
   }

    static void change(){
        school = " n ooooo l";
   }

   void display(){
       System.out.println(id + " " + name + " " + school);
   }

    public static void main(String[] args) {
        ThucHanh.change();
        ThucHanh t1 = new ThucHanh(1,"hrhr");
        ThucHanh t2 = new ThucHanh(2,"kyky");
        ThucHanh t3 = new ThucHanh(3,"huhuhu");

        t1.display();
        t2.display();
        t3.display();
    }

}
