package mooc.vandy.java4android.diamonds.logic;

import mooc.vandy.java4android.diamonds.ui.OutputInterface;

/**
 * This is where the logic of this App is centralized for this assignment.
 * <p>
 * The assignments are designed this way to simplify your early
 * Android interactions.  Designing the assignments this way allows
 * you to first learn key 'Java' features without having to beforehand
 * learn the complexities of Android.
 */
public class Logic
       implements LogicInterface {
    /**
     * This is a String to be used in Logging (if/when you decide you
     * need it for debugging).
     */
    public static final String TAG = Logic.class.getName();

    /**
     * This is the variable that stores our OutputInterface instance.
     * <p>
     * This is how we will interact with the User Interface [MainActivity.java].
     * <p>
     * It is called 'out' because it is where we 'out-put' our
     * results. (It is also the 'in-put' from where we get values
     * from, but it only needs 1 name, and 'out' is good enough).
     */
    private OutputInterface mOut;

    /**
     * This is the constructor of this class.
     * <p>
     * It assigns the passed in [MainActivity] instance (which
     * implements [OutputInterface]) to 'out'.
     */
    public Logic(OutputInterface out){
        mOut = out;
    }

    /**
     * This is the method that will (eventually) get called when the
     * on-screen button labeled 'Process...' is pressed.
     */
    public void process(int size) {

        // TODO -- add your code here
        String str ="+";
        Pyramidcreateup pyrmup = new Pyramidcreateup();
        for(int i =0;i<size;i++){
            str = str + "--";
        }
        str = str + "+"; //this adds the final plus in the first line +----+
        mOut.println(str);

        if(size ==1){
            mOut.println("|<>|");


        }
        if(size > 1) { //this logic is implemented when size requirement is bigger than 1
            String str_pyram = "|";



                for(int i =1; i<=size; i++){
                    int spacecount =size -i;
                    String spaces = " "; //setting it to null initializes the variable
                    for(int z =1; z <spacecount; z++) {
                        spaces = spaces + " ";
                    }
                    if(i ==1){
                        mOut.println(str_pyram + spaces + "/" + "\\" + spaces + str_pyram);
                         }
                    else if(i> 1 && i< size){
                        mOut.println(str_pyram + spaces +"/"+ pyrmup.prymcreat(i)+"\\" + spaces +str_pyram);

                }
                    else if(i == size){
                        mOut.println(str_pyram  +"<" +pyrmup.prymcreat(i) +">" +str_pyram);


                    }


        }
            for(int h =size -1; h>= 1; h--) {
                int spacescount2 = size - h;
                String spaces2 = " ";
                for (int i = 1; i < spacescount2; i++) {
                    spaces2 = spaces2 + " ";

                }
                if (h > 1) {
                    mOut.println(str_pyram + spaces2 + "\\"+ pyrmup.pyrmcreatedown(h)+"/" + spaces2 + str_pyram);
                }
                else{
                    mOut.println(str_pyram + spaces2 + "\\" + "/" + spaces2 + str_pyram);
                }
            }





    }
        mOut.print(str);

}

}


