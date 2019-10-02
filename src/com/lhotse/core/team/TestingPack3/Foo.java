package com.lhotse.core.team.TestingPack3;

class Feline {

       /* { index = 1; }
        int index;
        public static void main(String[] args) {
                if(args.length == 1 | args[1].equals("test")) {
                    System.out.println("test case");
                } else {
                    System.out.println("production " + args[0]);
                }

            new Feline().go();
        }
        void go() {
            int [][] dd = {{9,8,7}, {6,5,4}, {3,2,1,0}};
            System.out.println(dd[index++][index++]);
        }*/

    public static void main(String[] arg) {

        //assert(false);
        int mask = 0;
        int count = 0;
        if( ((5<7) || (++count < 10)) | mask++ < 10 )
            //System.out.println(mask);
            mask = mask + 1;
        if( (6 > 8) ^ false) mask = mask + 10;
        if( !(mask > 1) && ++count > 1)    // false so count will not update.
            //System.out.println(count);
            //mask = mask + 100;
        System.out.println(mask + " " + count);
        /*boolean b1= true;
        Boolean b2 = false;
        String s = " ";
        if((b2 = false) | (21%5) > 2) s += "x";
        if(b1 || (b2 = true)) s += "y";
        if(b2 == true) s += "z";
        System.out.println(s);*/
    }
}
