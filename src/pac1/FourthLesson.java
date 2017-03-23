package pac1;

/**
 * Created by admin on 16.03.2017.
 */
    public class FourthLesson {
        public String concat(String str1, String str2){
            return str1.concat(str2);
        }

    public String replaceWorld (String oldStr) {
            return oldStr.replace("World", "NewWorld");
        }
        public String replaceWorld (String oldWorld){

        }

        public static void main (String [] args){
            FourthLesson fourthLesson = new FourthLesson();

            String oldWorld = fourthLesson.concat("Hello", "World");

            System.out.println(oldWorld);
            System.out.println(fourthLesson.replaceWorld(oldWorld));
        }

}
