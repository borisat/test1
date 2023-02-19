import java.util.Arrays;

public class Main {


    public static void main(String[] args) {

        Box box0 = new Box(1);
        Box box1 = new Box(1);
        Box box2 = new Box(1);
        Box box3 = new Box(1);
        Box box4 = new Box(1);
        Box box5 = new Box(1);
        Box box6 = new Box(0);
        Box box7 = new Box(1);
        Box box8 = new Box(1);
        Box box9 = new Box(1);
        Box box10 = new Box(1);
        Box box11 = new Box(1);

        Box[] boxes = new Box[]{box0, box1, box2, box3, box4, box5, box6, box7, box8, box9, box10, box11};

        System.out.println(getNonNormalBox(boxes));
    }


    public static int getNonNormalBox(Box[] boxes) {

        Box[] boxesBox = boxes;
        Box[] boxArrayA = new Box[]{boxesBox[0], boxesBox[1], boxesBox[2], boxesBox[3]};
        Box[] boxArrayB = new Box[]{boxesBox[4], boxesBox[5], boxesBox[6], boxesBox[7]};


        if (comparing(boxArrayA, boxArrayB) == 0) {
            if (comparing(boxesBox[8], boxesBox[9]) == 0) {
                if (comparing(boxesBox[8], boxesBox[10]) == 0) {
                    return 11;
                }
                return 10;
            } else if (comparing(boxesBox[9], boxesBox[11]) == 0) {
                return 8;
            }
            return 9;
        } else if (comparing(boxArrayA, boxArrayB) > 0) {
            boxArrayA = new Box[]{boxesBox[0], boxesBox[8], boxesBox[9], boxesBox[10]};
            boxArrayB = new Box[]{boxesBox[4], boxesBox[1], boxesBox[2], boxesBox[3]};
            if (comparing(boxArrayA, boxArrayB) == 0) {
                if (comparing(boxesBox[5], boxesBox[6]) == 0) {
                    return 7;
                } else if (comparing(boxesBox[5], boxesBox[6]) > 0) {
                    return 6;
                }
                return 5;
            } else if (comparing(boxArrayA, boxArrayB) > 0) {
                if (comparing(boxesBox[0], boxesBox[8]) == 0) {
                    return 4;
                }
                return 0;
            } else if ((comparing(boxArrayA, boxArrayB) < 0)) {
                if (comparing(boxesBox[1], boxesBox[2]) == 0) {
                    return 3;
                } else if (comparing(boxesBox[1], boxesBox[2]) > 0) {
                    return 1;
                }
                return 2;
            }
        }


        else if (comparing(boxArrayA, boxArrayB) < 0) {
            boxArrayA = new Box[]{boxesBox[4], boxesBox[8], boxesBox[9], boxesBox[10]};
            boxArrayB = new Box[]{boxesBox[0], boxesBox[5], boxesBox[6], boxesBox[7]};
            if (comparing(boxArrayA, boxArrayB) == 0) {
                if (comparing(boxesBox[1], boxesBox[2]) == 0) {
                    return 3;
                } else if (comparing(boxesBox[1], boxesBox[2]) > 0) {
                    return 2;
                }
                return 1;
            } else if (comparing(boxArrayA, boxArrayB) > 0) {
                if (comparing(boxesBox[0], boxesBox[8]) == 0) {
                    return 4;
                }
                return 0;
            } else if ((comparing(boxArrayA, boxArrayB) < 0)) {
                if (comparing(boxesBox[5], boxesBox[6]) == 0) {
                    return 7;
                } else if (comparing(boxesBox[5], boxesBox[6]) > 0) {
                    return 5;
                }
                return 6;
            }
        }
        return 0;
    }


    public static int comparing(Box[] arrayA, Box[] arrayB) {

        int aWeight = 0;
        int bWeigth = 0;

        for (int i = 0; i < arrayA.length; i++) {

            aWeight += arrayA[i].weight;
        }

        for (int i = 0; i < arrayB.length; i++) {
            bWeigth += arrayB[i].weight;
        }

        return aWeight - bWeigth;
    }


    public static int comparing(Box boxA, Box boxB) {

        return boxA.weight - boxB.weight;
    }

}

class Box {

    int weight;


    public Box(int weight) {

        this.weight = weight;

    }

}
