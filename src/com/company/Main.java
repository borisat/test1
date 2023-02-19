public class Main {


    public static void main(String[] args) {

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
