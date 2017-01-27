

/**
 * Created by matthewmartin on 1/27/17.
 */

class TriangleWork{


    String triangle = "";


    public String triangleBuilder() {
        for (int i = 5; i > 0; i--) {
            for (int j = i; j > 0; j--) {
                triangle += "*";
            }
            triangle += "\n";
        }

        return triangle;
    }
}


