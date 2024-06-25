class Worksheet2for2CTunahanIbiş {

    public static void main(String[] args) {

        // Part 1:
        int x = 18;
        int y = 20;

        System.out.println("PartI.I");
        // Print x if x is between [12,20]
        if (x >= 12 && x <= 20) {
            System.out.println(x);
        }

        System.out.println("PartI.II");
        // Print y if y is between (9,23)
        if (y > 9 && y < 23) {
            System.out.println(y);
        }

        System.out.println("PartI.III");
        // Print x and y if both of them are between [12, 21) and y is greater than x (y > x)
        if (x >= 12 && x < 21 && y >= 12 && y < 21 && y > x) {
            System.out.println(x);
            System.out.println(y);
        }

        System.out.println();

        //////////////////////////////

        // Part II:
        int season = 5;

        System.out.println("PartII");
        //   print the representative String value of the the season by using switch-case operation.
        switch (season) {
            
            case 3, 4, 5:
                System.out.println("Spring");
                break;

            case 6, 7, 8:
                System.out.println("Summer");
                break;

            case 9, 10, 11:
                System.out.println("Fall");
                break;

            case 12, 1, 2:
                System.out.println("Winter");
                break;

         
        }

        System.out.println();

        ///////////////////////////////

        // Part III:

        System.out.println("PartIII.I");
        // Print all the integers between [12,20]
        for (int i = 12; i <= 20 ; i++) {
            System.out.println(i);
        }

        System.out.println("PartIII.II");
        // Print all the integers between (9,23)
        for (int i = 10; i < 23; i++) {
            System.out.println(i);
        }

        System.out.println("PartIII.III");
        // Print all the integers for x,y ∈ [12, 21) and y is greater than x (y > x)
        y = 20;
        for (x = 12; x < 21; x++) {
            if (y > x) {
                System.out.println(x);
            }
        }

    }
}