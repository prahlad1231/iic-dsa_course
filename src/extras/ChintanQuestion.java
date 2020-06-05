package extras;

import java.util.ArrayList;

public class ChintanQuestion {

    public static void pleaseConform(char[] cap) {
        ArrayList<Integer> startFront = new ArrayList<>();
        ArrayList<Integer> endFront = new ArrayList<>();
        ArrayList<Integer> startBack = new ArrayList<>();
        ArrayList<Integer> endBack = new ArrayList<>();

        if (cap[0] == 'f') startFront.add(0);
        else startBack.add(0);

        int last = cap.length-1;

        for (int i = 1; i < last; ++i) {
            if (cap[i] == 'f') {
                if (cap[i-1] == 'f') continue;
                else {
                    endBack.add(i-1);
                    startFront.add(i);
                }
            } else {
                if (cap[i-1] == 'b') continue;
                else {
                    endFront.add(i-1);
                    startBack.add(i);
                }
            }
        }

        if (cap[last] == 'f') {
            if (cap[last-1] == 'f') endFront.add(last);
            else {
                endBack.add(last-1);
                startFront.add(last);
                endFront.add(last);
            }
        } else {
            if (cap[last-1] == 'b') endBack.add(last);
            else {
                endFront.add(last-1);
                startBack.add(last);
                endBack.add(last);
            }
        }

        int frontSize = startFront.size();
        int backSize = startBack.size();
        if (frontSize < backSize) {
            for (int i = 0; i < frontSize; ++i) {
                if (startFront.get(i) != endFront.get(i)) {
                    System.out.println("People in positions " + startFront.get(i) + " through " + endFront.get(i) + " flip your caps!");
                } else {
                    System.out.println("Person at " + startFront.get(i) + " flip your cap!");
                }
            }
        } else {
            for (int i = 0; i < backSize; ++i) {
                if (startBack.get(i) != endBack.get(i)) {
                    System.out.println("People in positions " + startBack.get(i) + " through " + endBack.get(i) + " flip your caps!");
                } else {
                    System.out.println("Person at " + startBack.get(i) + " flip your cap!");
                }
            }
        }
    }

    public static void main(String[] args) {
        char[] cap1 = {'f', 'f', 'b', 'b', 'b', 'f', 'b', 'b', 'b', 'f', 'f', 'b', 'f'};
        char[] cap2 = {'b', 'f', 'b', 'b', 'b', 'b', 'f', 'f', 'f', 'b', 'f', 'b', 'b', 'b'};
        pleaseConform(cap1);
    }
}
